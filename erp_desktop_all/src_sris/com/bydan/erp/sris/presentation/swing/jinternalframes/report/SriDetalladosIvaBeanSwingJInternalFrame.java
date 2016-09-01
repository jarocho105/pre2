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

//import com.bydan.erp.sris.util.SriDetalladosIvaConstantesFunciones;
import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriDetalladosIvaParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.SriDetalladosIvaBean;
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

import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SriDetalladosIvaBeanSwingJInternalFrame extends SriDetalladosIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SriDetalladosIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SriDetalladosIva> sridetalladosivaValidator = new ClassValidator<SriDetalladosIva>(SriDetalladosIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SriDetalladosIva sridetalladosiva;	
	public SriDetalladosIva sridetalladosivaAux;
	public SriDetalladosIva sridetalladosivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SriDetalladosIva sridetalladosivaTotales;
	public Long idSriDetalladosIvaActual;
	public Long iIdNuevoSriDetalladosIva=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPeriodoDeclara="";

	public List<PeriodoDeclara> periododeclarasForeignKey;

	public List<PeriodoDeclara> getperiododeclarasForeignKey() {
		return periododeclarasForeignKey;
	}

	public void setperiododeclarasForeignKey(List<PeriodoDeclara> periododeclarasForeignKey) {
		this.periododeclarasForeignKey = periododeclarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PeriodoDeclara periododeclaraForeignKey;

	public PeriodoDeclara getperiododeclaraForeignKey() {
		return periododeclaraForeignKey;
	}

	public void setperiododeclaraForeignKey(PeriodoDeclara periododeclaraForeignKey) {
		this.periododeclaraForeignKey = periododeclaraForeignKey;
	}

	public String sFinalQueryComboTipoComprobante="";

	public List<TipoComprobante> tipocomprobantesForeignKey;

	public List<TipoComprobante> gettipocomprobantesForeignKey() {
		return tipocomprobantesForeignKey;
	}

	public void settipocomprobantesForeignKey(List<TipoComprobante> tipocomprobantesForeignKey) {
		this.tipocomprobantesForeignKey = tipocomprobantesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoComprobante tipocomprobanteForeignKey;

	public TipoComprobante gettipocomprobanteForeignKey() {
		return tipocomprobanteForeignKey;
	}

	public void settipocomprobanteForeignKey(TipoComprobante tipocomprobanteForeignKey) {
		this.tipocomprobanteForeignKey = tipocomprobanteForeignKey;
	}

	public String sFinalQueryComboTipoIva="";

	public List<TipoIva> tipoivasForeignKey;

	public List<TipoIva> gettipoivasForeignKey() {
		return tipoivasForeignKey;
	}

	public void settipoivasForeignKey(List<TipoIva> tipoivasForeignKey) {
		this.tipoivasForeignKey = tipoivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIva tipoivaForeignKey;

	public TipoIva gettipoivaForeignKey() {
		return tipoivaForeignKey;
	}

	public void settipoivaForeignKey(TipoIva tipoivaForeignKey) {
		this.tipoivaForeignKey = tipoivaForeignKey;
	}

	public String sFinalQueryComboTipoRetencionIva="";

	public List<TipoRetencion> tiporetencionivasForeignKey;

	public List<TipoRetencion> gettiporetencionivasForeignKey() {
		return tiporetencionivasForeignKey;
	}

	public void settiporetencionivasForeignKey(List<TipoRetencion> tiporetencionivasForeignKey) {
		this.tiporetencionivasForeignKey = tiporetencionivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionivaForeignKey;

	public TipoRetencion gettiporetencionivaForeignKey() {
		return tiporetencionivaForeignKey;
	}

	public void settiporetencionivaForeignKey(TipoRetencion tiporetencionivaForeignKey) {
		this.tiporetencionivaForeignKey = tiporetencionivaForeignKey;
	}

	public String sFinalQueryComboTipoRetencionIvaPresta="";

	public List<TipoRetencion> tiporetencionivaprestasForeignKey;

	public List<TipoRetencion> gettiporetencionivaprestasForeignKey() {
		return tiporetencionivaprestasForeignKey;
	}

	public void settiporetencionivaprestasForeignKey(List<TipoRetencion> tiporetencionivaprestasForeignKey) {
		this.tiporetencionivaprestasForeignKey = tiporetencionivaprestasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionivaprestaForeignKey;

	public TipoRetencion gettiporetencionivaprestaForeignKey() {
		return tiporetencionivaprestaForeignKey;
	}

	public void settiporetencionivaprestaForeignKey(TipoRetencion tiporetencionivaprestaForeignKey) {
		this.tiporetencionivaprestaForeignKey = tiporetencionivaprestaForeignKey;
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
	
	public Boolean isPermisoTodoSriDetalladosIva;
	public Boolean isPermisoNuevoSriDetalladosIva;
	public Boolean isPermisoActualizarSriDetalladosIva;
	public Boolean isPermisoActualizarOriginalSriDetalladosIva;
	public Boolean isPermisoEliminarSriDetalladosIva;
	public Boolean isPermisoGuardarCambiosSriDetalladosIva;
	public Boolean isPermisoConsultaSriDetalladosIva;
	public Boolean isPermisoBusquedaSriDetalladosIva;
	public Boolean isPermisoReporteSriDetalladosIva;
	public Boolean isPermisoPaginacionMedioSriDetalladosIva;
	public Boolean isPermisoPaginacionAltoSriDetalladosIva;
	public Boolean isPermisoPaginacionTodoSriDetalladosIva;
	public Boolean isPermisoCopiarSriDetalladosIva;
	public Boolean isPermisoVerFormSriDetalladosIva;
	public Boolean isPermisoDuplicarSriDetalladosIva;
	public Boolean isPermisoOrdenSriDetalladosIva;
	
	
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
	
	public SriDetalladosIvaParameterReturnGeneral sridetalladosivaReturnGeneral;
	public SriDetalladosIvaParameterReturnGeneral sridetalladosivaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSriDetalladosIva=false;
	public Boolean esParaAccionDesdeFormularioSriDetalladosIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SriDetalladosIvaSessionBeanAdditional sridetalladosivaSessionBeanAdditional=null;
	
	public SriDetalladosIvaSessionBeanAdditional getSriDetalladosIvaSessionBeanAdditional() {
		return this.sridetalladosivaSessionBeanAdditional;
	}
	
	public void setSriDetalladosIvaSessionBeanAdditional(SriDetalladosIvaSessionBeanAdditional sridetalladosivaSessionBeanAdditional) {
		try {
			this.sridetalladosivaSessionBeanAdditional=sridetalladosivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SriDetalladosIvaBeanSwingJInternalFrameAdditional sridetalladosivaBeanSwingJInternalFrameAdditional=null;
	//public class SriDetalladosIvaBeanSwingJInternalFrame
	
	public SriDetalladosIvaBeanSwingJInternalFrameAdditional getSriDetalladosIvaBeanSwingJInternalFrameAdditional() {
		return this.sridetalladosivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setSriDetalladosIvaBeanSwingJInternalFrameAdditional(SriDetalladosIvaBeanSwingJInternalFrameAdditional sridetalladosivaBeanSwingJInternalFrameAdditional) {
		try {
			this.sridetalladosivaBeanSwingJInternalFrameAdditional=sridetalladosivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SriDetalladosIvaLogic sridetalladosivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SriDetalladosIva sridetalladosivaBean;
	public SriDetalladosIvaConstantesFunciones sridetalladosivaConstantesFunciones;
	//public SriDetalladosIvaParameterReturnGeneral sridetalladosivaReturnGeneral;
	
	//FK
	
	public PeriodoDeclaraLogic periododeclaraLogic;
	public TipoComprobanteLogic tipocomprobanteLogic;
	public TipoIvaLogic tipoivaLogic;
	public TipoRetencionLogic tiporetencionivaLogic;
	public TipoRetencionLogic tiporetencionivaprestaLogic;
	
	//PARAMETROS
	
	
	//public List<SriDetalladosIva> sridetalladosivas;	
	//public List<SriDetalladosIva> sridetalladosivasEliminados;
	//public List<SriDetalladosIva> sridetalladosivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaDuplicarSriDetalladosIva=true;
	public Boolean isVisibilidadCeldaCopiarSriDetalladosIva=true;
	public Boolean isVisibilidadCeldaVerFormSriDetalladosIva=true;
	public Boolean isVisibilidadCeldaOrdenSriDetalladosIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaModificarSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaActualizarSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaEliminarSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaCancelarSriDetalladosIva=false;
	public Boolean isVisibilidadCeldaGuardarSriDetalladosIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;	
	
	
	public Boolean isVisibilidadBusquedaSriDetalladosIva=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	public Boolean isVisibilidadFK_IdTipoComprobante=false;
	public Boolean isVisibilidadFK_IdTipoIva=false;
	public Boolean isVisibilidadFK_IdTipoRetencionIva=false;
	public Boolean isVisibilidadFK_IdTipoRetencionIvaPresta=false;
	
	public Long getiIdNuevoSriDetalladosIva() {
		return this.iIdNuevoSriDetalladosIva;
	}

	public void setiIdNuevoSriDetalladosIva(Long iIdNuevoSriDetalladosIva) {
		this.iIdNuevoSriDetalladosIva = iIdNuevoSriDetalladosIva;
	}
	
	public Long getidSriDetalladosIvaActual() {
		return this.idSriDetalladosIvaActual;
	}

	public void setidSriDetalladosIvaActual(Long idSriDetalladosIvaActual) {
		this.idSriDetalladosIvaActual = idSriDetalladosIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SriDetalladosIva getsridetalladosiva() {
		return this.sridetalladosiva;
	}

	public void setsridetalladosiva(SriDetalladosIva sridetalladosiva) {
		this.sridetalladosiva = sridetalladosiva;
	}
	
	public SriDetalladosIva getsridetalladosivaAux() {
		return this.sridetalladosivaAux;
	}

	public void setsridetalladosivaAux(SriDetalladosIva sridetalladosivaAux) {
		this.sridetalladosivaAux = sridetalladosivaAux;
	}				
	
	public SriDetalladosIva getsridetalladosivaAnterior() {
		return this.sridetalladosivaAnterior;
	}

	public void setsridetalladosivaAnterior(SriDetalladosIva sridetalladosivaAnterior) {
		this.sridetalladosivaAnterior = sridetalladosivaAnterior;
	}	
	
	public SriDetalladosIva getsridetalladosivaTotales() {
		return this.sridetalladosivaTotales;
	}

	public void setsridetalladosivaTotales(SriDetalladosIva sridetalladosivaTotales) {
		this.sridetalladosivaTotales = sridetalladosivaTotales;
	}	
	
	public SriDetalladosIva getsridetalladosivaBean() {
		return this.sridetalladosivaBean;
	}

	public void setsridetalladosivaBean(SriDetalladosIva sridetalladosivaBean) {
		this.sridetalladosivaBean = sridetalladosivaBean;
	}	
	
	public SriDetalladosIvaParameterReturnGeneral getsridetalladosivaReturnGeneral() {
		return this.sridetalladosivaReturnGeneral;
	}

	public void setsridetalladosivaReturnGeneral(SriDetalladosIvaParameterReturnGeneral sridetalladosivaReturnGeneral) {
		this.sridetalladosivaReturnGeneral = sridetalladosivaReturnGeneral;
	}	
	
	
	public Long id_periodo_declaraBusquedaSriDetalladosIva=-1L;

	public Long getid_periodo_declaraBusquedaSriDetalladosIva() {
		return this.id_periodo_declaraBusquedaSriDetalladosIva;
	}

	public void setid_periodo_declaraBusquedaSriDetalladosIva(Long id_periodo_declaraBusquedaSriDetalladosIva) {
		this.id_periodo_declaraBusquedaSriDetalladosIva = id_periodo_declaraBusquedaSriDetalladosIva;
	}

;
	public Long id_tipo_comprobanteBusquedaSriDetalladosIva=-1L;

	public Long getid_tipo_comprobanteBusquedaSriDetalladosIva() {
		return this.id_tipo_comprobanteBusquedaSriDetalladosIva;
	}

	public void setid_tipo_comprobanteBusquedaSriDetalladosIva(Long id_tipo_comprobanteBusquedaSriDetalladosIva) {
		this.id_tipo_comprobanteBusquedaSriDetalladosIva = id_tipo_comprobanteBusquedaSriDetalladosIva;
	}

;
	public String rucBusquedaSriDetalladosIva="";

	public String getrucBusquedaSriDetalladosIva() {
		return this.rucBusquedaSriDetalladosIva;
	}

	public void setrucBusquedaSriDetalladosIva(String rucBusquedaSriDetalladosIva) {
		this.rucBusquedaSriDetalladosIva = rucBusquedaSriDetalladosIva;
	}

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public Long id_tipo_comprobanteFK_IdTipoComprobante=-1L;

	public Long getid_tipo_comprobanteFK_IdTipoComprobante() {
		return this.id_tipo_comprobanteFK_IdTipoComprobante;
	}

	public void setid_tipo_comprobanteFK_IdTipoComprobante(Long id_tipo_comprobanteFK_IdTipoComprobante) {
		this.id_tipo_comprobanteFK_IdTipoComprobante = id_tipo_comprobanteFK_IdTipoComprobante;
	}

	public Long id_tipo_ivaFK_IdTipoIva=-1L;

	public Long getid_tipo_ivaFK_IdTipoIva() {
		return this.id_tipo_ivaFK_IdTipoIva;
	}

	public void setid_tipo_ivaFK_IdTipoIva(Long id_tipo_ivaFK_IdTipoIva) {
		this.id_tipo_ivaFK_IdTipoIva = id_tipo_ivaFK_IdTipoIva;
	}

	public Long id_tipo_retencion_ivaFK_IdTipoRetencionIva=-1L;

	public Long getid_tipo_retencion_ivaFK_IdTipoRetencionIva() {
		return this.id_tipo_retencion_ivaFK_IdTipoRetencionIva;
	}

	public void setid_tipo_retencion_ivaFK_IdTipoRetencionIva(Long id_tipo_retencion_ivaFK_IdTipoRetencionIva) {
		this.id_tipo_retencion_ivaFK_IdTipoRetencionIva = id_tipo_retencion_ivaFK_IdTipoRetencionIva;
	}

	public Long id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta=-1L;

	public Long getid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta() {
		return this.id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta;
	}

	public void setid_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta(Long id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta) {
		this.id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta = id_tipo_retencion_iva_prestaFK_IdTipoRetencionIvaPresta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SriDetalladosIvaLogic getSriDetalladosIvaLogic()	{		
		return sridetalladosivaLogic;
	}

	public void setSriDetalladosIvaLogic(SriDetalladosIvaLogic sridetalladosivaLogic) {
		this.sridetalladosivaLogic = sridetalladosivaLogic;
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
	
	public Boolean getIsEsNuevoSriDetalladosIva() {
		return isEsNuevoSriDetalladosIva;
	}

	public void setIsEsNuevoSriDetalladosIva(Boolean isEsNuevoSriDetalladosIva) {
		this.isEsNuevoSriDetalladosIva = isEsNuevoSriDetalladosIva;
	}

	public Boolean getEsParaAccionDesdeFormularioSriDetalladosIva() {
		return esParaAccionDesdeFormularioSriDetalladosIva;
	}
	
	public void setEsParaAccionDesdeFormularioSriDetalladosIva(Boolean esParaAccionDesdeFormularioSriDetalladosIva) {
		this.esParaAccionDesdeFormularioSriDetalladosIva = esParaAccionDesdeFormularioSriDetalladosIva;
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
	
	
	public void cargarCombosPeriodoDeclarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();

			periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

					periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(sFinalQuery,new Pagination());

					this.periododeclarasForeignKey=periododeclaraLogic.getPeriodoDeclaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodoDeclara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getEntityWithConnection(sridetalladosivaSessionBean.getlidPeriodoDeclaraActual());
					this.periododeclarasForeignKey.add(periododeclaraLogic.getPeriodoDeclara());
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

	public void cargarCombosTipoComprobantesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoComprobanteLogic tipocomprobanteLogic=new TipoComprobanteLogic();

			tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getTipoComprobanteDataAccess().setIsForForeingKeyData(true);

					tipocomprobanteLogic.getTodosTipoComprobantesWithConnection(sFinalQuery,new Pagination());

					this.tipocomprobantesForeignKey=tipocomprobanteLogic.getTipoComprobantes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoComprobante(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomprobanteLogic.getEntityWithConnection(sridetalladosivaSessionBean.getlidTipoComprobanteActual());
					this.tipocomprobantesForeignKey.add(tipocomprobanteLogic.getTipoComprobante());
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

	public void cargarCombosTipoIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoivasForeignKey=new ArrayList<TipoIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIvaLogic tipoivaLogic=new TipoIvaLogic();

			tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.getTipoIvaDataAccess().setIsForForeingKeyData(true);

					tipoivaLogic.getTodosTipoIvasWithConnection(sFinalQuery,new Pagination());

					this.tipoivasForeignKey=tipoivaLogic.getTipoIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaLogic.getEntityWithConnection(sridetalladosivaSessionBean.getlidTipoIvaActual());
					this.tipoivasForeignKey.add(tipoivaLogic.getTipoIva());
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

	public void cargarCombosTipoRetencionIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionivaLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionivasForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencionIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(sridetalladosivaSessionBean.getlidTipoRetencionIvaActual());
					this.tiporetencionivasForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

	public void cargarCombosTipoRetencionIvaPrestasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionivaprestaLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionivaprestasForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencionIvaPresta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(sridetalladosivaSessionBean.getlidTipoRetencionIvaPrestaActual());
					this.tiporetencionivaprestasForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

	
	
	public void setActualPeriodoDeclaraForeignKey(Long idPeriodoDeclaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periododeclaraTemp!=null) {

					if(this.sridetalladosiva!=null) {
						this.sridetalladosiva.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriDetalladosIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva!=null) {
						jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva!=null) {
							//jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.getItemCount()>0) {
								jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedIndex(0);
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

	public String getActualPeriodoDeclaraForeignKeyDescripcion(Long idPeriodoDeclaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}


			sDescripcion=PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(periododeclaraTemp!=null) {
				jComboBoxid_periodo_declaraSriDetalladosIvaGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraSriDetalladosIvaGenerico!=null && jComboBoxid_periodo_declaraSriDetalladosIvaGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraSriDetalladosIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoComprobanteForeignKey(Long idTipoComprobanteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocomprobanteTemp!=null) {

					if(this.sridetalladosiva!=null) {
						this.sridetalladosiva.setTipoComprobante(tipocomprobanteTemp);
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedItem(tipocomprobanteTemp);
					}
				} else {
					//jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedItem(tipocomprobanteTemp);
					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriDetalladosIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocomprobanteTemp!=null && jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva!=null) {
						jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(tipocomprobanteTemp);
					} else {
						if(jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva!=null) {
							//jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(tipocomprobanteTemp);
							if(jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.getItemCount()>0) {
								jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedIndex(0);
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

	public String getActualTipoComprobanteForeignKeyDescripcion(Long idTipoComprobanteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}


			sDescripcion=TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoComprobanteForeignKeyGenerico(Long idTipoComprobanteSeleccionado,JComboBox jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteTemp=null;

			for(TipoComprobante tipocomprobanteAux:tipocomprobantesForeignKey) {
				if(tipocomprobanteAux.getId()!=null && tipocomprobanteAux.getId().equals(idTipoComprobanteSeleccionado)) {
					tipocomprobanteTemp=tipocomprobanteAux;
					break;
				}
			}

			if(tipocomprobanteTemp!=null) {
				jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico.setSelectedItem(tipocomprobanteTemp);
			} else {
				if(jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico!=null && jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIvaForeignKey(Long idTipoIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoivaTemp!=null) {

					if(this.sridetalladosiva!=null) {
						this.sridetalladosiva.setTipoIva(tipoivaTemp);
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedItem(tipoivaTemp);
					}
				} else {
					//jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedItem(tipoivaTemp);
					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedIndex(0);
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

	public String getActualTipoIvaForeignKeyDescripcion(Long idTipoIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}


			sDescripcion=TipoIvaConstantesFunciones.getTipoIvaDescripcion(tipoivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIvaForeignKeyGenerico(Long idTipoIvaSeleccionado,JComboBox jComboBoxid_tipo_ivaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaTemp=null;

			for(TipoIva tipoivaAux:tipoivasForeignKey) {
				if(tipoivaAux.getId()!=null && tipoivaAux.getId().equals(idTipoIvaSeleccionado)) {
					tipoivaTemp=tipoivaAux;
					break;
				}
			}

			if(tipoivaTemp!=null) {
				jComboBoxid_tipo_ivaSriDetalladosIvaGenerico.setSelectedItem(tipoivaTemp);
			} else {
				if(jComboBoxid_tipo_ivaSriDetalladosIvaGenerico!=null && jComboBoxid_tipo_ivaSriDetalladosIvaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_ivaSriDetalladosIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionIvaForeignKey(Long idTipoRetencionIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionivaTemp!=null) {

					if(this.sridetalladosiva!=null) {
						this.sridetalladosiva.setTipoRetencionIva(tiporetencionivaTemp);
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedItem(tiporetencionivaTemp);
					}
				} else {
					//jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedItem(tiporetencionivaTemp);
					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedIndex(0);
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

	public String getActualTipoRetencionIvaForeignKeyDescripcion(Long idTipoRetencionIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionIvaForeignKeyGenerico(Long idTipoRetencionIvaSeleccionado,JComboBox jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaTemp=null;

			for(TipoRetencion tiporetencionivaAux:tiporetencionivasForeignKey) {
				if(tiporetencionivaAux.getId()!=null && tiporetencionivaAux.getId().equals(idTipoRetencionIvaSeleccionado)) {
					tiporetencionivaTemp=tiporetencionivaAux;
					break;
				}
			}

			if(tiporetencionivaTemp!=null) {
				jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico.setSelectedItem(tiporetencionivaTemp);
			} else {
				if(jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico!=null && jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionIvaPrestaForeignKey(Long idTipoRetencionIvaPrestaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionivaprestaTemp!=null) {

					if(this.sridetalladosiva!=null) {
						this.sridetalladosiva.setTipoRetencionIvaPresta(tiporetencionivaprestaTemp);
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedItem(tiporetencionivaprestaTemp);
					}
				} else {
					//jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedItem(tiporetencionivaprestaTemp);
					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedIndex(0);
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

	public String getActualTipoRetencionIvaPrestaForeignKeyDescripcion(Long idTipoRetencionIvaPrestaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionivaprestaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionIvaPrestaForeignKeyGenerico(Long idTipoRetencionIvaPrestaSeleccionado,JComboBox jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionivaprestaTemp=null;

			for(TipoRetencion tiporetencionivaprestaAux:tiporetencionivaprestasForeignKey) {
				if(tiporetencionivaprestaAux.getId()!=null && tiporetencionivaprestaAux.getId().equals(idTipoRetencionIvaPrestaSeleccionado)) {
					tiporetencionivaprestaTemp=tiporetencionivaprestaAux;
					break;
				}
			}

			if(tiporetencionivaprestaTemp!=null) {
				jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico.setSelectedItem(tiporetencionivaprestaTemp);
			} else {
				if(jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico!=null && jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(SriDetalladosIva sridetalladosiva,JComboBox jComboBoxid_periodo_declaraSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraSriDetalladosIvaGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraSriDetalladosIvaGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				sridetalladosiva.setid_periodo_declara(periododeclaraAux.getId());
				sridetalladosiva.setperiododeclara_descripcion(SriDetalladosIvaConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				sridetalladosiva.setPeriodoDeclara(periododeclaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoComprobanteForeignKey(SriDetalladosIva sridetalladosiva,JComboBox jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoComprobante  tipocomprobanteAux=new TipoComprobante();

			if(jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico==null) {
				tipocomprobanteAux=(TipoComprobante)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.getSelectedItem();
			} else {
				tipocomprobanteAux=(TipoComprobante)jComboBoxid_tipo_comprobanteSriDetalladosIvaGenerico.getSelectedItem();
			}

			if(tipocomprobanteAux!=null && tipocomprobanteAux.getId()!=null) {
				sridetalladosiva.setid_tipo_comprobante(tipocomprobanteAux.getId());
				sridetalladosiva.settipocomprobante_descripcion(SriDetalladosIvaConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobanteAux));
				sridetalladosiva.setTipoComprobante(tipocomprobanteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIvaForeignKey(SriDetalladosIva sridetalladosiva,JComboBox jComboBoxid_tipo_ivaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoIva  tipoivaAux=new TipoIva();

			if(jComboBoxid_tipo_ivaSriDetalladosIvaGenerico==null) {
				tipoivaAux=(TipoIva)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.getSelectedItem();
			} else {
				tipoivaAux=(TipoIva)jComboBoxid_tipo_ivaSriDetalladosIvaGenerico.getSelectedItem();
			}

			if(tipoivaAux!=null && tipoivaAux.getId()!=null) {
				sridetalladosiva.setid_tipo_iva(tipoivaAux.getId());
				sridetalladosiva.settipoiva_descripcion(SriDetalladosIvaConstantesFunciones.getTipoIvaDescripcion(tipoivaAux));
				sridetalladosiva.setTipoIva(tipoivaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionIvaForeignKey(SriDetalladosIva sridetalladosiva,JComboBox jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencion_ivaSriDetalladosIvaGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				sridetalladosiva.setid_tipo_retencion_iva(tiporetencionAux.getId());
				sridetalladosiva.settiporetencioniva_descripcion(SriDetalladosIvaConstantesFunciones.getTipoRetencionIvaDescripcion(tiporetencionAux));
				sridetalladosiva.setTipoRetencionIva(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionIvaPrestaForeignKey(SriDetalladosIva sridetalladosiva,JComboBox jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIvaGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				sridetalladosiva.setid_tipo_retencion_iva_presta(tiporetencionAux.getId());
				sridetalladosiva.settiporetencionivapresta_descripcion(SriDetalladosIvaConstantesFunciones.getTipoRetencionIvaPrestaDescripcion(tiporetencionAux));
				sridetalladosiva.setTipoRetencionIvaPresta(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
					}

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriDetalladosIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.addItem(periododeclara);
							}
						}

						if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoComprobantesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoComprobante=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.addItem(tipocomprobante);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
					}

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriDetalladosIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.removeAllItems();

							for(TipoComprobante tipocomprobante:this.tipocomprobantesForeignKey) {
								this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.addItem(tipocomprobante);
							}
						}

						if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.removeAllItems();

							for(TipoIva tipoiva:this.tipoivasForeignKey) {
								this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.addItem(tipoiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
					}

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.removeAllItems();

							for(TipoRetencion tiporetencioniva:this.tiporetencionivasForeignKey) {
								this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.addItem(tiporetencioniva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
					}

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionIvaPrestasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.removeAllItems();

							for(TipoRetencion tiporetencionivapresta:this.tiporetencionivaprestasForeignKey) {
								this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.addItem(tiporetencionivapresta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { 
					}

					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoComprobanteForeignKey(TipoComprobante tipocomprobante,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedItem(tipocomprobante);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedItem(tipocomprobante);
						} else {
							this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIvaForeignKey(TipoIva tipoiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedItem(tipoiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRetencionIvaForeignKey(TipoRetencion tiporetencioniva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedItem(tiporetencioniva);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRetencionIvaPrestaForeignKey(TipoRetencion tiporetencionivapresta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedItem(tiporetencionivapresta);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSriDetalladosIva() throws Exception {
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
		
	public SriDetalladosIvaParameterReturnGeneral getSriDetalladosIvaParameterGeneral() {
		return this.sridetalladosivaParameterGeneral;
	}
	
	public void setSriDetalladosIvaParameterGeneral(SriDetalladosIvaParameterReturnGeneral sridetalladosivaParameterGeneral) {
		this.sridetalladosivaParameterGeneral = sridetalladosivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSriDetalladosIva() {
		return isPermisoTodoSriDetalladosIva;
	}

	public void setIsPermisoTodoSriDetalladosIva(Boolean isPermisoTodoSriDetalladosIva) {
		this.isPermisoTodoSriDetalladosIva = isPermisoTodoSriDetalladosIva;
	}

	public Boolean getIsPermisoNuevoSriDetalladosIva() {
		return isPermisoNuevoSriDetalladosIva;
	}

	public void setIsPermisoNuevoSriDetalladosIva(Boolean isPermisoNuevoSriDetalladosIva) {
		this.isPermisoNuevoSriDetalladosIva = isPermisoNuevoSriDetalladosIva;
	}

	public Boolean getIsPermisoActualizarSriDetalladosIva() {
		return isPermisoActualizarSriDetalladosIva;
	}

	public void setIsPermisoActualizarSriDetalladosIva(Boolean isPermisoActualizarSriDetalladosIva) {
		this.isPermisoActualizarSriDetalladosIva = isPermisoActualizarSriDetalladosIva;
	}

	public Boolean getIsPermisoEliminarSriDetalladosIva() {
		return isPermisoEliminarSriDetalladosIva;
	}

	public void setIsPermisoEliminarSriDetalladosIva(Boolean isPermisoEliminarSriDetalladosIva) {
		this.isPermisoEliminarSriDetalladosIva = isPermisoEliminarSriDetalladosIva;
	}

	public Boolean getIsPermisoGuardarCambiosSriDetalladosIva() {
		return isPermisoGuardarCambiosSriDetalladosIva;
	}

	public void setIsPermisoGuardarCambiosSriDetalladosIva(Boolean isPermisoGuardarCambiosSriDetalladosIva) {
		this.isPermisoGuardarCambiosSriDetalladosIva = isPermisoGuardarCambiosSriDetalladosIva;
	}
	
	public Boolean getIsPermisoConsultaSriDetalladosIva() {
		return isPermisoConsultaSriDetalladosIva;
	}

	public void setIsPermisoConsultaSriDetalladosIva(Boolean isPermisoConsultaSriDetalladosIva) {
		this.isPermisoConsultaSriDetalladosIva = isPermisoConsultaSriDetalladosIva;
	}

	public Boolean getIsPermisoBusquedaSriDetalladosIva() {
		return isPermisoBusquedaSriDetalladosIva;
	}

	public void setIsPermisoBusquedaSriDetalladosIva(Boolean isPermisoBusquedaSriDetalladosIva) {
		this.isPermisoBusquedaSriDetalladosIva = isPermisoBusquedaSriDetalladosIva;
	}

	public Boolean getIsPermisoReporteSriDetalladosIva() {
		return isPermisoReporteSriDetalladosIva;
	}

	public void setIsPermisoReporteSriDetalladosIva(Boolean isPermisoReporteSriDetalladosIva) {
		this.isPermisoReporteSriDetalladosIva = isPermisoReporteSriDetalladosIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioSriDetalladosIva() {
		return isPermisoPaginacionMedioSriDetalladosIva;
	}

	public void setIsPermisoPaginacionMedioSriDetalladosIva(Boolean isPermisoPaginacionMedioSriDetalladosIva) {
		this.isPermisoPaginacionMedioSriDetalladosIva = isPermisoPaginacionMedioSriDetalladosIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoSriDetalladosIva() {
		return isPermisoPaginacionTodoSriDetalladosIva;
	}

	public void setIsPermisoPaginacionTodoSriDetalladosIva(Boolean isPermisoPaginacionTodoSriDetalladosIva) {
		this.isPermisoPaginacionTodoSriDetalladosIva = isPermisoPaginacionTodoSriDetalladosIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoSriDetalladosIva() {
		return isPermisoPaginacionAltoSriDetalladosIva;
	}

	public void setIsPermisoPaginacionAltoSriDetalladosIva(Boolean isPermisoPaginacionAltoSriDetalladosIva) {
		this.isPermisoPaginacionAltoSriDetalladosIva = isPermisoPaginacionAltoSriDetalladosIva;
	}
	
	public Boolean getIsPermisoCopiarSriDetalladosIva() {
		return isPermisoCopiarSriDetalladosIva;
	}

	public void setIsPermisoCopiarSriDetalladosIva(Boolean isPermisoCopiarSriDetalladosIva) {
		this.isPermisoCopiarSriDetalladosIva = isPermisoCopiarSriDetalladosIva;
	}
	
	public Boolean getIsPermisoVerFormSriDetalladosIva() {
		return isPermisoVerFormSriDetalladosIva;
	}

	public void setIsPermisoVerFormSriDetalladosIva(Boolean isPermisoVerFormSriDetalladosIva) {
		this.isPermisoVerFormSriDetalladosIva = isPermisoVerFormSriDetalladosIva;
	}
	
	public Boolean getIsPermisoDuplicarSriDetalladosIva() {
		return isPermisoDuplicarSriDetalladosIva;
	}

	public void setIsPermisoDuplicarSriDetalladosIva(Boolean isPermisoDuplicarSriDetalladosIva) {
		this.isPermisoDuplicarSriDetalladosIva = isPermisoDuplicarSriDetalladosIva;
	}
	
	public Boolean getIsPermisoOrdenSriDetalladosIva() {
		return isPermisoOrdenSriDetalladosIva;
	}

	public void setIsPermisoOrdenSriDetalladosIva(Boolean isPermisoOrdenSriDetalladosIva) {
		this.isPermisoOrdenSriDetalladosIva = isPermisoOrdenSriDetalladosIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSriDetalladosIva() {
		return isVisibilidadCeldaNuevoSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaNuevoSriDetalladosIva(Boolean isVisibilidadCeldaNuevoSriDetalladosIva) {
		this.isVisibilidadCeldaNuevoSriDetalladosIva = isVisibilidadCeldaNuevoSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSriDetalladosIva() {
		return isVisibilidadCeldaDuplicarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaDuplicarSriDetalladosIva(Boolean isVisibilidadCeldaDuplicarSriDetalladosIva) {
		this.isVisibilidadCeldaDuplicarSriDetalladosIva = isVisibilidadCeldaDuplicarSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSriDetalladosIva() {
		return isVisibilidadCeldaCopiarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaCopiarSriDetalladosIva(Boolean isVisibilidadCeldaCopiarSriDetalladosIva) {
		this.isVisibilidadCeldaCopiarSriDetalladosIva = isVisibilidadCeldaCopiarSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSriDetalladosIva() {
		return isVisibilidadCeldaVerFormSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaVerFormSriDetalladosIva(Boolean isVisibilidadCeldaVerFormSriDetalladosIva) {
		this.isVisibilidadCeldaVerFormSriDetalladosIva = isVisibilidadCeldaVerFormSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSriDetalladosIva() {
		return isVisibilidadCeldaOrdenSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaOrdenSriDetalladosIva(Boolean isVisibilidadCeldaOrdenSriDetalladosIva) {
		this.isVisibilidadCeldaOrdenSriDetalladosIva = isVisibilidadCeldaOrdenSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSriDetalladosIva() {
		return isVisibilidadCeldaNuevoRelacionesSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSriDetalladosIva(Boolean isVisibilidadCeldaNuevoRelacionesSriDetalladosIva) {
		this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva = isVisibilidadCeldaNuevoRelacionesSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSriDetalladosIva() {
		return isVisibilidadCeldaModificarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaModificarSriDetalladosIva(Boolean isVisibilidadCeldaModificarSriDetalladosIva) {
		this.isVisibilidadCeldaModificarSriDetalladosIva = isVisibilidadCeldaModificarSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSriDetalladosIva() {
		return isVisibilidadCeldaActualizarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaActualizarSriDetalladosIva(Boolean isVisibilidadCeldaActualizarSriDetalladosIva) {
		this.isVisibilidadCeldaActualizarSriDetalladosIva = isVisibilidadCeldaActualizarSriDetalladosIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarSriDetalladosIva() {
		return isVisibilidadCeldaEliminarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaEliminarSriDetalladosIva(Boolean isVisibilidadCeldaEliminarSriDetalladosIva) {
		this.isVisibilidadCeldaEliminarSriDetalladosIva = isVisibilidadCeldaEliminarSriDetalladosIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarSriDetalladosIva() {
		return isVisibilidadCeldaCancelarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaCancelarSriDetalladosIva(Boolean isVisibilidadCeldaCancelarSriDetalladosIva) {
		this.isVisibilidadCeldaCancelarSriDetalladosIva = isVisibilidadCeldaCancelarSriDetalladosIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarSriDetalladosIva() {
		return isVisibilidadCeldaGuardarSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaGuardarSriDetalladosIva(Boolean isVisibilidadCeldaGuardarSriDetalladosIva) {
		this.isVisibilidadCeldaGuardarSriDetalladosIva = isVisibilidadCeldaGuardarSriDetalladosIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSriDetalladosIva() {
		return isVisibilidadCeldaGuardarCambiosSriDetalladosIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSriDetalladosIva(Boolean isVisibilidadCeldaGuardarCambiosSriDetalladosIva) {
		this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva = isVisibilidadCeldaGuardarCambiosSriDetalladosIva;
	}
		
	public SriDetalladosIvaSessionBean getsridetalladosivaSessionBean() {
		return this.sridetalladosivaSessionBean;
	}
	
	public void setsridetalladosivaSessionBean(SriDetalladosIvaSessionBean sridetalladosivaSessionBean) {
		this.sridetalladosivaSessionBean=sridetalladosivaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSriDetalladosIva() {
		return this.isVisibilidadBusquedaSriDetalladosIva;
	}

	public void setisVisibilidadBusquedaSriDetalladosIva(Boolean isVisibilidadBusquedaSriDetalladosIva) {
		this.isVisibilidadBusquedaSriDetalladosIva=isVisibilidadBusquedaSriDetalladosIva;
	}

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	public Boolean getisVisibilidadFK_IdTipoComprobante() {
		return this.isVisibilidadFK_IdTipoComprobante;
	}

	public void setisVisibilidadFK_IdTipoComprobante(Boolean isVisibilidadFK_IdTipoComprobante) {
		this.isVisibilidadFK_IdTipoComprobante=isVisibilidadFK_IdTipoComprobante;
	}

	public Boolean getisVisibilidadFK_IdTipoIva() {
		return this.isVisibilidadFK_IdTipoIva;
	}

	public void setisVisibilidadFK_IdTipoIva(Boolean isVisibilidadFK_IdTipoIva) {
		this.isVisibilidadFK_IdTipoIva=isVisibilidadFK_IdTipoIva;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencionIva() {
		return this.isVisibilidadFK_IdTipoRetencionIva;
	}

	public void setisVisibilidadFK_IdTipoRetencionIva(Boolean isVisibilidadFK_IdTipoRetencionIva) {
		this.isVisibilidadFK_IdTipoRetencionIva=isVisibilidadFK_IdTipoRetencionIva;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencionIvaPresta() {
		return this.isVisibilidadFK_IdTipoRetencionIvaPresta;
	}

	public void setisVisibilidadFK_IdTipoRetencionIvaPresta(Boolean isVisibilidadFK_IdTipoRetencionIvaPresta) {
		this.isVisibilidadFK_IdTipoRetencionIvaPresta=isVisibilidadFK_IdTipoRetencionIvaPresta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(SriDetalladosIva sridetalladosiva)throws Exception {
		try {
			
				this.setActualParaGuardarPeriodoDeclaraForeignKey(sridetalladosiva,null);
				this.setActualParaGuardarTipoComprobanteForeignKey(sridetalladosiva,null);
				this.setActualParaGuardarTipoIvaForeignKey(sridetalladosiva,null);
				this.setActualParaGuardarTipoRetencionIvaForeignKey(sridetalladosiva,null);
				this.setActualParaGuardarTipoRetencionIvaPrestaForeignKey(sridetalladosiva,null);
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
	
	public void bugActualizarReferenciaActual(SriDetalladosIva sridetalladosiva,SriDetalladosIva sridetalladosivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSriDetalladosIva(sridetalladosiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sridetalladosivaAux.setId(sridetalladosiva.getId());
		sridetalladosivaAux.setVersionRow(sridetalladosiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SriDetalladosIva sridetalladosivaLocal) throws Exception {
		
		if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SriDetalladosIva sridetalladosivaLocal) throws Exception {	
		if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				sridetalladosivaLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoComprobanteDetalleFormJInternalFrame.class)) {
				TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrameLocal=(TipoComprobanteBeanSwingJInternalFrame) ((TipoComprobanteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocomprobanteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.gettipocomprobante(),true);
				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarLista(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante,this.tipocomprobantesForeignKey);

				tipocomprobanteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				sridetalladosivaLocal.setTipoComprobante(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante);

				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey("Formulario");
				this.setActualTipoComprobanteForeignKey(tipocomprobanteBeanSwingJInternalFrameLocal.tipocomprobante.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIvaDetalleFormJInternalFrame.class)) {
				TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrameLocal=(TipoIvaBeanSwingJInternalFrame) ((TipoIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIva(tipoivaBeanSwingJInternalFrameLocal.gettipoiva(),true);
				tipoivaBeanSwingJInternalFrameLocal.actualizarLista(tipoivaBeanSwingJInternalFrameLocal.tipoiva,this.tipoivasForeignKey);

				tipoivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				sridetalladosivaLocal.setTipoIva(tipoivaBeanSwingJInternalFrameLocal.tipoiva);

				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey("Formulario");
				this.setActualTipoIvaForeignKey(tipoivaBeanSwingJInternalFrameLocal.tipoiva.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionivaBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionivaBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionivasForeignKey);

				tiporetencionivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion);

				sridetalladosivaLocal.setTipoRetencionIva(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencionIva();
				this.cargarCombosFrameTipoRetencionIvasForeignKey("Formulario");
				this.setActualTipoRetencionIvaForeignKey(tiporetencionivaBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionivaprestaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionivaprestaBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionivaprestaBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionivaprestasForeignKey);

				tiporetencionivaprestaBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion);

				sridetalladosivaLocal.setTipoRetencionIvaPresta(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
				this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Formulario");
				this.setActualTipoRetencionIvaPrestaForeignKey(tiporetencionivaprestaBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSriDetalladosIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sridetalladosivaValidator.getInvalidValues(this.sridetalladosiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SriDetalladosIva sridetalladosiva,List<SriDetalladosIva> sridetalladosivas) throws Exception {
	}		
	
	public void actualizarSelectedLista(SriDetalladosIva sridetalladosiva,List<SriDetalladosIva> sridetalladosivas) throws Exception {
		try	{			
			SriDetalladosIvaConstantesFunciones.actualizarSelectedLista(sridetalladosiva,sridetalladosivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SriDetalladosIva> sridetalladosivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sridetalladosivasLocal=this.sridetalladosivaLogic.getSriDetalladosIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sridetalladosivasLocal=this.sridetalladosivas;
			}
			//ARCHITECTURE
		
			for(SriDetalladosIva sridetalladosivaLocal:sridetalladosivasLocal) {
				if(this.permiteMantenimiento(sridetalladosivaLocal) && sridetalladosivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SriDetalladosIvaConstantesFunciones.getSriDetalladosIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.NOMBRETIPOCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnombre_tipo_comprobanteSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.RUCDATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelruc_datoSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_documentoSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_emisionSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.FECHAREGISTROCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_registro_contableSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_serieSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_ivaSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.TOTALSINIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_sin_ivaSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.IDTIPOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_ivaSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.IDTIPORETENCIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_retencion_ivaSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.TRANSFEIVARETENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltransfe_iva_retenidoSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.IDTIPORETENCIONIVAPRESTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriDetalladosIvaConstantesFunciones.PRESTAIVARETENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelpresta_iva_retenidoSriDetalladosIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnombre_tipo_comprobanteSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelruc_datoSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_documentoSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_emisionSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_registro_contableSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_serieSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_ivaSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_sin_ivaSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_ivaSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_retencion_ivaSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltransfe_iva_retenidoSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelid_tipo_retencion_iva_prestaSriDetalladosIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelpresta_iva_retenidoSriDetalladosIva,"");
		
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
		this.iIdNuevoSriDetalladosIva--;	
		
		
		this.sridetalladosivaAux=new SriDetalladosIva();
		
		this.sridetalladosivaAux.setId(this.iIdNuevoSriDetalladosIva);
		this.sridetalladosivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sridetalladosivaLogic.getSriDetalladosIvas().add(this.sridetalladosivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sridetalladosivas.add(this.sridetalladosivaAux);
		}
		//ARCHITECTURE
		
		this.sridetalladosiva=this.sridetalladosivaAux;
		
		if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosiva);
			this.setVariablesObjetoActualToFormularioForeignKeySriDetalladosIva(this.sridetalladosiva);
		}
				
		//this.setDefaultControlesSriDetalladosIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySriDetalladosIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySriDetalladosIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySriDetalladosIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriDetalladosIva(this.sridetalladosivaBean,this.sridetalladosiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSriDetalladosIva(this.sridetalladosivaReturnGeneral,this.sridetalladosivaBean,false);
		
		if(this.sridetalladosivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva());
		}
		
		if(this.sridetalladosivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva(),classes);//this.sridetalladosivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySriDetalladosIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySriDetalladosIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.RecargarFormSriDetalladosIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSriDetalladosIva(false);
						
			if(sridetalladosivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriDetalladosIva();
			}
			
			this.actualizarVisualTableDatosSriDetalladosIva();
			
			this.jTableDatosSriDetalladosIva.setRowSelectionInterval(this.getIndiceNuevoSriDetalladosIva(), this.getIndiceNuevoSriDetalladosIva());
			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
						
			this.actualizarEstadoCeldasBotonesSriDetalladosIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSriDetalladosIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldrucSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarrucSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarnombre_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarruc_datoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarnumero_documentoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarfecha_emisionSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarfecha_registro_contableSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarnumero_serieSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activartotal_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activartotal_sin_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activartransfe_iva_retenidoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarpresta_iva_retenidoSriDetalladosIva);	
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarid_periodo_declaraSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarid_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarid_tipo_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setEnabled(isHabilitar && this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_iva_prestaSriDetalladosIva);
	};
	
	public void setDefaultControlesSriDetalladosIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSriDetalladosIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sridetalladosivaSessionBean.setConGuardarRelaciones(true);			
			this.sridetalladosivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.setVisible(true);
			
					
		} else {
			//this.sridetalladosivaSessionBean.setConGuardarRelaciones(false);			
			this.sridetalladosivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSriDetalladosIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
				if(sridetalladosivaAux.getId().equals(this.iIdNuevoSriDetalladosIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivas) {
				if(sridetalladosivaAux.getId().equals(this.iIdNuevoSriDetalladosIva)) {
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
	
	public int getIndiceActualSriDetalladosIva(SriDetalladosIva sridetalladosiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
				if(sridetalladosivaAux.getId().equals(sridetalladosiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivas) {
				if(sridetalladosivaAux.getId().equals(sridetalladosiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSriDetalladosIva(SriDetalladosIva sridetalladosivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
				if(sridetalladosivaAux.getSriDetalladosIvaOriginal().getId().equals(sridetalladosivaOriginal.getId())) {
					existe=true;
					sridetalladosivaOriginal.setId(sridetalladosivaAux.getId());
					sridetalladosivaOriginal.setVersionRow(sridetalladosivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivas) {
				if(sridetalladosivaAux.getSriDetalladosIvaOriginal().getId().equals(sridetalladosivaOriginal.getId())) {
					existe=true;
					sridetalladosivaOriginal.setId(sridetalladosivaAux.getId());
					sridetalladosivaOriginal.setVersionRow(sridetalladosivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSriDetalladosIva(Boolean esParaCancelar) throws Exception {
		sridetalladosivasAux=new ArrayList<SriDetalladosIva>();
		sridetalladosivaAux=new SriDetalladosIva();
		
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
					if(sridetalladosivaAux.getId()<0) {
						sridetalladosivasAux.add(sridetalladosivaAux);
					}		
				}
				this.iIdNuevoSriDetalladosIva=0L;
				this.sridetalladosivaLogic.getSriDetalladosIvas().removeAll(sridetalladosivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivas) {
					if(sridetalladosivaAux.getId()<0) {
						sridetalladosivasAux.add(sridetalladosivaAux);
					}		
				}
				this.iIdNuevoSriDetalladosIva=0L;
				this.sridetalladosivas.removeAll(sridetalladosivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSriDetalladosIva 
					&& this.sridetalladosivaLogic.getSriDetalladosIvas().size()>0
					) {
					sridetalladosivaAux=this.sridetalladosivaLogic.getSriDetalladosIvas().get(this.sridetalladosivaLogic.getSriDetalladosIvas().size() - 1);
				
					if(sridetalladosivaAux.getId()<0) {
						this.sridetalladosivaLogic.getSriDetalladosIvas().remove(sridetalladosivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSriDetalladosIva && this.sridetalladosivas.size()>0) {
					sridetalladosivaAux=this.sridetalladosivas.get(this.sridetalladosivas.size() - 1);
				
					if(sridetalladosivaAux.getId()<0) {
						this.sridetalladosivas.remove(sridetalladosivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSriDetalladosIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sridetalladosiva.getId()<0) {
				this.sridetalladosivaLogic.getSriDetalladosIvas().remove(this.sridetalladosiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sridetalladosiva.getId()<0) {
				this.sridetalladosivas.remove(this.sridetalladosiva);
			}
		}			
	}
	
	public void setEstadosInicialesSriDetalladosIva(List<SriDetalladosIva> sridetalladosivasAux) throws Exception {
		SriDetalladosIvaConstantesFunciones.setEstadosInicialesSriDetalladosIva(sridetalladosivasAux);
	}
	
	public void setEstadosInicialesSriDetalladosIva(SriDetalladosIva sridetalladosivaAux) throws Exception {
		SriDetalladosIvaConstantesFunciones.setEstadosInicialesSriDetalladosIva(sridetalladosivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSriDetalladosIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSriDetalladosIvaActual()) {
				if(!this.isEsNuevoSriDetalladosIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSriDetalladosIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSriDetalladosIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sri Detallados Iva ?", "MANTENIMIENTO DE Sri Detallados Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SriDetalladosIva sridetalladosiva) throws Exception {
		SriDetalladosIvaConstantesFunciones.seleccionarAsignar(this.sridetalladosiva,sridetalladosiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSriDetalladosIva=this.isPermisoActualizarOriginalSriDetalladosIva;
			
			
			this.seleccionarAsignar(sridetalladosiva);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSriDetalladosIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sridetalladosivaSessionBean.setsFuncionBusquedaRapida(this.sridetalladosivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSriDetalladosIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSriDetalladosIva(esParaCancelar);				
				this.cancelarNuevoSriDetalladosIva(esParaCancelar);								
			}
			
			this.sridetalladosiva=new SriDetalladosIva();
			
			this.inicializarSriDetalladosIva();
			
			this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSriDetalladosIva() throws Exception {
		try {
			SriDetalladosIvaConstantesFunciones.inicializarSriDetalladosIva(this.sridetalladosiva);
			
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
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sridetalladosivaLogic.getSriDetalladosIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSriDetalladosIvas(String sAccionBusqueda,List<SriDetalladosIva> sridetalladosivasParaReportes) throws Exception {
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
					sPathReporteFinal="SriDetalladosIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SriDetalladosIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SriDetalladosIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SriDetalladosIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sri Detallados Ivas");		
		parameters.put("busquedapor", SriDetalladosIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSriDetalladosIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SriDetalladosIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SriDetalladosIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSriDetalladosIva=new JRBeanArrayDataSource(SriDetalladosIvaJInternalFrame.TraerSriDetalladosIvaBeans(sridetalladosivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSriDetalladosIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SriDetalladosIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SriDetalladosIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SriDetalladosIvaBean.TraerSriDetalladosIvaBeans(sridetalladosivasParaReportes).toArray()));
							
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
				this.generarExcelReporteSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSriDetalladosIvaActionPerformed(null);
					//this.generarExcelReporteSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSriDetalladosIvas(sAccionBusqueda,sTipoArchivoReporte,sridetalladosivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSriDetalladosIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SriDetalladosIva> sridetalladosivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriDetalladosIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriDetalladosIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SriDetalladosIva sridetalladosiva : sridetalladosivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SriDetalladosIvaConstantesFunciones.generarExcelReporteDataSriDetalladosIva("NORMAL",row,workbook,sridetalladosiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSriDetalladosIva(String sTipo,Row row,Workbook workbook) {
		
		SriDetalladosIvaConstantesFunciones.generarExcelReporteHeaderSriDetalladosIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSriDetalladosIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SriDetalladosIva> sridetalladosivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriDetalladosIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SriDetalladosIva sridetalladosiva : sridetalladosivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SriDetalladosIvaConstantesFunciones.getSriDetalladosIvaDescripcion(sridetalladosiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettipocomprobante_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getnombre_tipo_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getruc_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getfecha_registro_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettotal_sin_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettipoiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettiporetencioniva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettransfe_iva_retenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.gettiporetencionivapresta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sridetalladosiva.getpresta_iva_retenido());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSriDetalladosIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<SriDetalladosIva> sridetalladosivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SriDetalladosIva> sridetalladosivasRespaldo=null;
		
		classes=SriDetalladosIvaConstantesFunciones.getClassesRelationshipsOfSriDetalladosIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sridetalladosivaLogic.setDatosCliente(this.datosCliente);
		this.sridetalladosivaLogic.setDatosDeep(this.datosDeep);
		this.sridetalladosivaLogic.setIsConDeep(true);
		
		sridetalladosivasRespaldo=this.sridetalladosivaLogic.getSriDetalladosIvas();
		
		this.sridetalladosivaLogic.setSriDetalladosIvas(sridetalladosivasParaReportes);	
		this.sridetalladosivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sridetalladosivasParaReportes=this.sridetalladosivaLogic.getSriDetalladosIvas();
		this.sridetalladosivaLogic.setSriDetalladosIvas(sridetalladosivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriDetalladosIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriDetalladosIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SriDetalladosIva sridetalladosiva : sridetalladosivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSriDetalladosIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SriDetalladosIvaConstantesFunciones.generarExcelReporteDataSriDetalladosIva("NORMAL",row,workbook,sridetalladosiva,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SriDetalladosIvaConstantesFunciones.getSriDetalladosIvaDescripcion(sridetalladosiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSriDetalladosIva() throws Exception {		
		this.startProcessSriDetalladosIva(true);
	}
	
	public void startProcessSriDetalladosIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSriDetalladosIva ,this.jPanelParametrosReportesSriDetalladosIva, this.jScrollPanelDatosSriDetalladosIva,this.jPanelPaginacionSriDetalladosIva, this.jScrollPanelDatosEdicionSriDetalladosIva, this.jPanelAccionesSriDetalladosIva,this.jPanelAccionesFormularioSriDetalladosIva,this.jmenuBarSriDetalladosIva,this.jmenuBarDetalleSriDetalladosIva,this.jTtoolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva);		
		
		final JTabbedPane jTabbedPaneBusquedasSriDetalladosIva=this.jTabbedPaneBusquedasSriDetalladosIva; 
		
		final JPanel jPanelParametrosReportesSriDetalladosIva=this.jPanelParametrosReportesSriDetalladosIva;
		//final JScrollPane jScrollPanelDatosSriDetalladosIva=this.jScrollPanelDatosSriDetalladosIva;
		final JTable jTableDatosSriDetalladosIva=this.jTableDatosSriDetalladosIva;		
		final JPanel jPanelPaginacionSriDetalladosIva=this.jPanelPaginacionSriDetalladosIva;
		//final JScrollPane jScrollPanelDatosEdicionSriDetalladosIva=this.jScrollPanelDatosEdicionSriDetalladosIva;
		final JPanel jPanelAccionesSriDetalladosIva=this.jPanelAccionesSriDetalladosIva;
		
		JPanel jPanelCamposAuxiliarSriDetalladosIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSriDetalladosIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			jPanelCamposAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jPanelCamposSriDetalladosIva;
			jPanelAccionesFormularioAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jPanelAccionesFormularioSriDetalladosIva;
		}
		
		final JPanel jPanelCamposSriDetalladosIva=jPanelCamposAuxiliarSriDetalladosIva;
		final JPanel jPanelAccionesFormularioSriDetalladosIva=jPanelAccionesFormularioAuxiliarSriDetalladosIva;
		
		
		final JMenuBar jmenuBarSriDetalladosIva=this.jmenuBarSriDetalladosIva;
		final JToolBar jTtoolBarSriDetalladosIva=this.jTtoolBarSriDetalladosIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSriDetalladosIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriDetalladosIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			jmenuBarDetalleAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jmenuBarDetalleSriDetalladosIva;
			jTtoolBarDetalleAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jTtoolBarDetalleSriDetalladosIva;
		}
		
		final JMenuBar jmenuBarDetalleSriDetalladosIva=jmenuBarDetalleAuxiliarSriDetalladosIva;
		final JToolBar jTtoolBarDetalleSriDetalladosIva=jTtoolBarDetalleAuxiliarSriDetalladosIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriDetalladosIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriDetalladosIva;
			processRunnable.jTableDatos=jTableDatosSriDetalladosIva;
			processRunnable.jPanelCampos=jPanelCamposSriDetalladosIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriDetalladosIva;
			processRunnable.jPanelAcciones=jPanelAccionesSriDetalladosIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriDetalladosIva;
			
			
			processRunnable.jmenuBar=jmenuBarSriDetalladosIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriDetalladosIva;
			processRunnable.jTtoolBar=jTtoolBarSriDetalladosIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriDetalladosIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriDetalladosIva ,jPanelParametrosReportesSriDetalladosIva,jTableDatosSriDetalladosIva, /*jScrollPanelDatosSriDetalladosIva,*/jPanelCamposSriDetalladosIva,jPanelPaginacionSriDetalladosIva, /*jScrollPanelDatosEdicionSriDetalladosIva,*/ jPanelAccionesSriDetalladosIva,jPanelAccionesFormularioSriDetalladosIva,jmenuBarSriDetalladosIva,jmenuBarDetalleSriDetalladosIva,jTtoolBarSriDetalladosIva,jTtoolBarDetalleSriDetalladosIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriDetalladosIva ,jPanelParametrosReportesSriDetalladosIva, jScrollPanelDatosSriDetalladosIva,jPanelPaginacionSriDetalladosIva, jScrollPanelDatosEdicionSriDetalladosIva, jPanelAccionesSriDetalladosIva,jPanelAccionesFormularioSriDetalladosIva,jmenuBarSriDetalladosIva,jmenuBarDetalleSriDetalladosIva,jTtoolBarSriDetalladosIva,jTtoolBarDetalleSriDetalladosIva);
						
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
	
	public void finishProcessSriDetalladosIva() {// throws Exception 
		this.finishProcessSriDetalladosIva(true);
	}
	
	public void finishProcessSriDetalladosIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSriDetalladosIva ,this.jPanelParametrosReportesSriDetalladosIva, this.jScrollPanelDatosSriDetalladosIva,this.jPanelPaginacionSriDetalladosIva, this.jScrollPanelDatosEdicionSriDetalladosIva, this.jPanelAccionesSriDetalladosIva,this.jPanelAccionesFormularioSriDetalladosIva,this.jmenuBarSriDetalladosIva,this.jmenuBarDetalleSriDetalladosIva,this.jTtoolBarSriDetalladosIva,this.jTtoolBarDetalleSriDetalladosIva);		
		
		final JTabbedPane jTabbedPaneBusquedasSriDetalladosIva=this.jTabbedPaneBusquedasSriDetalladosIva; 
		
		final JPanel jPanelParametrosReportesSriDetalladosIva=this.jPanelParametrosReportesSriDetalladosIva;
		//final JScrollPane jScrollPanelDatosSriDetalladosIva=this.jScrollPanelDatosSriDetalladosIva;
		final JTable jTableDatosSriDetalladosIva=this.jTableDatosSriDetalladosIva;		
		final JPanel jPanelPaginacionSriDetalladosIva=this.jPanelPaginacionSriDetalladosIva;
		//final JScrollPane jScrollPanelDatosEdicionSriDetalladosIva=this.jScrollPanelDatosEdicionSriDetalladosIva;
		final JPanel jPanelAccionesSriDetalladosIva=this.jPanelAccionesSriDetalladosIva;
		
		JPanel jPanelCamposAuxiliarSriDetalladosIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSriDetalladosIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			jPanelCamposAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jPanelCamposSriDetalladosIva;
			jPanelAccionesFormularioAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jPanelAccionesFormularioSriDetalladosIva;
		}
		
		final JPanel jPanelCamposSriDetalladosIva=jPanelCamposAuxiliarSriDetalladosIva;
		final JPanel jPanelAccionesFormularioSriDetalladosIva=jPanelAccionesFormularioAuxiliarSriDetalladosIva;
		
		
		final JMenuBar jmenuBarSriDetalladosIva=this.jmenuBarSriDetalladosIva;		
		final JToolBar jTtoolBarSriDetalladosIva=this.jTtoolBarSriDetalladosIva;
				
		JMenuBar jmenuBarDetalleAuxiliarSriDetalladosIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriDetalladosIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			jmenuBarDetalleAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jmenuBarDetalleSriDetalladosIva;
			jTtoolBarDetalleAuxiliarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jTtoolBarDetalleSriDetalladosIva;		
		}
		
		final JMenuBar jmenuBarDetalleSriDetalladosIva=jmenuBarDetalleAuxiliarSriDetalladosIva;
		final JToolBar jTtoolBarDetalleSriDetalladosIva=jTtoolBarDetalleAuxiliarSriDetalladosIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriDetalladosIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriDetalladosIva;
			processRunnable.jTableDatos=jTableDatosSriDetalladosIva;
			processRunnable.jPanelCampos=jPanelCamposSriDetalladosIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriDetalladosIva;
			processRunnable.jPanelAcciones=jPanelAccionesSriDetalladosIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriDetalladosIva;
			
			
			processRunnable.jmenuBar=jmenuBarSriDetalladosIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriDetalladosIva;
			processRunnable.jTtoolBar=jTtoolBarSriDetalladosIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriDetalladosIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSriDetalladosIva ,jPanelParametrosReportesSriDetalladosIva, jTableDatosSriDetalladosIva,/*jScrollPanelDatosSriDetalladosIva,*/jPanelCamposSriDetalladosIva,jPanelPaginacionSriDetalladosIva, /*jScrollPanelDatosEdicionSriDetalladosIva,*/ jPanelAccionesSriDetalladosIva,jPanelAccionesFormularioSriDetalladosIva,jmenuBarSriDetalladosIva,jmenuBarDetalleSriDetalladosIva,jTtoolBarSriDetalladosIva,jTtoolBarDetalleSriDetalladosIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSriDetalladosIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSriDetalladosIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSriDetalladosIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSriDetalladosIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSriDetalladosIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSriDetalladosIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSriDetalladosIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSriDetalladosIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSriDetalladosIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sridetalladosivaConstantesFunciones.getsFinalQuerySriDetalladosIva();
		String  finalQueryPaginacionTodos=this.sridetalladosivaConstantesFunciones.getsFinalQuerySriDetalladosIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SriDetalladosIvaConstantesFunciones.getArrayColumnasGlobalesNoSriDetalladosIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SriDetalladosIvaConstantesFunciones.getArrayColumnasGlobalesSriDetalladosIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SriDetalladosIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sridetalladosivasEliminados= new ArrayList<SriDetalladosIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSriDetalladosIva();
		
				///*SriDetalladosIvaSessionBean*/this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			
			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
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
					this.iNumeroPaginacion=SriDetalladosIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SriDetalladosIvaConstantesFunciones.getClassesForeignKeysOfSriDetalladosIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sridetalladosiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sridetalladosivasAux= new ArrayList<SriDetalladosIva>();
			
				
			sridetalladosivaLogic.setDatosCliente(this.datosCliente);
			sridetalladosivaLogic.setDatosDeep(this.datosDeep);
			sridetalladosivaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSriDetalladosIva")) {
				this.sDetalleReporte=SriDetalladosIvaConstantesFunciones.getDetalleIndiceBusquedaSriDetalladosIva(id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sridetalladosivaLogic.getSriDetalladosIvasBusquedaSriDetalladosIva(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriDetalladosIvaConstantesFunciones.getDetalleIndiceBusquedaSriDetalladosIva(id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriDetalladosIvaConstantesFunciones.getDetalleIndiceBusquedaSriDetalladosIva(id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sridetalladosivaLogic.getSriDetalladosIvas()==null||sridetalladosivaLogic.getSriDetalladosIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sridetalladosivas==null|| sridetalladosivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sridetalladosivasAux=new ArrayList<SriDetalladosIva>();
						sridetalladosivasAux.addAll(sridetalladosivaLogic.getSriDetalladosIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sridetalladosivasAux=new ArrayList<SriDetalladosIva>();
							sridetalladosivasAux.addAll(sridetalladosivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sridetalladosivaLogic.getSriDetalladosIvasBusquedaSriDetalladosIva(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriDetalladosIvaConstantesFunciones.getDetalleIndiceBusquedaSriDetalladosIva(id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriDetalladosIvaConstantesFunciones.getDetalleIndiceBusquedaSriDetalladosIva(id_periodo_declaraBusquedaSriDetalladosIva,id_tipo_comprobanteBusquedaSriDetalladosIva,rucBusquedaSriDetalladosIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSriDetalladosIvas("BusquedaSriDetalladosIva",sridetalladosivaLogic.getSriDetalladosIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSriDetalladosIvas("BusquedaSriDetalladosIva",sridetalladosivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sridetalladosivaLogic.setSriDetalladosIvas(new ArrayList<SriDetalladosIva>());
						sridetalladosivaLogic.getSriDetalladosIvas().addAll(sridetalladosivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sridetalladosivas=new ArrayList<SriDetalladosIva>();
							sridetalladosivas.addAll(sridetalladosivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSriDetalladosIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSriDetalladosIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sridetalladosivaLogic.getSriDetalladosIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sridetalladosivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sridetalladosivaLogic.getSriDetalladosIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sridetalladosivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SriDetalladosIva sridetalladosiva) {
		Boolean permite=true;
		
		if(this.sridetalladosiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SriDetalladosIvaConstantesFunciones.getOrderByListaSriDetalladosIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SriDetalladosIvaConstantesFunciones.getOrderByListaSriDetalladosIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriDetalladosIva sridetalladosiva:sridetalladosivaLogic.getSriDetalladosIvas()) {
				if(sridetalladosiva.getsType().equals(Constantes2.S_TOTALES)) {
					sridetalladosivaTotales=sridetalladosiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriDetalladosIva sridetalladosiva:this.sridetalladosivas) {
				if(sridetalladosiva.getsType().equals(Constantes2.S_TOTALES)) {
					sridetalladosivaTotales=sridetalladosiva;
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
			this.sridetalladosivaAux=new SriDetalladosIva();
			this.sridetalladosivaAux.setsType(Constantes2.S_TOTALES);
			this.sridetalladosivaAux.setIsNew(false);
			this.sridetalladosivaAux.setIsChanged(false);
			this.sridetalladosivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SriDetalladosIvaConstantesFunciones.TotalizarValoresFilaSriDetalladosIva(this.sridetalladosivaLogic.getSriDetalladosIvas(),this.sridetalladosivaAux);
				
				//this.sridetalladosivaLogic.getSriDetalladosIvas().add(this.sridetalladosivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SriDetalladosIvaConstantesFunciones.TotalizarValoresFilaSriDetalladosIva(this.sridetalladosivas,this.sridetalladosivaAux);
				
				this.sridetalladosivas.add(this.sridetalladosivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sridetalladosivaTotales=new SriDetalladosIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sridetalladosivaLogic.getSriDetalladosIvas().remove(sridetalladosivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sridetalladosivas.remove(sridetalladosivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sridetalladosivaTotales=new SriDetalladosIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriDetalladosIva sridetalladosiva:sridetalladosivaLogic.getSriDetalladosIvas()) {
				if(sridetalladosiva.getsType().equals(Constantes2.S_TOTALES)) {
					sridetalladosivaTotales=sridetalladosiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriDetalladosIvaConstantesFunciones.TotalizarValoresFilaSriDetalladosIva(this.sridetalladosivaLogic.getSriDetalladosIvas(),sridetalladosivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriDetalladosIva sridetalladosiva:this.sridetalladosivas) {
				if(sridetalladosiva.getsType().equals(Constantes2.S_TOTALES)) {
					sridetalladosivaTotales=sridetalladosiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriDetalladosIvaConstantesFunciones.TotalizarValoresFilaSriDetalladosIva(this.sridetalladosivas,sridetalladosivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSriDetalladosIvasBusquedaSriDetalladosIva()throws Exception {
		try {
			sAccionBusqueda="BusquedaSriDetalladosIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriDetalladosIvasFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriDetalladosIvasFK_IdTipoComprobante()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoComprobante";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriDetalladosIvasFK_IdTipoIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriDetalladosIvasFK_IdTipoRetencionIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencionIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriDetalladosIvasFK_IdTipoRetencionIvaPresta()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencionIvaPresta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSriDetalladosIvasBusquedaSriDetalladosIva(String sFinalQuery,Long id_periodo_declara,Long id_tipo_comprobante,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasBusquedaSriDetalladosIva(sFinalQuery,this.pagination,id_periodo_declara,id_tipo_comprobante,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriDetalladosIvasFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriDetalladosIvasFK_IdTipoComprobante(String sFinalQuery,Long id_tipo_comprobante)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasFK_IdTipoComprobante(sFinalQuery,this.pagination,id_tipo_comprobante);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriDetalladosIvasFK_IdTipoIva(String sFinalQuery,Long id_tipo_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasFK_IdTipoIva(sFinalQuery,this.pagination,id_tipo_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriDetalladosIvasFK_IdTipoRetencionIva(String sFinalQuery,Long id_tipo_retencion_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasFK_IdTipoRetencionIva(sFinalQuery,this.pagination,id_tipo_retencion_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriDetalladosIvasFK_IdTipoRetencionIvaPresta(String sFinalQuery,Long id_tipo_retencion_iva_presta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sridetalladosivaLogic.getSriDetalladosIvasFK_IdTipoRetencionIvaPresta(sFinalQuery,this.pagination,id_tipo_retencion_iva_presta);
				
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
	
	public void inicializarPermisosSriDetalladosIva() {
		this.isPermisoTodoSriDetalladosIva=false;
		this.isPermisoNuevoSriDetalladosIva=false;
		this.isPermisoActualizarSriDetalladosIva=false;
		this.isPermisoActualizarOriginalSriDetalladosIva=false;
		this.isPermisoEliminarSriDetalladosIva=false;
		this.isPermisoGuardarCambiosSriDetalladosIva=false;
		this.isPermisoConsultaSriDetalladosIva=true;
		this.isPermisoBusquedaSriDetalladosIva=true;
		this.isPermisoReporteSriDetalladosIva=true;
		this.isPermisoOrdenSriDetalladosIva=false;		
		this.isPermisoPaginacionMedioSriDetalladosIva=false;		
		this.isPermisoPaginacionAltoSriDetalladosIva=false;		
		this.isPermisoPaginacionTodoSriDetalladosIva=false;		
		this.isPermisoCopiarSriDetalladosIva=false;		
		this.isPermisoVerFormSriDetalladosIva=false;		
		this.isPermisoDuplicarSriDetalladosIva=false;
		this.isPermisoOrdenSriDetalladosIva=false;
	}
	
	public void setPermisosUsuarioSriDetalladosIva(Boolean isPermiso) {
		this.isPermisoTodoSriDetalladosIva=isPermiso;
		this.isPermisoNuevoSriDetalladosIva=isPermiso;
		this.isPermisoActualizarSriDetalladosIva=isPermiso;
		this.isPermisoActualizarOriginalSriDetalladosIva=isPermiso;
		this.isPermisoEliminarSriDetalladosIva=isPermiso;
		this.isPermisoGuardarCambiosSriDetalladosIva=isPermiso;
		this.isPermisoConsultaSriDetalladosIva=isPermiso;
		this.isPermisoBusquedaSriDetalladosIva=isPermiso;
		this.isPermisoReporteSriDetalladosIva=isPermiso;
		this.isPermisoOrdenSriDetalladosIva=isPermiso;		
		this.isPermisoPaginacionMedioSriDetalladosIva=isPermiso;		
		this.isPermisoPaginacionAltoSriDetalladosIva=isPermiso;		
		this.isPermisoPaginacionTodoSriDetalladosIva=isPermiso;		
		this.isPermisoCopiarSriDetalladosIva=isPermiso;		
		this.isPermisoVerFormSriDetalladosIva=isPermiso;		
		this.isPermisoDuplicarSriDetalladosIva=isPermiso;
		this.isPermisoOrdenSriDetalladosIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSriDetalladosIva(Boolean isPermiso) {
		//this.isPermisoTodoSriDetalladosIva=isPermiso;
		this.isPermisoNuevoSriDetalladosIva=isPermiso;
		this.isPermisoActualizarSriDetalladosIva=isPermiso;
		this.isPermisoActualizarOriginalSriDetalladosIva=isPermiso;
		this.isPermisoEliminarSriDetalladosIva=isPermiso;
		this.isPermisoGuardarCambiosSriDetalladosIva=isPermiso;
		//this.isPermisoConsultaSriDetalladosIva=isPermiso;
		//this.isPermisoBusquedaSriDetalladosIva=isPermiso;
		//this.isPermisoReporteSriDetalladosIva=isPermiso;
		//this.isPermisoOrdenSriDetalladosIva=isPermiso;		
		//this.isPermisoPaginacionMedioSriDetalladosIva=isPermiso;		
		//this.isPermisoPaginacionAltoSriDetalladosIva=isPermiso;		
		//this.isPermisoPaginacionTodoSriDetalladosIva=isPermiso;		
		//this.isPermisoCopiarSriDetalladosIva=isPermiso;		
		//this.isPermisoDuplicarSriDetalladosIva=isPermiso;
		//this.isPermisoOrdenSriDetalladosIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSriDetalladosIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SriDetalladosIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSriDetalladosIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSriDetalladosIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSriDetalladosIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSriDetalladosIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSriDetalladosIvaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSriDetalladosIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SriDetalladosIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SriDetalladosIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSriDetalladosIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSriDetalladosIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSriDetalladosIva=this.isPermisoActualizarSriDetalladosIva;
			this.isPermisoEliminarSriDetalladosIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSriDetalladosIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSriDetalladosIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSriDetalladosIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSriDetalladosIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSriDetalladosIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriDetalladosIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSriDetalladosIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSriDetalladosIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSriDetalladosIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSriDetalladosIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSriDetalladosIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSriDetalladosIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriDetalladosIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSriDetalladosIva.setToolTipText(this.jTableDatosSriDetalladosIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSriDetalladosIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSriDetalladosIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SriDetalladosIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SriDetalladosIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSriDetalladosIva() throws Exception {
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
	public void inicializarCombosForeignKeySriDetalladosIvaListas()throws Exception {
		try	{						
			
				this.periododeclarasForeignKey=new ArrayList();
				this.tipocomprobantesForeignKey=new ArrayList();
				this.tipoivasForeignKey=new ArrayList();
				this.tiporetencionivasForeignKey=new ArrayList();
				this.tiporetencionivaprestasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySriDetalladosIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SriDetalladosIvaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionIvaPrestaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoComprobanteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocomprobantesForeignKey==null||this.tipocomprobantesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoComprobanteConstantesFunciones.getArrayColumnasGlobalesTipoComprobante(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoComprobanteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoComprobanteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoComprobantesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoivasForeignKey==null||this.tipoivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIvaConstantesFunciones.getArrayColumnasGlobalesTipoIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionivasForeignKey==null||this.tiporetencionivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaPrestaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionivaprestasForeignKey==null||this.tiporetencionivaprestasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionIvaPrestasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeySriDetalladosIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
			this.addItemDefectoCombosForeignKeyTipoComprobante();
			this.addItemDefectoCombosForeignKeyTipoIva();
			this.addItemDefectoCombosForeignKeyTipoRetencionIva();
			this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {
			if(this.sridetalladosivaSessionBean==null) {
				this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean();
			}

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				PeriodoDeclara periododeclara=new PeriodoDeclara();
				PeriodoDeclaraConstantesFunciones.setPeriodoDeclaraDescripcion(periododeclara,Constantes.SMENSAJE_ESCOJA_OPCION);
				periododeclara.setId(null);

				if(!PeriodoDeclaraConstantesFunciones.ExisteEnLista(this.periododeclarasForeignKey,periododeclara,true)) {

					this.periododeclarasForeignKey.add(0,periododeclara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoComprobante()throws Exception {
		try {

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoComprobante()) {
				TipoComprobante tipocomprobante=new TipoComprobante();
				TipoComprobanteConstantesFunciones.setTipoComprobanteDescripcion(tipocomprobante,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocomprobante.setId(null);

				if(!TipoComprobanteConstantesFunciones.ExisteEnLista(this.tipocomprobantesForeignKey,tipocomprobante,true)) {

					this.tipocomprobantesForeignKey.add(0,tipocomprobante);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIva()throws Exception {
		try {

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoIva()) {
				TipoIva tipoiva=new TipoIva();
				TipoIvaConstantesFunciones.setTipoIvaDescripcion(tipoiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoiva.setId(null);

				if(!TipoIvaConstantesFunciones.ExisteEnLista(this.tipoivasForeignKey,tipoiva,true)) {

					this.tipoivasForeignKey.add(0,tipoiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencionIva()throws Exception {
		try {

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIva()) {
				TipoRetencion tiporetencioniva=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencioniva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencioniva.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionivasForeignKey,tiporetencioniva,true)) {

					this.tiporetencionivasForeignKey.add(0,tiporetencioniva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencionIvaPresta()throws Exception {
		try {

			if(!this.sridetalladosivaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionIvaPresta()) {
				TipoRetencion tiporetencionivapresta=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencionivapresta,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencionivapresta.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionivaprestasForeignKey,tiporetencionivapresta,true)) {

					this.tiporetencionivaprestasForeignKey.add(0,tiporetencionivapresta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySriDetalladosIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySriDetalladosIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySriDetalladosIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySriDetalladosIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySriDetalladosIva(SriDetalladosIva sridetalladosiva)throws Exception {	
		try {
			
			this.setActualTipoIvaForeignKey(sridetalladosiva.getid_tipo_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaForeignKey(sridetalladosiva.getid_tipo_retencion_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaPrestaForeignKey(sridetalladosiva.getid_tipo_retencion_iva_presta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySriDetalladosIva(SriDetalladosIva sridetalladosiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySriDetalladosIva()throws Exception {	
		try {
			
			this.setActualTipoIvaForeignKey(this.sridetalladosivaConstantesFunciones.getid_tipo_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaForeignKey(this.sridetalladosivaConstantesFunciones.getid_tipo_retencion_iva(),false,"Formulario");
			this.setActualTipoRetencionIvaPrestaForeignKey(this.sridetalladosivaConstantesFunciones.getid_tipo_retencion_iva_presta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySriDetalladosIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySriDetalladosIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySriDetalladosIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSriDetalladosIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySriDetalladosIva()throws Exception {
		try {
			

			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
			this.cargarCombosFrameTipoComprobantesForeignKey("Todos");
			this.cargarCombosFrameTipoIvasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionIvasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySriDetalladosIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySriDetalladosIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public SriDetalladosIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SriDetalladosIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SriDetalladosIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sridetalladosivaSessionBean=new SriDetalladosIvaSessionBean(); 
		this.sridetalladosivaConstantesFunciones=new SriDetalladosIvaConstantesFunciones(); 
		this.sridetalladosivaBean=new SriDetalladosIva();//(this.sridetalladosivaConstantesFunciones); 		
		this.sridetalladosivaReturnGeneral=new SriDetalladosIvaParameterReturnGeneral(); 
		
		this.sridetalladosivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sridetalladosivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SriDetalladosIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SriDetalladosIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SriDetalladosIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSriDetalladosIva(true);
			
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
			
			this.sridetalladosivaConstantesFunciones=new SriDetalladosIvaConstantesFunciones(); 
			this.sridetalladosivaBean=new SriDetalladosIva();//this.sridetalladosivaConstantesFunciones); 			
			this.sridetalladosivaReturnGeneral=new SriDetalladosIvaParameterReturnGeneral(); 
		
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Detallados Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.sridetalladosiva=new SriDetalladosIva();
			this.sridetalladosivas = new ArrayList<SriDetalladosIva>();
			this.sridetalladosivasAux = new ArrayList<SriDetalladosIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic=new SriDetalladosIvaLogic();
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			//this.sridetalladosivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sridetalladosivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSriDetalladosIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriDetalladosIva);	
					}
					
					if(this.jInternalFrameImportacionSriDetalladosIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriDetalladosIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySriDetalladosIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySriDetalladosIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSriDetalladosIva);
				this.jInternalFrameDetalleFormSriDetalladosIva.setVisible(false);
				this.jInternalFrameDetalleFormSriDetalladosIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriDetalladosIva);
					this.jInternalFrameReporteDinamicoSriDetalladosIva.setVisible(false);
					this.jInternalFrameReporteDinamicoSriDetalladosIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSriDetalladosIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSriDetalladosIva);
					this.jInternalFrameImportacionSriDetalladosIva.setVisible(false);
					this.jInternalFrameImportacionSriDetalladosIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySriDetalladosIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySriDetalladosIva);
					this.jInternalFrameOrderBySriDetalladosIva.setVisible(false);
					this.jInternalFrameOrderBySriDetalladosIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSriDetalladosIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SriDetalladosIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sridetalladosivaReturnGeneral=new SriDetalladosIvaParameterReturnGeneral();
			
			this.sridetalladosivaParameterGeneral=new SriDetalladosIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sridetalladosivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SriDetalladosIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriDetalladosIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),this.sridetalladosivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriDetalladosIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),this.sridetalladosivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaDuplicarSriDetalladosIva=true;
			this.isVisibilidadCeldaCopiarSriDetalladosIva=true;
			this.isVisibilidadCeldaVerFormSriDetalladosIva=true;
			this.isVisibilidadCeldaOrdenSriDetalladosIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			
			
			this.isVisibilidadBusquedaSriDetalladosIva=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			this.isVisibilidadFK_IdTipoComprobante=true;
			this.isVisibilidadFK_IdTipoIva=true;
			this.isVisibilidadFK_IdTipoRetencionIva=true;
			this.isVisibilidadFK_IdTipoRetencionIvaPresta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSriDetalladosIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSriDetalladosIva(false);
			
			this.setPermisosUsuarioSriDetalladosIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado() 
				|| (this.sridetalladosivaSessionBean.getEsGuardarRelacionado() && this.sridetalladosivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSriDetalladosIvaClasesRelacionadas();
			}
			
			if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSriDetalladosIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSriDetalladosIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSriDetalladosIva();
			}
			
			if(!this.isPermisoBusquedaSriDetalladosIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SriDetalladosIvaConstantesFunciones.getTiposSeleccionarSriDetalladosIva());
				
				this.tiposColumnasSelect=SriDetalladosIvaConstantesFunciones.getTiposSeleccionarSriDetalladosIva(true);
				
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
			//if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSriDetalladosIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSriDetalladosIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSriDetalladosIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSriDetalladosIva() ;
			
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
			
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			this.tipocomprobanteLogic=new TipoComprobanteLogic();
			this.tipoivaLogic=new TipoIvaLogic();
			this.tiporetencionivaLogic=new TipoRetencionLogic();
			this.tiporetencionivaprestaLogic=new TipoRetencionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sridetalladosivaImplementable= (SriDetalladosIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriDetalladosIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sridetalladosivaImplementableHome= (SriDetalladosIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriDetalladosIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sridetalladosivas= new ArrayList<SriDetalladosIva>();
			this.sridetalladosivasEliminados= new ArrayList<SriDetalladosIva>();
						
			this.isEsNuevoSriDetalladosIva=false;
			this.esParaAccionDesdeFormularioSriDetalladosIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			this.tipocomprobantesForeignKey=new ArrayList<TipoComprobante>() ;
			this.tipoivasForeignKey=new ArrayList<TipoIva>() ;
			this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>() ;
			this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySriDetalladosIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSriDetalladosIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SriDetalladosIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSriDetalladosIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSriDetalladosIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSriDetalladosIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSriDetalladosIva();
			}
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSriDetalladosIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSriDetalladosIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSriDetalladosIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSriDetalladosIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SriDetalladosIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSriDetalladosIva() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSriDetalladosIva")) {
				iIndex=this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSriDetalladosIva();	
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
	
	public void cargarCombosForeignKeySriDetalladosIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySriDetalladosIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySriDetalladosIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySriDetalladosIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySriDetalladosIva();
		
		this.cargarCombosFrameForeignKeySriDetalladosIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySriDetalladosIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySriDetalladosIva();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodoDeclara(this.periododeclarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoComprobante(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoComprobanteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoComprobante();
				this.cargarCombosFrameTipoComprobantesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoComprobante(this.tipocomprobantesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIva();
				this.cargarCombosFrameTipoIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIva(this.tipoivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencionIva();
				this.cargarCombosFrameTipoRetencionIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencionIva(this.tiporetencionivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionIvaPresta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionIvaPrestaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
				this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencionIvaPresta(this.tiporetencionivaprestasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSriDetalladosIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			
			if(jTableDatosSriDetalladosIva.getRowCount()>=1) {
				jTableDatosSriDetalladosIva.removeRowSelectionInterval(0, jTableDatosSriDetalladosIva.getRowCount()-1);						
			}
			
			this.isEsNuevoSriDetalladosIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSriDetalladosIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSriDetalladosIva(true);			
			//this.sridetalladosiva=new SriDetalladosIva();
			//this.sridetalladosiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriDetalladosIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriDetalladosIva() ;
			
			if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriDetalladosIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sridetalladosiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);				
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SriDetalladosIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSriDetalladosIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSriDetalladosIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSriDetalladosIva.getSelectedRows().length;			
			}
			
			sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSriDetalladosIva--;			
				//SriDetalladosIva sridetalladosivaAux= new SriDetalladosIva();			
				//sridetalladosivaAux.setId(this.iIdNuevoSriDetalladosIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SriDetalladosIva sridetalladosivaOrigen=new SriDetalladosIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SriDetalladosIva sridetalladosivaOrigen : sridetalladosivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sridetalladosivaOrigen =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sridetalladosivaOrigen =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSriDetalladosIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sridetalladosiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSriDetalladosIva(sridetalladosivaOrigen,this.sridetalladosiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sridetalladosivaLogic.getSriDetalladosIvas().add(this.sridetalladosivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sridetalladosivas.add(this.sridetalladosivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
				
				this.jTableDatosSriDetalladosIva.setRowSelectionInterval(this.getIndiceNuevoSriDetalladosIva(), this.getIndiceNuevoSriDetalladosIva());
				
				int iLastRow =  this.jTableDatosSriDetalladosIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriDetalladosIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriDetalladosIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriDetalladosIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();									
		
			SriDetalladosIva sridetalladosivaOrigen=new SriDetalladosIva();
			SriDetalladosIva sridetalladosivaDestino=new SriDetalladosIva();
				
			sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSriDetalladosIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sridetalladosivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSriDetalladosIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sridetalladosivaOrigen =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sridetalladosivaOrigen =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sridetalladosivaDestino =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sridetalladosivaDestino =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sridetalladosivaOrigen =sridetalladosivasSeleccionados.get(0);
				sridetalladosivaDestino =sridetalladosivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSriDetalladosIva(sridetalladosivaOrigen,sridetalladosivaDestino,true,false);
				
				sridetalladosivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sridetalladosivaDestino,sridetalladosivaLogic.getSriDetalladosIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sridetalladosivaDestino,sridetalladosivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
				
				//this.jTableDatosSriDetalladosIva.setRowSelectionInterval(this.getIndiceNuevoSriDetalladosIva(), this.getIndiceNuevoSriDetalladosIva());
				
				int iLastRow =  this.jTableDatosSriDetalladosIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriDetalladosIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriDetalladosIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriDetalladosIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSriDetalladosIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSriDetalladosIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSriDetalladosIva.setVisible(!isVisible);
			this.jPanelPaginacionSriDetalladosIva.setVisible(!isVisible);
			this.jPanelAccionesSriDetalladosIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSriDetalladosIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSriDetalladosIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSriDetalladosIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySriDetalladosIva();
			
			this.abrirFrameOrderBySriDetalladosIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySriDetalladosIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSriDetalladosIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriDetalladosIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSriDetalladosIva.isMaximum()) {
					this.jInternalFrameDetalleFormSriDetalladosIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSriDetalladosIva.setSize(this.jInternalFrameDetalleFormSriDetalladosIva.iWidthFormulario,this.jInternalFrameDetalleFormSriDetalladosIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSriDetalladosIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSriDetalladosIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSriDetalladosIva.isMaximum()) {
						this.jInternalFrameDetalleFormSriDetalladosIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSriDetalladosIva.jContentPaneDetalleSriDetalladosIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSriDetalladosIva.jContentPaneDetalleSriDetalladosIva.getWidth(),SriDetalladosIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSriDetalladosIva.jContentPaneDetalleSriDetalladosIva.getWidth(),SriDetalladosIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSriDetalladosIva.jContentPaneDetalleSriDetalladosIva.getWidth(),SriDetalladosIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSriDetalladosIva.setVisible(true);
	        this.jInternalFrameDetalleFormSriDetalladosIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySriDetalladosIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySriDetalladosIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySriDetalladosIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriDetalladosIva,false,this);
				} else {
					this.jInternalFrameOrderBySriDetalladosIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriDetalladosIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySriDetalladosIva);
				this.jInternalFrameOrderBySriDetalladosIva.setVisible(false);
				this.jInternalFrameOrderBySriDetalladosIva.setSelected(false);
				
				this.jInternalFrameOrderBySriDetalladosIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriDetalladosIva"));
				
				this.inicializarActualizarBindingTablaOrderBySriDetalladosIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSriDetalladosIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSriDetalladosIva==null) {
				
				this.jInternalFrameImportacionSriDetalladosIva=new ImportacionJInternalFrame(SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriDetalladosIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSriDetalladosIva);
				this.jInternalFrameImportacionSriDetalladosIva.setVisible(false);
				this.jInternalFrameImportacionSriDetalladosIva.setSelected(false);


				this.jInternalFrameImportacionSriDetalladosIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriDetalladosIva"));
				this.jInternalFrameImportacionSriDetalladosIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriDetalladosIva"));
				this.jInternalFrameImportacionSriDetalladosIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriDetalladosIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSriDetalladosIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSriDetalladosIva==null) {
				this.jInternalFrameReporteDinamicoSriDetalladosIva=new ReporteDinamicoJInternalFrame(SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriDetalladosIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriDetalladosIva);
				this.jInternalFrameReporteDinamicoSriDetalladosIva.setVisible(false);
				this.jInternalFrameReporteDinamicoSriDetalladosIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriDetalladosIva"));
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriDetalladosIva"));
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriDetalladosIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriDetalladosIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSriDetalladosIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriDetalladosIva);
			
	       	this.jInternalFrameDetalleFormSriDetalladosIva.setVisible(false);
	        this.jInternalFrameDetalleFormSriDetalladosIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormSriDetalladosIva.dispose();
			//this.jInternalFrameDetalleFormSriDetalladosIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSriDetalladosIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSriDetalladosIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoSriDetalladosIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSriDetalladosIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSriDetalladosIva.setVisible(true);
	        this.jInternalFrameImportacionSriDetalladosIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySriDetalladosIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySriDetalladosIva.setVisible(true);
	        this.jInternalFrameOrderBySriDetalladosIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySriDetalladosIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySriDetalladosIva.setVisible(false);
	        this.jInternalFrameOrderBySriDetalladosIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSriDetalladosIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSriDetalladosIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoSriDetalladosIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSriDetalladosIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSriDetalladosIva.setVisible(false);
	        this.jInternalFrameImportacionSriDetalladosIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSriDetalladosIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSriDetalladosIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSriDetalladosIva(true);
			//this.isEsNuevoSriDetalladosIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSriDetalladosIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriDetalladosIva(false) ;
			
			if(sridetalladosivaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriDetalladosIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriDetalladosIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSriDetalladosIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSriDetalladosIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSriDetalladosIva(true);
			//this.isEsNuevoSriDetalladosIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sridetalladosiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSriDetalladosIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSriDetalladosIva(false) ;
			
			if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriDetalladosIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriDetalladosIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoComprobante(List<TipoComprobante> tipocomprobantesForeignKey)throws Exception{
		TableColumn tableColumnTipoComprobante=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE));
		TableCellEditor tableCellEditorTipoComprobante =tableColumnTipoComprobante.getCellEditor();

		TipoComprobanteTableCell tipocomprobanteTableCellFk=(TipoComprobanteTableCell)tableCellEditorTipoComprobante;

		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.settipocomprobantesForeignKey(tipocomprobantesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocomprobanteTableCellFk.setRowActual(intSelectedRow);
			//tipocomprobanteTableCellFk.settipocomprobantesForeignKeyActual(tipocomprobantesForeignKey);
		//}


		if(tipocomprobanteTableCellFk!=null) {
			tipocomprobanteTableCellFk.RecargarTipoComprobantesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIva(List<TipoIva> tipoivasForeignKey)throws Exception{
		TableColumn tableColumnTipoIva=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA));
		TableCellEditor tableCellEditorTipoIva =tableColumnTipoIva.getCellEditor();

		TipoIvaTableCell tipoivaTableCellFk=(TipoIvaTableCell)tableCellEditorTipoIva;

		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.settipoivasForeignKey(tipoivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoivaTableCellFk.setRowActual(intSelectedRow);
			//tipoivaTableCellFk.settipoivasForeignKeyActual(tipoivasForeignKey);
		//}


		if(tipoivaTableCellFk!=null) {
			tipoivaTableCellFk.RecargarTipoIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencionIva(List<TipoRetencion> tiporetencionivasForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencionIva=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA));
		TableCellEditor tableCellEditorTipoRetencionIva =tableColumnTipoRetencionIva.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencionIva;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionivasForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencionIvaPresta(List<TipoRetencion> tiporetencionivaprestasForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencionIvaPresta=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA));
		TableCellEditor tableCellEditorTipoRetencionIvaPresta =tableColumnTipoRetencionIvaPresta.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencionIvaPresta;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionivaprestasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionivaprestasForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSriDetalladosIva(false);
			
			//if(!this.isEsNuevoSriDetalladosIva) {								
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				
			}
			
			if(this.permiteMantenimiento(this.sridetalladosiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSriDetalladosIva=true;
					this.inicializarActualizarBindingTablaSriDetalladosIva(false);
					this.isEsNuevoSriDetalladosIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSriDetalladosIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSriDetalladosIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriDetalladosIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriDetalladosIva(false);
				
				this.habilitarDeshabilitarControlesSriDetalladosIva(false);
			
												
				
				if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSriDetalladosIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSriDetalladosIvaActionPerformed(evt,sridetalladosivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSriDetalladosIva(this.sridetalladosiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sridetalladosivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sridetalladosiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				this.sridetalladosiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				this.sridetalladosiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sridetalladosiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SriDetalladosIvaModel) this.jTableDatosSriDetalladosIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSriDetalladosIva=true;
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
				this.isEsNuevoSriDetalladosIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriDetalladosIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriDetalladosIva(false);
				
				this.habilitarDeshabilitarControlesSriDetalladosIva(false);
				
				
				
				if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSriDetalladosIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSriDetalladosIva.getRowCount()>=1) {
				jTableDatosSriDetalladosIva.removeRowSelectionInterval(0, jTableDatosSriDetalladosIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSriDetalladosIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriDetalladosIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriDetalladosIva(false) ;
			
			this.isEsNuevoSriDetalladosIva=false;
			
			if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSriDetalladosIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSriDetalladosIva(false);
				
				//SI ES MANUAL
				if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSriDetalladosIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSriDetalladosIva--;			
			//SriDetalladosIva sridetalladosivaAux= new SriDetalladosIva();			
			//sridetalladosivaAux.setId(this.iIdNuevoSriDetalladosIva);
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSriDetalladosIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
			
			this.sridetalladosiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sridetalladosivaLogic.getSriDetalladosIvas().add(this.sridetalladosivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sridetalladosivas.add(this.sridetalladosivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			
			this.jTableDatosSriDetalladosIva.setRowSelectionInterval(this.getIndiceNuevoSriDetalladosIva(), this.getIndiceNuevoSriDetalladosIva());
			
			int iLastRow =  this.jTableDatosSriDetalladosIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSriDetalladosIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSriDetalladosIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriDetalladosIva(false);
			
			//SI ES MANUAL
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriDetalladosIva();
			}
			
			//this.abrirFrameTreeSriDetalladosIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSriDetalladosIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSriDetalladosIva.setFileImportacion(this.jInternalFrameImportacionSriDetalladosIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSriDetalladosIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSriDetalladosIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSriDetalladosIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSriDetalladosIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		

		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SriDetalladosIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SriDetalladosIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaRegistroContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaRegistroContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaRegistroContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaRegistroContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talSinIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talSinIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talSinIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talSinIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ansfeIvaRetenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ansfeIvaRetenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ansfeIvaRetenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ansfeIvaRetenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencionIvaPresta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencionIvaPresta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencionIvaPresta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencionIvaPresta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_estaIvaRetenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_estaIvaRetenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_estaIvaRetenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_estaIvaRetenido_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoria="nombre_tipo_comprobante";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO:
					sNombreCampoCategoria="ruc_dato";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoria="fecha_registro_contable";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoria="total_sin_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoria="id_tipo_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					sNombreCampoCategoria="id_tipo_retencion_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					sNombreCampoCategoria="transfe_iva_retenido";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					sNombreCampoCategoria="id_tipo_retencion_iva_presta";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					sNombreCampoCategoria="presta_iva_retenido";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoriaValor="nombre_tipo_comprobante";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO:
					sNombreCampoCategoriaValor="ruc_dato";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoriaValor="fecha_registro_contable";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA:
					sNombreCampoCategoriaValor="total_sin_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA:
					sNombreCampoCategoriaValor="id_tipo_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					sNombreCampoCategoriaValor="id_tipo_retencion_iva";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					sNombreCampoCategoriaValor="transfe_iva_retenido";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					sNombreCampoCategoriaValor="id_tipo_retencion_iva_presta";
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					sNombreCampoCategoriaValor="presta_iva_retenido";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_comprobante");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_dato");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Registro Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_registro_contable");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Sin Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_sin_iva");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_iva");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion_iva");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transfe Iva Reteno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"transfe_iva_retenido");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion Iva Presta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion_iva_presta");
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Presta Iva Reteno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"presta_iva_retenido");
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
	
	public void jButtonGenerarExcelReporteDinamicoSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SriDetalladosIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettipocomprobante_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUC);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getnombre_tipo_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getruc_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getfecha_registro_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettotal_sin_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettipoiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettiporetencioniva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettransfe_iva_retenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.gettiporetencionivapresta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO);
					iRow++;

					for(SriDetalladosIva sridetalladosiva:sridetalladosivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sridetalladosiva.getpresta_iva_retenido());
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
			//	this.getFilaCabeceraExportarExcelSriDetalladosIva(row);				
			//	iRow++;
			//}				
			
			//for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSriDetalladosIva(sridetalladosivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriDetalladosIva(false);
			
			//SI ES MANUAL
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriDetalladosIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriDetalladosIva(false);
			
			//SI ES MANUAL
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriDetalladosIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriDetalladosIva(false);
			
			//SI ES MANUAL
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriDetalladosIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSriDetalladosIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSriDetalladosIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSriDetalladosIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSriDetalladosIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSriDetalladosIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSriDetalladosIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosSriDetalladosIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosSriDetalladosIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSriDetalladosIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSriDetalladosIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSriDetalladosIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSriDetalladosIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSriDetalladosIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSriDetalladosIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriDetalladosIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSriDetalladosIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSriDetalladosIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSriDetalladosIva();
		
		this.inicializarActualizarBindingBotonesManualSriDetalladosIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSriDetalladosIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriDetalladosIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSriDetalladosIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSriDetalladosIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSriDetalladosIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSriDetalladosIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSriDetalladosIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionNuevoSriDetalladosIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionSinCerrarSriDetalladosIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionSinMensajeSriDetalladosIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSriDetalladosIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSriDetalladosIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSriDetalladosIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionNuevoSriDetalladosIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionSinCerrarSriDetalladosIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSriDetalladosIva.jCheckBoxPostAccionSinMensajeSriDetalladosIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSriDetalladosIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSriDetalladosIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSriDetalladosIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSriDetalladosIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSriDetalladosIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSriDetalladosIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSriDetalladosIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSriDetalladosIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSriDetalladosIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSriDetalladosIva(Boolean esInicializar) throws Exception {
		try	{	
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSriDetalladosIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSriDetalladosIva() throws Exception {
		try	{
			if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSriDetalladosIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriDetalladosIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSriDetalladosIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSriDetalladosIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSriDetalladosIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSriDetalladosIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSriDetalladosIva.addItem(reporte);
			}
			
			
			if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSriDetalladosIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSriDetalladosIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSriDetalladosIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSriDetalladosIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSriDetalladosIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSriDetalladosIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSriDetalladosIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriDetalladosIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriDetalladosIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SriDetalladosIvaConstantesFunciones.getTiposSeleccionarSriDetalladosIva(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SriDetalladosIvaConstantesFunciones.getTiposSeleccionarSriDetalladosIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SriDetalladosIvaConstantesFunciones.getTiposSeleccionarSriDetalladosIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSriDetalladosIva.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSriDetalladosIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.getSelectedItem()!=null){this.id_periodo_declaraBusquedaSriDetalladosIva=((PeriodoDeclara)this.jComboBoxid_periodo_declaraBusquedaSriDetalladosIvaSriDetalladosIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.getSelectedItem()!=null){this.id_tipo_comprobanteBusquedaSriDetalladosIva=((TipoComprobante)this.jComboBoxid_tipo_comprobanteBusquedaSriDetalladosIvaSriDetalladosIva.getSelectedItem()).getId();}
		this.rucBusquedaSriDetalladosIva=this.jTextFieldrucBusquedaSriDetalladosIvaSriDetalladosIva.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSriDetalladosIva(Boolean esInicializar) throws Exception {				
		if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSriDetalladosIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSriDetalladosIva() throws Exception {
		this.inicializarActualizarBindingTablaSriDetalladosIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySriDetalladosIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSriDetalladosIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSriDetalladosIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sridetalladosivaLogic.getSriDetalladosIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sridetalladosivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSriDetalladosIva.setModel(new SriDetalladosIvaModel(this.sridetalladosivaLogic.getSriDetalladosIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSriDetalladosIva.setModel(new SriDetalladosIvaModel(this.sridetalladosivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySriDetalladosIva!=null && this.jInternalFrameOrderBySriDetalladosIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySriDetalladosIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,sridetalladosivaConstantesFunciones.resaltarSeleccionarSriDetalladosIva,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SriDetalladosIvaConstantesFunciones.SCLASSWEBTITULO,sridetalladosivaConstantesFunciones.resaltarSeleccionarSriDetalladosIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_ID));

		if(this.sridetalladosivaConstantesFunciones.mostraridSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sridetalladosivaConstantesFunciones.resaltaridSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activaridSriDetalladosIva,iSizeTabla,this,true,"idSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltaridSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activaridSriDetalladosIva,this,true,"idSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE));

		if(this.sridetalladosivaConstantesFunciones.mostrarnombre_tipo_comprobanteSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sridetalladosivaConstantesFunciones.resaltarnombre_tipo_comprobanteSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnombre_tipo_comprobanteSriDetalladosIva,iSizeTabla,this,true,"nombre_tipo_comprobanteSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarnombre_tipo_comprobanteSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnombre_tipo_comprobanteSriDetalladosIva,this,true,"nombre_tipo_comprobanteSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO));

		if(this.sridetalladosivaConstantesFunciones.mostrarruc_datoSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sridetalladosivaConstantesFunciones.resaltarruc_datoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarruc_datoSriDetalladosIva,iSizeTabla,this,true,"ruc_datoSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarruc_datoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarruc_datoSriDetalladosIva,this,true,"ruc_datoSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.sridetalladosivaConstantesFunciones.mostrarnumero_documentoSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sridetalladosivaConstantesFunciones.resaltarnumero_documentoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnumero_documentoSriDetalladosIva,iSizeTabla,this,true,"numero_documentoSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarnumero_documentoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnumero_documentoSriDetalladosIva,this,true,"numero_documentoSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION));

		if(this.sridetalladosivaConstantesFunciones.mostrarfecha_emisionSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sridetalladosivaConstantesFunciones.resaltarfecha_emisionSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarfecha_emisionSriDetalladosIva,iSizeTabla,this,true,"fecha_emisionSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarfecha_emisionSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarfecha_emisionSriDetalladosIva,this,true,"fecha_emisionSriDetalladosIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE));

		if(this.sridetalladosivaConstantesFunciones.mostrarfecha_registro_contableSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sridetalladosivaConstantesFunciones.resaltarfecha_registro_contableSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarfecha_registro_contableSriDetalladosIva,iSizeTabla,this,true,"fecha_registro_contableSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarfecha_registro_contableSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarfecha_registro_contableSriDetalladosIva,this,true,"fecha_registro_contableSriDetalladosIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.sridetalladosivaConstantesFunciones.mostrarnumero_serieSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sridetalladosivaConstantesFunciones.resaltarnumero_serieSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnumero_serieSriDetalladosIva,iSizeTabla,this,true,"numero_serieSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarnumero_serieSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarnumero_serieSriDetalladosIva,this,true,"numero_serieSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA));

		if(this.sridetalladosivaConstantesFunciones.mostrartotal_ivaSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sridetalladosivaConstantesFunciones.resaltartotal_ivaSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartotal_ivaSriDetalladosIva,iSizeTabla,this,true,"total_ivaSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltartotal_ivaSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartotal_ivaSriDetalladosIva,this,true,"total_ivaSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA));

		if(this.sridetalladosivaConstantesFunciones.mostrartotal_sin_ivaSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sridetalladosivaConstantesFunciones.resaltartotal_sin_ivaSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartotal_sin_ivaSriDetalladosIva,iSizeTabla,this,true,"total_sin_ivaSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltartotal_sin_ivaSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartotal_sin_ivaSriDetalladosIva,this,true,"total_sin_ivaSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA));

		if(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_ivaSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIvaTableCell(this.tipoivasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_ivaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_ivaSriDetalladosIva,iSizeTabla));
			tableColumn.setCellEditor(new TipoIvaTableCell(this.tipoivasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_ivaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_ivaSriDetalladosIva,true,"id_tipo_ivaSriDetalladosIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA));

		if(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_ivaSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionivasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_ivaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_ivaSriDetalladosIva,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionivasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_ivaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_ivaSriDetalladosIva,true,"id_tipo_retencion_ivaSriDetalladosIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO));

		if(this.sridetalladosivaConstantesFunciones.mostrartransfe_iva_retenidoSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sridetalladosivaConstantesFunciones.resaltartransfe_iva_retenidoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartransfe_iva_retenidoSriDetalladosIva,iSizeTabla,this,true,"transfe_iva_retenidoSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltartransfe_iva_retenidoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activartransfe_iva_retenidoSriDetalladosIva,this,true,"transfe_iva_retenidoSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA));

		if(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionivaprestasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_iva_prestaSriDetalladosIva,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionivaprestasForeignKey,this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriDetalladosIva,this,this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_iva_prestaSriDetalladosIva,true,"id_tipo_retencion_iva_prestaSriDetalladosIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO));

		if(this.sridetalladosivaConstantesFunciones.mostrarpresta_iva_retenidoSriDetalladosIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sridetalladosivaConstantesFunciones.resaltarpresta_iva_retenidoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarpresta_iva_retenidoSriDetalladosIva,iSizeTabla,this,true,"presta_iva_retenidoSriDetalladosIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sridetalladosivaConstantesFunciones.resaltarpresta_iva_retenidoSriDetalladosIva,this.sridetalladosivaConstantesFunciones.activarpresta_iva_retenidoSriDetalladosIva,this,true,"presta_iva_retenidoSriDetalladosIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriDetalladosIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriDetalladosIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriDetalladosIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSriDetalladosIva.addColumn(tableColumn);
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
			
			this.jTableDatosSriDetalladosIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSriDetalladosIva.moveColumn(this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSriDetalladosIva.moveColumn(this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSriDetalladosIva.moveColumn(this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSriDetalladosIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSriDetalladosIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSriDetalladosIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSriDetalladosIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSriDetalladosIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSriDetalladosIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSriDetalladosIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=sridetalladosivaLogic.getSriDetalladosIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sridetalladosivas.size()-1;
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
		//this.jTableDatosSriDetalladosIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSriDetalladosIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSriDetalladosIva();
			
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
				
				//this.isEsNuevoSriDetalladosIva=false;
					
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
				if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSriDetalladosIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriDetalladosIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sridetalladosiva.getsType().equals("DUPLICADO")
				   || this.sridetalladosiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSriDetalladosIva=true;
				
				} else {
					this.isEsNuevoSriDetalladosIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
					if(this.sridetalladosiva.getId()>=0 && !this.sridetalladosiva.getIsNew()) {						
						this.isEsNuevoSriDetalladosIva=false;
						
					} else {
						this.isEsNuevoSriDetalladosIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSriDetalladosIva(esRelaciones);						
				
				this.seleccionarSriDetalladosIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sridetalladosiva.getId()<0) {
					this.isEsNuevoSriDetalladosIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSriDetalladosIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSriDetalladosIva(evt,rowIndex);
				}	
				
				if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SriDetalladosIva: " + this.dDif); 
					}
				}								
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSriDetalladosIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sridetalladosiva)) {
					if(this.sridetalladosiva.getId()>0) {
						this.sridetalladosiva.setIsDeleted(true);
						
						this.sridetalladosivasEliminados.add(this.sridetalladosiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sridetalladosivaLogic.getSriDetalladosIvas().remove(this.sridetalladosiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sridetalladosivas.remove(this.sridetalladosiva);				
					}
					
					
					((SriDetalladosIvaModel) this.jTableDatosSriDetalladosIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSriDetalladosIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSriDetalladosIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSriDetalladosIva) {
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriDetalladosIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriDetalladosIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosiva);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoIva
					if(!this.sridetalladosivaConstantesFunciones.cargarid_tipo_ivaSriDetalladosIva || this.sridetalladosivaConstantesFunciones.event_dependid_tipo_ivaSriDetalladosIva) {
						//this.cargarCombosTipoIvasForeignKeyLista(" where id="+this.sridetalladosiva.getid_tipo_iva());
									//this.inicializarActualizarBindingSriDetalladosIva(false,false);
						this.tipoivasForeignKey=new ArrayList<TipoIva>();

						if(sridetalladosiva.getTipoIva()!=null) {
							this.tipoivasForeignKey.add(sridetalladosiva.getTipoIva());
						}

						this.addItemDefectoCombosForeignKeyTipoIva();
						this.cargarCombosFrameTipoIvasForeignKey("Todos");
					}
					this.setActualTipoIvaForeignKey(this.sridetalladosiva.getid_tipo_iva(),false,"Formulario");

					//TipoRetencionIva
					if(!this.sridetalladosivaConstantesFunciones.cargarid_tipo_retencion_ivaSriDetalladosIva || this.sridetalladosivaConstantesFunciones.event_dependid_tipo_retencion_ivaSriDetalladosIva) {
						//this.cargarCombosTipoRetencionIvasForeignKeyLista(" where id="+this.sridetalladosiva.getid_tipo_retencion_iva());
									//this.inicializarActualizarBindingSriDetalladosIva(false,false);
						this.tiporetencionivasForeignKey=new ArrayList<TipoRetencion>();

						if(sridetalladosiva.getTipoRetencionIva()!=null) {
							this.tiporetencionivasForeignKey.add(sridetalladosiva.getTipoRetencionIva());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencionIva();
						this.cargarCombosFrameTipoRetencionIvasForeignKey("Todos");
					}
					this.setActualTipoRetencionIvaForeignKey(this.sridetalladosiva.getid_tipo_retencion_iva(),false,"Formulario");

					//TipoRetencionIvaPresta
					if(!this.sridetalladosivaConstantesFunciones.cargarid_tipo_retencion_iva_prestaSriDetalladosIva || this.sridetalladosivaConstantesFunciones.event_dependid_tipo_retencion_iva_prestaSriDetalladosIva) {
						//this.cargarCombosTipoRetencionIvaPrestasForeignKeyLista(" where id="+this.sridetalladosiva.getid_tipo_retencion_iva_presta());
									//this.inicializarActualizarBindingSriDetalladosIva(false,false);
						this.tiporetencionivaprestasForeignKey=new ArrayList<TipoRetencion>();

						if(sridetalladosiva.getTipoRetencionIvaPresta()!=null) {
							this.tiporetencionivaprestasForeignKey.add(sridetalladosiva.getTipoRetencionIvaPresta());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencionIvaPresta();
						this.cargarCombosFrameTipoRetencionIvaPrestasForeignKey("Todos");
					}
					this.setActualTipoRetencionIvaPrestaForeignKey(this.sridetalladosiva.getid_tipo_retencion_iva_presta(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSriDetalladosIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSriDetalladosIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriDetalladosIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriDetalladosIva(SriDetalladosIva sridetalladosiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSriDetalladosIva(sridetalladosiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriDetalladosIva(SriDetalladosIva sridetalladosiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSriDetalladosIva(sridetalladosiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySriDetalladosIva(sridetalladosiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySriDetalladosIva(sridetalladosiva);
	}
	
	public void setVariablesObjetoActualToFormularioSriDetalladosIva(SriDetalladosIva sridetalladosiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setText(sridetalladosiva.getId().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setText(sridetalladosiva.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setText(sridetalladosiva.getruc_dato());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setText(sridetalladosiva.getnumero_documento());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setDate(sridetalladosiva.getfecha_emision());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setDate(sridetalladosiva.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setText(sridetalladosiva.getnumero_serie());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setText(sridetalladosiva.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setText(sridetalladosiva.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setText(sridetalladosiva.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setText(sridetalladosiva.getpresta_iva_retenido().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SriDetalladosIva sridetalladosivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sridetalladosivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SriDetalladosIva sridetalladosivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sridetalladosivaLocal=this.sridetalladosiva;
			} else {
				sridetalladosivaLocal=this.sridetalladosivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sridetalladosivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSriDetalladosIva(sridetalladosivaLocal,true);
					
					if(sridetalladosivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sridetalladosivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sridetalladosivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSriDetalladosIva(SriDetalladosIva sridetalladosiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriDetalladosIva(sridetalladosiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(sridetalladosiva);
	}
	
	public void setVariablesFormularioToObjetoActualSriDetalladosIva(SriDetalladosIva sridetalladosiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriDetalladosIva(sridetalladosiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSriDetalladosIva(SriDetalladosIva sridetalladosiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.getText()==null || this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.getText()=="" || this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.getText()=="Id") {
				this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setText("0");
			}

			if(conColumnasBase) {sridetalladosiva.setId(Long.parseLong(this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelIdSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setnombre_tipo_comprobante(this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnombre_tipo_comprobanteSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setruc_dato(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelruc_datoSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setnumero_documento(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_documentoSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setfecha_emision(this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_emisionSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setfecha_registro_contable(this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelfecha_registro_contableSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setnumero_serie(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelnumero_serieSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_ivaSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.settotal_sin_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltotal_sin_ivaSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.settransfe_iva_retenido(Double.parseDouble(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabeltransfe_iva_retenidoSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sridetalladosiva.setpresta_iva_retenido(Double.parseDouble(this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriDetalladosIva.jLabelpresta_iva_retenidoSriDetalladosIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriDetalladosIva(SriDetalladosIva sridetalladosivaBean,SriDetalladosIva sridetalladosiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && sridetalladosivaBean.getid_tipo_iva()!=null && !sridetalladosivaBean.getid_tipo_iva().equals(-1L))) {sridetalladosiva.setid_tipo_iva(sridetalladosivaBean.getid_tipo_iva());}
			if(conDefault || (!conDefault && sridetalladosivaBean.getid_tipo_retencion_iva()!=null && !sridetalladosivaBean.getid_tipo_retencion_iva().equals(-1L))) {sridetalladosiva.setid_tipo_retencion_iva(sridetalladosivaBean.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sridetalladosivaBean.getid_tipo_retencion_iva_presta()!=null && !sridetalladosivaBean.getid_tipo_retencion_iva_presta().equals(-1L))) {sridetalladosiva.setid_tipo_retencion_iva_presta(sridetalladosivaBean.getid_tipo_retencion_iva_presta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSriDetalladosIva(SriDetalladosIva sridetalladosivaOrigen,SriDetalladosIva sridetalladosiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sridetalladosivaOrigen.getId()!=null && !sridetalladosivaOrigen.getId().equals(0L))) {sridetalladosiva.setId(sridetalladosivaOrigen.getId());}}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getruc()!=null && !sridetalladosivaOrigen.getruc().equals(""))) {sridetalladosiva.setruc(sridetalladosivaOrigen.getruc());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getnombre_tipo_comprobante()!=null && !sridetalladosivaOrigen.getnombre_tipo_comprobante().equals(""))) {sridetalladosiva.setnombre_tipo_comprobante(sridetalladosivaOrigen.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getruc_dato()!=null && !sridetalladosivaOrigen.getruc_dato().equals(""))) {sridetalladosiva.setruc_dato(sridetalladosivaOrigen.getruc_dato());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getnumero_documento()!=null && !sridetalladosivaOrigen.getnumero_documento().equals(""))) {sridetalladosiva.setnumero_documento(sridetalladosivaOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getfecha_emision()!=null && !sridetalladosivaOrigen.getfecha_emision().equals(new Date()))) {sridetalladosiva.setfecha_emision(sridetalladosivaOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getfecha_registro_contable()!=null && !sridetalladosivaOrigen.getfecha_registro_contable().equals(new Date()))) {sridetalladosiva.setfecha_registro_contable(sridetalladosivaOrigen.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getnumero_serie()!=null && !sridetalladosivaOrigen.getnumero_serie().equals(""))) {sridetalladosiva.setnumero_serie(sridetalladosivaOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.gettotal_iva()!=null && !sridetalladosivaOrigen.gettotal_iva().equals(0.0))) {sridetalladosiva.settotal_iva(sridetalladosivaOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.gettotal_sin_iva()!=null && !sridetalladosivaOrigen.gettotal_sin_iva().equals(0.0))) {sridetalladosiva.settotal_sin_iva(sridetalladosivaOrigen.gettotal_sin_iva());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getid_tipo_iva()!=null && !sridetalladosivaOrigen.getid_tipo_iva().equals(-1L))) {sridetalladosiva.setid_tipo_iva(sridetalladosivaOrigen.getid_tipo_iva());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getid_tipo_retencion_iva()!=null && !sridetalladosivaOrigen.getid_tipo_retencion_iva().equals(-1L))) {sridetalladosiva.setid_tipo_retencion_iva(sridetalladosivaOrigen.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.gettransfe_iva_retenido()!=null && !sridetalladosivaOrigen.gettransfe_iva_retenido().equals(0.0))) {sridetalladosiva.settransfe_iva_retenido(sridetalladosivaOrigen.gettransfe_iva_retenido());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getid_tipo_retencion_iva_presta()!=null && !sridetalladosivaOrigen.getid_tipo_retencion_iva_presta().equals(-1L))) {sridetalladosiva.setid_tipo_retencion_iva_presta(sridetalladosivaOrigen.getid_tipo_retencion_iva_presta());}
			if(conDefault || (!conDefault && sridetalladosivaOrigen.getpresta_iva_retenido()!=null && !sridetalladosivaOrigen.getpresta_iva_retenido().equals(0.0))) {sridetalladosiva.setpresta_iva_retenido(sridetalladosivaOrigen.getpresta_iva_retenido());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriDetalladosIva(SriDetalladosIva sridetalladosiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setText(sridetalladosiva.getId().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setText(sridetalladosiva.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setText(sridetalladosiva.getruc_dato());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setText(sridetalladosiva.getnumero_documento());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setDate(sridetalladosiva.getfecha_emision());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setDate(sridetalladosiva.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setText(sridetalladosiva.getnumero_serie());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setText(sridetalladosiva.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setText(sridetalladosiva.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setText(sridetalladosiva.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setText(sridetalladosiva.getpresta_iva_retenido().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriDetalladosIva(SriDetalladosIvaBean sridetalladosivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setText(sridetalladosivaBean.getId().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setText(sridetalladosivaBean.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setText(sridetalladosivaBean.getruc_dato());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setText(sridetalladosivaBean.getnumero_documento());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setDate(sridetalladosivaBean.getfecha_emision());
			this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setDate(sridetalladosivaBean.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setText(sridetalladosivaBean.getnumero_serie());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setText(sridetalladosivaBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setText(sridetalladosivaBean.gettotal_sin_iva().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setText(sridetalladosivaBean.gettransfe_iva_retenido().toString());
			this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setText(sridetalladosivaBean.getpresta_iva_retenido().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSriDetalladosIva(SriDetalladosIvaParameterReturnGeneral sridetalladosivaReturnGeneral,SriDetalladosIvaBean sridetalladosivaBean,Boolean conDefault) throws Exception { 
		try {
			SriDetalladosIva sridetalladosivaLocal=new SriDetalladosIva();
			
			sridetalladosivaLocal=sridetalladosivaReturnGeneral.getSriDetalladosIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sridetalladosivaLocal.getId()!=null && !sridetalladosivaLocal.getId().equals(0L))) {sridetalladosivaBean.setId(sridetalladosivaLocal.getId());}}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getnombre_tipo_comprobante()!=null && !sridetalladosivaLocal.getnombre_tipo_comprobante().equals(""))) {sridetalladosivaBean.setnombre_tipo_comprobante(sridetalladosivaLocal.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getruc_dato()!=null && !sridetalladosivaLocal.getruc_dato().equals(""))) {sridetalladosivaBean.setruc_dato(sridetalladosivaLocal.getruc_dato());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getnumero_documento()!=null && !sridetalladosivaLocal.getnumero_documento().equals(""))) {sridetalladosivaBean.setnumero_documento(sridetalladosivaLocal.getnumero_documento());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getfecha_emision()!=null && !sridetalladosivaLocal.getfecha_emision().equals(new Date()))) {sridetalladosivaBean.setfecha_emision(sridetalladosivaLocal.getfecha_emision());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getfecha_registro_contable()!=null && !sridetalladosivaLocal.getfecha_registro_contable().equals(new Date()))) {sridetalladosivaBean.setfecha_registro_contable(sridetalladosivaLocal.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getnumero_serie()!=null && !sridetalladosivaLocal.getnumero_serie().equals(""))) {sridetalladosivaBean.setnumero_serie(sridetalladosivaLocal.getnumero_serie());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.gettotal_iva()!=null && !sridetalladosivaLocal.gettotal_iva().equals(0.0))) {sridetalladosivaBean.settotal_iva(sridetalladosivaLocal.gettotal_iva());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.gettotal_sin_iva()!=null && !sridetalladosivaLocal.gettotal_sin_iva().equals(0.0))) {sridetalladosivaBean.settotal_sin_iva(sridetalladosivaLocal.gettotal_sin_iva());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getid_tipo_iva()!=null && !sridetalladosivaLocal.getid_tipo_iva().equals(-1L))) {sridetalladosivaBean.setid_tipo_iva(sridetalladosivaLocal.getid_tipo_iva());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getid_tipo_retencion_iva()!=null && !sridetalladosivaLocal.getid_tipo_retencion_iva().equals(-1L))) {sridetalladosivaBean.setid_tipo_retencion_iva(sridetalladosivaLocal.getid_tipo_retencion_iva());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.gettransfe_iva_retenido()!=null && !sridetalladosivaLocal.gettransfe_iva_retenido().equals(0.0))) {sridetalladosivaBean.settransfe_iva_retenido(sridetalladosivaLocal.gettransfe_iva_retenido());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getid_tipo_retencion_iva_presta()!=null && !sridetalladosivaLocal.getid_tipo_retencion_iva_presta().equals(-1L))) {sridetalladosivaBean.setid_tipo_retencion_iva_presta(sridetalladosivaLocal.getid_tipo_retencion_iva_presta());}
			if(conDefault || (!conDefault && sridetalladosivaLocal.getpresta_iva_retenido()!=null && !sridetalladosivaLocal.getpresta_iva_retenido().equals(0.0))) {sridetalladosivaBean.setpresta_iva_retenido(sridetalladosivaLocal.getpresta_iva_retenido());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSriDetalladosIvaGenerico(Long idSriDetalladosIvaSeleccionado,JComboBox jComboBoxSriDetalladosIva,List<SriDetalladosIva> sridetalladosivasLocal)throws Exception {
		try {
			SriDetalladosIva  sridetalladosivaTemp=null;

			for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasLocal) {
				if(sridetalladosivaAux.getId()!=null && sridetalladosivaAux.getId().equals(idSriDetalladosIvaSeleccionado)) {
					sridetalladosivaTemp=sridetalladosivaAux;
					break;
				}
			}

			jComboBoxSriDetalladosIva.setSelectedItem(sridetalladosivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSriDetalladosIvaGenerico(JComboBox jComboBoxSriDetalladosIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriDetalladosIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSriDetalladosIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriDetalladosIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSriDetalladosIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSriDetalladosIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSriDetalladosIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sridetalladosiva=(SriDetalladosIva) sridetalladosivaLogic.getSriDetalladosIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sridetalladosiva =(SriDetalladosIva) sridetalladosivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!sridetalladosiva.getIsNew() && !sridetalladosiva.getIsChanged() && !sridetalladosiva.getIsDeleted()) {
				sDescripcion=sridetalladosiva.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=sridetalladosiva.getperiododeclara_descripcion();
			}
		}

		if(sTipo.equals("TipoComprobante")) {
			//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
			if(!sridetalladosiva.getIsNew() && !sridetalladosiva.getIsChanged() && !sridetalladosiva.getIsDeleted()) {
				sDescripcion=sridetalladosiva.gettipocomprobante_descripcion();
			} else {
				//sDescripcion=this.getActualTipoComprobanteForeignKeyDescripcion((Long)value);
				sDescripcion=sridetalladosiva.gettipocomprobante_descripcion();
			}
		}

		if(sTipo.equals("TipoIva")) {
			//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
			if(!sridetalladosiva.getIsNew() && !sridetalladosiva.getIsChanged() && !sridetalladosiva.getIsDeleted()) {
				sDescripcion=sridetalladosiva.gettipoiva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIvaForeignKeyDescripcion((Long)value);
				sDescripcion=sridetalladosiva.gettipoiva_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencionIva")) {
			//sDescripcion=this.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value);
			if(!sridetalladosiva.getIsNew() && !sridetalladosiva.getIsChanged() && !sridetalladosiva.getIsDeleted()) {
				sDescripcion=sridetalladosiva.gettiporetencioniva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionIvaForeignKeyDescripcion((Long)value);
				sDescripcion=sridetalladosiva.gettiporetencioniva_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencionIvaPresta")) {
			//sDescripcion=this.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value);
			if(!sridetalladosiva.getIsNew() && !sridetalladosiva.getIsChanged() && !sridetalladosiva.getIsDeleted()) {
				sDescripcion=sridetalladosiva.gettiporetencionivapresta_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionIvaPrestaForeignKeyDescripcion((Long)value);
				sDescripcion=sridetalladosiva.gettiporetencionivapresta_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SriDetalladosIva sridetalladosivaRow=new SriDetalladosIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sridetalladosivaRow=(SriDetalladosIva) sridetalladosivaLogic.getSriDetalladosIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sridetalladosivaRow=(SriDetalladosIva) sridetalladosivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSriDetalladosIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));			
			this.jButtonDuplicarSriDetalladosIva.setVisible((this.isVisibilidadCeldaDuplicarSriDetalladosIva && this.isPermisoDuplicarSriDetalladosIva));			
			this.jButtonCopiarSriDetalladosIva.setVisible((this.isVisibilidadCeldaCopiarSriDetalladosIva && this.isPermisoCopiarSriDetalladosIva));
			this.jButtonVerFormSriDetalladosIva.setVisible((this.isVisibilidadCeldaVerFormSriDetalladosIva && this.isPermisoVerFormSriDetalladosIva));
			
			this.jButtonAbrirOrderBySriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));			
			
			this.jButtonNuevoRelacionesSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));			
			this.jButtonNuevoGuardarCambiosSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarSriDetalladosIva.setVisible((this.isVisibilidadCeldaModificarSriDetalladosIva && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.setVisible((this.isVisibilidadCeldaActualizarSriDetalladosIva && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.setVisible((this.isVisibilidadCeldaEliminarSriDetalladosIva && this.isPermisoEliminarSriDetalladosIva));
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.setVisible(this.isVisibilidadCeldaCancelarSriDetalladosIva);							
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));						
			this.jButtonDuplicarToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaDuplicarSriDetalladosIva && this.isPermisoDuplicarSriDetalladosIva));						
			this.jButtonCopiarToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaCopiarSriDetalladosIva && this.isPermisoCopiarSriDetalladosIva));			
			this.jButtonVerFormToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaVerFormSriDetalladosIva && this.isPermisoVerFormSriDetalladosIva));			
			this.jButtonAbrirOrderByToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));
			this.jButtonNuevoRelacionesToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));			
			this.jButtonNuevoGuardarCambiosToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));			
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaModificarSriDetalladosIva && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaActualizarSriDetalladosIva  && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaEliminarSriDetalladosIva && this.isPermisoEliminarSriDetalladosIva));
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarToolBarSriDetalladosIva.setVisible(this.isVisibilidadCeldaCancelarSriDetalladosIva);				
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));			
			this.jMenuItemDuplicarSriDetalladosIva.setVisible((this.isVisibilidadCeldaDuplicarSriDetalladosIva && this.isPermisoDuplicarSriDetalladosIva));			
			this.jMenuItemCopiarSriDetalladosIva.setVisible((this.isVisibilidadCeldaCopiarSriDetalladosIva && this.isPermisoCopiarSriDetalladosIva));			
			this.jMenuItemVerFormSriDetalladosIva.setVisible((this.isVisibilidadCeldaVerFormSriDetalladosIva && this.isPermisoVerFormSriDetalladosIva));			
			this.jMenuItemAbrirOrderBySriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));			
			//this.jMenuItemMostrarOcultarSriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));
			this.jMenuItemDetalleAbrirOrderBySriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));			
			//this.jMenuItemDetalleMostrarOcultarSriDetalladosIva.setVisible((this.isVisibilidadCeldaOrdenSriDetalladosIva && this.isPermisoOrdenSriDetalladosIva));			
			this.jMenuItemNuevoRelacionesSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva));			
			this.jMenuItemNuevoGuardarCambiosSriDetalladosIva.setVisible((this.isVisibilidadCeldaNuevoSriDetalladosIva && this.isPermisoNuevoSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));									
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemModificarSriDetalladosIva.setVisible((this.isVisibilidadCeldaModificarSriDetalladosIva && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemActualizarSriDetalladosIva.setVisible((this.isVisibilidadCeldaActualizarSriDetalladosIva && this.isPermisoActualizarSriDetalladosIva));	
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemEliminarSriDetalladosIva.setVisible((this.isVisibilidadCeldaEliminarSriDetalladosIva && this.isPermisoEliminarSriDetalladosIva));
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemCancelarSriDetalladosIva.setVisible(this.isVisibilidadCeldaCancelarSriDetalladosIva);				
			}
			
			this.jMenuItemGuardarCambiosSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));						
			this.jMenuItemGuardarCambiosTablaSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=this.jButtonNuevoSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaDuplicarSriDetalladosIva=this.jButtonDuplicarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaCopiarSriDetalladosIva=this.jButtonCopiarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaVerFormSriDetalladosIva=this.jButtonVerFormSriDetalladosIva.isVisible();
			
			this.isVisibilidadCeldaOrdenSriDetalladosIva=this.jButtonAbrirOrderBySriDetalladosIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=this.jButtonNuevoRelacionesSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaModificarSriDetalladosIva=this.jButtonModificarSriDetalladosIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.isVisibilidadCeldaActualizarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaEliminarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaCancelarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaGuardarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=this.jButtonGuardarCambiosTablaSriDetalladosIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSriDetalladosIva=this.jButtonNuevoToolBarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=this.jButtonNuevoRelacionesToolBarSriDetalladosIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.isVisibilidadCeldaModificarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarToolBarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaActualizarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarToolBarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaEliminarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarToolBarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaCancelarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarToolBarSriDetalladosIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriDetalladosIva=this.jButtonGuardarCambiosToolBarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSriDetalladosIva=this.jMenuItemNuevoSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=this.jMenuItemNuevoRelacionesSriDetalladosIva.isVisible();
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.isVisibilidadCeldaModificarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemModificarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaActualizarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemActualizarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaEliminarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemEliminarSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaCancelarSriDetalladosIva=this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemCancelarSriDetalladosIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriDetalladosIva=this.jMenuItemGuardarCambiosSriDetalladosIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=this.jMenuItemGuardarCambiosTablaSriDetalladosIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSriDetalladosIva(Boolean esInicializar) {
		if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
				//if(this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSriDetalladosIva();
			}
			
			this.inicializarActualizarBindingBotonesManualSriDetalladosIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSriDetalladosIva() {
		this.jButtonNuevoSriDetalladosIva.setVisible(this.isPermisoNuevoSriDetalladosIva);			
		this.jButtonDuplicarSriDetalladosIva.setVisible(this.isPermisoDuplicarSriDetalladosIva);			
		this.jButtonCopiarSriDetalladosIva.setVisible(this.isPermisoCopiarSriDetalladosIva);			
		this.jButtonVerFormSriDetalladosIva.setVisible(this.isPermisoVerFormSriDetalladosIva);			
		
		this.jButtonAbrirOrderBySriDetalladosIva.setVisible(this.isPermisoOrdenSriDetalladosIva);					
		
		this.jButtonNuevoRelacionesSriDetalladosIva.setVisible(this.isPermisoNuevoSriDetalladosIva);			
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarSriDetalladosIva.setVisible(this.isPermisoActualizarSriDetalladosIva);	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.setVisible(this.isPermisoActualizarSriDetalladosIva);	
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.setVisible(this.isPermisoEliminarSriDetalladosIva);
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.setVisible(this.isVisibilidadCeldaCancelarSriDetalladosIva);						
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.setVisible(this.isPermisoGuardarCambiosSriDetalladosIva);							
		}
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.setVisible(this.isPermisoActualizarSriDetalladosIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSriDetalladosIva() {
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarSriDetalladosIva.setVisible(this.isPermisoActualizarSriDetalladosIva);	
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.setVisible(this.isPermisoActualizarSriDetalladosIva);	
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.setVisible(this.isPermisoEliminarSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.setVisible(this.isVisibilidadCeldaCancelarSriDetalladosIva);							
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.setVisible((this.isVisibilidadCeldaGuardarSriDetalladosIva && this.isPermisoGuardarCambiosSriDetalladosIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSriDetalladosIva() {
		if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSriDetalladosIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSriDetalladosIva() {
	}
	
	public void jTableDatosSriDetalladosIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSriDetalladosIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sridetalladosiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraSriDetalladosIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebSriDetalladosIva(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriDetalladosIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.sridetalladosivaLogic.getConnexion());

				if(this.sridetalladosiva.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.sridetalladosiva.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriDetalladosIva=(TitledBorder)this.jScrollPanelDatosSriDetalladosIva.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderSriDetalladosIva.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.sridetalladosiva.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_comprobanteSriDetalladosIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocomprobante=true;

			idTienePermisotipocomprobante=this.tienePermisosUsuarioEnPaginaWebSriDetalladosIva(TipoComprobanteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocomprobante) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriDetalladosIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);

				this.tipocomprobanteBeanSwingJInternalFrame=new TipoComprobanteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocomprobanteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocomprobanteBeanSwingJInternalFrame.getTipoComprobanteLogic().setConnexion(this.sridetalladosivaLogic.getConnexion());

				if(this.sridetalladosiva.getid_tipo_comprobante()!=null) {
					this.tipocomprobanteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocomprobanteBeanSwingJInternalFrame.setIdActual(this.sridetalladosiva.getid_tipo_comprobante());
					this.tipocomprobanteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocomprobanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoComprobante();
				}

				JInternalFrameBase jinternalFrame =this.tipocomprobanteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriDetalladosIva=(TitledBorder)this.jScrollPanelDatosSriDetalladosIva.getBorder();
				TitledBorder titledBordertipocomprobante=(TitledBorder)this.tipocomprobanteBeanSwingJInternalFrame.jScrollPanelDatosTipoComprobante.getBorder();

				titledBordertipocomprobante.setTitle(titledBorderSriDetalladosIva.getTitle() + " -> Tipo Comprobante");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getid_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_comprobante = "+this.sridetalladosiva.getid_tipo_comprobante().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.sridetalladosiva.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getnombre_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_comprobante like '%"+this.sridetalladosiva.getnombre_tipo_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_datoSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getruc_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_dato like '%"+this.sridetalladosiva.getruc_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.sridetalladosiva.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.sridetalladosiva.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_registro_contableSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getfecha_registro_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_registro_contable = '"+Funciones2.getStringPostgresDate(this.sridetalladosiva.getfecha_registro_contable())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie like '%"+this.sridetalladosiva.getnumero_serie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.sridetalladosiva.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_sin_ivaSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.gettotal_sin_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_sin_iva = "+this.sridetalladosiva.gettotal_sin_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_ivaSriDetalladosIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoiva=true;

			idTienePermisotipoiva=this.tienePermisosUsuarioEnPaginaWebSriDetalladosIva(TipoIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriDetalladosIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);

				this.tipoivaBeanSwingJInternalFrame=new TipoIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoivaBeanSwingJInternalFrame.getTipoIvaLogic().setConnexion(this.sridetalladosivaLogic.getConnexion());

				if(this.sridetalladosiva.getid_tipo_iva()!=null) {
					this.tipoivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoivaBeanSwingJInternalFrame.setIdActual(this.sridetalladosiva.getid_tipo_iva());
					this.tipoivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIva();
				}

				JInternalFrameBase jinternalFrame =this.tipoivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriDetalladosIva=(TitledBorder)this.jScrollPanelDatosSriDetalladosIva.getBorder();
				TitledBorder titledBordertipoiva=(TitledBorder)this.tipoivaBeanSwingJInternalFrame.jScrollPanelDatosTipoIva.getBorder();

				titledBordertipoiva.setTitle(titledBorderSriDetalladosIva.getTitle() + " -> Tipo Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_ivaSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getid_tipo_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_iva = "+this.sridetalladosiva.getid_tipo_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencioniva=true;

			idTienePermisotiporetencioniva=this.tienePermisosUsuarioEnPaginaWebSriDetalladosIva(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencioniva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriDetalladosIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);

				this.tiporetencionivaBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionivaBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.sridetalladosivaLogic.getConnexion());

				if(this.sridetalladosiva.getid_tipo_retencion_iva()!=null) {
					this.tiporetencionivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionivaBeanSwingJInternalFrame.setIdActual(this.sridetalladosiva.getid_tipo_retencion_iva());
					this.tiporetencionivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriDetalladosIva=(TitledBorder)this.jScrollPanelDatosSriDetalladosIva.getBorder();
				TitledBorder titledBordertiporetencioniva=(TitledBorder)this.tiporetencionivaBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencioniva.setTitle(titledBorderSriDetalladosIva.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencion_ivaSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getid_tipo_retencion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion_iva = "+this.sridetalladosiva.getid_tipo_retencion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontransfe_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.gettransfe_iva_retenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where transfe_iva_retenido = "+this.sridetalladosiva.gettransfe_iva_retenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencionivapresta=true;

			idTienePermisotiporetencionivapresta=this.tienePermisosUsuarioEnPaginaWebSriDetalladosIva(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencionivapresta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriDetalladosIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriDetalladosIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);

				this.tiporetencionivaprestaBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionivaprestaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionivaprestaBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.sridetalladosivaLogic.getConnexion());

				if(this.sridetalladosiva.getid_tipo_retencion_iva_presta()!=null) {
					this.tiporetencionivaprestaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionivaprestaBeanSwingJInternalFrame.setIdActual(this.sridetalladosiva.getid_tipo_retencion_iva_presta());
					this.tiporetencionivaprestaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionivaprestaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionivaprestaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionivaprestaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriDetalladosIva=(TitledBorder)this.jScrollPanelDatosSriDetalladosIva.getBorder();
				TitledBorder titledBordertiporetencionivapresta=(TitledBorder)this.tiporetencionivaprestaBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencionivapresta.setTitle(titledBorderSriDetalladosIva.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getid_tipo_retencion_iva_presta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion_iva_presta = "+this.sridetalladosiva.getid_tipo_retencion_iva_presta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpresta_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.getsridetalladosiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sridetalladosiva==null) {
						this.sridetalladosiva = new SriDetalladosIva();
					}

					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);
				}

				if(this.sridetalladosiva.getpresta_iva_retenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where presta_iva_retenido = "+this.sridetalladosiva.getpresta_iva_retenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriDetalladosIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSriDetalladosIvaSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasBusquedaSriDetalladosIva();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoComprobanteSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasFK_IdTipoComprobante();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoIvaSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasFK_IdTipoIva();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionIvaSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasFK_IdTipoRetencionIva();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionIvaPrestaSriDetalladosIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriDetalladosIva(false,false);

			this.getSriDetalladosIvasFK_IdTipoRetencionIvaPresta();

			this.inicializarActualizarBindingSriDetalladosIva(false);

			//if(SriDetalladosIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriDetalladosIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sridetalladosivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSriDetalladosIva() {
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
			this.jInternalFrameDetalleFormSriDetalladosIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormSriDetalladosIva.dispose();
			this.jInternalFrameDetalleFormSriDetalladosIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
			this.jInternalFrameReporteDinamicoSriDetalladosIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSriDetalladosIva.dispose();
			this.jInternalFrameReporteDinamicoSriDetalladosIva=null;
		}
		
		if(this.jInternalFrameImportacionSriDetalladosIva!=null) {
			this.jInternalFrameImportacionSriDetalladosIva.setVisible(false);	    			
			this.jInternalFrameImportacionSriDetalladosIva.dispose();
			this.jInternalFrameImportacionSriDetalladosIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSriDetalladosIva();
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSriDetalladosIva")) {
				jButtonDuplicarSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSriDetalladosIva")) {
				jButtonCopiarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormSriDetalladosIva")) {
				jButtonVerFormSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSriDetalladosIva")) {
				jButtonDuplicarSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSriDetalladosIva")) {
				jButtonDuplicarSriDetalladosIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSriDetalladosIva")) {
				jButtonModificarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSriDetalladosIva")) {
				jButtonModificarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSriDetalladosIva")) {
				jButtonModificarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSriDetalladosIva")) {
				jButtonActualizarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSriDetalladosIva")) {
				jButtonActualizarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSriDetalladosIva")) {
				jButtonActualizarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarSriDetalladosIva")) {
				jButtonEliminarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSriDetalladosIva")) {
				jButtonEliminarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSriDetalladosIva")) {
				jButtonEliminarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarSriDetalladosIva")) {
				jButtonCancelarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSriDetalladosIva")) {
				jButtonCancelarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSriDetalladosIva")) {
				jButtonCancelarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarSriDetalladosIva")) {
				jButtonCerrarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSriDetalladosIva")) {
				jButtonCerrarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSriDetalladosIva")) {
				jButtonCerrarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSriDetalladosIva")) {
				jButtonMostrarOcultarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSriDetalladosIva")) {
				jButtonCancelarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSriDetalladosIva")) {
				jButtonCopiarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSriDetalladosIva")) {
				jButtonVerFormSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSriDetalladosIva")) {
				jButtonCopiarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSriDetalladosIva")) {
				jButtonVerFormSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSriDetalladosIva")) {
				jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSriDetalladosIva")) {
				jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSriDetalladosIva")) {
				jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSriDetalladosIva")) {
				jButtonAnterioresSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSriDetalladosIva")) {
				jButtonAnterioresSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSriDetalladosIva")) {
				jButtonAnterioresSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSriDetalladosIva")) {
				jButtonSiguientesSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSriDetalladosIva")) {
				jButtonSiguientesSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSriDetalladosIva")) {
				jButtonSiguientesSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySriDetalladosIva") || sTipo.equals("MenuItemDetalleAbrirOrderBySriDetalladosIva")) {
				jButtonAbrirOrderBySriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSriDetalladosIva") || sTipo.equals("MenuItemDetalleMostrarOcultarSriDetalladosIva")) {
				jButtonMostrarOcultarSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSriDetalladosIva")) {
				jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSriDetalladosIva")) {
				jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSriDetalladosIva")) {
				jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSriDetalladosIva")) {
				jButtonCerrarReporteDinamicoSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSriDetalladosIva")) {
				jButtonGenerarReporteDinamicoSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSriDetalladosIva")) {
				
				jButtonGenerarExcelReporteDinamicoSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSriDetalladosIva")) {
				jButtonCerrarImportacionSriDetalladosIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSriDetalladosIva")) {
				
				jButtonGenerarImportacionSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSriDetalladosIva")) {
				
				jButtonAbrirImportacionSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSriDetalladosIva")) {
				jComboBoxTiposAccionesSriDetalladosIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSriDetalladosIva")) {
				jComboBoxTiposRelacionesSriDetalladosIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSriDetalladosIva")) {
				jComboBoxTiposAccionesSriDetalladosIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSriDetalladosIva")) {
				
				jComboBoxTiposSeleccionarSriDetalladosIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSriDetalladosIva")) {
				jTextFieldValorCampoGeneralSriDetalladosIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySriDetalladosIva")) {
				jButtonAbrirOrderBySriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSriDetalladosIva")) {
				jButtonAbrirOrderBySriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySriDetalladosIva")) {
				jButtonCerrarOrderBySriDetalladosIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriDetalladosIvaBusqueda")) {
				this.jButtonidSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriDetalladosIvaUpdate")) {
				this.jButtonid_periodo_declaraSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriDetalladosIvaBusqueda")) {
				this.jButtonid_periodo_declaraSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriDetalladosIvaBusqueda")) {
				this.jButtonrucSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriDetalladosIvaBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_datoSriDetalladosIvaBusqueda")) {
				this.jButtonruc_datoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriDetalladosIvaBusqueda")) {
				this.jButtonnumero_documentoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriDetalladosIvaBusqueda")) {
				this.jButtonfecha_emisionSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriDetalladosIvaBusqueda")) {
				this.jButtonfecha_registro_contableSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriDetalladosIvaBusqueda")) {
				this.jButtonnumero_serieSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriDetalladosIvaBusqueda")) {
				this.jButtontotal_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaSriDetalladosIvaBusqueda")) {
				this.jButtontotal_sin_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_ivaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenidoSriDetalladosIvaBusqueda")) {
				this.jButtontransfe_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenidoSriDetalladosIvaBusqueda")) {
				this.jButtonpresta_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSriDetalladosIvaSriDetalladosIva")) {
				this.jButtonBusquedaSriDetalladosIvaSriDetalladosIvaActionPerformed(evt);
			}
			
			;
			
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSriDetalladosIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SriDetalladosIva sridetalladosivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				sridetalladosivaLocal=this.sridetalladosiva;
			} else {
				sridetalladosivaLocal=this.sridetalladosivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
							
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
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
			
			


			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
								
						
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
								
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
							
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
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
			
			


			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
								
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSriDetalladosIva")) {
					jCheckBoxSeleccionarTodosSriDetalladosIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSriDetalladosIva")) {
					jCheckBoxSeleccionadosSriDetalladosIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSriDetalladosIva")) {
					
				}
				
				


				
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
												
				
				


				
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
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
			
			


			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriDetalladosIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sridetalladosiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sridetalladosiva);
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
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
				
				


				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriDetalladosIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriDetalladosIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriDetalladosIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sridetalladosivaAnterior =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSriDetalladosIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSriDetalladosIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSriDetalladosIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sridetalladosiva =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sridetalladosiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSriDetalladosIva")) {
				
				}
				
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSriDetalladosIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSriDetalladosIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSriDetalladosIva")) {
			
			}
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSriDetalladosIva();
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			if(sTipo.equals("NuevoSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSriDetalladosIva")) {
				jButtonDuplicarSriDetalladosIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSriDetalladosIva")) {
				jButtonCopiarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSriDetalladosIva")) {
				jButtonVerFormSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSriDetalladosIva")) {
				jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSriDetalladosIva")) {
				jButtonModificarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSriDetalladosIva")) {
				jButtonActualizarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSriDetalladosIva")) {
				jButtonEliminarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSriDetalladosIva")) {
				jButtonCancelarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSriDetalladosIva")) {
				jButtonCerrarSriDetalladosIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSriDetalladosIva")) {
				jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSriDetalladosIva")) {
				jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySriDetalladosIva")) {
				jButtonAbrirOrderBySriDetalladosIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSriDetalladosIva")) {
				jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSriDetalladosIva")) {
				jButtonAnterioresSriDetalladosIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSriDetalladosIva")) {
				jButtonSiguientesSriDetalladosIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriDetalladosIvaBusqueda")) {
				this.jButtonidSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriDetalladosIvaUpdate")) {
				this.jButtonid_periodo_declaraSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriDetalladosIvaBusqueda")) {
				this.jButtonid_periodo_declaraSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_comprobanteSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_comprobanteSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_comprobanteSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriDetalladosIvaBusqueda")) {
				this.jButtonrucSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriDetalladosIvaBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_datoSriDetalladosIvaBusqueda")) {
				this.jButtonruc_datoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriDetalladosIvaBusqueda")) {
				this.jButtonnumero_documentoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriDetalladosIvaBusqueda")) {
				this.jButtonfecha_emisionSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriDetalladosIvaBusqueda")) {
				this.jButtonfecha_registro_contableSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriDetalladosIvaBusqueda")) {
				this.jButtonnumero_serieSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriDetalladosIvaBusqueda")) {
				this.jButtontotal_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_sin_ivaSriDetalladosIvaBusqueda")) {
				this.jButtontotal_sin_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_ivaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_ivaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_ivaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_ivaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("transfe_iva_retenidoSriDetalladosIvaBusqueda")) {
				this.jButtontransfe_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate")) {
				this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda")) {
				this.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("presta_iva_retenidoSriDetalladosIvaBusqueda")) {
				this.jButtonpresta_iva_retenidoSriDetalladosIvaBusquedaActionPerformed(evt);
			}
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSriDetalladosIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSriDetalladosIva")) {
				closingInternalFrameSriDetalladosIva();
				
			} else if(sTipo.equals("jButtonCancelarSriDetalladosIva")) {
				JInternalFrameBase jInternalFrameDetalleFormSriDetalladosIva = (JInternalFrameBase)evt.getSource();
	            	
	            SriDetalladosIvaBeanSwingJInternalFrame jInternalFrameParent=(SriDetalladosIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormSriDetalladosIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSriDetalladosIvaActionPerformed(null);
			}
			
			SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sridetalladosiva,new Object(),this.sridetalladosivaParameterGeneral,this.sridetalladosivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSriDetalladosIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSriDetalladosIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSriDetalladosIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sridetalladosiva)) {
			if(!esControlTabla) {
				if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);			
				}
				
				if(this.sridetalladosivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSriDetalladosIva(this.sridetalladosiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSriDetalladosIva(this.sridetalladosivaReturnGeneral,this.sridetalladosivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sridetalladosivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSriDetalladosIva(classes,this.sridetalladosivaReturnGeneral,this.sridetalladosivaBean,false);
					}
						
					if(this.sridetalladosivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva());	
					}
						
					if(this.sridetalladosivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosivaReturnGeneral.getSriDetalladosIva(),classes);//this.sridetalladosivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSriDetalladosIva(this.sridetalladosiva,classes);//this.sridetalladosivaBean);									
				}
			
				if(SriDetalladosIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSriDetalladosIva(this.sridetalladosiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriDetalladosIva(this.sridetalladosiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sridetalladosivaAnterior!=null) {
						this.sridetalladosiva=this.sridetalladosivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sridetalladosivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sridetalladosivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sridetalladosivaReturnGeneral.getSriDetalladosIva(),sridetalladosivaLogic.getSriDetalladosIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sridetalladosivaReturnGeneral.getSriDetalladosIva(),this.sridetalladosivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSriDetalladosIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosSriDetalladosIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSriDetalladosIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosSriDetalladosIva() throws Exception {
		
		SriDetalladosIvaModel sridetalladosivaModel=(SriDetalladosIvaModel)this.jTableDatosSriDetalladosIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sridetalladosivaModel.sridetalladosivas=this.sridetalladosivaLogic.getSriDetalladosIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sridetalladosivaModel.sridetalladosivas=this.sridetalladosivas;
		}
		
		
		((SriDetalladosIvaModel) this.jTableDatosSriDetalladosIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSriDetalladosIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsridetalladosivaAnterior(),this.sridetalladosivaLogic.getSriDetalladosIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsridetalladosivaAnterior(),this.sridetalladosivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSriDetalladosIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSriDetalladosIva(SriDetalladosIva sridetalladosiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
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
										
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sridetalladosiva,new Object(),generalEntityParameterGeneral,this.sridetalladosivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sridetalladosivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SriDetalladosIvaConstantesFunciones.getClassesRelationshipsOfSriDetalladosIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SriDetalladosIvaConstantesFunciones.getClassesRelationshipsFromStringsOfSriDetalladosIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSriDetalladosIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SriDetalladosIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sridetalladosiva,new Object(),generalEntityParameterGeneral,this.sridetalladosivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSriDetalladosIva(SriDetalladosIvaBean sridetalladosivaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSriDetalladosIva(ArrayList<Classe> classes,SriDetalladosIvaReturnGeneral sridetalladosivaReturnGeneral,SriDetalladosIvaBean sridetalladosivaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSriDetalladosIva(SriDetalladosIva sridetalladosiva,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sridetalladosiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSriDetalladosIva = new SriDetalladosIvaDetalleFormJInternalFrame(jDesktopPane,this.sridetalladosivaSessionBean.getConGuardarRelaciones(),this.sridetalladosivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.setVisible(false);
		this.jInternalFrameDetalleFormSriDetalladosIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormSriDetalladosIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSriDetalladosIva.sridetalladosivaLogic=this.sridetalladosivaLogic;
		
		this.cargarCombosFrameForeignKeySriDetalladosIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSriDetalladosIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriDetalladosIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySriDetalladosIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySriDetalladosIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSriDetalladosIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriDetalladosIva"));
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ModificarSriDetalladosIva"));

		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriDetalladosIva"));
					
		this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemModificarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriDetalladosIva"));		
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"ActualizarSriDetalladosIva"));
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriDetalladosIva"));
						
		this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemActualizarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriDetalladosIva"));		
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"EliminarSriDetalladosIva"));
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriDetalladosIva"));
								
		this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemEliminarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriDetalladosIva"));		
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CancelarSriDetalladosIva"));
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriDetalladosIva"));
					
		this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemCancelarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriDetalladosIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemDetalleCerrarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriDetalladosIva"));		
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriDetalladosIva"));
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriDetalladosIva"));
		
		
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriDetalladosIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonidSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonrucSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"rucSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonruc_datoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_documentoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_emisionSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_serieSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriDetalladosIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriDetalladosIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSriDetalladosIva"));
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriDetalladosIva"));
		}
		
		this.jTableDatosSriDetalladosIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSriDetalladosIva"));
		
		this.jTableDatosSriDetalladosIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSriDetalladosIva"));
		
		this.jButtonNuevoSriDetalladosIva.addActionListener(new ButtonActionListener(this,"NuevoSriDetalladosIva"));
		
		this.jButtonDuplicarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"DuplicarSriDetalladosIva"));
		
		this.jButtonCopiarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"CopiarSriDetalladosIva"));
		
		this.jButtonVerFormSriDetalladosIva.addActionListener(new ButtonActionListener(this,"VerFormSriDetalladosIva"));
		
		
		this.jButtonNuevoToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarSriDetalladosIva"));
			
		this.jButtonDuplicarToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSriDetalladosIva"));
			
		this.jMenuItemNuevoSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSriDetalladosIva"));
			
		this.jMenuItemDuplicarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSriDetalladosIva"));		
		
		
		this.jButtonNuevoRelacionesSriDetalladosIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSriDetalladosIva"));
		
		
		this.jButtonNuevoRelacionesToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSriDetalladosIva"));
			
		this.jMenuItemNuevoRelacionesSriDetalladosIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSriDetalladosIva"));		
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ModificarSriDetalladosIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonModificarToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriDetalladosIva"));
			
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemModificarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriDetalladosIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"ActualizarSriDetalladosIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonActualizarToolBarSriDetalladosIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriDetalladosIva"));
				
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemActualizarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriDetalladosIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"EliminarSriDetalladosIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonEliminarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriDetalladosIva"));
						
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemEliminarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriDetalladosIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CancelarSriDetalladosIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonCancelarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriDetalladosIva"));
			
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemCancelarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriDetalladosIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSriDetalladosIva"));		
		
		
		this.jButtonCerrarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CerrarSriDetalladosIva"));
		
		
		this.jButtonCerrarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarSriDetalladosIva"));
			
		this.jMenuItemCerrarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSriDetalladosIva"));
			
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jMenuItemDetalleCerrarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriDetalladosIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosSriDetalladosIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriDetalladosIva"));
		}
		
		this.jButtonCopiarToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarSriDetalladosIva"));
			
		this.jButtonVerFormToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarSriDetalladosIva"));
		
		this.jMenuItemGuardarCambiosSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSriDetalladosIva"));
			
		this.jMenuItemCopiarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSriDetalladosIva"));		
		
		this.jMenuItemVerFormSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSriDetalladosIva"));		
		
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriDetalladosIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSriDetalladosIva"));
			
		this.jMenuItemGuardarCambiosTablaSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriDetalladosIva"));		
		
		
		
		this.jButtonRecargarInformacionSriDetalladosIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionSriDetalladosIva"));
					
		this.jButtonRecargarInformacionToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSriDetalladosIva"));
		
		this.jMenuItemRecargarInformacionSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSriDetalladosIva"));		
		
		
		
		this.jButtonAnterioresSriDetalladosIva.addActionListener (new ButtonActionListener(this,"AnterioresSriDetalladosIva"));
		
		
		this.jButtonAnterioresToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSriDetalladosIva"));
		
		this.jMenuItemAnterioresSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSriDetalladosIva"));		
		
		
		this.jButtonSiguientesSriDetalladosIva.addActionListener (new ButtonActionListener(this,"SiguientesSriDetalladosIva"));
		
		
		this.jButtonSiguientesToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSriDetalladosIva"));
			
		this.jMenuItemSiguientesSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSriDetalladosIva"));
			
		this.jMenuItemAbrirOrderBySriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySriDetalladosIva"));
			
		this.jMenuItemMostrarOcultarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSriDetalladosIva"));
			
		this.jMenuItemDetalleAbrirOrderBySriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySriDetalladosIva"));
			
		this.jMenuItemDetalleMostarOcultarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSriDetalladosIva"));		
		
		
		this.jButtonNuevoGuardarCambiosSriDetalladosIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSriDetalladosIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSriDetalladosIva"));
			
		this.jMenuItemNuevoGuardarCambiosSriDetalladosIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSriDetalladosIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSriDetalladosIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSriDetalladosIva"));

		this.jCheckBoxSeleccionadosSriDetalladosIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSriDetalladosIva"));
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriDetalladosIva"));
		}
		
		
		this.jComboBoxTiposRelacionesSriDetalladosIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesSriDetalladosIva"));
			
		this.jComboBoxTiposAccionesSriDetalladosIva.addActionListener (new ButtonActionListener(this,"TiposAccionesSriDetalladosIva"));
					
		this.jComboBoxTiposSeleccionarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSriDetalladosIva"));
			
		this.jTextFieldValorCampoGeneralSriDetalladosIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSriDetalladosIva"));		
		
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonidSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonrucSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"rucSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonruc_datoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_documentoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_emisionSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_serieSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriDetalladosIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva.addActionListener(new ButtonActionListener(this,"BusquedaSriDetalladosIvaSriDetalladosIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSriDetalladosIva!=null) {
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriDetalladosIva"));
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriDetalladosIva"));
				this.jInternalFrameReporteDinamicoSriDetalladosIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriDetalladosIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoSriDetalladosIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriDetalladosIva"));				
			//this.jButtonGenerarReporteDinamicoSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriDetalladosIva"));
			//this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriDetalladosIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSriDetalladosIva!=null) {
				this.jInternalFrameImportacionSriDetalladosIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriDetalladosIva"));
				this.jInternalFrameImportacionSriDetalladosIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriDetalladosIva"));
				this.jInternalFrameImportacionSriDetalladosIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriDetalladosIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySriDetalladosIva.addActionListener (new ButtonActionListener(this,"AbrirOrderBySriDetalladosIva"));
			
			this.jButtonAbrirOrderByToolBarSriDetalladosIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSriDetalladosIva"));			
			
			if(this.jInternalFrameOrderBySriDetalladosIva!=null) {
				this.jInternalFrameOrderBySriDetalladosIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriDetalladosIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriDetalladosIva.jTabbedPaneRelacionesSriDetalladosIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriDetalladosIva"));
		
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
            		closingInternalFrameSriDetalladosIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSriDetalladosIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSriDetalladosIva = (JInternalFrameBase)event.getSource();
	            	
	            SriDetalladosIvaBeanSwingJInternalFrame jInternalFrameParent=(SriDetalladosIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormSriDetalladosIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSriDetalladosIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSriDetalladosIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSriDetalladosIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSriDetalladosIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSriDetalladosIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSriDetalladosIva";
		inputMap = this.jButtonNuevoSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSriDetalladosIva";
		inputMap = this.jButtonNuevoRelacionesSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriDetalladosIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSriDetalladosIva";
		inputMap = this.jButtonModificarSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSriDetalladosIva";
		inputMap = this.jButtonActualizarSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSriDetalladosIva";
		inputMap = this.jButtonEliminarSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSriDetalladosIva";
		inputMap = this.jButtonCancelarSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSriDetalladosIva";
		inputMap = this.jButtonCerrarSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSriDetalladosIva";
		inputMap = this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonGuardarCambiosSriDetalladosIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSriDetalladosIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSriDetalladosIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSriDetalladosIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSriDetalladosIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSriDetalladosIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSriDetalladosIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSriDetalladosIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSriDetalladosIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSriDetalladosIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonidSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"idSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_periodo_declaraSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonrucSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"rucSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnombre_tipo_comprobanteSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonruc_datoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"ruc_datoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_documentoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_emisionSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonfecha_registro_contableSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonnumero_serieSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontotal_sin_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"total_sin_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_ivaSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_ivaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_ivaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtontransfe_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"transfe_iva_retenidoSriDetalladosIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonid_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_iva_prestaSriDetalladosIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriDetalladosIva.jButtonpresta_iva_retenidoSriDetalladosIvaBusqueda.addActionListener(new ButtonActionListener(this,"presta_iva_retenidoSriDetalladosIvaBusqueda"));
		
		
		this.jButtonBusquedaSriDetalladosIvaSriDetalladosIva.addActionListener(new ButtonActionListener(this,"BusquedaSriDetalladosIvaSriDetalladosIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSriDetalladosIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSriDetalladosIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSriDetalladosIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSriDetalladosIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSriDetalladosIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
					sridetalladosivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriDetalladosIva sridetalladosivaAux:sridetalladosivas) {
					sridetalladosivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSriDetalladosIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
						sridetalladosivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriDetalladosIva sridetalladosivaAux:sridetalladosivas) {
						sridetalladosivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriDetalladosIva sridetalladosivaAux:sridetalladosivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriDetalladosIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriDetalladosIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSriDetalladosIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSriDetalladosIva.getSelectedRows();
			
			SriDetalladosIva sridetalladosivaLocal=new SriDetalladosIva();
			
			//this.seleccionarTodosSriDetalladosIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sridetalladosivaLocal =(SriDetalladosIva) this.sridetalladosivaLogic.getSriDetalladosIvas().toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sridetalladosivaLocal =(SriDetalladosIva) this.sridetalladosivas.toArray()[this.jTableDatosSriDetalladosIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sridetalladosivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
						sridetalladosivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriDetalladosIva sridetalladosivaAux:sridetalladosivas) {
						sridetalladosivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriDetalladosIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriDetalladosIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriDetalladosIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSriDetalladosIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSriDetalladosIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSriDetalladosIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSriDetalladosIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivaLogic.getSriDetalladosIvas()) {
				
						if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sridetalladosivaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sridetalladosivaAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO)) {
							existe=true;
							sridetalladosivaAux.setruc_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sridetalladosivaAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sridetalladosivaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sridetalladosivaAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sridetalladosivaAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sridetalladosivaAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							sridetalladosivaAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO)) {
							existe=true;
							sridetalladosivaAux.settransfe_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO)) {
							existe=true;
							sridetalladosivaAux.setpresta_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriDetalladosIva sridetalladosivaAux:sridetalladosivas) {
					
						if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sridetalladosivaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sridetalladosivaAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO)) {
							existe=true;
							sridetalladosivaAux.setruc_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sridetalladosivaAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sridetalladosivaAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sridetalladosivaAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sridetalladosivaAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sridetalladosivaAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA)) {
							existe=true;
							sridetalladosivaAux.settotal_sin_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO)) {
							existe=true;
							sridetalladosivaAux.settransfe_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO)) {
							existe=true;
							sridetalladosivaAux.setpresta_iva_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSriDetalladosIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSriDetalladosIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSriDetalladosIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSriDetalladosIva) {				
					conSplash=true;//false;										
					
					//this.startProcessSriDetalladosIva(conSplash);
				
					this.generarReporteSriDetalladosIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSriDetalladosIvasSeleccionados();
				//this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriDetalladosIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriDetalladosIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriDetalladosIva();
				
				this.exportarSriDetalladosIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSriDetalladosIvas();
				//this.importarSriDetalladosIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriDetalladosIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSriDetalladosIvasSeleccionados();
				//this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sri Detallados Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSriDetalladosIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSriDetalladosIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySriDetalladosIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
				}	
			} 			
			else if(SriDetalladosIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSriDetalladosIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSriDetalladosIva(conSplash);
					
						//this.actualizarParametrosGeneralSriDetalladosIva();
						
						this.generarReporteProcesoAccionSriDetalladosIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SriDetalladosIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sri Detallados IvaS SELECCIONADOS?", "MANTENIMIENTO DE Sri Detallados Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSriDetalladosIva();
				
						this.actualizarParametrosGeneralSriDetalladosIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sridetalladosivaReturnGeneral=sridetalladosivaLogic.procesarAccionSriDetalladosIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sridetalladosivaLogic.getSriDetalladosIvas(),this.sridetalladosivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSriDetalladosIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSriDetalladosIva();
					
					SriDetalladosIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSriDetalladosIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriDetalladosIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxTiposAccionesFormularioSriDetalladosIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSriDetalladosIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSriDetalladosIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSriDetalladosIva();
			
			if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
			SriDetalladosIva sridetalladosiva=new SriDetalladosIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSriDetalladosIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSriDetalladosIva.getSelectedItem();
			
			
			
			
			sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(sridetalladosivasSeleccionados.size()==1) {
				for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
					sridetalladosiva=sridetalladosivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSriDetalladosIva();
			
      		//this.finishProcessSriDetalladosIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSriDetalladosIvaReturnGeneral() throws Exception {
		if(this.sridetalladosivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sridetalladosivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sridetalladosivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sridetalladosivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sridetalladosivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sridetalladosivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSriDetalladosIva(false);
		}
		
		if(this.sridetalladosivaReturnGeneral.getConRetornoLista() || this.sridetalladosivaReturnGeneral.getConRetornoObjeto()) {
			if(this.sridetalladosivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sridetalladosivaLogic.setSriDetalladosIvas(this.sridetalladosivaReturnGeneral.getSriDetalladosIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSriDetalladosIva(false);
		}
	}
	
	public void actualizarParametrosGeneralSriDetalladosIva() throws Exception {
		
		
	}
	
	public ArrayList<SriDetalladosIva> getSriDetalladosIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSriDetalladosIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SriDetalladosIva sridetalladosivaAux:sridetalladosivaLogic.getSriDetalladosIvas()) {
					if(sridetalladosivaAux.getIsSelected()) {
						sridetalladosivasSeleccionados.add(sridetalladosivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriDetalladosIva sridetalladosivaAux:this.sridetalladosivas) {
					if(sridetalladosivaAux.getIsSelected()) {
						sridetalladosivasSeleccionados.add(sridetalladosivaAux);				
					}
				}
			}
			
			if(sridetalladosivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sridetalladosivasSeleccionados.addAll(this.sridetalladosivaLogic.getSriDetalladosIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sridetalladosivasSeleccionados.addAll(this.sridetalladosivas);				
					}
				}
			}
		} else {
			sridetalladosivasSeleccionados.add(this.sridetalladosiva);
		}
		
		return sridetalladosivasSeleccionados;
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
	
	public void generarReporteSriDetalladosIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSriDetalladosIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSriDetalladosIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriDetalladosIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriDetalladosIvasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sri Detallados Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados);
		
	}	
	
	public void generarReporteNormalSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSriDetalladosIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSriDetalladosIva();
		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSriDetalladosIva();
		
		
		//this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados ,sridetalladosivaImplementable,sridetalladosivaImplementableHome);
	}
	
	public void mostrarImportacionSriDetalladosIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSriDetalladosIva();
		
		this.abrirFrameImportacionSriDetalladosIva();		
		
			
		//this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados ,sridetalladosivaImplementable,sridetalladosivaImplementableHome);
	}
	
	public void importarSriDetalladosIvas() throws Exception {		
	
	}
	
	public void exportarSriDetalladosIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSriDetalladosIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSriDetalladosIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSriDetalladosIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sri Detallados Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSriDetalladosIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSriDetalladosIva(sridetalladosivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sridetalladosivaAux.setsDetalleGeneralEntityReporte(sridetalladosivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSriDetalladosIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSriDetalladosIva(SriDetalladosIva sridetalladosiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sridetalladosiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettipocomprobante_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getnombre_tipo_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getruc_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getfecha_registro_contable().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getnumero_serie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettotal_sin_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettipoiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettiporetencioniva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettransfe_iva_retenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.gettiporetencionivapresta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sridetalladosiva.getpresta_iva_retenido().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SriDetalladosIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSriDetalladosIva(row);				
				iRow++;
			}				
			
			for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSriDetalladosIva(sridetalladosivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSriDetalladosIvasSeleccionados() throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();		
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sridetalladosiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sridetalladosivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sridetalladosiva");
			//elementRoot.appendChild(element);
		
			for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
				element = document.createElement("sridetalladosiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSriDetalladosIva(sridetalladosivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Detallados Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSriDetalladosIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TOTALSINIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriDetalladosIvaConstantesFunciones.LABEL_PRESTAIVARETENIDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSriDetalladosIva(SriDetalladosIva sridetalladosiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettipocomprobante_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getnombre_tipo_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getruc_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getfecha_registro_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettotal_sin_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettipoiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettiporetencioniva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettransfe_iva_retenido());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.gettiporetencionivapresta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sridetalladosiva.getpresta_iva_retenido());				
	}
	
	public void setFilaDatosExportarXmlSriDetalladosIva(SriDetalladosIva sridetalladosiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SriDetalladosIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sridetalladosiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SriDetalladosIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sridetalladosiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementperiododeclara_descripcion = document.createElement(SriDetalladosIvaConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(sridetalladosiva.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementtipocomprobante_descripcion = document.createElement(SriDetalladosIvaConstantesFunciones.IDTIPOCOMPROBANTE);
		elementtipocomprobante_descripcion.appendChild(document.createTextNode(sridetalladosiva.gettipocomprobante_descripcion()));
		element.appendChild(elementtipocomprobante_descripcion);

		Element elementruc = document.createElement(SriDetalladosIvaConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(sridetalladosiva.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_tipo_comprobante = document.createElement(SriDetalladosIvaConstantesFunciones.NOMBRETIPOCOMPROBANTE);
		elementnombre_tipo_comprobante.appendChild(document.createTextNode(sridetalladosiva.getnombre_tipo_comprobante().trim()));
		element.appendChild(elementnombre_tipo_comprobante);

		Element elementruc_dato = document.createElement(SriDetalladosIvaConstantesFunciones.RUCDATO);
		elementruc_dato.appendChild(document.createTextNode(sridetalladosiva.getruc_dato().trim()));
		element.appendChild(elementruc_dato);

		Element elementnumero_documento = document.createElement(SriDetalladosIvaConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(sridetalladosiva.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementfecha_emision = document.createElement(SriDetalladosIvaConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(sridetalladosiva.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_registro_contable = document.createElement(SriDetalladosIvaConstantesFunciones.FECHAREGISTROCONTABLE);
		elementfecha_registro_contable.appendChild(document.createTextNode(sridetalladosiva.getfecha_registro_contable().toString().trim()));
		element.appendChild(elementfecha_registro_contable);

		Element elementnumero_serie = document.createElement(SriDetalladosIvaConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(sridetalladosiva.getnumero_serie().trim()));
		element.appendChild(elementnumero_serie);

		Element elementtotal_iva = document.createElement(SriDetalladosIvaConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(sridetalladosiva.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementtotal_sin_iva = document.createElement(SriDetalladosIvaConstantesFunciones.TOTALSINIVA);
		elementtotal_sin_iva.appendChild(document.createTextNode(sridetalladosiva.gettotal_sin_iva().toString().trim()));
		element.appendChild(elementtotal_sin_iva);

		Element elementtipoiva_descripcion = document.createElement(SriDetalladosIvaConstantesFunciones.IDTIPOIVA);
		elementtipoiva_descripcion.appendChild(document.createTextNode(sridetalladosiva.gettipoiva_descripcion()));
		element.appendChild(elementtipoiva_descripcion);

		Element elementtiporetencioniva_descripcion = document.createElement(SriDetalladosIvaConstantesFunciones.IDTIPORETENCIONIVA);
		elementtiporetencioniva_descripcion.appendChild(document.createTextNode(sridetalladosiva.gettiporetencioniva_descripcion()));
		element.appendChild(elementtiporetencioniva_descripcion);

		Element elementtransfe_iva_retenido = document.createElement(SriDetalladosIvaConstantesFunciones.TRANSFEIVARETENIDO);
		elementtransfe_iva_retenido.appendChild(document.createTextNode(sridetalladosiva.gettransfe_iva_retenido().toString().trim()));
		element.appendChild(elementtransfe_iva_retenido);

		Element elementtiporetencionivapresta_descripcion = document.createElement(SriDetalladosIvaConstantesFunciones.IDTIPORETENCIONIVAPRESTA);
		elementtiporetencionivapresta_descripcion.appendChild(document.createTextNode(sridetalladosiva.gettiporetencionivapresta_descripcion()));
		element.appendChild(elementtiporetencionivapresta_descripcion);

		Element elementpresta_iva_retenido = document.createElement(SriDetalladosIvaConstantesFunciones.PRESTAIVARETENIDO);
		elementpresta_iva_retenido.appendChild(document.createTextNode(sridetalladosiva.getpresta_iva_retenido().toString().trim()));
		element.appendChild(elementpresta_iva_retenido);
	}
	
	public void generarReporteGroupGenericoSriDetalladosIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados=new ArrayList<SriDetalladosIva>();
		
		sridetalladosivasSeleccionados=this.getSriDetalladosIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSriDetalladosIva(sridetalladosivasSeleccionados);
		
		this.generarReporteSriDetalladosIvas("Todos",sridetalladosivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSriDetalladosIva(ArrayList<SriDetalladosIva> sridetalladosivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SriDetalladosIva sridetalladosivaAux:sridetalladosivasSeleccionados) {
				sridetalladosivaAux.setsDetalleGeneralEntityReporte(sridetalladosivaAux.toString());
			
				if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOCOMPROBANTE)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.gettipocomprobante_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUC)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getnombre_tipo_comprobante());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_RUCDATO)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getruc_dato());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sridetalladosivaAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sridetalladosivaAux.getfecha_registro_contable()));
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.getnumero_serie());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPOIVA)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.gettipoiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVA)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.gettiporetencioniva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriDetalladosIvaConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA)) {
					existe=true;
					sridetalladosivaAux.setsDescripcionGeneralEntityReporte1(sridetalladosivaAux.gettiporetencionivapresta_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriDetalladosIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSriDetalladosIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSriDetalladosIva=true;
				this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=true;
				this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=true;
			}
			
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=true;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=true;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=true;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=true;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=true;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=true;
			this.isVisibilidadCeldaModificarSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=true;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
			this.isVisibilidadCeldaModificarSriDetalladosIva=true;
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
			this.isVisibilidadCeldaCancelarSriDetalladosIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				} else {
					this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SriDetalladosIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSriDetalladosIva=true;
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=true;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=true;
		} else {
			this.actualizarEstadoPanelsSriDetalladosIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSriDetalladosIva=false;
			//this.isVisibilidadCeldaVerFormSriDetalladosIva=false;
			this.isVisibilidadCeldaDuplicarSriDetalladosIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sridetalladosivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
		} else {
			this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
			this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			if(!sridetalladosivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;												
			}
			
			this.jButtonCerrarSriDetalladosIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
		}
		
		if(!this.permiteMantenimiento(this.sridetalladosiva)) {
			this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
			this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSriDetalladosIva=false;
		this.isVisibilidadCeldaNuevoRelacionesSriDetalladosIva=false;
		this.isVisibilidadCeldaGuardarCambiosSriDetalladosIva=false;
		//this.isVisibilidadCeldaModificarSriDetalladosIva=true;
		this.isVisibilidadCeldaActualizarSriDetalladosIva=false;
		this.isVisibilidadCeldaEliminarSriDetalladosIva=false;
		//this.isVisibilidadCeldaCancelarSriDetalladosIva=true;			
		this.isVisibilidadCeldaGuardarSriDetalladosIva=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSriDetalladosIva() {
	}
	
	public void actualizarEstadoPanelsSriDetalladosIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSriDetalladosIva!=null) {
				this.jScrollPanelDatosEdicionSriDetalladosIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriDetalladosIva!=null) {
				this.jScrollPanelDatosSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriDetalladosIva!=null) {
				this.jPanelPaginacionSriDetalladosIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
					this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sridetalladosivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriDetalladosIva!=null) {
				this.jTabbedPaneBusquedasSriDetalladosIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSriDetalladosIva!=null) {
				this.jPanelParametrosReportesSriDetalladosIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadBusquedaSriDetalladosIva=isParaPeriodoDeclara;
			if(!this.isVisibilidadBusquedaSriDetalladosIva) {this.jTabbedPaneBusquedasSriDetalladosIva.remove(jPanelBusquedaSriDetalladosIvaSriDetalladosIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoComprobante(Boolean isParaTipoComprobante){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoComprobanteNegation=!isParaTipoComprobante;

			this.isVisibilidadBusquedaSriDetalladosIva=isParaTipoComprobante;
			if(!this.isVisibilidadBusquedaSriDetalladosIva) {this.jTabbedPaneBusquedasSriDetalladosIva.remove(jPanelBusquedaSriDetalladosIvaSriDetalladosIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIva(Boolean isParaTipoIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIvaNegation=!isParaTipoIva;

			this.isVisibilidadBusquedaSriDetalladosIva=isParaTipoIvaNegation;
			if(!this.isVisibilidadBusquedaSriDetalladosIva) {this.jTabbedPaneBusquedasSriDetalladosIva.remove(jPanelBusquedaSriDetalladosIvaSriDetalladosIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencionIva(Boolean isParaTipoRetencionIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionIvaNegation=!isParaTipoRetencionIva;

			this.isVisibilidadBusquedaSriDetalladosIva=isParaTipoRetencionIvaNegation;
			if(!this.isVisibilidadBusquedaSriDetalladosIva) {this.jTabbedPaneBusquedasSriDetalladosIva.remove(jPanelBusquedaSriDetalladosIvaSriDetalladosIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencionIvaPresta(Boolean isParaTipoRetencionIvaPresta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionIvaPrestaNegation=!isParaTipoRetencionIvaPresta;

			this.isVisibilidadBusquedaSriDetalladosIva=isParaTipoRetencionIvaPrestaNegation;
			if(!this.isVisibilidadBusquedaSriDetalladosIva) {this.jTabbedPaneBusquedasSriDetalladosIva.remove(jPanelBusquedaSriDetalladosIvaSriDetalladosIva);}
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
			
			this.inicializarActualizarBindingTablaSriDetalladosIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSriDetalladosIva() {
		this.updateBorderResaltarBusquedasFormularioSriDetalladosIva();
		this.updateVisibilidadBusquedasFormularioSriDetalladosIva();
		this.updateHabilitarBusquedasFormularioSriDetalladosIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioSriDetalladosIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSriDetalladosIva.getComponents().length>0) {
	

		if(this.sridetalladosivaConstantesFunciones.resaltarBusquedaSriDetalladosIvaSriDetalladosIva!=null) {
			index= this.jTabbedPaneBusquedasSriDetalladosIva.indexOfComponent(this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriDetalladosIva.getComponent(index);
				jPanel.setBorder(this.sridetalladosivaConstantesFunciones.resaltarBusquedaSriDetalladosIvaSriDetalladosIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSriDetalladosIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSriDetalladosIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriDetalladosIva.indexOfComponent(this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSriDetalladosIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sridetalladosivaConstantesFunciones.mostrarBusquedaSriDetalladosIvaSriDetalladosIva);
			if(!this.sridetalladosivaConstantesFunciones.mostrarBusquedaSriDetalladosIvaSriDetalladosIva && index>-1) {
				this.jTabbedPaneBusquedasSriDetalladosIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSriDetalladosIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSriDetalladosIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriDetalladosIva.indexOfComponent(this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSriDetalladosIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sridetalladosivaConstantesFunciones.activarBusquedaSriDetalladosIvaSriDetalladosIva);
				this.jTabbedPaneBusquedasSriDetalladosIva.setEnabledAt(index,this.sridetalladosivaConstantesFunciones.activarBusquedaSriDetalladosIvaSriDetalladosIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSriDetalladosIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSriDetalladosIva")) {
			index= this.jTabbedPaneBusquedasSriDetalladosIva.indexOfComponent(this.jPanelBusquedaSriDetalladosIvaSriDetalladosIva);

			this.jTabbedPaneBusquedasSriDetalladosIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriDetalladosIva.getComponent(index);

			this.sridetalladosivaConstantesFunciones.setResaltarBusquedaSriDetalladosIvaSriDetalladosIva(resaltar);

			jPanel.setBorder(this.sridetalladosivaConstantesFunciones.resaltarBusquedaSriDetalladosIvaSriDetalladosIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSriDetalladosIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSriDetalladosIva() throws Exception {

		if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSriDetalladosIva();
		this.updateVisibilidadResaltarControlesFormularioSriDetalladosIva();
		this.updateHabilitarResaltarControlesFormularioSriDetalladosIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioSriDetalladosIva() throws Exception {
		if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sridetalladosivaConstantesFunciones.resaltaridSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltaridSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarid_periodo_declaraSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarid_periodo_declaraSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_comprobanteSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_comprobanteSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarrucSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldrucSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarrucSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarnombre_tipo_comprobanteSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarnombre_tipo_comprobanteSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarruc_datoSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarruc_datoSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarnumero_documentoSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarnumero_documentoSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarfecha_emisionSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarfecha_emisionSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarfecha_registro_contableSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarfecha_registro_contableSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarnumero_serieSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarnumero_serieSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltartotal_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltartotal_ivaSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltartotal_sin_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltartotal_sin_ivaSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_ivaSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_ivaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_ivaSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltartransfe_iva_retenidoSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltartransfe_iva_retenidoSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarid_tipo_retencion_iva_prestaSriDetalladosIva);}
		if(this.sridetalladosivaConstantesFunciones.resaltarpresta_iva_retenidoSriDetalladosIva!=null && this.jInternalFrameDetalleFormSriDetalladosIva!=null) {this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setBorder(this.sridetalladosivaConstantesFunciones.resaltarpresta_iva_retenidoSriDetalladosIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSriDetalladosIva() throws Exception {		
		if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
	
		//this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostraridSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelidSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostraridSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_periodo_declaraSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelid_periodo_declaraSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_periodo_declaraSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelid_tipo_comprobanteSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_comprobanteSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldrucSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarrucSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelrucSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarrucSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnombre_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelnombre_tipo_comprobanteSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnombre_tipo_comprobanteSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarruc_datoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelruc_datoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarruc_datoSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnumero_documentoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelnumero_documentoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnumero_documentoSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarfecha_emisionSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelfecha_emisionSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarfecha_emisionSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarfecha_registro_contableSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelfecha_registro_contableSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarfecha_registro_contableSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnumero_serieSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelnumero_serieSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarnumero_serieSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartotal_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPaneltotal_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartotal_ivaSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartotal_sin_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPaneltotal_sin_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartotal_sin_ivaSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelid_tipo_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_ivaSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelid_tipo_retencion_ivaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_ivaSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartransfe_iva_retenidoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPaneltransfe_iva_retenidoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrartransfe_iva_retenidoSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelid_tipo_retencion_iva_prestaSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarid_tipo_retencion_iva_prestaSriDetalladosIva);
		//this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarpresta_iva_retenidoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jPanelpresta_iva_retenidoSriDetalladosIva.setVisible(this.sridetalladosivaConstantesFunciones.mostrarpresta_iva_retenidoSriDetalladosIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSriDetalladosIva() throws Exception {
		if(this.jInternalFrameDetalleFormSriDetalladosIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriDetalladosIva!=null) {
	
		this.jInternalFrameDetalleFormSriDetalladosIva.jLabelidSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activaridSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_periodo_declaraSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarid_periodo_declaraSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_comprobanteSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarid_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldrucSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarrucSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextAreanombre_tipo_comprobanteSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarnombre_tipo_comprobanteSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldruc_datoSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarruc_datoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_documentoSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarnumero_documentoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_emisionSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarfecha_emisionSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jDateChooserfecha_registro_contableSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarfecha_registro_contableSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldnumero_serieSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarnumero_serieSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_ivaSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activartotal_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtotal_sin_ivaSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activartotal_sin_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_ivaSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarid_tipo_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_ivaSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_ivaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldtransfe_iva_retenidoSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activartransfe_iva_retenidoSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jComboBoxid_tipo_retencion_iva_prestaSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarid_tipo_retencion_iva_prestaSriDetalladosIva);
		this.jInternalFrameDetalleFormSriDetalladosIva.jTextFieldpresta_iva_retenidoSriDetalladosIva.setEnabled(this.sridetalladosivaConstantesFunciones.activarpresta_iva_retenidoSriDetalladosIva);
		}
	}
	
		
}