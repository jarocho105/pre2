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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoParamFactuSecuenciaTrabajoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoParamFactuSecuenciaTrabajoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame extends TipoParamFactuSecuenciaTrabajoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajoValidator = new ClassValidator<TipoParamFactuSecuenciaTrabajo>(TipoParamFactuSecuenciaTrabajo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo;	
	public TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux;
	public TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoTotales;
	public Long idTipoParamFactuSecuenciaTrabajoActual;
	public Long iIdNuevoTipoParamFactuSecuenciaTrabajo=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoNuevoTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoActualizarTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoEliminarTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoConsultaTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoBusquedaTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoReporteTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoCopiarTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoVerFormTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoDuplicarTipoParamFactuSecuenciaTrabajo;
	public Boolean isPermisoOrdenTipoParamFactuSecuenciaTrabajo;
	
	
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
	
	public TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoReturnGeneral;
	public TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
	public Boolean esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParamFactuSecuenciaTrabajoSessionBeanAdditional tipoparamfactusecuenciatrabajoSessionBeanAdditional=null;
	
	public TipoParamFactuSecuenciaTrabajoSessionBeanAdditional getTipoParamFactuSecuenciaTrabajoSessionBeanAdditional() {
		return this.tipoparamfactusecuenciatrabajoSessionBeanAdditional;
	}
	
	public void setTipoParamFactuSecuenciaTrabajoSessionBeanAdditional(TipoParamFactuSecuenciaTrabajoSessionBeanAdditional tipoparamfactusecuenciatrabajoSessionBeanAdditional) {
		try {
			this.tipoparamfactusecuenciatrabajoSessionBeanAdditional=tipoparamfactusecuenciatrabajoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional tipoparamfactusecuenciatrabajoBeanSwingJInternalFrameAdditional=null;
	//public class TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame
	
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional getTipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional() {
		return this.tipoparamfactusecuenciatrabajoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional tipoparamfactusecuenciatrabajoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparamfactusecuenciatrabajoBeanSwingJInternalFrameAdditional=tipoparamfactusecuenciatrabajoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParamFactuSecuenciaTrabajoLogic tipoparamfactusecuenciatrabajoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoBean;
	public TipoParamFactuSecuenciaTrabajoConstantesFunciones tipoparamfactusecuenciatrabajoConstantesFunciones;
	//public TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos;	
	//public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosEliminados;
	//public List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo=true;
	public Boolean isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo=true;
	public Boolean isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo=true;
	public Boolean isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=false;
	public Boolean isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoParamFactuSecuenciaTrabajo() {
		return this.iIdNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public void setiIdNuevoTipoParamFactuSecuenciaTrabajo(Long iIdNuevoTipoParamFactuSecuenciaTrabajo) {
		this.iIdNuevoTipoParamFactuSecuenciaTrabajo = iIdNuevoTipoParamFactuSecuenciaTrabajo;
	}
	
	public Long getidTipoParamFactuSecuenciaTrabajoActual() {
		return this.idTipoParamFactuSecuenciaTrabajoActual;
	}

	public void setidTipoParamFactuSecuenciaTrabajoActual(Long idTipoParamFactuSecuenciaTrabajoActual) {
		this.idTipoParamFactuSecuenciaTrabajoActual = idTipoParamFactuSecuenciaTrabajoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParamFactuSecuenciaTrabajo gettipoparamfactusecuenciatrabajo() {
		return this.tipoparamfactusecuenciatrabajo;
	}

	public void settipoparamfactusecuenciatrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) {
		this.tipoparamfactusecuenciatrabajo = tipoparamfactusecuenciatrabajo;
	}
	
	public TipoParamFactuSecuenciaTrabajo gettipoparamfactusecuenciatrabajoAux() {
		return this.tipoparamfactusecuenciatrabajoAux;
	}

	public void settipoparamfactusecuenciatrabajoAux(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux) {
		this.tipoparamfactusecuenciatrabajoAux = tipoparamfactusecuenciatrabajoAux;
	}				
	
	public TipoParamFactuSecuenciaTrabajo gettipoparamfactusecuenciatrabajoAnterior() {
		return this.tipoparamfactusecuenciatrabajoAnterior;
	}

	public void settipoparamfactusecuenciatrabajoAnterior(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAnterior) {
		this.tipoparamfactusecuenciatrabajoAnterior = tipoparamfactusecuenciatrabajoAnterior;
	}	
	
	public TipoParamFactuSecuenciaTrabajo gettipoparamfactusecuenciatrabajoTotales() {
		return this.tipoparamfactusecuenciatrabajoTotales;
	}

	public void settipoparamfactusecuenciatrabajoTotales(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoTotales) {
		this.tipoparamfactusecuenciatrabajoTotales = tipoparamfactusecuenciatrabajoTotales;
	}	
	
	public TipoParamFactuSecuenciaTrabajo gettipoparamfactusecuenciatrabajoBean() {
		return this.tipoparamfactusecuenciatrabajoBean;
	}

	public void settipoparamfactusecuenciatrabajoBean(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoBean) {
		this.tipoparamfactusecuenciatrabajoBean = tipoparamfactusecuenciatrabajoBean;
	}	
	
	public TipoParamFactuSecuenciaTrabajoParameterReturnGeneral gettipoparamfactusecuenciatrabajoReturnGeneral() {
		return this.tipoparamfactusecuenciatrabajoReturnGeneral;
	}

	public void settipoparamfactusecuenciatrabajoReturnGeneral(TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoReturnGeneral) {
		this.tipoparamfactusecuenciatrabajoReturnGeneral = tipoparamfactusecuenciatrabajoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoParamFactuSecuenciaTrabajoLogic getTipoParamFactuSecuenciaTrabajoLogic()	{		
		return tipoparamfactusecuenciatrabajoLogic;
	}

	public void setTipoParamFactuSecuenciaTrabajoLogic(TipoParamFactuSecuenciaTrabajoLogic tipoparamfactusecuenciatrabajoLogic) {
		this.tipoparamfactusecuenciatrabajoLogic = tipoparamfactusecuenciatrabajoLogic;
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
	
	public Boolean getIsEsNuevoTipoParamFactuSecuenciaTrabajo() {
		return isEsNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsEsNuevoTipoParamFactuSecuenciaTrabajo(Boolean isEsNuevoTipoParamFactuSecuenciaTrabajo) {
		this.isEsNuevoTipoParamFactuSecuenciaTrabajo = isEsNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo() {
		return esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo(Boolean esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo) {
		this.esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo = esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoParamFactuSecuenciaTrabajo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(this.tipoparamfactusecuenciatrabajos);
			tipoparamfactusecuenciatrabajoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
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
		
	public TipoParamFactuSecuenciaTrabajoParameterReturnGeneral getTipoParamFactuSecuenciaTrabajoParameterGeneral() {
		return this.tipoparamfactusecuenciatrabajoParameterGeneral;
	}
	
	public void setTipoParamFactuSecuenciaTrabajoParameterGeneral(TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoParameterGeneral) {
		this.tipoparamfactusecuenciatrabajoParameterGeneral = tipoparamfactusecuenciatrabajoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParamFactuSecuenciaTrabajo() {
		return isPermisoTodoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoTodoTipoParamFactuSecuenciaTrabajo(Boolean isPermisoTodoTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoTodoTipoParamFactuSecuenciaTrabajo = isPermisoTodoTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoNuevoTipoParamFactuSecuenciaTrabajo() {
		return isPermisoNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoNuevoTipoParamFactuSecuenciaTrabajo(Boolean isPermisoNuevoTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo = isPermisoNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoActualizarTipoParamFactuSecuenciaTrabajo() {
		return isPermisoActualizarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoActualizarTipoParamFactuSecuenciaTrabajo(Boolean isPermisoActualizarTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo = isPermisoActualizarTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoEliminarTipoParamFactuSecuenciaTrabajo() {
		return isPermisoEliminarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoEliminarTipoParamFactuSecuenciaTrabajo(Boolean isPermisoEliminarTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo = isPermisoEliminarTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo() {
		return isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo(Boolean isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo = isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoConsultaTipoParamFactuSecuenciaTrabajo() {
		return isPermisoConsultaTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoConsultaTipoParamFactuSecuenciaTrabajo(Boolean isPermisoConsultaTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoConsultaTipoParamFactuSecuenciaTrabajo = isPermisoConsultaTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoBusquedaTipoParamFactuSecuenciaTrabajo() {
		return isPermisoBusquedaTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoBusquedaTipoParamFactuSecuenciaTrabajo(Boolean isPermisoBusquedaTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo = isPermisoBusquedaTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsPermisoReporteTipoParamFactuSecuenciaTrabajo() {
		return isPermisoReporteTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoReporteTipoParamFactuSecuenciaTrabajo(Boolean isPermisoReporteTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoReporteTipoParamFactuSecuenciaTrabajo = isPermisoReporteTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo() {
		return isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo(Boolean isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo = isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo() {
		return isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo(Boolean isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo = isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo() {
		return isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo(Boolean isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo = isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoCopiarTipoParamFactuSecuenciaTrabajo() {
		return isPermisoCopiarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoCopiarTipoParamFactuSecuenciaTrabajo(Boolean isPermisoCopiarTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo = isPermisoCopiarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoVerFormTipoParamFactuSecuenciaTrabajo() {
		return isPermisoVerFormTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoVerFormTipoParamFactuSecuenciaTrabajo(Boolean isPermisoVerFormTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo = isPermisoVerFormTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoDuplicarTipoParamFactuSecuenciaTrabajo() {
		return isPermisoDuplicarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoDuplicarTipoParamFactuSecuenciaTrabajo(Boolean isPermisoDuplicarTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo = isPermisoDuplicarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsPermisoOrdenTipoParamFactuSecuenciaTrabajo() {
		return isPermisoOrdenTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsPermisoOrdenTipoParamFactuSecuenciaTrabajo(Boolean isPermisoOrdenTipoParamFactuSecuenciaTrabajo) {
		this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo = isPermisoOrdenTipoParamFactuSecuenciaTrabajo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo() {
		return isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo(Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo) {
		this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo = isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo;
	}
		
	public TipoParamFactuSecuenciaTrabajoSessionBean gettipoparamfactusecuenciatrabajoSessionBean() {
		return this.tipoparamfactusecuenciatrabajoSessionBean;
	}
	
	public void settipoparamfactusecuenciatrabajoSessionBean(TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean) {
		this.tipoparamfactusecuenciatrabajoSessionBean=tipoparamfactusecuenciatrabajoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparamfactusecuenciatrabajoAux.setId(tipoparamfactusecuenciatrabajo.getId());
		tipoparamfactusecuenciatrabajoAux.setVersionRow(tipoparamfactusecuenciatrabajo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParamFactuSecuenciaTrabajo();
		
			int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparamfactusecuenciatrabajoValidator.getInvalidValues(this.tipoparamfactusecuenciatrabajo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparamfactusecuenciatrabajoLogic.setDatosCliente(datosCliente);
			tipoparamfactusecuenciatrabajoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparamfactusecuenciatrabajoAux=new  TipoParamFactuSecuenciaTrabajo();
				
				tipoparamfactusecuenciatrabajoAux.setIsNew(true);
				tipoparamfactusecuenciatrabajoAux.setIsChanged(true);
				
				tipoparamfactusecuenciatrabajoAux.setTipoParamFactuSecuenciaTrabajoOriginal(this.tipoparamfactusecuenciatrabajo);
				
				tipoparamfactusecuenciatrabajoAux.setId(this.tipoparamfactusecuenciatrabajo.getId());	
				tipoparamfactusecuenciatrabajoAux.setVersionRow(this.tipoparamfactusecuenciatrabajo.getVersionRow());	
				tipoparamfactusecuenciatrabajoAux.setnombre(this.tipoparamfactusecuenciatrabajo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajos();//WithConnection
						//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajoRelaciones(tipoparamfactusecuenciatrabajoAux);//WithConnection
								//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparamfactusecuenciatrabajoAux=new  TipoParamFactuSecuenciaTrabajo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactusecuenciatrabajo.getId()>=0)) {
						
					tipoparamfactusecuenciatrabajoAux.setIsNew(false);
				}
				
				tipoparamfactusecuenciatrabajoAux.setIsDeleted(false);
			
				tipoparamfactusecuenciatrabajoAux.setId(this.tipoparamfactusecuenciatrabajo.getId());	
				tipoparamfactusecuenciatrabajoAux.setVersionRow(this.tipoparamfactusecuenciatrabajo.getVersionRow());	
				tipoparamfactusecuenciatrabajoAux.setnombre(this.tipoparamfactusecuenciatrabajo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajos();//WithConnection
						//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajoRelaciones(tipoparamfactusecuenciatrabajoAux);//WithConnection
								//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparamfactusecuenciatrabajoAux=new  TipoParamFactuSecuenciaTrabajo();
				
				tipoparamfactusecuenciatrabajoAux.setIsNew(false);
				tipoparamfactusecuenciatrabajoAux.setIsChanged(false);
				
				tipoparamfactusecuenciatrabajoAux.setIsDeleted(true);
				
				tipoparamfactusecuenciatrabajoAux.setId(this.tipoparamfactusecuenciatrabajo.getId());	
				tipoparamfactusecuenciatrabajoAux.setVersionRow(this.tipoparamfactusecuenciatrabajo.getVersionRow());	
				tipoparamfactusecuenciatrabajoAux.setnombre(this.tipoparamfactusecuenciatrabajo.getnombre());	
				
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparamfactusecuenciatrabajoAux.getId()>=0) {	
						this.tipoparamfactusecuenciatrabajosEliminados.add(tipoparamfactusecuenciatrabajoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajos();//WithConnection
						//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajoRelaciones(tipoparamfactusecuenciatrabajoAux);//WithConnection
								//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparamfactusecuenciatrabajoAux,tipoparamfactusecuenciatrabajos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().addAll(this.tipoparamfactusecuenciatrabajosEliminados);
					
					tipoparamfactusecuenciatrabajoLogic.saveTipoParamFactuSecuenciaTrabajos();//WithConnection
					//tipoparamfactusecuenciatrabajoLogic.getSetVersionRowTipoParamFactuSecuenciaTrabajos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoparamfactusecuenciatrabajosEliminados= new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
			}
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Secuencia Trabajo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparamfactusecuenciatrabajo=tipoparamfactusecuenciatrabajoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTipoParamFactuSecuenciaTrabajo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal) throws Exception {
		
		if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal) throws Exception {	
		if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoParamFactuSecuenciaTrabajoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparamfactusecuenciatrabajoValidator.getInvalidValues(this.tipoparamfactusecuenciatrabajo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos) throws Exception {
		try	{		
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.actualizarLista(tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajos,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajos) throws Exception {
		try	{			
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.actualizarSelectedLista(tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparamfactusecuenciatrabajosLocal=this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparamfactusecuenciatrabajosLocal=this.tipoparamfactusecuenciatrabajos;
			}
			//ARCHITECTURE
		
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal:tipoparamfactusecuenciatrabajosLocal) {
				if(this.permiteMantenimiento(tipoparamfactusecuenciatrabajoLocal) && tipoparamfactusecuenciatrabajoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTipoParamFactuSecuenciaTrabajoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParamFactuSecuenciaTrabajoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jLabelnombreTipoParamFactuSecuenciaTrabajo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jLabelnombreTipoParamFactuSecuenciaTrabajo,"");
		
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
		this.iIdNuevoTipoParamFactuSecuenciaTrabajo--;	
		
		
		this.tipoparamfactusecuenciatrabajoAux=new TipoParamFactuSecuenciaTrabajo();
		
		this.tipoparamfactusecuenciatrabajoAux.setId(this.iIdNuevoTipoParamFactuSecuenciaTrabajo);
		this.tipoparamfactusecuenciatrabajoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().add(this.tipoparamfactusecuenciatrabajoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparamfactusecuenciatrabajos.add(this.tipoparamfactusecuenciatrabajoAux);
		}
		//ARCHITECTURE
		
		this.tipoparamfactusecuenciatrabajo=this.tipoparamfactusecuenciatrabajoAux;
		
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
		}
				
		//this.setDefaultControlesTipoParamFactuSecuenciaTrabajo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoBean,this.tipoparamfactusecuenciatrabajo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
			classes=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuSecuenciaTrabajo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparamfactusecuenciatrabajoReturnGeneral=tipoparamfactusecuenciatrabajoLogic.procesarEventosTipoParamFactuSecuenciaTrabajosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this.tipoparamfactusecuenciatrabajo,this.tipoparamfactusecuenciatrabajoParameterGeneral,this.isEsNuevoTipoParamFactuSecuenciaTrabajo,classes);//this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral,this.tipoparamfactusecuenciatrabajoBean,false);
		
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo());
		}
		
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo(),classes);//this.tipoparamfactusecuenciatrabajoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParamFactuSecuenciaTrabajo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.RecargarFormTipoParamFactuSecuenciaTrabajo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
						
			if(tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();
			}
			
			this.actualizarVisualTableDatosTipoParamFactuSecuenciaTrabajo();
			
			this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo(), this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo());
			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
						
			this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setEnabled(isHabilitar && this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarnombreTipoParamFactuSecuenciaTrabajo);	
		
	};
	
	public void setDefaultControlesTipoParamFactuSecuenciaTrabajo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParamFactuSecuenciaTrabajo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(true);			
			this.tipoparamfactusecuenciatrabajoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setVisible(true);
			
					
		} else {
			//this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(false);			
			this.tipoparamfactusecuenciatrabajoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoParamFactuSecuenciaTrabajo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				if(tipoparamfactusecuenciatrabajoAux.getId().equals(this.iIdNuevoTipoParamFactuSecuenciaTrabajo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajos) {
				if(tipoparamfactusecuenciatrabajoAux.getId().equals(this.iIdNuevoTipoParamFactuSecuenciaTrabajo)) {
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
	
	public int getIndiceActualTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				if(tipoparamfactusecuenciatrabajoAux.getId().equals(tipoparamfactusecuenciatrabajo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajos) {
				if(tipoparamfactusecuenciatrabajoAux.getId().equals(tipoparamfactusecuenciatrabajo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				if(tipoparamfactusecuenciatrabajoAux.getTipoParamFactuSecuenciaTrabajoOriginal().getId().equals(tipoparamfactusecuenciatrabajoOriginal.getId())) {
					existe=true;
					tipoparamfactusecuenciatrabajoOriginal.setId(tipoparamfactusecuenciatrabajoAux.getId());
					tipoparamfactusecuenciatrabajoOriginal.setVersionRow(tipoparamfactusecuenciatrabajoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajos) {
				if(tipoparamfactusecuenciatrabajoAux.getTipoParamFactuSecuenciaTrabajoOriginal().getId().equals(tipoparamfactusecuenciatrabajoOriginal.getId())) {
					existe=true;
					tipoparamfactusecuenciatrabajoOriginal.setId(tipoparamfactusecuenciatrabajoAux.getId());
					tipoparamfactusecuenciatrabajoOriginal.setVersionRow(tipoparamfactusecuenciatrabajoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParamFactuSecuenciaTrabajo(Boolean esParaCancelar) throws Exception {
		tipoparamfactusecuenciatrabajosAux=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
		tipoparamfactusecuenciatrabajoAux=new TipoParamFactuSecuenciaTrabajo();
		
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
					if(tipoparamfactusecuenciatrabajoAux.getId()<0) {
						tipoparamfactusecuenciatrabajosAux.add(tipoparamfactusecuenciatrabajoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuSecuenciaTrabajo=0L;
				this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().removeAll(tipoparamfactusecuenciatrabajosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajos) {
					if(tipoparamfactusecuenciatrabajoAux.getId()<0) {
						tipoparamfactusecuenciatrabajosAux.add(tipoparamfactusecuenciatrabajoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuSecuenciaTrabajo=0L;
				this.tipoparamfactusecuenciatrabajos.removeAll(tipoparamfactusecuenciatrabajosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuSecuenciaTrabajo 
					&& this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()>0
					) {
					tipoparamfactusecuenciatrabajoAux=this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().get(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size() - 1);
				
					if(tipoparamfactusecuenciatrabajoAux.getId()<0) {
						this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().remove(tipoparamfactusecuenciatrabajoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuSecuenciaTrabajo && this.tipoparamfactusecuenciatrabajos.size()>0) {
					tipoparamfactusecuenciatrabajoAux=this.tipoparamfactusecuenciatrabajos.get(this.tipoparamfactusecuenciatrabajos.size() - 1);
				
					if(tipoparamfactusecuenciatrabajoAux.getId()<0) {
						this.tipoparamfactusecuenciatrabajos.remove(tipoparamfactusecuenciatrabajoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParamFactuSecuenciaTrabajo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparamfactusecuenciatrabajo.getId()<0) {
				this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().remove(this.tipoparamfactusecuenciatrabajo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparamfactusecuenciatrabajo.getId()<0) {
				this.tipoparamfactusecuenciatrabajos.remove(this.tipoparamfactusecuenciatrabajo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParamFactuSecuenciaTrabajo(List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosAux) throws Exception {
		TipoParamFactuSecuenciaTrabajoConstantesFunciones.setEstadosInicialesTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajosAux);
	}
	
	public void setEstadosInicialesTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux) throws Exception {
		TipoParamFactuSecuenciaTrabajoConstantesFunciones.setEstadosInicialesTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParamFactuSecuenciaTrabajoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParamFactuSecuenciaTrabajoActual()) {
				if(!this.isEsNuevoTipoParamFactuSecuenciaTrabajo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParamFactuSecuenciaTrabajoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Secuencia Trabajo ?", "MANTENIMIENTO DE Tipo Secuencia Trabajo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) throws Exception {
		TipoParamFactuSecuenciaTrabajoConstantesFunciones.seleccionarAsignar(this.tipoparamfactusecuenciatrabajo,tipoparamfactusecuenciatrabajo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo=this.isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo;
			
			
			this.seleccionarAsignar(tipoparamfactusecuenciatrabajo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.quitarEspaciosTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparamfactusecuenciatrabajoSessionBean.setsFuncionBusquedaRapida(this.tipoparamfactusecuenciatrabajoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParamFactuSecuenciaTrabajo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParamFactuSecuenciaTrabajo(esParaCancelar);				
				this.cancelarNuevoTipoParamFactuSecuenciaTrabajo(esParaCancelar);								
			}
			
			this.tipoparamfactusecuenciatrabajo=new TipoParamFactuSecuenciaTrabajo();
			
			this.inicializarTipoParamFactuSecuenciaTrabajo();
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParamFactuSecuenciaTrabajo() throws Exception {
		try {
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.inicializarTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParamFactuSecuenciaTrabajos(String sAccionBusqueda,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParamFactuSecuenciaTrabajo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParamFactuSecuenciaTrabajoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParamFactuSecuenciaTrabajoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParamFactuSecuenciaTrabajo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Secuencia Trabajos");		
		parameters.put("busquedapor", TipoParamFactuSecuenciaTrabajoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParamFactuSecuenciaTrabajo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParamFactuSecuenciaTrabajo=new JRBeanArrayDataSource(TipoParamFactuSecuenciaTrabajoJInternalFrame.TraerTipoParamFactuSecuenciaTrabajoBeans(tipoparamfactusecuenciatrabajosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParamFactuSecuenciaTrabajo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParamFactuSecuenciaTrabajoBean.TraerTipoParamFactuSecuenciaTrabajoBeans(tipoparamfactusecuenciatrabajosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(null);
					//this.generarExcelReporteTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParamFactuSecuenciaTrabajos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactusecuenciatrabajosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParamFactuSecuenciaTrabajos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuSecuenciaTrabajos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuSecuenciaTrabajo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo : tipoparamfactusecuenciatrabajosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.generarExcelReporteDataTipoParamFactuSecuenciaTrabajo("NORMAL",row,workbook,tipoparamfactusecuenciatrabajo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParamFactuSecuenciaTrabajo(String sTipo,Row row,Workbook workbook) {
		
		TipoParamFactuSecuenciaTrabajoConstantesFunciones.generarExcelReporteHeaderTipoParamFactuSecuenciaTrabajo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParamFactuSecuenciaTrabajos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuSecuenciaTrabajos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo : tipoparamfactusecuenciatrabajosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTipoParamFactuSecuenciaTrabajoDescripcion(tipoparamfactusecuenciatrabajo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparamfactusecuenciatrabajo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParamFactuSecuenciaTrabajos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosRespaldo=null;
		
		classes=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuSecuenciaTrabajo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparamfactusecuenciatrabajoLogic.setDatosCliente(this.datosCliente);
		this.tipoparamfactusecuenciatrabajoLogic.setDatosDeep(this.datosDeep);
		this.tipoparamfactusecuenciatrabajoLogic.setIsConDeep(true);
		
		tipoparamfactusecuenciatrabajosRespaldo=this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos();
		
		this.tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(tipoparamfactusecuenciatrabajosParaReportes);	
		this.tipoparamfactusecuenciatrabajoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparamfactusecuenciatrabajosParaReportes=this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos();
		this.tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(tipoparamfactusecuenciatrabajosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuSecuenciaTrabajos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuSecuenciaTrabajo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo : tipoparamfactusecuenciatrabajosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParamFactuSecuenciaTrabajo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParamFactuSecuenciaTrabajoConstantesFunciones.generarExcelReporteDataTipoParamFactuSecuenciaTrabajo("NORMAL",row,workbook,tipoparamfactusecuenciatrabajo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTipoParamFactuSecuenciaTrabajoDescripcion(tipoparamfactusecuenciatrabajo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParamFactuSecuenciaTrabajo() throws Exception {		
		this.startProcessTipoParamFactuSecuenciaTrabajo(true);
	}
	
	public void startProcessTipoParamFactuSecuenciaTrabajo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo ,this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo,this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo, this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo, this.jPanelAccionesTipoParamFactuSecuenciaTrabajo,this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo,this.jmenuBarTipoParamFactuSecuenciaTrabajo,this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo=this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo=this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo;
		//final JScrollPane jScrollPanelDatosTipoParamFactuSecuenciaTrabajo=this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo;
		final JTable jTableDatosTipoParamFactuSecuenciaTrabajo=this.jTableDatosTipoParamFactuSecuenciaTrabajo;		
		final JPanel jPanelPaginacionTipoParamFactuSecuenciaTrabajo=this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo=this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo;
		final JPanel jPanelAccionesTipoParamFactuSecuenciaTrabajo=this.jPanelAccionesTipoParamFactuSecuenciaTrabajo;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelCamposTipoParamFactuSecuenciaTrabajo;
			jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo;
		}
		
		final JPanel jPanelCamposTipoParamFactuSecuenciaTrabajo=jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo;
		final JPanel jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo=jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo;
		
		
		final JMenuBar jmenuBarTipoParamFactuSecuenciaTrabajo=this.jmenuBarTipoParamFactuSecuenciaTrabajo;
		final JToolBar jTtoolBarTipoParamFactuSecuenciaTrabajo=this.jTtoolBarTipoParamFactuSecuenciaTrabajo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo;
			jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo;
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuSecuenciaTrabajo=jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo;
		final JToolBar jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo=jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuSecuenciaTrabajo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo ,jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo,jTableDatosTipoParamFactuSecuenciaTrabajo, /*jScrollPanelDatosTipoParamFactuSecuenciaTrabajo,*/jPanelCamposTipoParamFactuSecuenciaTrabajo,jPanelPaginacionTipoParamFactuSecuenciaTrabajo, /*jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo,*/ jPanelAccionesTipoParamFactuSecuenciaTrabajo,jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo,jmenuBarTipoParamFactuSecuenciaTrabajo,jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,jTtoolBarTipoParamFactuSecuenciaTrabajo,jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo ,jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, jScrollPanelDatosTipoParamFactuSecuenciaTrabajo,jPanelPaginacionTipoParamFactuSecuenciaTrabajo, jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo, jPanelAccionesTipoParamFactuSecuenciaTrabajo,jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo,jmenuBarTipoParamFactuSecuenciaTrabajo,jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,jTtoolBarTipoParamFactuSecuenciaTrabajo,jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo);
						
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
	
	public void finishProcessTipoParamFactuSecuenciaTrabajo() {// throws Exception 
		this.finishProcessTipoParamFactuSecuenciaTrabajo(true);
	}
	
	public void finishProcessTipoParamFactuSecuenciaTrabajo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo ,this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo,this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo, this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo, this.jPanelAccionesTipoParamFactuSecuenciaTrabajo,this.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo,this.jmenuBarTipoParamFactuSecuenciaTrabajo,this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,this.jTtoolBarTipoParamFactuSecuenciaTrabajo,this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo=this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo=this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo;
		//final JScrollPane jScrollPanelDatosTipoParamFactuSecuenciaTrabajo=this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo;
		final JTable jTableDatosTipoParamFactuSecuenciaTrabajo=this.jTableDatosTipoParamFactuSecuenciaTrabajo;		
		final JPanel jPanelPaginacionTipoParamFactuSecuenciaTrabajo=this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo=this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo;
		final JPanel jPanelAccionesTipoParamFactuSecuenciaTrabajo=this.jPanelAccionesTipoParamFactuSecuenciaTrabajo;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelCamposTipoParamFactuSecuenciaTrabajo;
			jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo;
		}
		
		final JPanel jPanelCamposTipoParamFactuSecuenciaTrabajo=jPanelCamposAuxiliarTipoParamFactuSecuenciaTrabajo;
		final JPanel jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo=jPanelAccionesFormularioAuxiliarTipoParamFactuSecuenciaTrabajo;
		
		
		final JMenuBar jmenuBarTipoParamFactuSecuenciaTrabajo=this.jmenuBarTipoParamFactuSecuenciaTrabajo;		
		final JToolBar jTtoolBarTipoParamFactuSecuenciaTrabajo=this.jTtoolBarTipoParamFactuSecuenciaTrabajo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo;
			jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuSecuenciaTrabajo=jmenuBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo;
		final JToolBar jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo=jTtoolBarDetalleAuxiliarTipoParamFactuSecuenciaTrabajo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuSecuenciaTrabajo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuSecuenciaTrabajo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuSecuenciaTrabajo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo ,jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo, jTableDatosTipoParamFactuSecuenciaTrabajo,/*jScrollPanelDatosTipoParamFactuSecuenciaTrabajo,*/jPanelCamposTipoParamFactuSecuenciaTrabajo,jPanelPaginacionTipoParamFactuSecuenciaTrabajo, /*jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo,*/ jPanelAccionesTipoParamFactuSecuenciaTrabajo,jPanelAccionesFormularioTipoParamFactuSecuenciaTrabajo,jmenuBarTipoParamFactuSecuenciaTrabajo,jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,jTtoolBarTipoParamFactuSecuenciaTrabajo,jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParamFactuSecuenciaTrabajo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParamFactuSecuenciaTrabajo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParamFactuSecuenciaTrabajo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParamFactuSecuenciaTrabajo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParamFactuSecuenciaTrabajo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParamFactuSecuenciaTrabajo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParamFactuSecuenciaTrabajo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParamFactuSecuenciaTrabajo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparamfactusecuenciatrabajoConstantesFunciones.getsFinalQueryTipoParamFactuSecuenciaTrabajo();
		String  finalQueryPaginacionTodos=this.tipoparamfactusecuenciatrabajoConstantesFunciones.getsFinalQueryTipoParamFactuSecuenciaTrabajo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getArrayColumnasGlobalesNoTipoParamFactuSecuenciaTrabajo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getArrayColumnasGlobalesTipoParamFactuSecuenciaTrabajo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParamFactuSecuenciaTrabajoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparamfactusecuenciatrabajosEliminados= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParamFactuSecuenciaTrabajo();
		
				///*TipoParamFactuSecuenciaTrabajoSessionBean*/this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean==null) {
				this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
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
					this.iNumeroPaginacion=TipoParamFactuSecuenciaTrabajoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getClassesForeignKeysOfTipoParamFactuSecuenciaTrabajo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparamfactusecuenciatrabajo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparamfactusecuenciatrabajosAux= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			
				
			tipoparamfactusecuenciatrabajoLogic.setDatosCliente(this.datosCliente);
			tipoparamfactusecuenciatrabajoLogic.setDatosDeep(this.datosDeep);
			tipoparamfactusecuenciatrabajoLogic.setIsConDeep(true);
			
			
			tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparamfactusecuenciatrabajoLogic.getTodosTipoParamFactuSecuenciaTrabajos(finalQueryGlobal,pagination);
					
					//tipoparamfactusecuenciatrabajoLogic.getTodosTipoParamFactuSecuenciaTrabajosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()==null|| tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactusecuenciatrabajosAux= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
							tipoparamfactusecuenciatrabajosAux.addAll(tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactusecuenciatrabajosAux= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
							tipoparamfactusecuenciatrabajosAux.addAll(tipoparamfactusecuenciatrabajos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactusecuenciatrabajoLogic.getTodosTipoParamFactuSecuenciaTrabajos(finalQueryGlobal+"",this.pagination);												
							
							//tipoparamfactusecuenciatrabajoLogic.getTodosTipoParamFactuSecuenciaTrabajosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(new ArrayList<TipoParamFactuSecuenciaTrabajo>());					
							tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().addAll(tipoparamfactusecuenciatrabajosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactusecuenciatrabajos=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
							tipoparamfactusecuenciatrabajos.addAll(tipoparamfactusecuenciatrabajosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParamFactuSecuenciaTrabajo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParamFactuSecuenciaTrabajo=this.idActual;
				
				} else if(this.idTipoParamFactuSecuenciaTrabajoActual!=null && this.idTipoParamFactuSecuenciaTrabajoActual!=0L) {
					idTipoParamFactuSecuenciaTrabajo=idTipoParamFactuSecuenciaTrabajoActual;
				}
				
					
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndicePorId(idTipoParamFactuSecuenciaTrabajo);
				
				this.tipoparamfactusecuenciatrabajos=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparamfactusecuenciatrabajoLogic.getEntity(idTipoParamFactuSecuenciaTrabajo);
					
					//tipoparamfactusecuenciatrabajoLogic.getEntityWithConnection(idTipoParamFactuSecuenciaTrabajo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(new ArrayList<TipoParamFactuSecuenciaTrabajo>());
					tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().add(tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactusecuenciatrabajos=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
					this.tipoparamfactusecuenciatrabajos.add(tipoparamfactusecuenciatrabajo);
				}
				
				if(tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()==null||tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoparamfactusecuenciatrabajos==null|| tipoparamfactusecuenciatrabajos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajosAux=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
						tipoparamfactusecuenciatrabajosAux.addAll(tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactusecuenciatrabajosAux=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
							tipoparamfactusecuenciatrabajosAux.addAll(tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoParamFactuSecuenciaTrabajos("BusquedaPorNombre",tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoParamFactuSecuenciaTrabajos("BusquedaPorNombre",tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(new ArrayList<TipoParamFactuSecuenciaTrabajo>());
						tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().addAll(tipoparamfactusecuenciatrabajosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactusecuenciatrabajos=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
							tipoparamfactusecuenciatrabajos.addAll(tipoparamfactusecuenciatrabajosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParamFactuSecuenciaTrabajo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParamFactuSecuenciaTrabajo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactusecuenciatrabajos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactusecuenciatrabajos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) {
		Boolean permite=true;
		
		if(this.tipoparamfactusecuenciatrabajo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getOrderByListaTipoParamFactuSecuenciaTrabajo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getOrderByListaTipoParamFactuSecuenciaTrabajo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				if(tipoparamfactusecuenciatrabajo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactusecuenciatrabajoTotales=tipoparamfactusecuenciatrabajo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajos) {
				if(tipoparamfactusecuenciatrabajo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactusecuenciatrabajoTotales=tipoparamfactusecuenciatrabajo;
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
			this.tipoparamfactusecuenciatrabajoAux=new TipoParamFactuSecuenciaTrabajo();
			this.tipoparamfactusecuenciatrabajoAux.setsType(Constantes2.S_TOTALES);
			this.tipoparamfactusecuenciatrabajoAux.setIsNew(false);
			this.tipoparamfactusecuenciatrabajoAux.setIsChanged(false);
			this.tipoparamfactusecuenciatrabajoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParamFactuSecuenciaTrabajoConstantesFunciones.TotalizarValoresFilaTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this.tipoparamfactusecuenciatrabajoAux);
				
				this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().add(this.tipoparamfactusecuenciatrabajoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParamFactuSecuenciaTrabajoConstantesFunciones.TotalizarValoresFilaTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajos,this.tipoparamfactusecuenciatrabajoAux);
				
				this.tipoparamfactusecuenciatrabajos.add(this.tipoparamfactusecuenciatrabajoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparamfactusecuenciatrabajoTotales=new TipoParamFactuSecuenciaTrabajo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().remove(tipoparamfactusecuenciatrabajoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactusecuenciatrabajos.remove(tipoparamfactusecuenciatrabajoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparamfactusecuenciatrabajoTotales=new TipoParamFactuSecuenciaTrabajo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				if(tipoparamfactusecuenciatrabajo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactusecuenciatrabajoTotales=tipoparamfactusecuenciatrabajo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuSecuenciaTrabajoConstantesFunciones.TotalizarValoresFilaTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),tipoparamfactusecuenciatrabajoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:this.tipoparamfactusecuenciatrabajos) {
				if(tipoparamfactusecuenciatrabajo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactusecuenciatrabajoTotales=tipoparamfactusecuenciatrabajo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuSecuenciaTrabajoConstantesFunciones.TotalizarValoresFilaTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajos,tipoparamfactusecuenciatrabajoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoParamFactuSecuenciaTrabajoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoParamFactuSecuenciaTrabajoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajoPorNombre(nombre);
				
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
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoParamFactuSecuenciaTrabajo() {
		this.isPermisoTodoTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoConsultaTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoReporteTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo=false;
		this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo=false;		
		this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=false;		
	}
	
	public void setPermisosUsuarioTipoParamFactuSecuenciaTrabajo(Boolean isPermiso) {
		this.isPermisoTodoTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoConsultaTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoReporteTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo=isPermiso;		
		this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParamFactuSecuenciaTrabajo(Boolean isPermiso) {
		//this.isPermisoTodoTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo=isPermiso;
		//this.isPermisoConsultaTipoParamFactuSecuenciaTrabajo=isPermiso;
		//this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo=isPermiso;
		//this.isPermisoReporteTipoParamFactuSecuenciaTrabajo=isPermiso;
		//this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo=isPermiso;		
		//this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo=isPermiso;		
		//this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo=isPermiso;
		//this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParamFactuSecuenciaTrabajo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParamFactuSecuenciaTrabajoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoParamFactuSecuenciaTrabajo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParamFactuSecuenciaTrabajoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParamFactuSecuenciaTrabajo=this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo;
			this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.setToolTipText(this.jTableDatosTipoParamFactuSecuenciaTrabajo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParamFactuSecuenciaTrabajo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParamFactuSecuenciaTrabajo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParamFactuSecuenciaTrabajo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoParamFactuSecuenciaTrabajoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParamFactuSecuenciaTrabajoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoParamFactuSecuenciaTrabajoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParamFactuSecuenciaTrabajo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParamFactuSecuenciaTrabajo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParamFactuSecuenciaTrabajo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean(); 
		this.tipoparamfactusecuenciatrabajoConstantesFunciones=new TipoParamFactuSecuenciaTrabajoConstantesFunciones(); 
		this.tipoparamfactusecuenciatrabajoBean=new TipoParamFactuSecuenciaTrabajo();//(this.tipoparamfactusecuenciatrabajoConstantesFunciones); 		
		this.tipoparamfactusecuenciatrabajoReturnGeneral=new TipoParamFactuSecuenciaTrabajoParameterReturnGeneral(); 
		
		this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactusecuenciatrabajoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParamFactuSecuenciaTrabajo(true);
			
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
			
			this.tipoparamfactusecuenciatrabajoConstantesFunciones=new TipoParamFactuSecuenciaTrabajoConstantesFunciones(); 
			this.tipoparamfactusecuenciatrabajoBean=new TipoParamFactuSecuenciaTrabajo();//this.tipoparamfactusecuenciatrabajoConstantesFunciones); 			
			this.tipoparamfactusecuenciatrabajoReturnGeneral=new TipoParamFactuSecuenciaTrabajoParameterReturnGeneral(); 
		
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Secuencia Trabajo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparamfactusecuenciatrabajo=new TipoParamFactuSecuenciaTrabajo();
			this.tipoparamfactusecuenciatrabajos = new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			this.tipoparamfactusecuenciatrabajosAux = new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic=new TipoParamFactuSecuenciaTrabajoLogic();
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparamfactusecuenciatrabajoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparamfactusecuenciatrabajoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo);	
					}
					
					if(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo);
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setVisible(false);
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo);
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo);
					this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
					this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo);
					this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setVisible(false);
					this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParamFactuSecuenciaTrabajoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParamFactuSecuenciaTrabajoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparamfactusecuenciatrabajoReturnGeneral=new TipoParamFactuSecuenciaTrabajoParameterReturnGeneral();
			
			this.tipoparamfactusecuenciatrabajoParameterGeneral=new TipoParamFactuSecuenciaTrabajoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparamfactusecuenciatrabajoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuSecuenciaTrabajoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuSecuenciaTrabajoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParamFactuSecuenciaTrabajo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParamFactuSecuenciaTrabajo(false);
			
			this.setPermisosUsuarioTipoParamFactuSecuenciaTrabajo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClasesRelacionadas();
			}
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParamFactuSecuenciaTrabajoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParamFactuSecuenciaTrabajo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuSecuenciaTrabajo();
			}
			
			if(!this.isPermisoBusquedaTipoParamFactuSecuenciaTrabajo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo,this.isPermisoPaginacionMedioTipoParamFactuSecuenciaTrabajo,this.isPermisoPaginacionTodoTipoParamFactuSecuenciaTrabajo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTiposSeleccionarTipoParamFactuSecuenciaTrabajo());
				
				this.tiposColumnasSelect=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getTiposSeleccionarTipoParamFactuSecuenciaTrabajo(true);
				
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
			//if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParamFactuSecuenciaTrabajo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoParamFactuSecuenciaTrabajo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoParamFactuSecuenciaTrabajo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuSecuenciaTrabajo() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoparamfactusecuenciatrabajoImplementable= (TipoParamFactuSecuenciaTrabajoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparamfactusecuenciatrabajoImplementableHome= (TipoParamFactuSecuenciaTrabajoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparamfactusecuenciatrabajos= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			this.tipoparamfactusecuenciatrabajosEliminados= new ArrayList<TipoParamFactuSecuenciaTrabajo>();
						
			this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParamFactuSecuenciaTrabajo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParamFactuSecuenciaTrabajo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParamFactuSecuenciaTrabajoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParamFactuSecuenciaTrabajo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParamFactuSecuenciaTrabajo();
			}
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParamFactuSecuenciaTrabajo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParamFactuSecuenciaTrabajo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParamFactuSecuenciaTrabajo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParamFactuSecuenciaTrabajo")) {
				iIndex=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParamFactuSecuenciaTrabajo();	
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
	
	public void cargarCombosForeignKeyTipoParamFactuSecuenciaTrabajo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParamFactuSecuenciaTrabajo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParamFactuSecuenciaTrabajo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		this.cargarCombosFrameForeignKeyTipoParamFactuSecuenciaTrabajo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		}
	}
	
	
	
	public void jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			
			if(jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount()>=1) {
				jTableDatosTipoParamFactuSecuenciaTrabajo.removeRowSelectionInterval(0, jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuSecuenciaTrabajo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(true);			
			//this.tipoparamfactusecuenciatrabajo=new TipoParamFactuSecuenciaTrabajo();
			//this.tipoparamfactusecuenciatrabajo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo() ;
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuSecuenciaTrabajo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparamfactusecuenciatrabajo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);				
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParamFactuSecuenciaTrabajo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRows().length;			
			}
			
			tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParamFactuSecuenciaTrabajo--;			
				//TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux= new TipoParamFactuSecuenciaTrabajo();			
				//tipoparamfactusecuenciatrabajoAux.setId(this.iIdNuevoTipoParamFactuSecuenciaTrabajo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoOrigen=new TipoParamFactuSecuenciaTrabajo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoOrigen : tipoparamfactusecuenciatrabajosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparamfactusecuenciatrabajoOrigen =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactusecuenciatrabajoOrigen =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParamFactuSecuenciaTrabajo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparamfactusecuenciatrabajo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoOrigen,this.tipoparamfactusecuenciatrabajo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().add(this.tipoparamfactusecuenciatrabajoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactusecuenciatrabajos.add(this.tipoparamfactusecuenciatrabajoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo(), this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo());
				
				int iLastRow =  this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();									
		
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoOrigen=new TipoParamFactuSecuenciaTrabajo();
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoDestino=new TipoParamFactuSecuenciaTrabajo();
				
			tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparamfactusecuenciatrabajosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoOrigen =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactusecuenciatrabajoOrigen =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactusecuenciatrabajoDestino =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactusecuenciatrabajoDestino =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparamfactusecuenciatrabajoOrigen =tipoparamfactusecuenciatrabajosSeleccionados.get(0);
				tipoparamfactusecuenciatrabajoDestino =tipoparamfactusecuenciatrabajosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoOrigen,tipoparamfactusecuenciatrabajoDestino,true,false);
				
				tipoparamfactusecuenciatrabajoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactusecuenciatrabajoDestino,tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactusecuenciatrabajoDestino,tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
				
				//this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo(), this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo());
				
				int iLastRow =  this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(!isVisible);
			this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(!isVisible);
			this.jPanelAccionesTipoParamFactuSecuenciaTrabajo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParamFactuSecuenciaTrabajo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParamFactuSecuenciaTrabajo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParamFactuSecuenciaTrabajo();
			
			this.abrirFrameOrderByTipoParamFactuSecuenciaTrabajo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParamFactuSecuenciaTrabajo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParamFactuSecuenciaTrabajo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSize(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.iWidthFormulario,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.getWidth(),TipoParamFactuSecuenciaTrabajoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.getWidth(),TipoParamFactuSecuenciaTrabajoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jContentPaneDetalleTipoParamFactuSecuenciaTrabajo.getWidth(),TipoParamFactuSecuenciaTrabajoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,false,this);
				} else {
					this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo);
				this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setVisible(false);
				this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setSelected(false);
				
				this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuSecuenciaTrabajo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuSecuenciaTrabajo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo==null) {
				
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo=new ImportacionJInternalFrame(TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo);
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSelected(false);


				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuSecuenciaTrabajo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo==null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo=new ReporteDinamicoJInternalFrame(TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo);
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuSecuenciaTrabajo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo);
			
	       	this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.dispose();
			//this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setVisible(true);
	        this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setVisible(true);
	        this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setVisible(false);
	        this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParamFactuSecuenciaTrabajo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
	        this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParamFactuSecuenciaTrabajo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParamFactuSecuenciaTrabajo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(true);
			//this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false) ;
			
			if(tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuSecuenciaTrabajo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParamFactuSecuenciaTrabajo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(true);
			//this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparamfactusecuenciatrabajo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false) ;
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuSecuenciaTrabajo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuSecuenciaTrabajo(false);
			
			//if(!this.isEsNuevoTipoParamFactuSecuenciaTrabajo) {								
				int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
					this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(false);
			
												
				
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParamFactuSecuenciaTrabajo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparamfactusecuenciatrabajo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactusecuenciatrabajo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactusecuenciatrabajo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParamFactuSecuenciaTrabajoModel) this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
				this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(false);
				
				
				
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParamFactuSecuenciaTrabajo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount()>=1) {
				jTableDatosTipoParamFactuSecuenciaTrabajo.removeRowSelectionInterval(0, jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParamFactuSecuenciaTrabajo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(false) ;
			
			this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
			
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParamFactuSecuenciaTrabajo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
				
				//SI ES MANUAL
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParamFactuSecuenciaTrabajo--;			
			//TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux= new TipoParamFactuSecuenciaTrabajo();			
			//tipoparamfactusecuenciatrabajoAux.setId(this.iIdNuevoTipoParamFactuSecuenciaTrabajo);
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParamFactuSecuenciaTrabajo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
			
			this.tipoparamfactusecuenciatrabajo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().add(this.tipoparamfactusecuenciatrabajoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparamfactusecuenciatrabajos.add(this.tipoparamfactusecuenciatrabajoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			
			this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo(), this.getIndiceNuevoTipoParamFactuSecuenciaTrabajo());
			
			int iLastRow =  this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParamFactuSecuenciaTrabajo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();
			}
			
			//this.abrirFrameTreeTipoParamFactuSecuenciaTrabajo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Secuencia TrabajoS ?", "MANTENIMIENTO DE Tipo Secuencia Trabajo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParamFactuSecuenciaTrabajo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparamfactusecuenciatrabajoReturnGeneral=tipoparamfactusecuenciatrabajoLogic.procesarImportacionTipoParamFactuSecuenciaTrabajosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparamfactusecuenciatrabajoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParamFactuSecuenciaTrabajoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setFileImportacion(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParamFactuSecuenciaTrabajo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		

		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParamFactuSecuenciaTrabajoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParamFactuSecuenciaTrabajoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParamFactuSecuenciaTrabajos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo:tipoparamfactusecuenciatrabajosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparamfactusecuenciatrabajo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoParamFactuSecuenciaTrabajo(row);				
			//	iRow++;
			//}				
			
			//for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParamFactuSecuenciaTrabajo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParamFactuSecuenciaTrabajo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuSecuenciaTrabajo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuSecuenciaTrabajo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParamFactuSecuenciaTrabajo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo();
		
		this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuSecuenciaTrabajo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuSecuenciaTrabajo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuSecuenciaTrabajo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuSecuenciaTrabajo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParamFactuSecuenciaTrabajo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionNuevoTipoParamFactuSecuenciaTrabajo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionSinCerrarTipoParamFactuSecuenciaTrabajo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jCheckBoxPostAccionSinMensajeTipoParamFactuSecuenciaTrabajo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParamFactuSecuenciaTrabajo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuSecuenciaTrabajo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuSecuenciaTrabajo() throws Exception {
		try	{
			if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuSecuenciaTrabajo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuSecuenciaTrabajo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuSecuenciaTrabajo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			
			if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParamFactuSecuenciaTrabajo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuSecuenciaTrabajo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuSecuenciaTrabajo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParamFactuSecuenciaTrabajo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParamFactuSecuenciaTrabajo(Boolean esInicializar) throws Exception {				
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuSecuenciaTrabajo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo() throws Exception {
		this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParamFactuSecuenciaTrabajo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparamfactusecuenciatrabajos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.setModel(new TipoParamFactuSecuenciaTrabajoModel(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.setModel(new TipoParamFactuSecuenciaTrabajoModel(this.tipoparamfactusecuenciatrabajos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo!=null && this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuSecuenciaTrabajo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarSeleccionarTipoParamFactuSecuenciaTrabajo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParamFactuSecuenciaTrabajoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarSeleccionarTipoParamFactuSecuenciaTrabajo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajo,TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID));

		if(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostraridTipoParamFactuSecuenciaTrabajo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltaridTipoParamFactuSecuenciaTrabajo,this.tipoparamfactusecuenciatrabajoConstantesFunciones.activaridTipoParamFactuSecuenciaTrabajo,this,true,"idTipoParamFactuSecuenciaTrabajo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltaridTipoParamFactuSecuenciaTrabajo,this.tipoparamfactusecuenciatrabajoConstantesFunciones.activaridTipoParamFactuSecuenciaTrabajo,this,true,"idTipoParamFactuSecuenciaTrabajo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajo,TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostrarnombreTipoParamFactuSecuenciaTrabajo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarnombreTipoParamFactuSecuenciaTrabajo,this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarnombreTipoParamFactuSecuenciaTrabajo,this,true,"nombreTipoParamFactuSecuenciaTrabajo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarnombreTipoParamFactuSecuenciaTrabajo,this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarnombreTipoParamFactuSecuenciaTrabajo,this,true,"nombreTipoParamFactuSecuenciaTrabajo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoParamFactuSecuenciaTrabajoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuSecuenciaTrabajo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParamFactuSecuenciaTrabajo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParamFactuSecuenciaTrabajo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParamFactuSecuenciaTrabajo.moveColumn(this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParamFactuSecuenciaTrabajo.moveColumn(this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParamFactuSecuenciaTrabajo.moveColumn(this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParamFactuSecuenciaTrabajo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparamfactusecuenciatrabajos.size()-1;
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
		//this.jTableDatosTipoParamFactuSecuenciaTrabajo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParamFactuSecuenciaTrabajo();
			
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
				
				//this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
					
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparamfactusecuenciatrabajo.getsType().equals("DUPLICADO")
				   || this.tipoparamfactusecuenciatrabajo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
				
				} else {
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparamfactusecuenciatrabajo.getId()>=0 && !this.tipoparamfactusecuenciatrabajo.getIsNew()) {						
						this.isEsNuevoTipoParamFactuSecuenciaTrabajo=false;
						
					} else {
						this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuSecuenciaTrabajo(esRelaciones);						
				
				this.seleccionarTipoParamFactuSecuenciaTrabajo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparamfactusecuenciatrabajo.getId()<0) {
					this.isEsNuevoTipoParamFactuSecuenciaTrabajo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParamFactuSecuenciaTrabajo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParamFactuSecuenciaTrabajo(evt,rowIndex);
				}	
				
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParamFactuSecuenciaTrabajo: " + this.dDif); 
					}
				}								
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParamFactuSecuenciaTrabajo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {
					if(this.tipoparamfactusecuenciatrabajo.getId()>0) {
						this.tipoparamfactusecuenciatrabajo.setIsDeleted(true);
						
						this.tipoparamfactusecuenciatrabajosEliminados.add(this.tipoparamfactusecuenciatrabajo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().remove(this.tipoparamfactusecuenciatrabajo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactusecuenciatrabajos.remove(this.tipoparamfactusecuenciatrabajo);				
					}
					
					
					((TipoParamFactuSecuenciaTrabajoModel) this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParamFactuSecuenciaTrabajo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParamFactuSecuenciaTrabajo) {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajo.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparamfactusecuenciatrabajoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparamfactusecuenciatrabajoLocal=this.tipoparamfactusecuenciatrabajo;
			} else {
				tipoparamfactusecuenciatrabajoLocal=this.tipoparamfactusecuenciatrabajoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparamfactusecuenciatrabajoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoLocal,true);
					
					if(tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparamfactusecuenciatrabajoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparamfactusecuenciatrabajoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.getText()==null || this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.getText()=="" || this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setText("0");
			}

			if(conColumnasBase) {tipoparamfactusecuenciatrabajo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jLabelIdTipoParamFactuSecuenciaTrabajo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparamfactusecuenciatrabajo.setnombre(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jLabelnombreTipoParamFactuSecuenciaTrabajo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoBean,TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoOrigen,TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactusecuenciatrabajoOrigen.getId()!=null && !tipoparamfactusecuenciatrabajoOrigen.getId().equals(0L))) {tipoparamfactusecuenciatrabajo.setId(tipoparamfactusecuenciatrabajoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparamfactusecuenciatrabajoOrigen.getnombre()!=null && !tipoparamfactusecuenciatrabajoOrigen.getnombre().equals(""))) {tipoparamfactusecuenciatrabajo.setnombre(tipoparamfactusecuenciatrabajoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajo.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajoBean tipoparamfactusecuenciatrabajoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setText(tipoparamfactusecuenciatrabajoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajoParameterReturnGeneral tipoparamfactusecuenciatrabajoReturnGeneral,TipoParamFactuSecuenciaTrabajoBean tipoparamfactusecuenciatrabajoBean,Boolean conDefault) throws Exception { 
		try {
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal=new TipoParamFactuSecuenciaTrabajo();
			
			tipoparamfactusecuenciatrabajoLocal=tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactusecuenciatrabajoLocal.getId()!=null && !tipoparamfactusecuenciatrabajoLocal.getId().equals(0L))) {tipoparamfactusecuenciatrabajoBean.setId(tipoparamfactusecuenciatrabajoLocal.getId());}}
			if(conDefault || (!conDefault && tipoparamfactusecuenciatrabajoLocal.getnombre()!=null && !tipoparamfactusecuenciatrabajoLocal.getnombre().equals(""))) {tipoparamfactusecuenciatrabajoBean.setnombre(tipoparamfactusecuenciatrabajoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParamFactuSecuenciaTrabajoGenerico(Long idTipoParamFactuSecuenciaTrabajoSeleccionado,JComboBox jComboBoxTipoParamFactuSecuenciaTrabajo,List<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosLocal)throws Exception {
		try {
			TipoParamFactuSecuenciaTrabajo  tipoparamfactusecuenciatrabajoTemp=null;

			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosLocal) {
				if(tipoparamfactusecuenciatrabajoAux.getId()!=null && tipoparamfactusecuenciatrabajoAux.getId().equals(idTipoParamFactuSecuenciaTrabajoSeleccionado)) {
					tipoparamfactusecuenciatrabajoTemp=tipoparamfactusecuenciatrabajoAux;
					break;
				}
			}

			jComboBoxTipoParamFactuSecuenciaTrabajo.setSelectedItem(tipoparamfactusecuenciatrabajoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParamFactuSecuenciaTrabajoGenerico(JComboBox jComboBoxTipoParamFactuSecuenciaTrabajo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParamFactuSecuenciaTrabajo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuSecuenciaTrabajo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParamFactuSecuenciaTrabajo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuSecuenciaTrabajo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuSecuenciaTrabajo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParamFactuSecuenciaTrabajo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuSecuenciaTrabajo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParamFactuSecuenciaTrabajo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParamFactuSecuenciaTrabajo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParamFactuSecuenciaTrabajo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactusecuenciatrabajo=(TipoParamFactuSecuenciaTrabajo) tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) tipoparamfactusecuenciatrabajos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoRow=new TipoParamFactuSecuenciaTrabajo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactusecuenciatrabajoRow=(TipoParamFactuSecuenciaTrabajo) tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactusecuenciatrabajoRow=(TipoParamFactuSecuenciaTrabajo) tipoparamfactusecuenciatrabajos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));			
			this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo && this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo));			
			this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo && this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo));
			this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo && this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo));
			
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));			
			
			this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));			
			this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo));
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo);							
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));						
			this.jButtonDuplicarToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo && this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo));						
			this.jButtonCopiarToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo && this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo));			
			this.jButtonVerFormToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo && this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo));			
			this.jButtonAbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));
			this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo  && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo));
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo);				
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo && this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo && this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo && this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));			
			//this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));
			this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));			
			//this.jMenuItemDetalleMostrarOcultarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo && this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo));			
			this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));									
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo && this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo));	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo && this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo));
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo);				
			}
			
			this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));						
			this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo=this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo=this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo=this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParamFactuSecuenciaTrabajo=this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=this.jButtonModificarTipoParamFactuSecuenciaTrabajo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=this.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParamFactuSecuenciaTrabajo(Boolean esInicializar) {
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuSecuenciaTrabajo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParamFactuSecuenciaTrabajo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParamFactuSecuenciaTrabajo() {
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo);			
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoDuplicarTipoParamFactuSecuenciaTrabajo);			
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoCopiarTipoParamFactuSecuenciaTrabajo);			
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoVerFormTipoParamFactuSecuenciaTrabajo);			
		
		this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoOrdenTipoParamFactuSecuenciaTrabajo);					
		
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoNuevoTipoParamFactuSecuenciaTrabajo);			
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo);	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo);	
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo);
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo);						
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuSecuenciaTrabajo() {
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo);	
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoActualizarTipoParamFactuSecuenciaTrabajo);	
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.setVisible(this.isPermisoEliminarTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo);							
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo && this.isPermisoGuardarCambiosTipoParamFactuSecuenciaTrabajo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParamFactuSecuenciaTrabajo() {
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuSecuenciaTrabajo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParamFactuSecuenciaTrabajo() {
	}
	
	public void jTableDatosTipoParamFactuSecuenciaTrabajoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParamFactuSecuenciaTrabajo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.gettipoparamfactusecuenciatrabajo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactusecuenciatrabajo==null) {
						this.tipoparamfactusecuenciatrabajo = new TipoParamFactuSecuenciaTrabajo();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
				}

				if(this.tipoparamfactusecuenciatrabajo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparamfactusecuenciatrabajo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.gettipoparamfactusecuenciatrabajo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactusecuenciatrabajo==null) {
						this.tipoparamfactusecuenciatrabajo = new TipoParamFactuSecuenciaTrabajo();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);
				}

				if(this.tipoparamfactusecuenciatrabajo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparamfactusecuenciatrabajo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);

			this.getTipoParamFactuSecuenciaTrabajosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);

			//if(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactusecuenciatrabajoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoParamFactuSecuenciaTrabajo() {
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.dispose();
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.dispose();
			this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo=null;
		}
		
		if(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo!=null) {
			this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.dispose();
			this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParamFactuSecuenciaTrabajo();
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParamFactuSecuenciaTrabajo")) {
				jButtonDuplicarTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCopiarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParamFactuSecuenciaTrabajo")) {
				jButtonVerFormTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonDuplicarTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParamFactuSecuenciaTrabajo")) {
				jButtonDuplicarTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParamFactuSecuenciaTrabajo")) {
				jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParamFactuSecuenciaTrabajo")) {
				jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParamFactuSecuenciaTrabajo")) {
				jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParamFactuSecuenciaTrabajo")) {
				jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParamFactuSecuenciaTrabajo")) {
				jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParamFactuSecuenciaTrabajo")) {
				jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonMostrarOcultarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCopiarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonVerFormTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCopiarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParamFactuSecuenciaTrabajo")) {
				jButtonVerFormTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuSecuenciaTrabajo")) {
				jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo")) {
				jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParamFactuSecuenciaTrabajo")) {
				jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParamFactuSecuenciaTrabajo")) {
				jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParamFactuSecuenciaTrabajo")) {
				jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParamFactuSecuenciaTrabajo")) {
				jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo")) {
				jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParamFactuSecuenciaTrabajo")) {
				jButtonMostrarOcultarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo")) {
				jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParamFactuSecuenciaTrabajo")) {
				
				jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParamFactuSecuenciaTrabajo")) {
				
				jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParamFactuSecuenciaTrabajo")) {
				jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParamFactuSecuenciaTrabajo")) {
				jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParamFactuSecuenciaTrabajo")) {
				jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParamFactuSecuenciaTrabajo")) {
				
				jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParamFactuSecuenciaTrabajo")) {
				jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParamFactuSecuenciaTrabajo")) {
				jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo")) {
				jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuSecuenciaTrabajoBusqueda")) {
				this.jButtonidTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuSecuenciaTrabajoBusqueda")) {
				this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoParamFactuSecuenciaTrabajo")) {
				this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			}
			
			;
			
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParamFactuSecuenciaTrabajo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparamfactusecuenciatrabajoLocal=this.tipoparamfactusecuenciatrabajo;
			} else {
				tipoparamfactusecuenciatrabajoLocal=this.tipoparamfactusecuenciatrabajoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
							
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
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
			
			


			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
								
						
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
								
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
							
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
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
			
			


			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
								
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParamFactuSecuenciaTrabajo")) {
					jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParamFactuSecuenciaTrabajo")) {
					jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParamFactuSecuenciaTrabajo")) {
					
				}
				
				


				
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
												
				
				


				
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
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
			
			


			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactusecuenciatrabajo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactusecuenciatrabajo);
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
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
				
				


				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuSecuenciaTrabajo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuSecuenciaTrabajo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuSecuenciaTrabajoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactusecuenciatrabajoAnterior =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParamFactuSecuenciaTrabajo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParamFactuSecuenciaTrabajoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparamfactusecuenciatrabajo =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparamfactusecuenciatrabajo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParamFactuSecuenciaTrabajo")) {
				
				}
				
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParamFactuSecuenciaTrabajo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuSecuenciaTrabajo")) {
			
			}
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParamFactuSecuenciaTrabajo();
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParamFactuSecuenciaTrabajo")) {
				jButtonDuplicarTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCopiarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParamFactuSecuenciaTrabajo")) {
				jButtonVerFormTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParamFactuSecuenciaTrabajo")) {
				jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParamFactuSecuenciaTrabajo")) {
				jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParamFactuSecuenciaTrabajo")) {
				jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParamFactuSecuenciaTrabajo")) {
				jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParamFactuSecuenciaTrabajo")) {
				jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuSecuenciaTrabajo")) {
				jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParamFactuSecuenciaTrabajo")) {
				jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParamFactuSecuenciaTrabajo")) {
				jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuSecuenciaTrabajoBusqueda")) {
				this.jButtonidTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuSecuenciaTrabajoBusqueda")) {
				this.jButtonnombreTipoParamFactuSecuenciaTrabajoBusquedaActionPerformed(evt);
			}
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParamFactuSecuenciaTrabajo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParamFactuSecuenciaTrabajo")) {
				closingInternalFrameTipoParamFactuSecuenciaTrabajo();
				
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuSecuenciaTrabajo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(null);
			}
			
			TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),this.tipoparamfactusecuenciatrabajoParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParamFactuSecuenciaTrabajo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParamFactuSecuenciaTrabajo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParamFactuSecuenciaTrabajo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {
			if(!esControlTabla) {
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);			
				}
				
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactusecuenciatrabajoReturnGeneral=tipoparamfactusecuenciatrabajoLogic.procesarEventosTipoParamFactuSecuenciaTrabajosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this.tipoparamfactusecuenciatrabajo,this.tipoparamfactusecuenciatrabajoParameterGeneral,this.isEsNuevoTipoParamFactuSecuenciaTrabajo,classes);//this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral,this.tipoparamfactusecuenciatrabajoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuSecuenciaTrabajo(classes,this.tipoparamfactusecuenciatrabajoReturnGeneral,this.tipoparamfactusecuenciatrabajoBean,false);
					}
						
					if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo());	
					}
						
					if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo(),classes);//this.tipoparamfactusecuenciatrabajoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,classes);//this.tipoparamfactusecuenciatrabajoBean);									
				}
			
				if(TipoParamFactuSecuenciaTrabajoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparamfactusecuenciatrabajoAnterior!=null) {
						this.tipoparamfactusecuenciatrabajo=this.tipoparamfactusecuenciatrabajoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactusecuenciatrabajoReturnGeneral=tipoparamfactusecuenciatrabajoLogic.procesarEventosTipoParamFactuSecuenciaTrabajosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this.tipoparamfactusecuenciatrabajo,this.tipoparamfactusecuenciatrabajoParameterGeneral,this.isEsNuevoTipoParamFactuSecuenciaTrabajo,classes);//this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactusecuenciatrabajoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo(),tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo(),this.tipoparamfactusecuenciatrabajos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParamFactuSecuenciaTrabajo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParamFactuSecuenciaTrabajo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParamFactuSecuenciaTrabajo() throws Exception {
		
		TipoParamFactuSecuenciaTrabajoModel tipoparamfactusecuenciatrabajoModel=(TipoParamFactuSecuenciaTrabajoModel)this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactusecuenciatrabajoModel.tipoparamfactusecuenciatrabajos=this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparamfactusecuenciatrabajoModel.tipoparamfactusecuenciatrabajos=this.tipoparamfactusecuenciatrabajos;
		}
		
		
		((TipoParamFactuSecuenciaTrabajoModel) this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParamFactuSecuenciaTrabajo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparamfactusecuenciatrabajoAnterior(),this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparamfactusecuenciatrabajoAnterior(),this.tipoparamfactusecuenciatrabajos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParamFactuSecuenciaTrabajo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
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
										
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),generalEntityParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuSecuenciaTrabajo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParamFactuSecuenciaTrabajoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParamFactuSecuenciaTrabajo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParamFactuSecuenciaTrabajo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactusecuenciatrabajo,new Object(),generalEntityParameterGeneral,this.tipoparamfactusecuenciatrabajoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajoBean tipoparamfactusecuenciatrabajoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuSecuenciaTrabajo(ArrayList<Classe> classes,TipoParamFactuSecuenciaTrabajoReturnGeneral tipoparamfactusecuenciatrabajoReturnGeneral,TipoParamFactuSecuenciaTrabajoBean tipoparamfactusecuenciatrabajoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo = new TipoParamFactuSecuenciaTrabajoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones(),this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setVisible(false);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.tipoparamfactusecuenciatrabajoLogic=this.tipoparamfactusecuenciatrabajoLogic;
		
		this.cargarCombosFrameForeignKeyTipoParamFactuSecuenciaTrabajo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuSecuenciaTrabajo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuSecuenciaTrabajo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParamFactuSecuenciaTrabajo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuSecuenciaTrabajo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuSecuenciaTrabajo"));
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuSecuenciaTrabajo"));

		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuSecuenciaTrabajo"));
					
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuSecuenciaTrabajo"));
						
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuSecuenciaTrabajo"));
								
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuSecuenciaTrabajo"));
					
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuSecuenciaTrabajo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonidTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuSecuenciaTrabajoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuSecuenciaTrabajoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuSecuenciaTrabajo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParamFactuSecuenciaTrabajo"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuSecuenciaTrabajo"));
		}
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParamFactuSecuenciaTrabajo"));
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParamFactuSecuenciaTrabajo"));
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"NuevoTipoParamFactuSecuenciaTrabajo"));
		
		this.jButtonDuplicarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"DuplicarTipoParamFactuSecuenciaTrabajo"));
		
		this.jButtonCopiarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"CopiarTipoParamFactuSecuenciaTrabajo"));
		
		this.jButtonVerFormTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"VerFormTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jButtonDuplicarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemDuplicarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParamFactuSecuenciaTrabajo"));		
		
		
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuSecuenciaTrabajo"));
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuSecuenciaTrabajo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuSecuenciaTrabajo"));
				
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuSecuenciaTrabajo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuSecuenciaTrabajo"));
						
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuSecuenciaTrabajo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuSecuenciaTrabajo"));
			
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuSecuenciaTrabajo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParamFactuSecuenciaTrabajo"));		
		
		
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CerrarTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParamFactuSecuenciaTrabajo"));
			
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo"));
		}
		
		this.jButtonCopiarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jButtonVerFormToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParamFactuSecuenciaTrabajo"));
		
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemCopiarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParamFactuSecuenciaTrabajo"));		
		
		this.jMenuItemVerFormTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParamFactuSecuenciaTrabajo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParamFactuSecuenciaTrabajo"));
					
		this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo"));
		
		this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"AnterioresTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonAnterioresToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParamFactuSecuenciaTrabajo"));
		
		this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParamFactuSecuenciaTrabajo"));		
		
		
		this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"SiguientesTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonSiguientesToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemDetalleMostarOcultarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParamFactuSecuenciaTrabajo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParamFactuSecuenciaTrabajo"));

		this.jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParamFactuSecuenciaTrabajo"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuSecuenciaTrabajo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParamFactuSecuenciaTrabajo"));
			
		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParamFactuSecuenciaTrabajo"));
					
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParamFactuSecuenciaTrabajo"));
			
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParamFactuSecuenciaTrabajo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonidTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuSecuenciaTrabajoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuSecuenciaTrabajoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuSecuenciaTrabajo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));				
			//this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuSecuenciaTrabajo"));
				this.jInternalFrameImportacionTipoParamFactuSecuenciaTrabajo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuSecuenciaTrabajo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParamFactuSecuenciaTrabajo"));
			
			this.jButtonAbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParamFactuSecuenciaTrabajo"));			
			
			if(this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo!=null) {
				this.jInternalFrameOrderByTipoParamFactuSecuenciaTrabajo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuSecuenciaTrabajo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTabbedPaneRelacionesTipoParamFactuSecuenciaTrabajo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuSecuenciaTrabajo"));
		
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
            		closingInternalFrameTipoParamFactuSecuenciaTrabajo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo = (JInternalFrameBase)event.getSource();
	            	
	            TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParamFactuSecuenciaTrabajoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParamFactuSecuenciaTrabajo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuSecuenciaTrabajoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonModificarTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParamFactuSecuenciaTrabajo";
		inputMap = this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonidTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuSecuenciaTrabajoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jButtonnombreTipoParamFactuSecuenciaTrabajoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuSecuenciaTrabajoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoParamFactuSecuenciaTrabajo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuSecuenciaTrabajo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParamFactuSecuenciaTrabajoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuSecuenciaTrabajo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParamFactuSecuenciaTrabajo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
					tipoparamfactusecuenciatrabajoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajos) {
					tipoparamfactusecuenciatrabajoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParamFactuSecuenciaTrabajoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
						tipoparamfactusecuenciatrabajoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajos) {
						tipoparamfactusecuenciatrabajoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParamFactuSecuenciaTrabajoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuSecuenciaTrabajo.getSelectedRows();
			
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoLocal=new TipoParamFactuSecuenciaTrabajo();
			
			//this.seleccionarTodosTipoParamFactuSecuenciaTrabajo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactusecuenciatrabajoLocal =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos().toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparamfactusecuenciatrabajoLocal =(TipoParamFactuSecuenciaTrabajo) this.tipoparamfactusecuenciatrabajos.toArray()[this.jTableDatosTipoParamFactuSecuenciaTrabajo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparamfactusecuenciatrabajoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
						tipoparamfactusecuenciatrabajoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajos) {
						tipoparamfactusecuenciatrabajoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuSecuenciaTrabajo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuSecuenciaTrabajo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuSecuenciaTrabajo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParamFactuSecuenciaTrabajoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParamFactuSecuenciaTrabajoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParamFactuSecuenciaTrabajo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
				
						if(sTipoSeleccionar.equals(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactusecuenciatrabajoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajos) {
					
						if(sTipoSeleccionar.equals(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactusecuenciatrabajoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParamFactuSecuenciaTrabajo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParamFactuSecuenciaTrabajo(conSplash);
				
					this.generarReporteTipoParamFactuSecuenciaTrabajosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParamFactuSecuenciaTrabajosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuSecuenciaTrabajosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuSecuenciaTrabajosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuSecuenciaTrabajo();
				
				this.exportarTipoParamFactuSecuenciaTrabajosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParamFactuSecuenciaTrabajos();
				//this.importarTipoParamFactuSecuenciaTrabajos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuSecuenciaTrabajo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParamFactuSecuenciaTrabajosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Secuencia Trabajo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParamFactuSecuenciaTrabajo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParamFactuSecuenciaTrabajo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParamFactuSecuenciaTrabajo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParamFactuSecuenciaTrabajo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParamFactuSecuenciaTrabajo(conSplash);
					
						//this.actualizarParametrosGeneralTipoParamFactuSecuenciaTrabajo();
						
						this.generarReporteProcesoAccionTipoParamFactuSecuenciaTrabajosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Secuencia TrabajoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Secuencia Trabajo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParamFactuSecuenciaTrabajo();
				
						this.actualizarParametrosGeneralTipoParamFactuSecuenciaTrabajo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparamfactusecuenciatrabajoReturnGeneral=tipoparamfactusecuenciatrabajoLogic.procesarAccionTipoParamFactuSecuenciaTrabajosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos(),this.tipoparamfactusecuenciatrabajoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParamFactuSecuenciaTrabajoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParamFactuSecuenciaTrabajo();
					
					TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParamFactuSecuenciaTrabajoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jComboBoxTiposAccionesFormularioTipoParamFactuSecuenciaTrabajo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParamFactuSecuenciaTrabajo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParamFactuSecuenciaTrabajo();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
			TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo=new TipoParamFactuSecuenciaTrabajo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParamFactuSecuenciaTrabajo.getSelectedItem();
			
			
			
			
			tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparamfactusecuenciatrabajosSeleccionados.size()==1) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
					tipoparamfactusecuenciatrabajo=tipoparamfactusecuenciatrabajoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParamFactuSecuenciaTrabajo();
			
      		//this.finishProcessTipoParamFactuSecuenciaTrabajo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParamFactuSecuenciaTrabajoReturnGeneral() throws Exception {
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactusecuenciatrabajoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactusecuenciatrabajoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparamfactusecuenciatrabajoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
		}
		
		if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRetornoLista() || this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajos(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparamfactusecuenciatrabajoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactusecuenciatrabajoLogic.setTipoParamFactuSecuenciaTrabajo(this.tipoparamfactusecuenciatrabajoReturnGeneral.getTipoParamFactuSecuenciaTrabajo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParamFactuSecuenciaTrabajo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParamFactuSecuenciaTrabajo() throws Exception {
		
		
	}
	
	public ArrayList<TipoParamFactuSecuenciaTrabajo> getTipoParamFactuSecuenciaTrabajosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParamFactuSecuenciaTrabajo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos()) {
					if(tipoparamfactusecuenciatrabajoAux.getIsSelected()) {
						tipoparamfactusecuenciatrabajosSeleccionados.add(tipoparamfactusecuenciatrabajoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:this.tipoparamfactusecuenciatrabajos) {
					if(tipoparamfactusecuenciatrabajoAux.getIsSelected()) {
						tipoparamfactusecuenciatrabajosSeleccionados.add(tipoparamfactusecuenciatrabajoAux);				
					}
				}
			}
			
			if(tipoparamfactusecuenciatrabajosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparamfactusecuenciatrabajosSeleccionados.addAll(this.tipoparamfactusecuenciatrabajoLogic.getTipoParamFactuSecuenciaTrabajos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparamfactusecuenciatrabajosSeleccionados.addAll(this.tipoparamfactusecuenciatrabajos);				
					}
				}
			}
		} else {
			tipoparamfactusecuenciatrabajosSeleccionados.add(this.tipoparamfactusecuenciatrabajo);
		}
		
		return tipoparamfactusecuenciatrabajosSeleccionados;
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
	
	public void generarReporteTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParamFactuSecuenciaTrabajosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParamFactuSecuenciaTrabajosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuSecuenciaTrabajosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Secuencia Trabajo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParamFactuSecuenciaTrabajosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo();
		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParamFactuSecuenciaTrabajo();
		
		
		//this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados ,tipoparamfactusecuenciatrabajoImplementable,tipoparamfactusecuenciatrabajoImplementableHome);
	}
	
	public void mostrarImportacionTipoParamFactuSecuenciaTrabajos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParamFactuSecuenciaTrabajo();
		
		this.abrirFrameImportacionTipoParamFactuSecuenciaTrabajo();		
		
			
		//this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados ,tipoparamfactusecuenciatrabajoImplementable,tipoparamfactusecuenciatrabajoImplementableHome);
	}
	
	public void importarTipoParamFactuSecuenciaTrabajos() throws Exception {		
	
	}
	
	public void exportarTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParamFactuSecuenciaTrabajosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParamFactuSecuenciaTrabajosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParamFactuSecuenciaTrabajosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Secuencia Trabajo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParamFactuSecuenciaTrabajo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparamfactusecuenciatrabajoAux.setsDetalleGeneralEntityReporte(tipoparamfactusecuenciatrabajoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParamFactuSecuenciaTrabajo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparamfactusecuenciatrabajo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactusecuenciatrabajo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactusecuenciatrabajo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParamFactuSecuenciaTrabajos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParamFactuSecuenciaTrabajo(row);				
				iRow++;
			}				
			
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParamFactuSecuenciaTrabajosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();		
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactusecuenciatrabajo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparamfactusecuenciatrabajos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparamfactusecuenciatrabajo");
			//elementRoot.appendChild(element);
		
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
				element = document.createElement("tipoparamfactusecuenciatrabajo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Secuencia Trabajo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParamFactuSecuenciaTrabajo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactusecuenciatrabajo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactusecuenciatrabajo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoParamFactuSecuenciaTrabajo(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParamFactuSecuenciaTrabajoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparamfactusecuenciatrabajo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParamFactuSecuenciaTrabajoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparamfactusecuenciatrabajo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoParamFactuSecuenciaTrabajoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparamfactusecuenciatrabajo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoParamFactuSecuenciaTrabajosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados=new ArrayList<TipoParamFactuSecuenciaTrabajo>();
		
		tipoparamfactusecuenciatrabajosSeleccionados=this.getTipoParamFactuSecuenciaTrabajosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParamFactuSecuenciaTrabajo(tipoparamfactusecuenciatrabajosSeleccionados);
		
		this.generarReporteTipoParamFactuSecuenciaTrabajos("Todos",tipoparamfactusecuenciatrabajosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParamFactuSecuenciaTrabajo(ArrayList<TipoParamFactuSecuenciaTrabajo> tipoparamfactusecuenciatrabajosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParamFactuSecuenciaTrabajo tipoparamfactusecuenciatrabajoAux:tipoparamfactusecuenciatrabajosSeleccionados) {
				tipoparamfactusecuenciatrabajoAux.setsDetalleGeneralEntityReporte(tipoparamfactusecuenciatrabajoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParamFactuSecuenciaTrabajoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparamfactusecuenciatrabajoAux.setsDescripcionGeneralEntityReporte1(tipoparamfactusecuenciatrabajoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuSecuenciaTrabajoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParamFactuSecuenciaTrabajo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuSecuenciaTrabajo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuSecuenciaTrabajo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParamFactuSecuenciaTrabajoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=true;
		} else {
			this.actualizarEstadoPanelsTipoParamFactuSecuenciaTrabajo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParamFactuSecuenciaTrabajo=false;
			//this.isVisibilidadCeldaVerFormTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuSecuenciaTrabajo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuSecuenciaTrabajo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparamfactusecuenciatrabajoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;												
			}
			
			this.jButtonCerrarTipoParamFactuSecuenciaTrabajo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuSecuenciaTrabajo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparamfactusecuenciatrabajo)) {
			this.isVisibilidadCeldaActualizarTipoParamFactuSecuenciaTrabajo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuSecuenciaTrabajo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuSecuenciaTrabajo() {
	}
	
	public void actualizarEstadoPanelsTipoParamFactuSecuenciaTrabajo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo!=null) {
				this.jScrollPanelDatosTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelPaginacionTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
					this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparamfactusecuenciatrabajoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo!=null) {
				this.jPanelParametrosReportesTipoParamFactuSecuenciaTrabajo.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		
		if(this.tipoparamfactusecuenciatrabajoSessionBean==null) {
			this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		}
		
		this.tipoparamfactusecuenciatrabajoSessionBean.setsUltimaBusquedaTipoParamFactuSecuenciaTrabajo(this.getsAccionBusqueda());
		this.tipoparamfactusecuenciatrabajoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparamfactusecuenciatrabajoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoparamfactusecuenciatrabajoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		
		if(this.tipoparamfactusecuenciatrabajoSessionBean==null) {
			this.tipoparamfactusecuenciatrabajoSessionBean=new TipoParamFactuSecuenciaTrabajoSessionBean();
		}
		
		if(this.tipoparamfactusecuenciatrabajoSessionBean.getsUltimaBusquedaTipoParamFactuSecuenciaTrabajo()!=null&&!this.tipoparamfactusecuenciatrabajoSessionBean.getsUltimaBusquedaTipoParamFactuSecuenciaTrabajo().equals("")) {
			this.setsAccionBusqueda(tipoparamfactusecuenciatrabajoSessionBean.getsUltimaBusquedaTipoParamFactuSecuenciaTrabajo());
			this.setiNumeroPaginacion(tipoparamfactusecuenciatrabajoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparamfactusecuenciatrabajoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoparamfactusecuenciatrabajoSessionBean.getnombre());
				tipoparamfactusecuenciatrabajoSessionBean.setnombre("");
			}
		}
		
		this.tipoparamfactusecuenciatrabajoSessionBean.setsUltimaBusquedaTipoParamFactuSecuenciaTrabajo("");
		this.tipoparamfactusecuenciatrabajoSessionBean.setiNumeroPaginacion(TipoParamFactuSecuenciaTrabajoConstantesFunciones.INUMEROPAGINACION);
		this.tipoparamfactusecuenciatrabajoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParamFactuSecuenciaTrabajo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParamFactuSecuenciaTrabajo() {
		this.updateBorderResaltarBusquedasFormularioTipoParamFactuSecuenciaTrabajo();
		this.updateVisibilidadBusquedasFormularioTipoParamFactuSecuenciaTrabajo();
		this.updateHabilitarBusquedasFormularioTipoParamFactuSecuenciaTrabajo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParamFactuSecuenciaTrabajo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponents().length>0) {
	

		if(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo!=null) {
			index= this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponent(index);
				jPanel.setBorder(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParamFactuSecuenciaTrabajo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			if(!this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo && index>-1) {
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoParamFactuSecuenciaTrabajo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
				this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setEnabledAt(index,this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoParamFactuSecuenciaTrabajo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);

			this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuSecuenciaTrabajo.getComponent(index);

			this.tipoparamfactusecuenciatrabajoConstantesFunciones.setResaltarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo(resaltar);

			jPanel.setBorder(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuSecuenciaTrabajo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoParamFactuSecuenciaTrabajo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoParamFactuSecuenciaTrabajo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo();
		this.updateVisibilidadResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo();
		this.updateHabilitarResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltaridTipoParamFactuSecuenciaTrabajo!=null && this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setBorder(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltaridTipoParamFactuSecuenciaTrabajo);}
		if(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarnombreTipoParamFactuSecuenciaTrabajo!=null && this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setBorder(this.tipoparamfactusecuenciatrabajoConstantesFunciones.resaltarnombreTipoParamFactuSecuenciaTrabajo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
	
		//this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setVisible(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostraridTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelidTipoParamFactuSecuenciaTrabajo.setVisible(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostraridTipoParamFactuSecuenciaTrabajo);
		//this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setVisible(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostrarnombreTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jPanelnombreTipoParamFactuSecuenciaTrabajo.setVisible(this.tipoparamfactusecuenciatrabajoConstantesFunciones.mostrarnombreTipoParamFactuSecuenciaTrabajo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParamFactuSecuenciaTrabajo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo!=null) {
	
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextFieldidTipoParamFactuSecuenciaTrabajo.setEnabled(this.tipoparamfactusecuenciatrabajoConstantesFunciones.activaridTipoParamFactuSecuenciaTrabajo);
		this.jInternalFrameDetalleFormTipoParamFactuSecuenciaTrabajo.jTextAreanombreTipoParamFactuSecuenciaTrabajo.setEnabled(this.tipoparamfactusecuenciatrabajoConstantesFunciones.activarnombreTipoParamFactuSecuenciaTrabajo);
		}
	}
	
		
}