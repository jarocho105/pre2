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

//import com.bydan.erp.sris.util.SriRetencionesConstantesFunciones;
import com.bydan.erp.sris.util.report.SriRetencionesParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriRetencionesParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.SriRetencionesBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.sris.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SriRetencionesBeanSwingJInternalFrame extends SriRetencionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SriRetencionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SriRetenciones> sriretencionesValidator = new ClassValidator<SriRetenciones>(SriRetenciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SriRetenciones sriretenciones;	
	public SriRetenciones sriretencionesAux;
	public SriRetenciones sriretencionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SriRetenciones sriretencionesTotales;
	public Long idSriRetencionesActual;
	public Long iIdNuevoSriRetenciones=0L;
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
	
	public Boolean isPermisoTodoSriRetenciones;
	public Boolean isPermisoNuevoSriRetenciones;
	public Boolean isPermisoActualizarSriRetenciones;
	public Boolean isPermisoActualizarOriginalSriRetenciones;
	public Boolean isPermisoEliminarSriRetenciones;
	public Boolean isPermisoGuardarCambiosSriRetenciones;
	public Boolean isPermisoConsultaSriRetenciones;
	public Boolean isPermisoBusquedaSriRetenciones;
	public Boolean isPermisoReporteSriRetenciones;
	public Boolean isPermisoPaginacionMedioSriRetenciones;
	public Boolean isPermisoPaginacionAltoSriRetenciones;
	public Boolean isPermisoPaginacionTodoSriRetenciones;
	public Boolean isPermisoCopiarSriRetenciones;
	public Boolean isPermisoVerFormSriRetenciones;
	public Boolean isPermisoDuplicarSriRetenciones;
	public Boolean isPermisoOrdenSriRetenciones;
	
	
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
	
	public SriRetencionesParameterReturnGeneral sriretencionesReturnGeneral;
	public SriRetencionesParameterReturnGeneral sriretencionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSriRetenciones=false;
	public Boolean esParaAccionDesdeFormularioSriRetenciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SriRetencionesSessionBeanAdditional sriretencionesSessionBeanAdditional=null;
	
	public SriRetencionesSessionBeanAdditional getSriRetencionesSessionBeanAdditional() {
		return this.sriretencionesSessionBeanAdditional;
	}
	
	public void setSriRetencionesSessionBeanAdditional(SriRetencionesSessionBeanAdditional sriretencionesSessionBeanAdditional) {
		try {
			this.sriretencionesSessionBeanAdditional=sriretencionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SriRetencionesBeanSwingJInternalFrameAdditional sriretencionesBeanSwingJInternalFrameAdditional=null;
	//public class SriRetencionesBeanSwingJInternalFrame
	
	public SriRetencionesBeanSwingJInternalFrameAdditional getSriRetencionesBeanSwingJInternalFrameAdditional() {
		return this.sriretencionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setSriRetencionesBeanSwingJInternalFrameAdditional(SriRetencionesBeanSwingJInternalFrameAdditional sriretencionesBeanSwingJInternalFrameAdditional) {
		try {
			this.sriretencionesBeanSwingJInternalFrameAdditional=sriretencionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SriRetencionesLogic sriretencionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SriRetenciones sriretencionesBean;
	public SriRetencionesConstantesFunciones sriretencionesConstantesFunciones;
	//public SriRetencionesParameterReturnGeneral sriretencionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoDeclaraLogic periododeclaraLogic;
	
	//PARAMETROS
	
	
	//public List<SriRetenciones> sriretencioness;	
	//public List<SriRetenciones> sriretencionessEliminados;
	//public List<SriRetenciones> sriretencionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSriRetenciones=false;
	public Boolean isVisibilidadCeldaDuplicarSriRetenciones=true;
	public Boolean isVisibilidadCeldaCopiarSriRetenciones=true;
	public Boolean isVisibilidadCeldaVerFormSriRetenciones=true;
	public Boolean isVisibilidadCeldaOrdenSriRetenciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
	public Boolean isVisibilidadCeldaModificarSriRetenciones=false;
	public Boolean isVisibilidadCeldaActualizarSriRetenciones=false;
	public Boolean isVisibilidadCeldaEliminarSriRetenciones=false;
	public Boolean isVisibilidadCeldaCancelarSriRetenciones=false;
	public Boolean isVisibilidadCeldaGuardarSriRetenciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSriRetenciones=false;	
	
	
	public Boolean isVisibilidadBusquedaSriRetenciones=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	
	public Long getiIdNuevoSriRetenciones() {
		return this.iIdNuevoSriRetenciones;
	}

	public void setiIdNuevoSriRetenciones(Long iIdNuevoSriRetenciones) {
		this.iIdNuevoSriRetenciones = iIdNuevoSriRetenciones;
	}
	
	public Long getidSriRetencionesActual() {
		return this.idSriRetencionesActual;
	}

	public void setidSriRetencionesActual(Long idSriRetencionesActual) {
		this.idSriRetencionesActual = idSriRetencionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SriRetenciones getsriretenciones() {
		return this.sriretenciones;
	}

	public void setsriretenciones(SriRetenciones sriretenciones) {
		this.sriretenciones = sriretenciones;
	}
	
	public SriRetenciones getsriretencionesAux() {
		return this.sriretencionesAux;
	}

	public void setsriretencionesAux(SriRetenciones sriretencionesAux) {
		this.sriretencionesAux = sriretencionesAux;
	}				
	
	public SriRetenciones getsriretencionesAnterior() {
		return this.sriretencionesAnterior;
	}

	public void setsriretencionesAnterior(SriRetenciones sriretencionesAnterior) {
		this.sriretencionesAnterior = sriretencionesAnterior;
	}	
	
	public SriRetenciones getsriretencionesTotales() {
		return this.sriretencionesTotales;
	}

	public void setsriretencionesTotales(SriRetenciones sriretencionesTotales) {
		this.sriretencionesTotales = sriretencionesTotales;
	}	
	
	public SriRetenciones getsriretencionesBean() {
		return this.sriretencionesBean;
	}

	public void setsriretencionesBean(SriRetenciones sriretencionesBean) {
		this.sriretencionesBean = sriretencionesBean;
	}	
	
	public SriRetencionesParameterReturnGeneral getsriretencionesReturnGeneral() {
		return this.sriretencionesReturnGeneral;
	}

	public void setsriretencionesReturnGeneral(SriRetencionesParameterReturnGeneral sriretencionesReturnGeneral) {
		this.sriretencionesReturnGeneral = sriretencionesReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaSriRetenciones=-1L;

	public Long getid_ejercicioBusquedaSriRetenciones() {
		return this.id_ejercicioBusquedaSriRetenciones;
	}

	public void setid_ejercicioBusquedaSriRetenciones(Long id_ejercicioBusquedaSriRetenciones) {
		this.id_ejercicioBusquedaSriRetenciones = id_ejercicioBusquedaSriRetenciones;
	}

;
	public Long id_periodo_declaraBusquedaSriRetenciones=-1L;

	public Long getid_periodo_declaraBusquedaSriRetenciones() {
		return this.id_periodo_declaraBusquedaSriRetenciones;
	}

	public void setid_periodo_declaraBusquedaSriRetenciones(Long id_periodo_declaraBusquedaSriRetenciones) {
		this.id_periodo_declaraBusquedaSriRetenciones = id_periodo_declaraBusquedaSriRetenciones;
	}

;
	public String rucBusquedaSriRetenciones="";

	public String getrucBusquedaSriRetenciones() {
		return this.rucBusquedaSriRetenciones;
	}

	public void setrucBusquedaSriRetenciones(String rucBusquedaSriRetenciones) {
		this.rucBusquedaSriRetenciones = rucBusquedaSriRetenciones;
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

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SriRetencionesLogic getSriRetencionesLogic()	{		
		return sriretencionesLogic;
	}

	public void setSriRetencionesLogic(SriRetencionesLogic sriretencionesLogic) {
		this.sriretencionesLogic = sriretencionesLogic;
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
	
	public Boolean getIsEsNuevoSriRetenciones() {
		return isEsNuevoSriRetenciones;
	}

	public void setIsEsNuevoSriRetenciones(Boolean isEsNuevoSriRetenciones) {
		this.isEsNuevoSriRetenciones = isEsNuevoSriRetenciones;
	}

	public Boolean getEsParaAccionDesdeFormularioSriRetenciones() {
		return esParaAccionDesdeFormularioSriRetenciones;
	}
	
	public void setEsParaAccionDesdeFormularioSriRetenciones(Boolean esParaAccionDesdeFormularioSriRetenciones) {
		this.esParaAccionDesdeFormularioSriRetenciones = esParaAccionDesdeFormularioSriRetenciones;
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

			if(this.sriretencionesSessionBean==null) {
				this.sriretencionesSessionBean=new SriRetencionesSessionBean();
			}

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(sriretencionesSessionBean.getlidEmpresaActual());
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

			if(this.sriretencionesSessionBean==null) {
				this.sriretencionesSessionBean=new SriRetencionesSessionBean();
			}

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(sriretencionesSessionBean.getlidEjercicioActual());
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

			//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.sriretencionesSessionBean==null) {
				this.sriretencionesSessionBean=new SriRetencionesSessionBean();
			}

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

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
					periododeclaraLogic.getEntityWithConnection(sriretencionesSessionBean.getlidPeriodoDeclaraActual());
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

					if(this.sriretenciones!=null) {
						this.sriretenciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSriRetenciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSriRetencionesGenerico)throws Exception
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
				jComboBoxid_empresaSriRetencionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSriRetencionesGenerico!=null && jComboBoxid_empresaSriRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaSriRetencionesGenerico.setSelectedIndex(0);
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

					if(this.sriretenciones!=null) {
						this.sriretenciones.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioSriRetenciones.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriRetenciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones!=null) {
						jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones!=null) {
							//jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioSriRetencionesGenerico)throws Exception
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
				jComboBoxid_ejercicioSriRetencionesGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioSriRetencionesGenerico!=null && jComboBoxid_ejercicioSriRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioSriRetencionesGenerico.setSelectedIndex(0);
				}
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

					if(this.sriretenciones!=null) {
						this.sriretenciones.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraSriRetenciones.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
						if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriRetenciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones!=null) {
						jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones!=null) {
							//jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.getItemCount()>0) {
								jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setSelectedIndex(0);
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
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraSriRetencionesGenerico)throws Exception
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
				jComboBoxid_periodo_declaraSriRetencionesGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraSriRetencionesGenerico!=null && jComboBoxid_periodo_declaraSriRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraSriRetencionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SriRetenciones sriretenciones,JComboBox jComboBoxid_empresaSriRetencionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSriRetencionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSriRetencionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				sriretenciones.setid_empresa(empresaAux.getId());
				sriretenciones.setempresa_descripcion(SriRetencionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				sriretenciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(SriRetenciones sriretenciones,JComboBox jComboBoxid_ejercicioSriRetencionesGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioSriRetencionesGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioSriRetencionesGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				sriretenciones.setid_ejercicio(ejercicioAux.getId());
				sriretenciones.setejercicio_descripcion(SriRetencionesConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				sriretenciones.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(SriRetenciones sriretenciones,JComboBox jComboBoxid_periodo_declaraSriRetencionesGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraSriRetencionesGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraSriRetencionesGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				sriretenciones.setid_periodo_declara(periododeclaraAux.getId());
				sriretenciones.setperiododeclara_descripcion(SriRetencionesConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				sriretenciones.setPeriodoDeclara(periododeclaraAux);			}
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

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
					}

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
					}

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriRetenciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.addItem(ejercicio);
							}
						}

						if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriRetenciones!=null) { 
					}

					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriRetenciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.addItem(periododeclara);
							}
						}

						if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSriRetenciones() throws Exception {
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
		
	public SriRetencionesParameterReturnGeneral getSriRetencionesParameterGeneral() {
		return this.sriretencionesParameterGeneral;
	}
	
	public void setSriRetencionesParameterGeneral(SriRetencionesParameterReturnGeneral sriretencionesParameterGeneral) {
		this.sriretencionesParameterGeneral = sriretencionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSriRetenciones() {
		return isPermisoTodoSriRetenciones;
	}

	public void setIsPermisoTodoSriRetenciones(Boolean isPermisoTodoSriRetenciones) {
		this.isPermisoTodoSriRetenciones = isPermisoTodoSriRetenciones;
	}

	public Boolean getIsPermisoNuevoSriRetenciones() {
		return isPermisoNuevoSriRetenciones;
	}

	public void setIsPermisoNuevoSriRetenciones(Boolean isPermisoNuevoSriRetenciones) {
		this.isPermisoNuevoSriRetenciones = isPermisoNuevoSriRetenciones;
	}

	public Boolean getIsPermisoActualizarSriRetenciones() {
		return isPermisoActualizarSriRetenciones;
	}

	public void setIsPermisoActualizarSriRetenciones(Boolean isPermisoActualizarSriRetenciones) {
		this.isPermisoActualizarSriRetenciones = isPermisoActualizarSriRetenciones;
	}

	public Boolean getIsPermisoEliminarSriRetenciones() {
		return isPermisoEliminarSriRetenciones;
	}

	public void setIsPermisoEliminarSriRetenciones(Boolean isPermisoEliminarSriRetenciones) {
		this.isPermisoEliminarSriRetenciones = isPermisoEliminarSriRetenciones;
	}

	public Boolean getIsPermisoGuardarCambiosSriRetenciones() {
		return isPermisoGuardarCambiosSriRetenciones;
	}

	public void setIsPermisoGuardarCambiosSriRetenciones(Boolean isPermisoGuardarCambiosSriRetenciones) {
		this.isPermisoGuardarCambiosSriRetenciones = isPermisoGuardarCambiosSriRetenciones;
	}
	
	public Boolean getIsPermisoConsultaSriRetenciones() {
		return isPermisoConsultaSriRetenciones;
	}

	public void setIsPermisoConsultaSriRetenciones(Boolean isPermisoConsultaSriRetenciones) {
		this.isPermisoConsultaSriRetenciones = isPermisoConsultaSriRetenciones;
	}

	public Boolean getIsPermisoBusquedaSriRetenciones() {
		return isPermisoBusquedaSriRetenciones;
	}

	public void setIsPermisoBusquedaSriRetenciones(Boolean isPermisoBusquedaSriRetenciones) {
		this.isPermisoBusquedaSriRetenciones = isPermisoBusquedaSriRetenciones;
	}

	public Boolean getIsPermisoReporteSriRetenciones() {
		return isPermisoReporteSriRetenciones;
	}

	public void setIsPermisoReporteSriRetenciones(Boolean isPermisoReporteSriRetenciones) {
		this.isPermisoReporteSriRetenciones = isPermisoReporteSriRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioSriRetenciones() {
		return isPermisoPaginacionMedioSriRetenciones;
	}

	public void setIsPermisoPaginacionMedioSriRetenciones(Boolean isPermisoPaginacionMedioSriRetenciones) {
		this.isPermisoPaginacionMedioSriRetenciones = isPermisoPaginacionMedioSriRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoSriRetenciones() {
		return isPermisoPaginacionTodoSriRetenciones;
	}

	public void setIsPermisoPaginacionTodoSriRetenciones(Boolean isPermisoPaginacionTodoSriRetenciones) {
		this.isPermisoPaginacionTodoSriRetenciones = isPermisoPaginacionTodoSriRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoSriRetenciones() {
		return isPermisoPaginacionAltoSriRetenciones;
	}

	public void setIsPermisoPaginacionAltoSriRetenciones(Boolean isPermisoPaginacionAltoSriRetenciones) {
		this.isPermisoPaginacionAltoSriRetenciones = isPermisoPaginacionAltoSriRetenciones;
	}
	
	public Boolean getIsPermisoCopiarSriRetenciones() {
		return isPermisoCopiarSriRetenciones;
	}

	public void setIsPermisoCopiarSriRetenciones(Boolean isPermisoCopiarSriRetenciones) {
		this.isPermisoCopiarSriRetenciones = isPermisoCopiarSriRetenciones;
	}
	
	public Boolean getIsPermisoVerFormSriRetenciones() {
		return isPermisoVerFormSriRetenciones;
	}

	public void setIsPermisoVerFormSriRetenciones(Boolean isPermisoVerFormSriRetenciones) {
		this.isPermisoVerFormSriRetenciones = isPermisoVerFormSriRetenciones;
	}
	
	public Boolean getIsPermisoDuplicarSriRetenciones() {
		return isPermisoDuplicarSriRetenciones;
	}

	public void setIsPermisoDuplicarSriRetenciones(Boolean isPermisoDuplicarSriRetenciones) {
		this.isPermisoDuplicarSriRetenciones = isPermisoDuplicarSriRetenciones;
	}
	
	public Boolean getIsPermisoOrdenSriRetenciones() {
		return isPermisoOrdenSriRetenciones;
	}

	public void setIsPermisoOrdenSriRetenciones(Boolean isPermisoOrdenSriRetenciones) {
		this.isPermisoOrdenSriRetenciones = isPermisoOrdenSriRetenciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSriRetenciones() {
		return isVisibilidadCeldaNuevoSriRetenciones;
	}

	public void setIsVisibilidadCeldaNuevoSriRetenciones(Boolean isVisibilidadCeldaNuevoSriRetenciones) {
		this.isVisibilidadCeldaNuevoSriRetenciones = isVisibilidadCeldaNuevoSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSriRetenciones() {
		return isVisibilidadCeldaDuplicarSriRetenciones;
	}

	public void setIsVisibilidadCeldaDuplicarSriRetenciones(Boolean isVisibilidadCeldaDuplicarSriRetenciones) {
		this.isVisibilidadCeldaDuplicarSriRetenciones = isVisibilidadCeldaDuplicarSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSriRetenciones() {
		return isVisibilidadCeldaCopiarSriRetenciones;
	}

	public void setIsVisibilidadCeldaCopiarSriRetenciones(Boolean isVisibilidadCeldaCopiarSriRetenciones) {
		this.isVisibilidadCeldaCopiarSriRetenciones = isVisibilidadCeldaCopiarSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSriRetenciones() {
		return isVisibilidadCeldaVerFormSriRetenciones;
	}

	public void setIsVisibilidadCeldaVerFormSriRetenciones(Boolean isVisibilidadCeldaVerFormSriRetenciones) {
		this.isVisibilidadCeldaVerFormSriRetenciones = isVisibilidadCeldaVerFormSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSriRetenciones() {
		return isVisibilidadCeldaOrdenSriRetenciones;
	}

	public void setIsVisibilidadCeldaOrdenSriRetenciones(Boolean isVisibilidadCeldaOrdenSriRetenciones) {
		this.isVisibilidadCeldaOrdenSriRetenciones = isVisibilidadCeldaOrdenSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSriRetenciones() {
		return isVisibilidadCeldaNuevoRelacionesSriRetenciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSriRetenciones(Boolean isVisibilidadCeldaNuevoRelacionesSriRetenciones) {
		this.isVisibilidadCeldaNuevoRelacionesSriRetenciones = isVisibilidadCeldaNuevoRelacionesSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSriRetenciones() {
		return isVisibilidadCeldaModificarSriRetenciones;
	}

	public void setIsVisibilidadCeldaModificarSriRetenciones(Boolean isVisibilidadCeldaModificarSriRetenciones) {
		this.isVisibilidadCeldaModificarSriRetenciones = isVisibilidadCeldaModificarSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSriRetenciones() {
		return isVisibilidadCeldaActualizarSriRetenciones;
	}

	public void setIsVisibilidadCeldaActualizarSriRetenciones(Boolean isVisibilidadCeldaActualizarSriRetenciones) {
		this.isVisibilidadCeldaActualizarSriRetenciones = isVisibilidadCeldaActualizarSriRetenciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarSriRetenciones() {
		return isVisibilidadCeldaEliminarSriRetenciones;
	}

	public void setIsVisibilidadCeldaEliminarSriRetenciones(Boolean isVisibilidadCeldaEliminarSriRetenciones) {
		this.isVisibilidadCeldaEliminarSriRetenciones = isVisibilidadCeldaEliminarSriRetenciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarSriRetenciones() {
		return isVisibilidadCeldaCancelarSriRetenciones;
	}

	public void setIsVisibilidadCeldaCancelarSriRetenciones(Boolean isVisibilidadCeldaCancelarSriRetenciones) {
		this.isVisibilidadCeldaCancelarSriRetenciones = isVisibilidadCeldaCancelarSriRetenciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarSriRetenciones() {
		return isVisibilidadCeldaGuardarSriRetenciones;
	}

	public void setIsVisibilidadCeldaGuardarSriRetenciones(Boolean isVisibilidadCeldaGuardarSriRetenciones) {
		this.isVisibilidadCeldaGuardarSriRetenciones = isVisibilidadCeldaGuardarSriRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSriRetenciones() {
		return isVisibilidadCeldaGuardarCambiosSriRetenciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSriRetenciones(Boolean isVisibilidadCeldaGuardarCambiosSriRetenciones) {
		this.isVisibilidadCeldaGuardarCambiosSriRetenciones = isVisibilidadCeldaGuardarCambiosSriRetenciones;
	}
		
	public SriRetencionesSessionBean getsriretencionesSessionBean() {
		return this.sriretencionesSessionBean;
	}
	
	public void setsriretencionesSessionBean(SriRetencionesSessionBean sriretencionesSessionBean) {
		this.sriretencionesSessionBean=sriretencionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSriRetenciones() {
		return this.isVisibilidadBusquedaSriRetenciones;
	}

	public void setisVisibilidadBusquedaSriRetenciones(Boolean isVisibilidadBusquedaSriRetenciones) {
		this.isVisibilidadBusquedaSriRetenciones=isVisibilidadBusquedaSriRetenciones;
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

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(SriRetenciones sriretenciones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(sriretenciones,null);
				this.setActualParaGuardarEjercicioForeignKey(sriretenciones,null);
				this.setActualParaGuardarPeriodoDeclaraForeignKey(sriretenciones,null);
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
	
	public void bugActualizarReferenciaActual(SriRetenciones sriretenciones,SriRetenciones sriretencionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSriRetenciones(sriretenciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sriretencionesAux.setId(sriretenciones.getId());
		sriretencionesAux.setVersionRow(sriretenciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SriRetenciones sriretencionesLocal) throws Exception {
		
		if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SriRetenciones sriretencionesLocal) throws Exception {	
		if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				sriretencionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				sriretencionesLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				sriretencionesLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSriRetencionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sriretencionesValidator.getInvalidValues(this.sriretenciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SriRetenciones sriretenciones,List<SriRetenciones> sriretencioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(SriRetenciones sriretenciones,List<SriRetenciones> sriretencioness) throws Exception {
		try	{			
			SriRetencionesConstantesFunciones.actualizarSelectedLista(sriretenciones,sriretencioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SriRetenciones> sriretencionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sriretencionessLocal=this.sriretencionesLogic.getSriRetencioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sriretencionessLocal=this.sriretencioness;
			}
			//ARCHITECTURE
		
			for(SriRetenciones sriretencionesLocal:sriretencionessLocal) {
				if(this.permiteMantenimiento(sriretencionesLocal) && sriretencionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SriRetencionesConstantesFunciones.getSriRetencionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NOMBREMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_moduloSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NOMBRETIPOCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_tipo_comprobanteSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documentoSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_emisionSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.FECHAREGISTROCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_registro_contableSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_serieSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.TOTALIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabeltotal_ivaSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.MONTOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelmonto_ivaSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NUMERODOCUMENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documento_contableSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NOMBRECUENTACONTABLERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_cuenta_contable_retencionSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelporcentajeSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelvalorSriRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriRetencionesConstantesFunciones.NOMBREBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_benefSriRetenciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_moduloSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_tipo_comprobanteSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documentoSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_emisionSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_registro_contableSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_serieSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabeltotal_ivaSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelmonto_ivaSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documento_contableSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_cuenta_contable_retencionSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelporcentajeSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelvalorSriRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_benefSriRetenciones,"");
		
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
		this.iIdNuevoSriRetenciones--;	
		
		
		this.sriretencionesAux=new SriRetenciones();
		
		this.sriretencionesAux.setId(this.iIdNuevoSriRetenciones);
		this.sriretencionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sriretencionesLogic.getSriRetencioness().add(this.sriretencionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sriretencioness.add(this.sriretencionesAux);
		}
		//ARCHITECTURE
		
		this.sriretenciones=this.sriretencionesAux;
		
		if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSriRetenciones(this.sriretenciones);
			this.setVariablesObjetoActualToFormularioForeignKeySriRetenciones(this.sriretenciones);
		}
				
		//this.setDefaultControlesSriRetenciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySriRetenciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySriRetenciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySriRetenciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriRetenciones(this.sriretencionesBean,this.sriretenciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSriRetenciones(this.sriretencionesReturnGeneral,this.sriretencionesBean,false);
		
		if(this.sriretencionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones());
		}
		
		if(this.sriretencionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones(),classes);//this.sriretencionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySriRetenciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySriRetenciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SriRetencionesBeanSwingJInternalFrameAdditional.RecargarFormSriRetenciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSriRetenciones(false);
						
			if(sriretencionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriRetenciones();
			}
			
			this.actualizarVisualTableDatosSriRetenciones();
			
			this.jTableDatosSriRetenciones.setRowSelectionInterval(this.getIndiceNuevoSriRetenciones(), this.getIndiceNuevoSriRetenciones());
			
			this.seleccionarFilaTablaSriRetencionesActual();
						
			this.actualizarEstadoCeldasBotonesSriRetenciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSriRetenciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldrucSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarrucSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnombre_moduloSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnombre_tipo_comprobanteSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnumero_documentoSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarfecha_emisionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarfecha_registro_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnumero_serieSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activartotal_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarmonto_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnumero_documento_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarporcentajeSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarvalorSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarnombre_benefSriRetenciones);	
		//
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarid_empresaSriRetenciones);//
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarid_ejercicioSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setEnabled(isHabilitar && this.sriretencionesConstantesFunciones.activarid_periodo_declaraSriRetenciones);
	};
	
	public void setDefaultControlesSriRetenciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSriRetenciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sriretencionesSessionBean.setConGuardarRelaciones(true);			
			this.sriretencionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.setVisible(true);
			
					
		} else {
			//this.sriretencionesSessionBean.setConGuardarRelaciones(false);			
			this.sriretencionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSriRetenciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
				if(sriretencionesAux.getId().equals(this.iIdNuevoSriRetenciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriRetenciones sriretencionesAux:this.sriretencioness) {
				if(sriretencionesAux.getId().equals(this.iIdNuevoSriRetenciones)) {
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
	
	public int getIndiceActualSriRetenciones(SriRetenciones sriretenciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
				if(sriretencionesAux.getId().equals(sriretenciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriRetenciones sriretencionesAux:this.sriretencioness) {
				if(sriretencionesAux.getId().equals(sriretenciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSriRetenciones(SriRetenciones sriretencionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
				if(sriretencionesAux.getSriRetencionesOriginal().getId().equals(sriretencionesOriginal.getId())) {
					existe=true;
					sriretencionesOriginal.setId(sriretencionesAux.getId());
					sriretencionesOriginal.setVersionRow(sriretencionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriRetenciones sriretencionesAux:this.sriretencioness) {
				if(sriretencionesAux.getSriRetencionesOriginal().getId().equals(sriretencionesOriginal.getId())) {
					existe=true;
					sriretencionesOriginal.setId(sriretencionesAux.getId());
					sriretencionesOriginal.setVersionRow(sriretencionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSriRetenciones(Boolean esParaCancelar) throws Exception {
		sriretencionessAux=new ArrayList<SriRetenciones>();
		sriretencionesAux=new SriRetenciones();
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
					if(sriretencionesAux.getId()<0) {
						sriretencionessAux.add(sriretencionesAux);
					}		
				}
				this.iIdNuevoSriRetenciones=0L;
				this.sriretencionesLogic.getSriRetencioness().removeAll(sriretencionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriRetenciones sriretencionesAux:this.sriretencioness) {
					if(sriretencionesAux.getId()<0) {
						sriretencionessAux.add(sriretencionesAux);
					}		
				}
				this.iIdNuevoSriRetenciones=0L;
				this.sriretencioness.removeAll(sriretencionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSriRetenciones 
					&& this.sriretencionesLogic.getSriRetencioness().size()>0
					) {
					sriretencionesAux=this.sriretencionesLogic.getSriRetencioness().get(this.sriretencionesLogic.getSriRetencioness().size() - 1);
				
					if(sriretencionesAux.getId()<0) {
						this.sriretencionesLogic.getSriRetencioness().remove(sriretencionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSriRetenciones && this.sriretencioness.size()>0) {
					sriretencionesAux=this.sriretencioness.get(this.sriretencioness.size() - 1);
				
					if(sriretencionesAux.getId()<0) {
						this.sriretencioness.remove(sriretencionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSriRetenciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sriretenciones.getId()<0) {
				this.sriretencionesLogic.getSriRetencioness().remove(this.sriretenciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sriretenciones.getId()<0) {
				this.sriretencioness.remove(this.sriretenciones);
			}
		}			
	}
	
	public void setEstadosInicialesSriRetenciones(List<SriRetenciones> sriretencionessAux) throws Exception {
		SriRetencionesConstantesFunciones.setEstadosInicialesSriRetenciones(sriretencionessAux);
	}
	
	public void setEstadosInicialesSriRetenciones(SriRetenciones sriretencionesAux) throws Exception {
		SriRetencionesConstantesFunciones.setEstadosInicialesSriRetenciones(sriretencionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSriRetencionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSriRetencionesActual()) {
				if(!this.isEsNuevoSriRetenciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSriRetenciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSriRetencionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sri Retenciones ?", "MANTENIMIENTO DE Sri Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SriRetenciones sriretenciones) throws Exception {
		SriRetencionesConstantesFunciones.seleccionarAsignar(this.sriretenciones,sriretenciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSriRetenciones=this.isPermisoActualizarOriginalSriRetenciones;
			
			
			this.seleccionarAsignar(sriretenciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSriRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sriretencionesSessionBean.setsFuncionBusquedaRapida(this.sriretencionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSriRetenciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSriRetenciones(esParaCancelar);				
				this.cancelarNuevoSriRetenciones(esParaCancelar);								
			}
			
			this.sriretenciones=new SriRetenciones();
			
			this.inicializarSriRetenciones();
			
			this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSriRetenciones() throws Exception {
		try {
			SriRetencionesConstantesFunciones.inicializarSriRetenciones(this.sriretenciones);
			
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
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sriretencionesLogic.getSriRetencioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSriRetencioness(String sAccionBusqueda,List<SriRetenciones> sriretencionessParaReportes) throws Exception {
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
					sPathReporteFinal="SriRetenciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SriRetencionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SriRetencionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SriRetenciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sri Retencioneses");		
		parameters.put("busquedapor", SriRetencionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSriRetenciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SriRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SriRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSriRetenciones=new JRBeanArrayDataSource(SriRetencionesJInternalFrame.TraerSriRetencionesBeans(sriretencionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSriRetenciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SriRetencionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SriRetencionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SriRetencionesBean.TraerSriRetencionesBeans(sriretencionessParaReportes).toArray()));
							
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
				this.generarExcelReporteSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSriRetencionesActionPerformed(null);
					//this.generarExcelReporteSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSriRetencioness(sAccionBusqueda,sTipoArchivoReporte,sriretencionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSriRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<SriRetenciones> sriretencionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriRetencioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriRetenciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SriRetenciones sriretenciones : sriretencionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SriRetencionesConstantesFunciones.generarExcelReporteDataSriRetenciones("NORMAL",row,workbook,sriretenciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSriRetenciones(String sTipo,Row row,Workbook workbook) {
		
		SriRetencionesConstantesFunciones.generarExcelReporteHeaderSriRetenciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSriRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<SriRetenciones> sriretencionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriRetencioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SriRetenciones sriretenciones : sriretencionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SriRetencionesConstantesFunciones.getSriRetencionesDescripcion(sriretenciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnombre_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnombre_tipo_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getfecha_registro_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_TOTALIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_TOTALIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.gettotal_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_MONTOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_MONTOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getmonto_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnumero_documento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnombre_cuenta_contable_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sriretenciones.getnombre_benef());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSriRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<SriRetenciones> sriretencionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SriRetenciones> sriretencionessRespaldo=null;
		
		classes=SriRetencionesConstantesFunciones.getClassesRelationshipsOfSriRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sriretencionesLogic.setDatosCliente(this.datosCliente);
		this.sriretencionesLogic.setDatosDeep(this.datosDeep);
		this.sriretencionesLogic.setIsConDeep(true);
		
		sriretencionessRespaldo=this.sriretencionesLogic.getSriRetencioness();
		
		this.sriretencionesLogic.setSriRetencioness(sriretencionessParaReportes);	
		this.sriretencionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sriretencionessParaReportes=this.sriretencionesLogic.getSriRetencioness();
		this.sriretencionesLogic.setSriRetencioness(sriretencionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriRetencioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriRetenciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SriRetenciones sriretenciones : sriretencionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSriRetenciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SriRetencionesConstantesFunciones.generarExcelReporteDataSriRetenciones("NORMAL",row,workbook,sriretenciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SriRetencionesConstantesFunciones.getSriRetencionesDescripcion(sriretenciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriRetenciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSriRetenciones() throws Exception {		
		this.startProcessSriRetenciones(true);
	}
	
	public void startProcessSriRetenciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSriRetenciones ,this.jPanelParametrosReportesSriRetenciones, this.jScrollPanelDatosSriRetenciones,this.jPanelPaginacionSriRetenciones, this.jScrollPanelDatosEdicionSriRetenciones, this.jPanelAccionesSriRetenciones,this.jPanelAccionesFormularioSriRetenciones,this.jmenuBarSriRetenciones,this.jmenuBarDetalleSriRetenciones,this.jTtoolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones);		
		
		final JTabbedPane jTabbedPaneBusquedasSriRetenciones=this.jTabbedPaneBusquedasSriRetenciones; 
		
		final JPanel jPanelParametrosReportesSriRetenciones=this.jPanelParametrosReportesSriRetenciones;
		//final JScrollPane jScrollPanelDatosSriRetenciones=this.jScrollPanelDatosSriRetenciones;
		final JTable jTableDatosSriRetenciones=this.jTableDatosSriRetenciones;		
		final JPanel jPanelPaginacionSriRetenciones=this.jPanelPaginacionSriRetenciones;
		//final JScrollPane jScrollPanelDatosEdicionSriRetenciones=this.jScrollPanelDatosEdicionSriRetenciones;
		final JPanel jPanelAccionesSriRetenciones=this.jPanelAccionesSriRetenciones;
		
		JPanel jPanelCamposAuxiliarSriRetenciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSriRetenciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			jPanelCamposAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jPanelCamposSriRetenciones;
			jPanelAccionesFormularioAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jPanelAccionesFormularioSriRetenciones;
		}
		
		final JPanel jPanelCamposSriRetenciones=jPanelCamposAuxiliarSriRetenciones;
		final JPanel jPanelAccionesFormularioSriRetenciones=jPanelAccionesFormularioAuxiliarSriRetenciones;
		
		
		final JMenuBar jmenuBarSriRetenciones=this.jmenuBarSriRetenciones;
		final JToolBar jTtoolBarSriRetenciones=this.jTtoolBarSriRetenciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSriRetenciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriRetenciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			jmenuBarDetalleAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jmenuBarDetalleSriRetenciones;
			jTtoolBarDetalleAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jTtoolBarDetalleSriRetenciones;
		}
		
		final JMenuBar jmenuBarDetalleSriRetenciones=jmenuBarDetalleAuxiliarSriRetenciones;
		final JToolBar jTtoolBarDetalleSriRetenciones=jTtoolBarDetalleAuxiliarSriRetenciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriRetenciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriRetenciones;
			processRunnable.jTableDatos=jTableDatosSriRetenciones;
			processRunnable.jPanelCampos=jPanelCamposSriRetenciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriRetenciones;
			processRunnable.jPanelAcciones=jPanelAccionesSriRetenciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriRetenciones;
			
			
			processRunnable.jmenuBar=jmenuBarSriRetenciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriRetenciones;
			processRunnable.jTtoolBar=jTtoolBarSriRetenciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriRetenciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriRetenciones ,jPanelParametrosReportesSriRetenciones,jTableDatosSriRetenciones, /*jScrollPanelDatosSriRetenciones,*/jPanelCamposSriRetenciones,jPanelPaginacionSriRetenciones, /*jScrollPanelDatosEdicionSriRetenciones,*/ jPanelAccionesSriRetenciones,jPanelAccionesFormularioSriRetenciones,jmenuBarSriRetenciones,jmenuBarDetalleSriRetenciones,jTtoolBarSriRetenciones,jTtoolBarDetalleSriRetenciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriRetenciones ,jPanelParametrosReportesSriRetenciones, jScrollPanelDatosSriRetenciones,jPanelPaginacionSriRetenciones, jScrollPanelDatosEdicionSriRetenciones, jPanelAccionesSriRetenciones,jPanelAccionesFormularioSriRetenciones,jmenuBarSriRetenciones,jmenuBarDetalleSriRetenciones,jTtoolBarSriRetenciones,jTtoolBarDetalleSriRetenciones);
						
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
	
	public void finishProcessSriRetenciones() {// throws Exception 
		this.finishProcessSriRetenciones(true);
	}
	
	public void finishProcessSriRetenciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSriRetenciones ,this.jPanelParametrosReportesSriRetenciones, this.jScrollPanelDatosSriRetenciones,this.jPanelPaginacionSriRetenciones, this.jScrollPanelDatosEdicionSriRetenciones, this.jPanelAccionesSriRetenciones,this.jPanelAccionesFormularioSriRetenciones,this.jmenuBarSriRetenciones,this.jmenuBarDetalleSriRetenciones,this.jTtoolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones);		
		
		final JTabbedPane jTabbedPaneBusquedasSriRetenciones=this.jTabbedPaneBusquedasSriRetenciones; 
		
		final JPanel jPanelParametrosReportesSriRetenciones=this.jPanelParametrosReportesSriRetenciones;
		//final JScrollPane jScrollPanelDatosSriRetenciones=this.jScrollPanelDatosSriRetenciones;
		final JTable jTableDatosSriRetenciones=this.jTableDatosSriRetenciones;		
		final JPanel jPanelPaginacionSriRetenciones=this.jPanelPaginacionSriRetenciones;
		//final JScrollPane jScrollPanelDatosEdicionSriRetenciones=this.jScrollPanelDatosEdicionSriRetenciones;
		final JPanel jPanelAccionesSriRetenciones=this.jPanelAccionesSriRetenciones;
		
		JPanel jPanelCamposAuxiliarSriRetenciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSriRetenciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			jPanelCamposAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jPanelCamposSriRetenciones;
			jPanelAccionesFormularioAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jPanelAccionesFormularioSriRetenciones;
		}
		
		final JPanel jPanelCamposSriRetenciones=jPanelCamposAuxiliarSriRetenciones;
		final JPanel jPanelAccionesFormularioSriRetenciones=jPanelAccionesFormularioAuxiliarSriRetenciones;
		
		
		final JMenuBar jmenuBarSriRetenciones=this.jmenuBarSriRetenciones;		
		final JToolBar jTtoolBarSriRetenciones=this.jTtoolBarSriRetenciones;
				
		JMenuBar jmenuBarDetalleAuxiliarSriRetenciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriRetenciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			jmenuBarDetalleAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jmenuBarDetalleSriRetenciones;
			jTtoolBarDetalleAuxiliarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jTtoolBarDetalleSriRetenciones;		
		}
		
		final JMenuBar jmenuBarDetalleSriRetenciones=jmenuBarDetalleAuxiliarSriRetenciones;
		final JToolBar jTtoolBarDetalleSriRetenciones=jTtoolBarDetalleAuxiliarSriRetenciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriRetenciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriRetenciones;
			processRunnable.jTableDatos=jTableDatosSriRetenciones;
			processRunnable.jPanelCampos=jPanelCamposSriRetenciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriRetenciones;
			processRunnable.jPanelAcciones=jPanelAccionesSriRetenciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriRetenciones;
			
			
			processRunnable.jmenuBar=jmenuBarSriRetenciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriRetenciones;
			processRunnable.jTtoolBar=jTtoolBarSriRetenciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriRetenciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSriRetenciones ,jPanelParametrosReportesSriRetenciones, jTableDatosSriRetenciones,/*jScrollPanelDatosSriRetenciones,*/jPanelCamposSriRetenciones,jPanelPaginacionSriRetenciones, /*jScrollPanelDatosEdicionSriRetenciones,*/ jPanelAccionesSriRetenciones,jPanelAccionesFormularioSriRetenciones,jmenuBarSriRetenciones,jmenuBarDetalleSriRetenciones,jTtoolBarSriRetenciones,jTtoolBarDetalleSriRetenciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSriRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSriRetenciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSriRetenciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSriRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSriRetenciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSriRetenciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSriRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSriRetenciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSriRetenciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sriretencionesConstantesFunciones.getsFinalQuerySriRetenciones();
		String  finalQueryPaginacionTodos=this.sriretencionesConstantesFunciones.getsFinalQuerySriRetenciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SriRetencionesConstantesFunciones.getArrayColumnasGlobalesNoSriRetenciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SriRetencionesConstantesFunciones.getArrayColumnasGlobalesSriRetenciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SriRetencionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sriretencionessEliminados= new ArrayList<SriRetenciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSriRetenciones();
		
				///*SriRetencionesSessionBean*/this.sriretencionesSessionBean=new SriRetencionesSessionBean();
			
			if(this.sriretencionesSessionBean==null) {
				this.sriretencionesSessionBean=new SriRetencionesSessionBean();
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
					this.iNumeroPaginacion=SriRetencionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SriRetencionesConstantesFunciones.getClassesForeignKeysOfSriRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sriretenciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sriretencionessAux= new ArrayList<SriRetenciones>();
			
				
			sriretencionesLogic.setDatosCliente(this.datosCliente);
			sriretencionesLogic.setDatosDeep(this.datosDeep);
			sriretencionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSriRetenciones")) {
				this.sDetalleReporte=SriRetencionesConstantesFunciones.getDetalleIndiceBusquedaSriRetenciones(id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sriretencionesLogic.getSriRetencionessBusquedaSriRetenciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriRetencionesConstantesFunciones.getDetalleIndiceBusquedaSriRetenciones(id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriRetencionesConstantesFunciones.getDetalleIndiceBusquedaSriRetenciones(id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sriretencionesLogic.getSriRetencioness()==null||sriretencionesLogic.getSriRetencioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sriretencioness==null|| sriretencioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sriretencionessAux=new ArrayList<SriRetenciones>();
						sriretencionessAux.addAll(sriretencionesLogic.getSriRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sriretencionessAux=new ArrayList<SriRetenciones>();
							sriretencionessAux.addAll(sriretencioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sriretencionesLogic.getSriRetencionessBusquedaSriRetenciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriRetencionesConstantesFunciones.getDetalleIndiceBusquedaSriRetenciones(id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriRetencionesConstantesFunciones.getDetalleIndiceBusquedaSriRetenciones(id_ejercicioBusquedaSriRetenciones,id_periodo_declaraBusquedaSriRetenciones,rucBusquedaSriRetenciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSriRetencioness("BusquedaSriRetenciones",sriretencionesLogic.getSriRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSriRetencioness("BusquedaSriRetenciones",sriretencioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sriretencionesLogic.setSriRetencioness(new ArrayList<SriRetenciones>());
						sriretencionesLogic.getSriRetencioness().addAll(sriretencionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sriretencioness=new ArrayList<SriRetenciones>();
							sriretencioness.addAll(sriretencionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSriRetenciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSriRetenciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sriretencionesLogic.getSriRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriretencioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sriretencionesLogic.getSriRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriretencioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SriRetenciones sriretenciones) {
		Boolean permite=true;
		
		if(this.sriretenciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SriRetencionesConstantesFunciones.getOrderByListaSriRetenciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SriRetencionesConstantesFunciones.getOrderByListaSriRetenciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriRetenciones sriretenciones:sriretencionesLogic.getSriRetencioness()) {
				if(sriretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					sriretencionesTotales=sriretenciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriRetenciones sriretenciones:this.sriretencioness) {
				if(sriretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					sriretencionesTotales=sriretenciones;
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
			this.sriretencionesAux=new SriRetenciones();
			this.sriretencionesAux.setsType(Constantes2.S_TOTALES);
			this.sriretencionesAux.setIsNew(false);
			this.sriretencionesAux.setIsChanged(false);
			this.sriretencionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SriRetencionesConstantesFunciones.TotalizarValoresFilaSriRetenciones(this.sriretencionesLogic.getSriRetencioness(),this.sriretencionesAux);
				
				//this.sriretencionesLogic.getSriRetencioness().add(this.sriretencionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SriRetencionesConstantesFunciones.TotalizarValoresFilaSriRetenciones(this.sriretencioness,this.sriretencionesAux);
				
				this.sriretencioness.add(this.sriretencionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sriretencionesTotales=new SriRetenciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sriretencionesLogic.getSriRetencioness().remove(sriretencionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sriretencioness.remove(sriretencionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sriretencionesTotales=new SriRetenciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriRetenciones sriretenciones:sriretencionesLogic.getSriRetencioness()) {
				if(sriretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					sriretencionesTotales=sriretenciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriRetencionesConstantesFunciones.TotalizarValoresFilaSriRetenciones(this.sriretencionesLogic.getSriRetencioness(),sriretencionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriRetenciones sriretenciones:this.sriretencioness) {
				if(sriretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					sriretencionesTotales=sriretenciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriRetencionesConstantesFunciones.TotalizarValoresFilaSriRetenciones(this.sriretencioness,sriretencionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSriRetencionessBusquedaSriRetenciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaSriRetenciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriRetencionessFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriRetencionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriRetencionessFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSriRetencionessBusquedaSriRetenciones(String sFinalQuery,Long id_ejercicio,Long id_periodo_declara,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sriretencionesLogic.getSriRetencionessBusquedaSriRetenciones(sFinalQuery,this.pagination,id_ejercicio,id_periodo_declara,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriRetencionessFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sriretencionesLogic.getSriRetencionessFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriRetencionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sriretencionesLogic.getSriRetencionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriRetencionessFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sriretencionesLogic.getSriRetencionessFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
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
	
	public void inicializarPermisosSriRetenciones() {
		this.isPermisoTodoSriRetenciones=false;
		this.isPermisoNuevoSriRetenciones=false;
		this.isPermisoActualizarSriRetenciones=false;
		this.isPermisoActualizarOriginalSriRetenciones=false;
		this.isPermisoEliminarSriRetenciones=false;
		this.isPermisoGuardarCambiosSriRetenciones=false;
		this.isPermisoConsultaSriRetenciones=true;
		this.isPermisoBusquedaSriRetenciones=true;
		this.isPermisoReporteSriRetenciones=true;
		this.isPermisoOrdenSriRetenciones=false;		
		this.isPermisoPaginacionMedioSriRetenciones=false;		
		this.isPermisoPaginacionAltoSriRetenciones=false;		
		this.isPermisoPaginacionTodoSriRetenciones=false;		
		this.isPermisoCopiarSriRetenciones=false;		
		this.isPermisoVerFormSriRetenciones=false;		
		this.isPermisoDuplicarSriRetenciones=false;
		this.isPermisoOrdenSriRetenciones=false;
	}
	
	public void setPermisosUsuarioSriRetenciones(Boolean isPermiso) {
		this.isPermisoTodoSriRetenciones=isPermiso;
		this.isPermisoNuevoSriRetenciones=isPermiso;
		this.isPermisoActualizarSriRetenciones=isPermiso;
		this.isPermisoActualizarOriginalSriRetenciones=isPermiso;
		this.isPermisoEliminarSriRetenciones=isPermiso;
		this.isPermisoGuardarCambiosSriRetenciones=isPermiso;
		this.isPermisoConsultaSriRetenciones=isPermiso;
		this.isPermisoBusquedaSriRetenciones=isPermiso;
		this.isPermisoReporteSriRetenciones=isPermiso;
		this.isPermisoOrdenSriRetenciones=isPermiso;		
		this.isPermisoPaginacionMedioSriRetenciones=isPermiso;		
		this.isPermisoPaginacionAltoSriRetenciones=isPermiso;		
		this.isPermisoPaginacionTodoSriRetenciones=isPermiso;		
		this.isPermisoCopiarSriRetenciones=isPermiso;		
		this.isPermisoVerFormSriRetenciones=isPermiso;		
		this.isPermisoDuplicarSriRetenciones=isPermiso;
		this.isPermisoOrdenSriRetenciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSriRetenciones(Boolean isPermiso) {
		//this.isPermisoTodoSriRetenciones=isPermiso;
		this.isPermisoNuevoSriRetenciones=isPermiso;
		this.isPermisoActualizarSriRetenciones=isPermiso;
		this.isPermisoActualizarOriginalSriRetenciones=isPermiso;
		this.isPermisoEliminarSriRetenciones=isPermiso;
		this.isPermisoGuardarCambiosSriRetenciones=isPermiso;
		//this.isPermisoConsultaSriRetenciones=isPermiso;
		//this.isPermisoBusquedaSriRetenciones=isPermiso;
		//this.isPermisoReporteSriRetenciones=isPermiso;
		//this.isPermisoOrdenSriRetenciones=isPermiso;		
		//this.isPermisoPaginacionMedioSriRetenciones=isPermiso;		
		//this.isPermisoPaginacionAltoSriRetenciones=isPermiso;		
		//this.isPermisoPaginacionTodoSriRetenciones=isPermiso;		
		//this.isPermisoCopiarSriRetenciones=isPermiso;		
		//this.isPermisoDuplicarSriRetenciones=isPermiso;
		//this.isPermisoOrdenSriRetenciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSriRetencionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SriRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSriRetenciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSriRetencionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSriRetencionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSriRetencionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSriRetencionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSriRetenciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SriRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SriRetencionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSriRetenciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSriRetenciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSriRetenciones=this.isPermisoActualizarSriRetenciones;
			this.isPermisoEliminarSriRetenciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSriRetenciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSriRetenciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSriRetenciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSriRetenciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSriRetenciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriRetenciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSriRetenciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSriRetenciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSriRetenciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSriRetenciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSriRetenciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSriRetenciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriRetenciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSriRetenciones.setToolTipText(this.jTableDatosSriRetenciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSriRetenciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSriRetenciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SriRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SriRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSriRetenciones() throws Exception {
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
	public void inicializarCombosForeignKeySriRetencionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periododeclarasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySriRetencionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SriRetencionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeySriRetenciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.sriretencionesSessionBean==null) {
				this.sriretencionesSessionBean=new SriRetencionesSessionBean();
			}

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {

			if(!this.sriretencionesSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
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
	
	public void initActionsCombosTodosForeignKeySriRetenciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySriRetenciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySriRetenciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySriRetenciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySriRetenciones(SriRetenciones sriretenciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySriRetenciones(SriRetenciones sriretenciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySriRetenciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySriRetenciones()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySriRetenciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySriRetenciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSriRetenciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySriRetenciones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySriRetenciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySriRetenciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public SriRetencionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SriRetencionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SriRetencionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sriretencionesSessionBean=new SriRetencionesSessionBean(); 
		this.sriretencionesConstantesFunciones=new SriRetencionesConstantesFunciones(); 
		this.sriretencionesBean=new SriRetenciones();//(this.sriretencionesConstantesFunciones); 		
		this.sriretencionesReturnGeneral=new SriRetencionesParameterReturnGeneral(); 
		
		this.sriretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sriretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SriRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SriRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SriRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSriRetenciones(true);
			
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
			
			this.sriretencionesConstantesFunciones=new SriRetencionesConstantesFunciones(); 
			this.sriretencionesBean=new SriRetenciones();//this.sriretencionesConstantesFunciones); 			
			this.sriretencionesReturnGeneral=new SriRetencionesParameterReturnGeneral(); 
		
			SriRetencionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Retenciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.sriretenciones=new SriRetenciones();
			this.sriretencioness = new ArrayList<SriRetenciones>();
			this.sriretencionessAux = new ArrayList<SriRetenciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic=new SriRetencionesLogic();
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			//this.sriretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sriretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSriRetenciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriRetenciones);	
					}
					
					if(this.jInternalFrameImportacionSriRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriRetenciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySriRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySriRetenciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSriRetenciones);
				this.jInternalFrameDetalleFormSriRetenciones.setVisible(false);
				this.jInternalFrameDetalleFormSriRetenciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriRetenciones);
					this.jInternalFrameReporteDinamicoSriRetenciones.setVisible(false);
					this.jInternalFrameReporteDinamicoSriRetenciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSriRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSriRetenciones);
					this.jInternalFrameImportacionSriRetenciones.setVisible(false);
					this.jInternalFrameImportacionSriRetenciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySriRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySriRetenciones);
					this.jInternalFrameOrderBySriRetenciones.setVisible(false);
					this.jInternalFrameOrderBySriRetenciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSriRetencionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SriRetencionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sriretencionesReturnGeneral=new SriRetencionesParameterReturnGeneral();
			
			this.sriretencionesParameterGeneral=new SriRetencionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sriretencionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SriRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriRetencionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sriretencionesSessionBean.getEsGuardarRelacionado(),this.sriretencionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriRetencionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sriretencionesSessionBean.getEsGuardarRelacionado(),this.sriretencionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaDuplicarSriRetenciones=true;
			this.isVisibilidadCeldaCopiarSriRetenciones=true;
			this.isVisibilidadCeldaVerFormSriRetenciones=true;
			this.isVisibilidadCeldaOrdenSriRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=false;
			this.isVisibilidadCeldaGuardarSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			
			
			this.isVisibilidadBusquedaSriRetenciones=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSriRetenciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSriRetenciones(false);
			
			this.setPermisosUsuarioSriRetenciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado() 
				|| (this.sriretencionesSessionBean.getEsGuardarRelacionado() && this.sriretencionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSriRetencionesClasesRelacionadas();
			}
			
			if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSriRetencionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSriRetenciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSriRetenciones();
			}
			
			if(!this.isPermisoBusquedaSriRetenciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SriRetencionesConstantesFunciones.getTiposSeleccionarSriRetenciones());
				
				this.tiposColumnasSelect=SriRetencionesConstantesFunciones.getTiposSeleccionarSriRetenciones(true);
				
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
			//if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSriRetenciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSriRetenciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSriRetenciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSriRetenciones() ;
			
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
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sriretencionesImplementable= (SriRetencionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriRetencionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sriretencionesImplementableHome= (SriRetencionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriRetencionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sriretencioness= new ArrayList<SriRetenciones>();
			this.sriretencionessEliminados= new ArrayList<SriRetenciones>();
						
			this.isEsNuevoSriRetenciones=false;
			this.esParaAccionDesdeFormularioSriRetenciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySriRetenciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSriRetenciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SriRetencionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SriRetencionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSriRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSriRetenciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSriRetenciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSriRetenciones();
			}
			
			SriRetencionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSriRetenciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSriRetenciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSriRetenciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSriRetenciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SriRetenciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSriRetenciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSriRetenciones")) {
				iIndex=this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSriRetenciones();	
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
	
	public void cargarCombosForeignKeySriRetenciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySriRetenciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySriRetenciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySriRetencionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySriRetenciones();
		
		this.cargarCombosFrameForeignKeySriRetenciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySriRetenciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySriRetenciones();
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
	
	public void jButtonNuevoSriRetencionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			
			if(jTableDatosSriRetenciones.getRowCount()>=1) {
				jTableDatosSriRetenciones.removeRowSelectionInterval(0, jTableDatosSriRetenciones.getRowCount()-1);						
			}
			
			this.isEsNuevoSriRetenciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSriRetenciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSriRetenciones(true);			
			//this.sriretenciones=new SriRetenciones();
			//this.sriretenciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriRetenciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriRetenciones() ;
			
			if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriRetenciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sriretenciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);				
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SriRetenciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSriRetencionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSriRetenciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSriRetenciones.getSelectedRows().length;			
			}
			
			sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSriRetenciones--;			
				//SriRetenciones sriretencionesAux= new SriRetenciones();			
				//sriretencionesAux.setId(this.iIdNuevoSriRetenciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SriRetenciones sriretencionesOrigen=new SriRetenciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SriRetenciones sriretencionesOrigen : sriretencionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sriretencionesOrigen =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sriretencionesOrigen =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSriRetenciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sriretenciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSriRetenciones(sriretencionesOrigen,this.sriretenciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sriretencionesLogic.getSriRetencioness().add(this.sriretencionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sriretencioness.add(this.sriretencionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSriRetenciones(false);
				
				this.jTableDatosSriRetenciones.setRowSelectionInterval(this.getIndiceNuevoSriRetenciones(), this.getIndiceNuevoSriRetenciones());
				
				int iLastRow =  this.jTableDatosSriRetenciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriRetenciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriRetenciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriRetenciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();									
		
			SriRetenciones sriretencionesOrigen=new SriRetenciones();
			SriRetenciones sriretencionesDestino=new SriRetenciones();
				
			sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSriRetenciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sriretencionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSriRetenciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sriretencionesOrigen =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sriretencionesOrigen =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sriretencionesDestino =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sriretencionesDestino =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sriretencionesOrigen =sriretencionessSeleccionados.get(0);
				sriretencionesDestino =sriretencionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSriRetenciones(sriretencionesOrigen,sriretencionesDestino,true,false);
				
				sriretencionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sriretencionesDestino,sriretencionesLogic.getSriRetencioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sriretencionesDestino,sriretencioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSriRetenciones(false);
				
				//this.jTableDatosSriRetenciones.setRowSelectionInterval(this.getIndiceNuevoSriRetenciones(), this.getIndiceNuevoSriRetenciones());
				
				int iLastRow =  this.jTableDatosSriRetenciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriRetenciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriRetenciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriRetenciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSriRetenciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSriRetenciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSriRetenciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSriRetenciones.setVisible(!isVisible);
			this.jPanelPaginacionSriRetenciones.setVisible(!isVisible);
			this.jPanelAccionesSriRetenciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSriRetenciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSriRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSriRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySriRetenciones();
			
			this.abrirFrameOrderBySriRetenciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySriRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSriRetenciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriRetenciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSriRetenciones.isMaximum()) {
					this.jInternalFrameDetalleFormSriRetenciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSriRetenciones.setSize(this.jInternalFrameDetalleFormSriRetenciones.iWidthFormulario,this.jInternalFrameDetalleFormSriRetenciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSriRetenciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSriRetenciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSriRetenciones.isMaximum()) {
						this.jInternalFrameDetalleFormSriRetenciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSriRetenciones.jContentPaneDetalleSriRetenciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSriRetenciones.jContentPaneDetalleSriRetenciones.getWidth(),SriRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSriRetenciones.jContentPaneDetalleSriRetenciones.getWidth(),SriRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSriRetenciones.jContentPaneDetalleSriRetenciones.getWidth(),SriRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSriRetenciones.setVisible(true);
	        this.jInternalFrameDetalleFormSriRetenciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySriRetenciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySriRetenciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySriRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriRetenciones,false,this);
				} else {
					this.jInternalFrameOrderBySriRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriRetenciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySriRetenciones);
				this.jInternalFrameOrderBySriRetenciones.setVisible(false);
				this.jInternalFrameOrderBySriRetenciones.setSelected(false);
				
				this.jInternalFrameOrderBySriRetenciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriRetenciones"));
				
				this.inicializarActualizarBindingTablaOrderBySriRetenciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSriRetenciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSriRetenciones==null) {
				
				this.jInternalFrameImportacionSriRetenciones=new ImportacionJInternalFrame(SriRetencionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriRetenciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSriRetenciones);
				this.jInternalFrameImportacionSriRetenciones.setVisible(false);
				this.jInternalFrameImportacionSriRetenciones.setSelected(false);


				this.jInternalFrameImportacionSriRetenciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriRetenciones"));
				this.jInternalFrameImportacionSriRetenciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriRetenciones"));
				this.jInternalFrameImportacionSriRetenciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriRetenciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSriRetenciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSriRetenciones==null) {
				this.jInternalFrameReporteDinamicoSriRetenciones=new ReporteDinamicoJInternalFrame(SriRetencionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriRetenciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriRetenciones);
				this.jInternalFrameReporteDinamicoSriRetenciones.setVisible(false);
				this.jInternalFrameReporteDinamicoSriRetenciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriRetenciones"));
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriRetenciones"));
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriRetenciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriRetenciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSriRetenciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriRetenciones);
			
	       	this.jInternalFrameDetalleFormSriRetenciones.setVisible(false);
	        this.jInternalFrameDetalleFormSriRetenciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormSriRetenciones.dispose();
			//this.jInternalFrameDetalleFormSriRetenciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSriRetenciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSriRetenciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoSriRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSriRetenciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSriRetenciones.setVisible(true);
	        this.jInternalFrameImportacionSriRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySriRetenciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySriRetenciones.setVisible(true);
	        this.jInternalFrameOrderBySriRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySriRetenciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySriRetenciones.setVisible(false);
	        this.jInternalFrameOrderBySriRetenciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSriRetenciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSriRetenciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoSriRetenciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSriRetenciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSriRetenciones.setVisible(false);
	        this.jInternalFrameImportacionSriRetenciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSriRetenciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSriRetenciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSriRetenciones(true);
			//this.isEsNuevoSriRetenciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSriRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriRetenciones(false) ;
			
			if(sriretencionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriRetenciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriRetenciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSriRetencionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSriRetenciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSriRetenciones(true);
			//this.isEsNuevoSriRetenciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sriretenciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSriRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSriRetenciones(false) ;
			
			if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriRetenciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriRetenciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriRetenciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSriRetenciones(false);
			
			//if(!this.isEsNuevoSriRetenciones) {								
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				
			}
			
			if(this.permiteMantenimiento(this.sriretenciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSriRetenciones=true;
					this.inicializarActualizarBindingTablaSriRetenciones(false);
					this.isEsNuevoSriRetenciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSriRetenciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSriRetenciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriRetenciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriRetenciones(false);
				
				this.habilitarDeshabilitarControlesSriRetenciones(false);
			
												
				
				if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSriRetenciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSriRetencionesActionPerformed(evt,sriretencionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSriRetenciones(this.sriretenciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSriRetenciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sriretencionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sriretenciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				this.sriretenciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				this.sriretenciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sriretenciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SriRetencionesModel) this.jTableDatosSriRetenciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSriRetenciones=true;
				this.inicializarActualizarBindingTablaSriRetenciones(false);
				this.isEsNuevoSriRetenciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriRetenciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriRetenciones(false);
				
				this.habilitarDeshabilitarControlesSriRetenciones(false);
				
				
				
				if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSriRetenciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSriRetencionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSriRetenciones.getRowCount()>=1) {
				jTableDatosSriRetenciones.removeRowSelectionInterval(0, jTableDatosSriRetenciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSriRetenciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSriRetenciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriRetenciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriRetenciones(false) ;
			
			this.isEsNuevoSriRetenciones=false;
			
			if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSriRetenciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSriRetenciones(false);
				
				//SI ES MANUAL
				if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSriRetenciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSriRetenciones--;			
			//SriRetenciones sriretencionesAux= new SriRetenciones();			
			//sriretencionesAux.setId(this.iIdNuevoSriRetenciones);
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSriRetenciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
			
			this.sriretenciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sriretencionesLogic.getSriRetencioness().add(this.sriretencionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sriretencioness.add(this.sriretencionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSriRetenciones(false);
			
			this.jTableDatosSriRetenciones.setRowSelectionInterval(this.getIndiceNuevoSriRetenciones(), this.getIndiceNuevoSriRetenciones());
			
			int iLastRow =  this.jTableDatosSriRetenciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSriRetenciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSriRetenciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSriRetenciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriRetenciones(false);
			
			//SI ES MANUAL
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriRetenciones();
			}
			
			//this.abrirFrameTreeSriRetenciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSriRetenciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSriRetenciones.setFileImportacion(this.jInternalFrameImportacionSriRetenciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSriRetenciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSriRetenciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSriRetenciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSriRetenciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		

		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SriRetencionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SriRetencionesBaseDesign.jrxml";
			
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
			
			this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaRegistroContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaRegistroContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaRegistroContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaRegistroContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_TOTALIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_MONTOIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumentoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumentoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumentoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumentoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContableRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContableRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContableRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContableRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBenef_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSriRetenciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoria="nombre_modulo";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoria="nombre_tipo_comprobante";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoria="fecha_registro_contable";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case SriRetencionesConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoria="total_iva";
					break;

				case SriRetencionesConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoria="monto_iva";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					sNombreCampoCategoria="numero_documento_contable";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoria="nombre_cuenta_contable_retencion";
					break;

				case SriRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case SriRetencionesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoria="nombre_benef";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoriaValor="nombre_modulo";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					sNombreCampoCategoriaValor="nombre_tipo_comprobante";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					sNombreCampoCategoriaValor="fecha_registro_contable";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case SriRetencionesConstantesFunciones.LABEL_TOTALIVA:
					sNombreCampoCategoriaValor="total_iva";
					break;

				case SriRetencionesConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoriaValor="monto_iva";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					sNombreCampoCategoriaValor="numero_documento_contable";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoriaValor="nombre_cuenta_contable_retencion";
					break;

				case SriRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case SriRetencionesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoriaValor="nombre_benef";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_modulo");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_comprobante");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Registro Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_registro_contable");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case SriRetencionesConstantesFunciones.LABEL_TOTALIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_iva");
					break;

				case SriRetencionesConstantesFunciones.LABEL_MONTOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_iva");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento_contable");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable_retencion");
					break;

				case SriRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case SriRetencionesConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_benef");
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
	
	public void jButtonGenerarExcelReporteDinamicoSriRetencionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SriRetencioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SriRetencionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_RUC);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnombre_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnombre_tipo_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getfecha_registro_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_TOTALIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_TOTALIVA);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.gettotal_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_MONTOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_MONTOIVA);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getmonto_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnumero_documento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnombre_cuenta_contable_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
					iRow++;

					for(SriRetenciones sriretenciones:sriretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sriretenciones.getnombre_benef());
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
			//	this.getFilaCabeceraExportarExcelSriRetenciones(row);				
			//	iRow++;
			//}				
			
			//for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSriRetenciones(sriretencionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriRetenciones(false);
			
			//SI ES MANUAL
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriRetenciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriRetenciones(false);
			
			//SI ES MANUAL
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriRetenciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSriRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriRetenciones(false);
			
			//SI ES MANUAL
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriRetenciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSriRetenciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSriRetenciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSriRetenciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSriRetenciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSriRetenciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSriRetenciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosSriRetenciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosSriRetenciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSriRetenciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSriRetenciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSriRetenciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSriRetenciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSriRetenciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSriRetenciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriRetenciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSriRetenciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSriRetenciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSriRetenciones();
		
		this.inicializarActualizarBindingBotonesManualSriRetenciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSriRetenciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriRetenciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSriRetenciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSriRetenciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSriRetenciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSriRetenciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSriRetenciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionNuevoSriRetenciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionSinCerrarSriRetenciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionSinMensajeSriRetenciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSriRetenciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSriRetenciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSriRetenciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
				this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionNuevoSriRetenciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionSinCerrarSriRetenciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSriRetenciones.jCheckBoxPostAccionSinMensajeSriRetenciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSriRetenciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSriRetenciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSriRetenciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSriRetenciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSriRetenciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSriRetenciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSriRetenciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSriRetenciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSriRetenciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSriRetenciones(Boolean esInicializar) throws Exception {
		try	{	
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSriRetenciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSriRetenciones() throws Exception {
		try	{
			if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSriRetenciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriRetenciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSriRetenciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSriRetenciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSriRetenciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSriRetenciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSriRetenciones.addItem(reporte);
			}
			
			
			if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSriRetenciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSriRetenciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSriRetenciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSriRetenciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSriRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSriRetenciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSriRetenciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriRetenciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriRetenciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
				this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
				this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SriRetencionesConstantesFunciones.getTiposSeleccionarSriRetenciones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SriRetencionesConstantesFunciones.getTiposSeleccionarSriRetenciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SriRetencionesConstantesFunciones.getTiposSeleccionarSriRetenciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriRetenciones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSriRetenciones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSriRetenciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.getSelectedItem()!=null){this.id_ejercicioBusquedaSriRetenciones=((Ejercicio)this.jComboBoxid_ejercicioBusquedaSriRetencionesSriRetenciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.getSelectedItem()!=null){this.id_periodo_declaraBusquedaSriRetenciones=((PeriodoDeclara)this.jComboBoxid_periodo_declaraBusquedaSriRetencionesSriRetenciones.getSelectedItem()).getId();}
		this.rucBusquedaSriRetenciones=this.jTextFieldrucBusquedaSriRetencionesSriRetenciones.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSriRetenciones(Boolean esInicializar) throws Exception {				
		if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSriRetenciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSriRetenciones() throws Exception {
		this.inicializarActualizarBindingTablaSriRetenciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySriRetenciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSriRetencionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetencionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSriRetenciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sriretencionesLogic.getSriRetencioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sriretencioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSriRetenciones.setModel(new SriRetencionesModel(this.sriretencionesLogic.getSriRetencioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSriRetenciones.setModel(new SriRetencionesModel(this.sriretencioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySriRetenciones!=null && this.jInternalFrameOrderBySriRetenciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySriRetenciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO,sriretencionesConstantesFunciones.resaltarSeleccionarSriRetenciones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO,sriretencionesConstantesFunciones.resaltarSeleccionarSriRetenciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_ID));

		if(this.sriretencionesConstantesFunciones.mostraridSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sriretencionesConstantesFunciones.resaltaridSriRetenciones,this.sriretencionesConstantesFunciones.activaridSriRetenciones,iSizeTabla,this,true,"idSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltaridSriRetenciones,this.sriretencionesConstantesFunciones.activaridSriRetenciones,this,true,"idSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO));

		if(this.sriretencionesConstantesFunciones.mostrarnombre_moduloSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_moduloSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_moduloSriRetenciones,iSizeTabla,this,true,"nombre_moduloSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_moduloSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_moduloSriRetenciones,this,true,"nombre_moduloSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE));

		if(this.sriretencionesConstantesFunciones.mostrarnombre_tipo_comprobanteSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_tipo_comprobanteSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_tipo_comprobanteSriRetenciones,iSizeTabla,this,true,"nombre_tipo_comprobanteSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_tipo_comprobanteSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_tipo_comprobanteSriRetenciones,this,true,"nombre_tipo_comprobanteSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.sriretencionesConstantesFunciones.mostrarnumero_documentoSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_documentoSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_documentoSriRetenciones,iSizeTabla,this,true,"numero_documentoSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_documentoSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_documentoSriRetenciones,this,true,"numero_documentoSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.sriretencionesConstantesFunciones.mostrarfecha_emisionSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sriretencionesConstantesFunciones.resaltarfecha_emisionSriRetenciones,this.sriretencionesConstantesFunciones.activarfecha_emisionSriRetenciones,iSizeTabla,this,true,"fecha_emisionSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sriretencionesConstantesFunciones.resaltarfecha_emisionSriRetenciones,this.sriretencionesConstantesFunciones.activarfecha_emisionSriRetenciones,this,true,"fecha_emisionSriRetenciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE));

		if(this.sriretencionesConstantesFunciones.mostrarfecha_registro_contableSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.sriretencionesConstantesFunciones.resaltarfecha_registro_contableSriRetenciones,this.sriretencionesConstantesFunciones.activarfecha_registro_contableSriRetenciones,iSizeTabla,this,true,"fecha_registro_contableSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.sriretencionesConstantesFunciones.resaltarfecha_registro_contableSriRetenciones,this.sriretencionesConstantesFunciones.activarfecha_registro_contableSriRetenciones,this,true,"fecha_registro_contableSriRetenciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.sriretencionesConstantesFunciones.mostrarnumero_serieSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_serieSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_serieSriRetenciones,iSizeTabla,this,true,"numero_serieSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_serieSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_serieSriRetenciones,this,true,"numero_serieSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_TOTALIVA));

		if(this.sriretencionesConstantesFunciones.mostrartotal_ivaSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_TOTALIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sriretencionesConstantesFunciones.resaltartotal_ivaSriRetenciones,this.sriretencionesConstantesFunciones.activartotal_ivaSriRetenciones,iSizeTabla,this,true,"total_ivaSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltartotal_ivaSriRetenciones,this.sriretencionesConstantesFunciones.activartotal_ivaSriRetenciones,this,true,"total_ivaSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_MONTOIVA));

		if(this.sriretencionesConstantesFunciones.mostrarmonto_ivaSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_MONTOIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sriretencionesConstantesFunciones.resaltarmonto_ivaSriRetenciones,this.sriretencionesConstantesFunciones.activarmonto_ivaSriRetenciones,iSizeTabla,this,true,"monto_ivaSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarmonto_ivaSriRetenciones,this.sriretencionesConstantesFunciones.activarmonto_ivaSriRetenciones,this,true,"monto_ivaSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE));

		if(this.sriretencionesConstantesFunciones.mostrarnumero_documento_contableSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_documento_contableSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_documento_contableSriRetenciones,iSizeTabla,this,true,"numero_documento_contableSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnumero_documento_contableSriRetenciones,this.sriretencionesConstantesFunciones.activarnumero_documento_contableSriRetenciones,this,true,"numero_documento_contableSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION));

		if(this.sriretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionSriRetenciones,iSizeTabla,this,true,"nombre_cuenta_contable_retencionSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionSriRetenciones,this,true,"nombre_cuenta_contable_retencionSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_PORCENTAJE));

		if(this.sriretencionesConstantesFunciones.mostrarporcentajeSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sriretencionesConstantesFunciones.resaltarporcentajeSriRetenciones,this.sriretencionesConstantesFunciones.activarporcentajeSriRetenciones,iSizeTabla,this,true,"porcentajeSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarporcentajeSriRetenciones,this.sriretencionesConstantesFunciones.activarporcentajeSriRetenciones,this,true,"porcentajeSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_VALOR));

		if(this.sriretencionesConstantesFunciones.mostrarvalorSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sriretencionesConstantesFunciones.resaltarvalorSriRetenciones,this.sriretencionesConstantesFunciones.activarvalorSriRetenciones,iSizeTabla,this,true,"valorSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarvalorSriRetenciones,this.sriretencionesConstantesFunciones.activarvalorSriRetenciones,this,true,"valorSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF));

		if(this.sriretencionesConstantesFunciones.mostrarnombre_benefSriRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_benefSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_benefSriRetenciones,iSizeTabla,this,true,"nombre_benefSriRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sriretencionesConstantesFunciones.resaltarnombre_benefSriRetenciones,this.sriretencionesConstantesFunciones.activarnombre_benefSriRetenciones,this,true,"nombre_benefSriRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriRetenciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriRetenciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sriretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSriRetenciones.addColumn(tableColumn);
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
			
			this.jTableDatosSriRetenciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSriRetenciones.moveColumn(this.jTableDatosSriRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSriRetenciones.moveColumn(this.jTableDatosSriRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSriRetenciones.moveColumn(this.jTableDatosSriRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSriRetenciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSriRetenciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSriRetenciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSriRetenciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSriRetenciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSriRetenciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSriRetenciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSriRetenciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=sriretencionesLogic.getSriRetencioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sriretencioness.size()-1;
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
		//this.jTableDatosSriRetenciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSriRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSriRetenciones();
			
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
				
				//this.isEsNuevoSriRetenciones=false;
					
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
				if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSriRetenciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriRetenciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriRetenciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sriretenciones.getsType().equals("DUPLICADO")
				   || this.sriretenciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSriRetenciones=true;
				
				} else {
					this.isEsNuevoSriRetenciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
					if(this.sriretenciones.getId()>=0 && !this.sriretenciones.getIsNew()) {						
						this.isEsNuevoSriRetenciones=false;
						
					} else {
						this.isEsNuevoSriRetenciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSriRetenciones(esRelaciones);						
				
				this.seleccionarSriRetenciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sriretenciones.getId()<0) {
					this.isEsNuevoSriRetenciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSriRetenciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSriRetenciones(evt,rowIndex);
				}	
				
				if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SriRetenciones: " + this.dDif); 
					}
				}								
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSriRetenciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sriretenciones)) {
					if(this.sriretenciones.getId()>0) {
						this.sriretenciones.setIsDeleted(true);
						
						this.sriretencionessEliminados.add(this.sriretenciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sriretencionesLogic.getSriRetencioness().remove(this.sriretenciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sriretencioness.remove(this.sriretenciones);				
					}
					
					
					((SriRetencionesModel) this.jTableDatosSriRetenciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSriRetenciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSriRetenciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSriRetenciones) {
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriRetenciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriRetenciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSriRetenciones(this.sriretenciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSriRetenciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSriRetenciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriRetenciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriRetenciones(SriRetenciones sriretenciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSriRetenciones(sriretenciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriRetenciones(SriRetenciones sriretenciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSriRetenciones(sriretenciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySriRetenciones(sriretenciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySriRetenciones(sriretenciones);
	}
	
	public void setVariablesObjetoActualToFormularioSriRetenciones(SriRetenciones sriretenciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setText(sriretenciones.getId().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setText(sriretenciones.getnombre_modulo());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setText(sriretenciones.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setText(sriretenciones.getnumero_documento());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setDate(sriretenciones.getfecha_emision());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setDate(sriretenciones.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setText(sriretenciones.getnumero_serie());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setText(sriretenciones.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setText(sriretenciones.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setText(sriretenciones.getnumero_documento_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setText(sriretenciones.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setText(sriretenciones.getporcentaje().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setText(sriretenciones.getvalor().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setText(sriretenciones.getnombre_benef());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SriRetenciones sriretencionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sriretencionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SriRetenciones sriretencionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sriretencionesLocal=this.sriretenciones;
			} else {
				sriretencionesLocal=this.sriretencionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sriretencionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSriRetenciones(sriretencionesLocal,true);
					
					if(sriretencionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sriretencionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sriretencionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSriRetenciones(SriRetenciones sriretenciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriRetenciones(sriretenciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(sriretenciones);
	}
	
	public void setVariablesFormularioToObjetoActualSriRetenciones(SriRetenciones sriretenciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriRetenciones(sriretenciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSriRetenciones(SriRetenciones sriretenciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.getText()==null || this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.getText()=="" || this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.getText()=="Id") {
				this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setText("0");
			}

			if(conColumnasBase) {sriretenciones.setId(Long.parseLong(this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelIdSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnombre_modulo(this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_moduloSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnombre_tipo_comprobante(this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_tipo_comprobanteSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnumero_documento(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documentoSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setfecha_emision(this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_emisionSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setfecha_registro_contable(this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelfecha_registro_contableSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnumero_serie(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_serieSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.settotal_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_TOTALIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabeltotal_ivaSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setmonto_iva(Double.parseDouble(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_MONTOIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelmonto_ivaSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnumero_documento_contable(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnumero_documento_contableSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnombre_cuenta_contable_retencion(this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_cuenta_contable_retencionSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelporcentajeSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelvalorSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sriretenciones.setnombre_benef(this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriRetenciones.jLabelnombre_benefSriRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriRetenciones(SriRetenciones sriretencionesBean,SriRetenciones sriretenciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSriRetenciones(SriRetenciones sriretencionesOrigen,SriRetenciones sriretenciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sriretencionesOrigen.getId()!=null && !sriretencionesOrigen.getId().equals(0L))) {sriretenciones.setId(sriretencionesOrigen.getId());}}
			if(conDefault || (!conDefault && sriretencionesOrigen.getruc()!=null && !sriretencionesOrigen.getruc().equals(""))) {sriretenciones.setruc(sriretencionesOrigen.getruc());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnombre_modulo()!=null && !sriretencionesOrigen.getnombre_modulo().equals(""))) {sriretenciones.setnombre_modulo(sriretencionesOrigen.getnombre_modulo());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnombre_tipo_comprobante()!=null && !sriretencionesOrigen.getnombre_tipo_comprobante().equals(""))) {sriretenciones.setnombre_tipo_comprobante(sriretencionesOrigen.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnumero_documento()!=null && !sriretencionesOrigen.getnumero_documento().equals(""))) {sriretenciones.setnumero_documento(sriretencionesOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getfecha_emision()!=null && !sriretencionesOrigen.getfecha_emision().equals(new Date()))) {sriretenciones.setfecha_emision(sriretencionesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getfecha_registro_contable()!=null && !sriretencionesOrigen.getfecha_registro_contable().equals(new Date()))) {sriretenciones.setfecha_registro_contable(sriretencionesOrigen.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnumero_serie()!=null && !sriretencionesOrigen.getnumero_serie().equals(""))) {sriretenciones.setnumero_serie(sriretencionesOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && sriretencionesOrigen.gettotal_iva()!=null && !sriretencionesOrigen.gettotal_iva().equals(0.0))) {sriretenciones.settotal_iva(sriretencionesOrigen.gettotal_iva());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getmonto_iva()!=null && !sriretencionesOrigen.getmonto_iva().equals(0.0))) {sriretenciones.setmonto_iva(sriretencionesOrigen.getmonto_iva());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnumero_documento_contable()!=null && !sriretencionesOrigen.getnumero_documento_contable().equals(""))) {sriretenciones.setnumero_documento_contable(sriretencionesOrigen.getnumero_documento_contable());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnombre_cuenta_contable_retencion()!=null && !sriretencionesOrigen.getnombre_cuenta_contable_retencion().equals(""))) {sriretenciones.setnombre_cuenta_contable_retencion(sriretencionesOrigen.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getporcentaje()!=null && !sriretencionesOrigen.getporcentaje().equals(0.0))) {sriretenciones.setporcentaje(sriretencionesOrigen.getporcentaje());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getvalor()!=null && !sriretencionesOrigen.getvalor().equals(0.0))) {sriretenciones.setvalor(sriretencionesOrigen.getvalor());}
			if(conDefault || (!conDefault && sriretencionesOrigen.getnombre_benef()!=null && !sriretencionesOrigen.getnombre_benef().equals(""))) {sriretenciones.setnombre_benef(sriretencionesOrigen.getnombre_benef());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriRetenciones(SriRetenciones sriretenciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setText(sriretenciones.getId().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setText(sriretenciones.getnombre_modulo());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setText(sriretenciones.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setText(sriretenciones.getnumero_documento());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setDate(sriretenciones.getfecha_emision());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setDate(sriretenciones.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setText(sriretenciones.getnumero_serie());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setText(sriretenciones.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setText(sriretenciones.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setText(sriretenciones.getnumero_documento_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setText(sriretenciones.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setText(sriretenciones.getporcentaje().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setText(sriretenciones.getvalor().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setText(sriretenciones.getnombre_benef());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriRetenciones(SriRetencionesBean sriretencionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setText(sriretencionesBean.getId().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setText(sriretencionesBean.getnombre_modulo());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setText(sriretencionesBean.getnombre_tipo_comprobante());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setText(sriretencionesBean.getnumero_documento());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setDate(sriretencionesBean.getfecha_emision());
			this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setDate(sriretencionesBean.getfecha_registro_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setText(sriretencionesBean.getnumero_serie());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setText(sriretencionesBean.gettotal_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setText(sriretencionesBean.getmonto_iva().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setText(sriretencionesBean.getnumero_documento_contable());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setText(sriretencionesBean.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setText(sriretencionesBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setText(sriretencionesBean.getvalor().toString());
			this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setText(sriretencionesBean.getnombre_benef());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSriRetenciones(SriRetencionesParameterReturnGeneral sriretencionesReturnGeneral,SriRetencionesBean sriretencionesBean,Boolean conDefault) throws Exception { 
		try {
			SriRetenciones sriretencionesLocal=new SriRetenciones();
			
			sriretencionesLocal=sriretencionesReturnGeneral.getSriRetenciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sriretencionesLocal.getId()!=null && !sriretencionesLocal.getId().equals(0L))) {sriretencionesBean.setId(sriretencionesLocal.getId());}}
			if(conDefault || (!conDefault && sriretencionesLocal.getnombre_modulo()!=null && !sriretencionesLocal.getnombre_modulo().equals(""))) {sriretencionesBean.setnombre_modulo(sriretencionesLocal.getnombre_modulo());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnombre_tipo_comprobante()!=null && !sriretencionesLocal.getnombre_tipo_comprobante().equals(""))) {sriretencionesBean.setnombre_tipo_comprobante(sriretencionesLocal.getnombre_tipo_comprobante());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnumero_documento()!=null && !sriretencionesLocal.getnumero_documento().equals(""))) {sriretencionesBean.setnumero_documento(sriretencionesLocal.getnumero_documento());}
			if(conDefault || (!conDefault && sriretencionesLocal.getfecha_emision()!=null && !sriretencionesLocal.getfecha_emision().equals(new Date()))) {sriretencionesBean.setfecha_emision(sriretencionesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && sriretencionesLocal.getfecha_registro_contable()!=null && !sriretencionesLocal.getfecha_registro_contable().equals(new Date()))) {sriretencionesBean.setfecha_registro_contable(sriretencionesLocal.getfecha_registro_contable());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnumero_serie()!=null && !sriretencionesLocal.getnumero_serie().equals(""))) {sriretencionesBean.setnumero_serie(sriretencionesLocal.getnumero_serie());}
			if(conDefault || (!conDefault && sriretencionesLocal.gettotal_iva()!=null && !sriretencionesLocal.gettotal_iva().equals(0.0))) {sriretencionesBean.settotal_iva(sriretencionesLocal.gettotal_iva());}
			if(conDefault || (!conDefault && sriretencionesLocal.getmonto_iva()!=null && !sriretencionesLocal.getmonto_iva().equals(0.0))) {sriretencionesBean.setmonto_iva(sriretencionesLocal.getmonto_iva());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnumero_documento_contable()!=null && !sriretencionesLocal.getnumero_documento_contable().equals(""))) {sriretencionesBean.setnumero_documento_contable(sriretencionesLocal.getnumero_documento_contable());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnombre_cuenta_contable_retencion()!=null && !sriretencionesLocal.getnombre_cuenta_contable_retencion().equals(""))) {sriretencionesBean.setnombre_cuenta_contable_retencion(sriretencionesLocal.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && sriretencionesLocal.getporcentaje()!=null && !sriretencionesLocal.getporcentaje().equals(0.0))) {sriretencionesBean.setporcentaje(sriretencionesLocal.getporcentaje());}
			if(conDefault || (!conDefault && sriretencionesLocal.getvalor()!=null && !sriretencionesLocal.getvalor().equals(0.0))) {sriretencionesBean.setvalor(sriretencionesLocal.getvalor());}
			if(conDefault || (!conDefault && sriretencionesLocal.getnombre_benef()!=null && !sriretencionesLocal.getnombre_benef().equals(""))) {sriretencionesBean.setnombre_benef(sriretencionesLocal.getnombre_benef());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSriRetencionesGenerico(Long idSriRetencionesSeleccionado,JComboBox jComboBoxSriRetenciones,List<SriRetenciones> sriretencionessLocal)throws Exception {
		try {
			SriRetenciones  sriretencionesTemp=null;

			for(SriRetenciones sriretencionesAux:sriretencionessLocal) {
				if(sriretencionesAux.getId()!=null && sriretencionesAux.getId().equals(idSriRetencionesSeleccionado)) {
					sriretencionesTemp=sriretencionesAux;
					break;
				}
			}

			jComboBoxSriRetenciones.setSelectedItem(sriretencionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSriRetencionesGenerico(JComboBox jComboBoxSriRetenciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriRetenciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSriRetenciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriRetenciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSriRetenciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sriretenciones=(SriRetenciones) sriretencionesLogic.getSriRetencioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sriretenciones =(SriRetenciones) sriretencioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!sriretenciones.getIsNew() && !sriretenciones.getIsChanged() && !sriretenciones.getIsDeleted()) {
				sDescripcion=sriretenciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=sriretenciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!sriretenciones.getIsNew() && !sriretenciones.getIsChanged() && !sriretenciones.getIsDeleted()) {
				sDescripcion=sriretenciones.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=sriretenciones.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!sriretenciones.getIsNew() && !sriretenciones.getIsChanged() && !sriretenciones.getIsDeleted()) {
				sDescripcion=sriretenciones.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=sriretenciones.getperiododeclara_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SriRetenciones sriretencionesRow=new SriRetenciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sriretencionesRow=(SriRetenciones) sriretencionesLogic.getSriRetencioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sriretencionesRow=(SriRetenciones) sriretencioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSriRetenciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones));			
			this.jButtonDuplicarSriRetenciones.setVisible((this.isVisibilidadCeldaDuplicarSriRetenciones && this.isPermisoDuplicarSriRetenciones));			
			this.jButtonCopiarSriRetenciones.setVisible((this.isVisibilidadCeldaCopiarSriRetenciones && this.isPermisoCopiarSriRetenciones));
			this.jButtonVerFormSriRetenciones.setVisible((this.isVisibilidadCeldaVerFormSriRetenciones && this.isPermisoVerFormSriRetenciones));
			
			this.jButtonAbrirOrderBySriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));			
			
			this.jButtonNuevoRelacionesSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriRetenciones && this.isPermisoNuevoSriRetenciones));			
			this.jButtonNuevoGuardarCambiosSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarSriRetenciones.setVisible((this.isVisibilidadCeldaModificarSriRetenciones && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.setVisible((this.isVisibilidadCeldaActualizarSriRetenciones && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.setVisible((this.isVisibilidadCeldaEliminarSriRetenciones && this.isPermisoEliminarSriRetenciones));
			this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.setVisible(this.isVisibilidadCeldaCancelarSriRetenciones);							
			this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones));						
			this.jButtonDuplicarToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaDuplicarSriRetenciones && this.isPermisoDuplicarSriRetenciones));						
			this.jButtonCopiarToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaCopiarSriRetenciones && this.isPermisoCopiarSriRetenciones));			
			this.jButtonVerFormToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaVerFormSriRetenciones && this.isPermisoVerFormSriRetenciones));			
			this.jButtonAbrirOrderByToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));
			this.jButtonNuevoRelacionesToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriRetenciones && this.isPermisoNuevoSriRetenciones));			
			this.jButtonNuevoGuardarCambiosToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));			
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaModificarSriRetenciones && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaActualizarSriRetenciones  && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaEliminarSriRetenciones && this.isPermisoEliminarSriRetenciones));
			this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarToolBarSriRetenciones.setVisible(this.isVisibilidadCeldaCancelarSriRetenciones);				
			this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones));			
			this.jMenuItemDuplicarSriRetenciones.setVisible((this.isVisibilidadCeldaDuplicarSriRetenciones && this.isPermisoDuplicarSriRetenciones));			
			this.jMenuItemCopiarSriRetenciones.setVisible((this.isVisibilidadCeldaCopiarSriRetenciones && this.isPermisoCopiarSriRetenciones));			
			this.jMenuItemVerFormSriRetenciones.setVisible((this.isVisibilidadCeldaVerFormSriRetenciones && this.isPermisoVerFormSriRetenciones));			
			this.jMenuItemAbrirOrderBySriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));			
			//this.jMenuItemMostrarOcultarSriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));
			this.jMenuItemDetalleAbrirOrderBySriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));			
			//this.jMenuItemDetalleMostrarOcultarSriRetenciones.setVisible((this.isVisibilidadCeldaOrdenSriRetenciones && this.isPermisoOrdenSriRetenciones));			
			this.jMenuItemNuevoRelacionesSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriRetenciones && this.isPermisoNuevoSriRetenciones));			
			this.jMenuItemNuevoGuardarCambiosSriRetenciones.setVisible((this.isVisibilidadCeldaNuevoSriRetenciones && this.isPermisoNuevoSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));									
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemModificarSriRetenciones.setVisible((this.isVisibilidadCeldaModificarSriRetenciones && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemActualizarSriRetenciones.setVisible((this.isVisibilidadCeldaActualizarSriRetenciones && this.isPermisoActualizarSriRetenciones));	
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemEliminarSriRetenciones.setVisible((this.isVisibilidadCeldaEliminarSriRetenciones && this.isPermisoEliminarSriRetenciones));
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemCancelarSriRetenciones.setVisible(this.isVisibilidadCeldaCancelarSriRetenciones);				
			}
			
			this.jMenuItemGuardarCambiosSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));						
			this.jMenuItemGuardarCambiosTablaSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSriRetenciones=this.jButtonNuevoSriRetenciones.isVisible();
			this.isVisibilidadCeldaDuplicarSriRetenciones=this.jButtonDuplicarSriRetenciones.isVisible();
			this.isVisibilidadCeldaCopiarSriRetenciones=this.jButtonCopiarSriRetenciones.isVisible();
			this.isVisibilidadCeldaVerFormSriRetenciones=this.jButtonVerFormSriRetenciones.isVisible();
			
			this.isVisibilidadCeldaOrdenSriRetenciones=this.jButtonAbrirOrderBySriRetenciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=this.jButtonNuevoRelacionesSriRetenciones.isVisible();
			this.isVisibilidadCeldaModificarSriRetenciones=this.jButtonModificarSriRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.isVisibilidadCeldaActualizarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=this.jButtonGuardarCambiosTablaSriRetenciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSriRetenciones=this.jButtonNuevoToolBarSriRetenciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=this.jButtonNuevoRelacionesToolBarSriRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.isVisibilidadCeldaModificarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarToolBarSriRetenciones.isVisible();
			this.isVisibilidadCeldaActualizarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarToolBarSriRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarToolBarSriRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarToolBarSriRetenciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriRetenciones=this.jButtonGuardarCambiosToolBarSriRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=this.jButtonGuardarCambiosTablaToolBarSriRetenciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSriRetenciones=this.jMenuItemNuevoSriRetenciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=this.jMenuItemNuevoRelacionesSriRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.isVisibilidadCeldaModificarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jMenuItemModificarSriRetenciones.isVisible();
			this.isVisibilidadCeldaActualizarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jMenuItemActualizarSriRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jMenuItemEliminarSriRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarSriRetenciones=this.jInternalFrameDetalleFormSriRetenciones.jMenuItemCancelarSriRetenciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriRetenciones=this.jMenuItemGuardarCambiosSriRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=this.jMenuItemGuardarCambiosTablaSriRetenciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSriRetenciones(Boolean esInicializar) {
		if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
				//if(this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSriRetenciones();
			}
			
			this.inicializarActualizarBindingBotonesManualSriRetenciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSriRetenciones() {
		this.jButtonNuevoSriRetenciones.setVisible(this.isPermisoNuevoSriRetenciones);			
		this.jButtonDuplicarSriRetenciones.setVisible(this.isPermisoDuplicarSriRetenciones);			
		this.jButtonCopiarSriRetenciones.setVisible(this.isPermisoCopiarSriRetenciones);			
		this.jButtonVerFormSriRetenciones.setVisible(this.isPermisoVerFormSriRetenciones);			
		
		this.jButtonAbrirOrderBySriRetenciones.setVisible(this.isPermisoOrdenSriRetenciones);					
		
		this.jButtonNuevoRelacionesSriRetenciones.setVisible(this.isPermisoNuevoSriRetenciones);			
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarSriRetenciones.setVisible(this.isPermisoActualizarSriRetenciones);	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.setVisible(this.isPermisoActualizarSriRetenciones);	
			this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.setVisible(this.isPermisoEliminarSriRetenciones);
			this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.setVisible(this.isVisibilidadCeldaCancelarSriRetenciones);						
			this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.setVisible(this.isPermisoGuardarCambiosSriRetenciones);							
		}
		
		this.jButtonGuardarCambiosTablaSriRetenciones.setVisible(this.isPermisoActualizarSriRetenciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSriRetenciones() {
		this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarSriRetenciones.setVisible(this.isPermisoActualizarSriRetenciones);	
		this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.setVisible(this.isPermisoActualizarSriRetenciones);	
		this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.setVisible(this.isPermisoEliminarSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.setVisible(this.isVisibilidadCeldaCancelarSriRetenciones);							
		this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.setVisible((this.isVisibilidadCeldaGuardarSriRetenciones && this.isPermisoGuardarCambiosSriRetenciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSriRetenciones() {
		if(SriRetencionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSriRetenciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSriRetenciones() {
	}
	
	public void jTableDatosSriRetencionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSriRetenciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sriretenciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSriRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSriRetenciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.sriretencionesLogic.getConnexion());

				if(this.sriretenciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.sriretenciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriRetenciones=(TitledBorder)this.jScrollPanelDatosSriRetenciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSriRetenciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.sriretenciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioSriRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebSriRetenciones(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.sriretencionesLogic.getConnexion());

				if(this.sriretenciones.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.sriretenciones.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriRetenciones=(TitledBorder)this.jScrollPanelDatosSriRetenciones.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderSriRetenciones.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.sriretenciones.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraSriRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebSriRetenciones(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.sriretencionesLogic.getConnexion());

				if(this.sriretenciones.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.sriretenciones.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriRetenciones=(TitledBorder)this.jScrollPanelDatosSriRetenciones.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderSriRetenciones.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.sriretenciones.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.sriretenciones.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_moduloSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnombre_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_modulo like '%"+this.sriretenciones.getnombre_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_comprobanteSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnombre_tipo_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_comprobante like '%"+this.sriretenciones.getnombre_tipo_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.sriretenciones.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.sriretenciones.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_registro_contableSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getfecha_registro_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_registro_contable = '"+Funciones2.getStringPostgresDate(this.sriretenciones.getfecha_registro_contable())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie like '%"+this.sriretenciones.getnumero_serie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_ivaSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.gettotal_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_iva = "+this.sriretenciones.gettotal_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_ivaSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getmonto_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_iva = "+this.sriretenciones.getmonto_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documento_contableSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnumero_documento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento_contable like '%"+this.sriretenciones.getnumero_documento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contable_retencionSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnombre_cuenta_contable_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable_retencion like '%"+this.sriretenciones.getnombre_cuenta_contable_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.sriretenciones.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.sriretenciones.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_benefSriRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.getsriretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sriretenciones==null) {
						this.sriretenciones = new SriRetenciones();
					}

					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);
				}

				if(this.sriretenciones.getnombre_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_benef like '%"+this.sriretenciones.getnombre_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSriRetencionesSriRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriRetenciones(false,false);

			this.getSriRetencionessBusquedaSriRetenciones();

			this.inicializarActualizarBindingSriRetenciones(false);

			//if(SriRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioSriRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriRetenciones(false,false);

			this.getSriRetencionessFK_IdEjercicio();

			this.inicializarActualizarBindingSriRetenciones(false);

			//if(SriRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSriRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriRetenciones(false,false);

			this.getSriRetencionessFK_IdEmpresa();

			this.inicializarActualizarBindingSriRetenciones(false);

			//if(SriRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraSriRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriRetenciones(false,false);

			this.getSriRetencionessFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingSriRetenciones(false);

			//if(SriRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sriretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSriRetenciones() {
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
			this.jInternalFrameDetalleFormSriRetenciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormSriRetenciones.dispose();
			this.jInternalFrameDetalleFormSriRetenciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
			this.jInternalFrameReporteDinamicoSriRetenciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSriRetenciones.dispose();
			this.jInternalFrameReporteDinamicoSriRetenciones=null;
		}
		
		if(this.jInternalFrameImportacionSriRetenciones!=null) {
			this.jInternalFrameImportacionSriRetenciones.setVisible(false);	    			
			this.jInternalFrameImportacionSriRetenciones.dispose();
			this.jInternalFrameImportacionSriRetenciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSriRetenciones();
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSriRetenciones")) {
				jButtonDuplicarSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSriRetenciones")) {
				jButtonCopiarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormSriRetenciones")) {
				jButtonVerFormSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSriRetenciones")) {
				jButtonDuplicarSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSriRetenciones")) {
				jButtonDuplicarSriRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSriRetenciones")) {
				jButtonModificarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSriRetenciones")) {
				jButtonModificarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSriRetenciones")) {
				jButtonModificarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSriRetenciones")) {
				jButtonActualizarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSriRetenciones")) {
				jButtonActualizarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSriRetenciones")) {
				jButtonActualizarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarSriRetenciones")) {
				jButtonEliminarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSriRetenciones")) {
				jButtonEliminarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSriRetenciones")) {
				jButtonEliminarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarSriRetenciones")) {
				jButtonCancelarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSriRetenciones")) {
				jButtonCancelarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSriRetenciones")) {
				jButtonCancelarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarSriRetenciones")) {
				jButtonCerrarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSriRetenciones")) {
				jButtonCerrarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSriRetenciones")) {
				jButtonCerrarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSriRetenciones")) {
				jButtonMostrarOcultarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSriRetenciones")) {
				jButtonCancelarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSriRetenciones")) {
				jButtonCopiarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSriRetenciones")) {
				jButtonVerFormSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSriRetenciones")) {
				jButtonCopiarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSriRetenciones")) {
				jButtonVerFormSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSriRetenciones")) {
				jButtonRecargarInformacionSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSriRetenciones")) {
				jButtonRecargarInformacionSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSriRetenciones")) {
				jButtonRecargarInformacionSriRetencionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSriRetenciones")) {
				jButtonAnterioresSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSriRetenciones")) {
				jButtonAnterioresSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSriRetenciones")) {
				jButtonAnterioresSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSriRetenciones")) {
				jButtonSiguientesSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSriRetenciones")) {
				jButtonSiguientesSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSriRetenciones")) {
				jButtonSiguientesSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySriRetenciones") || sTipo.equals("MenuItemDetalleAbrirOrderBySriRetenciones")) {
				jButtonAbrirOrderBySriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSriRetenciones") || sTipo.equals("MenuItemDetalleMostrarOcultarSriRetenciones")) {
				jButtonMostrarOcultarSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSriRetenciones")) {
				jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSriRetenciones")) {
				jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSriRetenciones")) {
				jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSriRetenciones")) {
				jButtonCerrarReporteDinamicoSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSriRetenciones")) {
				jButtonGenerarReporteDinamicoSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSriRetenciones")) {
				
				jButtonGenerarExcelReporteDinamicoSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSriRetenciones")) {
				jButtonCerrarImportacionSriRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSriRetenciones")) {
				
				jButtonGenerarImportacionSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSriRetenciones")) {
				
				jButtonAbrirImportacionSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSriRetenciones")) {
				jComboBoxTiposAccionesSriRetencionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSriRetenciones")) {
				jComboBoxTiposRelacionesSriRetencionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSriRetenciones")) {
				jComboBoxTiposAccionesSriRetencionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSriRetenciones")) {
				
				jComboBoxTiposSeleccionarSriRetencionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSriRetenciones")) {
				jTextFieldValorCampoGeneralSriRetencionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySriRetenciones")) {
				jButtonAbrirOrderBySriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSriRetenciones")) {
				jButtonAbrirOrderBySriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySriRetenciones")) {
				jButtonCerrarOrderBySriRetencionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriRetencionesBusqueda")) {
				this.jButtonidSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriRetencionesUpdate")) {
				this.jButtonid_empresaSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriRetencionesBusqueda")) {
				this.jButtonid_empresaSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSriRetencionesUpdate")) {
				this.jButtonid_ejercicioSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSriRetencionesBusqueda")) {
				this.jButtonid_ejercicioSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriRetencionesUpdate")) {
				this.jButtonid_periodo_declaraSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriRetencionesBusqueda")) {
				this.jButtonid_periodo_declaraSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriRetencionesBusqueda")) {
				this.jButtonrucSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloSriRetencionesBusqueda")) {
				this.jButtonnombre_moduloSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriRetencionesBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriRetencionesBusqueda")) {
				this.jButtonnumero_documentoSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriRetencionesBusqueda")) {
				this.jButtonfecha_emisionSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriRetencionesBusqueda")) {
				this.jButtonfecha_registro_contableSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriRetencionesBusqueda")) {
				this.jButtonnumero_serieSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriRetencionesBusqueda")) {
				this.jButtontotal_ivaSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaSriRetencionesBusqueda")) {
				this.jButtonmonto_ivaSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documento_contableSriRetencionesBusqueda")) {
				this.jButtonnumero_documento_contableSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionSriRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeSriRetencionesBusqueda")) {
				this.jButtonporcentajeSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorSriRetencionesBusqueda")) {
				this.jButtonvalorSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefSriRetencionesBusqueda")) {
				this.jButtonnombre_benefSriRetencionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSriRetencionesSriRetenciones")) {
				this.jButtonBusquedaSriRetencionesSriRetencionesActionPerformed(evt);
			}
			
			;
			
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSriRetenciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SriRetenciones sriretencionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				sriretencionesLocal=this.sriretenciones;
			} else {
				sriretencionesLocal=this.sriretencionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
							
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
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
			
			


			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
								
						
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
								
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
							
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
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
			
			


			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
								
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSriRetenciones")) {
					jCheckBoxSeleccionarTodosSriRetencionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSriRetenciones")) {
					jCheckBoxSeleccionadosSriRetencionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSriRetenciones")) {
					
				}
				
				


				
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
												
				
				


				
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
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
			
			


			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriRetencionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sriretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sriretenciones);
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
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
				
				


				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriRetenciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sriretencionesAnterior =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSriRetenciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSriRetencionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSriRetenciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sriretenciones =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sriretenciones =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sriretenciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSriRetenciones")) {
				
				}
				
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSriRetenciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSriRetenciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSriRetenciones")) {
			
			}
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSriRetenciones();
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			if(sTipo.equals("NuevoSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSriRetenciones")) {
				jButtonDuplicarSriRetencionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSriRetenciones")) {
				jButtonCopiarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSriRetenciones")) {
				jButtonVerFormSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSriRetenciones")) {
				jButtonNuevoSriRetencionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSriRetenciones")) {
				jButtonModificarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSriRetenciones")) {
				jButtonActualizarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSriRetenciones")) {
				jButtonEliminarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSriRetenciones")) {
				jButtonCancelarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSriRetenciones")) {
				jButtonCerrarSriRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSriRetenciones")) {
				jButtonGuardarCambiosSriRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSriRetenciones")) {
				jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySriRetenciones")) {
				jButtonAbrirOrderBySriRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSriRetenciones")) {
				jButtonRecargarInformacionSriRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSriRetenciones")) {
				jButtonAnterioresSriRetencionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSriRetenciones")) {
				jButtonSiguientesSriRetencionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriRetencionesBusqueda")) {
				this.jButtonidSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriRetencionesUpdate")) {
				this.jButtonid_empresaSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriRetencionesBusqueda")) {
				this.jButtonid_empresaSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSriRetencionesUpdate")) {
				this.jButtonid_ejercicioSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSriRetencionesBusqueda")) {
				this.jButtonid_ejercicioSriRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraSriRetencionesUpdate")) {
				this.jButtonid_periodo_declaraSriRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraSriRetencionesBusqueda")) {
				this.jButtonid_periodo_declaraSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriRetencionesBusqueda")) {
				this.jButtonrucSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloSriRetencionesBusqueda")) {
				this.jButtonnombre_moduloSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_comprobanteSriRetencionesBusqueda")) {
				this.jButtonnombre_tipo_comprobanteSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoSriRetencionesBusqueda")) {
				this.jButtonnumero_documentoSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriRetencionesBusqueda")) {
				this.jButtonfecha_emisionSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_registro_contableSriRetencionesBusqueda")) {
				this.jButtonfecha_registro_contableSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieSriRetencionesBusqueda")) {
				this.jButtonnumero_serieSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_ivaSriRetencionesBusqueda")) {
				this.jButtontotal_ivaSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaSriRetencionesBusqueda")) {
				this.jButtonmonto_ivaSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documento_contableSriRetencionesBusqueda")) {
				this.jButtonnumero_documento_contableSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionSriRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeSriRetencionesBusqueda")) {
				this.jButtonporcentajeSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorSriRetencionesBusqueda")) {
				this.jButtonvalorSriRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefSriRetencionesBusqueda")) {
				this.jButtonnombre_benefSriRetencionesBusquedaActionPerformed(evt);
			}
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSriRetenciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSriRetenciones")) {
				closingInternalFrameSriRetenciones();
				
			} else if(sTipo.equals("jButtonCancelarSriRetenciones")) {
				JInternalFrameBase jInternalFrameDetalleFormSriRetenciones = (JInternalFrameBase)evt.getSource();
	            	
	            SriRetencionesBeanSwingJInternalFrame jInternalFrameParent=(SriRetencionesBeanSwingJInternalFrame)jInternalFrameDetalleFormSriRetenciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSriRetencionesActionPerformed(null);
			}
			
			SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sriretenciones,new Object(),this.sriretencionesParameterGeneral,this.sriretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSriRetenciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSriRetenciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSriRetenciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sriretenciones)) {
			if(!esControlTabla) {
				if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);			
				}
				
				if(this.sriretencionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSriRetenciones(this.sriretenciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSriRetenciones(this.sriretencionesReturnGeneral,this.sriretencionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sriretencionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSriRetenciones(classes,this.sriretencionesReturnGeneral,this.sriretencionesBean,false);
					}
						
					if(this.sriretencionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones());	
					}
						
					if(this.sriretencionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSriRetenciones(this.sriretencionesReturnGeneral.getSriRetenciones(),classes);//this.sriretencionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSriRetenciones(this.sriretenciones,classes);//this.sriretencionesBean);									
				}
			
				if(SriRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSriRetenciones(this.sriretenciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriRetenciones(this.sriretenciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sriretencionesAnterior!=null) {
						this.sriretenciones=this.sriretencionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sriretencionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sriretencionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sriretencionesReturnGeneral.getSriRetenciones(),sriretencionesLogic.getSriRetencioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sriretencionesReturnGeneral.getSriRetenciones(),this.sriretencioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSriRetenciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosSriRetenciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSriRetenciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosSriRetenciones() throws Exception {
		
		SriRetencionesModel sriretencionesModel=(SriRetencionesModel)this.jTableDatosSriRetenciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sriretencionesModel.sriretencioness=this.sriretencionesLogic.getSriRetencioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sriretencionesModel.sriretencioness=this.sriretencioness;
		}
		
		
		((SriRetencionesModel) this.jTableDatosSriRetenciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSriRetenciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsriretencionesAnterior(),this.sriretencionesLogic.getSriRetencioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsriretencionesAnterior(),this.sriretencioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSriRetenciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSriRetenciones(SriRetenciones sriretenciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
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
										
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sriretenciones,new Object(),generalEntityParameterGeneral,this.sriretencionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SriRetencionesConstantesFunciones.getClassesRelationshipsOfSriRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SriRetencionesConstantesFunciones.getClassesRelationshipsFromStringsOfSriRetenciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSriRetenciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SriRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sriretenciones,new Object(),generalEntityParameterGeneral,this.sriretencionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSriRetenciones(SriRetencionesBean sriretencionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSriRetenciones(ArrayList<Classe> classes,SriRetencionesReturnGeneral sriretencionesReturnGeneral,SriRetencionesBean sriretencionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSriRetenciones(SriRetenciones sriretenciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sriretenciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSriRetenciones = new SriRetencionesDetalleFormJInternalFrame(jDesktopPane,this.sriretencionesSessionBean.getConGuardarRelaciones(),this.sriretencionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.setVisible(false);
		this.jInternalFrameDetalleFormSriRetenciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormSriRetenciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSriRetenciones.sriretencionesLogic=this.sriretencionesLogic;
		
		this.cargarCombosFrameForeignKeySriRetenciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSriRetenciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriRetenciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySriRetenciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySriRetenciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSriRetenciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriRetenciones"));
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarSriRetenciones.addActionListener(new ButtonActionListener(this,"ModificarSriRetenciones"));

		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriRetenciones"));
					
		this.jInternalFrameDetalleFormSriRetenciones.jMenuItemModificarSriRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.addActionListener (new ButtonActionListener(this,"ActualizarSriRetenciones"));
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriRetenciones"));
						
		this.jInternalFrameDetalleFormSriRetenciones.jMenuItemActualizarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.addActionListener (new ButtonActionListener(this,"EliminarSriRetenciones"));
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriRetenciones"));
								
		this.jInternalFrameDetalleFormSriRetenciones.jMenuItemEliminarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.addActionListener (new ButtonActionListener(this,"CancelarSriRetenciones"));
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriRetenciones"));
					
		this.jInternalFrameDetalleFormSriRetenciones.jMenuItemCancelarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriRetenciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jMenuItemDetalleCerrarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriRetenciones"));
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriRetenciones"));
		
		
		
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriRetenciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonidSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonrucSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"rucSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_moduloSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documentoSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_emisionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_registro_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_serieSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtontotal_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonmonto_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documento_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonporcentajeSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonvalorSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_benefSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefSriRetencionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriRetenciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSriRetenciones"));
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriRetenciones"));
		}
		
		this.jTableDatosSriRetenciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSriRetenciones"));
		
		this.jTableDatosSriRetenciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSriRetenciones"));
		
		this.jButtonNuevoSriRetenciones.addActionListener(new ButtonActionListener(this,"NuevoSriRetenciones"));
		
		this.jButtonDuplicarSriRetenciones.addActionListener(new ButtonActionListener(this,"DuplicarSriRetenciones"));
		
		this.jButtonCopiarSriRetenciones.addActionListener(new ButtonActionListener(this,"CopiarSriRetenciones"));
		
		this.jButtonVerFormSriRetenciones.addActionListener(new ButtonActionListener(this,"VerFormSriRetenciones"));
		
		
		this.jButtonNuevoToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarSriRetenciones"));
			
		this.jButtonDuplicarToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSriRetenciones"));
			
		this.jMenuItemNuevoSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSriRetenciones"));
			
		this.jMenuItemDuplicarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSriRetenciones"));		
		
		
		this.jButtonNuevoRelacionesSriRetenciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSriRetenciones"));
		
		
		this.jButtonNuevoRelacionesToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSriRetenciones"));
			
		this.jMenuItemNuevoRelacionesSriRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSriRetenciones"));		
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarSriRetenciones.addActionListener(new ButtonActionListener(this,"ModificarSriRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonModificarToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriRetenciones"));
			
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemModificarSriRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarSriRetenciones.addActionListener (new ButtonActionListener(this,"ActualizarSriRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonActualizarToolBarSriRetenciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriRetenciones"));
				
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemActualizarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarSriRetenciones.addActionListener (new ButtonActionListener(this,"EliminarSriRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonEliminarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriRetenciones"));
						
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemEliminarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarSriRetenciones.addActionListener (new ButtonActionListener(this,"CancelarSriRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonCancelarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriRetenciones"));
			
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemCancelarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriRetenciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSriRetenciones"));		
		
		
		this.jButtonCerrarSriRetenciones.addActionListener (new ButtonActionListener(this,"CerrarSriRetenciones"));
		
		
		this.jButtonCerrarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarSriRetenciones"));
			
		this.jMenuItemCerrarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSriRetenciones"));
			
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jMenuItemDetalleCerrarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosSriRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriRetenciones"));
		}
		
		this.jButtonCopiarToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarSriRetenciones"));
			
		this.jButtonVerFormToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarSriRetenciones"));
		
		this.jMenuItemGuardarCambiosSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSriRetenciones"));
			
		this.jMenuItemCopiarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSriRetenciones"));		
		
		this.jMenuItemVerFormSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSriRetenciones"));		
		
		
		this.jButtonGuardarCambiosTablaSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriRetenciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSriRetenciones"));
			
		this.jMenuItemGuardarCambiosTablaSriRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriRetenciones"));		
		
		
		
		this.jButtonRecargarInformacionSriRetenciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionSriRetenciones"));
					
		this.jButtonRecargarInformacionToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSriRetenciones"));
		
		this.jMenuItemRecargarInformacionSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSriRetenciones"));		
		
		
		
		this.jButtonAnterioresSriRetenciones.addActionListener (new ButtonActionListener(this,"AnterioresSriRetenciones"));
		
		
		this.jButtonAnterioresToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSriRetenciones"));
		
		this.jMenuItemAnterioresSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSriRetenciones"));		
		
		
		this.jButtonSiguientesSriRetenciones.addActionListener (new ButtonActionListener(this,"SiguientesSriRetenciones"));
		
		
		this.jButtonSiguientesToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSriRetenciones"));
			
		this.jMenuItemSiguientesSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSriRetenciones"));
			
		this.jMenuItemAbrirOrderBySriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySriRetenciones"));
			
		this.jMenuItemMostrarOcultarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSriRetenciones"));
			
		this.jMenuItemDetalleAbrirOrderBySriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySriRetenciones"));
			
		this.jMenuItemDetalleMostarOcultarSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSriRetenciones"));		
		
		
		this.jButtonNuevoGuardarCambiosSriRetenciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSriRetenciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSriRetenciones"));
			
		this.jMenuItemNuevoGuardarCambiosSriRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSriRetenciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSriRetenciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSriRetenciones"));

		this.jCheckBoxSeleccionadosSriRetenciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSriRetenciones"));
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriRetenciones"));
		}
		
		
		this.jComboBoxTiposRelacionesSriRetenciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesSriRetenciones"));
			
		this.jComboBoxTiposAccionesSriRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesSriRetenciones"));
					
		this.jComboBoxTiposSeleccionarSriRetenciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSriRetenciones"));
			
		this.jTextFieldValorCampoGeneralSriRetenciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSriRetenciones"));		
		
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonidSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonrucSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"rucSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_moduloSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documentoSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_emisionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_registro_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_serieSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtontotal_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonmonto_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documento_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonporcentajeSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonvalorSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_benefSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefSriRetencionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSriRetencionesSriRetenciones.addActionListener(new ButtonActionListener(this,"BusquedaSriRetencionesSriRetenciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSriRetenciones!=null) {
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriRetenciones"));
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriRetenciones"));
				this.jInternalFrameReporteDinamicoSriRetenciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriRetenciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoSriRetenciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriRetenciones"));				
			//this.jButtonGenerarReporteDinamicoSriRetenciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriRetenciones"));
			//this.jButtonGenerarExcelReporteDinamicoSriRetenciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriRetenciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSriRetenciones!=null) {
				this.jInternalFrameImportacionSriRetenciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriRetenciones"));
				this.jInternalFrameImportacionSriRetenciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriRetenciones"));
				this.jInternalFrameImportacionSriRetenciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriRetenciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySriRetenciones.addActionListener (new ButtonActionListener(this,"AbrirOrderBySriRetenciones"));
			
			this.jButtonAbrirOrderByToolBarSriRetenciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSriRetenciones"));			
			
			if(this.jInternalFrameOrderBySriRetenciones!=null) {
				this.jInternalFrameOrderBySriRetenciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriRetenciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriRetenciones.jTabbedPaneRelacionesSriRetenciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriRetenciones"));
		
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
            		closingInternalFrameSriRetenciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSriRetenciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSriRetenciones = (JInternalFrameBase)event.getSource();
	            	
	            SriRetencionesBeanSwingJInternalFrame jInternalFrameParent=(SriRetencionesBeanSwingJInternalFrame)jInternalFrameDetalleFormSriRetenciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSriRetencionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSriRetenciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSriRetencionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSriRetenciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSriRetenciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSriRetenciones";
		inputMap = this.jButtonNuevoSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriRetencionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSriRetenciones";
		inputMap = this.jButtonNuevoRelacionesSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriRetencionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSriRetenciones";
		inputMap = this.jButtonModificarSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSriRetenciones";
		inputMap = this.jButtonActualizarSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSriRetenciones";
		inputMap = this.jButtonEliminarSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSriRetenciones";
		inputMap = this.jButtonCancelarSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSriRetenciones";
		inputMap = this.jButtonCerrarSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSriRetenciones";
		inputMap = this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSriRetenciones.jButtonGuardarCambiosSriRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSriRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSriRetenciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSriRetencionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSriRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSriRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSriRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSriRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSriRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSriRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonidSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_empresaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_ejercicioSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSriRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonid_periodo_declaraSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonrucSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"rucSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_moduloSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_comprobanteSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documentoSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_emisionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonfecha_registro_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_registro_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_serieSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtontotal_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"total_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonmonto_ivaSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnumero_documento_contableSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_documento_contableSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonporcentajeSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonvalorSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorSriRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriRetenciones.jButtonnombre_benefSriRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefSriRetencionesBusqueda"));
		
		
		this.jButtonBusquedaSriRetencionesSriRetenciones.addActionListener(new ButtonActionListener(this,"BusquedaSriRetencionesSriRetenciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSriRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSriRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSriRetencionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSriRetenciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSriRetenciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
					sriretencionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriRetenciones sriretencionesAux:sriretencioness) {
					sriretencionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSriRetencionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
						sriretencionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriRetenciones sriretencionesAux:sriretencioness) {
						sriretencionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriRetenciones sriretencionesAux:sriretencioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSriRetenciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriRetenciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriRetenciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSriRetencionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSriRetenciones.getSelectedRows();
			
			SriRetenciones sriretencionesLocal=new SriRetenciones();
			
			//this.seleccionarTodosSriRetenciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sriretencionesLocal =(SriRetenciones) this.sriretencionesLogic.getSriRetencioness().toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sriretencionesLocal =(SriRetenciones) this.sriretencioness.toArray()[this.jTableDatosSriRetenciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sriretencionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
						sriretencionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriRetenciones sriretencionesAux:sriretencioness) {
						sriretencionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSriRetenciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriRetenciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriRetenciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriRetenciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSriRetencionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSriRetencionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSriRetencionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSriRetenciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriRetenciones sriretencionesAux:this.sriretencionesLogic.getSriRetencioness()) {
				
						if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sriretencionesAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							sriretencionesAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sriretencionesAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sriretencionesAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sriretencionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sriretencionesAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sriretencionesAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sriretencionesAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							sriretencionesAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
							existe=true;
							sriretencionesAux.setnumero_documento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							sriretencionesAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							sriretencionesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							sriretencionesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							sriretencionesAux.setnombre_benef(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriRetenciones sriretencionesAux:sriretencioness) {
					
						if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sriretencionesAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							sriretencionesAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
							existe=true;
							sriretencionesAux.setnombre_tipo_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							sriretencionesAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							sriretencionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
							existe=true;
							sriretencionesAux.setfecha_registro_contable(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							sriretencionesAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_TOTALIVA)) {
							existe=true;
							sriretencionesAux.settotal_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							sriretencionesAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
							existe=true;
							sriretencionesAux.setnumero_documento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							sriretencionesAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							sriretencionesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							sriretencionesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							sriretencionesAux.setnombre_benef(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSriRetenciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSriRetencionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSriRetenciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSriRetenciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSriRetenciones) {				
					conSplash=true;//false;										
					
					//this.startProcessSriRetenciones(conSplash);
				
					this.generarReporteSriRetencionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSriRetencionessSeleccionados();
				//this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriRetencionessSeleccionados(false);
				//this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriRetencionessSeleccionados(true);
				//this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriRetenciones();
				
				this.exportarSriRetencionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSriRetencioness();
				//this.importarSriRetencioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriRetenciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSriRetencionessSeleccionados();
				//this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sri Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSriRetenciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSriRetenciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySriRetenciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
				}	
			} 			
			else if(SriRetencionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSriRetenciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSriRetenciones(conSplash);
					
						//this.actualizarParametrosGeneralSriRetenciones();
						
						this.generarReporteProcesoAccionSriRetencionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SriRetencionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sri RetencionesES SELECCIONADOS?", "MANTENIMIENTO DE Sri Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSriRetenciones();
				
						this.actualizarParametrosGeneralSriRetenciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sriretencionesReturnGeneral=sriretencionesLogic.procesarAccionSriRetencionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sriretencionesLogic.getSriRetencioness(),this.sriretencionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSriRetencionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSriRetenciones();
					
					SriRetencionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSriRetencionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriRetenciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriRetenciones.jComboBoxTiposAccionesFormularioSriRetenciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSriRetenciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSriRetencionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSriRetenciones();
			
			if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
			SriRetenciones sriretenciones=new SriRetenciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSriRetenciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSriRetenciones.getSelectedItem();
			
			
			
			
			sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(sriretencionessSeleccionados.size()==1) {
				for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
					sriretenciones=sriretencionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSriRetenciones();
			
      		//this.finishProcessSriRetenciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSriRetencionesReturnGeneral() throws Exception {
		if(this.sriretencionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sriretencionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sriretencionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sriretencionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sriretencionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sriretencionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSriRetenciones(false);
		}
		
		if(this.sriretencionesReturnGeneral.getConRetornoLista() || this.sriretencionesReturnGeneral.getConRetornoObjeto()) {
			if(this.sriretencionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sriretencionesLogic.setSriRetencioness(this.sriretencionesReturnGeneral.getSriRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSriRetenciones(false);
		}
	}
	
	public void actualizarParametrosGeneralSriRetenciones() throws Exception {
		
		
	}
	
	public ArrayList<SriRetenciones> getSriRetencionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSriRetenciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SriRetenciones sriretencionesAux:sriretencionesLogic.getSriRetencioness()) {
					if(sriretencionesAux.getIsSelected()) {
						sriretencionessSeleccionados.add(sriretencionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriRetenciones sriretencionesAux:this.sriretencioness) {
					if(sriretencionesAux.getIsSelected()) {
						sriretencionessSeleccionados.add(sriretencionesAux);				
					}
				}
			}
			
			if(sriretencionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sriretencionessSeleccionados.addAll(this.sriretencionesLogic.getSriRetencioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sriretencionessSeleccionados.addAll(this.sriretencioness);				
					}
				}
			}
		} else {
			sriretencionessSeleccionados.add(this.sriretenciones);
		}
		
		return sriretencionessSeleccionados;
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
	
	public void generarReporteSriRetencionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSriRetencionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSriRetencionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriRetencionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriRetencionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sri Retenciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados);
		
	}	
	
	public void generarReporteNormalSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSriRetencionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSriRetenciones();
		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSriRetenciones();
		
		
		//this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados ,sriretencionesImplementable,sriretencionesImplementableHome);
	}
	
	public void mostrarImportacionSriRetencioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSriRetenciones();
		
		this.abrirFrameImportacionSriRetenciones();		
		
			
		//this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados ,sriretencionesImplementable,sriretencionesImplementableHome);
	}
	
	public void importarSriRetencioness() throws Exception {		
	
	}
	
	public void exportarSriRetencionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSriRetencionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSriRetencionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSriRetencionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sri Retenciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSriRetenciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSriRetenciones(sriretencionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sriretencionesAux.setsDetalleGeneralEntityReporte(sriretencionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSriRetenciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_TOTALIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_MONTOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSriRetenciones(SriRetenciones sriretenciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sriretenciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnombre_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnombre_tipo_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getfecha_registro_contable().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnumero_serie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.gettotal_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getmonto_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnumero_documento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnombre_cuenta_contable_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sriretenciones.getnombre_benef();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SriRetencioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSriRetenciones(row);				
				iRow++;
			}				
			
			for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSriRetenciones(sriretencionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSriRetencionessSeleccionados() throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();		
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sriretenciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sriretencioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sriretenciones");
			//elementRoot.appendChild(element);
		
			for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
				element = document.createElement("sriretenciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSriRetenciones(sriretencionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSriRetenciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_TOTALIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_MONTOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSriRetenciones(SriRetenciones sriretenciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnombre_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnombre_tipo_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getfecha_registro_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.gettotal_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getmonto_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnumero_documento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnombre_cuenta_contable_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(sriretenciones.getnombre_benef());				
	}
	
	public void setFilaDatosExportarXmlSriRetenciones(SriRetenciones sriretenciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SriRetencionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sriretenciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SriRetencionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sriretenciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SriRetencionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(sriretenciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(SriRetencionesConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(sriretenciones.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiododeclara_descripcion = document.createElement(SriRetencionesConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(sriretenciones.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementruc = document.createElement(SriRetencionesConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(sriretenciones.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_modulo = document.createElement(SriRetencionesConstantesFunciones.NOMBREMODULO);
		elementnombre_modulo.appendChild(document.createTextNode(sriretenciones.getnombre_modulo().trim()));
		element.appendChild(elementnombre_modulo);

		Element elementnombre_tipo_comprobante = document.createElement(SriRetencionesConstantesFunciones.NOMBRETIPOCOMPROBANTE);
		elementnombre_tipo_comprobante.appendChild(document.createTextNode(sriretenciones.getnombre_tipo_comprobante().trim()));
		element.appendChild(elementnombre_tipo_comprobante);

		Element elementnumero_documento = document.createElement(SriRetencionesConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(sriretenciones.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementfecha_emision = document.createElement(SriRetencionesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(sriretenciones.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_registro_contable = document.createElement(SriRetencionesConstantesFunciones.FECHAREGISTROCONTABLE);
		elementfecha_registro_contable.appendChild(document.createTextNode(sriretenciones.getfecha_registro_contable().toString().trim()));
		element.appendChild(elementfecha_registro_contable);

		Element elementnumero_serie = document.createElement(SriRetencionesConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(sriretenciones.getnumero_serie().trim()));
		element.appendChild(elementnumero_serie);

		Element elementtotal_iva = document.createElement(SriRetencionesConstantesFunciones.TOTALIVA);
		elementtotal_iva.appendChild(document.createTextNode(sriretenciones.gettotal_iva().toString().trim()));
		element.appendChild(elementtotal_iva);

		Element elementmonto_iva = document.createElement(SriRetencionesConstantesFunciones.MONTOIVA);
		elementmonto_iva.appendChild(document.createTextNode(sriretenciones.getmonto_iva().toString().trim()));
		element.appendChild(elementmonto_iva);

		Element elementnumero_documento_contable = document.createElement(SriRetencionesConstantesFunciones.NUMERODOCUMENTOCONTABLE);
		elementnumero_documento_contable.appendChild(document.createTextNode(sriretenciones.getnumero_documento_contable().trim()));
		element.appendChild(elementnumero_documento_contable);

		Element elementnombre_cuenta_contable_retencion = document.createElement(SriRetencionesConstantesFunciones.NOMBRECUENTACONTABLERETENCION);
		elementnombre_cuenta_contable_retencion.appendChild(document.createTextNode(sriretenciones.getnombre_cuenta_contable_retencion().trim()));
		element.appendChild(elementnombre_cuenta_contable_retencion);

		Element elementporcentaje = document.createElement(SriRetencionesConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(sriretenciones.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(SriRetencionesConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(sriretenciones.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnombre_benef = document.createElement(SriRetencionesConstantesFunciones.NOMBREBENEF);
		elementnombre_benef.appendChild(document.createTextNode(sriretenciones.getnombre_benef().trim()));
		element.appendChild(elementnombre_benef);
	}
	
	public void generarReporteGroupGenericoSriRetencionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SriRetenciones> sriretencionessSeleccionados=new ArrayList<SriRetenciones>();
		
		sriretencionessSeleccionados=this.getSriRetencionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSriRetenciones(sriretencionessSeleccionados);
		
		this.generarReporteSriRetencioness("Todos",sriretencionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSriRetenciones(ArrayList<SriRetenciones> sriretencionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SriRetenciones sriretencionesAux:sriretencionessSeleccionados) {
				sriretencionesAux.setsDetalleGeneralEntityReporte(sriretencionesAux.toString());
			
				if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_RUC)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnombre_modulo());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnombre_tipo_comprobante());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sriretencionesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(sriretencionesAux.getfecha_registro_contable()));
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnumero_serie());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnumero_documento_contable());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnombre_cuenta_contable_retencion());
				}
				 else if(sTipoSeleccionar.equals(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
					existe=true;
					sriretencionesAux.setsDescripcionGeneralEntityReporte1(sriretencionesAux.getnombre_benef());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSriRetenciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSriRetenciones=true;
				this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=true;
				this.isVisibilidadCeldaGuardarCambiosSriRetenciones=true;
			}
			
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=true;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=true;
			this.isVisibilidadCeldaEliminarSriRetenciones=true;
			this.isVisibilidadCeldaCancelarSriRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=true;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSriRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=true;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=true;
			this.isVisibilidadCeldaModificarSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
			this.isVisibilidadCeldaModificarSriRetenciones=true;
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
			this.isVisibilidadCeldaCancelarSriRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarSriRetenciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SriRetencionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSriRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=true;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=true;
		} else {
			this.actualizarEstadoPanelsSriRetenciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSriRetenciones=false;
			//this.isVisibilidadCeldaVerFormSriRetenciones=false;
			this.isVisibilidadCeldaDuplicarSriRetenciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sriretencionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
		} else {
			this.isVisibilidadCeldaNuevoSriRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sriretencionesSessionBean.getEsGuardarRelacionado()) {
			if(!sriretencionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;												
			}
			
			this.jButtonCerrarSriRetenciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
		}
		
		if(!this.permiteMantenimiento(this.sriretenciones)) {
			this.isVisibilidadCeldaActualizarSriRetenciones=false;
			this.isVisibilidadCeldaEliminarSriRetenciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSriRetenciones=false;
		this.isVisibilidadCeldaNuevoRelacionesSriRetenciones=false;
		this.isVisibilidadCeldaGuardarCambiosSriRetenciones=false;
		//this.isVisibilidadCeldaModificarSriRetenciones=true;
		this.isVisibilidadCeldaActualizarSriRetenciones=false;
		this.isVisibilidadCeldaEliminarSriRetenciones=false;
		//this.isVisibilidadCeldaCancelarSriRetenciones=true;			
		this.isVisibilidadCeldaGuardarSriRetenciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSriRetenciones() {
	}
	
	public void actualizarEstadoPanelsSriRetenciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSriRetenciones!=null) {
				this.jScrollPanelDatosEdicionSriRetenciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriRetenciones!=null) {
				this.jScrollPanelDatosSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriRetenciones!=null) {
				this.jPanelPaginacionSriRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
					this.jTabbedPaneBusquedasSriRetenciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriRetenciones!=null) {
				this.jTabbedPaneBusquedasSriRetenciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSriRetenciones!=null) {
				this.jPanelParametrosReportesSriRetenciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSriRetenciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSriRetenciones) {this.jTabbedPaneBusquedasSriRetenciones.remove(jPanelBusquedaSriRetencionesSriRetenciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaSriRetenciones=isParaEjercicio;
			if(!this.isVisibilidadBusquedaSriRetenciones) {this.jTabbedPaneBusquedasSriRetenciones.remove(jPanelBusquedaSriRetencionesSriRetenciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadBusquedaSriRetenciones=isParaPeriodoDeclara;
			if(!this.isVisibilidadBusquedaSriRetenciones) {this.jTabbedPaneBusquedasSriRetenciones.remove(jPanelBusquedaSriRetencionesSriRetenciones);}
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
			
			this.inicializarActualizarBindingTablaSriRetenciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSriRetenciones() {
		this.updateBorderResaltarBusquedasFormularioSriRetenciones();
		this.updateVisibilidadBusquedasFormularioSriRetenciones();
		this.updateHabilitarBusquedasFormularioSriRetenciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioSriRetenciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSriRetenciones.getComponents().length>0) {
	

		if(this.sriretencionesConstantesFunciones.resaltarBusquedaSriRetencionesSriRetenciones!=null) {
			index= this.jTabbedPaneBusquedasSriRetenciones.indexOfComponent(this.jPanelBusquedaSriRetencionesSriRetenciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriRetenciones.getComponent(index);
				jPanel.setBorder(this.sriretencionesConstantesFunciones.resaltarBusquedaSriRetencionesSriRetenciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSriRetenciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSriRetenciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriRetenciones.indexOfComponent(this.jPanelBusquedaSriRetencionesSriRetenciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSriRetenciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sriretencionesConstantesFunciones.mostrarBusquedaSriRetencionesSriRetenciones);
			if(!this.sriretencionesConstantesFunciones.mostrarBusquedaSriRetencionesSriRetenciones && index>-1) {
				this.jTabbedPaneBusquedasSriRetenciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSriRetenciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSriRetenciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriRetenciones.indexOfComponent(this.jPanelBusquedaSriRetencionesSriRetenciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSriRetenciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sriretencionesConstantesFunciones.activarBusquedaSriRetencionesSriRetenciones);
				this.jTabbedPaneBusquedasSriRetenciones.setEnabledAt(index,this.sriretencionesConstantesFunciones.activarBusquedaSriRetencionesSriRetenciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSriRetenciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSriRetenciones")) {
			index= this.jTabbedPaneBusquedasSriRetenciones.indexOfComponent(this.jPanelBusquedaSriRetencionesSriRetenciones);

			this.jTabbedPaneBusquedasSriRetenciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriRetenciones.getComponent(index);

			this.sriretencionesConstantesFunciones.setResaltarBusquedaSriRetencionesSriRetenciones(resaltar);

			jPanel.setBorder(this.sriretencionesConstantesFunciones.resaltarBusquedaSriRetencionesSriRetenciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSriRetenciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSriRetenciones() throws Exception {

		if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSriRetenciones();
		this.updateVisibilidadResaltarControlesFormularioSriRetenciones();
		this.updateHabilitarResaltarControlesFormularioSriRetenciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioSriRetenciones() throws Exception {
		if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sriretencionesConstantesFunciones.resaltaridSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltaridSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarid_empresaSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarid_empresaSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarid_ejercicioSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarid_ejercicioSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarid_periodo_declaraSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarid_periodo_declaraSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarrucSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldrucSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarrucSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnombre_moduloSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnombre_moduloSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnombre_tipo_comprobanteSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnombre_tipo_comprobanteSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnumero_documentoSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnumero_documentoSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarfecha_emisionSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarfecha_emisionSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarfecha_registro_contableSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarfecha_registro_contableSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnumero_serieSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnumero_serieSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltartotal_ivaSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltartotal_ivaSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarmonto_ivaSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarmonto_ivaSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnumero_documento_contableSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnumero_documento_contableSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarporcentajeSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarporcentajeSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarvalorSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarvalorSriRetenciones);}
		if(this.sriretencionesConstantesFunciones.resaltarnombre_benefSriRetenciones!=null && this.jInternalFrameDetalleFormSriRetenciones!=null) {this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setBorder(this.sriretencionesConstantesFunciones.resaltarnombre_benefSriRetenciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSriRetenciones() throws Exception {		
		if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
	
		//this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostraridSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelidSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostraridSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_empresaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelid_empresaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_empresaSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_ejercicioSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelid_ejercicioSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_ejercicioSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_periodo_declaraSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelid_periodo_declaraSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarid_periodo_declaraSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldrucSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarrucSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelrucSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarrucSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_moduloSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnombre_moduloSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_moduloSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_tipo_comprobanteSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnombre_tipo_comprobanteSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_tipo_comprobanteSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_documentoSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnumero_documentoSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_documentoSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarfecha_emisionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelfecha_emisionSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarfecha_emisionSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarfecha_registro_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelfecha_registro_contableSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarfecha_registro_contableSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_serieSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnumero_serieSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_serieSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrartotal_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPaneltotal_ivaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrartotal_ivaSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarmonto_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelmonto_ivaSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarmonto_ivaSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_documento_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnumero_documento_contableSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnumero_documento_contableSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnombre_cuenta_contable_retencionSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarporcentajeSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelporcentajeSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarporcentajeSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarvalorSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelvalorSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarvalorSriRetenciones);
		//this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_benefSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jPanelnombre_benefSriRetenciones.setVisible(this.sriretencionesConstantesFunciones.mostrarnombre_benefSriRetenciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSriRetenciones() throws Exception {
		if(this.jInternalFrameDetalleFormSriRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriRetenciones!=null) {
	
		this.jInternalFrameDetalleFormSriRetenciones.jLabelidSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activaridSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_empresaSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarid_empresaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_ejercicioSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarid_ejercicioSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jComboBoxid_periodo_declaraSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarid_periodo_declaraSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldrucSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarrucSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_moduloSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnombre_moduloSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_tipo_comprobanteSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnombre_tipo_comprobanteSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documentoSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnumero_documentoSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_emisionSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarfecha_emisionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jDateChooserfecha_registro_contableSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarfecha_registro_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_serieSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnumero_serieSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldtotal_ivaSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activartotal_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldmonto_ivaSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarmonto_ivaSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldnumero_documento_contableSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnumero_documento_contableSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_cuenta_contable_retencionSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldporcentajeSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarporcentajeSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextFieldvalorSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarvalorSriRetenciones);
		this.jInternalFrameDetalleFormSriRetenciones.jTextAreanombre_benefSriRetenciones.setEnabled(this.sriretencionesConstantesFunciones.activarnombre_benefSriRetenciones);
		}
	}
	
		
}