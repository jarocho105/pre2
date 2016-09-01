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

//import com.bydan.erp.nomina.util.ProcesoIessFondoReservaConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoIessFondoReservaBean;
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
public class ProcesoIessFondoReservaBeanSwingJInternalFrame extends ProcesoIessFondoReservaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoIessFondoReservaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoIessFondoReserva> procesoiessfondoreservaValidator = new ClassValidator<ProcesoIessFondoReserva>(ProcesoIessFondoReserva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoIessFondoReserva procesoiessfondoreserva;	
	public ProcesoIessFondoReserva procesoiessfondoreservaAux;
	public ProcesoIessFondoReserva procesoiessfondoreservaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoIessFondoReserva procesoiessfondoreservaTotales;
	public Long idProcesoIessFondoReservaActual;
	public Long iIdNuevoProcesoIessFondoReserva=0L;
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
	
	public Boolean isPermisoTodoProcesoIessFondoReserva;
	public Boolean isPermisoNuevoProcesoIessFondoReserva;
	public Boolean isPermisoActualizarProcesoIessFondoReserva;
	public Boolean isPermisoActualizarOriginalProcesoIessFondoReserva;
	public Boolean isPermisoEliminarProcesoIessFondoReserva;
	public Boolean isPermisoGuardarCambiosProcesoIessFondoReserva;
	public Boolean isPermisoConsultaProcesoIessFondoReserva;
	public Boolean isPermisoBusquedaProcesoIessFondoReserva;
	public Boolean isPermisoReporteProcesoIessFondoReserva;
	public Boolean isPermisoPaginacionMedioProcesoIessFondoReserva;
	public Boolean isPermisoPaginacionAltoProcesoIessFondoReserva;
	public Boolean isPermisoPaginacionTodoProcesoIessFondoReserva;
	public Boolean isPermisoCopiarProcesoIessFondoReserva;
	public Boolean isPermisoVerFormProcesoIessFondoReserva;
	public Boolean isPermisoDuplicarProcesoIessFondoReserva;
	public Boolean isPermisoOrdenProcesoIessFondoReserva;
	
	
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
	
	public ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaReturnGeneral;
	public ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoIessFondoReserva=false;
	public Boolean esParaAccionDesdeFormularioProcesoIessFondoReserva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoIessFondoReservaSessionBeanAdditional procesoiessfondoreservaSessionBeanAdditional=null;
	
	public ProcesoIessFondoReservaSessionBeanAdditional getProcesoIessFondoReservaSessionBeanAdditional() {
		return this.procesoiessfondoreservaSessionBeanAdditional;
	}
	
	public void setProcesoIessFondoReservaSessionBeanAdditional(ProcesoIessFondoReservaSessionBeanAdditional procesoiessfondoreservaSessionBeanAdditional) {
		try {
			this.procesoiessfondoreservaSessionBeanAdditional=procesoiessfondoreservaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional procesoiessfondoreservaBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoIessFondoReservaBeanSwingJInternalFrame
	
	public ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional getProcesoIessFondoReservaBeanSwingJInternalFrameAdditional() {
		return this.procesoiessfondoreservaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoIessFondoReservaBeanSwingJInternalFrameAdditional(ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional procesoiessfondoreservaBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoiessfondoreservaBeanSwingJInternalFrameAdditional=procesoiessfondoreservaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoIessFondoReservaLogic procesoiessfondoreservaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoIessFondoReserva procesoiessfondoreservaBean;
	public ProcesoIessFondoReservaConstantesFunciones procesoiessfondoreservaConstantesFunciones;
	//public ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public NumeroPatronalLogic numeropatronalLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoIessFondoReserva> procesoiessfondoreservas;	
	//public List<ProcesoIessFondoReserva> procesoiessfondoreservasEliminados;
	//public List<ProcesoIessFondoReserva> procesoiessfondoreservasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoIessFondoReserva=true;
	public Boolean isVisibilidadCeldaCopiarProcesoIessFondoReserva=true;
	public Boolean isVisibilidadCeldaVerFormProcesoIessFondoReserva=true;
	public Boolean isVisibilidadCeldaOrdenProcesoIessFondoReserva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaCancelarProcesoIessFondoReserva=false;
	public Boolean isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoIessFondoReserva=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdNumeroPatronal=false;
	
	public Long getiIdNuevoProcesoIessFondoReserva() {
		return this.iIdNuevoProcesoIessFondoReserva;
	}

	public void setiIdNuevoProcesoIessFondoReserva(Long iIdNuevoProcesoIessFondoReserva) {
		this.iIdNuevoProcesoIessFondoReserva = iIdNuevoProcesoIessFondoReserva;
	}
	
	public Long getidProcesoIessFondoReservaActual() {
		return this.idProcesoIessFondoReservaActual;
	}

	public void setidProcesoIessFondoReservaActual(Long idProcesoIessFondoReservaActual) {
		this.idProcesoIessFondoReservaActual = idProcesoIessFondoReservaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoIessFondoReserva getprocesoiessfondoreserva() {
		return this.procesoiessfondoreserva;
	}

	public void setprocesoiessfondoreserva(ProcesoIessFondoReserva procesoiessfondoreserva) {
		this.procesoiessfondoreserva = procesoiessfondoreserva;
	}
	
	public ProcesoIessFondoReserva getprocesoiessfondoreservaAux() {
		return this.procesoiessfondoreservaAux;
	}

	public void setprocesoiessfondoreservaAux(ProcesoIessFondoReserva procesoiessfondoreservaAux) {
		this.procesoiessfondoreservaAux = procesoiessfondoreservaAux;
	}				
	
	public ProcesoIessFondoReserva getprocesoiessfondoreservaAnterior() {
		return this.procesoiessfondoreservaAnterior;
	}

	public void setprocesoiessfondoreservaAnterior(ProcesoIessFondoReserva procesoiessfondoreservaAnterior) {
		this.procesoiessfondoreservaAnterior = procesoiessfondoreservaAnterior;
	}	
	
	public ProcesoIessFondoReserva getprocesoiessfondoreservaTotales() {
		return this.procesoiessfondoreservaTotales;
	}

	public void setprocesoiessfondoreservaTotales(ProcesoIessFondoReserva procesoiessfondoreservaTotales) {
		this.procesoiessfondoreservaTotales = procesoiessfondoreservaTotales;
	}	
	
	public ProcesoIessFondoReserva getprocesoiessfondoreservaBean() {
		return this.procesoiessfondoreservaBean;
	}

	public void setprocesoiessfondoreservaBean(ProcesoIessFondoReserva procesoiessfondoreservaBean) {
		this.procesoiessfondoreservaBean = procesoiessfondoreservaBean;
	}	
	
	public ProcesoIessFondoReservaParameterReturnGeneral getprocesoiessfondoreservaReturnGeneral() {
		return this.procesoiessfondoreservaReturnGeneral;
	}

	public void setprocesoiessfondoreservaReturnGeneral(ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaReturnGeneral) {
		this.procesoiessfondoreservaReturnGeneral = procesoiessfondoreservaReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoIessFondoReserva=null;

	public Long getid_anioBusquedaProcesoIessFondoReserva() {
		return this.id_anioBusquedaProcesoIessFondoReserva;
	}

	public void setid_anioBusquedaProcesoIessFondoReserva(Long id_anioBusquedaProcesoIessFondoReserva) {
		this.id_anioBusquedaProcesoIessFondoReserva = id_anioBusquedaProcesoIessFondoReserva;
	}

;
	public Long id_numero_patronalBusquedaProcesoIessFondoReserva=-1L;

	public Long getid_numero_patronalBusquedaProcesoIessFondoReserva() {
		return this.id_numero_patronalBusquedaProcesoIessFondoReserva;
	}

	public void setid_numero_patronalBusquedaProcesoIessFondoReserva(Long id_numero_patronalBusquedaProcesoIessFondoReserva) {
		this.id_numero_patronalBusquedaProcesoIessFondoReserva = id_numero_patronalBusquedaProcesoIessFondoReserva;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_numero_patronalFK_IdNumeroPatronal=-1L;

	public Long getid_numero_patronalFK_IdNumeroPatronal() {
		return this.id_numero_patronalFK_IdNumeroPatronal;
	}

	public void setid_numero_patronalFK_IdNumeroPatronal(Long id_numero_patronalFK_IdNumeroPatronal) {
		this.id_numero_patronalFK_IdNumeroPatronal = id_numero_patronalFK_IdNumeroPatronal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoIessFondoReservaLogic getProcesoIessFondoReservaLogic()	{		
		return procesoiessfondoreservaLogic;
	}

	public void setProcesoIessFondoReservaLogic(ProcesoIessFondoReservaLogic procesoiessfondoreservaLogic) {
		this.procesoiessfondoreservaLogic = procesoiessfondoreservaLogic;
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
	
	public Boolean getIsEsNuevoProcesoIessFondoReserva() {
		return isEsNuevoProcesoIessFondoReserva;
	}

	public void setIsEsNuevoProcesoIessFondoReserva(Boolean isEsNuevoProcesoIessFondoReserva) {
		this.isEsNuevoProcesoIessFondoReserva = isEsNuevoProcesoIessFondoReserva;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoIessFondoReserva() {
		return esParaAccionDesdeFormularioProcesoIessFondoReserva;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoIessFondoReserva(Boolean esParaAccionDesdeFormularioProcesoIessFondoReserva) {
		this.esParaAccionDesdeFormularioProcesoIessFondoReserva = esParaAccionDesdeFormularioProcesoIessFondoReserva;
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

			if(this.procesoiessfondoreservaSessionBean==null) {
				this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
			}

			if(!this.procesoiessfondoreservaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(procesoiessfondoreservaSessionBean.getlidAnioActual());
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

			if(this.procesoiessfondoreservaSessionBean==null) {
				this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
			}

			if(!this.procesoiessfondoreservaSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
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
					numeropatronalLogic.getEntityWithConnection(procesoiessfondoreservaSessionBean.getlidNumeroPatronalActual());
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

					if(this.procesoiessfondoreserva!=null) {
						this.procesoiessfondoreserva.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoIessFondoReserva.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReserva") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva!=null) {
						jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva!=null) {
							//jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoIessFondoReservaGenerico)throws Exception
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
				jComboBoxid_anioProcesoIessFondoReservaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoIessFondoReservaGenerico!=null && jComboBoxid_anioProcesoIessFondoReservaGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoIessFondoReservaGenerico.setSelectedIndex(0);
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

					if(this.procesoiessfondoreserva!=null) {
						this.procesoiessfondoreserva.setNumeroPatronal(numeropatronalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
						this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedItem(numeropatronalTemp);
					}
				} else {
					//jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedItem(numeropatronalTemp);
					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReserva") || sFormularioTipoBusqueda.equals("Todos")){
					if(numeropatronalTemp!=null && jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva!=null) {
						jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(numeropatronalTemp);
					} else {
						if(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva!=null) {
							//jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(numeropatronalTemp);
							if(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getItemCount()>0) {
								jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedIndex(0);
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
	public void setActualNumeroPatronalForeignKeyGenerico(Long idNumeroPatronalSeleccionado,JComboBox jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico)throws Exception
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
				jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico.setSelectedItem(numeropatronalTemp);
			} else {
				if(jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico!=null && jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico.getItemCount()>0) {
					jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoIessFondoReserva procesoiessfondoreserva,JComboBox jComboBoxid_anioProcesoIessFondoReservaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoIessFondoReservaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoIessFondoReservaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesoiessfondoreserva.setid_anio(anioAux.getId());
				procesoiessfondoreserva.setanio_descripcion(ProcesoIessFondoReservaConstantesFunciones.getAnioDescripcion(anioAux));
				procesoiessfondoreserva.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNumeroPatronalForeignKey(ProcesoIessFondoReserva procesoiessfondoreserva,JComboBox jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalAux=new NumeroPatronal();

			if(jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico==null) {
				numeropatronalAux=(NumeroPatronal)this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.getSelectedItem();
			} else {
				numeropatronalAux=(NumeroPatronal)jComboBoxid_numero_patronalProcesoIessFondoReservaGenerico.getSelectedItem();
			}

			if(numeropatronalAux!=null && numeropatronalAux.getId()!=null) {
				procesoiessfondoreserva.setid_numero_patronal(numeropatronalAux.getId());
				procesoiessfondoreserva.setnumeropatronal_descripcion(ProcesoIessFondoReservaConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalAux));
				procesoiessfondoreserva.setNumeroPatronal(numeropatronalAux);			}
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

					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { 
					}

					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReserva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.addItem(anio);
							}
						}

						if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { 
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.addItem(numeropatronal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { 
					}

					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessFondoReserva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.addItem(numeropatronal);
							}
						}

						if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedItem(numeropatronal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedItem(numeropatronal);
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoIessFondoReserva() throws Exception {
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
		
	public ProcesoIessFondoReservaParameterReturnGeneral getProcesoIessFondoReservaParameterGeneral() {
		return this.procesoiessfondoreservaParameterGeneral;
	}
	
	public void setProcesoIessFondoReservaParameterGeneral(ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaParameterGeneral) {
		this.procesoiessfondoreservaParameterGeneral = procesoiessfondoreservaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoIessFondoReserva() {
		return isPermisoTodoProcesoIessFondoReserva;
	}

	public void setIsPermisoTodoProcesoIessFondoReserva(Boolean isPermisoTodoProcesoIessFondoReserva) {
		this.isPermisoTodoProcesoIessFondoReserva = isPermisoTodoProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoNuevoProcesoIessFondoReserva() {
		return isPermisoNuevoProcesoIessFondoReserva;
	}

	public void setIsPermisoNuevoProcesoIessFondoReserva(Boolean isPermisoNuevoProcesoIessFondoReserva) {
		this.isPermisoNuevoProcesoIessFondoReserva = isPermisoNuevoProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoActualizarProcesoIessFondoReserva() {
		return isPermisoActualizarProcesoIessFondoReserva;
	}

	public void setIsPermisoActualizarProcesoIessFondoReserva(Boolean isPermisoActualizarProcesoIessFondoReserva) {
		this.isPermisoActualizarProcesoIessFondoReserva = isPermisoActualizarProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoEliminarProcesoIessFondoReserva() {
		return isPermisoEliminarProcesoIessFondoReserva;
	}

	public void setIsPermisoEliminarProcesoIessFondoReserva(Boolean isPermisoEliminarProcesoIessFondoReserva) {
		this.isPermisoEliminarProcesoIessFondoReserva = isPermisoEliminarProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoIessFondoReserva() {
		return isPermisoGuardarCambiosProcesoIessFondoReserva;
	}

	public void setIsPermisoGuardarCambiosProcesoIessFondoReserva(Boolean isPermisoGuardarCambiosProcesoIessFondoReserva) {
		this.isPermisoGuardarCambiosProcesoIessFondoReserva = isPermisoGuardarCambiosProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoConsultaProcesoIessFondoReserva() {
		return isPermisoConsultaProcesoIessFondoReserva;
	}

	public void setIsPermisoConsultaProcesoIessFondoReserva(Boolean isPermisoConsultaProcesoIessFondoReserva) {
		this.isPermisoConsultaProcesoIessFondoReserva = isPermisoConsultaProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoBusquedaProcesoIessFondoReserva() {
		return isPermisoBusquedaProcesoIessFondoReserva;
	}

	public void setIsPermisoBusquedaProcesoIessFondoReserva(Boolean isPermisoBusquedaProcesoIessFondoReserva) {
		this.isPermisoBusquedaProcesoIessFondoReserva = isPermisoBusquedaProcesoIessFondoReserva;
	}

	public Boolean getIsPermisoReporteProcesoIessFondoReserva() {
		return isPermisoReporteProcesoIessFondoReserva;
	}

	public void setIsPermisoReporteProcesoIessFondoReserva(Boolean isPermisoReporteProcesoIessFondoReserva) {
		this.isPermisoReporteProcesoIessFondoReserva = isPermisoReporteProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoIessFondoReserva() {
		return isPermisoPaginacionMedioProcesoIessFondoReserva;
	}

	public void setIsPermisoPaginacionMedioProcesoIessFondoReserva(Boolean isPermisoPaginacionMedioProcesoIessFondoReserva) {
		this.isPermisoPaginacionMedioProcesoIessFondoReserva = isPermisoPaginacionMedioProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoIessFondoReserva() {
		return isPermisoPaginacionTodoProcesoIessFondoReserva;
	}

	public void setIsPermisoPaginacionTodoProcesoIessFondoReserva(Boolean isPermisoPaginacionTodoProcesoIessFondoReserva) {
		this.isPermisoPaginacionTodoProcesoIessFondoReserva = isPermisoPaginacionTodoProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoIessFondoReserva() {
		return isPermisoPaginacionAltoProcesoIessFondoReserva;
	}

	public void setIsPermisoPaginacionAltoProcesoIessFondoReserva(Boolean isPermisoPaginacionAltoProcesoIessFondoReserva) {
		this.isPermisoPaginacionAltoProcesoIessFondoReserva = isPermisoPaginacionAltoProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoCopiarProcesoIessFondoReserva() {
		return isPermisoCopiarProcesoIessFondoReserva;
	}

	public void setIsPermisoCopiarProcesoIessFondoReserva(Boolean isPermisoCopiarProcesoIessFondoReserva) {
		this.isPermisoCopiarProcesoIessFondoReserva = isPermisoCopiarProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoVerFormProcesoIessFondoReserva() {
		return isPermisoVerFormProcesoIessFondoReserva;
	}

	public void setIsPermisoVerFormProcesoIessFondoReserva(Boolean isPermisoVerFormProcesoIessFondoReserva) {
		this.isPermisoVerFormProcesoIessFondoReserva = isPermisoVerFormProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoDuplicarProcesoIessFondoReserva() {
		return isPermisoDuplicarProcesoIessFondoReserva;
	}

	public void setIsPermisoDuplicarProcesoIessFondoReserva(Boolean isPermisoDuplicarProcesoIessFondoReserva) {
		this.isPermisoDuplicarProcesoIessFondoReserva = isPermisoDuplicarProcesoIessFondoReserva;
	}
	
	public Boolean getIsPermisoOrdenProcesoIessFondoReserva() {
		return isPermisoOrdenProcesoIessFondoReserva;
	}

	public void setIsPermisoOrdenProcesoIessFondoReserva(Boolean isPermisoOrdenProcesoIessFondoReserva) {
		this.isPermisoOrdenProcesoIessFondoReserva = isPermisoOrdenProcesoIessFondoReserva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoIessFondoReserva() {
		return isVisibilidadCeldaNuevoProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaNuevoProcesoIessFondoReserva(Boolean isVisibilidadCeldaNuevoProcesoIessFondoReserva) {
		this.isVisibilidadCeldaNuevoProcesoIessFondoReserva = isVisibilidadCeldaNuevoProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoIessFondoReserva() {
		return isVisibilidadCeldaDuplicarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoIessFondoReserva(Boolean isVisibilidadCeldaDuplicarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva = isVisibilidadCeldaDuplicarProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoIessFondoReserva() {
		return isVisibilidadCeldaCopiarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaCopiarProcesoIessFondoReserva(Boolean isVisibilidadCeldaCopiarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaCopiarProcesoIessFondoReserva = isVisibilidadCeldaCopiarProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoIessFondoReserva() {
		return isVisibilidadCeldaVerFormProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaVerFormProcesoIessFondoReserva(Boolean isVisibilidadCeldaVerFormProcesoIessFondoReserva) {
		this.isVisibilidadCeldaVerFormProcesoIessFondoReserva = isVisibilidadCeldaVerFormProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoIessFondoReserva() {
		return isVisibilidadCeldaOrdenProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaOrdenProcesoIessFondoReserva(Boolean isVisibilidadCeldaOrdenProcesoIessFondoReserva) {
		this.isVisibilidadCeldaOrdenProcesoIessFondoReserva = isVisibilidadCeldaOrdenProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva() {
		return isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva(Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva = isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoIessFondoReserva() {
		return isVisibilidadCeldaModificarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaModificarProcesoIessFondoReserva(Boolean isVisibilidadCeldaModificarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaModificarProcesoIessFondoReserva = isVisibilidadCeldaModificarProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoIessFondoReserva() {
		return isVisibilidadCeldaActualizarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaActualizarProcesoIessFondoReserva(Boolean isVisibilidadCeldaActualizarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaActualizarProcesoIessFondoReserva = isVisibilidadCeldaActualizarProcesoIessFondoReserva;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoIessFondoReserva() {
		return isVisibilidadCeldaEliminarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaEliminarProcesoIessFondoReserva(Boolean isVisibilidadCeldaEliminarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaEliminarProcesoIessFondoReserva = isVisibilidadCeldaEliminarProcesoIessFondoReserva;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoIessFondoReserva() {
		return isVisibilidadCeldaCancelarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaCancelarProcesoIessFondoReserva(Boolean isVisibilidadCeldaCancelarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaCancelarProcesoIessFondoReserva = isVisibilidadCeldaCancelarProcesoIessFondoReserva;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoIessFondoReserva() {
		return isVisibilidadCeldaGuardarProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaGuardarProcesoIessFondoReserva(Boolean isVisibilidadCeldaGuardarProcesoIessFondoReserva) {
		this.isVisibilidadCeldaGuardarProcesoIessFondoReserva = isVisibilidadCeldaGuardarProcesoIessFondoReserva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva() {
		return isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva(Boolean isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva) {
		this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva = isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva;
	}
		
	public ProcesoIessFondoReservaSessionBean getprocesoiessfondoreservaSessionBean() {
		return this.procesoiessfondoreservaSessionBean;
	}
	
	public void setprocesoiessfondoreservaSessionBean(ProcesoIessFondoReservaSessionBean procesoiessfondoreservaSessionBean) {
		this.procesoiessfondoreservaSessionBean=procesoiessfondoreservaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoIessFondoReserva() {
		return this.isVisibilidadBusquedaProcesoIessFondoReserva;
	}

	public void setisVisibilidadBusquedaProcesoIessFondoReserva(Boolean isVisibilidadBusquedaProcesoIessFondoReserva) {
		this.isVisibilidadBusquedaProcesoIessFondoReserva=isVisibilidadBusquedaProcesoIessFondoReserva;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdNumeroPatronal() {
		return this.isVisibilidadFK_IdNumeroPatronal;
	}

	public void setisVisibilidadFK_IdNumeroPatronal(Boolean isVisibilidadFK_IdNumeroPatronal) {
		this.isVisibilidadFK_IdNumeroPatronal=isVisibilidadFK_IdNumeroPatronal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesoiessfondoreserva,null);
				this.setActualParaGuardarNumeroPatronalForeignKey(procesoiessfondoreserva,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoIessFondoReserva procesoiessfondoreserva,ProcesoIessFondoReserva procesoiessfondoreservaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoIessFondoReserva(procesoiessfondoreserva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoiessfondoreservaAux.setId(procesoiessfondoreserva.getId());
		procesoiessfondoreservaAux.setVersionRow(procesoiessfondoreserva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoIessFondoReserva procesoiessfondoreservaLocal) throws Exception {
		
		if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoIessFondoReserva procesoiessfondoreservaLocal) throws Exception {	
		if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesoiessfondoreservaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NumeroPatronalDetalleFormJInternalFrame.class)) {
				NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrameLocal=(NumeroPatronalBeanSwingJInternalFrame) ((NumeroPatronalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				numeropatronalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.getnumeropatronal(),true);
				numeropatronalBeanSwingJInternalFrameLocal.actualizarLista(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal,this.numeropatronalsForeignKey);

				numeropatronalBeanSwingJInternalFrameLocal.actualizarRelaciones(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				procesoiessfondoreservaLocal.setNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey("Formulario");
				this.setActualNumeroPatronalForeignKey(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoIessFondoReservaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoiessfondoreservaValidator.getInvalidValues(this.procesoiessfondoreserva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoIessFondoReserva procesoiessfondoreserva,List<ProcesoIessFondoReserva> procesoiessfondoreservas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoIessFondoReserva procesoiessfondoreserva,List<ProcesoIessFondoReserva> procesoiessfondoreservas) throws Exception {
		try	{			
			ProcesoIessFondoReservaConstantesFunciones.actualizarSelectedLista(procesoiessfondoreserva,procesoiessfondoreservas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoIessFondoReserva> procesoiessfondoreservasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoiessfondoreservasLocal=this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoiessfondoreservasLocal=this.procesoiessfondoreservas;
			}
			//ARCHITECTURE
		
			for(ProcesoIessFondoReserva procesoiessfondoreservaLocal:procesoiessfondoreservasLocal) {
				if(this.permiteMantenimiento(procesoiessfondoreservaLocal) && procesoiessfondoreservaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoIessFondoReservaConstantesFunciones.getProcesoIessFondoReservaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelid_anioProcesoIessFondoReserva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessFondoReservaConstantesFunciones.IDNUMEROPATRONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelid_numero_patronalProcesoIessFondoReserva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelid_anioProcesoIessFondoReserva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelid_numero_patronalProcesoIessFondoReserva,"");
		
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
		this.iIdNuevoProcesoIessFondoReserva--;	
		
		
		this.procesoiessfondoreservaAux=new ProcesoIessFondoReserva();
		
		this.procesoiessfondoreservaAux.setId(this.iIdNuevoProcesoIessFondoReserva);
		this.procesoiessfondoreservaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().add(this.procesoiessfondoreservaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoiessfondoreservas.add(this.procesoiessfondoreservaAux);
		}
		//ARCHITECTURE
		
		this.procesoiessfondoreserva=this.procesoiessfondoreservaAux;
		
		if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreserva);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReserva(this.procesoiessfondoreserva);
		}
				
		//this.setDefaultControlesProcesoIessFondoReserva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoIessFondoReserva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReserva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReserva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreservaBean,this.procesoiessfondoreserva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral,this.procesoiessfondoreservaBean,false);
		
		if(this.procesoiessfondoreservaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva());
		}
		
		if(this.procesoiessfondoreservaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva(),classes);//this.procesoiessfondoreservaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoIessFondoReserva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoIessFondoReserva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.RecargarFormProcesoIessFondoReserva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
						
			if(procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReserva();
			}
			
			this.actualizarVisualTableDatosProcesoIessFondoReserva();
			
			this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReserva(), this.getIndiceNuevoProcesoIessFondoReserva());
			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
						
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoIessFondoReserva(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setEnabled(isHabilitar && this.procesoiessfondoreservaConstantesFunciones.activarid_anioProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setEnabled(isHabilitar && this.procesoiessfondoreservaConstantesFunciones.activarid_numero_patronalProcesoIessFondoReserva);
	};
	
	public void setDefaultControlesProcesoIessFondoReserva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReserva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(true);			
			this.procesoiessfondoreservaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.setVisible(true);
			
					
		} else {
			//this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(false);			
			this.procesoiessfondoreservaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoIessFondoReserva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				if(procesoiessfondoreservaAux.getId().equals(this.iIdNuevoProcesoIessFondoReserva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservas) {
				if(procesoiessfondoreservaAux.getId().equals(this.iIdNuevoProcesoIessFondoReserva)) {
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
	
	public int getIndiceActualProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				if(procesoiessfondoreservaAux.getId().equals(procesoiessfondoreserva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservas) {
				if(procesoiessfondoreservaAux.getId().equals(procesoiessfondoreserva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreservaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				if(procesoiessfondoreservaAux.getProcesoIessFondoReservaOriginal().getId().equals(procesoiessfondoreservaOriginal.getId())) {
					existe=true;
					procesoiessfondoreservaOriginal.setId(procesoiessfondoreservaAux.getId());
					procesoiessfondoreservaOriginal.setVersionRow(procesoiessfondoreservaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservas) {
				if(procesoiessfondoreservaAux.getProcesoIessFondoReservaOriginal().getId().equals(procesoiessfondoreservaOriginal.getId())) {
					existe=true;
					procesoiessfondoreservaOriginal.setId(procesoiessfondoreservaAux.getId());
					procesoiessfondoreservaOriginal.setVersionRow(procesoiessfondoreservaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoIessFondoReserva(Boolean esParaCancelar) throws Exception {
		procesoiessfondoreservasAux=new ArrayList<ProcesoIessFondoReserva>();
		procesoiessfondoreservaAux=new ProcesoIessFondoReserva();
		
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
					if(procesoiessfondoreservaAux.getId()<0) {
						procesoiessfondoreservasAux.add(procesoiessfondoreservaAux);
					}		
				}
				this.iIdNuevoProcesoIessFondoReserva=0L;
				this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().removeAll(procesoiessfondoreservasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservas) {
					if(procesoiessfondoreservaAux.getId()<0) {
						procesoiessfondoreservasAux.add(procesoiessfondoreservaAux);
					}		
				}
				this.iIdNuevoProcesoIessFondoReserva=0L;
				this.procesoiessfondoreservas.removeAll(procesoiessfondoreservasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoIessFondoReserva 
					&& this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size()>0
					) {
					procesoiessfondoreservaAux=this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().get(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size() - 1);
				
					if(procesoiessfondoreservaAux.getId()<0) {
						this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().remove(procesoiessfondoreservaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoIessFondoReserva && this.procesoiessfondoreservas.size()>0) {
					procesoiessfondoreservaAux=this.procesoiessfondoreservas.get(this.procesoiessfondoreservas.size() - 1);
				
					if(procesoiessfondoreservaAux.getId()<0) {
						this.procesoiessfondoreservas.remove(procesoiessfondoreservaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoIessFondoReserva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoiessfondoreserva.getId()<0) {
				this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().remove(this.procesoiessfondoreserva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoiessfondoreserva.getId()<0) {
				this.procesoiessfondoreservas.remove(this.procesoiessfondoreserva);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoIessFondoReserva(List<ProcesoIessFondoReserva> procesoiessfondoreservasAux) throws Exception {
		ProcesoIessFondoReservaConstantesFunciones.setEstadosInicialesProcesoIessFondoReserva(procesoiessfondoreservasAux);
	}
	
	public void setEstadosInicialesProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreservaAux) throws Exception {
		ProcesoIessFondoReservaConstantesFunciones.setEstadosInicialesProcesoIessFondoReserva(procesoiessfondoreservaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoIessFondoReservaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoIessFondoReservaActual()) {
				if(!this.isEsNuevoProcesoIessFondoReserva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoIessFondoReserva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoIessFondoReservaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Iess Fondo Reserva ?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoIessFondoReserva procesoiessfondoreserva) throws Exception {
		ProcesoIessFondoReservaConstantesFunciones.seleccionarAsignar(this.procesoiessfondoreserva,procesoiessfondoreserva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoIessFondoReserva=this.isPermisoActualizarOriginalProcesoIessFondoReserva;
			
			
			this.seleccionarAsignar(procesoiessfondoreserva);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoiessfondoreservaSessionBean.setsFuncionBusquedaRapida(this.procesoiessfondoreservaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoIessFondoReserva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoIessFondoReserva(esParaCancelar);				
				this.cancelarNuevoProcesoIessFondoReserva(esParaCancelar);								
			}
			
			this.procesoiessfondoreserva=new ProcesoIessFondoReserva();
			
			this.inicializarProcesoIessFondoReserva();
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoIessFondoReserva() throws Exception {
		try {
			ProcesoIessFondoReservaConstantesFunciones.inicializarProcesoIessFondoReserva(this.procesoiessfondoreserva);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoIessFondoReservas(String sAccionBusqueda,List<ProcesoIessFondoReserva> procesoiessfondoreservasParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoIessFondoReserva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoIessFondoReservaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoIessFondoReservaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoIessFondoReserva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Iess Fondo Reservas");		
		parameters.put("busquedapor", ProcesoIessFondoReservaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoIessFondoReserva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoIessFondoReserva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoIessFondoReservaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoIessFondoReservaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoIessFondoReservaBean.TraerProcesoIessFondoReservaBeans(procesoiessfondoreservasParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaActionPerformed(null);
					//this.generarExcelReporteProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoIessFondoReservas(sAccionBusqueda,sTipoArchivoReporte,procesoiessfondoreservasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoIessFondoReservas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReserva> procesoiessfondoreservasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessFondoReserva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoIessFondoReserva procesoiessfondoreserva : procesoiessfondoreservasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoIessFondoReservaConstantesFunciones.generarExcelReporteDataProcesoIessFondoReserva("NORMAL",row,workbook,procesoiessfondoreserva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoIessFondoReserva(String sTipo,Row row,Workbook workbook) {
		
		ProcesoIessFondoReservaConstantesFunciones.generarExcelReporteHeaderProcesoIessFondoReserva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoIessFondoReservas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReserva> procesoiessfondoreservasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoIessFondoReserva procesoiessfondoreserva : procesoiessfondoreservasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.getProcesoIessFondoReservaDescripcion(procesoiessfondoreserva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreserva.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessfondoreserva.getnumeropatronal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoIessFondoReservas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessFondoReserva> procesoiessfondoreservasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoIessFondoReserva> procesoiessfondoreservasRespaldo=null;
		
		classes=ProcesoIessFondoReservaConstantesFunciones.getClassesRelationshipsOfProcesoIessFondoReserva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoiessfondoreservaLogic.setDatosCliente(this.datosCliente);
		this.procesoiessfondoreservaLogic.setDatosDeep(this.datosDeep);
		this.procesoiessfondoreservaLogic.setIsConDeep(true);
		
		procesoiessfondoreservasRespaldo=this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas();
		
		this.procesoiessfondoreservaLogic.setProcesoIessFondoReservas(procesoiessfondoreservasParaReportes);	
		this.procesoiessfondoreservaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoiessfondoreservasParaReportes=this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas();
		this.procesoiessfondoreservaLogic.setProcesoIessFondoReservas(procesoiessfondoreservasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessFondoReservas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessFondoReserva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoIessFondoReserva procesoiessfondoreserva : procesoiessfondoreservasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoIessFondoReserva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoIessFondoReservaConstantesFunciones.generarExcelReporteDataProcesoIessFondoReserva("NORMAL",row,workbook,procesoiessfondoreserva,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.getProcesoIessFondoReservaDescripcion(procesoiessfondoreserva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoIessFondoReserva() throws Exception {		
		this.startProcessProcesoIessFondoReserva(true);
	}
	
	public void startProcessProcesoIessFondoReserva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoIessFondoReserva ,this.jPanelParametrosReportesProcesoIessFondoReserva, this.jScrollPanelDatosProcesoIessFondoReserva,this.jPanelPaginacionProcesoIessFondoReserva, this.jScrollPanelDatosEdicionProcesoIessFondoReserva, this.jPanelAccionesProcesoIessFondoReserva,this.jPanelAccionesFormularioProcesoIessFondoReserva,this.jmenuBarProcesoIessFondoReserva,this.jmenuBarDetalleProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReserva=this.jTabbedPaneBusquedasProcesoIessFondoReserva; 
		
		final JPanel jPanelParametrosReportesProcesoIessFondoReserva=this.jPanelParametrosReportesProcesoIessFondoReserva;
		//final JScrollPane jScrollPanelDatosProcesoIessFondoReserva=this.jScrollPanelDatosProcesoIessFondoReserva;
		final JTable jTableDatosProcesoIessFondoReserva=this.jTableDatosProcesoIessFondoReserva;		
		final JPanel jPanelPaginacionProcesoIessFondoReserva=this.jPanelPaginacionProcesoIessFondoReserva;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReserva=this.jScrollPanelDatosEdicionProcesoIessFondoReserva;
		final JPanel jPanelAccionesProcesoIessFondoReserva=this.jPanelAccionesProcesoIessFondoReserva;
		
		JPanel jPanelCamposAuxiliarProcesoIessFondoReserva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			jPanelCamposAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelCamposProcesoIessFondoReserva;
			jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelAccionesFormularioProcesoIessFondoReserva;
		}
		
		final JPanel jPanelCamposProcesoIessFondoReserva=jPanelCamposAuxiliarProcesoIessFondoReserva;
		final JPanel jPanelAccionesFormularioProcesoIessFondoReserva=jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva;
		
		
		final JMenuBar jmenuBarProcesoIessFondoReserva=this.jmenuBarProcesoIessFondoReserva;
		final JToolBar jTtoolBarProcesoIessFondoReserva=this.jTtoolBarProcesoIessFondoReserva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessFondoReserva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessFondoReserva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			jmenuBarDetalleAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jmenuBarDetalleProcesoIessFondoReserva;
			jTtoolBarDetalleAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTtoolBarDetalleProcesoIessFondoReserva;
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessFondoReserva=jmenuBarDetalleAuxiliarProcesoIessFondoReserva;
		final JToolBar jTtoolBarDetalleProcesoIessFondoReserva=jTtoolBarDetalleAuxiliarProcesoIessFondoReserva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessFondoReserva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessFondoReserva;
			processRunnable.jTableDatos=jTableDatosProcesoIessFondoReserva;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessFondoReserva;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessFondoReserva;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessFondoReserva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessFondoReserva;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessFondoReserva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessFondoReserva;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessFondoReserva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessFondoReserva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessFondoReserva ,jPanelParametrosReportesProcesoIessFondoReserva,jTableDatosProcesoIessFondoReserva, /*jScrollPanelDatosProcesoIessFondoReserva,*/jPanelCamposProcesoIessFondoReserva,jPanelPaginacionProcesoIessFondoReserva, /*jScrollPanelDatosEdicionProcesoIessFondoReserva,*/ jPanelAccionesProcesoIessFondoReserva,jPanelAccionesFormularioProcesoIessFondoReserva,jmenuBarProcesoIessFondoReserva,jmenuBarDetalleProcesoIessFondoReserva,jTtoolBarProcesoIessFondoReserva,jTtoolBarDetalleProcesoIessFondoReserva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessFondoReserva ,jPanelParametrosReportesProcesoIessFondoReserva, jScrollPanelDatosProcesoIessFondoReserva,jPanelPaginacionProcesoIessFondoReserva, jScrollPanelDatosEdicionProcesoIessFondoReserva, jPanelAccionesProcesoIessFondoReserva,jPanelAccionesFormularioProcesoIessFondoReserva,jmenuBarProcesoIessFondoReserva,jmenuBarDetalleProcesoIessFondoReserva,jTtoolBarProcesoIessFondoReserva,jTtoolBarDetalleProcesoIessFondoReserva);
						
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
	
	public void finishProcessProcesoIessFondoReserva() {// throws Exception 
		this.finishProcessProcesoIessFondoReserva(true);
	}
	
	public void finishProcessProcesoIessFondoReserva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoIessFondoReserva ,this.jPanelParametrosReportesProcesoIessFondoReserva, this.jScrollPanelDatosProcesoIessFondoReserva,this.jPanelPaginacionProcesoIessFondoReserva, this.jScrollPanelDatosEdicionProcesoIessFondoReserva, this.jPanelAccionesProcesoIessFondoReserva,this.jPanelAccionesFormularioProcesoIessFondoReserva,this.jmenuBarProcesoIessFondoReserva,this.jmenuBarDetalleProcesoIessFondoReserva,this.jTtoolBarProcesoIessFondoReserva,this.jTtoolBarDetalleProcesoIessFondoReserva);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReserva=this.jTabbedPaneBusquedasProcesoIessFondoReserva; 
		
		final JPanel jPanelParametrosReportesProcesoIessFondoReserva=this.jPanelParametrosReportesProcesoIessFondoReserva;
		//final JScrollPane jScrollPanelDatosProcesoIessFondoReserva=this.jScrollPanelDatosProcesoIessFondoReserva;
		final JTable jTableDatosProcesoIessFondoReserva=this.jTableDatosProcesoIessFondoReserva;		
		final JPanel jPanelPaginacionProcesoIessFondoReserva=this.jPanelPaginacionProcesoIessFondoReserva;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReserva=this.jScrollPanelDatosEdicionProcesoIessFondoReserva;
		final JPanel jPanelAccionesProcesoIessFondoReserva=this.jPanelAccionesProcesoIessFondoReserva;
		
		JPanel jPanelCamposAuxiliarProcesoIessFondoReserva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			jPanelCamposAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelCamposProcesoIessFondoReserva;
			jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelAccionesFormularioProcesoIessFondoReserva;
		}
		
		final JPanel jPanelCamposProcesoIessFondoReserva=jPanelCamposAuxiliarProcesoIessFondoReserva;
		final JPanel jPanelAccionesFormularioProcesoIessFondoReserva=jPanelAccionesFormularioAuxiliarProcesoIessFondoReserva;
		
		
		final JMenuBar jmenuBarProcesoIessFondoReserva=this.jmenuBarProcesoIessFondoReserva;		
		final JToolBar jTtoolBarProcesoIessFondoReserva=this.jTtoolBarProcesoIessFondoReserva;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessFondoReserva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessFondoReserva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			jmenuBarDetalleAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jmenuBarDetalleProcesoIessFondoReserva;
			jTtoolBarDetalleAuxiliarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTtoolBarDetalleProcesoIessFondoReserva;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessFondoReserva=jmenuBarDetalleAuxiliarProcesoIessFondoReserva;
		final JToolBar jTtoolBarDetalleProcesoIessFondoReserva=jTtoolBarDetalleAuxiliarProcesoIessFondoReserva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessFondoReserva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessFondoReserva;
			processRunnable.jTableDatos=jTableDatosProcesoIessFondoReserva;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessFondoReserva;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessFondoReserva;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessFondoReserva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessFondoReserva;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessFondoReserva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessFondoReserva;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessFondoReserva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessFondoReserva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoIessFondoReserva ,jPanelParametrosReportesProcesoIessFondoReserva, jTableDatosProcesoIessFondoReserva,/*jScrollPanelDatosProcesoIessFondoReserva,*/jPanelCamposProcesoIessFondoReserva,jPanelPaginacionProcesoIessFondoReserva, /*jScrollPanelDatosEdicionProcesoIessFondoReserva,*/ jPanelAccionesProcesoIessFondoReserva,jPanelAccionesFormularioProcesoIessFondoReserva,jmenuBarProcesoIessFondoReserva,jmenuBarDetalleProcesoIessFondoReserva,jTtoolBarProcesoIessFondoReserva,jTtoolBarDetalleProcesoIessFondoReserva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoIessFondoReserva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoIessFondoReserva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoIessFondoReserva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoIessFondoReserva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoIessFondoReserva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoIessFondoReserva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoIessFondoReserva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoIessFondoReserva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoIessFondoReserva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoiessfondoreservaConstantesFunciones.getsFinalQueryProcesoIessFondoReserva();
		String  finalQueryPaginacionTodos=this.procesoiessfondoreservaConstantesFunciones.getsFinalQueryProcesoIessFondoReserva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoIessFondoReservaConstantesFunciones.getArrayColumnasGlobalesNoProcesoIessFondoReserva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoIessFondoReservaConstantesFunciones.getArrayColumnasGlobalesProcesoIessFondoReserva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoIessFondoReservaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoiessfondoreservasEliminados= new ArrayList<ProcesoIessFondoReserva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoIessFondoReserva();
		
				///*ProcesoIessFondoReservaSessionBean*/this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
			
			if(this.procesoiessfondoreservaSessionBean==null) {
				this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
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
					this.iNumeroPaginacion=ProcesoIessFondoReservaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoIessFondoReservaConstantesFunciones.getClassesForeignKeysOfProcesoIessFondoReserva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoiessfondoreserva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoiessfondoreservasAux= new ArrayList<ProcesoIessFondoReserva>();
			
				
			procesoiessfondoreservaLogic.setDatosCliente(this.datosCliente);
			procesoiessfondoreservaLogic.setDatosDeep(this.datosDeep);
			procesoiessfondoreservaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoIessFondoReserva")) {
				this.sDetalleReporte=ProcesoIessFondoReservaConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReserva(id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoiessfondoreservaLogic.getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessFondoReservaConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReserva(id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessFondoReservaConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReserva(id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoiessfondoreservaLogic.getProcesoIessFondoReservas()==null||procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoiessfondoreservas==null|| procesoiessfondoreservas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservasAux=new ArrayList<ProcesoIessFondoReserva>();
						procesoiessfondoreservasAux.addAll(procesoiessfondoreservaLogic.getProcesoIessFondoReservas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservasAux=new ArrayList<ProcesoIessFondoReserva>();
							procesoiessfondoreservasAux.addAll(procesoiessfondoreservas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoiessfondoreservaLogic.getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessFondoReservaConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReserva(id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessFondoReservaConstantesFunciones.getDetalleIndiceBusquedaProcesoIessFondoReserva(id_anioBusquedaProcesoIessFondoReserva,id_numero_patronalBusquedaProcesoIessFondoReserva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoIessFondoReservas("BusquedaProcesoIessFondoReserva",procesoiessfondoreservaLogic.getProcesoIessFondoReservas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoIessFondoReservas("BusquedaProcesoIessFondoReserva",procesoiessfondoreservas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservaLogic.setProcesoIessFondoReservas(new ArrayList<ProcesoIessFondoReserva>());
						procesoiessfondoreservaLogic.getProcesoIessFondoReservas().addAll(procesoiessfondoreservasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservas=new ArrayList<ProcesoIessFondoReserva>();
							procesoiessfondoreservas.addAll(procesoiessfondoreservasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoIessFondoReserva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoIessFondoReserva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoIessFondoReserva procesoiessfondoreserva) {
		Boolean permite=true;
		
		if(this.procesoiessfondoreserva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoIessFondoReservaConstantesFunciones.getOrderByListaProcesoIessFondoReserva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoIessFondoReservaConstantesFunciones.getOrderByListaProcesoIessFondoReserva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReserva procesoiessfondoreserva:procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				if(procesoiessfondoreserva.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservaTotales=procesoiessfondoreserva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReserva procesoiessfondoreserva:this.procesoiessfondoreservas) {
				if(procesoiessfondoreserva.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservaTotales=procesoiessfondoreserva;
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
			this.procesoiessfondoreservaAux=new ProcesoIessFondoReserva();
			this.procesoiessfondoreservaAux.setsType(Constantes2.S_TOTALES);
			this.procesoiessfondoreservaAux.setIsNew(false);
			this.procesoiessfondoreservaAux.setIsChanged(false);
			this.procesoiessfondoreservaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoIessFondoReservaConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReserva(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas(),this.procesoiessfondoreservaAux);
				
				//this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().add(this.procesoiessfondoreservaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoIessFondoReservaConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReserva(this.procesoiessfondoreservas,this.procesoiessfondoreservaAux);
				
				this.procesoiessfondoreservas.add(this.procesoiessfondoreservaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoiessfondoreservaTotales=new ProcesoIessFondoReserva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().remove(procesoiessfondoreservaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessfondoreservas.remove(procesoiessfondoreservaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoiessfondoreservaTotales=new ProcesoIessFondoReserva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessFondoReserva procesoiessfondoreserva:procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				if(procesoiessfondoreserva.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservaTotales=procesoiessfondoreserva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessFondoReservaConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReserva(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas(),procesoiessfondoreservaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessFondoReserva procesoiessfondoreserva:this.procesoiessfondoreservas) {
				if(procesoiessfondoreserva.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessfondoreservaTotales=procesoiessfondoreserva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessFondoReservaConstantesFunciones.TotalizarValoresFilaProcesoIessFondoReserva(this.procesoiessfondoreservas,procesoiessfondoreservaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoIessFondoReserva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessFondoReservasFK_IdNumeroPatronal()throws Exception {
		try {
			sAccionBusqueda="FK_IdNumeroPatronal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva(String sFinalQuery,Long id_anio,Long id_numero_patronal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservaLogic.getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva(sFinalQuery,this.pagination,id_anio,id_numero_patronal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservaLogic.getProcesoIessFondoReservasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessFondoReservasFK_IdNumeroPatronal(String sFinalQuery,Long id_numero_patronal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessfondoreservaLogic.getProcesoIessFondoReservasFK_IdNumeroPatronal(sFinalQuery,this.pagination,id_numero_patronal);
				
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
	
	public void inicializarPermisosProcesoIessFondoReserva() {
		this.isPermisoTodoProcesoIessFondoReserva=false;
		this.isPermisoNuevoProcesoIessFondoReserva=false;
		this.isPermisoActualizarProcesoIessFondoReserva=false;
		this.isPermisoActualizarOriginalProcesoIessFondoReserva=false;
		this.isPermisoEliminarProcesoIessFondoReserva=false;
		this.isPermisoGuardarCambiosProcesoIessFondoReserva=false;
		this.isPermisoConsultaProcesoIessFondoReserva=true;
		this.isPermisoBusquedaProcesoIessFondoReserva=true;
		this.isPermisoReporteProcesoIessFondoReserva=true;
		this.isPermisoOrdenProcesoIessFondoReserva=false;		
		this.isPermisoPaginacionMedioProcesoIessFondoReserva=false;		
		this.isPermisoPaginacionAltoProcesoIessFondoReserva=false;		
		this.isPermisoPaginacionTodoProcesoIessFondoReserva=false;		
		this.isPermisoCopiarProcesoIessFondoReserva=false;		
		this.isPermisoVerFormProcesoIessFondoReserva=false;		
		this.isPermisoDuplicarProcesoIessFondoReserva=false;
		this.isPermisoOrdenProcesoIessFondoReserva=false;
	}
	
	public void setPermisosUsuarioProcesoIessFondoReserva(Boolean isPermiso) {
		this.isPermisoTodoProcesoIessFondoReserva=isPermiso;
		this.isPermisoNuevoProcesoIessFondoReserva=isPermiso;
		this.isPermisoActualizarProcesoIessFondoReserva=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessFondoReserva=isPermiso;
		this.isPermisoEliminarProcesoIessFondoReserva=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessFondoReserva=isPermiso;
		this.isPermisoConsultaProcesoIessFondoReserva=isPermiso;
		this.isPermisoBusquedaProcesoIessFondoReserva=isPermiso;
		this.isPermisoReporteProcesoIessFondoReserva=isPermiso;
		this.isPermisoOrdenProcesoIessFondoReserva=isPermiso;		
		this.isPermisoPaginacionMedioProcesoIessFondoReserva=isPermiso;		
		this.isPermisoPaginacionAltoProcesoIessFondoReserva=isPermiso;		
		this.isPermisoPaginacionTodoProcesoIessFondoReserva=isPermiso;		
		this.isPermisoCopiarProcesoIessFondoReserva=isPermiso;		
		this.isPermisoVerFormProcesoIessFondoReserva=isPermiso;		
		this.isPermisoDuplicarProcesoIessFondoReserva=isPermiso;
		this.isPermisoOrdenProcesoIessFondoReserva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoIessFondoReserva(Boolean isPermiso) {
		//this.isPermisoTodoProcesoIessFondoReserva=isPermiso;
		this.isPermisoNuevoProcesoIessFondoReserva=isPermiso;
		this.isPermisoActualizarProcesoIessFondoReserva=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessFondoReserva=isPermiso;
		this.isPermisoEliminarProcesoIessFondoReserva=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessFondoReserva=isPermiso;
		//this.isPermisoConsultaProcesoIessFondoReserva=isPermiso;
		//this.isPermisoBusquedaProcesoIessFondoReserva=isPermiso;
		//this.isPermisoReporteProcesoIessFondoReserva=isPermiso;
		//this.isPermisoOrdenProcesoIessFondoReserva=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoIessFondoReserva=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoIessFondoReserva=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoIessFondoReserva=isPermiso;		
		//this.isPermisoCopiarProcesoIessFondoReserva=isPermiso;		
		//this.isPermisoDuplicarProcesoIessFondoReserva=isPermiso;
		//this.isPermisoOrdenProcesoIessFondoReserva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessFondoReservaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoIessFondoReservaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoIessFondoReserva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessFondoReservaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoIessFondoReservaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoIessFondoReservaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoIessFondoReservaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoIessFondoReserva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoIessFondoReservaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoIessFondoReservaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoIessFondoReserva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoIessFondoReserva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoIessFondoReserva=this.isPermisoActualizarProcesoIessFondoReserva;
			this.isPermisoEliminarProcesoIessFondoReserva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoIessFondoReserva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoIessFondoReserva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoIessFondoReserva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoIessFondoReserva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoIessFondoReserva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessFondoReserva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoIessFondoReserva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoIessFondoReserva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoIessFondoReserva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoIessFondoReserva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoIessFondoReserva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoIessFondoReserva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessFondoReserva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoIessFondoReserva.setToolTipText(this.jTableDatosProcesoIessFondoReserva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoIessFondoReserva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoIessFondoReserva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoIessFondoReserva() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoIessFondoReservaListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.numeropatronalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoIessFondoReservaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoIessFondoReservaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNumeroPatronalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoIessFondoReserva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyNumeroPatronal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesoiessfondoreservaSessionBean==null) {
				this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean();
			}

			if(!this.procesoiessfondoreservaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyNumeroPatronal()throws Exception {
		try {

			if(!this.procesoiessfondoreservaSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoIessFondoReserva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoIessFondoReserva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoIessFondoReserva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReserva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva)throws Exception {	
		try {
			
			this.setActualNumeroPatronalForeignKey(procesoiessfondoreserva.getid_numero_patronal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoIessFondoReserva()throws Exception {	
		try {
			
			this.setActualNumeroPatronalForeignKey(this.procesoiessfondoreservaConstantesFunciones.getid_numero_patronal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessFondoReserva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoIessFondoReserva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoIessFondoReserva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoIessFondoReserva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoIessFondoReserva()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoIessFondoReserva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoIessFondoReserva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva!=null && this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva!=null && this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ProcesoIessFondoReservaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoIessFondoReservaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoIessFondoReservaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoiessfondoreservaSessionBean=new ProcesoIessFondoReservaSessionBean(); 
		this.procesoiessfondoreservaConstantesFunciones=new ProcesoIessFondoReservaConstantesFunciones(); 
		this.procesoiessfondoreservaBean=new ProcesoIessFondoReserva();//(this.procesoiessfondoreservaConstantesFunciones); 		
		this.procesoiessfondoreservaReturnGeneral=new ProcesoIessFondoReservaParameterReturnGeneral(); 
		
		this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoIessFondoReservaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoIessFondoReservaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoIessFondoReservaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoIessFondoReserva(true);
			
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
			
			this.procesoiessfondoreservaConstantesFunciones=new ProcesoIessFondoReservaConstantesFunciones(); 
			this.procesoiessfondoreservaBean=new ProcesoIessFondoReserva();//this.procesoiessfondoreservaConstantesFunciones); 			
			this.procesoiessfondoreservaReturnGeneral=new ProcesoIessFondoReservaParameterReturnGeneral(); 
		
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Fondo Reserva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesoiessfondoreserva=new ProcesoIessFondoReserva();
			this.procesoiessfondoreservas = new ArrayList<ProcesoIessFondoReserva>();
			this.procesoiessfondoreservasAux = new ArrayList<ProcesoIessFondoReserva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic=new ProcesoIessFondoReservaLogic();
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoiessfondoreservaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoiessfondoreservaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoIessFondoReserva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessFondoReserva);	
					}
					
					if(this.jInternalFrameImportacionProcesoIessFondoReserva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessFondoReserva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoIessFondoReserva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoIessFondoReserva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessFondoReserva);
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.setVisible(false);
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva);
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoIessFondoReserva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessFondoReserva);
					this.jInternalFrameImportacionProcesoIessFondoReserva.setVisible(false);
					this.jInternalFrameImportacionProcesoIessFondoReserva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoIessFondoReserva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessFondoReserva);
					this.jInternalFrameOrderByProcesoIessFondoReserva.setVisible(false);
					this.jInternalFrameOrderByProcesoIessFondoReserva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoIessFondoReservaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoIessFondoReservaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoiessfondoreservaReturnGeneral=new ProcesoIessFondoReservaParameterReturnGeneral();
			
			this.procesoiessfondoreservaParameterGeneral=new ProcesoIessFondoReservaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoiessfondoreservaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessFondoReservaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado(),this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessFondoReservaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado(),this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaCopiarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaVerFormProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaOrdenProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			
			
			this.isVisibilidadBusquedaProcesoIessFondoReserva=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdNumeroPatronal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoIessFondoReserva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoIessFondoReserva(false);
			
			this.setPermisosUsuarioProcesoIessFondoReserva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado() && this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoIessFondoReservaClasesRelacionadas();
			}
			
			if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoIessFondoReservaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoIessFondoReserva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReserva();
			}
			
			if(!this.isPermisoBusquedaProcesoIessFondoReserva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoIessFondoReservaConstantesFunciones.getTiposSeleccionarProcesoIessFondoReserva());
				
				this.tiposColumnasSelect=ProcesoIessFondoReservaConstantesFunciones.getTiposSeleccionarProcesoIessFondoReserva(true);
				
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
			//if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoIessFondoReserva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoIessFondoReserva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoIessFondoReserva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReserva() ;
			
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
			this.numeropatronalLogic=new NumeroPatronalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesoiessfondoreservaImplementable= (ProcesoIessFondoReservaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessFondoReservaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoiessfondoreservaImplementableHome= (ProcesoIessFondoReservaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessFondoReservaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoiessfondoreservas= new ArrayList<ProcesoIessFondoReserva>();
			this.procesoiessfondoreservasEliminados= new ArrayList<ProcesoIessFondoReserva>();
						
			this.isEsNuevoProcesoIessFondoReserva=false;
			this.esParaAccionDesdeFormularioProcesoIessFondoReserva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoIessFondoReserva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoIessFondoReserva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoIessFondoReservaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoIessFondoReserva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoIessFondoReserva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoIessFondoReserva();
			}
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoIessFondoReserva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoIessFondoReserva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoIessFondoReserva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoIessFondoReserva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoIessFondoReserva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoIessFondoReserva() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoIessFondoReserva")) {
				iIndex=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoIessFondoReserva();	
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
	
	public void cargarCombosForeignKeyProcesoIessFondoReserva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoIessFondoReserva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoIessFondoReserva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoIessFondoReservaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoIessFondoReserva();
		
		this.cargarCombosFrameForeignKeyProcesoIessFondoReserva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoIessFondoReserva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReserva();
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
	
	public void jButtonNuevoProcesoIessFondoReservaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			
			if(jTableDatosProcesoIessFondoReserva.getRowCount()>=1) {
				jTableDatosProcesoIessFondoReserva.removeRowSelectionInterval(0, jTableDatosProcesoIessFondoReserva.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoIessFondoReserva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReserva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoIessFondoReserva(true);			
			//this.procesoiessfondoreserva=new ProcesoIessFondoReserva();
			//this.procesoiessfondoreserva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva() ;
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReserva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoiessfondoreserva);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);				
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoIessFondoReserva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoIessFondoReservaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReserva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReserva.getSelectedRows().length;			
			}
			
			procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoIessFondoReserva--;			
				//ProcesoIessFondoReserva procesoiessfondoreservaAux= new ProcesoIessFondoReserva();			
				//procesoiessfondoreservaAux.setId(this.iIdNuevoProcesoIessFondoReserva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoIessFondoReserva procesoiessfondoreservaOrigen=new ProcesoIessFondoReserva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoIessFondoReserva procesoiessfondoreservaOrigen : procesoiessfondoreservasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoiessfondoreservaOrigen =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessfondoreservaOrigen =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoIessFondoReserva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoiessfondoreserva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoIessFondoReserva(procesoiessfondoreservaOrigen,this.procesoiessfondoreserva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().add(this.procesoiessfondoreservaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservas.add(this.procesoiessfondoreservaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
				
				this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReserva(), this.getIndiceNuevoProcesoIessFondoReserva());
				
				int iLastRow =  this.jTableDatosProcesoIessFondoReserva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessFondoReserva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessFondoReserva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();									
		
			ProcesoIessFondoReserva procesoiessfondoreservaOrigen=new ProcesoIessFondoReserva();
			ProcesoIessFondoReserva procesoiessfondoreservaDestino=new ProcesoIessFondoReserva();
				
			procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReserva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoiessfondoreservasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoIessFondoReserva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservaOrigen =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservaOrigen =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessfondoreservaDestino =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservaDestino =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoiessfondoreservaOrigen =procesoiessfondoreservasSeleccionados.get(0);
				procesoiessfondoreservaDestino =procesoiessfondoreservasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoIessFondoReserva(procesoiessfondoreservaOrigen,procesoiessfondoreservaDestino,true,false);
				
				procesoiessfondoreservaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoiessfondoreservaDestino,procesoiessfondoreservaLogic.getProcesoIessFondoReservas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoiessfondoreservaDestino,procesoiessfondoreservas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
				
				//this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReserva(), this.getIndiceNuevoProcesoIessFondoReserva());
				
				int iLastRow =  this.jTableDatosProcesoIessFondoReserva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessFondoReserva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessFondoReserva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoIessFondoReserva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(!isVisible);
			this.jPanelPaginacionProcesoIessFondoReserva.setVisible(!isVisible);
			this.jPanelAccionesProcesoIessFondoReserva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoIessFondoReserva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoIessFondoReserva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoIessFondoReserva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoIessFondoReserva();
			
			this.abrirFrameOrderByProcesoIessFondoReserva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoIessFondoReserva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoIessFondoReserva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessFondoReserva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSize(this.jInternalFrameDetalleFormProcesoIessFondoReserva.iWidthFormulario,this.jInternalFrameDetalleFormProcesoIessFondoReserva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoIessFondoReserva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoIessFondoReserva.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoIessFondoReserva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jContentPaneDetalleProcesoIessFondoReserva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jContentPaneDetalleProcesoIessFondoReserva.getWidth(),ProcesoIessFondoReservaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jContentPaneDetalleProcesoIessFondoReserva.getWidth(),ProcesoIessFondoReservaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jContentPaneDetalleProcesoIessFondoReserva.getWidth(),ProcesoIessFondoReservaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoIessFondoReserva.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoIessFondoReserva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoIessFondoReserva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoIessFondoReserva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReserva,false,this);
				} else {
					this.jInternalFrameOrderByProcesoIessFondoReserva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReserva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessFondoReserva);
				this.jInternalFrameOrderByProcesoIessFondoReserva.setVisible(false);
				this.jInternalFrameOrderByProcesoIessFondoReserva.setSelected(false);
				
				this.jInternalFrameOrderByProcesoIessFondoReserva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessFondoReserva"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoIessFondoReserva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoIessFondoReserva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoIessFondoReserva==null) {
				
				this.jInternalFrameImportacionProcesoIessFondoReserva=new ImportacionJInternalFrame(ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessFondoReserva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessFondoReserva);
				this.jInternalFrameImportacionProcesoIessFondoReserva.setVisible(false);
				this.jInternalFrameImportacionProcesoIessFondoReserva.setSelected(false);


				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessFondoReserva"));
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessFondoReserva"));
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessFondoReserva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoIessFondoReserva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva==null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva=new ReporteDinamicoJInternalFrame(ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessFondoReserva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva);
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReserva"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReserva"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReserva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReserva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoIessFondoReserva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessFondoReserva);
			
	       	this.jInternalFrameDetalleFormProcesoIessFondoReserva.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoIessFondoReserva.dispose();
			//this.jInternalFrameDetalleFormProcesoIessFondoReserva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoIessFondoReserva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoIessFondoReserva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoIessFondoReserva.setVisible(true);
	        this.jInternalFrameImportacionProcesoIessFondoReserva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoIessFondoReserva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoIessFondoReserva.setVisible(true);
	        this.jInternalFrameOrderByProcesoIessFondoReserva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoIessFondoReserva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoIessFondoReserva.setVisible(false);
	        this.jInternalFrameOrderByProcesoIessFondoReserva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoIessFondoReserva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoIessFondoReserva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoIessFondoReserva.setVisible(false);
	        this.jInternalFrameImportacionProcesoIessFondoReserva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoIessFondoReserva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoIessFondoReserva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoIessFondoReserva(true);
			//this.isEsNuevoProcesoIessFondoReserva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false) ;
			
			if(procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReserva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoIessFondoReservaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoIessFondoReserva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoIessFondoReserva(true);
			//this.isEsNuevoProcesoIessFondoReserva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoiessfondoreserva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false) ;
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessFondoReserva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNumeroPatronal(List<NumeroPatronal> numeropatronalsForeignKey)throws Exception{
		TableColumn tableColumnNumeroPatronal=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL));
		TableCellEditor tableCellEditorNumeroPatronal =tableColumnNumeroPatronal.getCellEditor();

		NumeroPatronalTableCell numeropatronalTableCellFk=(NumeroPatronalTableCell)tableCellEditorNumeroPatronal;

		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.setnumeropatronalsForeignKey(numeropatronalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//numeropatronalTableCellFk.setRowActual(intSelectedRow);
			//numeropatronalTableCellFk.setnumeropatronalsForeignKeyActual(numeropatronalsForeignKey);
		//}


		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.RecargarNumeroPatronalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessFondoReserva(false);
			
			//if(!this.isEsNuevoProcesoIessFondoReserva) {								
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
				
			}
			
			if(this.permiteMantenimiento(this.procesoiessfondoreserva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoIessFondoReserva=true;
					this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
					this.isEsNuevoProcesoIessFondoReserva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoIessFondoReserva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoIessFondoReserva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(false);
				
				this.habilitarDeshabilitarControlesProcesoIessFondoReserva(false);
			
												
				
				if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoIessFondoReserva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,procesoiessfondoreservaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoIessFondoReserva(this.procesoiessfondoreserva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoiessfondoreservaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoiessfondoreserva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessfondoreserva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessfondoreserva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoiessfondoreserva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoIessFondoReservaModel) this.jTableDatosProcesoIessFondoReserva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoIessFondoReserva=true;
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
				this.isEsNuevoProcesoIessFondoReserva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(false);
				
				this.habilitarDeshabilitarControlesProcesoIessFondoReserva(false);
				
				
				
				if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoIessFondoReserva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoIessFondoReserva.getRowCount()>=1) {
				jTableDatosProcesoIessFondoReserva.removeRowSelectionInterval(0, jTableDatosProcesoIessFondoReserva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoIessFondoReserva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(false) ;
			
			this.isEsNuevoProcesoIessFondoReserva=false;
			
			if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoIessFondoReserva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoIessFondoReserva(false);
				
				//SI ES MANUAL
				if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoIessFondoReserva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoIessFondoReserva--;			
			//ProcesoIessFondoReserva procesoiessfondoreservaAux= new ProcesoIessFondoReserva();			
			//procesoiessfondoreservaAux.setId(this.iIdNuevoProcesoIessFondoReserva);
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoIessFondoReserva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
			
			this.procesoiessfondoreserva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().add(this.procesoiessfondoreservaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoiessfondoreservas.add(this.procesoiessfondoreservaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			
			this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(this.getIndiceNuevoProcesoIessFondoReserva(), this.getIndiceNuevoProcesoIessFondoReserva());
			
			int iLastRow =  this.jTableDatosProcesoIessFondoReserva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoIessFondoReserva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoIessFondoReserva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReserva();
			}
			
			//this.abrirFrameTreeProcesoIessFondoReserva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoIessFondoReserva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoIessFondoReserva.setFileImportacion(this.jInternalFrameImportacionProcesoIessFondoReserva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoIessFondoReserva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoIessFondoReserva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		

		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoIessFondoReservaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoIessFondoReservaBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NumeroPatronal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NumeroPatronal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NumeroPatronal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NumeroPatronal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoria="id_numero_patronal";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoriaValor="id_numero_patronal";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Patronal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_numero_patronal");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoIessFondoReservas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoIessFondoReserva procesoiessfondoreserva:procesoiessfondoreservasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreserva.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL);
					iRow++;

					for(ProcesoIessFondoReserva procesoiessfondoreserva:procesoiessfondoreservasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessfondoreserva.getnumeropatronal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelProcesoIessFondoReserva(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoIessFondoReserva(procesoiessfondoreservaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoIessFondoReserva(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessFondoReserva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessFondoReserva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
			
			//SI ES MANUAL
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessFondoReserva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoIessFondoReserva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoIessFondoReserva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoIessFondoReserva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoIessFondoReserva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoIessFondoReserva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoIessFondoReserva.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoIessFondoReserva.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoIessFondoReserva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoIessFondoReserva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoIessFondoReserva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoIessFondoReserva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoIessFondoReserva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoIessFondoReserva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReserva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessFondoReserva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoIessFondoReserva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoIessFondoReserva();
		
		this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessFondoReserva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReserva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReserva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReserva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoIessFondoReserva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionNuevoProcesoIessFondoReserva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoIessFondoReserva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoIessFondoReserva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionNuevoProcesoIessFondoReserva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionSinCerrarProcesoIessFondoReserva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jCheckBoxPostAccionSinMensajeProcesoIessFondoReserva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoIessFondoReserva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoIessFondoReserva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoIessFondoReserva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoIessFondoReserva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoIessFondoReserva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoIessFondoReserva(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessFondoReserva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessFondoReserva() throws Exception {
		try	{
			if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessFondoReserva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessFondoReserva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessFondoReserva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoIessFondoReserva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoIessFondoReserva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoIessFondoReserva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoIessFondoReserva.addItem(reporte);
			}
			
			
			if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoIessFondoReserva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoIessFondoReserva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoIessFondoReserva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReserva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessFondoReserva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoIessFondoReserva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getSelectedItem()!=null){this.id_anioBusquedaProcesoIessFondoReserva=((Anio)this.jComboBoxid_anioBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getSelectedItem()).getId();}
		if(this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getSelectedItem()!=null){this.id_numero_patronalBusquedaProcesoIessFondoReserva=((NumeroPatronal)this.jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoIessFondoReserva(Boolean esInicializar) throws Exception {				
		if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessFondoReserva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoIessFondoReserva() throws Exception {
		this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoIessFondoReserva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoIessFondoReservaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReservaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoIessFondoReserva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoiessfondoreservas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoIessFondoReserva.setModel(new ProcesoIessFondoReservaModel(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoIessFondoReserva.setModel(new ProcesoIessFondoReservaModel(this.procesoiessfondoreservas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoIessFondoReserva!=null && this.jInternalFrameOrderByProcesoIessFondoReserva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoIessFondoReserva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,procesoiessfondoreservaConstantesFunciones.resaltarSeleccionarProcesoIessFondoReserva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoIessFondoReservaConstantesFunciones.SCLASSWEBTITULO,procesoiessfondoreservaConstantesFunciones.resaltarSeleccionarProcesoIessFondoReserva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,ProcesoIessFondoReservaConstantesFunciones.LABEL_ID));

		if(this.procesoiessfondoreservaConstantesFunciones.mostraridProcesoIessFondoReserva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoiessfondoreservaConstantesFunciones.resaltaridProcesoIessFondoReserva,this.procesoiessfondoreservaConstantesFunciones.activaridProcesoIessFondoReserva,this,true,"idProcesoIessFondoReserva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoiessfondoreservaConstantesFunciones.resaltaridProcesoIessFondoReserva,this.procesoiessfondoreservaConstantesFunciones.activaridProcesoIessFondoReserva,this,true,"idProcesoIessFondoReserva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO));

		if(this.procesoiessfondoreservaConstantesFunciones.mostrarid_anioProcesoIessFondoReserva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesoiessfondoreservaConstantesFunciones.resaltarid_anioProcesoIessFondoReserva,this,this.procesoiessfondoreservaConstantesFunciones.activarid_anioProcesoIessFondoReserva));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesoiessfondoreservaConstantesFunciones.resaltarid_anioProcesoIessFondoReserva,this,this.procesoiessfondoreservaConstantesFunciones.activarid_anioProcesoIessFondoReserva,true,"id_anioProcesoIessFondoReserva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL));

		if(this.procesoiessfondoreservaConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReserva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessfondoreservaConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReserva,this,this.procesoiessfondoreservaConstantesFunciones.activarid_numero_patronalProcesoIessFondoReserva));
			tableColumn.setCellEditor(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessfondoreservaConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReserva,this,this.procesoiessfondoreservaConstantesFunciones.activarid_numero_patronalProcesoIessFondoReserva,true,"id_numero_patronalProcesoIessFondoReserva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessFondoReservaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessFondoReserva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessFondoReserva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoIessFondoReserva.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoIessFondoReserva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoIessFondoReserva.moveColumn(this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoIessFondoReserva.moveColumn(this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoIessFondoReserva.moveColumn(this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoIessFondoReserva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoIessFondoReserva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoIessFondoReserva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoIessFondoReserva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoIessFondoReserva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoIessFondoReserva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoiessfondoreservaLogic.getProcesoIessFondoReservas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoiessfondoreservas.size()-1;
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
		//this.jTableDatosProcesoIessFondoReserva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoIessFondoReserva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoIessFondoReserva();
			
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
				
				//this.isEsNuevoProcesoIessFondoReserva=false;
					
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
				if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessFondoReserva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessFondoReserva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoiessfondoreserva.getsType().equals("DUPLICADO")
				   || this.procesoiessfondoreserva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoIessFondoReserva=true;
				
				} else {
					this.isEsNuevoProcesoIessFondoReserva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoiessfondoreserva.getId()>=0 && !this.procesoiessfondoreserva.getIsNew()) {						
						this.isEsNuevoProcesoIessFondoReserva=false;
						
					} else {
						this.isEsNuevoProcesoIessFondoReserva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoIessFondoReserva(esRelaciones);						
				
				this.seleccionarProcesoIessFondoReserva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoiessfondoreserva.getId()<0) {
					this.isEsNuevoProcesoIessFondoReserva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoIessFondoReserva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoIessFondoReserva(evt,rowIndex);
				}	
				
				if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoIessFondoReserva: " + this.dDif); 
					}
				}								
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoIessFondoReserva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoiessfondoreserva)) {
					if(this.procesoiessfondoreserva.getId()>0) {
						this.procesoiessfondoreserva.setIsDeleted(true);
						
						this.procesoiessfondoreservasEliminados.add(this.procesoiessfondoreserva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().remove(this.procesoiessfondoreserva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreservas.remove(this.procesoiessfondoreserva);				
					}
					
					
					((ProcesoIessFondoReservaModel) this.jTableDatosProcesoIessFondoReserva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoIessFondoReserva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoIessFondoReserva) {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessFondoReserva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessFondoReserva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreserva);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesoiessfondoreservaConstantesFunciones.cargarid_anioProcesoIessFondoReserva || this.procesoiessfondoreservaConstantesFunciones.event_dependid_anioProcesoIessFondoReserva) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesoiessfondoreserva.getid_anio());
									//this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesoiessfondoreserva.getAnio()!=null) {
							this.aniosForeignKey.add(procesoiessfondoreserva.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesoiessfondoreserva.getid_anio(),false,"Formulario");

					//NumeroPatronal
					if(!this.procesoiessfondoreservaConstantesFunciones.cargarid_numero_patronalProcesoIessFondoReserva || this.procesoiessfondoreservaConstantesFunciones.event_dependid_numero_patronalProcesoIessFondoReserva) {
						//this.cargarCombosNumeroPatronalsForeignKeyLista(" where id="+this.procesoiessfondoreserva.getid_numero_patronal());
									//this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
						this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

						if(procesoiessfondoreserva.getNumeroPatronal()!=null) {
							this.numeropatronalsForeignKey.add(procesoiessfondoreserva.getNumeroPatronal());
						}

						this.addItemDefectoCombosForeignKeyNumeroPatronal();
						this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
					}
					this.setActualNumeroPatronalForeignKey(this.procesoiessfondoreserva.getid_numero_patronal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoIessFondoReserva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoIessFondoReserva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoIessFondoReserva(procesoiessfondoreserva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoIessFondoReserva(procesoiessfondoreserva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoIessFondoReserva(procesoiessfondoreserva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReserva(procesoiessfondoreserva);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setText(procesoiessfondoreserva.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoIessFondoReserva procesoiessfondoreservaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoiessfondoreservaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoIessFondoReserva procesoiessfondoreservaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoiessfondoreservaLocal=this.procesoiessfondoreserva;
			} else {
				procesoiessfondoreservaLocal=this.procesoiessfondoreservaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoiessfondoreservaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoIessFondoReserva(procesoiessfondoreservaLocal,true);
					
					if(procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoiessfondoreservaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoiessfondoreservaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(procesoiessfondoreserva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(procesoiessfondoreserva);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(procesoiessfondoreserva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.getText()==null || this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.getText()=="" || this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setText("0");
			}

			if(conColumnasBase) {procesoiessfondoreserva.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoIessFondoReservaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelIdProcesoIessFondoReserva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreservaBean,ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreservaOrigen,ProcesoIessFondoReserva procesoiessfondoreserva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessfondoreservaOrigen.getId()!=null && !procesoiessfondoreservaOrigen.getId().equals(0L))) {procesoiessfondoreserva.setId(procesoiessfondoreservaOrigen.getId());}}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setText(procesoiessfondoreserva.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessFondoReserva(ProcesoIessFondoReservaBean procesoiessfondoreservaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setText(procesoiessfondoreservaBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReserva(ProcesoIessFondoReservaParameterReturnGeneral procesoiessfondoreservaReturnGeneral,ProcesoIessFondoReservaBean procesoiessfondoreservaBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoIessFondoReserva procesoiessfondoreservaLocal=new ProcesoIessFondoReserva();
			
			procesoiessfondoreservaLocal=procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessfondoreservaLocal.getId()!=null && !procesoiessfondoreservaLocal.getId().equals(0L))) {procesoiessfondoreservaBean.setId(procesoiessfondoreservaLocal.getId());}}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoIessFondoReservaGenerico(Long idProcesoIessFondoReservaSeleccionado,JComboBox jComboBoxProcesoIessFondoReserva,List<ProcesoIessFondoReserva> procesoiessfondoreservasLocal)throws Exception {
		try {
			ProcesoIessFondoReserva  procesoiessfondoreservaTemp=null;

			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasLocal) {
				if(procesoiessfondoreservaAux.getId()!=null && procesoiessfondoreservaAux.getId().equals(idProcesoIessFondoReservaSeleccionado)) {
					procesoiessfondoreservaTemp=procesoiessfondoreservaAux;
					break;
				}
			}

			jComboBoxProcesoIessFondoReserva.setSelectedItem(procesoiessfondoreservaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoIessFondoReservaGenerico(JComboBox jComboBoxProcesoIessFondoReserva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessFondoReserva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoIessFondoReserva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessFondoReserva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoIessFondoReserva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoIessFondoReserva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoIessFondoReserva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreserva=(ProcesoIessFondoReserva) procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessfondoreserva =(ProcesoIessFondoReserva) procesoiessfondoreservas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreserva.getIsNew() && !procesoiessfondoreserva.getIsChanged() && !procesoiessfondoreserva.getIsDeleted()) {
				sDescripcion=procesoiessfondoreserva.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreserva.getanio_descripcion();
			}
		}

		if(sTipo.equals("NumeroPatronal")) {
			//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
			if(!procesoiessfondoreserva.getIsNew() && !procesoiessfondoreserva.getIsChanged() && !procesoiessfondoreserva.getIsDeleted()) {
				sDescripcion=procesoiessfondoreserva.getnumeropatronal_descripcion();
			} else {
				//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessfondoreserva.getnumeropatronal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoIessFondoReserva procesoiessfondoreservaRow=new ProcesoIessFondoReserva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreservaRow=(ProcesoIessFondoReserva) procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessfondoreservaRow=(ProcesoIessFondoReserva) procesoiessfondoreservas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));			
			this.jButtonDuplicarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva && this.isPermisoDuplicarProcesoIessFondoReserva));			
			this.jButtonCopiarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReserva && this.isPermisoCopiarProcesoIessFondoReserva));
			this.jButtonVerFormProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReserva && this.isPermisoVerFormProcesoIessFondoReserva));
			
			this.jButtonAbrirOrderByProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));			
			
			this.jButtonNuevoRelacionesProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));			
			this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReserva && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReserva && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReserva && this.isPermisoEliminarProcesoIessFondoReserva));
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReserva);							
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));						
			this.jButtonDuplicarToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva && this.isPermisoDuplicarProcesoIessFondoReserva));						
			this.jButtonCopiarToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReserva && this.isPermisoCopiarProcesoIessFondoReserva));			
			this.jButtonVerFormToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReserva && this.isPermisoVerFormProcesoIessFondoReserva));			
			this.jButtonAbrirOrderByToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));
			this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));			
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReserva && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReserva  && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReserva && this.isPermisoEliminarProcesoIessFondoReserva));
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarToolBarProcesoIessFondoReserva.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReserva);				
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));			
			this.jMenuItemDuplicarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva && this.isPermisoDuplicarProcesoIessFondoReserva));			
			this.jMenuItemCopiarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaCopiarProcesoIessFondoReserva && this.isPermisoCopiarProcesoIessFondoReserva));			
			this.jMenuItemVerFormProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaVerFormProcesoIessFondoReserva && this.isPermisoVerFormProcesoIessFondoReserva));			
			this.jMenuItemAbrirOrderByProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));			
			//this.jMenuItemMostrarOcultarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));
			this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));			
			//this.jMenuItemDetalleMostrarOcultarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaOrdenProcesoIessFondoReserva && this.isPermisoOrdenProcesoIessFondoReserva));			
			this.jMenuItemNuevoRelacionesProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva));			
			this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaNuevoProcesoIessFondoReserva && this.isPermisoNuevoProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));									
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemModificarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaModificarProcesoIessFondoReserva && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemActualizarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaActualizarProcesoIessFondoReserva && this.isPermisoActualizarProcesoIessFondoReserva));	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemEliminarProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaEliminarProcesoIessFondoReserva && this.isPermisoEliminarProcesoIessFondoReserva));
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemCancelarProcesoIessFondoReserva.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReserva);				
			}
			
			this.jMenuItemGuardarCambiosProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));						
			this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=this.jButtonNuevoProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva=this.jButtonDuplicarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaCopiarProcesoIessFondoReserva=this.jButtonCopiarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaVerFormProcesoIessFondoReserva=this.jButtonVerFormProcesoIessFondoReserva.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoIessFondoReserva=this.jButtonAbrirOrderByProcesoIessFondoReserva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=this.jButtonNuevoRelacionesProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=this.jButtonModificarProcesoIessFondoReserva.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=this.jButtonNuevoToolBarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarToolBarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarToolBarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarToolBarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarToolBarProcesoIessFondoReserva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=this.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=this.jMenuItemNuevoProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=this.jMenuItemNuevoRelacionesProcesoIessFondoReserva.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemModificarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemActualizarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemEliminarProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemCancelarProcesoIessFondoReserva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=this.jMenuItemGuardarCambiosProcesoIessFondoReserva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoIessFondoReserva(Boolean esInicializar) {
		if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessFondoReserva();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoIessFondoReserva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReserva() {
		this.jButtonNuevoProcesoIessFondoReserva.setVisible(this.isPermisoNuevoProcesoIessFondoReserva);			
		this.jButtonDuplicarProcesoIessFondoReserva.setVisible(this.isPermisoDuplicarProcesoIessFondoReserva);			
		this.jButtonCopiarProcesoIessFondoReserva.setVisible(this.isPermisoCopiarProcesoIessFondoReserva);			
		this.jButtonVerFormProcesoIessFondoReserva.setVisible(this.isPermisoVerFormProcesoIessFondoReserva);			
		
		this.jButtonAbrirOrderByProcesoIessFondoReserva.setVisible(this.isPermisoOrdenProcesoIessFondoReserva);					
		
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.setVisible(this.isPermisoNuevoProcesoIessFondoReserva);			
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarProcesoIessFondoReserva.setVisible(this.isPermisoActualizarProcesoIessFondoReserva);	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.setVisible(this.isPermisoActualizarProcesoIessFondoReserva);	
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.setVisible(this.isPermisoEliminarProcesoIessFondoReserva);
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReserva);						
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.setVisible(this.isPermisoGuardarCambiosProcesoIessFondoReserva);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.setVisible(this.isPermisoActualizarProcesoIessFondoReserva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessFondoReserva() {
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarProcesoIessFondoReserva.setVisible(this.isPermisoActualizarProcesoIessFondoReserva);	
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.setVisible(this.isPermisoActualizarProcesoIessFondoReserva);	
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.setVisible(this.isPermisoEliminarProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.setVisible(this.isVisibilidadCeldaCancelarProcesoIessFondoReserva);							
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.setVisible((this.isVisibilidadCeldaGuardarProcesoIessFondoReserva && this.isPermisoGuardarCambiosProcesoIessFondoReserva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoIessFondoReserva() {
		if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoIessFondoReserva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoIessFondoReserva() {
	}
	
	public void jTableDatosProcesoIessFondoReservaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoIessFondoReserva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoIessFondoReservaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.getprocesoiessfondoreserva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreserva==null) {
						this.procesoiessfondoreserva = new ProcesoIessFondoReserva();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
				}

				if(this.procesoiessfondoreserva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoiessfondoreserva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReserva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoIessFondoReservaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReserva(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReserva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.getprocesoiessfondoreserva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesoiessfondoreservaLogic.getConnexion());

				if(this.procesoiessfondoreserva.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreserva.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReserva=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReserva.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoIessFondoReserva.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoIessFondoReservaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.getprocesoiessfondoreserva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreserva==null) {
						this.procesoiessfondoreserva = new ProcesoIessFondoReserva();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
				}

				if(this.procesoiessfondoreserva.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesoiessfondoreserva.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReserva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_numero_patronalProcesoIessFondoReservaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonumeropatronal=true;

			idTienePermisonumeropatronal=this.tienePermisosUsuarioEnPaginaWebProcesoIessFondoReserva(NumeroPatronalConstantesFunciones.CLASSNAME);

			if(idTienePermisonumeropatronal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessFondoReserva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessFondoReserva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.getprocesoiessfondoreserva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);

				this.numeropatronalBeanSwingJInternalFrame=new NumeroPatronalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.numeropatronalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.numeropatronalBeanSwingJInternalFrame.getNumeroPatronalLogic().setConnexion(this.procesoiessfondoreservaLogic.getConnexion());

				if(this.procesoiessfondoreserva.getid_numero_patronal()!=null) {
					this.numeropatronalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.numeropatronalBeanSwingJInternalFrame.setIdActual(this.procesoiessfondoreserva.getid_numero_patronal());
					this.numeropatronalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroPatronal();
				}

				JInternalFrameBase jinternalFrame =this.numeropatronalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessFondoReserva=(TitledBorder)this.jScrollPanelDatosProcesoIessFondoReserva.getBorder();
				TitledBorder titledBordernumeropatronal=(TitledBorder)this.numeropatronalBeanSwingJInternalFrame.jScrollPanelDatosNumeroPatronal.getBorder();

				titledBordernumeropatronal.setTitle(titledBorderProcesoIessFondoReserva.getTitle() + " -> Numero Patronal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_numero_patronalProcesoIessFondoReservaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.getprocesoiessfondoreserva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessfondoreserva==null) {
						this.procesoiessfondoreserva = new ProcesoIessFondoReserva();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);
				}

				if(this.procesoiessfondoreserva.getid_numero_patronal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_numero_patronal = "+this.procesoiessfondoreserva.getid_numero_patronal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessFondoReserva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);

			this.getProcesoIessFondoReservasBusquedaProcesoIessFondoReserva();

			this.inicializarActualizarBindingProcesoIessFondoReserva(false);

			//if(ProcesoIessFondoReservaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);

			this.getProcesoIessFondoReservasFK_IdAnio();

			this.inicializarActualizarBindingProcesoIessFondoReserva(false);

			//if(ProcesoIessFondoReservaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNumeroPatronalProcesoIessFondoReservaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);

			this.getProcesoIessFondoReservasFK_IdNumeroPatronal();

			this.inicializarActualizarBindingProcesoIessFondoReserva(false);

			//if(ProcesoIessFondoReservaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessfondoreservaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoIessFondoReserva() {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.dispose();
			this.jInternalFrameDetalleFormProcesoIessFondoReserva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
			this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.dispose();
			this.jInternalFrameReporteDinamicoProcesoIessFondoReserva=null;
		}
		
		if(this.jInternalFrameImportacionProcesoIessFondoReserva!=null) {
			this.jInternalFrameImportacionProcesoIessFondoReserva.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoIessFondoReserva.dispose();
			this.jInternalFrameImportacionProcesoIessFondoReserva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoIessFondoReserva();
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoIessFondoReserva")) {
				jButtonDuplicarProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoIessFondoReserva")) {
				jButtonCopiarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoIessFondoReserva")) {
				jButtonVerFormProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoIessFondoReserva")) {
				jButtonDuplicarProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoIessFondoReserva")) {
				jButtonDuplicarProcesoIessFondoReservaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoIessFondoReserva")) {
				jButtonModificarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoIessFondoReserva")) {
				jButtonModificarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoIessFondoReserva")) {
				jButtonModificarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoIessFondoReserva")) {
				jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoIessFondoReserva")) {
				jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoIessFondoReserva")) {
				jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoIessFondoReserva")) {
				jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoIessFondoReserva")) {
				jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoIessFondoReserva")) {
				jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoIessFondoReserva")) {
				jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoIessFondoReserva")) {
				jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoIessFondoReserva")) {
				jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoIessFondoReserva")) {
				jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoIessFondoReserva")) {
				jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoIessFondoReserva")) {
				jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoIessFondoReserva")) {
				jButtonMostrarOcultarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoIessFondoReserva")) {
				jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoIessFondoReserva")) {
				jButtonCopiarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoIessFondoReserva")) {
				jButtonVerFormProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoIessFondoReserva")) {
				jButtonCopiarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoIessFondoReserva")) {
				jButtonVerFormProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoIessFondoReserva")) {
				jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoIessFondoReserva")) {
				jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoIessFondoReserva")) {
				jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoIessFondoReserva")) {
				jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoIessFondoReserva")) {
				jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoIessFondoReserva")) {
				jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoIessFondoReserva")) {
				jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoIessFondoReserva")) {
				jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoIessFondoReserva")) {
				jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoIessFondoReserva") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoIessFondoReserva")) {
				jButtonAbrirOrderByProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoIessFondoReserva") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoIessFondoReserva")) {
				jButtonMostrarOcultarProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessFondoReserva")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoIessFondoReserva")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoIessFondoReserva")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoIessFondoReserva")) {
				jButtonProcesarInformacionProcesoIessFondoReservaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoIessFondoReserva")) {
				jButtonCerrarReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoIessFondoReserva")) {
				jButtonGenerarReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoIessFondoReserva")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoIessFondoReserva")) {
				jButtonCerrarImportacionProcesoIessFondoReservaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoIessFondoReserva")) {
				
				jButtonGenerarImportacionProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoIessFondoReserva")) {
				
				jButtonAbrirImportacionProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoIessFondoReserva")) {
				jComboBoxTiposAccionesProcesoIessFondoReservaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoIessFondoReserva")) {
				jComboBoxTiposRelacionesProcesoIessFondoReservaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoIessFondoReserva")) {
				jComboBoxTiposAccionesProcesoIessFondoReservaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoIessFondoReserva")) {
				
				jComboBoxTiposSeleccionarProcesoIessFondoReservaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoIessFondoReserva")) {
				jTextFieldValorCampoGeneralProcesoIessFondoReservaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoIessFondoReserva")) {
				jButtonAbrirOrderByProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoIessFondoReserva")) {
				jButtonAbrirOrderByProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoIessFondoReserva")) {
				jButtonCerrarOrderByProcesoIessFondoReservaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessFondoReservaBusqueda")) {
				this.jButtonidProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaUpdate")) {
				this.jButtonid_anioProcesoIessFondoReservaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaBusqueda")) {
				this.jButtonid_anioProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaUpdate")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoIessFondoReservaProcesoIessFondoReserva")) {
				this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReservaActionPerformed(evt);
			}
			
			;
			
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoIessFondoReserva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoIessFondoReserva procesoiessfondoreservaLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoiessfondoreservaLocal=this.procesoiessfondoreserva;
			} else {
				procesoiessfondoreservaLocal=this.procesoiessfondoreservaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
							
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
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
			
			


			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
								
						
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
								
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
							
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
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
			
			


			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
								
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoIessFondoReserva")) {
					jCheckBoxSeleccionarTodosProcesoIessFondoReservaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoIessFondoReserva")) {
					jCheckBoxSeleccionadosProcesoIessFondoReservaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoIessFondoReserva")) {
					
				}
				
				


				
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
												
				
				


				
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
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
			
			


			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessfondoreserva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessfondoreserva);
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
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
				
				


				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessFondoReserva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessFondoReserva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessFondoReservaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessfondoreservaAnterior =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoIessFondoReserva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoIessFondoReservaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoIessFondoReserva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoiessfondoreserva =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoiessfondoreserva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReserva")) {
				
				}
				
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoIessFondoReserva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoIessFondoReserva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReserva")) {
			
			}
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoIessFondoReserva();
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoIessFondoReserva")) {
				jButtonDuplicarProcesoIessFondoReservaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoIessFondoReserva")) {
				jButtonCopiarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoIessFondoReserva")) {
				jButtonVerFormProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoIessFondoReserva")) {
				jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoIessFondoReserva")) {
				jButtonModificarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoIessFondoReserva")) {
				jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoIessFondoReserva")) {
				jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoIessFondoReserva")) {
				jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoIessFondoReserva")) {
				jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoIessFondoReserva")) {
				jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessFondoReserva")) {
				jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoIessFondoReserva")) {
				jButtonAbrirOrderByProcesoIessFondoReservaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoIessFondoReserva")) {
				jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoIessFondoReserva")) {
				jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoIessFondoReserva")) {
				jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessFondoReservaBusqueda")) {
				this.jButtonidProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaUpdate")) {
				this.jButtonid_anioProcesoIessFondoReservaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessFondoReservaBusqueda")) {
				this.jButtonid_anioProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaUpdate")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessFondoReservaBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessFondoReservaBusquedaActionPerformed(evt);
			}
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoIessFondoReserva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoIessFondoReserva")) {
				closingInternalFrameProcesoIessFondoReserva();
				
			} else if(sTipo.equals("jButtonCancelarProcesoIessFondoReserva")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoIessFondoReserva = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoIessFondoReservaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessFondoReservaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessFondoReserva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoIessFondoReservaActionPerformed(null);
			}
			
			ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessfondoreserva,new Object(),this.procesoiessfondoreservaParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoIessFondoReserva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoIessFondoReserva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoIessFondoReserva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoiessfondoreserva)) {
			if(!esControlTabla) {
				if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);			
				}
				
				if(this.procesoiessfondoreservaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral,this.procesoiessfondoreservaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoiessfondoreservaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessFondoReserva(classes,this.procesoiessfondoreservaReturnGeneral,this.procesoiessfondoreservaBean,false);
					}
						
					if(this.procesoiessfondoreservaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva());	
					}
						
					if(this.procesoiessfondoreservaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva(),classes);//this.procesoiessfondoreservaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReserva(this.procesoiessfondoreserva,classes);//this.procesoiessfondoreservaBean);									
				}
			
				if(ProcesoIessFondoReservaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoIessFondoReserva(this.procesoiessfondoreserva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessFondoReserva(this.procesoiessfondoreserva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoiessfondoreservaAnterior!=null) {
						this.procesoiessfondoreserva=this.procesoiessfondoreservaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoiessfondoreservaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva(),procesoiessfondoreservaLogic.getProcesoIessFondoReservas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReserva(),this.procesoiessfondoreservas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoIessFondoReserva.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoIessFondoReserva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoIessFondoReserva();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoIessFondoReserva() throws Exception {
		
		ProcesoIessFondoReservaModel procesoiessfondoreservaModel=(ProcesoIessFondoReservaModel)this.jTableDatosProcesoIessFondoReserva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessfondoreservaModel.procesoiessfondoreservas=this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoiessfondoreservaModel.procesoiessfondoreservas=this.procesoiessfondoreservas;
		}
		
		
		((ProcesoIessFondoReservaModel) this.jTableDatosProcesoIessFondoReserva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoIessFondoReserva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoiessfondoreservaAnterior(),this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoiessfondoreservaAnterior(),this.procesoiessfondoreservas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoIessFondoReserva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
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
										
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessfondoreserva,new Object(),generalEntityParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoIessFondoReservaConstantesFunciones.getClassesRelationshipsOfProcesoIessFondoReserva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoIessFondoReservaConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoIessFondoReserva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoIessFondoReserva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessfondoreserva,new Object(),generalEntityParameterGeneral,this.procesoiessfondoreservaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoIessFondoReserva(ProcesoIessFondoReservaBean procesoiessfondoreservaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessFondoReserva(ArrayList<Classe> classes,ProcesoIessFondoReservaReturnGeneral procesoiessfondoreservaReturnGeneral,ProcesoIessFondoReservaBean procesoiessfondoreservaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoiessfondoreserva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva = new ProcesoIessFondoReservaDetalleFormJInternalFrame(jDesktopPane,this.procesoiessfondoreservaSessionBean.getConGuardarRelaciones(),this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.setVisible(false);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.procesoiessfondoreservaLogic=this.procesoiessfondoreservaLogic;
		
		this.cargarCombosFrameForeignKeyProcesoIessFondoReserva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessFondoReserva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessFondoReserva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoIessFondoReserva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoIessFondoReserva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessFondoReserva"));
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessFondoReserva"));

		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessFondoReserva"));
					
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemModificarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessFondoReserva"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessFondoReserva"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessFondoReserva"));
						
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemActualizarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessFondoReserva"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessFondoReserva"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessFondoReserva"));
								
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemEliminarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessFondoReserva"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessFondoReserva"));
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessFondoReserva"));
					
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemCancelarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessFondoReserva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemDetalleCerrarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessFondoReserva"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReserva"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReserva"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessFondoReserva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonidProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessFondoReserva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoIessFondoReserva"));
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessFondoReserva"));
		}
		
		this.jTableDatosProcesoIessFondoReserva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoIessFondoReserva"));
		
		this.jTableDatosProcesoIessFondoReserva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoIessFondoReserva"));
		
		this.jButtonNuevoProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"NuevoProcesoIessFondoReserva"));
		
		this.jButtonDuplicarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"DuplicarProcesoIessFondoReserva"));
		
		this.jButtonCopiarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"CopiarProcesoIessFondoReserva"));
		
		this.jButtonVerFormProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"VerFormProcesoIessFondoReserva"));
		
		
		this.jButtonNuevoToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoIessFondoReserva"));
			
		this.jButtonDuplicarToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemNuevoProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoIessFondoReserva"));
			
		this.jMenuItemDuplicarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoIessFondoReserva"));		
		
		
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoIessFondoReserva"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemNuevoRelacionesProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoIessFondoReserva"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessFondoReserva"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonModificarToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessFondoReserva"));
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemModificarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessFondoReserva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessFondoReserva"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonActualizarToolBarProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessFondoReserva"));
				
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemActualizarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessFondoReserva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessFondoReserva"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonEliminarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessFondoReserva"));
						
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemEliminarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessFondoReserva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessFondoReserva"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonCancelarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessFondoReserva"));
			
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemCancelarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessFondoReserva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoIessFondoReserva"));		
		
		
		this.jButtonCerrarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CerrarProcesoIessFondoReserva"));
		
		
		this.jButtonCerrarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemCerrarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoIessFondoReserva"));
			
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jMenuItemDetalleCerrarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessFondoReserva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoIessFondoReserva"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessFondoReserva"));
		}
		
		this.jButtonCopiarToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoIessFondoReserva"));
			
		this.jButtonVerFormToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoIessFondoReserva"));
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoIessFondoReserva"));
			
		this.jMenuItemCopiarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoIessFondoReserva"));		
		
		this.jMenuItemVerFormProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoIessFondoReserva"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessFondoReserva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessFondoReserva"));		
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoIessFondoReserva"));
					
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoIessFondoReserva"));
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoIessFondoReserva"));		
		
		
		
		this.jButtonAnterioresProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"AnterioresProcesoIessFondoReserva"));
		
		
		this.jButtonAnterioresToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoIessFondoReserva"));
		
		this.jMenuItemAnterioresProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoIessFondoReserva"));		
		
		
		this.jButtonSiguientesProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"SiguientesProcesoIessFondoReserva"));
		
		
		this.jButtonSiguientesToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemSiguientesProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoIessFondoReserva"));
			
		this.jMenuItemAbrirOrderByProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoIessFondoReserva"));
			
		this.jMenuItemMostrarOcultarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoIessFondoReserva"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoIessFondoReserva"));
			
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoIessFondoReserva"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoIessFondoReserva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoIessFondoReserva"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoIessFondoReserva"));		
		
		
		this.jButtonProcesarInformacionProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoIessFondoReserva"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoIessFondoReserva"));

		this.jCheckBoxSeleccionadosProcesoIessFondoReserva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoIessFondoReserva"));
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessFondoReserva"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoIessFondoReserva"));
			
		this.jComboBoxTiposAccionesProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoIessFondoReserva"));
					
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoIessFondoReserva"));
			
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoIessFondoReserva"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonidProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessFondoReservaProcesoIessFondoReserva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoIessFondoReserva!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReserva"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReserva"));
				this.jInternalFrameReporteDinamicoProcesoIessFondoReserva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReserva"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessFondoReserva"));				
			//this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessFondoReserva"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessFondoReserva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoIessFondoReserva!=null) {
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessFondoReserva"));
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessFondoReserva"));
				this.jInternalFrameImportacionProcesoIessFondoReserva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessFondoReserva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoIessFondoReserva"));
			
			this.jButtonAbrirOrderByToolBarProcesoIessFondoReserva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoIessFondoReserva"));			
			
			if(this.jInternalFrameOrderByProcesoIessFondoReserva!=null) {
				this.jInternalFrameOrderByProcesoIessFondoReserva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessFondoReserva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessFondoReserva.jTabbedPaneRelacionesProcesoIessFondoReserva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessFondoReserva"));
		
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
            		closingInternalFrameProcesoIessFondoReserva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoIessFondoReserva = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoIessFondoReservaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessFondoReservaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessFondoReserva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoIessFondoReservaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoIessFondoReserva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoIessFondoReservaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoIessFondoReserva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoIessFondoReserva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoIessFondoReserva";
		inputMap = this.jButtonNuevoRelacionesProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessFondoReservaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoIessFondoReserva";
		inputMap = this.jButtonModificarProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoIessFondoReserva";
		inputMap = this.jButtonActualizarProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoIessFondoReserva";
		inputMap = this.jButtonEliminarProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoIessFondoReserva";
		inputMap = this.jButtonCancelarProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoIessFondoReserva";
		inputMap = this.jButtonCerrarProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoIessFondoReserva";
		inputMap = this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonGuardarCambiosProcesoIessFondoReserva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReserva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoIessFondoReservaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoIessFondoReserva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoIessFondoReservaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoIessFondoReservaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoIessFondoReservaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonidProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_anioProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessFondoReservaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jButtonid_numero_patronalProcesoIessFondoReservaBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessFondoReservaBusqueda"));
		
		
		this.jButtonBusquedaProcesoIessFondoReservaProcesoIessFondoReserva.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessFondoReservaProcesoIessFondoReserva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoIessFondoReserva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoIessFondoReservaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoIessFondoReservaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoIessFondoReserva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoIessFondoReserva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
					procesoiessfondoreservaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservas) {
					procesoiessfondoreservaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoIessFondoReservaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
						procesoiessfondoreservaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservas) {
						procesoiessfondoreservaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReserva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessFondoReserva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoIessFondoReservaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoIessFondoReserva.getSelectedRows();
			
			ProcesoIessFondoReserva procesoiessfondoreservaLocal=new ProcesoIessFondoReserva();
			
			//this.seleccionarTodosProcesoIessFondoReserva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoiessfondoreservaLocal =(ProcesoIessFondoReserva) this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas().toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoiessfondoreservaLocal =(ProcesoIessFondoReserva) this.procesoiessfondoreservas.toArray()[this.jTableDatosProcesoIessFondoReserva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoiessfondoreservaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
						procesoiessfondoreservaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservas) {
						procesoiessfondoreservaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReserva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessFondoReserva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessFondoReserva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoIessFondoReservaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoIessFondoReservaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoIessFondoReservaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoIessFondoReserva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoIessFondoReservaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoIessFondoReserva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoIessFondoReserva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoIessFondoReserva) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoIessFondoReserva(conSplash);
				
					this.generarReporteProcesoIessFondoReservasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoIessFondoReservasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessFondoReservasSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessFondoReservasSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessFondoReserva();
				
				this.exportarProcesoIessFondoReservasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoIessFondoReservas();
				//this.importarProcesoIessFondoReservas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessFondoReserva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoIessFondoReservasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoIessFondoReserva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoIessFondoReserva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoIessFondoReserva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoIessFondoReservaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoIessFondoReserva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoIessFondoReserva(conSplash);
					
						//this.actualizarParametrosGeneralProcesoIessFondoReserva();
						
						this.generarReporteProcesoAccionProcesoIessFondoReservasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Iess Fondo ReservaS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Iess Fondo Reserva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoIessFondoReserva();
				
						this.actualizarParametrosGeneralProcesoIessFondoReserva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoiessfondoreservaReturnGeneral=procesoiessfondoreservaLogic.procesarAccionProcesoIessFondoReservasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas(),this.procesoiessfondoreservaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoIessFondoReservaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoIessFondoReserva();
					
					ProcesoIessFondoReservaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoIessFondoReservaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessFondoReserva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxTiposAccionesFormularioProcesoIessFondoReserva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoIessFondoReserva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoIessFondoReservaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoIessFondoReserva();
			
			if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
			ProcesoIessFondoReserva procesoiessfondoreserva=new ProcesoIessFondoReserva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoIessFondoReserva.getSelectedItem();
			
			
			
			
			procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoiessfondoreservasSeleccionados.size()==1) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
					procesoiessfondoreserva=procesoiessfondoreservaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoIessFondoReserva();
			
      		//this.finishProcessProcesoIessFondoReserva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoIessFondoReservaReturnGeneral() throws Exception {
		if(this.procesoiessfondoreservaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoiessfondoreservaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoiessfondoreservaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoiessfondoreservaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoiessfondoreservaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoiessfondoreservaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
		}
		
		if(this.procesoiessfondoreservaReturnGeneral.getConRetornoLista() || this.procesoiessfondoreservaReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoiessfondoreservaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoiessfondoreservaLogic.setProcesoIessFondoReservas(this.procesoiessfondoreservaReturnGeneral.getProcesoIessFondoReservas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoIessFondoReserva(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoIessFondoReserva() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoIessFondoReserva> getProcesoIessFondoReservasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoIessFondoReserva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservaLogic.getProcesoIessFondoReservas()) {
					if(procesoiessfondoreservaAux.getIsSelected()) {
						procesoiessfondoreservasSeleccionados.add(procesoiessfondoreservaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessFondoReserva procesoiessfondoreservaAux:this.procesoiessfondoreservas) {
					if(procesoiessfondoreservaAux.getIsSelected()) {
						procesoiessfondoreservasSeleccionados.add(procesoiessfondoreservaAux);				
					}
				}
			}
			
			if(procesoiessfondoreservasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoiessfondoreservasSeleccionados.addAll(this.procesoiessfondoreservaLogic.getProcesoIessFondoReservas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoiessfondoreservasSeleccionados.addAll(this.procesoiessfondoreservas);				
					}
				}
			}
		} else {
			procesoiessfondoreservasSeleccionados.add(this.procesoiessfondoreserva);
		}
		
		return procesoiessfondoreservasSeleccionados;
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
	
	public void generarReporteProcesoIessFondoReservasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoIessFondoReservasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoIessFondoReservasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessFondoReservasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessFondoReservasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Iess Fondo Reserva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoIessFondoReservasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoIessFondoReserva();
		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoIessFondoReserva();
		
		
		//this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados ,procesoiessfondoreservaImplementable,procesoiessfondoreservaImplementableHome);
	}
	
	public void mostrarImportacionProcesoIessFondoReservas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoIessFondoReserva();
		
		this.abrirFrameImportacionProcesoIessFondoReserva();		
		
			
		//this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados ,procesoiessfondoreservaImplementable,procesoiessfondoreservaImplementableHome);
	}
	
	public void importarProcesoIessFondoReservas() throws Exception {		
	
	}
	
	public void exportarProcesoIessFondoReservasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoIessFondoReservasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoIessFondoReservasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoIessFondoReservasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Iess Fondo Reserva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoIessFondoReserva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoIessFondoReserva(procesoiessfondoreservaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoiessfondoreservaAux.setsDetalleGeneralEntityReporte(procesoiessfondoreservaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoIessFondoReserva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoIessFondoReservaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoiessfondoreserva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreserva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreserva.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessfondoreserva.getnumeropatronal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoIessFondoReservas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoIessFondoReserva(row);				
				iRow++;
			}				
			
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoIessFondoReserva(procesoiessfondoreservaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoIessFondoReservasSeleccionados() throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();		
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessfondoreserva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoiessfondoreservas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoiessfondoreserva");
			//elementRoot.appendChild(element);
		
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
				element = document.createElement("procesoiessfondoreserva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoIessFondoReserva(procesoiessfondoreservaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Fondo Reserva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoIessFondoReserva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreserva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreserva.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessfondoreserva.getnumeropatronal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlProcesoIessFondoReserva(ProcesoIessFondoReserva procesoiessfondoreserva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoIessFondoReservaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoiessfondoreserva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoIessFondoReservaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoiessfondoreserva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoIessFondoReservaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesoiessfondoreserva.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementnumeropatronal_descripcion = document.createElement(ProcesoIessFondoReservaConstantesFunciones.IDNUMEROPATRONAL);
		elementnumeropatronal_descripcion.appendChild(document.createTextNode(procesoiessfondoreserva.getnumeropatronal_descripcion()));
		element.appendChild(elementnumeropatronal_descripcion);
	}
	
	public void generarReporteGroupGenericoProcesoIessFondoReservasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados=new ArrayList<ProcesoIessFondoReserva>();
		
		procesoiessfondoreservasSeleccionados=this.getProcesoIessFondoReservasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoIessFondoReserva(procesoiessfondoreservasSeleccionados);
		
		this.generarReporteProcesoIessFondoReservas("Todos",procesoiessfondoreservasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoIessFondoReserva(ArrayList<ProcesoIessFondoReserva> procesoiessfondoreservasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoIessFondoReserva procesoiessfondoreservaAux:procesoiessfondoreservasSeleccionados) {
				procesoiessfondoreservaAux.setsDetalleGeneralEntityReporte(procesoiessfondoreservaAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesoiessfondoreservaAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessFondoReservaConstantesFunciones.LABEL_IDNUMEROPATRONAL)) {
					existe=true;
					procesoiessfondoreservaAux.setsDescripcionGeneralEntityReporte1(procesoiessfondoreservaAux.getnumeropatronal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessFondoReservaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoIessFondoReserva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaModificarProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoIessFondoReservaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=true;
		} else {
			this.actualizarEstadoPanelsProcesoIessFondoReserva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoIessFondoReserva=false;
			//this.isVisibilidadCeldaVerFormProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaDuplicarProcesoIessFondoReserva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			if(!procesoiessfondoreservaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;												
			}
			
			this.jButtonCerrarProcesoIessFondoReserva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoiessfondoreserva)) {
			this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
			this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoIessFondoReserva=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessFondoReserva=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoIessFondoReserva=false;
		//this.isVisibilidadCeldaModificarProcesoIessFondoReserva=true;
		this.isVisibilidadCeldaActualizarProcesoIessFondoReserva=false;
		this.isVisibilidadCeldaEliminarProcesoIessFondoReserva=false;
		//this.isVisibilidadCeldaCancelarProcesoIessFondoReserva=true;			
		this.isVisibilidadCeldaGuardarProcesoIessFondoReserva=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessFondoReserva() {
	}
	
	public void actualizarEstadoPanelsProcesoIessFondoReserva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosEdicionProcesoIessFondoReserva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessFondoReserva!=null) {
				this.jScrollPanelDatosProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessFondoReserva!=null) {
				this.jPanelPaginacionProcesoIessFondoReserva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
					this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoiessfondoreservaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessFondoReserva!=null) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoIessFondoReserva!=null) {
				this.jPanelParametrosReportesProcesoIessFondoReserva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoIessFondoReserva=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReserva) {this.jTabbedPaneBusquedasProcesoIessFondoReserva.remove(jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);}
		}
		
	}

	public void setVisibilidadBusquedasParaNumeroPatronal(Boolean isParaNumeroPatronal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNumeroPatronalNegation=!isParaNumeroPatronal;

			this.isVisibilidadBusquedaProcesoIessFondoReserva=isParaNumeroPatronal;
			if(!this.isVisibilidadBusquedaProcesoIessFondoReserva) {this.jTabbedPaneBusquedasProcesoIessFondoReserva.remove(jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);}
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
			
			this.inicializarActualizarBindingTablaProcesoIessFondoReserva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoIessFondoReserva() {
		this.updateBorderResaltarBusquedasFormularioProcesoIessFondoReserva();
		this.updateVisibilidadBusquedasFormularioProcesoIessFondoReserva();
		this.updateHabilitarBusquedasFormularioProcesoIessFondoReserva();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoIessFondoReserva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponents().length>0) {
	

		if(this.procesoiessfondoreservaConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva!=null) {
			index= this.jTabbedPaneBusquedasProcesoIessFondoReserva.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponent(index);
				jPanel.setBorder(this.procesoiessfondoreservaConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoIessFondoReserva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessFondoReserva.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostrarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			if(!this.procesoiessfondoreservaConstantesFunciones.mostrarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva && index>-1) {
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoIessFondoReserva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessFondoReserva.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoiessfondoreservaConstantesFunciones.activarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
				this.jTabbedPaneBusquedasProcesoIessFondoReserva.setEnabledAt(index,this.procesoiessfondoreservaConstantesFunciones.activarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoIessFondoReserva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoIessFondoReserva")) {
			index= this.jTabbedPaneBusquedasProcesoIessFondoReserva.indexOfComponent(this.jPanelBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);

			this.jTabbedPaneBusquedasProcesoIessFondoReserva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessFondoReserva.getComponent(index);

			this.procesoiessfondoreservaConstantesFunciones.setResaltarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva(resaltar);

			jPanel.setBorder(this.procesoiessfondoreservaConstantesFunciones.resaltarBusquedaProcesoIessFondoReservaProcesoIessFondoReserva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoIessFondoReserva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoIessFondoReserva() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoIessFondoReserva();
		this.updateVisibilidadResaltarControlesFormularioProcesoIessFondoReserva();
		this.updateHabilitarResaltarControlesFormularioProcesoIessFondoReserva();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoIessFondoReserva() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoiessfondoreservaConstantesFunciones.resaltaridProcesoIessFondoReserva!=null && this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setBorder(this.procesoiessfondoreservaConstantesFunciones.resaltaridProcesoIessFondoReserva);}
		if(this.procesoiessfondoreservaConstantesFunciones.resaltarid_anioProcesoIessFondoReserva!=null && this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setBorder(this.procesoiessfondoreservaConstantesFunciones.resaltarid_anioProcesoIessFondoReserva);}
		if(this.procesoiessfondoreservaConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReserva!=null && this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setBorder(this.procesoiessfondoreservaConstantesFunciones.resaltarid_numero_patronalProcesoIessFondoReserva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoIessFondoReserva() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
	
		//this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostraridProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelidProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostraridProcesoIessFondoReserva);
		//this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostrarid_anioProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelid_anioProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostrarid_anioProcesoIessFondoReserva);
		//this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jPanelid_numero_patronalProcesoIessFondoReserva.setVisible(this.procesoiessfondoreservaConstantesFunciones.mostrarid_numero_patronalProcesoIessFondoReserva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoIessFondoReserva() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessFondoReserva!=null) {
	
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jLabelidProcesoIessFondoReserva.setEnabled(this.procesoiessfondoreservaConstantesFunciones.activaridProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_anioProcesoIessFondoReserva.setEnabled(this.procesoiessfondoreservaConstantesFunciones.activarid_anioProcesoIessFondoReserva);
		this.jInternalFrameDetalleFormProcesoIessFondoReserva.jComboBoxid_numero_patronalProcesoIessFondoReserva.setEnabled(this.procesoiessfondoreservaConstantesFunciones.activarid_numero_patronalProcesoIessFondoReserva);
		}
	}
	
		
}