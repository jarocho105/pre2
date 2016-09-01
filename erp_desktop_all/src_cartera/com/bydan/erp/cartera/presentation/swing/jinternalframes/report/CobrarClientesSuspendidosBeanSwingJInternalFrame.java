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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarClientesSuspendidosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesSuspendidosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesSuspendidosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesSuspendidosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class CobrarClientesSuspendidosBeanSwingJInternalFrame extends CobrarClientesSuspendidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesSuspendidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesSuspendidos> cobrarclientessuspendidosValidator = new ClassValidator<CobrarClientesSuspendidos>(CobrarClientesSuspendidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesSuspendidos cobrarclientessuspendidos;	
	public CobrarClientesSuspendidos cobrarclientessuspendidosAux;
	public CobrarClientesSuspendidos cobrarclientessuspendidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesSuspendidos cobrarclientessuspendidosTotales;
	public Long idCobrarClientesSuspendidosActual;
	public Long iIdNuevoCobrarClientesSuspendidos=0L;
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
	
	public Boolean isPermisoTodoCobrarClientesSuspendidos;
	public Boolean isPermisoNuevoCobrarClientesSuspendidos;
	public Boolean isPermisoActualizarCobrarClientesSuspendidos;
	public Boolean isPermisoActualizarOriginalCobrarClientesSuspendidos;
	public Boolean isPermisoEliminarCobrarClientesSuspendidos;
	public Boolean isPermisoGuardarCambiosCobrarClientesSuspendidos;
	public Boolean isPermisoConsultaCobrarClientesSuspendidos;
	public Boolean isPermisoBusquedaCobrarClientesSuspendidos;
	public Boolean isPermisoReporteCobrarClientesSuspendidos;
	public Boolean isPermisoPaginacionMedioCobrarClientesSuspendidos;
	public Boolean isPermisoPaginacionAltoCobrarClientesSuspendidos;
	public Boolean isPermisoPaginacionTodoCobrarClientesSuspendidos;
	public Boolean isPermisoCopiarCobrarClientesSuspendidos;
	public Boolean isPermisoVerFormCobrarClientesSuspendidos;
	public Boolean isPermisoDuplicarCobrarClientesSuspendidos;
	public Boolean isPermisoOrdenCobrarClientesSuspendidos;
	
	
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
	
	public CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosReturnGeneral;
	public CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesSuspendidos=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesSuspendidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesSuspendidosSessionBeanAdditional cobrarclientessuspendidosSessionBeanAdditional=null;
	
	public CobrarClientesSuspendidosSessionBeanAdditional getCobrarClientesSuspendidosSessionBeanAdditional() {
		return this.cobrarclientessuspendidosSessionBeanAdditional;
	}
	
	public void setCobrarClientesSuspendidosSessionBeanAdditional(CobrarClientesSuspendidosSessionBeanAdditional cobrarclientessuspendidosSessionBeanAdditional) {
		try {
			this.cobrarclientessuspendidosSessionBeanAdditional=cobrarclientessuspendidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional cobrarclientessuspendidosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesSuspendidosBeanSwingJInternalFrame
	
	public CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional getCobrarClientesSuspendidosBeanSwingJInternalFrameAdditional() {
		return this.cobrarclientessuspendidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesSuspendidosBeanSwingJInternalFrameAdditional(CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional cobrarclientessuspendidosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclientessuspendidosBeanSwingJInternalFrameAdditional=cobrarclientessuspendidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesSuspendidosLogic cobrarclientessuspendidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesSuspendidos cobrarclientessuspendidosBean;
	public CobrarClientesSuspendidosConstantesFunciones cobrarclientessuspendidosConstantesFunciones;
	//public CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<CobrarClientesSuspendidos> cobrarclientessuspendidoss;	
	//public List<CobrarClientesSuspendidos> cobrarclientessuspendidossEliminados;
	//public List<CobrarClientesSuspendidos> cobrarclientessuspendidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesSuspendidos=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesSuspendidos=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesSuspendidos=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesSuspendidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesSuspendidos=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesSuspendidos=false;
	
	public Long getiIdNuevoCobrarClientesSuspendidos() {
		return this.iIdNuevoCobrarClientesSuspendidos;
	}

	public void setiIdNuevoCobrarClientesSuspendidos(Long iIdNuevoCobrarClientesSuspendidos) {
		this.iIdNuevoCobrarClientesSuspendidos = iIdNuevoCobrarClientesSuspendidos;
	}
	
	public Long getidCobrarClientesSuspendidosActual() {
		return this.idCobrarClientesSuspendidosActual;
	}

	public void setidCobrarClientesSuspendidosActual(Long idCobrarClientesSuspendidosActual) {
		this.idCobrarClientesSuspendidosActual = idCobrarClientesSuspendidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesSuspendidos getcobrarclientessuspendidos() {
		return this.cobrarclientessuspendidos;
	}

	public void setcobrarclientessuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos) {
		this.cobrarclientessuspendidos = cobrarclientessuspendidos;
	}
	
	public CobrarClientesSuspendidos getcobrarclientessuspendidosAux() {
		return this.cobrarclientessuspendidosAux;
	}

	public void setcobrarclientessuspendidosAux(CobrarClientesSuspendidos cobrarclientessuspendidosAux) {
		this.cobrarclientessuspendidosAux = cobrarclientessuspendidosAux;
	}				
	
	public CobrarClientesSuspendidos getcobrarclientessuspendidosAnterior() {
		return this.cobrarclientessuspendidosAnterior;
	}

	public void setcobrarclientessuspendidosAnterior(CobrarClientesSuspendidos cobrarclientessuspendidosAnterior) {
		this.cobrarclientessuspendidosAnterior = cobrarclientessuspendidosAnterior;
	}	
	
	public CobrarClientesSuspendidos getcobrarclientessuspendidosTotales() {
		return this.cobrarclientessuspendidosTotales;
	}

	public void setcobrarclientessuspendidosTotales(CobrarClientesSuspendidos cobrarclientessuspendidosTotales) {
		this.cobrarclientessuspendidosTotales = cobrarclientessuspendidosTotales;
	}	
	
	public CobrarClientesSuspendidos getcobrarclientessuspendidosBean() {
		return this.cobrarclientessuspendidosBean;
	}

	public void setcobrarclientessuspendidosBean(CobrarClientesSuspendidos cobrarclientessuspendidosBean) {
		this.cobrarclientessuspendidosBean = cobrarclientessuspendidosBean;
	}	
	
	public CobrarClientesSuspendidosParameterReturnGeneral getcobrarclientessuspendidosReturnGeneral() {
		return this.cobrarclientessuspendidosReturnGeneral;
	}

	public void setcobrarclientessuspendidosReturnGeneral(CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosReturnGeneral) {
		this.cobrarclientessuspendidosReturnGeneral = cobrarclientessuspendidosReturnGeneral;
	}	
	
	
	public Long idBusquedaCobrarClientesSuspendidos=0L;

	public Long getidBusquedaCobrarClientesSuspendidos() {
		return this.idBusquedaCobrarClientesSuspendidos;
	}

	public void setidBusquedaCobrarClientesSuspendidos(Long idBusquedaCobrarClientesSuspendidos) {
		this.idBusquedaCobrarClientesSuspendidos = idBusquedaCobrarClientesSuspendidos;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarClientesSuspendidosLogic getCobrarClientesSuspendidosLogic()	{		
		return cobrarclientessuspendidosLogic;
	}

	public void setCobrarClientesSuspendidosLogic(CobrarClientesSuspendidosLogic cobrarclientessuspendidosLogic) {
		this.cobrarclientessuspendidosLogic = cobrarclientessuspendidosLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesSuspendidos() {
		return isEsNuevoCobrarClientesSuspendidos;
	}

	public void setIsEsNuevoCobrarClientesSuspendidos(Boolean isEsNuevoCobrarClientesSuspendidos) {
		this.isEsNuevoCobrarClientesSuspendidos = isEsNuevoCobrarClientesSuspendidos;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesSuspendidos() {
		return esParaAccionDesdeFormularioCobrarClientesSuspendidos;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesSuspendidos(Boolean esParaAccionDesdeFormularioCobrarClientesSuspendidos) {
		this.esParaAccionDesdeFormularioCobrarClientesSuspendidos = esParaAccionDesdeFormularioCobrarClientesSuspendidos;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesSuspendidos() throws Exception {
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
		
	public CobrarClientesSuspendidosParameterReturnGeneral getCobrarClientesSuspendidosParameterGeneral() {
		return this.cobrarclientessuspendidosParameterGeneral;
	}
	
	public void setCobrarClientesSuspendidosParameterGeneral(CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosParameterGeneral) {
		this.cobrarclientessuspendidosParameterGeneral = cobrarclientessuspendidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesSuspendidos() {
		return isPermisoTodoCobrarClientesSuspendidos;
	}

	public void setIsPermisoTodoCobrarClientesSuspendidos(Boolean isPermisoTodoCobrarClientesSuspendidos) {
		this.isPermisoTodoCobrarClientesSuspendidos = isPermisoTodoCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoNuevoCobrarClientesSuspendidos() {
		return isPermisoNuevoCobrarClientesSuspendidos;
	}

	public void setIsPermisoNuevoCobrarClientesSuspendidos(Boolean isPermisoNuevoCobrarClientesSuspendidos) {
		this.isPermisoNuevoCobrarClientesSuspendidos = isPermisoNuevoCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoActualizarCobrarClientesSuspendidos() {
		return isPermisoActualizarCobrarClientesSuspendidos;
	}

	public void setIsPermisoActualizarCobrarClientesSuspendidos(Boolean isPermisoActualizarCobrarClientesSuspendidos) {
		this.isPermisoActualizarCobrarClientesSuspendidos = isPermisoActualizarCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoEliminarCobrarClientesSuspendidos() {
		return isPermisoEliminarCobrarClientesSuspendidos;
	}

	public void setIsPermisoEliminarCobrarClientesSuspendidos(Boolean isPermisoEliminarCobrarClientesSuspendidos) {
		this.isPermisoEliminarCobrarClientesSuspendidos = isPermisoEliminarCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesSuspendidos() {
		return isPermisoGuardarCambiosCobrarClientesSuspendidos;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesSuspendidos(Boolean isPermisoGuardarCambiosCobrarClientesSuspendidos) {
		this.isPermisoGuardarCambiosCobrarClientesSuspendidos = isPermisoGuardarCambiosCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesSuspendidos() {
		return isPermisoConsultaCobrarClientesSuspendidos;
	}

	public void setIsPermisoConsultaCobrarClientesSuspendidos(Boolean isPermisoConsultaCobrarClientesSuspendidos) {
		this.isPermisoConsultaCobrarClientesSuspendidos = isPermisoConsultaCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesSuspendidos() {
		return isPermisoBusquedaCobrarClientesSuspendidos;
	}

	public void setIsPermisoBusquedaCobrarClientesSuspendidos(Boolean isPermisoBusquedaCobrarClientesSuspendidos) {
		this.isPermisoBusquedaCobrarClientesSuspendidos = isPermisoBusquedaCobrarClientesSuspendidos;
	}

	public Boolean getIsPermisoReporteCobrarClientesSuspendidos() {
		return isPermisoReporteCobrarClientesSuspendidos;
	}

	public void setIsPermisoReporteCobrarClientesSuspendidos(Boolean isPermisoReporteCobrarClientesSuspendidos) {
		this.isPermisoReporteCobrarClientesSuspendidos = isPermisoReporteCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesSuspendidos() {
		return isPermisoPaginacionMedioCobrarClientesSuspendidos;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesSuspendidos(Boolean isPermisoPaginacionMedioCobrarClientesSuspendidos) {
		this.isPermisoPaginacionMedioCobrarClientesSuspendidos = isPermisoPaginacionMedioCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesSuspendidos() {
		return isPermisoPaginacionTodoCobrarClientesSuspendidos;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesSuspendidos(Boolean isPermisoPaginacionTodoCobrarClientesSuspendidos) {
		this.isPermisoPaginacionTodoCobrarClientesSuspendidos = isPermisoPaginacionTodoCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesSuspendidos() {
		return isPermisoPaginacionAltoCobrarClientesSuspendidos;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesSuspendidos(Boolean isPermisoPaginacionAltoCobrarClientesSuspendidos) {
		this.isPermisoPaginacionAltoCobrarClientesSuspendidos = isPermisoPaginacionAltoCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesSuspendidos() {
		return isPermisoCopiarCobrarClientesSuspendidos;
	}

	public void setIsPermisoCopiarCobrarClientesSuspendidos(Boolean isPermisoCopiarCobrarClientesSuspendidos) {
		this.isPermisoCopiarCobrarClientesSuspendidos = isPermisoCopiarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesSuspendidos() {
		return isPermisoVerFormCobrarClientesSuspendidos;
	}

	public void setIsPermisoVerFormCobrarClientesSuspendidos(Boolean isPermisoVerFormCobrarClientesSuspendidos) {
		this.isPermisoVerFormCobrarClientesSuspendidos = isPermisoVerFormCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesSuspendidos() {
		return isPermisoDuplicarCobrarClientesSuspendidos;
	}

	public void setIsPermisoDuplicarCobrarClientesSuspendidos(Boolean isPermisoDuplicarCobrarClientesSuspendidos) {
		this.isPermisoDuplicarCobrarClientesSuspendidos = isPermisoDuplicarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesSuspendidos() {
		return isPermisoOrdenCobrarClientesSuspendidos;
	}

	public void setIsPermisoOrdenCobrarClientesSuspendidos(Boolean isPermisoOrdenCobrarClientesSuspendidos) {
		this.isPermisoOrdenCobrarClientesSuspendidos = isPermisoOrdenCobrarClientesSuspendidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesSuspendidos() {
		return isVisibilidadCeldaNuevoCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesSuspendidos(Boolean isVisibilidadCeldaNuevoCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos = isVisibilidadCeldaNuevoCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaDuplicarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaDuplicarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos = isVisibilidadCeldaDuplicarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaCopiarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaCopiarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos = isVisibilidadCeldaCopiarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesSuspendidos() {
		return isVisibilidadCeldaVerFormCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesSuspendidos(Boolean isVisibilidadCeldaVerFormCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos = isVisibilidadCeldaVerFormCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesSuspendidos() {
		return isVisibilidadCeldaOrdenCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesSuspendidos(Boolean isVisibilidadCeldaOrdenCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos = isVisibilidadCeldaOrdenCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos = isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaModificarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaModificarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaModificarCobrarClientesSuspendidos = isVisibilidadCeldaModificarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaActualizarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaActualizarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos = isVisibilidadCeldaActualizarCobrarClientesSuspendidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaEliminarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaEliminarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos = isVisibilidadCeldaEliminarCobrarClientesSuspendidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaCancelarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaCancelarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos = isVisibilidadCeldaCancelarCobrarClientesSuspendidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesSuspendidos() {
		return isVisibilidadCeldaGuardarCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesSuspendidos(Boolean isVisibilidadCeldaGuardarCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos = isVisibilidadCeldaGuardarCobrarClientesSuspendidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos = isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos;
	}
		
	public CobrarClientesSuspendidosSessionBean getcobrarclientessuspendidosSessionBean() {
		return this.cobrarclientessuspendidosSessionBean;
	}
	
	public void setcobrarclientessuspendidosSessionBean(CobrarClientesSuspendidosSessionBean cobrarclientessuspendidosSessionBean) {
		this.cobrarclientessuspendidosSessionBean=cobrarclientessuspendidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesSuspendidos() {
		return this.isVisibilidadBusquedaCobrarClientesSuspendidos;
	}

	public void setisVisibilidadBusquedaCobrarClientesSuspendidos(Boolean isVisibilidadBusquedaCobrarClientesSuspendidos) {
		this.isVisibilidadBusquedaCobrarClientesSuspendidos=isVisibilidadBusquedaCobrarClientesSuspendidos;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos)throws Exception {
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
	
	public void bugActualizarReferenciaActual(CobrarClientesSuspendidos cobrarclientessuspendidos,CobrarClientesSuspendidos cobrarclientessuspendidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesSuspendidos(cobrarclientessuspendidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclientessuspendidosAux.setId(cobrarclientessuspendidos.getId());
		cobrarclientessuspendidosAux.setVersionRow(cobrarclientessuspendidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesSuspendidos cobrarclientessuspendidosLocal) throws Exception {
		
		if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesSuspendidos cobrarclientessuspendidosLocal) throws Exception {	
		if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarCobrarClientesSuspendidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclientessuspendidosValidator.getInvalidValues(this.cobrarclientessuspendidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesSuspendidos cobrarclientessuspendidos,List<CobrarClientesSuspendidos> cobrarclientessuspendidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesSuspendidos cobrarclientessuspendidos,List<CobrarClientesSuspendidos> cobrarclientessuspendidoss) throws Exception {
		try	{			
			CobrarClientesSuspendidosConstantesFunciones.actualizarSelectedLista(cobrarclientessuspendidos,cobrarclientessuspendidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesSuspendidos> cobrarclientessuspendidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclientessuspendidossLocal=this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclientessuspendidossLocal=this.cobrarclientessuspendidoss;
			}
			//ARCHITECTURE
		
			for(CobrarClientesSuspendidos cobrarclientessuspendidosLocal:cobrarclientessuspendidossLocal) {
				if(this.permiteMantenimiento(cobrarclientessuspendidosLocal) && cobrarclientessuspendidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.getCobrarClientesSuspendidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_ciudadCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelcodigoCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_completoCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.NOMBRECOMERCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_comercialCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelrucCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.DETALLEESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldetalle_estadoCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldireccion_direccionCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeltelefono_telefonoCobrarClientesSuspendidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesSuspendidosConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelsaldoCobrarClientesSuspendidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_ciudadCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelcodigoCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_completoCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_comercialCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelrucCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldetalle_estadoCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldireccion_direccionCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeltelefono_telefonoCobrarClientesSuspendidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelsaldoCobrarClientesSuspendidos,"");
		
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
		this.iIdNuevoCobrarClientesSuspendidos--;	
		
		
		this.cobrarclientessuspendidosAux=new CobrarClientesSuspendidos();
		
		this.cobrarclientessuspendidosAux.setId(this.iIdNuevoCobrarClientesSuspendidos);
		this.cobrarclientessuspendidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().add(this.cobrarclientessuspendidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclientessuspendidoss.add(this.cobrarclientessuspendidosAux);
		}
		//ARCHITECTURE
		
		this.cobrarclientessuspendidos=this.cobrarclientessuspendidosAux;
		
		if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
		}
				
		//this.setDefaultControlesCobrarClientesSuspendidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesSuspendidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesSuspendidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSuspendidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidosBean,this.cobrarclientessuspendidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral,this.cobrarclientessuspendidosBean,false);
		
		if(this.cobrarclientessuspendidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos());
		}
		
		if(this.cobrarclientessuspendidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos(),classes);//this.cobrarclientessuspendidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesSuspendidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesSuspendidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesSuspendidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
						
			if(cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();
			}
			
			this.actualizarVisualTableDatosCobrarClientesSuspendidos();
			
			this.jTableDatosCobrarClientesSuspendidos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSuspendidos(), this.getIndiceNuevoCobrarClientesSuspendidos());
			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesSuspendidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldid_empresaCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarid_empresaCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarnombre_ciudadCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarcodigoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarnombre_completoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarnombre_comercialCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarrucCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activardetalle_estadoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activardireccion_direccionCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activartelefono_telefonoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setEnabled(isHabilitar && this.cobrarclientessuspendidosConstantesFunciones.activarsaldoCobrarClientesSuspendidos);	
		
	};
	
	public void setDefaultControlesCobrarClientesSuspendidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesSuspendidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclientessuspendidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.setVisible(true);
			
					
		} else {
			//this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclientessuspendidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesSuspendidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				if(cobrarclientessuspendidosAux.getId().equals(this.iIdNuevoCobrarClientesSuspendidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidoss) {
				if(cobrarclientessuspendidosAux.getId().equals(this.iIdNuevoCobrarClientesSuspendidos)) {
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
	
	public int getIndiceActualCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				if(cobrarclientessuspendidosAux.getId().equals(cobrarclientessuspendidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidoss) {
				if(cobrarclientessuspendidosAux.getId().equals(cobrarclientessuspendidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				if(cobrarclientessuspendidosAux.getCobrarClientesSuspendidosOriginal().getId().equals(cobrarclientessuspendidosOriginal.getId())) {
					existe=true;
					cobrarclientessuspendidosOriginal.setId(cobrarclientessuspendidosAux.getId());
					cobrarclientessuspendidosOriginal.setVersionRow(cobrarclientessuspendidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidoss) {
				if(cobrarclientessuspendidosAux.getCobrarClientesSuspendidosOriginal().getId().equals(cobrarclientessuspendidosOriginal.getId())) {
					existe=true;
					cobrarclientessuspendidosOriginal.setId(cobrarclientessuspendidosAux.getId());
					cobrarclientessuspendidosOriginal.setVersionRow(cobrarclientessuspendidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesSuspendidos(Boolean esParaCancelar) throws Exception {
		cobrarclientessuspendidossAux=new ArrayList<CobrarClientesSuspendidos>();
		cobrarclientessuspendidosAux=new CobrarClientesSuspendidos();
		
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
					if(cobrarclientessuspendidosAux.getId()<0) {
						cobrarclientessuspendidossAux.add(cobrarclientessuspendidosAux);
					}		
				}
				this.iIdNuevoCobrarClientesSuspendidos=0L;
				this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().removeAll(cobrarclientessuspendidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidoss) {
					if(cobrarclientessuspendidosAux.getId()<0) {
						cobrarclientessuspendidossAux.add(cobrarclientessuspendidosAux);
					}		
				}
				this.iIdNuevoCobrarClientesSuspendidos=0L;
				this.cobrarclientessuspendidoss.removeAll(cobrarclientessuspendidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesSuspendidos 
					&& this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size()>0
					) {
					cobrarclientessuspendidosAux=this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().get(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size() - 1);
				
					if(cobrarclientessuspendidosAux.getId()<0) {
						this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().remove(cobrarclientessuspendidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesSuspendidos && this.cobrarclientessuspendidoss.size()>0) {
					cobrarclientessuspendidosAux=this.cobrarclientessuspendidoss.get(this.cobrarclientessuspendidoss.size() - 1);
				
					if(cobrarclientessuspendidosAux.getId()<0) {
						this.cobrarclientessuspendidoss.remove(cobrarclientessuspendidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesSuspendidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclientessuspendidos.getId()<0) {
				this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().remove(this.cobrarclientessuspendidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclientessuspendidos.getId()<0) {
				this.cobrarclientessuspendidoss.remove(this.cobrarclientessuspendidos);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesSuspendidos(List<CobrarClientesSuspendidos> cobrarclientessuspendidossAux) throws Exception {
		CobrarClientesSuspendidosConstantesFunciones.setEstadosInicialesCobrarClientesSuspendidos(cobrarclientessuspendidossAux);
	}
	
	public void setEstadosInicialesCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidosAux) throws Exception {
		CobrarClientesSuspendidosConstantesFunciones.setEstadosInicialesCobrarClientesSuspendidos(cobrarclientessuspendidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesSuspendidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesSuspendidosActual()) {
				if(!this.isEsNuevoCobrarClientesSuspendidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesSuspendidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesSuspendidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Suspendidos ?", "MANTENIMIENTO DE Cobrar Clientes Suspendidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesSuspendidos cobrarclientessuspendidos) throws Exception {
		CobrarClientesSuspendidosConstantesFunciones.seleccionarAsignar(this.cobrarclientessuspendidos,cobrarclientessuspendidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesSuspendidos=this.isPermisoActualizarOriginalCobrarClientesSuspendidos;
			
			
			this.seleccionarAsignar(cobrarclientessuspendidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclientessuspendidosSessionBean.setsFuncionBusquedaRapida(this.cobrarclientessuspendidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesSuspendidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesSuspendidos(esParaCancelar);				
				this.cancelarNuevoCobrarClientesSuspendidos(esParaCancelar);								
			}
			
			this.cobrarclientessuspendidos=new CobrarClientesSuspendidos();
			
			this.inicializarCobrarClientesSuspendidos();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesSuspendidos() throws Exception {
		try {
			CobrarClientesSuspendidosConstantesFunciones.inicializarCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesSuspendidoss(String sAccionBusqueda,List<CobrarClientesSuspendidos> cobrarclientessuspendidossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesSuspendidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesSuspendidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesSuspendidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesSuspendidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Suspendidoses");		
		parameters.put("busquedapor", CobrarClientesSuspendidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesSuspendidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesSuspendidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesSuspendidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesSuspendidos=new JRBeanArrayDataSource(CobrarClientesSuspendidosJInternalFrame.TraerCobrarClientesSuspendidosBeans(cobrarclientessuspendidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesSuspendidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesSuspendidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesSuspendidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesSuspendidosBean.TraerCobrarClientesSuspendidosBeans(cobrarclientessuspendidossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidosActionPerformed(null);
					//this.generarExcelReporteCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesSuspendidoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientessuspendidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesSuspendidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSuspendidos> cobrarclientessuspendidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSuspendidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesSuspendidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesSuspendidos cobrarclientessuspendidos : cobrarclientessuspendidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesSuspendidosConstantesFunciones.generarExcelReporteDataCobrarClientesSuspendidos("NORMAL",row,workbook,cobrarclientessuspendidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesSuspendidos(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesSuspendidosConstantesFunciones.generarExcelReporteHeaderCobrarClientesSuspendidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesSuspendidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSuspendidos> cobrarclientessuspendidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSuspendidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesSuspendidos cobrarclientessuspendidos : cobrarclientessuspendidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.getCobrarClientesSuspendidosDescripcion(cobrarclientessuspendidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getid_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getnombre_comercial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getdetalle_estado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.gettelefono_telefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientessuspendidos.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesSuspendidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesSuspendidos> cobrarclientessuspendidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesSuspendidos> cobrarclientessuspendidossRespaldo=null;
		
		classes=CobrarClientesSuspendidosConstantesFunciones.getClassesRelationshipsOfCobrarClientesSuspendidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclientessuspendidosLogic.setDatosCliente(this.datosCliente);
		this.cobrarclientessuspendidosLogic.setDatosDeep(this.datosDeep);
		this.cobrarclientessuspendidosLogic.setIsConDeep(true);
		
		cobrarclientessuspendidossRespaldo=this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss();
		
		this.cobrarclientessuspendidosLogic.setCobrarClientesSuspendidoss(cobrarclientessuspendidossParaReportes);	
		this.cobrarclientessuspendidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclientessuspendidossParaReportes=this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss();
		this.cobrarclientessuspendidosLogic.setCobrarClientesSuspendidoss(cobrarclientessuspendidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesSuspendidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesSuspendidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesSuspendidos cobrarclientessuspendidos : cobrarclientessuspendidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesSuspendidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesSuspendidosConstantesFunciones.generarExcelReporteDataCobrarClientesSuspendidos("NORMAL",row,workbook,cobrarclientessuspendidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.getCobrarClientesSuspendidosDescripcion(cobrarclientessuspendidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesSuspendidos() throws Exception {		
		this.startProcessCobrarClientesSuspendidos(true);
	}
	
	public void startProcessCobrarClientesSuspendidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesSuspendidos ,this.jPanelParametrosReportesCobrarClientesSuspendidos, this.jScrollPanelDatosCobrarClientesSuspendidos,this.jPanelPaginacionCobrarClientesSuspendidos, this.jScrollPanelDatosEdicionCobrarClientesSuspendidos, this.jPanelAccionesCobrarClientesSuspendidos,this.jPanelAccionesFormularioCobrarClientesSuspendidos,this.jmenuBarCobrarClientesSuspendidos,this.jmenuBarDetalleCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesSuspendidos=this.jTabbedPaneBusquedasCobrarClientesSuspendidos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesSuspendidos=this.jPanelParametrosReportesCobrarClientesSuspendidos;
		//final JScrollPane jScrollPanelDatosCobrarClientesSuspendidos=this.jScrollPanelDatosCobrarClientesSuspendidos;
		final JTable jTableDatosCobrarClientesSuspendidos=this.jTableDatosCobrarClientesSuspendidos;		
		final JPanel jPanelPaginacionCobrarClientesSuspendidos=this.jPanelPaginacionCobrarClientesSuspendidos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesSuspendidos=this.jScrollPanelDatosEdicionCobrarClientesSuspendidos;
		final JPanel jPanelAccionesCobrarClientesSuspendidos=this.jPanelAccionesCobrarClientesSuspendidos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesSuspendidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			jPanelCamposAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelCamposCobrarClientesSuspendidos;
			jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelAccionesFormularioCobrarClientesSuspendidos;
		}
		
		final JPanel jPanelCamposCobrarClientesSuspendidos=jPanelCamposAuxiliarCobrarClientesSuspendidos;
		final JPanel jPanelAccionesFormularioCobrarClientesSuspendidos=jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos;
		
		
		final JMenuBar jmenuBarCobrarClientesSuspendidos=this.jmenuBarCobrarClientesSuspendidos;
		final JToolBar jTtoolBarCobrarClientesSuspendidos=this.jTtoolBarCobrarClientesSuspendidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesSuspendidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jmenuBarDetalleCobrarClientesSuspendidos;
			jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTtoolBarDetalleCobrarClientesSuspendidos;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesSuspendidos=jmenuBarDetalleAuxiliarCobrarClientesSuspendidos;
		final JToolBar jTtoolBarDetalleCobrarClientesSuspendidos=jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesSuspendidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesSuspendidos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesSuspendidos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesSuspendidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesSuspendidos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesSuspendidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesSuspendidos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesSuspendidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesSuspendidos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesSuspendidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesSuspendidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesSuspendidos ,jPanelParametrosReportesCobrarClientesSuspendidos,jTableDatosCobrarClientesSuspendidos, /*jScrollPanelDatosCobrarClientesSuspendidos,*/jPanelCamposCobrarClientesSuspendidos,jPanelPaginacionCobrarClientesSuspendidos, /*jScrollPanelDatosEdicionCobrarClientesSuspendidos,*/ jPanelAccionesCobrarClientesSuspendidos,jPanelAccionesFormularioCobrarClientesSuspendidos,jmenuBarCobrarClientesSuspendidos,jmenuBarDetalleCobrarClientesSuspendidos,jTtoolBarCobrarClientesSuspendidos,jTtoolBarDetalleCobrarClientesSuspendidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesSuspendidos ,jPanelParametrosReportesCobrarClientesSuspendidos, jScrollPanelDatosCobrarClientesSuspendidos,jPanelPaginacionCobrarClientesSuspendidos, jScrollPanelDatosEdicionCobrarClientesSuspendidos, jPanelAccionesCobrarClientesSuspendidos,jPanelAccionesFormularioCobrarClientesSuspendidos,jmenuBarCobrarClientesSuspendidos,jmenuBarDetalleCobrarClientesSuspendidos,jTtoolBarCobrarClientesSuspendidos,jTtoolBarDetalleCobrarClientesSuspendidos);
						
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
	
	public void finishProcessCobrarClientesSuspendidos() {// throws Exception 
		this.finishProcessCobrarClientesSuspendidos(true);
	}
	
	public void finishProcessCobrarClientesSuspendidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesSuspendidos ,this.jPanelParametrosReportesCobrarClientesSuspendidos, this.jScrollPanelDatosCobrarClientesSuspendidos,this.jPanelPaginacionCobrarClientesSuspendidos, this.jScrollPanelDatosEdicionCobrarClientesSuspendidos, this.jPanelAccionesCobrarClientesSuspendidos,this.jPanelAccionesFormularioCobrarClientesSuspendidos,this.jmenuBarCobrarClientesSuspendidos,this.jmenuBarDetalleCobrarClientesSuspendidos,this.jTtoolBarCobrarClientesSuspendidos,this.jTtoolBarDetalleCobrarClientesSuspendidos);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesSuspendidos=this.jTabbedPaneBusquedasCobrarClientesSuspendidos; 
		
		final JPanel jPanelParametrosReportesCobrarClientesSuspendidos=this.jPanelParametrosReportesCobrarClientesSuspendidos;
		//final JScrollPane jScrollPanelDatosCobrarClientesSuspendidos=this.jScrollPanelDatosCobrarClientesSuspendidos;
		final JTable jTableDatosCobrarClientesSuspendidos=this.jTableDatosCobrarClientesSuspendidos;		
		final JPanel jPanelPaginacionCobrarClientesSuspendidos=this.jPanelPaginacionCobrarClientesSuspendidos;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesSuspendidos=this.jScrollPanelDatosEdicionCobrarClientesSuspendidos;
		final JPanel jPanelAccionesCobrarClientesSuspendidos=this.jPanelAccionesCobrarClientesSuspendidos;
		
		JPanel jPanelCamposAuxiliarCobrarClientesSuspendidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			jPanelCamposAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelCamposCobrarClientesSuspendidos;
			jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelAccionesFormularioCobrarClientesSuspendidos;
		}
		
		final JPanel jPanelCamposCobrarClientesSuspendidos=jPanelCamposAuxiliarCobrarClientesSuspendidos;
		final JPanel jPanelAccionesFormularioCobrarClientesSuspendidos=jPanelAccionesFormularioAuxiliarCobrarClientesSuspendidos;
		
		
		final JMenuBar jmenuBarCobrarClientesSuspendidos=this.jmenuBarCobrarClientesSuspendidos;		
		final JToolBar jTtoolBarCobrarClientesSuspendidos=this.jTtoolBarCobrarClientesSuspendidos;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesSuspendidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jmenuBarDetalleCobrarClientesSuspendidos;
			jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTtoolBarDetalleCobrarClientesSuspendidos;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesSuspendidos=jmenuBarDetalleAuxiliarCobrarClientesSuspendidos;
		final JToolBar jTtoolBarDetalleCobrarClientesSuspendidos=jTtoolBarDetalleAuxiliarCobrarClientesSuspendidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesSuspendidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesSuspendidos;
			processRunnable.jTableDatos=jTableDatosCobrarClientesSuspendidos;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesSuspendidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesSuspendidos;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesSuspendidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesSuspendidos;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesSuspendidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesSuspendidos;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesSuspendidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesSuspendidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesSuspendidos ,jPanelParametrosReportesCobrarClientesSuspendidos, jTableDatosCobrarClientesSuspendidos,/*jScrollPanelDatosCobrarClientesSuspendidos,*/jPanelCamposCobrarClientesSuspendidos,jPanelPaginacionCobrarClientesSuspendidos, /*jScrollPanelDatosEdicionCobrarClientesSuspendidos,*/ jPanelAccionesCobrarClientesSuspendidos,jPanelAccionesFormularioCobrarClientesSuspendidos,jmenuBarCobrarClientesSuspendidos,jmenuBarDetalleCobrarClientesSuspendidos,jTtoolBarCobrarClientesSuspendidos,jTtoolBarDetalleCobrarClientesSuspendidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesSuspendidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesSuspendidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesSuspendidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesSuspendidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesSuspendidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesSuspendidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesSuspendidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesSuspendidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesSuspendidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclientessuspendidosConstantesFunciones.getsFinalQueryCobrarClientesSuspendidos();
		String  finalQueryPaginacionTodos=this.cobrarclientessuspendidosConstantesFunciones.getsFinalQueryCobrarClientesSuspendidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesSuspendidosConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesSuspendidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesSuspendidosConstantesFunciones.getArrayColumnasGlobalesCobrarClientesSuspendidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesSuspendidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclientessuspendidossEliminados= new ArrayList<CobrarClientesSuspendidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesSuspendidos();
		
				///*CobrarClientesSuspendidosSessionBean*/this.cobrarclientessuspendidosSessionBean=new CobrarClientesSuspendidosSessionBean();
			
			if(this.cobrarclientessuspendidosSessionBean==null) {
				this.cobrarclientessuspendidosSessionBean=new CobrarClientesSuspendidosSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesSuspendidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesSuspendidosConstantesFunciones.getClassesForeignKeysOfCobrarClientesSuspendidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclientessuspendidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclientessuspendidossAux= new ArrayList<CobrarClientesSuspendidos>();
			
				
			cobrarclientessuspendidosLogic.setDatosCliente(this.datosCliente);
			cobrarclientessuspendidosLogic.setDatosDeep(this.datosDeep);
			cobrarclientessuspendidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesSuspendidos")) {
				this.sDetalleReporte=CobrarClientesSuspendidosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSuspendidos(idBusquedaCobrarClientesSuspendidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclientessuspendidosLogic.getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarClientesSuspendidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesSuspendidosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSuspendidos(idBusquedaCobrarClientesSuspendidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesSuspendidosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSuspendidos(idBusquedaCobrarClientesSuspendidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()==null||cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclientessuspendidoss==null|| cobrarclientessuspendidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessuspendidossAux=new ArrayList<CobrarClientesSuspendidos>();
						cobrarclientessuspendidossAux.addAll(cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessuspendidossAux=new ArrayList<CobrarClientesSuspendidos>();
							cobrarclientessuspendidossAux.addAll(cobrarclientessuspendidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclientessuspendidosLogic.getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarClientesSuspendidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesSuspendidosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSuspendidos(idBusquedaCobrarClientesSuspendidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesSuspendidosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesSuspendidos(idBusquedaCobrarClientesSuspendidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesSuspendidoss("BusquedaCobrarClientesSuspendidos",cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesSuspendidoss("BusquedaCobrarClientesSuspendidos",cobrarclientessuspendidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessuspendidosLogic.setCobrarClientesSuspendidoss(new ArrayList<CobrarClientesSuspendidos>());
						cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().addAll(cobrarclientessuspendidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessuspendidoss=new ArrayList<CobrarClientesSuspendidos>();
							cobrarclientessuspendidoss.addAll(cobrarclientessuspendidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesSuspendidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesSuspendidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessuspendidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientessuspendidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesSuspendidos cobrarclientessuspendidos) {
		Boolean permite=true;
		
		if(this.cobrarclientessuspendidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesSuspendidosConstantesFunciones.getOrderByListaCobrarClientesSuspendidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesSuspendidosConstantesFunciones.getOrderByListaCobrarClientesSuspendidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				if(cobrarclientessuspendidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessuspendidosTotales=cobrarclientessuspendidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidos:this.cobrarclientessuspendidoss) {
				if(cobrarclientessuspendidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessuspendidosTotales=cobrarclientessuspendidos;
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
			this.cobrarclientessuspendidosAux=new CobrarClientesSuspendidos();
			this.cobrarclientessuspendidosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclientessuspendidosAux.setIsNew(false);
			this.cobrarclientessuspendidosAux.setIsChanged(false);
			this.cobrarclientessuspendidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesSuspendidosConstantesFunciones.TotalizarValoresFilaCobrarClientesSuspendidos(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss(),this.cobrarclientessuspendidosAux);
				
				//this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().add(this.cobrarclientessuspendidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesSuspendidosConstantesFunciones.TotalizarValoresFilaCobrarClientesSuspendidos(this.cobrarclientessuspendidoss,this.cobrarclientessuspendidosAux);
				
				this.cobrarclientessuspendidoss.add(this.cobrarclientessuspendidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclientessuspendidosTotales=new CobrarClientesSuspendidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().remove(cobrarclientessuspendidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientessuspendidoss.remove(cobrarclientessuspendidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclientessuspendidosTotales=new CobrarClientesSuspendidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				if(cobrarclientessuspendidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessuspendidosTotales=cobrarclientessuspendidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesSuspendidosConstantesFunciones.TotalizarValoresFilaCobrarClientesSuspendidos(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss(),cobrarclientessuspendidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesSuspendidos cobrarclientessuspendidos:this.cobrarclientessuspendidoss) {
				if(cobrarclientessuspendidos.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientessuspendidosTotales=cobrarclientessuspendidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesSuspendidosConstantesFunciones.TotalizarValoresFilaCobrarClientesSuspendidos(this.cobrarclientessuspendidoss,cobrarclientessuspendidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesSuspendidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientessuspendidosLogic.getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos(sFinalQuery,this.pagination,id);
				
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
	
	public void inicializarPermisosCobrarClientesSuspendidos() {
		this.isPermisoTodoCobrarClientesSuspendidos=false;
		this.isPermisoNuevoCobrarClientesSuspendidos=false;
		this.isPermisoActualizarCobrarClientesSuspendidos=false;
		this.isPermisoActualizarOriginalCobrarClientesSuspendidos=false;
		this.isPermisoEliminarCobrarClientesSuspendidos=false;
		this.isPermisoGuardarCambiosCobrarClientesSuspendidos=false;
		this.isPermisoConsultaCobrarClientesSuspendidos=true;
		this.isPermisoBusquedaCobrarClientesSuspendidos=true;
		this.isPermisoReporteCobrarClientesSuspendidos=true;
		this.isPermisoOrdenCobrarClientesSuspendidos=false;		
		this.isPermisoPaginacionMedioCobrarClientesSuspendidos=false;		
		this.isPermisoPaginacionAltoCobrarClientesSuspendidos=false;		
		this.isPermisoPaginacionTodoCobrarClientesSuspendidos=false;		
		this.isPermisoCopiarCobrarClientesSuspendidos=false;		
		this.isPermisoVerFormCobrarClientesSuspendidos=false;		
		this.isPermisoDuplicarCobrarClientesSuspendidos=false;
		this.isPermisoOrdenCobrarClientesSuspendidos=false;
	}
	
	public void setPermisosUsuarioCobrarClientesSuspendidos(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesSuspendidos=isPermiso;
		this.isPermisoNuevoCobrarClientesSuspendidos=isPermiso;
		this.isPermisoActualizarCobrarClientesSuspendidos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesSuspendidos=isPermiso;
		this.isPermisoEliminarCobrarClientesSuspendidos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesSuspendidos=isPermiso;
		this.isPermisoConsultaCobrarClientesSuspendidos=isPermiso;
		this.isPermisoBusquedaCobrarClientesSuspendidos=isPermiso;
		this.isPermisoReporteCobrarClientesSuspendidos=isPermiso;
		this.isPermisoOrdenCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoCopiarCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoVerFormCobrarClientesSuspendidos=isPermiso;		
		this.isPermisoDuplicarCobrarClientesSuspendidos=isPermiso;
		this.isPermisoOrdenCobrarClientesSuspendidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesSuspendidos(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesSuspendidos=isPermiso;
		this.isPermisoNuevoCobrarClientesSuspendidos=isPermiso;
		this.isPermisoActualizarCobrarClientesSuspendidos=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesSuspendidos=isPermiso;
		this.isPermisoEliminarCobrarClientesSuspendidos=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesSuspendidos=isPermiso;
		//this.isPermisoConsultaCobrarClientesSuspendidos=isPermiso;
		//this.isPermisoBusquedaCobrarClientesSuspendidos=isPermiso;
		//this.isPermisoReporteCobrarClientesSuspendidos=isPermiso;
		//this.isPermisoOrdenCobrarClientesSuspendidos=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesSuspendidos=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesSuspendidos=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesSuspendidos=isPermiso;		
		//this.isPermisoCopiarCobrarClientesSuspendidos=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesSuspendidos=isPermiso;
		//this.isPermisoOrdenCobrarClientesSuspendidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesSuspendidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesSuspendidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesSuspendidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesSuspendidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesSuspendidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesSuspendidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesSuspendidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesSuspendidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesSuspendidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesSuspendidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesSuspendidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesSuspendidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesSuspendidos=this.isPermisoActualizarCobrarClientesSuspendidos;
			this.isPermisoEliminarCobrarClientesSuspendidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesSuspendidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesSuspendidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesSuspendidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesSuspendidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesSuspendidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesSuspendidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesSuspendidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesSuspendidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesSuspendidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesSuspendidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesSuspendidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesSuspendidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesSuspendidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesSuspendidos.setToolTipText(this.jTableDatosCobrarClientesSuspendidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesSuspendidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesSuspendidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesSuspendidos() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyCobrarClientesSuspendidosListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesSuspendidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesSuspendidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesSuspendidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyCobrarClientesSuspendidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesSuspendidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesSuspendidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSuspendidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesSuspendidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesSuspendidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesSuspendidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesSuspendidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesSuspendidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesSuspendidos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesSuspendidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesSuspendidos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public CobrarClientesSuspendidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesSuspendidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesSuspendidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclientessuspendidosSessionBean=new CobrarClientesSuspendidosSessionBean(); 
		this.cobrarclientessuspendidosConstantesFunciones=new CobrarClientesSuspendidosConstantesFunciones(); 
		this.cobrarclientessuspendidosBean=new CobrarClientesSuspendidos();//(this.cobrarclientessuspendidosConstantesFunciones); 		
		this.cobrarclientessuspendidosReturnGeneral=new CobrarClientesSuspendidosParameterReturnGeneral(); 
		
		this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientessuspendidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesSuspendidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesSuspendidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesSuspendidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesSuspendidos(true);
			
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
			
			this.cobrarclientessuspendidosConstantesFunciones=new CobrarClientesSuspendidosConstantesFunciones(); 
			this.cobrarclientessuspendidosBean=new CobrarClientesSuspendidos();//this.cobrarclientessuspendidosConstantesFunciones); 			
			this.cobrarclientessuspendidosReturnGeneral=new CobrarClientesSuspendidosParameterReturnGeneral(); 
		
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Suspendidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarclientessuspendidos=new CobrarClientesSuspendidos();
			this.cobrarclientessuspendidoss = new ArrayList<CobrarClientesSuspendidos>();
			this.cobrarclientessuspendidossAux = new ArrayList<CobrarClientesSuspendidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic=new CobrarClientesSuspendidosLogic();
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclientessuspendidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclientessuspendidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesSuspendidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesSuspendidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesSuspendidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesSuspendidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesSuspendidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesSuspendidos);
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos);
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesSuspendidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesSuspendidos);
					this.jInternalFrameImportacionCobrarClientesSuspendidos.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesSuspendidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesSuspendidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesSuspendidos);
					this.jInternalFrameOrderByCobrarClientesSuspendidos.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesSuspendidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesSuspendidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesSuspendidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclientessuspendidosReturnGeneral=new CobrarClientesSuspendidosParameterReturnGeneral();
			
			this.cobrarclientessuspendidosParameterGeneral=new CobrarClientesSuspendidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclientessuspendidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesSuspendidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesSuspendidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesSuspendidos=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesSuspendidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesSuspendidos(false);
			
			this.setPermisosUsuarioCobrarClientesSuspendidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado() && this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesSuspendidosClasesRelacionadas();
			}
			
			if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesSuspendidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesSuspendidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesSuspendidos();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesSuspendidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesSuspendidosConstantesFunciones.getTiposSeleccionarCobrarClientesSuspendidos());
				
				this.tiposColumnasSelect=CobrarClientesSuspendidosConstantesFunciones.getTiposSeleccionarCobrarClientesSuspendidos(true);
				
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
			//if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesSuspendidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,true,false);
				this.setAccionesUsuarioCobrarClientesSuspendidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,true,false);							
				this.setAccionesUsuarioCobrarClientesSuspendidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSuspendidos() ;
			
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
				cobrarclientessuspendidosImplementable= (CobrarClientesSuspendidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesSuspendidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclientessuspendidosImplementableHome= (CobrarClientesSuspendidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesSuspendidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclientessuspendidoss= new ArrayList<CobrarClientesSuspendidos>();
			this.cobrarclientessuspendidossEliminados= new ArrayList<CobrarClientesSuspendidos>();
						
			this.isEsNuevoCobrarClientesSuspendidos=false;
			this.esParaAccionDesdeFormularioCobrarClientesSuspendidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesSuspendidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesSuspendidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesSuspendidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesSuspendidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesSuspendidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesSuspendidos();
			}
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesSuspendidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesSuspendidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesSuspendidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesSuspendidos")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesSuspendidos();	
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
	
	public void cargarCombosForeignKeyCobrarClientesSuspendidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesSuspendidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesSuspendidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesSuspendidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesSuspendidos();
		
		this.cargarCombosFrameForeignKeyCobrarClientesSuspendidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesSuspendidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesSuspendidos();
		}
	}
	
	
	
	public void jButtonNuevoCobrarClientesSuspendidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			
			if(jTableDatosCobrarClientesSuspendidos.getRowCount()>=1) {
				jTableDatosCobrarClientesSuspendidos.removeRowSelectionInterval(0, jTableDatosCobrarClientesSuspendidos.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesSuspendidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesSuspendidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(true);			
			//this.cobrarclientessuspendidos=new CobrarClientesSuspendidos();
			//this.cobrarclientessuspendidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos() ;
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSuspendidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclientessuspendidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);				
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesSuspendidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesSuspendidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesSuspendidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesSuspendidos.getSelectedRows().length;			
			}
			
			cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesSuspendidos--;			
				//CobrarClientesSuspendidos cobrarclientessuspendidosAux= new CobrarClientesSuspendidos();			
				//cobrarclientessuspendidosAux.setId(this.iIdNuevoCobrarClientesSuspendidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesSuspendidos cobrarclientessuspendidosOrigen=new CobrarClientesSuspendidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesSuspendidos cobrarclientessuspendidosOrigen : cobrarclientessuspendidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclientessuspendidosOrigen =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientessuspendidosOrigen =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesSuspendidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclientessuspendidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesSuspendidos(cobrarclientessuspendidosOrigen,this.cobrarclientessuspendidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().add(this.cobrarclientessuspendidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidoss.add(this.cobrarclientessuspendidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
				
				this.jTableDatosCobrarClientesSuspendidos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSuspendidos(), this.getIndiceNuevoCobrarClientesSuspendidos());
				
				int iLastRow =  this.jTableDatosCobrarClientesSuspendidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesSuspendidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesSuspendidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();									
		
			CobrarClientesSuspendidos cobrarclientessuspendidosOrigen=new CobrarClientesSuspendidos();
			CobrarClientesSuspendidos cobrarclientessuspendidosDestino=new CobrarClientesSuspendidos();
				
			cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesSuspendidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclientessuspendidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesSuspendidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessuspendidosOrigen =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientessuspendidosOrigen =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientessuspendidosDestino =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientessuspendidosDestino =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclientessuspendidosOrigen =cobrarclientessuspendidossSeleccionados.get(0);
				cobrarclientessuspendidosDestino =cobrarclientessuspendidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesSuspendidos(cobrarclientessuspendidosOrigen,cobrarclientessuspendidosDestino,true,false);
				
				cobrarclientessuspendidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclientessuspendidosDestino,cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclientessuspendidosDestino,cobrarclientessuspendidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
				
				//this.jTableDatosCobrarClientesSuspendidos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSuspendidos(), this.getIndiceNuevoCobrarClientesSuspendidos());
				
				int iLastRow =  this.jTableDatosCobrarClientesSuspendidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesSuspendidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesSuspendidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesSuspendidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesSuspendidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesSuspendidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesSuspendidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesSuspendidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesSuspendidos();
			
			this.abrirFrameOrderByCobrarClientesSuspendidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesSuspendidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesSuspendidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesSuspendidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSize(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesSuspendidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesSuspendidos.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jContentPaneDetalleCobrarClientesSuspendidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jContentPaneDetalleCobrarClientesSuspendidos.getWidth(),CobrarClientesSuspendidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jContentPaneDetalleCobrarClientesSuspendidos.getWidth(),CobrarClientesSuspendidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jContentPaneDetalleCobrarClientesSuspendidos.getWidth(),CobrarClientesSuspendidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesSuspendidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesSuspendidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesSuspendidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSuspendidos,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesSuspendidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesSuspendidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesSuspendidos);
				this.jInternalFrameOrderByCobrarClientesSuspendidos.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesSuspendidos.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesSuspendidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesSuspendidos"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesSuspendidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesSuspendidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesSuspendidos==null) {
				
				this.jInternalFrameImportacionCobrarClientesSuspendidos=new ImportacionJInternalFrame(CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesSuspendidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesSuspendidos);
				this.jInternalFrameImportacionCobrarClientesSuspendidos.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesSuspendidos.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesSuspendidos"));
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesSuspendidos"));
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesSuspendidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesSuspendidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos=new ReporteDinamicoJInternalFrame(CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos);
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSuspendidos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSuspendidos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSuspendidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSuspendidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesSuspendidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesSuspendidos);
			
	       	this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesSuspendidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesSuspendidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesSuspendidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesSuspendidos.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesSuspendidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesSuspendidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesSuspendidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesSuspendidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesSuspendidos.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesSuspendidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesSuspendidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesSuspendidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesSuspendidos.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesSuspendidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesSuspendidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesSuspendidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(true);
			//this.isEsNuevoCobrarClientesSuspendidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false) ;
			
			if(cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSuspendidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesSuspendidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesSuspendidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(true);
			//this.isEsNuevoCobrarClientesSuspendidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclientessuspendidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false) ;
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesSuspendidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesSuspendidos(false);
			
			//if(!this.isEsNuevoCobrarClientesSuspendidos) {								
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclientessuspendidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesSuspendidos=true;
					this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
					this.isEsNuevoCobrarClientesSuspendidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesSuspendidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesSuspendidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(false);
			
												
				
				if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesSuspendidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,cobrarclientessuspendidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesSuspendidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclientessuspendidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclientessuspendidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientessuspendidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientessuspendidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclientessuspendidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesSuspendidosModel) this.jTableDatosCobrarClientesSuspendidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesSuspendidos=true;
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
				this.isEsNuevoCobrarClientesSuspendidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(false);
				
				
				
				if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesSuspendidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesSuspendidos.getRowCount()>=1) {
				jTableDatosCobrarClientesSuspendidos.removeRowSelectionInterval(0, jTableDatosCobrarClientesSuspendidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesSuspendidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(false) ;
			
			this.isEsNuevoCobrarClientesSuspendidos=false;
			
			if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesSuspendidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				
				//SI ES MANUAL
				if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesSuspendidos--;			
			//CobrarClientesSuspendidos cobrarclientessuspendidosAux= new CobrarClientesSuspendidos();			
			//cobrarclientessuspendidosAux.setId(this.iIdNuevoCobrarClientesSuspendidos);
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesSuspendidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
			
			this.cobrarclientessuspendidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().add(this.cobrarclientessuspendidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclientessuspendidoss.add(this.cobrarclientessuspendidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			
			this.jTableDatosCobrarClientesSuspendidos.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesSuspendidos(), this.getIndiceNuevoCobrarClientesSuspendidos());
			
			int iLastRow =  this.jTableDatosCobrarClientesSuspendidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesSuspendidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesSuspendidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();
			}
			
			//this.abrirFrameTreeCobrarClientesSuspendidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesSuspendidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesSuspendidos.setFileImportacion(this.jInternalFrameImportacionCobrarClientesSuspendidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesSuspendidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesSuspendidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		

		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesSuspendidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesSuspendidosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreComercial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreComercial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreComercial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreComercial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talleEstado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talleEstado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talleEstado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talleEstado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoria="nombre_comercial";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO:
					sNombreCampoCategoria="detalle_estado";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					sNombreCampoCategoriaValor="nombre_comercial";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO:
					sNombreCampoCategoriaValor="detalle_estado";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Comercial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_comercial");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle_estado");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesSuspendidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getid_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getnombre_comercial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getdetalle_estado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.gettelefono_telefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(CobrarClientesSuspendidos cobrarclientessuspendidos:cobrarclientessuspendidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientessuspendidos.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesSuspendidos(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesSuspendidos(cobrarclientessuspendidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
			
			//SI ES MANUAL
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesSuspendidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesSuspendidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesSuspendidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesSuspendidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesSuspendidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesSuspendidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesSuspendidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesSuspendidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesSuspendidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesSuspendidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesSuspendidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesSuspendidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesSuspendidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSuspendidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesSuspendidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesSuspendidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesSuspendidos();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesSuspendidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSuspendidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSuspendidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSuspendidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesSuspendidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionNuevoCobrarClientesSuspendidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionSinCerrarCobrarClientesSuspendidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jCheckBoxPostAccionSinMensajeCobrarClientesSuspendidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesSuspendidos(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesSuspendidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesSuspendidos() throws Exception {
		try	{
			if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesSuspendidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesSuspendidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesSuspendidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesSuspendidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesSuspendidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesSuspendidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.addItem(reporte);
			}
			
			
			if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesSuspendidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesSuspendidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSuspendidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesSuspendidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarClientesSuspendidosConstantesFunciones.getTiposSeleccionarCobrarClientesSuspendidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarClientesSuspendidosConstantesFunciones.getTiposSeleccionarCobrarClientesSuspendidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarClientesSuspendidosConstantesFunciones.getTiposSeleccionarCobrarClientesSuspendidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesSuspendidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaCobrarClientesSuspendidos=Long.parseLong(this.jLabelidCobrarClientesSuspendidosBusquedaCobrarClientesSuspendidos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesSuspendidos(Boolean esInicializar) throws Exception {				
		if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesSuspendidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesSuspendidos() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesSuspendidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesSuspendidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesSuspendidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclientessuspendidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesSuspendidos.setModel(new CobrarClientesSuspendidosModel(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesSuspendidos.setModel(new CobrarClientesSuspendidosModel(this.cobrarclientessuspendidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesSuspendidos!=null && this.jInternalFrameOrderByCobrarClientesSuspendidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesSuspendidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,cobrarclientessuspendidosConstantesFunciones.resaltarSeleccionarCobrarClientesSuspendidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesSuspendidosConstantesFunciones.SCLASSWEBTITULO,cobrarclientessuspendidosConstantesFunciones.resaltarSeleccionarCobrarClientesSuspendidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_ciudadCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_ciudadCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_ciudadCobrarClientesSuspendidos,iSizeTabla,this,true,"nombre_ciudadCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_ciudadCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_ciudadCobrarClientesSuspendidos,this,true,"nombre_ciudadCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarcodigoCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarcodigoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarcodigoCobrarClientesSuspendidos,iSizeTabla,this,true,"codigoCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarcodigoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarcodigoCobrarClientesSuspendidos,this,true,"codigoCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_completoCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_completoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_completoCobrarClientesSuspendidos,iSizeTabla,this,true,"nombre_completoCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_completoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_completoCobrarClientesSuspendidos,this,true,"nombre_completoCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_comercialCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_comercialCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_comercialCobrarClientesSuspendidos,iSizeTabla,this,true,"nombre_comercialCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_comercialCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarnombre_comercialCobrarClientesSuspendidos,this,true,"nombre_comercialCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarrucCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarrucCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarrucCobrarClientesSuspendidos,iSizeTabla,this,true,"rucCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarrucCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarrucCobrarClientesSuspendidos,this,true,"rucCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrardetalle_estadoCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltardetalle_estadoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activardetalle_estadoCobrarClientesSuspendidos,iSizeTabla,this,true,"detalle_estadoCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltardetalle_estadoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activardetalle_estadoCobrarClientesSuspendidos,this,true,"detalle_estadoCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrardireccion_direccionCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltardireccion_direccionCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activardireccion_direccionCobrarClientesSuspendidos,iSizeTabla,this,true,"direccion_direccionCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltardireccion_direccionCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activardireccion_direccionCobrarClientesSuspendidos,this,true,"direccion_direccionCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrartelefono_telefonoCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltartelefono_telefonoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activartelefono_telefonoCobrarClientesSuspendidos,iSizeTabla,this,true,"telefono_telefonoCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltartelefono_telefonoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activartelefono_telefonoCobrarClientesSuspendidos,this,true,"telefono_telefonoCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO));

		if(this.cobrarclientessuspendidosConstantesFunciones.mostrarsaldoCobrarClientesSuspendidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarsaldoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarsaldoCobrarClientesSuspendidos,iSizeTabla,this,true,"saldoCobrarClientesSuspendidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientessuspendidosConstantesFunciones.resaltarsaldoCobrarClientesSuspendidos,this.cobrarclientessuspendidosConstantesFunciones.activarsaldoCobrarClientesSuspendidos,this,true,"saldoCobrarClientesSuspendidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesSuspendidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesSuspendidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesSuspendidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesSuspendidos.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesSuspendidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesSuspendidos.moveColumn(this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesSuspendidos.moveColumn(this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesSuspendidos.moveColumn(this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesSuspendidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesSuspendidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesSuspendidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesSuspendidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesSuspendidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesSuspendidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclientessuspendidoss.size()-1;
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
		//this.jTableDatosCobrarClientesSuspendidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesSuspendidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesSuspendidos();
			
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
				
				//this.isEsNuevoCobrarClientesSuspendidos=false;
					
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
				if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesSuspendidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclientessuspendidos.getsType().equals("DUPLICADO")
				   || this.cobrarclientessuspendidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesSuspendidos=true;
				
				} else {
					this.isEsNuevoCobrarClientesSuspendidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclientessuspendidos.getId()>=0 && !this.cobrarclientessuspendidos.getIsNew()) {						
						this.isEsNuevoCobrarClientesSuspendidos=false;
						
					} else {
						this.isEsNuevoCobrarClientesSuspendidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesSuspendidos(esRelaciones);						
				
				this.seleccionarCobrarClientesSuspendidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclientessuspendidos.getId()<0) {
					this.isEsNuevoCobrarClientesSuspendidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesSuspendidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesSuspendidos(evt,rowIndex);
				}	
				
				if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesSuspendidos: " + this.dDif); 
					}
				}								
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesSuspendidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclientessuspendidos)) {
					if(this.cobrarclientessuspendidos.getId()>0) {
						this.cobrarclientessuspendidos.setIsDeleted(true);
						
						this.cobrarclientessuspendidossEliminados.add(this.cobrarclientessuspendidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().remove(this.cobrarclientessuspendidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidoss.remove(this.cobrarclientessuspendidos);				
					}
					
					
					((CobrarClientesSuspendidosModel) this.jTableDatosCobrarClientesSuspendidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesSuspendidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesSuspendidos) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesSuspendidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesSuspendidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesSuspendidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesSuspendidos(cobrarclientessuspendidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(cobrarclientessuspendidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesSuspendidos(cobrarclientessuspendidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSuspendidos(cobrarclientessuspendidos);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getruc());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getdetalle_estado());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesSuspendidos cobrarclientessuspendidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclientessuspendidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesSuspendidos cobrarclientessuspendidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclientessuspendidosLocal=this.cobrarclientessuspendidos;
			} else {
				cobrarclientessuspendidosLocal=this.cobrarclientessuspendidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclientessuspendidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesSuspendidos(cobrarclientessuspendidosLocal,true);
					
					if(cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclientessuspendidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclientessuspendidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(cobrarclientessuspendidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(cobrarclientessuspendidos);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(cobrarclientessuspendidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			cobrarclientessuspendidos.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_ciudadCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setcodigo(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelcodigoCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setnombre_completo(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_completoCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setnombre_comercial(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelnombre_comercialCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setruc(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelrucCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setdetalle_estado(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldetalle_estadoCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeldireccion_direccionCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.settelefono_telefono(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabeltelefono_telefonoCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientessuspendidos.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelsaldoCobrarClientesSuspendidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidosBean,CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidosOrigen,CobrarClientesSuspendidos cobrarclientessuspendidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getId()!=null && !cobrarclientessuspendidosOrigen.getId().equals(0L))) {cobrarclientessuspendidos.setId(cobrarclientessuspendidosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getid_empresa()!=null && !cobrarclientessuspendidosOrigen.getid_empresa().equals(0L))) {cobrarclientessuspendidos.setid_empresa(cobrarclientessuspendidosOrigen.getid_empresa());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getnombre_ciudad()!=null && !cobrarclientessuspendidosOrigen.getnombre_ciudad().equals(""))) {cobrarclientessuspendidos.setnombre_ciudad(cobrarclientessuspendidosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getcodigo()!=null && !cobrarclientessuspendidosOrigen.getcodigo().equals(""))) {cobrarclientessuspendidos.setcodigo(cobrarclientessuspendidosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getnombre_completo()!=null && !cobrarclientessuspendidosOrigen.getnombre_completo().equals(""))) {cobrarclientessuspendidos.setnombre_completo(cobrarclientessuspendidosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getnombre_comercial()!=null && !cobrarclientessuspendidosOrigen.getnombre_comercial().equals(""))) {cobrarclientessuspendidos.setnombre_comercial(cobrarclientessuspendidosOrigen.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getruc()!=null && !cobrarclientessuspendidosOrigen.getruc().equals(""))) {cobrarclientessuspendidos.setruc(cobrarclientessuspendidosOrigen.getruc());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getdetalle_estado()!=null && !cobrarclientessuspendidosOrigen.getdetalle_estado().equals(""))) {cobrarclientessuspendidos.setdetalle_estado(cobrarclientessuspendidosOrigen.getdetalle_estado());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getdireccion_direccion()!=null && !cobrarclientessuspendidosOrigen.getdireccion_direccion().equals(""))) {cobrarclientessuspendidos.setdireccion_direccion(cobrarclientessuspendidosOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.gettelefono_telefono()!=null && !cobrarclientessuspendidosOrigen.gettelefono_telefono().equals(""))) {cobrarclientessuspendidos.settelefono_telefono(cobrarclientessuspendidosOrigen.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosOrigen.getsaldo()!=null && !cobrarclientessuspendidosOrigen.getsaldo().equals(0.0))) {cobrarclientessuspendidos.setsaldo(cobrarclientessuspendidosOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getruc());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getdetalle_estado());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setText(cobrarclientessuspendidos.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesSuspendidos(CobrarClientesSuspendidosBean cobrarclientessuspendidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getnombre_comercial());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getruc());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getdetalle_estado());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.gettelefono_telefono());
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setText(cobrarclientessuspendidosBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesSuspendidos(CobrarClientesSuspendidosParameterReturnGeneral cobrarclientessuspendidosReturnGeneral,CobrarClientesSuspendidosBean cobrarclientessuspendidosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesSuspendidos cobrarclientessuspendidosLocal=new CobrarClientesSuspendidos();
			
			cobrarclientessuspendidosLocal=cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos();
			
			
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getnombre_ciudad()!=null && !cobrarclientessuspendidosLocal.getnombre_ciudad().equals(""))) {cobrarclientessuspendidosBean.setnombre_ciudad(cobrarclientessuspendidosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getcodigo()!=null && !cobrarclientessuspendidosLocal.getcodigo().equals(""))) {cobrarclientessuspendidosBean.setcodigo(cobrarclientessuspendidosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getnombre_completo()!=null && !cobrarclientessuspendidosLocal.getnombre_completo().equals(""))) {cobrarclientessuspendidosBean.setnombre_completo(cobrarclientessuspendidosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getnombre_comercial()!=null && !cobrarclientessuspendidosLocal.getnombre_comercial().equals(""))) {cobrarclientessuspendidosBean.setnombre_comercial(cobrarclientessuspendidosLocal.getnombre_comercial());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getruc()!=null && !cobrarclientessuspendidosLocal.getruc().equals(""))) {cobrarclientessuspendidosBean.setruc(cobrarclientessuspendidosLocal.getruc());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getdetalle_estado()!=null && !cobrarclientessuspendidosLocal.getdetalle_estado().equals(""))) {cobrarclientessuspendidosBean.setdetalle_estado(cobrarclientessuspendidosLocal.getdetalle_estado());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getdireccion_direccion()!=null && !cobrarclientessuspendidosLocal.getdireccion_direccion().equals(""))) {cobrarclientessuspendidosBean.setdireccion_direccion(cobrarclientessuspendidosLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.gettelefono_telefono()!=null && !cobrarclientessuspendidosLocal.gettelefono_telefono().equals(""))) {cobrarclientessuspendidosBean.settelefono_telefono(cobrarclientessuspendidosLocal.gettelefono_telefono());}
			if(conDefault || (!conDefault && cobrarclientessuspendidosLocal.getsaldo()!=null && !cobrarclientessuspendidosLocal.getsaldo().equals(0.0))) {cobrarclientessuspendidosBean.setsaldo(cobrarclientessuspendidosLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesSuspendidosGenerico(Long idCobrarClientesSuspendidosSeleccionado,JComboBox jComboBoxCobrarClientesSuspendidos,List<CobrarClientesSuspendidos> cobrarclientessuspendidossLocal)throws Exception {
		try {
			CobrarClientesSuspendidos  cobrarclientessuspendidosTemp=null;

			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossLocal) {
				if(cobrarclientessuspendidosAux.getId()!=null && cobrarclientessuspendidosAux.getId().equals(idCobrarClientesSuspendidosSeleccionado)) {
					cobrarclientessuspendidosTemp=cobrarclientessuspendidosAux;
					break;
				}
			}

			jComboBoxCobrarClientesSuspendidos.setSelectedItem(cobrarclientessuspendidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesSuspendidosGenerico(JComboBox jComboBoxCobrarClientesSuspendidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesSuspendidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesSuspendidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesSuspendidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesSuspendidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesSuspendidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesSuspendidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessuspendidos=(CobrarClientesSuspendidos) cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientessuspendidos =(CobrarClientesSuspendidos) cobrarclientessuspendidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesSuspendidos cobrarclientessuspendidosRow=new CobrarClientesSuspendidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessuspendidosRow=(CobrarClientesSuspendidos) cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientessuspendidosRow=(CobrarClientesSuspendidos) cobrarclientessuspendidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));			
			this.jButtonDuplicarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos && this.isPermisoDuplicarCobrarClientesSuspendidos));			
			this.jButtonCopiarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos && this.isPermisoCopiarCobrarClientesSuspendidos));
			this.jButtonVerFormCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos && this.isPermisoVerFormCobrarClientesSuspendidos));
			
			this.jButtonAbrirOrderByCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));			
			
			this.jButtonNuevoRelacionesCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));			
			this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSuspendidos && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos && this.isPermisoEliminarCobrarClientesSuspendidos));
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos);							
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));						
			this.jButtonDuplicarToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos && this.isPermisoDuplicarCobrarClientesSuspendidos));						
			this.jButtonCopiarToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos && this.isPermisoCopiarCobrarClientesSuspendidos));			
			this.jButtonVerFormToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos && this.isPermisoVerFormCobrarClientesSuspendidos));			
			this.jButtonAbrirOrderByToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));
			this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSuspendidos && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos  && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos && this.isPermisoEliminarCobrarClientesSuspendidos));
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarToolBarCobrarClientesSuspendidos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos);				
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));			
			this.jMenuItemDuplicarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos && this.isPermisoDuplicarCobrarClientesSuspendidos));			
			this.jMenuItemCopiarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos && this.isPermisoCopiarCobrarClientesSuspendidos));			
			this.jMenuItemVerFormCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos && this.isPermisoVerFormCobrarClientesSuspendidos));			
			this.jMenuItemAbrirOrderByCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));			
			//this.jMenuItemMostrarOcultarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos && this.isPermisoOrdenCobrarClientesSuspendidos));			
			this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos && this.isPermisoNuevoCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemModificarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaModificarCobrarClientesSuspendidos && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemActualizarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos && this.isPermisoActualizarCobrarClientesSuspendidos));	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemEliminarCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos && this.isPermisoEliminarCobrarClientesSuspendidos));
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemCancelarCobrarClientesSuspendidos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=this.jButtonNuevoCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos=this.jButtonDuplicarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos=this.jButtonCopiarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos=this.jButtonVerFormCobrarClientesSuspendidos.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesSuspendidos=this.jButtonAbrirOrderByCobrarClientesSuspendidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=this.jButtonNuevoRelacionesCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=this.jButtonModificarCobrarClientesSuspendidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=this.jButtonNuevoToolBarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarToolBarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarToolBarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarToolBarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarToolBarCobrarClientesSuspendidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=this.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=this.jMenuItemNuevoCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemModificarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemActualizarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemEliminarCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemCancelarCobrarClientesSuspendidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesSuspendidos(Boolean esInicializar) {
		if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesSuspendidos();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesSuspendidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesSuspendidos() {
		this.jButtonNuevoCobrarClientesSuspendidos.setVisible(this.isPermisoNuevoCobrarClientesSuspendidos);			
		this.jButtonDuplicarCobrarClientesSuspendidos.setVisible(this.isPermisoDuplicarCobrarClientesSuspendidos);			
		this.jButtonCopiarCobrarClientesSuspendidos.setVisible(this.isPermisoCopiarCobrarClientesSuspendidos);			
		this.jButtonVerFormCobrarClientesSuspendidos.setVisible(this.isPermisoVerFormCobrarClientesSuspendidos);			
		
		this.jButtonAbrirOrderByCobrarClientesSuspendidos.setVisible(this.isPermisoOrdenCobrarClientesSuspendidos);					
		
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.setVisible(this.isPermisoNuevoCobrarClientesSuspendidos);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarCobrarClientesSuspendidos.setVisible(this.isPermisoActualizarCobrarClientesSuspendidos);	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.setVisible(this.isPermisoActualizarCobrarClientesSuspendidos);	
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.setVisible(this.isPermisoEliminarCobrarClientesSuspendidos);
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos);						
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.setVisible(this.isPermisoGuardarCambiosCobrarClientesSuspendidos);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.setVisible(this.isPermisoActualizarCobrarClientesSuspendidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesSuspendidos() {
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarCobrarClientesSuspendidos.setVisible(this.isPermisoActualizarCobrarClientesSuspendidos);	
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.setVisible(this.isPermisoActualizarCobrarClientesSuspendidos);	
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.setVisible(this.isPermisoEliminarCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos);							
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos && this.isPermisoGuardarCambiosCobrarClientesSuspendidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesSuspendidos() {
		if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesSuspendidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesSuspendidos() {
	}
	
	public void jTableDatosCobrarClientesSuspendidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesSuspendidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclientessuspendidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclientessuspendidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarclientessuspendidos.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclientessuspendidos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarclientessuspendidos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_comercialCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getnombre_comercial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_comercial like '%"+this.cobrarclientessuspendidos.getnombre_comercial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.cobrarclientessuspendidos.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalle_estadoCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getdetalle_estado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle_estado like '%"+this.cobrarclientessuspendidos.getdetalle_estado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarclientessuspendidos.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarclientessuspendidos.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoCobrarClientesSuspendidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.getcobrarclientessuspendidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientessuspendidos==null) {
						this.cobrarclientessuspendidos = new CobrarClientesSuspendidos();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);
				}

				if(this.cobrarclientessuspendidos.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.cobrarclientessuspendidos.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);

			this.getCobrarClientesSuspendidossBusquedaCobrarClientesSuspendidos();

			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);

			//if(CobrarClientesSuspendidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientessuspendidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesSuspendidos() {
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.dispose();
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesSuspendidos!=null) {
			this.jInternalFrameImportacionCobrarClientesSuspendidos.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesSuspendidos.dispose();
			this.jInternalFrameImportacionCobrarClientesSuspendidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesSuspendidos();
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesSuspendidos")) {
				jButtonDuplicarCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesSuspendidos")) {
				jButtonCopiarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesSuspendidos")) {
				jButtonVerFormCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesSuspendidos")) {
				jButtonDuplicarCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesSuspendidos")) {
				jButtonDuplicarCobrarClientesSuspendidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesSuspendidos")) {
				jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesSuspendidos")) {
				jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesSuspendidos")) {
				jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesSuspendidos")) {
				jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesSuspendidos")) {
				jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesSuspendidos")) {
				jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesSuspendidos")) {
				jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesSuspendidos")) {
				jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesSuspendidos")) {
				jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesSuspendidos")) {
				jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesSuspendidos")) {
				jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesSuspendidos")) {
				jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesSuspendidos")) {
				jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesSuspendidos")) {
				jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesSuspendidos")) {
				jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesSuspendidos")) {
				jButtonMostrarOcultarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesSuspendidos")) {
				jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesSuspendidos")) {
				jButtonCopiarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesSuspendidos")) {
				jButtonVerFormCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesSuspendidos")) {
				jButtonCopiarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesSuspendidos")) {
				jButtonVerFormCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesSuspendidos")) {
				jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesSuspendidos")) {
				jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesSuspendidos")) {
				jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesSuspendidos")) {
				jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesSuspendidos")) {
				jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesSuspendidos")) {
				jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesSuspendidos")) {
				jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesSuspendidos")) {
				jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesSuspendidos")) {
				jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesSuspendidos") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesSuspendidos")) {
				jButtonAbrirOrderByCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesSuspendidos") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesSuspendidos")) {
				jButtonMostrarOcultarCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesSuspendidos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesSuspendidos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesSuspendidos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesSuspendidos")) {
				jButtonCerrarReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesSuspendidos")) {
				jButtonGenerarReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesSuspendidos")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesSuspendidos")) {
				jButtonCerrarImportacionCobrarClientesSuspendidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesSuspendidos")) {
				
				jButtonGenerarImportacionCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesSuspendidos")) {
				
				jButtonAbrirImportacionCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesSuspendidos")) {
				jComboBoxTiposAccionesCobrarClientesSuspendidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesSuspendidos")) {
				jComboBoxTiposRelacionesCobrarClientesSuspendidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesSuspendidos")) {
				jComboBoxTiposAccionesCobrarClientesSuspendidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesSuspendidos")) {
				
				jComboBoxTiposSeleccionarCobrarClientesSuspendidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesSuspendidos")) {
				jTextFieldValorCampoGeneralCobrarClientesSuspendidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesSuspendidos")) {
				jButtonAbrirOrderByCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesSuspendidos")) {
				jButtonAbrirOrderByCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesSuspendidos")) {
				jButtonCerrarOrderByCobrarClientesSuspendidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesSuspendidosBusqueda")) {
				this.jButtonidCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSuspendidosBusqueda")) {
				this.jButtonid_empresaCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesSuspendidosBusqueda")) {
				this.jButtoncodigoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarClientesSuspendidosBusqueda")) {
				this.jButtonrucCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalle_estadoCobrarClientesSuspendidosBusqueda")) {
				this.jButtondetalle_estadoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesSuspendidosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesSuspendidosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarClientesSuspendidosBusqueda")) {
				this.jButtonsaldoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos")) {
				this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidosActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesSuspendidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesSuspendidos cobrarclientessuspendidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclientessuspendidosLocal=this.cobrarclientessuspendidos;
			} else {
				cobrarclientessuspendidosLocal=this.cobrarclientessuspendidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
							
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
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
			
			


			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
								
						
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
								
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
							
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
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
			
			


			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
								
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesSuspendidos")) {
					jCheckBoxSeleccionarTodosCobrarClientesSuspendidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesSuspendidos")) {
					jCheckBoxSeleccionadosCobrarClientesSuspendidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesSuspendidos")) {
					
				}
				
				


				
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
												
				
				


				
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
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
			
			


			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientessuspendidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientessuspendidos);
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
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
				
				


				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesSuspendidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesSuspendidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesSuspendidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientessuspendidosAnterior =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesSuspendidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesSuspendidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesSuspendidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclientessuspendidos =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclientessuspendidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesSuspendidos")) {
				
				}
				
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesSuspendidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesSuspendidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesSuspendidos")) {
			
			}
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesSuspendidos();
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesSuspendidos")) {
				jButtonDuplicarCobrarClientesSuspendidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesSuspendidos")) {
				jButtonCopiarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesSuspendidos")) {
				jButtonVerFormCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesSuspendidos")) {
				jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesSuspendidos")) {
				jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesSuspendidos")) {
				jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesSuspendidos")) {
				jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesSuspendidos")) {
				jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesSuspendidos")) {
				jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesSuspendidos")) {
				jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesSuspendidos")) {
				jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesSuspendidos")) {
				jButtonAbrirOrderByCobrarClientesSuspendidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesSuspendidos")) {
				jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesSuspendidos")) {
				jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesSuspendidos")) {
				jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesSuspendidosBusqueda")) {
				this.jButtonidCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesSuspendidosBusqueda")) {
				this.jButtonid_empresaCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesSuspendidosBusqueda")) {
				this.jButtoncodigoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_completoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_comercialCobrarClientesSuspendidosBusqueda")) {
				this.jButtonnombre_comercialCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarClientesSuspendidosBusqueda")) {
				this.jButtonrucCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalle_estadoCobrarClientesSuspendidosBusqueda")) {
				this.jButtondetalle_estadoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesSuspendidosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesSuspendidosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCobrarClientesSuspendidosBusqueda")) {
				this.jButtonsaldoCobrarClientesSuspendidosBusquedaActionPerformed(evt);
			}
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesSuspendidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesSuspendidos")) {
				closingInternalFrameCobrarClientesSuspendidos();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesSuspendidos")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesSuspendidos = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesSuspendidosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesSuspendidosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesSuspendidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesSuspendidosActionPerformed(null);
			}
			
			CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientessuspendidos,new Object(),this.cobrarclientessuspendidosParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesSuspendidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesSuspendidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesSuspendidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclientessuspendidos)) {
			if(!esControlTabla) {
				if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);			
				}
				
				if(this.cobrarclientessuspendidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral,this.cobrarclientessuspendidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclientessuspendidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesSuspendidos(classes,this.cobrarclientessuspendidosReturnGeneral,this.cobrarclientessuspendidosBean,false);
					}
						
					if(this.cobrarclientessuspendidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos());	
					}
						
					if(this.cobrarclientessuspendidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos(),classes);//this.cobrarclientessuspendidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesSuspendidos(this.cobrarclientessuspendidos,classes);//this.cobrarclientessuspendidosBean);									
				}
			
				if(CobrarClientesSuspendidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesSuspendidos(this.cobrarclientessuspendidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesSuspendidos(this.cobrarclientessuspendidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclientessuspendidosAnterior!=null) {
						this.cobrarclientessuspendidos=this.cobrarclientessuspendidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclientessuspendidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos(),cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidos(),this.cobrarclientessuspendidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesSuspendidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesSuspendidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesSuspendidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesSuspendidos() throws Exception {
		
		CobrarClientesSuspendidosModel cobrarclientessuspendidosModel=(CobrarClientesSuspendidosModel)this.jTableDatosCobrarClientesSuspendidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientessuspendidosModel.cobrarclientessuspendidoss=this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclientessuspendidosModel.cobrarclientessuspendidoss=this.cobrarclientessuspendidoss;
		}
		
		
		((CobrarClientesSuspendidosModel) this.jTableDatosCobrarClientesSuspendidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesSuspendidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclientessuspendidosAnterior(),this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclientessuspendidosAnterior(),this.cobrarclientessuspendidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesSuspendidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientessuspendidos,new Object(),generalEntityParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesSuspendidosConstantesFunciones.getClassesRelationshipsOfCobrarClientesSuspendidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesSuspendidosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesSuspendidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesSuspendidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientessuspendidos,new Object(),generalEntityParameterGeneral,this.cobrarclientessuspendidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesSuspendidos(CobrarClientesSuspendidosBean cobrarclientessuspendidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesSuspendidos(ArrayList<Classe> classes,CobrarClientesSuspendidosReturnGeneral cobrarclientessuspendidosReturnGeneral,CobrarClientesSuspendidosBean cobrarclientessuspendidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclientessuspendidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos = new CobrarClientesSuspendidosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientessuspendidosSessionBean.getConGuardarRelaciones(),this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.cobrarclientessuspendidosLogic=this.cobrarclientessuspendidosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesSuspendidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesSuspendidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesSuspendidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesSuspendidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesSuspendidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesSuspendidos"));
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesSuspendidos"));

		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesSuspendidos"));
					
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemModificarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesSuspendidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesSuspendidos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesSuspendidos"));
						
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemActualizarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesSuspendidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesSuspendidos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesSuspendidos"));
								
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemEliminarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesSuspendidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesSuspendidos"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesSuspendidos"));
					
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemCancelarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesSuspendidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemDetalleCerrarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesSuspendidos"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSuspendidos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSuspendidos"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesSuspendidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonidCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonid_empresaCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtoncodigoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonrucCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"detalle_estadoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonsaldoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarClientesSuspendidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesSuspendidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesSuspendidos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesSuspendidos"));
		}
		
		this.jTableDatosCobrarClientesSuspendidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesSuspendidos"));
		
		this.jTableDatosCobrarClientesSuspendidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesSuspendidos"));
		
		this.jButtonNuevoCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesSuspendidos"));
		
		this.jButtonDuplicarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesSuspendidos"));
		
		this.jButtonCopiarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesSuspendidos"));
		
		this.jButtonVerFormCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesSuspendidos"));
		
		
		this.jButtonNuevoToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesSuspendidos"));
			
		this.jButtonDuplicarToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemNuevoCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesSuspendidos"));
			
		this.jMenuItemDuplicarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesSuspendidos"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesSuspendidos"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesSuspendidos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesSuspendidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonModificarToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesSuspendidos"));
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemModificarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesSuspendidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesSuspendidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonActualizarToolBarCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesSuspendidos"));
				
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemActualizarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesSuspendidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesSuspendidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonEliminarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesSuspendidos"));
						
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemEliminarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesSuspendidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesSuspendidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonCancelarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesSuspendidos"));
			
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemCancelarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesSuspendidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesSuspendidos"));		
		
		
		this.jButtonCerrarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesSuspendidos"));
		
		
		this.jButtonCerrarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemCerrarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesSuspendidos"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jMenuItemDetalleCerrarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesSuspendidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesSuspendidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesSuspendidos"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesSuspendidos"));
			
		this.jButtonVerFormToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesSuspendidos"));
		
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesSuspendidos"));
			
		this.jMenuItemCopiarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesSuspendidos"));		
		
		this.jMenuItemVerFormCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesSuspendidos"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesSuspendidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesSuspendidos"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesSuspendidos"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesSuspendidos"));
		
		this.jMenuItemRecargarInformacionCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesSuspendidos"));		
		
		
		
		this.jButtonAnterioresCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesSuspendidos"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesSuspendidos"));
		
		this.jMenuItemAnterioresCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesSuspendidos"));		
		
		
		this.jButtonSiguientesCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesSuspendidos"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemSiguientesCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesSuspendidos"));
			
		this.jMenuItemAbrirOrderByCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesSuspendidos"));
			
		this.jMenuItemMostrarOcultarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesSuspendidos"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesSuspendidos"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesSuspendidos"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesSuspendidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesSuspendidos"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesSuspendidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesSuspendidos"));

		this.jCheckBoxSeleccionadosCobrarClientesSuspendidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesSuspendidos"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesSuspendidos"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesSuspendidos"));
			
		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesSuspendidos"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesSuspendidos"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesSuspendidos"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonidCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonid_empresaCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtoncodigoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonrucCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"detalle_estadoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonsaldoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarClientesSuspendidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSuspendidos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSuspendidos"));
				this.jInternalFrameReporteDinamicoCobrarClientesSuspendidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSuspendidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesSuspendidos"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesSuspendidos"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesSuspendidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesSuspendidos!=null) {
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesSuspendidos"));
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesSuspendidos"));
				this.jInternalFrameImportacionCobrarClientesSuspendidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesSuspendidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesSuspendidos"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesSuspendidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesSuspendidos"));			
			
			if(this.jInternalFrameOrderByCobrarClientesSuspendidos!=null) {
				this.jInternalFrameOrderByCobrarClientesSuspendidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesSuspendidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTabbedPaneRelacionesCobrarClientesSuspendidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesSuspendidos"));
		
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
            		closingInternalFrameCobrarClientesSuspendidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesSuspendidos = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesSuspendidosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesSuspendidosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesSuspendidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesSuspendidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesSuspendidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesSuspendidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesSuspendidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesSuspendidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesSuspendidos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesSuspendidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesSuspendidos";
		inputMap = this.jButtonModificarCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesSuspendidos";
		inputMap = this.jButtonActualizarCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesSuspendidos";
		inputMap = this.jButtonEliminarCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesSuspendidos";
		inputMap = this.jButtonCancelarCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesSuspendidos";
		inputMap = this.jButtonCerrarCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesSuspendidos";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonGuardarCambiosCobrarClientesSuspendidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesSuspendidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesSuspendidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesSuspendidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesSuspendidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesSuspendidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesSuspendidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonidCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonid_empresaCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_ciudadCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtoncodigoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_completoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonnombre_comercialCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_comercialCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonrucCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondetalle_estadoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"detalle_estadoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtondireccion_direccionCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtontelefono_telefonoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesSuspendidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jButtonsaldoCobrarClientesSuspendidosBusqueda.addActionListener(new ButtonActionListener(this,"saldoCobrarClientesSuspendidosBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesSuspendidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesSuspendidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesSuspendidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesSuspendidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesSuspendidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
					cobrarclientessuspendidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidoss) {
					cobrarclientessuspendidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesSuspendidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
						cobrarclientessuspendidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidoss) {
						cobrarclientessuspendidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesSuspendidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesSuspendidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesSuspendidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesSuspendidos.getSelectedRows();
			
			CobrarClientesSuspendidos cobrarclientessuspendidosLocal=new CobrarClientesSuspendidos();
			
			//this.seleccionarTodosCobrarClientesSuspendidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclientessuspendidosLocal =(CobrarClientesSuspendidos) this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss().toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclientessuspendidosLocal =(CobrarClientesSuspendidos) this.cobrarclientessuspendidoss.toArray()[this.jTableDatosCobrarClientesSuspendidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclientessuspendidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
						cobrarclientessuspendidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidoss) {
						cobrarclientessuspendidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesSuspendidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesSuspendidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesSuspendidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesSuspendidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesSuspendidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesSuspendidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesSuspendidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA)) {
							existe=true;
							cobrarclientessuspendidosAux.setid_empresa(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientessuspendidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarclientessuspendidosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO)) {
							existe=true;
							cobrarclientessuspendidosAux.setdetalle_estado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientessuspendidosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientessuspendidosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarclientessuspendidosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidoss) {
					
						if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA)) {
							existe=true;
							cobrarclientessuspendidosAux.setid_empresa(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientessuspendidosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
							existe=true;
							cobrarclientessuspendidosAux.setnombre_comercial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarclientessuspendidosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO)) {
							existe=true;
							cobrarclientessuspendidosAux.setdetalle_estado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientessuspendidosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientessuspendidosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							cobrarclientessuspendidosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesSuspendidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesSuspendidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesSuspendidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesSuspendidos) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesSuspendidos(conSplash);
				
					this.generarReporteCobrarClientesSuspendidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesSuspendidossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesSuspendidossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesSuspendidossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesSuspendidos();
				
				this.exportarCobrarClientesSuspendidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesSuspendidoss();
				//this.importarCobrarClientesSuspendidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesSuspendidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesSuspendidossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Suspendidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesSuspendidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesSuspendidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesSuspendidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesSuspendidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesSuspendidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesSuspendidos(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesSuspendidos();
						
						this.generarReporteProcesoAccionCobrarClientesSuspendidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes SuspendidosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Suspendidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesSuspendidos();
				
						this.actualizarParametrosGeneralCobrarClientesSuspendidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclientessuspendidosReturnGeneral=cobrarclientessuspendidosLogic.procesarAccionCobrarClientesSuspendidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss(),this.cobrarclientessuspendidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesSuspendidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesSuspendidos();
					
					CobrarClientesSuspendidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesSuspendidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesSuspendidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jComboBoxTiposAccionesFormularioCobrarClientesSuspendidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesSuspendidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesSuspendidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesSuspendidos();
			
			if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
			CobrarClientesSuspendidos cobrarclientessuspendidos=new CobrarClientesSuspendidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesSuspendidos.getSelectedItem();
			
			
			
			
			cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclientessuspendidossSeleccionados.size()==1) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
					cobrarclientessuspendidos=cobrarclientessuspendidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesSuspendidos();
			
      		//this.finishProcessCobrarClientesSuspendidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesSuspendidosReturnGeneral() throws Exception {
		if(this.cobrarclientessuspendidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientessuspendidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclientessuspendidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientessuspendidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclientessuspendidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclientessuspendidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
		}
		
		if(this.cobrarclientessuspendidosReturnGeneral.getConRetornoLista() || this.cobrarclientessuspendidosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclientessuspendidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclientessuspendidosLogic.setCobrarClientesSuspendidoss(this.cobrarclientessuspendidosReturnGeneral.getCobrarClientesSuspendidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesSuspendidos(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesSuspendidos() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesSuspendidos> getCobrarClientesSuspendidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesSuspendidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss()) {
					if(cobrarclientessuspendidosAux.getIsSelected()) {
						cobrarclientessuspendidossSeleccionados.add(cobrarclientessuspendidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:this.cobrarclientessuspendidoss) {
					if(cobrarclientessuspendidosAux.getIsSelected()) {
						cobrarclientessuspendidossSeleccionados.add(cobrarclientessuspendidosAux);				
					}
				}
			}
			
			if(cobrarclientessuspendidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclientessuspendidossSeleccionados.addAll(this.cobrarclientessuspendidosLogic.getCobrarClientesSuspendidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclientessuspendidossSeleccionados.addAll(this.cobrarclientessuspendidoss);				
					}
				}
			}
		} else {
			cobrarclientessuspendidossSeleccionados.add(this.cobrarclientessuspendidos);
		}
		
		return cobrarclientessuspendidossSeleccionados;
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
	
	public void generarReporteCobrarClientesSuspendidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarClientesSuspendidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesSuspendidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesSuspendidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesSuspendidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Suspendidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesSuspendidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesSuspendidos();
		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesSuspendidos();
		
		
		//this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados ,cobrarclientessuspendidosImplementable,cobrarclientessuspendidosImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesSuspendidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesSuspendidos();
		
		this.abrirFrameImportacionCobrarClientesSuspendidos();		
		
			
		//this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados ,cobrarclientessuspendidosImplementable,cobrarclientessuspendidosImplementableHome);
	}
	
	public void importarCobrarClientesSuspendidoss() throws Exception {		
	
	}
	
	public void exportarCobrarClientesSuspendidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesSuspendidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesSuspendidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesSuspendidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Suspendidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesSuspendidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesSuspendidos(cobrarclientessuspendidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclientessuspendidosAux.setsDetalleGeneralEntityReporte(cobrarclientessuspendidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesSuspendidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclientessuspendidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getid_empresa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getnombre_comercial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getdetalle_estado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.gettelefono_telefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientessuspendidos.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesSuspendidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesSuspendidos(row);				
				iRow++;
			}				
			
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesSuspendidos(cobrarclientessuspendidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesSuspendidossSeleccionados() throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();		
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientessuspendidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclientessuspendidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclientessuspendidos");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
				element = document.createElement("cobrarclientessuspendidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesSuspendidos(cobrarclientessuspendidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Suspendidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesSuspendidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesSuspendidosConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getid_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getnombre_comercial());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getdetalle_estado());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.gettelefono_telefono());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientessuspendidos.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesSuspendidos(CobrarClientesSuspendidos cobrarclientessuspendidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesSuspendidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclientessuspendidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesSuspendidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclientessuspendidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementid_empresa = document.createElement(CobrarClientesSuspendidosConstantesFunciones.IDEMPRESA);
		elementid_empresa.appendChild(document.createTextNode(cobrarclientessuspendidos.getid_empresa().toString().trim()));
		element.appendChild(elementid_empresa);

		Element elementnombre_ciudad = document.createElement(CobrarClientesSuspendidosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarclientessuspendidos.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementcodigo = document.createElement(CobrarClientesSuspendidosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclientessuspendidos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarClientesSuspendidosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarclientessuspendidos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnombre_comercial = document.createElement(CobrarClientesSuspendidosConstantesFunciones.NOMBRECOMERCIAL);
		elementnombre_comercial.appendChild(document.createTextNode(cobrarclientessuspendidos.getnombre_comercial().trim()));
		element.appendChild(elementnombre_comercial);

		Element elementruc = document.createElement(CobrarClientesSuspendidosConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(cobrarclientessuspendidos.getruc().trim()));
		element.appendChild(elementruc);

		Element elementdetalle_estado = document.createElement(CobrarClientesSuspendidosConstantesFunciones.DETALLEESTADO);
		elementdetalle_estado.appendChild(document.createTextNode(cobrarclientessuspendidos.getdetalle_estado().trim()));
		element.appendChild(elementdetalle_estado);

		Element elementdireccion_direccion = document.createElement(CobrarClientesSuspendidosConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarclientessuspendidos.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elementtelefono_telefono = document.createElement(CobrarClientesSuspendidosConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarclientessuspendidos.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);

		Element elementsaldo = document.createElement(CobrarClientesSuspendidosConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(cobrarclientessuspendidos.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoCobrarClientesSuspendidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados=new ArrayList<CobrarClientesSuspendidos>();
		
		cobrarclientessuspendidossSeleccionados=this.getCobrarClientesSuspendidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesSuspendidos(cobrarclientessuspendidossSeleccionados);
		
		this.generarReporteCobrarClientesSuspendidoss("Todos",cobrarclientessuspendidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesSuspendidos(ArrayList<CobrarClientesSuspendidos> cobrarclientessuspendidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesSuspendidos cobrarclientessuspendidosAux:cobrarclientessuspendidossSeleccionados) {
				cobrarclientessuspendidosAux.setsDetalleGeneralEntityReporte(cobrarclientessuspendidosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getid_empresa().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_NOMBRECOMERCIAL)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getnombre_comercial());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_RUC)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DETALLEESTADO)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getdetalle_estado());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesSuspendidosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarclientessuspendidosAux.setsDescripcionGeneralEntityReporte1(cobrarclientessuspendidosAux.gettelefono_telefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesSuspendidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesSuspendidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesSuspendidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesSuspendidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesSuspendidos=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesSuspendidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclientessuspendidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;												
			}
			
			this.jButtonCerrarCobrarClientesSuspendidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclientessuspendidos)) {
			this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
			this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesSuspendidos=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesSuspendidos=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesSuspendidos=false;
		//this.isVisibilidadCeldaModificarCobrarClientesSuspendidos=true;
		this.isVisibilidadCeldaActualizarCobrarClientesSuspendidos=false;
		this.isVisibilidadCeldaEliminarCobrarClientesSuspendidos=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesSuspendidos=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesSuspendidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesSuspendidos() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesSuspendidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesSuspendidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesSuspendidos!=null) {
				this.jScrollPanelDatosCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesSuspendidos!=null) {
				this.jPanelPaginacionCobrarClientesSuspendidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
					this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclientessuspendidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos!=null) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesSuspendidos!=null) {
				this.jPanelParametrosReportesCobrarClientesSuspendidos.setVisible(true);
			}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesSuspendidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesSuspendidos() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesSuspendidos();
		this.updateVisibilidadBusquedasFormularioCobrarClientesSuspendidos();
		this.updateHabilitarBusquedasFormularioCobrarClientesSuspendidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesSuspendidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponents().length>0) {
	

		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesSuspendidos.indexOfComponent(this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponent(index);
				jPanel.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesSuspendidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesSuspendidos.indexOfComponent(this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			if(!this.cobrarclientessuspendidosConstantesFunciones.mostrarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesSuspendidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesSuspendidos.indexOfComponent(this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
				this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setEnabledAt(index,this.cobrarclientessuspendidosConstantesFunciones.activarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesSuspendidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesSuspendidos")) {
			index= this.jTabbedPaneBusquedasCobrarClientesSuspendidos.indexOfComponent(this.jPanelBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);

			this.jTabbedPaneBusquedasCobrarClientesSuspendidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesSuspendidos.getComponent(index);

			this.cobrarclientessuspendidosConstantesFunciones.setResaltarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos(resaltar);

			jPanel.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarBusquedaCobrarClientesSuspendidosCobrarClientesSuspendidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesSuspendidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesSuspendidos() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesSuspendidos();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesSuspendidos();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesSuspendidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesSuspendidos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltaridCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelidCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltaridCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarid_empresaCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldid_empresaCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarid_empresaCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_ciudadCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_ciudadCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarcodigoCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarcodigoCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_completoCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_completoCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_comercialCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarnombre_comercialCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarrucCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarrucCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltardetalle_estadoCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltardetalle_estadoCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltardireccion_direccionCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltardireccion_direccionCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltartelefono_telefonoCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltartelefono_telefonoCobrarClientesSuspendidos);}
		if(this.cobrarclientessuspendidosConstantesFunciones.resaltarsaldoCobrarClientesSuspendidos!=null && this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setBorder(this.cobrarclientessuspendidosConstantesFunciones.resaltarsaldoCobrarClientesSuspendidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesSuspendidos() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelidCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostraridCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelidCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostraridCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldid_empresaCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarid_empresaCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelid_empresaCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarid_empresaCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_ciudadCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelnombre_ciudadCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_ciudadCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarcodigoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelcodigoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarcodigoCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_completoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelnombre_completoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_completoCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_comercialCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelnombre_comercialCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarnombre_comercialCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarrucCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelrucCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarrucCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrardetalle_estadoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPaneldetalle_estadoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrardetalle_estadoCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrardireccion_direccionCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPaneldireccion_direccionCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrardireccion_direccionCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrartelefono_telefonoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPaneltelefono_telefonoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrartelefono_telefonoCobrarClientesSuspendidos);
		//this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarsaldoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jPanelsaldoCobrarClientesSuspendidos.setVisible(this.cobrarclientessuspendidosConstantesFunciones.mostrarsaldoCobrarClientesSuspendidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesSuspendidos() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesSuspendidos!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jLabelidCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activaridCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldid_empresaCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarid_empresaCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_ciudadCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarnombre_ciudadCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldcodigoCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarcodigoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_completoCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarnombre_completoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreanombre_comercialCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarnombre_comercialCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldrucCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarrucCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadetalle_estadoCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activardetalle_estadoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreadireccion_direccionCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activardireccion_direccionCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextAreatelefono_telefonoCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activartelefono_telefonoCobrarClientesSuspendidos);
		this.jInternalFrameDetalleFormCobrarClientesSuspendidos.jTextFieldsaldoCobrarClientesSuspendidos.setEnabled(this.cobrarclientessuspendidosConstantesFunciones.activarsaldoCobrarClientesSuspendidos);
		}
	}
	
		
}