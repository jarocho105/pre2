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

//import com.bydan.erp.nomina.util.ProcesoIessAportesConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoIessAportesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoIessAportesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoIessAportesBean;
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
public class ProcesoIessAportesBeanSwingJInternalFrame extends ProcesoIessAportesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoIessAportesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoIessAportes> procesoiessaportesValidator = new ClassValidator<ProcesoIessAportes>(ProcesoIessAportes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoIessAportes procesoiessaportes;	
	public ProcesoIessAportes procesoiessaportesAux;
	public ProcesoIessAportes procesoiessaportesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoIessAportes procesoiessaportesTotales;
	public Long idProcesoIessAportesActual;
	public Long iIdNuevoProcesoIessAportes=0L;
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

	public String sFinalQueryComboTipoAfiliacion="";

	public List<TipoAfiliacion> tipoafiliacionsForeignKey;

	public List<TipoAfiliacion> gettipoafiliacionsForeignKey() {
		return tipoafiliacionsForeignKey;
	}

	public void settipoafiliacionsForeignKey(List<TipoAfiliacion> tipoafiliacionsForeignKey) {
		this.tipoafiliacionsForeignKey = tipoafiliacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoAfiliacion tipoafiliacionForeignKey;

	public TipoAfiliacion gettipoafiliacionForeignKey() {
		return tipoafiliacionForeignKey;
	}

	public void settipoafiliacionForeignKey(TipoAfiliacion tipoafiliacionForeignKey) {
		this.tipoafiliacionForeignKey = tipoafiliacionForeignKey;
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
	
	public Boolean isPermisoTodoProcesoIessAportes;
	public Boolean isPermisoNuevoProcesoIessAportes;
	public Boolean isPermisoActualizarProcesoIessAportes;
	public Boolean isPermisoActualizarOriginalProcesoIessAportes;
	public Boolean isPermisoEliminarProcesoIessAportes;
	public Boolean isPermisoGuardarCambiosProcesoIessAportes;
	public Boolean isPermisoConsultaProcesoIessAportes;
	public Boolean isPermisoBusquedaProcesoIessAportes;
	public Boolean isPermisoReporteProcesoIessAportes;
	public Boolean isPermisoPaginacionMedioProcesoIessAportes;
	public Boolean isPermisoPaginacionAltoProcesoIessAportes;
	public Boolean isPermisoPaginacionTodoProcesoIessAportes;
	public Boolean isPermisoCopiarProcesoIessAportes;
	public Boolean isPermisoVerFormProcesoIessAportes;
	public Boolean isPermisoDuplicarProcesoIessAportes;
	public Boolean isPermisoOrdenProcesoIessAportes;
	
	
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
	
	public ProcesoIessAportesParameterReturnGeneral procesoiessaportesReturnGeneral;
	public ProcesoIessAportesParameterReturnGeneral procesoiessaportesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoIessAportes=false;
	public Boolean esParaAccionDesdeFormularioProcesoIessAportes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoIessAportesSessionBeanAdditional procesoiessaportesSessionBeanAdditional=null;
	
	public ProcesoIessAportesSessionBeanAdditional getProcesoIessAportesSessionBeanAdditional() {
		return this.procesoiessaportesSessionBeanAdditional;
	}
	
	public void setProcesoIessAportesSessionBeanAdditional(ProcesoIessAportesSessionBeanAdditional procesoiessaportesSessionBeanAdditional) {
		try {
			this.procesoiessaportesSessionBeanAdditional=procesoiessaportesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoIessAportesBeanSwingJInternalFrameAdditional procesoiessaportesBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoIessAportesBeanSwingJInternalFrame
	
	public ProcesoIessAportesBeanSwingJInternalFrameAdditional getProcesoIessAportesBeanSwingJInternalFrameAdditional() {
		return this.procesoiessaportesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoIessAportesBeanSwingJInternalFrameAdditional(ProcesoIessAportesBeanSwingJInternalFrameAdditional procesoiessaportesBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoiessaportesBeanSwingJInternalFrameAdditional=procesoiessaportesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoIessAportesLogic procesoiessaportesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoIessAportes procesoiessaportesBean;
	public ProcesoIessAportesConstantesFunciones procesoiessaportesConstantesFunciones;
	//public ProcesoIessAportesParameterReturnGeneral procesoiessaportesReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public TipoAfiliacionLogic tipoafiliacionLogic;
	public NumeroPatronalLogic numeropatronalLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoIessAportes> procesoiessaportess;	
	//public List<ProcesoIessAportes> procesoiessaportessEliminados;
	//public List<ProcesoIessAportes> procesoiessaportessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoIessAportes=true;
	public Boolean isVisibilidadCeldaCopiarProcesoIessAportes=true;
	public Boolean isVisibilidadCeldaVerFormProcesoIessAportes=true;
	public Boolean isVisibilidadCeldaOrdenProcesoIessAportes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaModificarProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaActualizarProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaEliminarProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaCancelarProcesoIessAportes=false;
	public Boolean isVisibilidadCeldaGuardarProcesoIessAportes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoIessAportes=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdNumeroPatronal=false;
	public Boolean isVisibilidadFK_IdTipoAfiliacion=false;
	
	public Long getiIdNuevoProcesoIessAportes() {
		return this.iIdNuevoProcesoIessAportes;
	}

	public void setiIdNuevoProcesoIessAportes(Long iIdNuevoProcesoIessAportes) {
		this.iIdNuevoProcesoIessAportes = iIdNuevoProcesoIessAportes;
	}
	
	public Long getidProcesoIessAportesActual() {
		return this.idProcesoIessAportesActual;
	}

	public void setidProcesoIessAportesActual(Long idProcesoIessAportesActual) {
		this.idProcesoIessAportesActual = idProcesoIessAportesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoIessAportes getprocesoiessaportes() {
		return this.procesoiessaportes;
	}

	public void setprocesoiessaportes(ProcesoIessAportes procesoiessaportes) {
		this.procesoiessaportes = procesoiessaportes;
	}
	
	public ProcesoIessAportes getprocesoiessaportesAux() {
		return this.procesoiessaportesAux;
	}

	public void setprocesoiessaportesAux(ProcesoIessAportes procesoiessaportesAux) {
		this.procesoiessaportesAux = procesoiessaportesAux;
	}				
	
	public ProcesoIessAportes getprocesoiessaportesAnterior() {
		return this.procesoiessaportesAnterior;
	}

	public void setprocesoiessaportesAnterior(ProcesoIessAportes procesoiessaportesAnterior) {
		this.procesoiessaportesAnterior = procesoiessaportesAnterior;
	}	
	
	public ProcesoIessAportes getprocesoiessaportesTotales() {
		return this.procesoiessaportesTotales;
	}

	public void setprocesoiessaportesTotales(ProcesoIessAportes procesoiessaportesTotales) {
		this.procesoiessaportesTotales = procesoiessaportesTotales;
	}	
	
	public ProcesoIessAportes getprocesoiessaportesBean() {
		return this.procesoiessaportesBean;
	}

	public void setprocesoiessaportesBean(ProcesoIessAportes procesoiessaportesBean) {
		this.procesoiessaportesBean = procesoiessaportesBean;
	}	
	
	public ProcesoIessAportesParameterReturnGeneral getprocesoiessaportesReturnGeneral() {
		return this.procesoiessaportesReturnGeneral;
	}

	public void setprocesoiessaportesReturnGeneral(ProcesoIessAportesParameterReturnGeneral procesoiessaportesReturnGeneral) {
		this.procesoiessaportesReturnGeneral = procesoiessaportesReturnGeneral;
	}	
	
	
	public Long id_anioBusquedaProcesoIessAportes=null;

	public Long getid_anioBusquedaProcesoIessAportes() {
		return this.id_anioBusquedaProcesoIessAportes;
	}

	public void setid_anioBusquedaProcesoIessAportes(Long id_anioBusquedaProcesoIessAportes) {
		this.id_anioBusquedaProcesoIessAportes = id_anioBusquedaProcesoIessAportes;
	}

;
	public Long id_mesBusquedaProcesoIessAportes=null;

	public Long getid_mesBusquedaProcesoIessAportes() {
		return this.id_mesBusquedaProcesoIessAportes;
	}

	public void setid_mesBusquedaProcesoIessAportes(Long id_mesBusquedaProcesoIessAportes) {
		this.id_mesBusquedaProcesoIessAportes = id_mesBusquedaProcesoIessAportes;
	}

;
	public Long id_tipo_afiliacionBusquedaProcesoIessAportes=-1L;

	public Long getid_tipo_afiliacionBusquedaProcesoIessAportes() {
		return this.id_tipo_afiliacionBusquedaProcesoIessAportes;
	}

	public void setid_tipo_afiliacionBusquedaProcesoIessAportes(Long id_tipo_afiliacionBusquedaProcesoIessAportes) {
		this.id_tipo_afiliacionBusquedaProcesoIessAportes = id_tipo_afiliacionBusquedaProcesoIessAportes;
	}

;
	public Long id_numero_patronalBusquedaProcesoIessAportes=-1L;

	public Long getid_numero_patronalBusquedaProcesoIessAportes() {
		return this.id_numero_patronalBusquedaProcesoIessAportes;
	}

	public void setid_numero_patronalBusquedaProcesoIessAportes(Long id_numero_patronalBusquedaProcesoIessAportes) {
		this.id_numero_patronalBusquedaProcesoIessAportes = id_numero_patronalBusquedaProcesoIessAportes;
	}

;
	public Double porcentajeBusquedaProcesoIessAportes=0.0;

	public Double getporcentajeBusquedaProcesoIessAportes() {
		return this.porcentajeBusquedaProcesoIessAportes;
	}

	public void setporcentajeBusquedaProcesoIessAportes(Double porcentajeBusquedaProcesoIessAportes) {
		this.porcentajeBusquedaProcesoIessAportes = porcentajeBusquedaProcesoIessAportes;
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

	public Long id_tipo_afiliacionFK_IdTipoAfiliacion=-1L;

	public Long getid_tipo_afiliacionFK_IdTipoAfiliacion() {
		return this.id_tipo_afiliacionFK_IdTipoAfiliacion;
	}

	public void setid_tipo_afiliacionFK_IdTipoAfiliacion(Long id_tipo_afiliacionFK_IdTipoAfiliacion) {
		this.id_tipo_afiliacionFK_IdTipoAfiliacion = id_tipo_afiliacionFK_IdTipoAfiliacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoIessAportesLogic getProcesoIessAportesLogic()	{		
		return procesoiessaportesLogic;
	}

	public void setProcesoIessAportesLogic(ProcesoIessAportesLogic procesoiessaportesLogic) {
		this.procesoiessaportesLogic = procesoiessaportesLogic;
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
	
	public Boolean getIsEsNuevoProcesoIessAportes() {
		return isEsNuevoProcesoIessAportes;
	}

	public void setIsEsNuevoProcesoIessAportes(Boolean isEsNuevoProcesoIessAportes) {
		this.isEsNuevoProcesoIessAportes = isEsNuevoProcesoIessAportes;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoIessAportes() {
		return esParaAccionDesdeFormularioProcesoIessAportes;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoIessAportes(Boolean esParaAccionDesdeFormularioProcesoIessAportes) {
		this.esParaAccionDesdeFormularioProcesoIessAportes = esParaAccionDesdeFormularioProcesoIessAportes;
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

			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			}

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(procesoiessaportesSessionBean.getlidAnioActual());
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

			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			}

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(procesoiessaportesSessionBean.getlidMesActual());
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

	public void cargarCombosTipoAfiliacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoafiliacionsForeignKey=new ArrayList<TipoAfiliacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoAfiliacionLogic tipoafiliacionLogic=new TipoAfiliacionLogic();

			tipoafiliacionLogic.getTipoAfiliacionDataAccess().setIsForForeingKeyData(true);

			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			}

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionTipoAfiliacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLogic.getTipoAfiliacionDataAccess().setIsForForeingKeyData(true);

					tipoafiliacionLogic.getTodosTipoAfiliacionsWithConnection(sFinalQuery,new Pagination());

					this.tipoafiliacionsForeignKey=tipoafiliacionLogic.getTipoAfiliacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoAfiliacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoafiliacionLogic.getEntityWithConnection(procesoiessaportesSessionBean.getlidTipoAfiliacionActual());
					this.tipoafiliacionsForeignKey.add(tipoafiliacionLogic.getTipoAfiliacion());
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

			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			}

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
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
					numeropatronalLogic.getEntityWithConnection(procesoiessaportesSessionBean.getlidNumeroPatronalActual());
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

					if(this.procesoiessaportes!=null) {
						this.procesoiessaportes.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioProcesoIessAportes.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes!=null) {
						jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes!=null) {
							//jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.getItemCount()>0) {
								jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioProcesoIessAportesGenerico)throws Exception
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
				jComboBoxid_anioProcesoIessAportesGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioProcesoIessAportesGenerico!=null && jComboBoxid_anioProcesoIessAportesGenerico.getItemCount()>0) {
					jComboBoxid_anioProcesoIessAportesGenerico.setSelectedIndex(0);
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

					if(this.procesoiessaportes!=null) {
						this.procesoiessaportes.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesProcesoIessAportes.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes!=null) {
						jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes!=null) {
							//jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.getItemCount()>0) {
								jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesProcesoIessAportesGenerico)throws Exception
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
				jComboBoxid_mesProcesoIessAportesGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesProcesoIessAportesGenerico!=null && jComboBoxid_mesProcesoIessAportesGenerico.getItemCount()>0) {
					jComboBoxid_mesProcesoIessAportesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoAfiliacionForeignKey(Long idTipoAfiliacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoAfiliacion  tipoafiliacionTemp=null;

			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsForeignKey) {
				if(tipoafiliacionAux.getId()!=null && tipoafiliacionAux.getId().equals(idTipoAfiliacionSeleccionado)) {
					tipoafiliacionTemp=tipoafiliacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoafiliacionTemp!=null) {

					if(this.procesoiessaportes!=null) {
						this.procesoiessaportes.setTipoAfiliacion(tipoafiliacionTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedItem(tipoafiliacionTemp);
					}
				} else {
					//jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedItem(tipoafiliacionTemp);
					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoafiliacionTemp!=null && jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes!=null) {
						jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(tipoafiliacionTemp);
					} else {
						if(jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes!=null) {
							//jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(tipoafiliacionTemp);
							if(jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.getItemCount()>0) {
								jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(0);
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

	public String getActualTipoAfiliacionForeignKeyDescripcion(Long idTipoAfiliacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoAfiliacion  tipoafiliacionTemp=null;

			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsForeignKey) {
				if(tipoafiliacionAux.getId()!=null && tipoafiliacionAux.getId().equals(idTipoAfiliacionSeleccionado)) {
					tipoafiliacionTemp=tipoafiliacionAux;
					break;
				}
			}


			sDescripcion=TipoAfiliacionConstantesFunciones.getTipoAfiliacionDescripcion(tipoafiliacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoAfiliacionForeignKeyGenerico(Long idTipoAfiliacionSeleccionado,JComboBox jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico)throws Exception
	{
		try
		{
			TipoAfiliacion  tipoafiliacionTemp=null;

			for(TipoAfiliacion tipoafiliacionAux:tipoafiliacionsForeignKey) {
				if(tipoafiliacionAux.getId()!=null && tipoafiliacionAux.getId().equals(idTipoAfiliacionSeleccionado)) {
					tipoafiliacionTemp=tipoafiliacionAux;
					break;
				}
			}

			if(tipoafiliacionTemp!=null) {
				jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico.setSelectedItem(tipoafiliacionTemp);
			} else {
				if(jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico!=null && jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico.setSelectedIndex(0);
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

					if(this.procesoiessaportes!=null) {
						this.procesoiessaportes.setNumeroPatronal(numeropatronalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setSelectedItem(numeropatronalTemp);
					}
				} else {
					//jComboBoxid_numero_patronalProcesoIessAportes.setSelectedItem(numeropatronalTemp);
					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
						if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){
					if(numeropatronalTemp!=null && jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes!=null) {
						jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(numeropatronalTemp);
					} else {
						if(jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes!=null) {
							//jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(numeropatronalTemp);
							if(jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.getItemCount()>0) {
								jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(0);
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
	public void setActualNumeroPatronalForeignKeyGenerico(Long idNumeroPatronalSeleccionado,JComboBox jComboBoxid_numero_patronalProcesoIessAportesGenerico)throws Exception
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
				jComboBoxid_numero_patronalProcesoIessAportesGenerico.setSelectedItem(numeropatronalTemp);
			} else {
				if(jComboBoxid_numero_patronalProcesoIessAportesGenerico!=null && jComboBoxid_numero_patronalProcesoIessAportesGenerico.getItemCount()>0) {
					jComboBoxid_numero_patronalProcesoIessAportesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(ProcesoIessAportes procesoiessaportes,JComboBox jComboBoxid_anioProcesoIessAportesGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioProcesoIessAportesGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioProcesoIessAportesGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				procesoiessaportes.setid_anio(anioAux.getId());
				procesoiessaportes.setanio_descripcion(ProcesoIessAportesConstantesFunciones.getAnioDescripcion(anioAux));
				procesoiessaportes.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(ProcesoIessAportes procesoiessaportes,JComboBox jComboBoxid_mesProcesoIessAportesGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesProcesoIessAportesGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesProcesoIessAportesGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				procesoiessaportes.setid_mes(mesAux.getId());
				procesoiessaportes.setmes_descripcion(ProcesoIessAportesConstantesFunciones.getMesDescripcion(mesAux));
				procesoiessaportes.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAfiliacionForeignKey(ProcesoIessAportes procesoiessaportes,JComboBox jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico)throws Exception
	{
		try
		{
			TipoAfiliacion  tipoafiliacionAux=new TipoAfiliacion();

			if(jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico==null) {
				tipoafiliacionAux=(TipoAfiliacion)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.getSelectedItem();
			} else {
				tipoafiliacionAux=(TipoAfiliacion)jComboBoxid_tipo_afiliacionProcesoIessAportesGenerico.getSelectedItem();
			}

			if(tipoafiliacionAux!=null && tipoafiliacionAux.getId()!=null) {
				procesoiessaportes.setid_tipo_afiliacion(tipoafiliacionAux.getId());
				procesoiessaportes.settipoafiliacion_descripcion(ProcesoIessAportesConstantesFunciones.getTipoAfiliacionDescripcion(tipoafiliacionAux));
				procesoiessaportes.setTipoAfiliacion(tipoafiliacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNumeroPatronalForeignKey(ProcesoIessAportes procesoiessaportes,JComboBox jComboBoxid_numero_patronalProcesoIessAportesGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalAux=new NumeroPatronal();

			if(jComboBoxid_numero_patronalProcesoIessAportesGenerico==null) {
				numeropatronalAux=(NumeroPatronal)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.getSelectedItem();
			} else {
				numeropatronalAux=(NumeroPatronal)jComboBoxid_numero_patronalProcesoIessAportesGenerico.getSelectedItem();
			}

			if(numeropatronalAux!=null && numeropatronalAux.getId()!=null) {
				procesoiessaportes.setid_numero_patronal(numeropatronalAux.getId());
				procesoiessaportes.setnumeropatronal_descripcion(ProcesoIessAportesConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalAux));
				procesoiessaportes.setNumeroPatronal(numeropatronalAux);			}
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

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
					}

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.addItem(anio);
							}
						}

						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
					}

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.addItem(mes);
							}
						}

						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoAfiliacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoAfiliacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.removeAllItems();

							for(TipoAfiliacion tipoafiliacion:this.tipoafiliacionsForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.addItem(tipoafiliacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
					}

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.removeAllItems();

							for(TipoAfiliacion tipoafiliacion:this.tipoafiliacionsForeignKey) {
								this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.addItem(tipoafiliacion);
							}
						}

						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.addItem(numeropatronal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { 
					}

					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoIessAportes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.addItem(numeropatronal);
							}
						}

						if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoAfiliacionForeignKey(TipoAfiliacion tipoafiliacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedItem(tipoafiliacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(tipoafiliacion);
						} else {
							this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setSelectedItem(numeropatronal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setSelectedItem(numeropatronal);
						} else {
							this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoIessAportes() throws Exception {
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
		
	public ProcesoIessAportesParameterReturnGeneral getProcesoIessAportesParameterGeneral() {
		return this.procesoiessaportesParameterGeneral;
	}
	
	public void setProcesoIessAportesParameterGeneral(ProcesoIessAportesParameterReturnGeneral procesoiessaportesParameterGeneral) {
		this.procesoiessaportesParameterGeneral = procesoiessaportesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoIessAportes() {
		return isPermisoTodoProcesoIessAportes;
	}

	public void setIsPermisoTodoProcesoIessAportes(Boolean isPermisoTodoProcesoIessAportes) {
		this.isPermisoTodoProcesoIessAportes = isPermisoTodoProcesoIessAportes;
	}

	public Boolean getIsPermisoNuevoProcesoIessAportes() {
		return isPermisoNuevoProcesoIessAportes;
	}

	public void setIsPermisoNuevoProcesoIessAportes(Boolean isPermisoNuevoProcesoIessAportes) {
		this.isPermisoNuevoProcesoIessAportes = isPermisoNuevoProcesoIessAportes;
	}

	public Boolean getIsPermisoActualizarProcesoIessAportes() {
		return isPermisoActualizarProcesoIessAportes;
	}

	public void setIsPermisoActualizarProcesoIessAportes(Boolean isPermisoActualizarProcesoIessAportes) {
		this.isPermisoActualizarProcesoIessAportes = isPermisoActualizarProcesoIessAportes;
	}

	public Boolean getIsPermisoEliminarProcesoIessAportes() {
		return isPermisoEliminarProcesoIessAportes;
	}

	public void setIsPermisoEliminarProcesoIessAportes(Boolean isPermisoEliminarProcesoIessAportes) {
		this.isPermisoEliminarProcesoIessAportes = isPermisoEliminarProcesoIessAportes;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoIessAportes() {
		return isPermisoGuardarCambiosProcesoIessAportes;
	}

	public void setIsPermisoGuardarCambiosProcesoIessAportes(Boolean isPermisoGuardarCambiosProcesoIessAportes) {
		this.isPermisoGuardarCambiosProcesoIessAportes = isPermisoGuardarCambiosProcesoIessAportes;
	}
	
	public Boolean getIsPermisoConsultaProcesoIessAportes() {
		return isPermisoConsultaProcesoIessAportes;
	}

	public void setIsPermisoConsultaProcesoIessAportes(Boolean isPermisoConsultaProcesoIessAportes) {
		this.isPermisoConsultaProcesoIessAportes = isPermisoConsultaProcesoIessAportes;
	}

	public Boolean getIsPermisoBusquedaProcesoIessAportes() {
		return isPermisoBusquedaProcesoIessAportes;
	}

	public void setIsPermisoBusquedaProcesoIessAportes(Boolean isPermisoBusquedaProcesoIessAportes) {
		this.isPermisoBusquedaProcesoIessAportes = isPermisoBusquedaProcesoIessAportes;
	}

	public Boolean getIsPermisoReporteProcesoIessAportes() {
		return isPermisoReporteProcesoIessAportes;
	}

	public void setIsPermisoReporteProcesoIessAportes(Boolean isPermisoReporteProcesoIessAportes) {
		this.isPermisoReporteProcesoIessAportes = isPermisoReporteProcesoIessAportes;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoIessAportes() {
		return isPermisoPaginacionMedioProcesoIessAportes;
	}

	public void setIsPermisoPaginacionMedioProcesoIessAportes(Boolean isPermisoPaginacionMedioProcesoIessAportes) {
		this.isPermisoPaginacionMedioProcesoIessAportes = isPermisoPaginacionMedioProcesoIessAportes;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoIessAportes() {
		return isPermisoPaginacionTodoProcesoIessAportes;
	}

	public void setIsPermisoPaginacionTodoProcesoIessAportes(Boolean isPermisoPaginacionTodoProcesoIessAportes) {
		this.isPermisoPaginacionTodoProcesoIessAportes = isPermisoPaginacionTodoProcesoIessAportes;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoIessAportes() {
		return isPermisoPaginacionAltoProcesoIessAportes;
	}

	public void setIsPermisoPaginacionAltoProcesoIessAportes(Boolean isPermisoPaginacionAltoProcesoIessAportes) {
		this.isPermisoPaginacionAltoProcesoIessAportes = isPermisoPaginacionAltoProcesoIessAportes;
	}
	
	public Boolean getIsPermisoCopiarProcesoIessAportes() {
		return isPermisoCopiarProcesoIessAportes;
	}

	public void setIsPermisoCopiarProcesoIessAportes(Boolean isPermisoCopiarProcesoIessAportes) {
		this.isPermisoCopiarProcesoIessAportes = isPermisoCopiarProcesoIessAportes;
	}
	
	public Boolean getIsPermisoVerFormProcesoIessAportes() {
		return isPermisoVerFormProcesoIessAportes;
	}

	public void setIsPermisoVerFormProcesoIessAportes(Boolean isPermisoVerFormProcesoIessAportes) {
		this.isPermisoVerFormProcesoIessAportes = isPermisoVerFormProcesoIessAportes;
	}
	
	public Boolean getIsPermisoDuplicarProcesoIessAportes() {
		return isPermisoDuplicarProcesoIessAportes;
	}

	public void setIsPermisoDuplicarProcesoIessAportes(Boolean isPermisoDuplicarProcesoIessAportes) {
		this.isPermisoDuplicarProcesoIessAportes = isPermisoDuplicarProcesoIessAportes;
	}
	
	public Boolean getIsPermisoOrdenProcesoIessAportes() {
		return isPermisoOrdenProcesoIessAportes;
	}

	public void setIsPermisoOrdenProcesoIessAportes(Boolean isPermisoOrdenProcesoIessAportes) {
		this.isPermisoOrdenProcesoIessAportes = isPermisoOrdenProcesoIessAportes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoIessAportes() {
		return isVisibilidadCeldaNuevoProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaNuevoProcesoIessAportes(Boolean isVisibilidadCeldaNuevoProcesoIessAportes) {
		this.isVisibilidadCeldaNuevoProcesoIessAportes = isVisibilidadCeldaNuevoProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoIessAportes() {
		return isVisibilidadCeldaDuplicarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoIessAportes(Boolean isVisibilidadCeldaDuplicarProcesoIessAportes) {
		this.isVisibilidadCeldaDuplicarProcesoIessAportes = isVisibilidadCeldaDuplicarProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoIessAportes() {
		return isVisibilidadCeldaCopiarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaCopiarProcesoIessAportes(Boolean isVisibilidadCeldaCopiarProcesoIessAportes) {
		this.isVisibilidadCeldaCopiarProcesoIessAportes = isVisibilidadCeldaCopiarProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoIessAportes() {
		return isVisibilidadCeldaVerFormProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaVerFormProcesoIessAportes(Boolean isVisibilidadCeldaVerFormProcesoIessAportes) {
		this.isVisibilidadCeldaVerFormProcesoIessAportes = isVisibilidadCeldaVerFormProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoIessAportes() {
		return isVisibilidadCeldaOrdenProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaOrdenProcesoIessAportes(Boolean isVisibilidadCeldaOrdenProcesoIessAportes) {
		this.isVisibilidadCeldaOrdenProcesoIessAportes = isVisibilidadCeldaOrdenProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoIessAportes() {
		return isVisibilidadCeldaNuevoRelacionesProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoIessAportes(Boolean isVisibilidadCeldaNuevoRelacionesProcesoIessAportes) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes = isVisibilidadCeldaNuevoRelacionesProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoIessAportes() {
		return isVisibilidadCeldaModificarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaModificarProcesoIessAportes(Boolean isVisibilidadCeldaModificarProcesoIessAportes) {
		this.isVisibilidadCeldaModificarProcesoIessAportes = isVisibilidadCeldaModificarProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoIessAportes() {
		return isVisibilidadCeldaActualizarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaActualizarProcesoIessAportes(Boolean isVisibilidadCeldaActualizarProcesoIessAportes) {
		this.isVisibilidadCeldaActualizarProcesoIessAportes = isVisibilidadCeldaActualizarProcesoIessAportes;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoIessAportes() {
		return isVisibilidadCeldaEliminarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaEliminarProcesoIessAportes(Boolean isVisibilidadCeldaEliminarProcesoIessAportes) {
		this.isVisibilidadCeldaEliminarProcesoIessAportes = isVisibilidadCeldaEliminarProcesoIessAportes;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoIessAportes() {
		return isVisibilidadCeldaCancelarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaCancelarProcesoIessAportes(Boolean isVisibilidadCeldaCancelarProcesoIessAportes) {
		this.isVisibilidadCeldaCancelarProcesoIessAportes = isVisibilidadCeldaCancelarProcesoIessAportes;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoIessAportes() {
		return isVisibilidadCeldaGuardarProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaGuardarProcesoIessAportes(Boolean isVisibilidadCeldaGuardarProcesoIessAportes) {
		this.isVisibilidadCeldaGuardarProcesoIessAportes = isVisibilidadCeldaGuardarProcesoIessAportes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoIessAportes() {
		return isVisibilidadCeldaGuardarCambiosProcesoIessAportes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoIessAportes(Boolean isVisibilidadCeldaGuardarCambiosProcesoIessAportes) {
		this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes = isVisibilidadCeldaGuardarCambiosProcesoIessAportes;
	}
		
	public ProcesoIessAportesSessionBean getprocesoiessaportesSessionBean() {
		return this.procesoiessaportesSessionBean;
	}
	
	public void setprocesoiessaportesSessionBean(ProcesoIessAportesSessionBean procesoiessaportesSessionBean) {
		this.procesoiessaportesSessionBean=procesoiessaportesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoIessAportes() {
		return this.isVisibilidadBusquedaProcesoIessAportes;
	}

	public void setisVisibilidadBusquedaProcesoIessAportes(Boolean isVisibilidadBusquedaProcesoIessAportes) {
		this.isVisibilidadBusquedaProcesoIessAportes=isVisibilidadBusquedaProcesoIessAportes;
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

	public Boolean getisVisibilidadFK_IdTipoAfiliacion() {
		return this.isVisibilidadFK_IdTipoAfiliacion;
	}

	public void setisVisibilidadFK_IdTipoAfiliacion(Boolean isVisibilidadFK_IdTipoAfiliacion) {
		this.isVisibilidadFK_IdTipoAfiliacion=isVisibilidadFK_IdTipoAfiliacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(ProcesoIessAportes procesoiessaportes)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(procesoiessaportes,null);
				this.setActualParaGuardarMesForeignKey(procesoiessaportes,null);
				this.setActualParaGuardarTipoAfiliacionForeignKey(procesoiessaportes,null);
				this.setActualParaGuardarNumeroPatronalForeignKey(procesoiessaportes,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoIessAportes procesoiessaportes,ProcesoIessAportes procesoiessaportesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoIessAportes(procesoiessaportes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoiessaportesAux.setId(procesoiessaportes.getId());
		procesoiessaportesAux.setVersionRow(procesoiessaportes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoIessAportes procesoiessaportesLocal) throws Exception {
		
		if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoIessAportes procesoiessaportesLocal) throws Exception {	
		if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				procesoiessaportesLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				procesoiessaportesLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAfiliacionDetalleFormJInternalFrame.class)) {
				TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrameLocal=(TipoAfiliacionBeanSwingJInternalFrame) ((TipoAfiliacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoafiliacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAfiliacion(tipoafiliacionBeanSwingJInternalFrameLocal.gettipoafiliacion(),true);
				tipoafiliacionBeanSwingJInternalFrameLocal.actualizarLista(tipoafiliacionBeanSwingJInternalFrameLocal.tipoafiliacion,this.tipoafiliacionsForeignKey);

				tipoafiliacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoafiliacionBeanSwingJInternalFrameLocal.tipoafiliacion);

				procesoiessaportesLocal.setTipoAfiliacion(tipoafiliacionBeanSwingJInternalFrameLocal.tipoafiliacion);

				this.addItemDefectoCombosForeignKeyTipoAfiliacion();
				this.cargarCombosFrameTipoAfiliacionsForeignKey("Formulario");
				this.setActualTipoAfiliacionForeignKey(tipoafiliacionBeanSwingJInternalFrameLocal.tipoafiliacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NumeroPatronalDetalleFormJInternalFrame.class)) {
				NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrameLocal=(NumeroPatronalBeanSwingJInternalFrame) ((NumeroPatronalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				numeropatronalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.getnumeropatronal(),true);
				numeropatronalBeanSwingJInternalFrameLocal.actualizarLista(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal,this.numeropatronalsForeignKey);

				numeropatronalBeanSwingJInternalFrameLocal.actualizarRelaciones(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				procesoiessaportesLocal.setNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey("Formulario");
				this.setActualNumeroPatronalForeignKey(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoIessAportesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoiessaportesValidator.getInvalidValues(this.procesoiessaportes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoIessAportes procesoiessaportes,List<ProcesoIessAportes> procesoiessaportess) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoIessAportes procesoiessaportes,List<ProcesoIessAportes> procesoiessaportess) throws Exception {
		try	{			
			ProcesoIessAportesConstantesFunciones.actualizarSelectedLista(procesoiessaportes,procesoiessaportess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoIessAportes> procesoiessaportessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoiessaportessLocal=this.procesoiessaportesLogic.getProcesoIessAportess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoiessaportessLocal=this.procesoiessaportess;
			}
			//ARCHITECTURE
		
			for(ProcesoIessAportes procesoiessaportesLocal:procesoiessaportessLocal) {
				if(this.permiteMantenimiento(procesoiessaportesLocal) && procesoiessaportesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoIessAportesConstantesFunciones.getProcesoIessAportesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoIessAportesConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_anioProcesoIessAportes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessAportesConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_mesProcesoIessAportes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessAportesConstantesFunciones.IDTIPOAFILIACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_tipo_afiliacionProcesoIessAportes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessAportesConstantesFunciones.IDNUMEROPATRONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_numero_patronalProcesoIessAportes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoIessAportesConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelporcentajeProcesoIessAportes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_anioProcesoIessAportes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_mesProcesoIessAportes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_tipo_afiliacionProcesoIessAportes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelid_numero_patronalProcesoIessAportes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelporcentajeProcesoIessAportes,"");
		
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
		this.iIdNuevoProcesoIessAportes--;	
		
		
		this.procesoiessaportesAux=new ProcesoIessAportes();
		
		this.procesoiessaportesAux.setId(this.iIdNuevoProcesoIessAportes);
		this.procesoiessaportesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoiessaportesLogic.getProcesoIessAportess().add(this.procesoiessaportesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoiessaportess.add(this.procesoiessaportesAux);
		}
		//ARCHITECTURE
		
		this.procesoiessaportes=this.procesoiessaportesAux;
		
		if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportes);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessAportes(this.procesoiessaportes);
		}
				
		//this.setDefaultControlesProcesoIessAportes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoIessAportes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoIessAportes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessAportes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessAportes(this.procesoiessaportesBean,this.procesoiessaportes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoIessAportes(this.procesoiessaportesReturnGeneral,this.procesoiessaportesBean,false);
		
		if(this.procesoiessaportesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes());
		}
		
		if(this.procesoiessaportesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes(),classes);//this.procesoiessaportesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoIessAportes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoIessAportes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.RecargarFormProcesoIessAportes(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoIessAportes(false);
						
			if(procesoiessaportesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessAportes();
			}
			
			this.actualizarVisualTableDatosProcesoIessAportes();
			
			this.jTableDatosProcesoIessAportes.setRowSelectionInterval(this.getIndiceNuevoProcesoIessAportes(), this.getIndiceNuevoProcesoIessAportes());
			
			this.seleccionarFilaTablaProcesoIessAportesActual();
						
			this.actualizarEstadoCeldasBotonesProcesoIessAportes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoIessAportes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setEnabled(isHabilitar && this.procesoiessaportesConstantesFunciones.activarporcentajeProcesoIessAportes);	
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setEnabled(isHabilitar && this.procesoiessaportesConstantesFunciones.activarid_anioProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setEnabled(isHabilitar && this.procesoiessaportesConstantesFunciones.activarid_mesProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setEnabled(isHabilitar && this.procesoiessaportesConstantesFunciones.activarid_tipo_afiliacionProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setEnabled(isHabilitar && this.procesoiessaportesConstantesFunciones.activarid_numero_patronalProcesoIessAportes);
	};
	
	public void setDefaultControlesProcesoIessAportes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoIessAportes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoiessaportesSessionBean.setConGuardarRelaciones(true);			
			this.procesoiessaportesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.setVisible(true);
			
					
		} else {
			//this.procesoiessaportesSessionBean.setConGuardarRelaciones(false);			
			this.procesoiessaportesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoIessAportes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
				if(procesoiessaportesAux.getId().equals(this.iIdNuevoProcesoIessAportes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportess) {
				if(procesoiessaportesAux.getId().equals(this.iIdNuevoProcesoIessAportes)) {
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
	
	public int getIndiceActualProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
				if(procesoiessaportesAux.getId().equals(procesoiessaportes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportess) {
				if(procesoiessaportesAux.getId().equals(procesoiessaportes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoIessAportes(ProcesoIessAportes procesoiessaportesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
				if(procesoiessaportesAux.getProcesoIessAportesOriginal().getId().equals(procesoiessaportesOriginal.getId())) {
					existe=true;
					procesoiessaportesOriginal.setId(procesoiessaportesAux.getId());
					procesoiessaportesOriginal.setVersionRow(procesoiessaportesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportess) {
				if(procesoiessaportesAux.getProcesoIessAportesOriginal().getId().equals(procesoiessaportesOriginal.getId())) {
					existe=true;
					procesoiessaportesOriginal.setId(procesoiessaportesAux.getId());
					procesoiessaportesOriginal.setVersionRow(procesoiessaportesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoIessAportes(Boolean esParaCancelar) throws Exception {
		procesoiessaportessAux=new ArrayList<ProcesoIessAportes>();
		procesoiessaportesAux=new ProcesoIessAportes();
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
					if(procesoiessaportesAux.getId()<0) {
						procesoiessaportessAux.add(procesoiessaportesAux);
					}		
				}
				this.iIdNuevoProcesoIessAportes=0L;
				this.procesoiessaportesLogic.getProcesoIessAportess().removeAll(procesoiessaportessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportess) {
					if(procesoiessaportesAux.getId()<0) {
						procesoiessaportessAux.add(procesoiessaportesAux);
					}		
				}
				this.iIdNuevoProcesoIessAportes=0L;
				this.procesoiessaportess.removeAll(procesoiessaportessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoIessAportes 
					&& this.procesoiessaportesLogic.getProcesoIessAportess().size()>0
					) {
					procesoiessaportesAux=this.procesoiessaportesLogic.getProcesoIessAportess().get(this.procesoiessaportesLogic.getProcesoIessAportess().size() - 1);
				
					if(procesoiessaportesAux.getId()<0) {
						this.procesoiessaportesLogic.getProcesoIessAportess().remove(procesoiessaportesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoIessAportes && this.procesoiessaportess.size()>0) {
					procesoiessaportesAux=this.procesoiessaportess.get(this.procesoiessaportess.size() - 1);
				
					if(procesoiessaportesAux.getId()<0) {
						this.procesoiessaportess.remove(procesoiessaportesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoIessAportes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoiessaportes.getId()<0) {
				this.procesoiessaportesLogic.getProcesoIessAportess().remove(this.procesoiessaportes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoiessaportes.getId()<0) {
				this.procesoiessaportess.remove(this.procesoiessaportes);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoIessAportes(List<ProcesoIessAportes> procesoiessaportessAux) throws Exception {
		ProcesoIessAportesConstantesFunciones.setEstadosInicialesProcesoIessAportes(procesoiessaportessAux);
	}
	
	public void setEstadosInicialesProcesoIessAportes(ProcesoIessAportes procesoiessaportesAux) throws Exception {
		ProcesoIessAportesConstantesFunciones.setEstadosInicialesProcesoIessAportes(procesoiessaportesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoIessAportesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoIessAportesActual()) {
				if(!this.isEsNuevoProcesoIessAportes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoIessAportes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoIessAportesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Iess Aportes ?", "MANTENIMIENTO DE Proceso Iess Aportes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoIessAportes procesoiessaportes) throws Exception {
		ProcesoIessAportesConstantesFunciones.seleccionarAsignar(this.procesoiessaportes,procesoiessaportes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoIessAportes=this.isPermisoActualizarOriginalProcesoIessAportes;
			
			
			this.seleccionarAsignar(procesoiessaportes);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoIessAportes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoiessaportesSessionBean.setsFuncionBusquedaRapida(this.procesoiessaportesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoIessAportes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoIessAportes(esParaCancelar);				
				this.cancelarNuevoProcesoIessAportes(esParaCancelar);								
			}
			
			this.procesoiessaportes=new ProcesoIessAportes();
			
			this.inicializarProcesoIessAportes();
			
			this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoIessAportes() throws Exception {
		try {
			ProcesoIessAportesConstantesFunciones.inicializarProcesoIessAportes(this.procesoiessaportes);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoiessaportesLogic.getProcesoIessAportess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoIessAportess(String sAccionBusqueda,List<ProcesoIessAportes> procesoiessaportessParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoIessAportes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoIessAportesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoIessAportesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoIessAportes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Iess Aporteses");		
		parameters.put("busquedapor", ProcesoIessAportesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoIessAportes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoIessAportes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoIessAportesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoIessAportesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoIessAportesBean.TraerProcesoIessAportesBeans(procesoiessaportessParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoIessAportesActionPerformed(null);
					//this.generarExcelReporteProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoIessAportess(sAccionBusqueda,sTipoArchivoReporte,procesoiessaportessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoIessAportess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessAportes> procesoiessaportessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessAportess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessAportes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoIessAportes procesoiessaportes : procesoiessaportessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoIessAportesConstantesFunciones.generarExcelReporteDataProcesoIessAportes("NORMAL",row,workbook,procesoiessaportes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoIessAportes(String sTipo,Row row,Workbook workbook) {
		
		ProcesoIessAportesConstantesFunciones.generarExcelReporteHeaderProcesoIessAportes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoIessAportess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessAportes> procesoiessaportessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessAportess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoIessAportes procesoiessaportes : procesoiessaportessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoIessAportesConstantesFunciones.getProcesoIessAportesDescripcion(procesoiessaportes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessaportes.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessAportesConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessaportes.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessaportes.gettipoafiliacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessaportes.getnumeropatronal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoiessaportes.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoIessAportess(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoIessAportes> procesoiessaportessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoIessAportes> procesoiessaportessRespaldo=null;
		
		classes=ProcesoIessAportesConstantesFunciones.getClassesRelationshipsOfProcesoIessAportes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoiessaportesLogic.setDatosCliente(this.datosCliente);
		this.procesoiessaportesLogic.setDatosDeep(this.datosDeep);
		this.procesoiessaportesLogic.setIsConDeep(true);
		
		procesoiessaportessRespaldo=this.procesoiessaportesLogic.getProcesoIessAportess();
		
		this.procesoiessaportesLogic.setProcesoIessAportess(procesoiessaportessParaReportes);	
		this.procesoiessaportesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoiessaportessParaReportes=this.procesoiessaportesLogic.getProcesoIessAportess();
		this.procesoiessaportesLogic.setProcesoIessAportess(procesoiessaportessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoIessAportess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoIessAportes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoIessAportes procesoiessaportes : procesoiessaportessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoIessAportes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoIessAportesConstantesFunciones.generarExcelReporteDataProcesoIessAportes("NORMAL",row,workbook,procesoiessaportes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoIessAportesConstantesFunciones.getProcesoIessAportesDescripcion(procesoiessaportes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoIessAportes() throws Exception {		
		this.startProcessProcesoIessAportes(true);
	}
	
	public void startProcessProcesoIessAportes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoIessAportes ,this.jPanelParametrosReportesProcesoIessAportes, this.jScrollPanelDatosProcesoIessAportes,this.jPanelPaginacionProcesoIessAportes, this.jScrollPanelDatosEdicionProcesoIessAportes, this.jPanelAccionesProcesoIessAportes,this.jPanelAccionesFormularioProcesoIessAportes,this.jmenuBarProcesoIessAportes,this.jmenuBarDetalleProcesoIessAportes,this.jTtoolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessAportes=this.jTabbedPaneBusquedasProcesoIessAportes; 
		
		final JPanel jPanelParametrosReportesProcesoIessAportes=this.jPanelParametrosReportesProcesoIessAportes;
		//final JScrollPane jScrollPanelDatosProcesoIessAportes=this.jScrollPanelDatosProcesoIessAportes;
		final JTable jTableDatosProcesoIessAportes=this.jTableDatosProcesoIessAportes;		
		final JPanel jPanelPaginacionProcesoIessAportes=this.jPanelPaginacionProcesoIessAportes;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessAportes=this.jScrollPanelDatosEdicionProcesoIessAportes;
		final JPanel jPanelAccionesProcesoIessAportes=this.jPanelAccionesProcesoIessAportes;
		
		JPanel jPanelCamposAuxiliarProcesoIessAportes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessAportes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			jPanelCamposAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jPanelCamposProcesoIessAportes;
			jPanelAccionesFormularioAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jPanelAccionesFormularioProcesoIessAportes;
		}
		
		final JPanel jPanelCamposProcesoIessAportes=jPanelCamposAuxiliarProcesoIessAportes;
		final JPanel jPanelAccionesFormularioProcesoIessAportes=jPanelAccionesFormularioAuxiliarProcesoIessAportes;
		
		
		final JMenuBar jmenuBarProcesoIessAportes=this.jmenuBarProcesoIessAportes;
		final JToolBar jTtoolBarProcesoIessAportes=this.jTtoolBarProcesoIessAportes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessAportes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessAportes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			jmenuBarDetalleAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jmenuBarDetalleProcesoIessAportes;
			jTtoolBarDetalleAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jTtoolBarDetalleProcesoIessAportes;
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessAportes=jmenuBarDetalleAuxiliarProcesoIessAportes;
		final JToolBar jTtoolBarDetalleProcesoIessAportes=jTtoolBarDetalleAuxiliarProcesoIessAportes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessAportes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessAportes;
			processRunnable.jTableDatos=jTableDatosProcesoIessAportes;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessAportes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessAportes;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessAportes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessAportes;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessAportes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessAportes;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessAportes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessAportes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessAportes ,jPanelParametrosReportesProcesoIessAportes,jTableDatosProcesoIessAportes, /*jScrollPanelDatosProcesoIessAportes,*/jPanelCamposProcesoIessAportes,jPanelPaginacionProcesoIessAportes, /*jScrollPanelDatosEdicionProcesoIessAportes,*/ jPanelAccionesProcesoIessAportes,jPanelAccionesFormularioProcesoIessAportes,jmenuBarProcesoIessAportes,jmenuBarDetalleProcesoIessAportes,jTtoolBarProcesoIessAportes,jTtoolBarDetalleProcesoIessAportes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoIessAportes ,jPanelParametrosReportesProcesoIessAportes, jScrollPanelDatosProcesoIessAportes,jPanelPaginacionProcesoIessAportes, jScrollPanelDatosEdicionProcesoIessAportes, jPanelAccionesProcesoIessAportes,jPanelAccionesFormularioProcesoIessAportes,jmenuBarProcesoIessAportes,jmenuBarDetalleProcesoIessAportes,jTtoolBarProcesoIessAportes,jTtoolBarDetalleProcesoIessAportes);
						
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
	
	public void finishProcessProcesoIessAportes() {// throws Exception 
		this.finishProcessProcesoIessAportes(true);
	}
	
	public void finishProcessProcesoIessAportes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoIessAportes ,this.jPanelParametrosReportesProcesoIessAportes, this.jScrollPanelDatosProcesoIessAportes,this.jPanelPaginacionProcesoIessAportes, this.jScrollPanelDatosEdicionProcesoIessAportes, this.jPanelAccionesProcesoIessAportes,this.jPanelAccionesFormularioProcesoIessAportes,this.jmenuBarProcesoIessAportes,this.jmenuBarDetalleProcesoIessAportes,this.jTtoolBarProcesoIessAportes,this.jTtoolBarDetalleProcesoIessAportes);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoIessAportes=this.jTabbedPaneBusquedasProcesoIessAportes; 
		
		final JPanel jPanelParametrosReportesProcesoIessAportes=this.jPanelParametrosReportesProcesoIessAportes;
		//final JScrollPane jScrollPanelDatosProcesoIessAportes=this.jScrollPanelDatosProcesoIessAportes;
		final JTable jTableDatosProcesoIessAportes=this.jTableDatosProcesoIessAportes;		
		final JPanel jPanelPaginacionProcesoIessAportes=this.jPanelPaginacionProcesoIessAportes;
		//final JScrollPane jScrollPanelDatosEdicionProcesoIessAportes=this.jScrollPanelDatosEdicionProcesoIessAportes;
		final JPanel jPanelAccionesProcesoIessAportes=this.jPanelAccionesProcesoIessAportes;
		
		JPanel jPanelCamposAuxiliarProcesoIessAportes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoIessAportes=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			jPanelCamposAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jPanelCamposProcesoIessAportes;
			jPanelAccionesFormularioAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jPanelAccionesFormularioProcesoIessAportes;
		}
		
		final JPanel jPanelCamposProcesoIessAportes=jPanelCamposAuxiliarProcesoIessAportes;
		final JPanel jPanelAccionesFormularioProcesoIessAportes=jPanelAccionesFormularioAuxiliarProcesoIessAportes;
		
		
		final JMenuBar jmenuBarProcesoIessAportes=this.jmenuBarProcesoIessAportes;		
		final JToolBar jTtoolBarProcesoIessAportes=this.jTtoolBarProcesoIessAportes;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoIessAportes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoIessAportes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			jmenuBarDetalleAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jmenuBarDetalleProcesoIessAportes;
			jTtoolBarDetalleAuxiliarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jTtoolBarDetalleProcesoIessAportes;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoIessAportes=jmenuBarDetalleAuxiliarProcesoIessAportes;
		final JToolBar jTtoolBarDetalleProcesoIessAportes=jTtoolBarDetalleAuxiliarProcesoIessAportes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoIessAportes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoIessAportes;
			processRunnable.jTableDatos=jTableDatosProcesoIessAportes;
			processRunnable.jPanelCampos=jPanelCamposProcesoIessAportes;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoIessAportes;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoIessAportes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoIessAportes;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoIessAportes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoIessAportes;
			processRunnable.jTtoolBar=jTtoolBarProcesoIessAportes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoIessAportes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoIessAportes ,jPanelParametrosReportesProcesoIessAportes, jTableDatosProcesoIessAportes,/*jScrollPanelDatosProcesoIessAportes,*/jPanelCamposProcesoIessAportes,jPanelPaginacionProcesoIessAportes, /*jScrollPanelDatosEdicionProcesoIessAportes,*/ jPanelAccionesProcesoIessAportes,jPanelAccionesFormularioProcesoIessAportes,jmenuBarProcesoIessAportes,jmenuBarDetalleProcesoIessAportes,jTtoolBarProcesoIessAportes,jTtoolBarDetalleProcesoIessAportes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoIessAportes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoIessAportes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoIessAportes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoIessAportes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoIessAportes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoIessAportes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoIessAportes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoIessAportes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoIessAportes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoiessaportesConstantesFunciones.getsFinalQueryProcesoIessAportes();
		String  finalQueryPaginacionTodos=this.procesoiessaportesConstantesFunciones.getsFinalQueryProcesoIessAportes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoIessAportesConstantesFunciones.getArrayColumnasGlobalesNoProcesoIessAportes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoIessAportesConstantesFunciones.getArrayColumnasGlobalesProcesoIessAportes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoIessAportesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoiessaportessEliminados= new ArrayList<ProcesoIessAportes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoIessAportes();
		
				///*ProcesoIessAportesSessionBean*/this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			
			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
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
					this.iNumeroPaginacion=ProcesoIessAportesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoIessAportesConstantesFunciones.getClassesForeignKeysOfProcesoIessAportes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoiessaportes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoiessaportessAux= new ArrayList<ProcesoIessAportes>();
			
				
			procesoiessaportesLogic.setDatosCliente(this.datosCliente);
			procesoiessaportesLogic.setDatosDeep(this.datosDeep);
			procesoiessaportesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoIessAportes")) {
				this.sDetalleReporte=ProcesoIessAportesConstantesFunciones.getDetalleIndiceBusquedaProcesoIessAportes(id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoiessaportesLogic.getProcesoIessAportessBusquedaProcesoIessAportes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessAportesConstantesFunciones.getDetalleIndiceBusquedaProcesoIessAportes(id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessAportesConstantesFunciones.getDetalleIndiceBusquedaProcesoIessAportes(id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoiessaportesLogic.getProcesoIessAportess()==null||procesoiessaportesLogic.getProcesoIessAportess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoiessaportess==null|| procesoiessaportess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessaportessAux=new ArrayList<ProcesoIessAportes>();
						procesoiessaportessAux.addAll(procesoiessaportesLogic.getProcesoIessAportess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessaportessAux=new ArrayList<ProcesoIessAportes>();
							procesoiessaportessAux.addAll(procesoiessaportess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoiessaportesLogic.getProcesoIessAportessBusquedaProcesoIessAportes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoIessAportesConstantesFunciones.getDetalleIndiceBusquedaProcesoIessAportes(id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoIessAportesConstantesFunciones.getDetalleIndiceBusquedaProcesoIessAportes(id_anioBusquedaProcesoIessAportes,id_mesBusquedaProcesoIessAportes,id_tipo_afiliacionBusquedaProcesoIessAportes,id_numero_patronalBusquedaProcesoIessAportes,porcentajeBusquedaProcesoIessAportes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoIessAportess("BusquedaProcesoIessAportes",procesoiessaportesLogic.getProcesoIessAportess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoIessAportess("BusquedaProcesoIessAportes",procesoiessaportess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessaportesLogic.setProcesoIessAportess(new ArrayList<ProcesoIessAportes>());
						procesoiessaportesLogic.getProcesoIessAportess().addAll(procesoiessaportessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessaportess=new ArrayList<ProcesoIessAportes>();
							procesoiessaportess.addAll(procesoiessaportessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoIessAportes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoIessAportes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessaportesLogic.getProcesoIessAportess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessaportess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoiessaportesLogic.getProcesoIessAportess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessaportess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoIessAportes procesoiessaportes) {
		Boolean permite=true;
		
		if(this.procesoiessaportes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoIessAportesConstantesFunciones.getOrderByListaProcesoIessAportes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoIessAportesConstantesFunciones.getOrderByListaProcesoIessAportes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessAportes procesoiessaportes:procesoiessaportesLogic.getProcesoIessAportess()) {
				if(procesoiessaportes.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessaportesTotales=procesoiessaportes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessAportes procesoiessaportes:this.procesoiessaportess) {
				if(procesoiessaportes.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessaportesTotales=procesoiessaportes;
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
			this.procesoiessaportesAux=new ProcesoIessAportes();
			this.procesoiessaportesAux.setsType(Constantes2.S_TOTALES);
			this.procesoiessaportesAux.setIsNew(false);
			this.procesoiessaportesAux.setIsChanged(false);
			this.procesoiessaportesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoIessAportesConstantesFunciones.TotalizarValoresFilaProcesoIessAportes(this.procesoiessaportesLogic.getProcesoIessAportess(),this.procesoiessaportesAux);
				
				//this.procesoiessaportesLogic.getProcesoIessAportess().add(this.procesoiessaportesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoIessAportesConstantesFunciones.TotalizarValoresFilaProcesoIessAportes(this.procesoiessaportess,this.procesoiessaportesAux);
				
				this.procesoiessaportess.add(this.procesoiessaportesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoiessaportesTotales=new ProcesoIessAportes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessaportesLogic.getProcesoIessAportess().remove(procesoiessaportesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoiessaportess.remove(procesoiessaportesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoiessaportesTotales=new ProcesoIessAportes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoIessAportes procesoiessaportes:procesoiessaportesLogic.getProcesoIessAportess()) {
				if(procesoiessaportes.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessaportesTotales=procesoiessaportes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessAportesConstantesFunciones.TotalizarValoresFilaProcesoIessAportes(this.procesoiessaportesLogic.getProcesoIessAportess(),procesoiessaportesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoIessAportes procesoiessaportes:this.procesoiessaportess) {
				if(procesoiessaportes.getsType().equals(Constantes2.S_TOTALES)) {
					procesoiessaportesTotales=procesoiessaportes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoIessAportesConstantesFunciones.TotalizarValoresFilaProcesoIessAportes(this.procesoiessaportess,procesoiessaportesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoIessAportessBusquedaProcesoIessAportes()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoIessAportes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessAportessFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessAportessFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessAportessFK_IdNumeroPatronal()throws Exception {
		try {
			sAccionBusqueda="FK_IdNumeroPatronal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoIessAportessFK_IdTipoAfiliacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoAfiliacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoIessAportessBusquedaProcesoIessAportes(String sFinalQuery,Long id_anio,Long id_mes,Long id_tipo_afiliacion,Long id_numero_patronal,Double porcentaje)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessaportesLogic.getProcesoIessAportessBusquedaProcesoIessAportes(sFinalQuery,this.pagination,id_anio,id_mes,id_tipo_afiliacion,id_numero_patronal,porcentaje);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessAportessFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessaportesLogic.getProcesoIessAportessFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessAportessFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessaportesLogic.getProcesoIessAportessFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessAportessFK_IdNumeroPatronal(String sFinalQuery,Long id_numero_patronal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessaportesLogic.getProcesoIessAportessFK_IdNumeroPatronal(sFinalQuery,this.pagination,id_numero_patronal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoIessAportessFK_IdTipoAfiliacion(String sFinalQuery,Long id_tipo_afiliacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoiessaportesLogic.getProcesoIessAportessFK_IdTipoAfiliacion(sFinalQuery,this.pagination,id_tipo_afiliacion);
				
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
	
	public void inicializarPermisosProcesoIessAportes() {
		this.isPermisoTodoProcesoIessAportes=false;
		this.isPermisoNuevoProcesoIessAportes=false;
		this.isPermisoActualizarProcesoIessAportes=false;
		this.isPermisoActualizarOriginalProcesoIessAportes=false;
		this.isPermisoEliminarProcesoIessAportes=false;
		this.isPermisoGuardarCambiosProcesoIessAportes=false;
		this.isPermisoConsultaProcesoIessAportes=true;
		this.isPermisoBusquedaProcesoIessAportes=true;
		this.isPermisoReporteProcesoIessAportes=true;
		this.isPermisoOrdenProcesoIessAportes=false;		
		this.isPermisoPaginacionMedioProcesoIessAportes=false;		
		this.isPermisoPaginacionAltoProcesoIessAportes=false;		
		this.isPermisoPaginacionTodoProcesoIessAportes=false;		
		this.isPermisoCopiarProcesoIessAportes=false;		
		this.isPermisoVerFormProcesoIessAportes=false;		
		this.isPermisoDuplicarProcesoIessAportes=false;
		this.isPermisoOrdenProcesoIessAportes=false;
	}
	
	public void setPermisosUsuarioProcesoIessAportes(Boolean isPermiso) {
		this.isPermisoTodoProcesoIessAportes=isPermiso;
		this.isPermisoNuevoProcesoIessAportes=isPermiso;
		this.isPermisoActualizarProcesoIessAportes=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessAportes=isPermiso;
		this.isPermisoEliminarProcesoIessAportes=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessAportes=isPermiso;
		this.isPermisoConsultaProcesoIessAportes=isPermiso;
		this.isPermisoBusquedaProcesoIessAportes=isPermiso;
		this.isPermisoReporteProcesoIessAportes=isPermiso;
		this.isPermisoOrdenProcesoIessAportes=isPermiso;		
		this.isPermisoPaginacionMedioProcesoIessAportes=isPermiso;		
		this.isPermisoPaginacionAltoProcesoIessAportes=isPermiso;		
		this.isPermisoPaginacionTodoProcesoIessAportes=isPermiso;		
		this.isPermisoCopiarProcesoIessAportes=isPermiso;		
		this.isPermisoVerFormProcesoIessAportes=isPermiso;		
		this.isPermisoDuplicarProcesoIessAportes=isPermiso;
		this.isPermisoOrdenProcesoIessAportes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoIessAportes(Boolean isPermiso) {
		//this.isPermisoTodoProcesoIessAportes=isPermiso;
		this.isPermisoNuevoProcesoIessAportes=isPermiso;
		this.isPermisoActualizarProcesoIessAportes=isPermiso;
		this.isPermisoActualizarOriginalProcesoIessAportes=isPermiso;
		this.isPermisoEliminarProcesoIessAportes=isPermiso;
		this.isPermisoGuardarCambiosProcesoIessAportes=isPermiso;
		//this.isPermisoConsultaProcesoIessAportes=isPermiso;
		//this.isPermisoBusquedaProcesoIessAportes=isPermiso;
		//this.isPermisoReporteProcesoIessAportes=isPermiso;
		//this.isPermisoOrdenProcesoIessAportes=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoIessAportes=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoIessAportes=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoIessAportes=isPermiso;		
		//this.isPermisoCopiarProcesoIessAportes=isPermiso;		
		//this.isPermisoDuplicarProcesoIessAportes=isPermiso;
		//this.isPermisoOrdenProcesoIessAportes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessAportesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoIessAportesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoIessAportes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoIessAportesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoIessAportesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoIessAportesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoIessAportesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoIessAportes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoIessAportesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoIessAportesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoIessAportes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoIessAportes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoIessAportes=this.isPermisoActualizarProcesoIessAportes;
			this.isPermisoEliminarProcesoIessAportes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoIessAportes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoIessAportes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoIessAportes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoIessAportes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoIessAportes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessAportes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoIessAportes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoIessAportes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoIessAportes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoIessAportes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoIessAportes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoIessAportes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoIessAportes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoIessAportes.setToolTipText(this.jTableDatosProcesoIessAportes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoIessAportes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoIessAportes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoIessAportesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoIessAportesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoIessAportes() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoIessAportesListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.tipoafiliacionsForeignKey=new ArrayList();
				this.numeropatronalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoIessAportesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoIessAportesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAfiliacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoAfiliacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoafiliacionsForeignKey==null||this.tipoafiliacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesTipoAfiliacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAfiliacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoAfiliacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoAfiliacionsForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoIessAportes()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyTipoAfiliacion();
			this.addItemDefectoCombosForeignKeyNumeroPatronal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.procesoiessaportesSessionBean==null) {
				this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
			}

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyTipoAfiliacion()throws Exception {
		try {

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionTipoAfiliacion()) {
				TipoAfiliacion tipoafiliacion=new TipoAfiliacion();
				TipoAfiliacionConstantesFunciones.setTipoAfiliacionDescripcion(tipoafiliacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoafiliacion.setId(null);

				if(!TipoAfiliacionConstantesFunciones.ExisteEnLista(this.tipoafiliacionsForeignKey,tipoafiliacion,true)) {

					this.tipoafiliacionsForeignKey.add(0,tipoafiliacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyNumeroPatronal()throws Exception {
		try {

			if(!this.procesoiessaportesSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoIessAportes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoIessAportes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoIessAportes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessAportes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoIessAportes(ProcesoIessAportes procesoiessaportes)throws Exception {	
		try {
			
			this.setActualTipoAfiliacionForeignKey(procesoiessaportes.getid_tipo_afiliacion(),false,"Formulario");
			this.setActualNumeroPatronalForeignKey(procesoiessaportes.getid_numero_patronal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoIessAportes(ProcesoIessAportes procesoiessaportes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoIessAportes()throws Exception {	
		try {
			
			this.setActualTipoAfiliacionForeignKey(this.procesoiessaportesConstantesFunciones.getid_tipo_afiliacion(),false,"Formulario");
			this.setActualNumeroPatronalForeignKey(this.procesoiessaportesConstantesFunciones.getid_numero_patronal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoIessAportes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoIessAportes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoIessAportes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoIessAportes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoIessAportes()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameTipoAfiliacionsForeignKey("Todos");
			this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoIessAportes(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAfiliacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoIessAportes()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoIessAportesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoIessAportesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoIessAportesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean(); 
		this.procesoiessaportesConstantesFunciones=new ProcesoIessAportesConstantesFunciones(); 
		this.procesoiessaportesBean=new ProcesoIessAportes();//(this.procesoiessaportesConstantesFunciones); 		
		this.procesoiessaportesReturnGeneral=new ProcesoIessAportesParameterReturnGeneral(); 
		
		this.procesoiessaportesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessaportesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoIessAportesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoIessAportesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoIessAportesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoIessAportes(true);
			
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
			
			this.procesoiessaportesConstantesFunciones=new ProcesoIessAportesConstantesFunciones(); 
			this.procesoiessaportesBean=new ProcesoIessAportes();//this.procesoiessaportesConstantesFunciones); 			
			this.procesoiessaportesReturnGeneral=new ProcesoIessAportesParameterReturnGeneral(); 
		
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Iess Aportes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesoiessaportes=new ProcesoIessAportes();
			this.procesoiessaportess = new ArrayList<ProcesoIessAportes>();
			this.procesoiessaportessAux = new ArrayList<ProcesoIessAportes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic=new ProcesoIessAportesLogic();
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoiessaportesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoiessaportesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoIessAportes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessAportes);	
					}
					
					if(this.jInternalFrameImportacionProcesoIessAportes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessAportes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoIessAportes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoIessAportes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessAportes);
				this.jInternalFrameDetalleFormProcesoIessAportes.setVisible(false);
				this.jInternalFrameDetalleFormProcesoIessAportes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessAportes);
					this.jInternalFrameReporteDinamicoProcesoIessAportes.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoIessAportes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoIessAportes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessAportes);
					this.jInternalFrameImportacionProcesoIessAportes.setVisible(false);
					this.jInternalFrameImportacionProcesoIessAportes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoIessAportes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessAportes);
					this.jInternalFrameOrderByProcesoIessAportes.setVisible(false);
					this.jInternalFrameOrderByProcesoIessAportes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoIessAportesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoIessAportesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoiessaportesReturnGeneral=new ProcesoIessAportesParameterReturnGeneral();
			
			this.procesoiessaportesParameterGeneral=new ProcesoIessAportesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoiessaportesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoIessAportesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessAportesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),this.procesoiessaportesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoIessAportesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),this.procesoiessaportesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaDuplicarProcesoIessAportes=true;
			this.isVisibilidadCeldaCopiarProcesoIessAportes=true;
			this.isVisibilidadCeldaVerFormProcesoIessAportes=true;
			this.isVisibilidadCeldaOrdenProcesoIessAportes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			
			
			this.isVisibilidadBusquedaProcesoIessAportes=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdNumeroPatronal=true;
			this.isVisibilidadFK_IdTipoAfiliacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoIessAportes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoIessAportes(false);
			
			this.setPermisosUsuarioProcesoIessAportes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoiessaportesSessionBean.getEsGuardarRelacionado() && this.procesoiessaportesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoIessAportesClasesRelacionadas();
			}
			
			if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoIessAportesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoIessAportes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoIessAportes();
			}
			
			if(!this.isPermisoBusquedaProcesoIessAportes) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoIessAportesConstantesFunciones.getTiposSeleccionarProcesoIessAportes());
				
				this.tiposColumnasSelect=ProcesoIessAportesConstantesFunciones.getTiposSeleccionarProcesoIessAportes(true);
				
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
			//if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoIessAportes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoIessAportes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoIessAportes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessAportes() ;
			
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
			this.tipoafiliacionLogic=new TipoAfiliacionLogic();
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
				procesoiessaportesImplementable= (ProcesoIessAportesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessAportesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoiessaportesImplementableHome= (ProcesoIessAportesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoIessAportesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoiessaportess= new ArrayList<ProcesoIessAportes>();
			this.procesoiessaportessEliminados= new ArrayList<ProcesoIessAportes>();
						
			this.isEsNuevoProcesoIessAportes=false;
			this.esParaAccionDesdeFormularioProcesoIessAportes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.tipoafiliacionsForeignKey=new ArrayList<TipoAfiliacion>() ;
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoIessAportes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoIessAportes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoIessAportesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoIessAportes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoIessAportes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoIessAportes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoIessAportes();
			}
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoIessAportes.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoIessAportes.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoIessAportes.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoIessAportes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoIessAportes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoIessAportes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoIessAportes")) {
				iIndex=this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoIessAportes();	
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
	
	public void cargarCombosForeignKeyProcesoIessAportes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoIessAportes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoIessAportes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoIessAportesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoIessAportes();
		
		this.cargarCombosFrameForeignKeyProcesoIessAportes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoIessAportes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoIessAportes();
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

	public void cargarCombosForeignKeyTipoAfiliacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoAfiliacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoAfiliacion();
				this.cargarCombosFrameTipoAfiliacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoAfiliacion(this.tipoafiliacionsForeignKey);

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
	
	public void jButtonNuevoProcesoIessAportesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			
			if(jTableDatosProcesoIessAportes.getRowCount()>=1) {
				jTableDatosProcesoIessAportes.removeRowSelectionInterval(0, jTableDatosProcesoIessAportes.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoIessAportes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoIessAportes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoIessAportes(true);			
			//this.procesoiessaportes=new ProcesoIessAportes();
			//this.procesoiessaportes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessAportes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessAportes() ;
			
			if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessAportes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoiessaportes);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);				
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoIessAportes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoIessAportesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoIessAportes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoIessAportes.getSelectedRows().length;			
			}
			
			procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoIessAportes--;			
				//ProcesoIessAportes procesoiessaportesAux= new ProcesoIessAportes();			
				//procesoiessaportesAux.setId(this.iIdNuevoProcesoIessAportes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoIessAportes procesoiessaportesOrigen=new ProcesoIessAportes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoIessAportes procesoiessaportesOrigen : procesoiessaportessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoiessaportesOrigen =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoiessaportesOrigen =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoIessAportes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoiessaportes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoIessAportes(procesoiessaportesOrigen,this.procesoiessaportes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessaportesLogic.getProcesoIessAportess().add(this.procesoiessaportesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessaportess.add(this.procesoiessaportesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
				
				this.jTableDatosProcesoIessAportes.setRowSelectionInterval(this.getIndiceNuevoProcesoIessAportes(), this.getIndiceNuevoProcesoIessAportes());
				
				int iLastRow =  this.jTableDatosProcesoIessAportes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessAportes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessAportes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessAportes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();									
		
			ProcesoIessAportes procesoiessaportesOrigen=new ProcesoIessAportes();
			ProcesoIessAportes procesoiessaportesDestino=new ProcesoIessAportes();
				
			procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoIessAportes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoiessaportessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoIessAportes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessaportesOrigen =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessaportesOrigen =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoiessaportesDestino =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoiessaportesDestino =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoiessaportesOrigen =procesoiessaportessSeleccionados.get(0);
				procesoiessaportesDestino =procesoiessaportessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoIessAportes(procesoiessaportesOrigen,procesoiessaportesDestino,true,false);
				
				procesoiessaportesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoiessaportesDestino,procesoiessaportesLogic.getProcesoIessAportess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoiessaportesDestino,procesoiessaportess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
				
				//this.jTableDatosProcesoIessAportes.setRowSelectionInterval(this.getIndiceNuevoProcesoIessAportes(), this.getIndiceNuevoProcesoIessAportes());
				
				int iLastRow =  this.jTableDatosProcesoIessAportes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoIessAportes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoIessAportes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessAportes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoIessAportes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoIessAportes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoIessAportes.setVisible(!isVisible);
			this.jPanelPaginacionProcesoIessAportes.setVisible(!isVisible);
			this.jPanelAccionesProcesoIessAportes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoIessAportes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoIessAportes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoIessAportes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoIessAportes();
			
			this.abrirFrameOrderByProcesoIessAportes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoIessAportes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoIessAportes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessAportes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoIessAportes.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoIessAportes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoIessAportes.setSize(this.jInternalFrameDetalleFormProcesoIessAportes.iWidthFormulario,this.jInternalFrameDetalleFormProcesoIessAportes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoIessAportes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoIessAportes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoIessAportes.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoIessAportes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessAportes.jContentPaneDetalleProcesoIessAportes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessAportes.jContentPaneDetalleProcesoIessAportes.getWidth(),ProcesoIessAportesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessAportes.jContentPaneDetalleProcesoIessAportes.getWidth(),ProcesoIessAportesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoIessAportes.jContentPaneDetalleProcesoIessAportes.getWidth(),ProcesoIessAportesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoIessAportes.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoIessAportes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoIessAportes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoIessAportes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoIessAportes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessAportes,false,this);
				} else {
					this.jInternalFrameOrderByProcesoIessAportes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessAportes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoIessAportes);
				this.jInternalFrameOrderByProcesoIessAportes.setVisible(false);
				this.jInternalFrameOrderByProcesoIessAportes.setSelected(false);
				
				this.jInternalFrameOrderByProcesoIessAportes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessAportes"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoIessAportes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoIessAportes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoIessAportes==null) {
				
				this.jInternalFrameImportacionProcesoIessAportes=new ImportacionJInternalFrame(ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoIessAportes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoIessAportes);
				this.jInternalFrameImportacionProcesoIessAportes.setVisible(false);
				this.jInternalFrameImportacionProcesoIessAportes.setSelected(false);


				this.jInternalFrameImportacionProcesoIessAportes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessAportes"));
				this.jInternalFrameImportacionProcesoIessAportes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessAportes"));
				this.jInternalFrameImportacionProcesoIessAportes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessAportes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoIessAportes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoIessAportes==null) {
				this.jInternalFrameReporteDinamicoProcesoIessAportes=new ReporteDinamicoJInternalFrame(ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoIessAportes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoIessAportes);
				this.jInternalFrameReporteDinamicoProcesoIessAportes.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoIessAportes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessAportes"));
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessAportes"));
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessAportes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessAportes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoIessAportes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoIessAportes);
			
	       	this.jInternalFrameDetalleFormProcesoIessAportes.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoIessAportes.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoIessAportes.dispose();
			//this.jInternalFrameDetalleFormProcesoIessAportes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoIessAportes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoIessAportes.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoIessAportes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoIessAportes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoIessAportes.setVisible(true);
	        this.jInternalFrameImportacionProcesoIessAportes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoIessAportes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoIessAportes.setVisible(true);
	        this.jInternalFrameOrderByProcesoIessAportes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoIessAportes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoIessAportes.setVisible(false);
	        this.jInternalFrameOrderByProcesoIessAportes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoIessAportes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoIessAportes.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoIessAportes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoIessAportes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoIessAportes.setVisible(false);
	        this.jInternalFrameImportacionProcesoIessAportes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoIessAportes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoIessAportes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoIessAportes(true);
			//this.isEsNuevoProcesoIessAportes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoIessAportes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessAportes(false) ;
			
			if(procesoiessaportesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessAportes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessAportes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoIessAportesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoIessAportes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoIessAportes(true);
			//this.isEsNuevoProcesoIessAportes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoiessaportes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoIessAportes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoIessAportes(false) ;
			
			if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoIessAportes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessAportes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAfiliacion(List<TipoAfiliacion> tipoafiliacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoAfiliacion=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION));
		TableCellEditor tableCellEditorTipoAfiliacion =tableColumnTipoAfiliacion.getCellEditor();

		TipoAfiliacionTableCell tipoafiliacionTableCellFk=(TipoAfiliacionTableCell)tableCellEditorTipoAfiliacion;

		if(tipoafiliacionTableCellFk!=null) {
			tipoafiliacionTableCellFk.settipoafiliacionsForeignKey(tipoafiliacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoafiliacionTableCellFk.setRowActual(intSelectedRow);
			//tipoafiliacionTableCellFk.settipoafiliacionsForeignKeyActual(tipoafiliacionsForeignKey);
		//}


		if(tipoafiliacionTableCellFk!=null) {
			tipoafiliacionTableCellFk.RecargarTipoAfiliacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNumeroPatronal(List<NumeroPatronal> numeropatronalsForeignKey)throws Exception{
		TableColumn tableColumnNumeroPatronal=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL));
		TableCellEditor tableCellEditorNumeroPatronal =tableColumnNumeroPatronal.getCellEditor();

		NumeroPatronalTableCell numeropatronalTableCellFk=(NumeroPatronalTableCell)tableCellEditorNumeroPatronal;

		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.setnumeropatronalsForeignKey(numeropatronalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//numeropatronalTableCellFk.setRowActual(intSelectedRow);
			//numeropatronalTableCellFk.setnumeropatronalsForeignKeyActual(numeropatronalsForeignKey);
		//}


		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.RecargarNumeroPatronalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessAportes(false);
			
			//if(!this.isEsNuevoProcesoIessAportes) {								
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				
			}
			
			if(this.permiteMantenimiento(this.procesoiessaportes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoIessAportes=true;
					this.inicializarActualizarBindingTablaProcesoIessAportes(false);
					this.isEsNuevoProcesoIessAportes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoIessAportes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoIessAportes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessAportes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessAportes(false);
				
				this.habilitarDeshabilitarControlesProcesoIessAportes(false);
			
												
				
				if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoIessAportes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoIessAportesActionPerformed(evt,procesoiessaportesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoIessAportes(this.procesoiessaportes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoIessAportes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoiessaportesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoiessaportes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessaportes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				this.procesoiessaportes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoiessaportes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoIessAportesModel) this.jTableDatosProcesoIessAportes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoIessAportes=true;
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
				this.isEsNuevoProcesoIessAportes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoIessAportes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessAportes(false);
				
				this.habilitarDeshabilitarControlesProcesoIessAportes(false);
				
				
				
				if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoIessAportes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoIessAportes.getRowCount()>=1) {
				jTableDatosProcesoIessAportes.removeRowSelectionInterval(0, jTableDatosProcesoIessAportes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoIessAportes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoIessAportes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoIessAportes(false) ;
			
			this.isEsNuevoProcesoIessAportes=false;
			
			if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoIessAportes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoIessAportes(false);
				
				//SI ES MANUAL
				if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoIessAportes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoIessAportes--;			
			//ProcesoIessAportes procesoiessaportesAux= new ProcesoIessAportes();			
			//procesoiessaportesAux.setId(this.iIdNuevoProcesoIessAportes);
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoIessAportes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
			
			this.procesoiessaportes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoiessaportesLogic.getProcesoIessAportess().add(this.procesoiessaportesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoiessaportess.add(this.procesoiessaportesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			
			this.jTableDatosProcesoIessAportes.setRowSelectionInterval(this.getIndiceNuevoProcesoIessAportes(), this.getIndiceNuevoProcesoIessAportes());
			
			int iLastRow =  this.jTableDatosProcesoIessAportes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoIessAportes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoIessAportes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessAportes(false);
			
			//SI ES MANUAL
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessAportes();
			}
			
			//this.abrirFrameTreeProcesoIessAportes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoIessAportes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoIessAportes.setFileImportacion(this.jInternalFrameImportacionProcesoIessAportes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoIessAportes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoIessAportes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoIessAportes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoIessAportes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		

		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoIessAportesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoIessAportesBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessAportesConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAfiliacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAfiliacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAfiliacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAfiliacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NumeroPatronal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NumeroPatronal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NumeroPatronal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NumeroPatronal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoIessAportesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION:
					sNombreCampoCategoria="id_tipo_afiliacion";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoria="id_numero_patronal";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoIessAportesConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION:
					sNombreCampoCategoriaValor="id_tipo_afiliacion";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoriaValor="id_numero_patronal";
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoIessAportesConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Afiliacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_afiliacion");
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Patronal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_numero_patronal");
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoIessAportess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoIessAportesConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(ProcesoIessAportes procesoiessaportes:procesoiessaportessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessaportes.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(ProcesoIessAportes procesoiessaportes:procesoiessaportessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessaportes.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION);
					iRow++;

					for(ProcesoIessAportes procesoiessaportes:procesoiessaportessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessaportes.gettipoafiliacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL);
					iRow++;

					for(ProcesoIessAportes procesoiessaportes:procesoiessaportessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessaportes.getnumeropatronal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProcesoIessAportes procesoiessaportes:procesoiessaportessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoiessaportes.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelProcesoIessAportes(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoIessAportes(procesoiessaportesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoIessAportes(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessAportes(false);
			
			//SI ES MANUAL
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoIessAportes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessAportes(false);
			
			//SI ES MANUAL
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessAportes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoIessAportes(false);
			
			//SI ES MANUAL
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoIessAportes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoIessAportes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoIessAportes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoIessAportes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoIessAportes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoIessAportes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoIessAportes.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoIessAportes.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoIessAportes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoIessAportes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoIessAportes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoIessAportes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoIessAportes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoIessAportes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoIessAportes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessAportes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoIessAportes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoIessAportes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoIessAportes();
		
		this.inicializarActualizarBindingBotonesManualProcesoIessAportes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessAportes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessAportes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessAportes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessAportes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoIessAportes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoIessAportes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoIessAportes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionNuevoProcesoIessAportes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionSinCerrarProcesoIessAportes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionSinMensajeProcesoIessAportes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoIessAportes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoIessAportes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoIessAportes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionNuevoProcesoIessAportes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionSinCerrarProcesoIessAportes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoIessAportes.jCheckBoxPostAccionSinMensajeProcesoIessAportes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoIessAportes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoIessAportes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoIessAportes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoIessAportes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoIessAportes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoIessAportes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoIessAportes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoIessAportes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoIessAportes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoIessAportes(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoIessAportes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoIessAportes() throws Exception {
		try	{
			if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessAportes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessAportes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoIessAportes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoIessAportes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoIessAportes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoIessAportes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoIessAportes.addItem(reporte);
			}
			
			
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoIessAportes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoIessAportes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoIessAportes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoIessAportes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoIessAportes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoIessAportes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoIessAportes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessAportes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoIessAportes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoIessAportesConstantesFunciones.getTiposSeleccionarProcesoIessAportes(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoIessAportesConstantesFunciones.getTiposSeleccionarProcesoIessAportes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoIessAportesConstantesFunciones.getTiposSeleccionarProcesoIessAportes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoIessAportes.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoIessAportes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()!=null){this.id_anioBusquedaProcesoIessAportes=((Anio)this.jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()!=null){this.id_mesBusquedaProcesoIessAportes=((Mes)this.jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()!=null){this.id_tipo_afiliacionBusquedaProcesoIessAportes=((TipoAfiliacion)this.jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()).getId();}
		if(this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()!=null){this.id_numero_patronalBusquedaProcesoIessAportes=((NumeroPatronal)this.jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.getSelectedItem()).getId();}
		this.porcentajeBusquedaProcesoIessAportes=Double.parseDouble(this.jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoIessAportes(Boolean esInicializar) throws Exception {				
		if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoIessAportes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoIessAportes() throws Exception {
		this.inicializarActualizarBindingTablaProcesoIessAportes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoIessAportes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoIessAportesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoIessAportes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoiessaportesLogic.getProcesoIessAportess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoiessaportess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoIessAportes.setModel(new ProcesoIessAportesModel(this.procesoiessaportesLogic.getProcesoIessAportess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoIessAportes.setModel(new ProcesoIessAportesModel(this.procesoiessaportess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoIessAportes!=null && this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoIessAportes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,procesoiessaportesConstantesFunciones.resaltarSeleccionarProcesoIessAportes,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,procesoiessaportesConstantesFunciones.resaltarSeleccionarProcesoIessAportes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_ID));

		if(this.procesoiessaportesConstantesFunciones.mostraridProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoiessaportesConstantesFunciones.resaltaridProcesoIessAportes,this.procesoiessaportesConstantesFunciones.activaridProcesoIessAportes,iSizeTabla,this,true,"idProcesoIessAportes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoiessaportesConstantesFunciones.resaltaridProcesoIessAportes,this.procesoiessaportesConstantesFunciones.activaridProcesoIessAportes,this,true,"idProcesoIessAportes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDANIO));

		if(this.procesoiessaportesConstantesFunciones.mostrarid_anioProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_anioProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_anioProcesoIessAportes,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_anioProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_anioProcesoIessAportes,true,"id_anioProcesoIessAportes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDMES));

		if(this.procesoiessaportesConstantesFunciones.mostrarid_mesProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_mesProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_mesProcesoIessAportes,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_mesProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_mesProcesoIessAportes,true,"id_mesProcesoIessAportes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION));

		if(this.procesoiessaportesConstantesFunciones.mostrarid_tipo_afiliacionProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAfiliacionTableCell(this.tipoafiliacionsForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_tipo_afiliacionProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_tipo_afiliacionProcesoIessAportes,iSizeTabla));
			tableColumn.setCellEditor(new TipoAfiliacionTableCell(this.tipoafiliacionsForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_tipo_afiliacionProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_tipo_afiliacionProcesoIessAportes,true,"id_tipo_afiliacionProcesoIessAportes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL));

		if(this.procesoiessaportesConstantesFunciones.mostrarid_numero_patronalProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_numero_patronalProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_numero_patronalProcesoIessAportes,iSizeTabla));
			tableColumn.setCellEditor(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.procesoiessaportesConstantesFunciones.resaltarid_numero_patronalProcesoIessAportes,this,this.procesoiessaportesConstantesFunciones.activarid_numero_patronalProcesoIessAportes,true,"id_numero_patronalProcesoIessAportes","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE));

		if(this.procesoiessaportesConstantesFunciones.mostrarporcentajeProcesoIessAportes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoiessaportesConstantesFunciones.resaltarporcentajeProcesoIessAportes,this.procesoiessaportesConstantesFunciones.activarporcentajeProcesoIessAportes,iSizeTabla,this,true,"porcentajeProcesoIessAportes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoiessaportesConstantesFunciones.resaltarporcentajeProcesoIessAportes,this.procesoiessaportesConstantesFunciones.activarporcentajeProcesoIessAportes,this,true,"porcentajeProcesoIessAportes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoIessAportesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessAportes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoIessAportes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoIessAportes.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoIessAportes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoIessAportes.moveColumn(this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoIessAportes.moveColumn(this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoIessAportes.moveColumn(this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoIessAportes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoIessAportes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoIessAportes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoIessAportes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoIessAportes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoIessAportes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoiessaportesLogic.getProcesoIessAportess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoiessaportess.size()-1;
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
		//this.jTableDatosProcesoIessAportes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoIessAportes();
			
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
				
				//this.isEsNuevoProcesoIessAportes=false;
					
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
				if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoIessAportes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessAportes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoiessaportes.getsType().equals("DUPLICADO")
				   || this.procesoiessaportes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoIessAportes=true;
				
				} else {
					this.isEsNuevoProcesoIessAportes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoiessaportes.getId()>=0 && !this.procesoiessaportes.getIsNew()) {						
						this.isEsNuevoProcesoIessAportes=false;
						
					} else {
						this.isEsNuevoProcesoIessAportes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoIessAportes(esRelaciones);						
				
				this.seleccionarProcesoIessAportes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoiessaportes.getId()<0) {
					this.isEsNuevoProcesoIessAportes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoIessAportes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoIessAportes(evt,rowIndex);
				}	
				
				if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoIessAportes: " + this.dDif); 
					}
				}								
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoIessAportes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoiessaportes)) {
					if(this.procesoiessaportes.getId()>0) {
						this.procesoiessaportes.setIsDeleted(true);
						
						this.procesoiessaportessEliminados.add(this.procesoiessaportes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoiessaportesLogic.getProcesoIessAportess().remove(this.procesoiessaportes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoiessaportess.remove(this.procesoiessaportes);				
					}
					
					
					((ProcesoIessAportesModel) this.jTableDatosProcesoIessAportes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoIessAportes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoIessAportes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoIessAportes) {
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoIessAportes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoIessAportes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportes);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.procesoiessaportesConstantesFunciones.cargarid_anioProcesoIessAportes || this.procesoiessaportesConstantesFunciones.event_dependid_anioProcesoIessAportes) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.procesoiessaportes.getid_anio());
									//this.inicializarActualizarBindingProcesoIessAportes(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(procesoiessaportes.getAnio()!=null) {
							this.aniosForeignKey.add(procesoiessaportes.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.procesoiessaportes.getid_anio(),false,"Formulario");

					//Mes
					if(!this.procesoiessaportesConstantesFunciones.cargarid_mesProcesoIessAportes || this.procesoiessaportesConstantesFunciones.event_dependid_mesProcesoIessAportes) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.procesoiessaportes.getid_mes());
									//this.inicializarActualizarBindingProcesoIessAportes(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(procesoiessaportes.getMes()!=null) {
							this.messForeignKey.add(procesoiessaportes.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.procesoiessaportes.getid_mes(),false,"Formulario");

					//TipoAfiliacion
					if(!this.procesoiessaportesConstantesFunciones.cargarid_tipo_afiliacionProcesoIessAportes || this.procesoiessaportesConstantesFunciones.event_dependid_tipo_afiliacionProcesoIessAportes) {
						//this.cargarCombosTipoAfiliacionsForeignKeyLista(" where id="+this.procesoiessaportes.getid_tipo_afiliacion());
									//this.inicializarActualizarBindingProcesoIessAportes(false,false);
						this.tipoafiliacionsForeignKey=new ArrayList<TipoAfiliacion>();

						if(procesoiessaportes.getTipoAfiliacion()!=null) {
							this.tipoafiliacionsForeignKey.add(procesoiessaportes.getTipoAfiliacion());
						}

						this.addItemDefectoCombosForeignKeyTipoAfiliacion();
						this.cargarCombosFrameTipoAfiliacionsForeignKey("Todos");
					}
					this.setActualTipoAfiliacionForeignKey(this.procesoiessaportes.getid_tipo_afiliacion(),false,"Formulario");

					//NumeroPatronal
					if(!this.procesoiessaportesConstantesFunciones.cargarid_numero_patronalProcesoIessAportes || this.procesoiessaportesConstantesFunciones.event_dependid_numero_patronalProcesoIessAportes) {
						//this.cargarCombosNumeroPatronalsForeignKeyLista(" where id="+this.procesoiessaportes.getid_numero_patronal());
									//this.inicializarActualizarBindingProcesoIessAportes(false,false);
						this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

						if(procesoiessaportes.getNumeroPatronal()!=null) {
							this.numeropatronalsForeignKey.add(procesoiessaportes.getNumeroPatronal());
						}

						this.addItemDefectoCombosForeignKeyNumeroPatronal();
						this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
					}
					this.setActualNumeroPatronalForeignKey(this.procesoiessaportes.getid_numero_patronal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoIessAportes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoIessAportes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoIessAportes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessAportes(ProcesoIessAportes procesoiessaportes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoIessAportes(procesoiessaportes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoIessAportes(procesoiessaportes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoIessAportes(procesoiessaportes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessAportes(procesoiessaportes);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoIessAportes(ProcesoIessAportes procesoiessaportes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setText(procesoiessaportes.getId().toString());
			this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setText(procesoiessaportes.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoIessAportes procesoiessaportesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoiessaportesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoIessAportes procesoiessaportesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoiessaportesLocal=this.procesoiessaportes;
			} else {
				procesoiessaportesLocal=this.procesoiessaportesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoiessaportesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoIessAportes(procesoiessaportesLocal,true);
					
					if(procesoiessaportesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoiessaportesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoiessaportesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessAportes(procesoiessaportes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(procesoiessaportes);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoIessAportes(procesoiessaportes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.getText()==null || this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.getText()=="" || this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setText("0");
			}

			if(conColumnasBase) {procesoiessaportes.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoIessAportesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelIdProcesoIessAportes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoiessaportes.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoIessAportes.jLabelporcentajeProcesoIessAportes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoIessAportes(ProcesoIessAportes procesoiessaportesBean,ProcesoIessAportes procesoiessaportes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoIessAportes(ProcesoIessAportes procesoiessaportesOrigen,ProcesoIessAportes procesoiessaportes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessaportesOrigen.getId()!=null && !procesoiessaportesOrigen.getId().equals(0L))) {procesoiessaportes.setId(procesoiessaportesOrigen.getId());}}
			if(conDefault || (!conDefault && procesoiessaportesOrigen.getporcentaje()!=null && !procesoiessaportesOrigen.getporcentaje().equals(0.0))) {procesoiessaportes.setporcentaje(procesoiessaportesOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessAportes(ProcesoIessAportes procesoiessaportes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setText(procesoiessaportes.getId().toString());
			this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setText(procesoiessaportes.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoIessAportes(ProcesoIessAportesBean procesoiessaportesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setText(procesoiessaportesBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setText(procesoiessaportesBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoIessAportes(ProcesoIessAportesParameterReturnGeneral procesoiessaportesReturnGeneral,ProcesoIessAportesBean procesoiessaportesBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoIessAportes procesoiessaportesLocal=new ProcesoIessAportes();
			
			procesoiessaportesLocal=procesoiessaportesReturnGeneral.getProcesoIessAportes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoiessaportesLocal.getId()!=null && !procesoiessaportesLocal.getId().equals(0L))) {procesoiessaportesBean.setId(procesoiessaportesLocal.getId());}}
			if(conDefault || (!conDefault && procesoiessaportesLocal.getporcentaje()!=null && !procesoiessaportesLocal.getporcentaje().equals(0.0))) {procesoiessaportesBean.setporcentaje(procesoiessaportesLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoIessAportesGenerico(Long idProcesoIessAportesSeleccionado,JComboBox jComboBoxProcesoIessAportes,List<ProcesoIessAportes> procesoiessaportessLocal)throws Exception {
		try {
			ProcesoIessAportes  procesoiessaportesTemp=null;

			for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessLocal) {
				if(procesoiessaportesAux.getId()!=null && procesoiessaportesAux.getId().equals(idProcesoIessAportesSeleccionado)) {
					procesoiessaportesTemp=procesoiessaportesAux;
					break;
				}
			}

			jComboBoxProcesoIessAportes.setSelectedItem(procesoiessaportesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoIessAportesGenerico(JComboBox jComboBoxProcesoIessAportes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessAportes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoIessAportes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoIessAportes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoIessAportes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoIessAportes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoIessAportes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessaportes=(ProcesoIessAportes) procesoiessaportesLogic.getProcesoIessAportess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessaportes =(ProcesoIessAportes) procesoiessaportess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!procesoiessaportes.getIsNew() && !procesoiessaportes.getIsChanged() && !procesoiessaportes.getIsDeleted()) {
				sDescripcion=procesoiessaportes.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessaportes.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!procesoiessaportes.getIsNew() && !procesoiessaportes.getIsChanged() && !procesoiessaportes.getIsDeleted()) {
				sDescripcion=procesoiessaportes.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessaportes.getmes_descripcion();
			}
		}

		if(sTipo.equals("TipoAfiliacion")) {
			//sDescripcion=this.getActualTipoAfiliacionForeignKeyDescripcion((Long)value);
			if(!procesoiessaportes.getIsNew() && !procesoiessaportes.getIsChanged() && !procesoiessaportes.getIsDeleted()) {
				sDescripcion=procesoiessaportes.gettipoafiliacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAfiliacionForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessaportes.gettipoafiliacion_descripcion();
			}
		}

		if(sTipo.equals("NumeroPatronal")) {
			//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
			if(!procesoiessaportes.getIsNew() && !procesoiessaportes.getIsChanged() && !procesoiessaportes.getIsDeleted()) {
				sDescripcion=procesoiessaportes.getnumeropatronal_descripcion();
			} else {
				//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
				sDescripcion=procesoiessaportes.getnumeropatronal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoIessAportes procesoiessaportesRow=new ProcesoIessAportes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessaportesRow=(ProcesoIessAportes) procesoiessaportesLogic.getProcesoIessAportess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoiessaportesRow=(ProcesoIessAportes) procesoiessaportess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoIessAportes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));			
			this.jButtonDuplicarProcesoIessAportes.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessAportes && this.isPermisoDuplicarProcesoIessAportes));			
			this.jButtonCopiarProcesoIessAportes.setVisible((this.isVisibilidadCeldaCopiarProcesoIessAportes && this.isPermisoCopiarProcesoIessAportes));
			this.jButtonVerFormProcesoIessAportes.setVisible((this.isVisibilidadCeldaVerFormProcesoIessAportes && this.isPermisoVerFormProcesoIessAportes));
			
			this.jButtonAbrirOrderByProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));			
			
			this.jButtonNuevoRelacionesProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));			
			this.jButtonNuevoGuardarCambiosProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarProcesoIessAportes.setVisible((this.isVisibilidadCeldaModificarProcesoIessAportes && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.setVisible((this.isVisibilidadCeldaActualizarProcesoIessAportes && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.setVisible((this.isVisibilidadCeldaEliminarProcesoIessAportes && this.isPermisoEliminarProcesoIessAportes));
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.setVisible(this.isVisibilidadCeldaCancelarProcesoIessAportes);							
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));						
			this.jButtonDuplicarToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessAportes && this.isPermisoDuplicarProcesoIessAportes));						
			this.jButtonCopiarToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaCopiarProcesoIessAportes && this.isPermisoCopiarProcesoIessAportes));			
			this.jButtonVerFormToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaVerFormProcesoIessAportes && this.isPermisoVerFormProcesoIessAportes));			
			this.jButtonAbrirOrderByToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));
			this.jButtonNuevoRelacionesToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));			
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaModificarProcesoIessAportes && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaActualizarProcesoIessAportes  && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaEliminarProcesoIessAportes && this.isPermisoEliminarProcesoIessAportes));
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarToolBarProcesoIessAportes.setVisible(this.isVisibilidadCeldaCancelarProcesoIessAportes);				
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));			
			this.jMenuItemDuplicarProcesoIessAportes.setVisible((this.isVisibilidadCeldaDuplicarProcesoIessAportes && this.isPermisoDuplicarProcesoIessAportes));			
			this.jMenuItemCopiarProcesoIessAportes.setVisible((this.isVisibilidadCeldaCopiarProcesoIessAportes && this.isPermisoCopiarProcesoIessAportes));			
			this.jMenuItemVerFormProcesoIessAportes.setVisible((this.isVisibilidadCeldaVerFormProcesoIessAportes && this.isPermisoVerFormProcesoIessAportes));			
			this.jMenuItemAbrirOrderByProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));			
			//this.jMenuItemMostrarOcultarProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));
			this.jMenuItemDetalleAbrirOrderByProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));			
			//this.jMenuItemDetalleMostrarOcultarProcesoIessAportes.setVisible((this.isVisibilidadCeldaOrdenProcesoIessAportes && this.isPermisoOrdenProcesoIessAportes));			
			this.jMenuItemNuevoRelacionesProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes));			
			this.jMenuItemNuevoGuardarCambiosProcesoIessAportes.setVisible((this.isVisibilidadCeldaNuevoProcesoIessAportes && this.isPermisoNuevoProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));									
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemModificarProcesoIessAportes.setVisible((this.isVisibilidadCeldaModificarProcesoIessAportes && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemActualizarProcesoIessAportes.setVisible((this.isVisibilidadCeldaActualizarProcesoIessAportes && this.isPermisoActualizarProcesoIessAportes));	
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemEliminarProcesoIessAportes.setVisible((this.isVisibilidadCeldaEliminarProcesoIessAportes && this.isPermisoEliminarProcesoIessAportes));
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemCancelarProcesoIessAportes.setVisible(this.isVisibilidadCeldaCancelarProcesoIessAportes);				
			}
			
			this.jMenuItemGuardarCambiosProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));						
			this.jMenuItemGuardarCambiosTablaProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=this.jButtonNuevoProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoIessAportes=this.jButtonDuplicarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaCopiarProcesoIessAportes=this.jButtonCopiarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaVerFormProcesoIessAportes=this.jButtonVerFormProcesoIessAportes.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoIessAportes=this.jButtonAbrirOrderByProcesoIessAportes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=this.jButtonNuevoRelacionesProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaModificarProcesoIessAportes=this.jButtonModificarProcesoIessAportes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.isVisibilidadCeldaActualizarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaGuardarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=this.jButtonGuardarCambiosTablaProcesoIessAportes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoIessAportes=this.jButtonNuevoToolBarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=this.jButtonNuevoRelacionesToolBarProcesoIessAportes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.isVisibilidadCeldaModificarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarToolBarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarToolBarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarToolBarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarToolBarProcesoIessAportes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessAportes=this.jButtonGuardarCambiosToolBarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoIessAportes=this.jMenuItemNuevoProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=this.jMenuItemNuevoRelacionesProcesoIessAportes.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.isVisibilidadCeldaModificarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemModificarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaActualizarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemActualizarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaEliminarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemEliminarProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaCancelarProcesoIessAportes=this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemCancelarProcesoIessAportes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoIessAportes=this.jMenuItemGuardarCambiosProcesoIessAportes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=this.jMenuItemGuardarCambiosTablaProcesoIessAportes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoIessAportes(Boolean esInicializar) {
		if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessAportes();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoIessAportes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoIessAportes() {
		this.jButtonNuevoProcesoIessAportes.setVisible(this.isPermisoNuevoProcesoIessAportes);			
		this.jButtonDuplicarProcesoIessAportes.setVisible(this.isPermisoDuplicarProcesoIessAportes);			
		this.jButtonCopiarProcesoIessAportes.setVisible(this.isPermisoCopiarProcesoIessAportes);			
		this.jButtonVerFormProcesoIessAportes.setVisible(this.isPermisoVerFormProcesoIessAportes);			
		
		this.jButtonAbrirOrderByProcesoIessAportes.setVisible(this.isPermisoOrdenProcesoIessAportes);					
		
		this.jButtonNuevoRelacionesProcesoIessAportes.setVisible(this.isPermisoNuevoProcesoIessAportes);			
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarProcesoIessAportes.setVisible(this.isPermisoActualizarProcesoIessAportes);	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.setVisible(this.isPermisoActualizarProcesoIessAportes);	
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.setVisible(this.isPermisoEliminarProcesoIessAportes);
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.setVisible(this.isVisibilidadCeldaCancelarProcesoIessAportes);						
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.setVisible(this.isPermisoGuardarCambiosProcesoIessAportes);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.setVisible(this.isPermisoActualizarProcesoIessAportes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessAportes() {
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarProcesoIessAportes.setVisible(this.isPermisoActualizarProcesoIessAportes);	
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.setVisible(this.isPermisoActualizarProcesoIessAportes);	
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.setVisible(this.isPermisoEliminarProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.setVisible(this.isVisibilidadCeldaCancelarProcesoIessAportes);							
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.setVisible((this.isVisibilidadCeldaGuardarProcesoIessAportes && this.isPermisoGuardarCambiosProcesoIessAportes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoIessAportes() {
		if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoIessAportes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoIessAportes() {
	}
	
	public void jTableDatosProcesoIessAportesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoIessAportes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoiessaportes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioProcesoIessAportesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebProcesoIessAportes(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessAportes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessAportes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.procesoiessaportesLogic.getConnexion());

				if(this.procesoiessaportes.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.procesoiessaportes.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessAportes=(TitledBorder)this.jScrollPanelDatosProcesoIessAportes.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderProcesoIessAportes.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.procesoiessaportes.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesProcesoIessAportesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebProcesoIessAportes(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessAportes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessAportes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.procesoiessaportesLogic.getConnexion());

				if(this.procesoiessaportes.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.procesoiessaportes.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessAportes=(TitledBorder)this.jScrollPanelDatosProcesoIessAportes.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderProcesoIessAportes.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.procesoiessaportes.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_afiliacionProcesoIessAportesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoafiliacion=true;

			idTienePermisotipoafiliacion=this.tienePermisosUsuarioEnPaginaWebProcesoIessAportes(TipoAfiliacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoafiliacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessAportes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessAportes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);

				this.tipoafiliacionBeanSwingJInternalFrame=new TipoAfiliacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoafiliacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoafiliacionBeanSwingJInternalFrame.getTipoAfiliacionLogic().setConnexion(this.procesoiessaportesLogic.getConnexion());

				if(this.procesoiessaportes.getid_tipo_afiliacion()!=null) {
					this.tipoafiliacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoafiliacionBeanSwingJInternalFrame.setIdActual(this.procesoiessaportes.getid_tipo_afiliacion());
					this.tipoafiliacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoafiliacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoafiliacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAfiliacion();
				}

				JInternalFrameBase jinternalFrame =this.tipoafiliacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessAportes=(TitledBorder)this.jScrollPanelDatosProcesoIessAportes.getBorder();
				TitledBorder titledBordertipoafiliacion=(TitledBorder)this.tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.getBorder();

				titledBordertipoafiliacion.setTitle(titledBorderProcesoIessAportes.getTitle() + " -> Tipo Afiliacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_afiliacionProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getid_tipo_afiliacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_afiliacion = "+this.procesoiessaportes.getid_tipo_afiliacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_numero_patronalProcesoIessAportesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonumeropatronal=true;

			idTienePermisonumeropatronal=this.tienePermisosUsuarioEnPaginaWebProcesoIessAportes(NumeroPatronalConstantesFunciones.CLASSNAME);

			if(idTienePermisonumeropatronal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoIessAportes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoIessAportes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);

				this.numeropatronalBeanSwingJInternalFrame=new NumeroPatronalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.numeropatronalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.numeropatronalBeanSwingJInternalFrame.getNumeroPatronalLogic().setConnexion(this.procesoiessaportesLogic.getConnexion());

				if(this.procesoiessaportes.getid_numero_patronal()!=null) {
					this.numeropatronalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.numeropatronalBeanSwingJInternalFrame.setIdActual(this.procesoiessaportes.getid_numero_patronal());
					this.numeropatronalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroPatronal();
				}

				JInternalFrameBase jinternalFrame =this.numeropatronalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoIessAportes=(TitledBorder)this.jScrollPanelDatosProcesoIessAportes.getBorder();
				TitledBorder titledBordernumeropatronal=(TitledBorder)this.numeropatronalBeanSwingJInternalFrame.jScrollPanelDatosNumeroPatronal.getBorder();

				titledBordernumeropatronal.setTitle(titledBorderProcesoIessAportes.getTitle() + " -> Numero Patronal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_numero_patronalProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getid_numero_patronal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_numero_patronal = "+this.procesoiessaportes.getid_numero_patronal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProcesoIessAportesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.getprocesoiessaportes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoiessaportes==null) {
						this.procesoiessaportes = new ProcesoIessAportes();
					}

					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);
				}

				if(this.procesoiessaportes.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.procesoiessaportes.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoIessAportes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoIessAportesProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessAportes(false,false);

			this.getProcesoIessAportessBusquedaProcesoIessAportes();

			this.inicializarActualizarBindingProcesoIessAportes(false);

			//if(ProcesoIessAportesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessAportes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessAportes(false,false);

			this.getProcesoIessAportessFK_IdAnio();

			this.inicializarActualizarBindingProcesoIessAportes(false);

			//if(ProcesoIessAportesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessAportes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessAportes(false,false);

			this.getProcesoIessAportessFK_IdMes();

			this.inicializarActualizarBindingProcesoIessAportes(false);

			//if(ProcesoIessAportesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessAportes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNumeroPatronalProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessAportes(false,false);

			this.getProcesoIessAportessFK_IdNumeroPatronal();

			this.inicializarActualizarBindingProcesoIessAportes(false);

			//if(ProcesoIessAportesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessAportes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoAfiliacionProcesoIessAportesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoIessAportes(false,false);

			this.getProcesoIessAportessFK_IdTipoAfiliacion();

			this.inicializarActualizarBindingProcesoIessAportes(false);

			//if(ProcesoIessAportesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoIessAportes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoiessaportesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoIessAportes() {
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
			this.jInternalFrameDetalleFormProcesoIessAportes.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoIessAportes.dispose();
			this.jInternalFrameDetalleFormProcesoIessAportes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
			this.jInternalFrameReporteDinamicoProcesoIessAportes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoIessAportes.dispose();
			this.jInternalFrameReporteDinamicoProcesoIessAportes=null;
		}
		
		if(this.jInternalFrameImportacionProcesoIessAportes!=null) {
			this.jInternalFrameImportacionProcesoIessAportes.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoIessAportes.dispose();
			this.jInternalFrameImportacionProcesoIessAportes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoIessAportes();
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoIessAportes")) {
				jButtonDuplicarProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoIessAportes")) {
				jButtonCopiarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoIessAportes")) {
				jButtonVerFormProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoIessAportes")) {
				jButtonDuplicarProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoIessAportes")) {
				jButtonDuplicarProcesoIessAportesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoIessAportes")) {
				jButtonModificarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoIessAportes")) {
				jButtonModificarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoIessAportes")) {
				jButtonModificarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoIessAportes")) {
				jButtonActualizarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoIessAportes")) {
				jButtonActualizarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoIessAportes")) {
				jButtonActualizarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoIessAportes")) {
				jButtonEliminarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoIessAportes")) {
				jButtonEliminarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoIessAportes")) {
				jButtonEliminarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoIessAportes")) {
				jButtonCancelarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoIessAportes")) {
				jButtonCancelarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoIessAportes")) {
				jButtonCancelarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoIessAportes")) {
				jButtonCerrarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoIessAportes")) {
				jButtonCerrarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoIessAportes")) {
				jButtonCerrarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoIessAportes")) {
				jButtonMostrarOcultarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoIessAportes")) {
				jButtonCancelarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoIessAportes")) {
				jButtonCopiarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoIessAportes")) {
				jButtonVerFormProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoIessAportes")) {
				jButtonCopiarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoIessAportes")) {
				jButtonVerFormProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoIessAportes")) {
				jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoIessAportes")) {
				jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoIessAportes")) {
				jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoIessAportes")) {
				jButtonAnterioresProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoIessAportes")) {
				jButtonAnterioresProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoIessAportes")) {
				jButtonAnterioresProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoIessAportes")) {
				jButtonSiguientesProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoIessAportes")) {
				jButtonSiguientesProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoIessAportes")) {
				jButtonSiguientesProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoIessAportes") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoIessAportes")) {
				jButtonAbrirOrderByProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoIessAportes") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoIessAportes")) {
				jButtonMostrarOcultarProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessAportes")) {
				jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoIessAportes")) {
				jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoIessAportes")) {
				jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoIessAportes")) {
				jButtonProcesarInformacionProcesoIessAportesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoIessAportes")) {
				jButtonCerrarReporteDinamicoProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoIessAportes")) {
				jButtonGenerarReporteDinamicoProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoIessAportes")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoIessAportes")) {
				jButtonCerrarImportacionProcesoIessAportesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoIessAportes")) {
				
				jButtonGenerarImportacionProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoIessAportes")) {
				
				jButtonAbrirImportacionProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoIessAportes")) {
				jComboBoxTiposAccionesProcesoIessAportesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoIessAportes")) {
				jComboBoxTiposRelacionesProcesoIessAportesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoIessAportes")) {
				jComboBoxTiposAccionesProcesoIessAportesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoIessAportes")) {
				
				jComboBoxTiposSeleccionarProcesoIessAportesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoIessAportes")) {
				jTextFieldValorCampoGeneralProcesoIessAportesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoIessAportes")) {
				jButtonAbrirOrderByProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoIessAportes")) {
				jButtonAbrirOrderByProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoIessAportes")) {
				jButtonCerrarOrderByProcesoIessAportesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessAportesBusqueda")) {
				this.jButtonidProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessAportesUpdate")) {
				this.jButtonid_anioProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessAportesBusqueda")) {
				this.jButtonid_anioProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoIessAportesUpdate")) {
				this.jButtonid_mesProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoIessAportesBusqueda")) {
				this.jButtonid_mesProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_afiliacionProcesoIessAportesUpdate")) {
				this.jButtonid_tipo_afiliacionProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_afiliacionProcesoIessAportesBusqueda")) {
				this.jButtonid_tipo_afiliacionProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessAportesUpdate")) {
				this.jButtonid_numero_patronalProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessAportesBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProcesoIessAportesBusqueda")) {
				this.jButtonporcentajeProcesoIessAportesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoIessAportesProcesoIessAportes")) {
				this.jButtonBusquedaProcesoIessAportesProcesoIessAportesActionPerformed(evt);
			}
			
			;
			
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoIessAportes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoIessAportes procesoiessaportesLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoiessaportesLocal=this.procesoiessaportes;
			} else {
				procesoiessaportesLocal=this.procesoiessaportesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
							
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
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
			
			


			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
								
						
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
								
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
							
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
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
			
			


			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
								
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoIessAportes")) {
					jCheckBoxSeleccionarTodosProcesoIessAportesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoIessAportes")) {
					jCheckBoxSeleccionadosProcesoIessAportesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoIessAportes")) {
					
				}
				
				


				
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
												
				
				


				
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
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
			
			


			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoIessAportesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoiessaportes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoiessaportes);
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
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
				
				


				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoIessAportes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoIessAportes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoIessAportesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoiessaportesAnterior =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoIessAportes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoIessAportesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoIessAportes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoiessaportes =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoiessaportes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoIessAportes")) {
				
				}
				
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoIessAportes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoIessAportes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoIessAportes")) {
			
			}
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoIessAportes();
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoIessAportes")) {
				jButtonDuplicarProcesoIessAportesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoIessAportes")) {
				jButtonCopiarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoIessAportes")) {
				jButtonVerFormProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoIessAportes")) {
				jButtonNuevoProcesoIessAportesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoIessAportes")) {
				jButtonModificarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoIessAportes")) {
				jButtonActualizarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoIessAportes")) {
				jButtonEliminarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoIessAportes")) {
				jButtonCancelarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoIessAportes")) {
				jButtonCerrarProcesoIessAportesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoIessAportes")) {
				jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoIessAportes")) {
				jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoIessAportes")) {
				jButtonAbrirOrderByProcesoIessAportesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoIessAportes")) {
				jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoIessAportes")) {
				jButtonAnterioresProcesoIessAportesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoIessAportes")) {
				jButtonSiguientesProcesoIessAportesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoIessAportesBusqueda")) {
				this.jButtonidProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioProcesoIessAportesUpdate")) {
				this.jButtonid_anioProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioProcesoIessAportesBusqueda")) {
				this.jButtonid_anioProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesProcesoIessAportesUpdate")) {
				this.jButtonid_mesProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesProcesoIessAportesBusqueda")) {
				this.jButtonid_mesProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_afiliacionProcesoIessAportesUpdate")) {
				this.jButtonid_tipo_afiliacionProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_afiliacionProcesoIessAportesBusqueda")) {
				this.jButtonid_tipo_afiliacionProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessAportesUpdate")) {
				this.jButtonid_numero_patronalProcesoIessAportesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalProcesoIessAportesBusqueda")) {
				this.jButtonid_numero_patronalProcesoIessAportesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProcesoIessAportesBusqueda")) {
				this.jButtonporcentajeProcesoIessAportesBusquedaActionPerformed(evt);
			}
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoIessAportes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoIessAportes")) {
				closingInternalFrameProcesoIessAportes();
				
			} else if(sTipo.equals("jButtonCancelarProcesoIessAportes")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoIessAportes = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoIessAportesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessAportesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessAportes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoIessAportesActionPerformed(null);
			}
			
			ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoiessaportes,new Object(),this.procesoiessaportesParameterGeneral,this.procesoiessaportesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoIessAportes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoIessAportes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoIessAportes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoiessaportes)) {
			if(!esControlTabla) {
				if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);			
				}
				
				if(this.procesoiessaportesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoIessAportes(this.procesoiessaportes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoIessAportes(this.procesoiessaportesReturnGeneral,this.procesoiessaportesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoiessaportesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessAportes(classes,this.procesoiessaportesReturnGeneral,this.procesoiessaportesBean,false);
					}
						
					if(this.procesoiessaportesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes());	
					}
						
					if(this.procesoiessaportesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportesReturnGeneral.getProcesoIessAportes(),classes);//this.procesoiessaportesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoIessAportes(this.procesoiessaportes,classes);//this.procesoiessaportesBean);									
				}
			
				if(ProcesoIessAportesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoIessAportes(this.procesoiessaportes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoIessAportes(this.procesoiessaportes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoiessaportesAnterior!=null) {
						this.procesoiessaportes=this.procesoiessaportesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoiessaportesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoiessaportesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoiessaportesReturnGeneral.getProcesoIessAportes(),procesoiessaportesLogic.getProcesoIessAportess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoiessaportesReturnGeneral.getProcesoIessAportes(),this.procesoiessaportess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoIessAportes.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoIessAportes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoIessAportes();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoIessAportes() throws Exception {
		
		ProcesoIessAportesModel procesoiessaportesModel=(ProcesoIessAportesModel)this.jTableDatosProcesoIessAportes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoiessaportesModel.procesoiessaportess=this.procesoiessaportesLogic.getProcesoIessAportess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoiessaportesModel.procesoiessaportess=this.procesoiessaportess;
		}
		
		
		((ProcesoIessAportesModel) this.jTableDatosProcesoIessAportes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoIessAportes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoiessaportesAnterior(),this.procesoiessaportesLogic.getProcesoIessAportess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoiessaportesAnterior(),this.procesoiessaportess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoIessAportes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoIessAportes(ProcesoIessAportes procesoiessaportes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
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
										
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessaportes,new Object(),generalEntityParameterGeneral,this.procesoiessaportesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoiessaportesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoIessAportesConstantesFunciones.getClassesRelationshipsOfProcesoIessAportes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoIessAportesConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoIessAportes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoIessAportes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoIessAportesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoiessaportes,new Object(),generalEntityParameterGeneral,this.procesoiessaportesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoIessAportes(ProcesoIessAportesBean procesoiessaportesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoIessAportes(ArrayList<Classe> classes,ProcesoIessAportesReturnGeneral procesoiessaportesReturnGeneral,ProcesoIessAportesBean procesoiessaportesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoIessAportes(ProcesoIessAportes procesoiessaportes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoiessaportes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoIessAportes = new ProcesoIessAportesDetalleFormJInternalFrame(jDesktopPane,this.procesoiessaportesSessionBean.getConGuardarRelaciones(),this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.setVisible(false);
		this.jInternalFrameDetalleFormProcesoIessAportes.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoIessAportes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoIessAportes.procesoiessaportesLogic=this.procesoiessaportesLogic;
		
		this.cargarCombosFrameForeignKeyProcesoIessAportes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoIessAportes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoIessAportes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoIessAportes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoIessAportes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoIessAportes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessAportes"));
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessAportes"));

		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessAportes"));
					
		this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemModificarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessAportes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessAportes"));
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessAportes"));
						
		this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemActualizarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessAportes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessAportes"));
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessAportes"));
								
		this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemEliminarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessAportes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessAportes"));
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessAportes"));
					
		this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemCancelarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessAportes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemDetalleCerrarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessAportes"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessAportes"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessAportes"));
		
		
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessAportes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonidProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonporcentajeProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoIessAportesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessAportes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoIessAportes"));
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoIessAportes"));
		}
		
		this.jTableDatosProcesoIessAportes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoIessAportes"));
		
		this.jTableDatosProcesoIessAportes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoIessAportes"));
		
		this.jButtonNuevoProcesoIessAportes.addActionListener(new ButtonActionListener(this,"NuevoProcesoIessAportes"));
		
		this.jButtonDuplicarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"DuplicarProcesoIessAportes"));
		
		this.jButtonCopiarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"CopiarProcesoIessAportes"));
		
		this.jButtonVerFormProcesoIessAportes.addActionListener(new ButtonActionListener(this,"VerFormProcesoIessAportes"));
		
		
		this.jButtonNuevoToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoIessAportes"));
			
		this.jButtonDuplicarToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoIessAportes"));
			
		this.jMenuItemNuevoProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoIessAportes"));
			
		this.jMenuItemDuplicarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoIessAportes"));		
		
		
		this.jButtonNuevoRelacionesProcesoIessAportes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoIessAportes"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoIessAportes"));
			
		this.jMenuItemNuevoRelacionesProcesoIessAportes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoIessAportes"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ModificarProcesoIessAportes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonModificarToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoIessAportes"));
			
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemModificarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoIessAportes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"ActualizarProcesoIessAportes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonActualizarToolBarProcesoIessAportes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoIessAportes"));
				
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemActualizarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoIessAportes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"EliminarProcesoIessAportes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonEliminarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoIessAportes"));
						
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemEliminarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoIessAportes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CancelarProcesoIessAportes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonCancelarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoIessAportes"));
			
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemCancelarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoIessAportes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoIessAportes"));		
		
		
		this.jButtonCerrarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CerrarProcesoIessAportes"));
		
		
		this.jButtonCerrarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoIessAportes"));
			
		this.jMenuItemCerrarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoIessAportes"));
			
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jMenuItemDetalleCerrarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoIessAportes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoIessAportes"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoIessAportes"));
		}
		
		this.jButtonCopiarToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoIessAportes"));
			
		this.jButtonVerFormToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoIessAportes"));
		
		this.jMenuItemGuardarCambiosProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoIessAportes"));
			
		this.jMenuItemCopiarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoIessAportes"));		
		
		this.jMenuItemVerFormProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoIessAportes"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessAportes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoIessAportes"));
			
		this.jMenuItemGuardarCambiosTablaProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoIessAportes"));		
		
		
		
		this.jButtonRecargarInformacionProcesoIessAportes.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoIessAportes"));
					
		this.jButtonRecargarInformacionToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoIessAportes"));
		
		this.jMenuItemRecargarInformacionProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoIessAportes"));		
		
		
		
		this.jButtonAnterioresProcesoIessAportes.addActionListener (new ButtonActionListener(this,"AnterioresProcesoIessAportes"));
		
		
		this.jButtonAnterioresToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoIessAportes"));
		
		this.jMenuItemAnterioresProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoIessAportes"));		
		
		
		this.jButtonSiguientesProcesoIessAportes.addActionListener (new ButtonActionListener(this,"SiguientesProcesoIessAportes"));
		
		
		this.jButtonSiguientesToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoIessAportes"));
			
		this.jMenuItemSiguientesProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoIessAportes"));
			
		this.jMenuItemAbrirOrderByProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoIessAportes"));
			
		this.jMenuItemMostrarOcultarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoIessAportes"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoIessAportes"));
			
		this.jMenuItemDetalleMostarOcultarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoIessAportes"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoIessAportes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoIessAportes"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoIessAportes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoIessAportes"));		
		
		
		this.jButtonProcesarInformacionProcesoIessAportes.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoIessAportes"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoIessAportes"));

		this.jCheckBoxSeleccionadosProcesoIessAportes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoIessAportes"));
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoIessAportes"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoIessAportes.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoIessAportes"));
			
		this.jComboBoxTiposAccionesProcesoIessAportes.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoIessAportes"));
					
		this.jComboBoxTiposSeleccionarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoIessAportes"));
			
		this.jTextFieldValorCampoGeneralProcesoIessAportes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoIessAportes"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonidProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonporcentajeProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoIessAportesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoIessAportesProcesoIessAportes.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessAportesProcesoIessAportes"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoIessAportes!=null) {
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessAportes"));
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessAportes"));
				this.jInternalFrameReporteDinamicoProcesoIessAportes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessAportes"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoIessAportes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoIessAportes"));				
			//this.jButtonGenerarReporteDinamicoProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoIessAportes"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoIessAportes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoIessAportes!=null) {
				this.jInternalFrameImportacionProcesoIessAportes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoIessAportes"));
				this.jInternalFrameImportacionProcesoIessAportes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoIessAportes"));
				this.jInternalFrameImportacionProcesoIessAportes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoIessAportes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoIessAportes.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoIessAportes"));
			
			this.jButtonAbrirOrderByToolBarProcesoIessAportes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoIessAportes"));			
			
			if(this.jInternalFrameOrderByProcesoIessAportes!=null) {
				this.jInternalFrameOrderByProcesoIessAportes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoIessAportes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoIessAportes.jTabbedPaneRelacionesProcesoIessAportes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoIessAportes"));
		
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
            		closingInternalFrameProcesoIessAportes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoIessAportes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoIessAportes = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoIessAportesBeanSwingJInternalFrame jInternalFrameParent=(ProcesoIessAportesBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoIessAportes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoIessAportesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoIessAportes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoIessAportesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoIessAportes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoIessAportes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoIessAportes";
		inputMap = this.jButtonNuevoProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessAportesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoIessAportesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoIessAportes";
		inputMap = this.jButtonNuevoRelacionesProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoIessAportesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoIessAportes";
		inputMap = this.jButtonModificarProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoIessAportes";
		inputMap = this.jButtonActualizarProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoIessAportes";
		inputMap = this.jButtonEliminarProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoIessAportes";
		inputMap = this.jButtonCancelarProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoIessAportes";
		inputMap = this.jButtonCerrarProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoIessAportes";
		inputMap = this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonGuardarCambiosProcesoIessAportes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoIessAportesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoIessAportesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoIessAportes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoIessAportesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoIessAportes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoIessAportesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoIessAportes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoIessAportesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonidProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_anioProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_anioProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_mesProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_mesProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_tipo_afiliacionProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_afiliacionProcesoIessAportesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonid_numero_patronalProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalProcesoIessAportesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoIessAportes.jButtonporcentajeProcesoIessAportesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProcesoIessAportesBusqueda"));
		
		
		this.jButtonBusquedaProcesoIessAportesProcesoIessAportes.addActionListener(new ButtonActionListener(this,"BusquedaProcesoIessAportesProcesoIessAportes"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoIessAportes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoIessAportesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoIessAportesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoIessAportes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoIessAportes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
					procesoiessaportesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportess) {
					procesoiessaportesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoIessAportesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
						procesoiessaportesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportess) {
						procesoiessaportesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessAportes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessAportes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoIessAportesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoIessAportes.getSelectedRows();
			
			ProcesoIessAportes procesoiessaportesLocal=new ProcesoIessAportes();
			
			//this.seleccionarTodosProcesoIessAportes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoiessaportesLocal =(ProcesoIessAportes) this.procesoiessaportesLogic.getProcesoIessAportess().toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoiessaportesLocal =(ProcesoIessAportes) this.procesoiessaportess.toArray()[this.jTableDatosProcesoIessAportes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoiessaportesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
						procesoiessaportesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportess) {
						procesoiessaportesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoIessAportes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoIessAportes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoIessAportes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoIessAportesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoIessAportesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoIessAportesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoIessAportes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportesLogic.getProcesoIessAportess()) {
				
						if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							procesoiessaportesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportess) {
					
						if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							procesoiessaportesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoIessAportesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoIessAportes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoIessAportes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoIessAportes) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoIessAportes(conSplash);
				
					this.generarReporteProcesoIessAportessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoIessAportessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessAportessSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoIessAportessSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessAportes();
				
				this.exportarProcesoIessAportessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoIessAportess();
				//this.importarProcesoIessAportess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoIessAportes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoIessAportessSeleccionados();
				//this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Iess Aportes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoIessAportes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoIessAportes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoIessAportes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoIessAportesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoIessAportes) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoIessAportes(conSplash);
					
						//this.actualizarParametrosGeneralProcesoIessAportes();
						
						this.generarReporteProcesoAccionProcesoIessAportessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoIessAportesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Iess AportesES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Iess Aportes", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoIessAportes();
				
						this.actualizarParametrosGeneralProcesoIessAportes();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoiessaportesReturnGeneral=procesoiessaportesLogic.procesarAccionProcesoIessAportessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoiessaportesLogic.getProcesoIessAportess(),this.procesoiessaportesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoIessAportesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoIessAportes();
					
					ProcesoIessAportesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoIessAportesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoIessAportes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxTiposAccionesFormularioProcesoIessAportes.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoIessAportes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoIessAportesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoIessAportes();
			
			if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
			ProcesoIessAportes procesoiessaportes=new ProcesoIessAportes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoIessAportes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoIessAportes.getSelectedItem();
			
			
			
			
			procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoiessaportessSeleccionados.size()==1) {
				for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
					procesoiessaportes=procesoiessaportesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoIessAportes();
			
      		//this.finishProcessProcesoIessAportes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoIessAportesReturnGeneral() throws Exception {
		if(this.procesoiessaportesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoiessaportesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoiessaportesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoiessaportesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoiessaportesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoiessaportesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoIessAportes(false);
		}
		
		if(this.procesoiessaportesReturnGeneral.getConRetornoLista() || this.procesoiessaportesReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoiessaportesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoiessaportesLogic.setProcesoIessAportess(this.procesoiessaportesReturnGeneral.getProcesoIessAportess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoIessAportes(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoIessAportes() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoIessAportes> getProcesoIessAportessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoIessAportes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportesLogic.getProcesoIessAportess()) {
					if(procesoiessaportesAux.getIsSelected()) {
						procesoiessaportessSeleccionados.add(procesoiessaportesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoIessAportes procesoiessaportesAux:this.procesoiessaportess) {
					if(procesoiessaportesAux.getIsSelected()) {
						procesoiessaportessSeleccionados.add(procesoiessaportesAux);				
					}
				}
			}
			
			if(procesoiessaportessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoiessaportessSeleccionados.addAll(this.procesoiessaportesLogic.getProcesoIessAportess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoiessaportessSeleccionados.addAll(this.procesoiessaportess);				
					}
				}
			}
		} else {
			procesoiessaportessSeleccionados.add(this.procesoiessaportes);
		}
		
		return procesoiessaportessSeleccionados;
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
	
	public void generarReporteProcesoIessAportessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoIessAportessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoIessAportessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessAportessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoIessAportessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Iess Aportes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoIessAportessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoIessAportes();
		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoIessAportes();
		
		
		//this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados ,procesoiessaportesImplementable,procesoiessaportesImplementableHome);
	}
	
	public void mostrarImportacionProcesoIessAportess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoIessAportes();
		
		this.abrirFrameImportacionProcesoIessAportes();		
		
			
		//this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados ,procesoiessaportesImplementable,procesoiessaportesImplementableHome);
	}
	
	public void importarProcesoIessAportess() throws Exception {		
	
	}
	
	public void exportarProcesoIessAportessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoIessAportessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoIessAportessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoIessAportessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Iess Aportes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoIessAportes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoIessAportes(procesoiessaportesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoiessaportesAux.setsDetalleGeneralEntityReporte(procesoiessaportesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoIessAportes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoIessAportes(ProcesoIessAportes procesoiessaportes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoiessaportes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.gettipoafiliacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.getnumeropatronal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoiessaportes.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoIessAportess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoIessAportes(row);				
				iRow++;
			}				
			
			for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoIessAportes(procesoiessaportesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoIessAportessSeleccionados() throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();		
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoiessaportes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoiessaportess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoiessaportes");
			//elementRoot.appendChild(element);
		
			for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
				element = document.createElement("procesoiessaportes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoIessAportes(procesoiessaportesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Iess Aportes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoIessAportes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoIessAportesConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoIessAportes(ProcesoIessAportes procesoiessaportes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.gettipoafiliacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.getnumeropatronal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoiessaportes.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlProcesoIessAportes(ProcesoIessAportes procesoiessaportes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoIessAportesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoiessaportes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoIessAportesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoiessaportes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(ProcesoIessAportesConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(procesoiessaportes.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(ProcesoIessAportesConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(procesoiessaportes.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementtipoafiliacion_descripcion = document.createElement(ProcesoIessAportesConstantesFunciones.IDTIPOAFILIACION);
		elementtipoafiliacion_descripcion.appendChild(document.createTextNode(procesoiessaportes.gettipoafiliacion_descripcion()));
		element.appendChild(elementtipoafiliacion_descripcion);

		Element elementnumeropatronal_descripcion = document.createElement(ProcesoIessAportesConstantesFunciones.IDNUMEROPATRONAL);
		elementnumeropatronal_descripcion.appendChild(document.createTextNode(procesoiessaportes.getnumeropatronal_descripcion()));
		element.appendChild(elementnumeropatronal_descripcion);

		Element elementporcentaje = document.createElement(ProcesoIessAportesConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(procesoiessaportes.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoProcesoIessAportessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados=new ArrayList<ProcesoIessAportes>();
		
		procesoiessaportessSeleccionados=this.getProcesoIessAportessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoIessAportes(procesoiessaportessSeleccionados);
		
		this.generarReporteProcesoIessAportess("Todos",procesoiessaportessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoIessAportes(ArrayList<ProcesoIessAportes> procesoiessaportessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoIessAportes procesoiessaportesAux:procesoiessaportessSeleccionados) {
				procesoiessaportesAux.setsDetalleGeneralEntityReporte(procesoiessaportesAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					procesoiessaportesAux.setsDescripcionGeneralEntityReporte1(procesoiessaportesAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					procesoiessaportesAux.setsDescripcionGeneralEntityReporte1(procesoiessaportesAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_IDTIPOAFILIACION)) {
					existe=true;
					procesoiessaportesAux.setsDescripcionGeneralEntityReporte1(procesoiessaportesAux.gettipoafiliacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoIessAportesConstantesFunciones.LABEL_IDNUMEROPATRONAL)) {
					existe=true;
					procesoiessaportesAux.setsDescripcionGeneralEntityReporte1(procesoiessaportesAux.getnumeropatronal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoIessAportesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoIessAportes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoIessAportes=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=true;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=true;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=true;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=true;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=true;
			this.isVisibilidadCeldaModificarProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
			this.isVisibilidadCeldaModificarProcesoIessAportes=true;
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
			this.isVisibilidadCeldaCancelarProcesoIessAportes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoIessAportes=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=true;
		} else {
			this.actualizarEstadoPanelsProcesoIessAportes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoIessAportes=false;
			//this.isVisibilidadCeldaVerFormProcesoIessAportes=false;
			this.isVisibilidadCeldaDuplicarProcesoIessAportes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoiessaportesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			if(!procesoiessaportesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;												
			}
			
			this.jButtonCerrarProcesoIessAportes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoiessaportes)) {
			this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
			this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoIessAportes=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoIessAportes=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoIessAportes=false;
		//this.isVisibilidadCeldaModificarProcesoIessAportes=true;
		this.isVisibilidadCeldaActualizarProcesoIessAportes=false;
		this.isVisibilidadCeldaEliminarProcesoIessAportes=false;
		//this.isVisibilidadCeldaCancelarProcesoIessAportes=true;			
		this.isVisibilidadCeldaGuardarProcesoIessAportes=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoIessAportes() {
	}
	
	public void actualizarEstadoPanelsProcesoIessAportes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoIessAportes!=null) {
				this.jScrollPanelDatosEdicionProcesoIessAportes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoIessAportes!=null) {
				this.jScrollPanelDatosProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoIessAportes!=null) {
				this.jPanelPaginacionProcesoIessAportes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
					this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoIessAportes!=null) {
				this.jTabbedPaneBusquedasProcesoIessAportes.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoIessAportes!=null) {
				this.jPanelParametrosReportesProcesoIessAportes.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaProcesoIessAportes=isParaAnio;
			if(!this.isVisibilidadBusquedaProcesoIessAportes) {this.jTabbedPaneBusquedasProcesoIessAportes.remove(jPanelBusquedaProcesoIessAportesProcesoIessAportes);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaProcesoIessAportes=isParaMes;
			if(!this.isVisibilidadBusquedaProcesoIessAportes) {this.jTabbedPaneBusquedasProcesoIessAportes.remove(jPanelBusquedaProcesoIessAportesProcesoIessAportes);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAfiliacion(Boolean isParaTipoAfiliacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAfiliacionNegation=!isParaTipoAfiliacion;

			this.isVisibilidadBusquedaProcesoIessAportes=isParaTipoAfiliacion;
			if(!this.isVisibilidadBusquedaProcesoIessAportes) {this.jTabbedPaneBusquedasProcesoIessAportes.remove(jPanelBusquedaProcesoIessAportesProcesoIessAportes);}
		}
		
	}

	public void setVisibilidadBusquedasParaNumeroPatronal(Boolean isParaNumeroPatronal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNumeroPatronalNegation=!isParaNumeroPatronal;

			this.isVisibilidadBusquedaProcesoIessAportes=isParaNumeroPatronal;
			if(!this.isVisibilidadBusquedaProcesoIessAportes) {this.jTabbedPaneBusquedasProcesoIessAportes.remove(jPanelBusquedaProcesoIessAportesProcesoIessAportes);}
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
			
			this.inicializarActualizarBindingTablaProcesoIessAportes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoIessAportes() {
		this.updateBorderResaltarBusquedasFormularioProcesoIessAportes();
		this.updateVisibilidadBusquedasFormularioProcesoIessAportes();
		this.updateHabilitarBusquedasFormularioProcesoIessAportes();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoIessAportes() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoIessAportes.getComponents().length>0) {
	

		if(this.procesoiessaportesConstantesFunciones.resaltarBusquedaProcesoIessAportesProcesoIessAportes!=null) {
			index= this.jTabbedPaneBusquedasProcesoIessAportes.indexOfComponent(this.jPanelBusquedaProcesoIessAportesProcesoIessAportes);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessAportes.getComponent(index);
				jPanel.setBorder(this.procesoiessaportesConstantesFunciones.resaltarBusquedaProcesoIessAportesProcesoIessAportes);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoIessAportes() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoIessAportes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessAportes.indexOfComponent(this.jPanelBusquedaProcesoIessAportesProcesoIessAportes);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessAportes.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoiessaportesConstantesFunciones.mostrarBusquedaProcesoIessAportesProcesoIessAportes);
			if(!this.procesoiessaportesConstantesFunciones.mostrarBusquedaProcesoIessAportesProcesoIessAportes && index>-1) {
				this.jTabbedPaneBusquedasProcesoIessAportes.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoIessAportes() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoIessAportes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoIessAportes.indexOfComponent(this.jPanelBusquedaProcesoIessAportesProcesoIessAportes);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessAportes.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoiessaportesConstantesFunciones.activarBusquedaProcesoIessAportesProcesoIessAportes);
				this.jTabbedPaneBusquedasProcesoIessAportes.setEnabledAt(index,this.procesoiessaportesConstantesFunciones.activarBusquedaProcesoIessAportesProcesoIessAportes);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoIessAportes(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoIessAportes")) {
			index= this.jTabbedPaneBusquedasProcesoIessAportes.indexOfComponent(this.jPanelBusquedaProcesoIessAportesProcesoIessAportes);

			this.jTabbedPaneBusquedasProcesoIessAportes.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoIessAportes.getComponent(index);

			this.procesoiessaportesConstantesFunciones.setResaltarBusquedaProcesoIessAportesProcesoIessAportes(resaltar);

			jPanel.setBorder(this.procesoiessaportesConstantesFunciones.resaltarBusquedaProcesoIessAportesProcesoIessAportes);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoIessAportes.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoIessAportes() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoIessAportes();
		this.updateVisibilidadResaltarControlesFormularioProcesoIessAportes();
		this.updateHabilitarResaltarControlesFormularioProcesoIessAportes();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoIessAportes() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoiessaportesConstantesFunciones.resaltaridProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltaridProcesoIessAportes);}
		if(this.procesoiessaportesConstantesFunciones.resaltarid_anioProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltarid_anioProcesoIessAportes);}
		if(this.procesoiessaportesConstantesFunciones.resaltarid_mesProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltarid_mesProcesoIessAportes);}
		if(this.procesoiessaportesConstantesFunciones.resaltarid_tipo_afiliacionProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltarid_tipo_afiliacionProcesoIessAportes);}
		if(this.procesoiessaportesConstantesFunciones.resaltarid_numero_patronalProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltarid_numero_patronalProcesoIessAportes);}
		if(this.procesoiessaportesConstantesFunciones.resaltarporcentajeProcesoIessAportes!=null && this.jInternalFrameDetalleFormProcesoIessAportes!=null) {this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setBorder(this.procesoiessaportesConstantesFunciones.resaltarporcentajeProcesoIessAportes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoIessAportes() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
	
		//this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostraridProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelidProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostraridProcesoIessAportes);
		//this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_anioProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelid_anioProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_anioProcesoIessAportes);
		//this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_mesProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelid_mesProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_mesProcesoIessAportes);
		//this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_tipo_afiliacionProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelid_tipo_afiliacionProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_tipo_afiliacionProcesoIessAportes);
		//this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_numero_patronalProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelid_numero_patronalProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarid_numero_patronalProcesoIessAportes);
		//this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarporcentajeProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jPanelporcentajeProcesoIessAportes.setVisible(this.procesoiessaportesConstantesFunciones.mostrarporcentajeProcesoIessAportes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoIessAportes() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoIessAportes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoIessAportes!=null) {
	
		this.jInternalFrameDetalleFormProcesoIessAportes.jLabelidProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activaridProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_anioProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activarid_anioProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_mesProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activarid_mesProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_tipo_afiliacionProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activarid_tipo_afiliacionProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jComboBoxid_numero_patronalProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activarid_numero_patronalProcesoIessAportes);
		this.jInternalFrameDetalleFormProcesoIessAportes.jTextFieldporcentajeProcesoIessAportes.setEnabled(this.procesoiessaportesConstantesFunciones.activarporcentajeProcesoIessAportes);
		}
	}
	
		
}