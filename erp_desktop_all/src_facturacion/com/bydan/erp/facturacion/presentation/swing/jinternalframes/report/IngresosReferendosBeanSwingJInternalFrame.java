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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.IngresosReferendosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.IngresosReferendosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.IngresosReferendosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.IngresosReferendosBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
public class IngresosReferendosBeanSwingJInternalFrame extends IngresosReferendosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(IngresosReferendosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<IngresosReferendos> ingresosreferendosValidator = new ClassValidator<IngresosReferendos>(IngresosReferendos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public IngresosReferendos ingresosreferendos;	
	public IngresosReferendos ingresosreferendosAux;
	public IngresosReferendos ingresosreferendosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public IngresosReferendos ingresosreferendosTotales;
	public Long idIngresosReferendosActual;
	public Long iIdNuevoIngresosReferendos=0L;
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
	
	public Boolean isPermisoTodoIngresosReferendos;
	public Boolean isPermisoNuevoIngresosReferendos;
	public Boolean isPermisoActualizarIngresosReferendos;
	public Boolean isPermisoActualizarOriginalIngresosReferendos;
	public Boolean isPermisoEliminarIngresosReferendos;
	public Boolean isPermisoGuardarCambiosIngresosReferendos;
	public Boolean isPermisoConsultaIngresosReferendos;
	public Boolean isPermisoBusquedaIngresosReferendos;
	public Boolean isPermisoReporteIngresosReferendos;
	public Boolean isPermisoPaginacionMedioIngresosReferendos;
	public Boolean isPermisoPaginacionAltoIngresosReferendos;
	public Boolean isPermisoPaginacionTodoIngresosReferendos;
	public Boolean isPermisoCopiarIngresosReferendos;
	public Boolean isPermisoVerFormIngresosReferendos;
	public Boolean isPermisoDuplicarIngresosReferendos;
	public Boolean isPermisoOrdenIngresosReferendos;
	
	
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
	
	public IngresosReferendosParameterReturnGeneral ingresosreferendosReturnGeneral;
	public IngresosReferendosParameterReturnGeneral ingresosreferendosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoIngresosReferendos=false;
	public Boolean esParaAccionDesdeFormularioIngresosReferendos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected IngresosReferendosSessionBeanAdditional ingresosreferendosSessionBeanAdditional=null;
	
	public IngresosReferendosSessionBeanAdditional getIngresosReferendosSessionBeanAdditional() {
		return this.ingresosreferendosSessionBeanAdditional;
	}
	
	public void setIngresosReferendosSessionBeanAdditional(IngresosReferendosSessionBeanAdditional ingresosreferendosSessionBeanAdditional) {
		try {
			this.ingresosreferendosSessionBeanAdditional=ingresosreferendosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected IngresosReferendosBeanSwingJInternalFrameAdditional ingresosreferendosBeanSwingJInternalFrameAdditional=null;
	//public class IngresosReferendosBeanSwingJInternalFrame
	
	public IngresosReferendosBeanSwingJInternalFrameAdditional getIngresosReferendosBeanSwingJInternalFrameAdditional() {
		return this.ingresosreferendosBeanSwingJInternalFrameAdditional;
	}
	
	public void setIngresosReferendosBeanSwingJInternalFrameAdditional(IngresosReferendosBeanSwingJInternalFrameAdditional ingresosreferendosBeanSwingJInternalFrameAdditional) {
		try {
			this.ingresosreferendosBeanSwingJInternalFrameAdditional=ingresosreferendosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public IngresosReferendosLogic ingresosreferendosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public IngresosReferendos ingresosreferendosBean;
	public IngresosReferendosConstantesFunciones ingresosreferendosConstantesFunciones;
	//public IngresosReferendosParameterReturnGeneral ingresosreferendosReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<IngresosReferendos> ingresosreferendoss;	
	//public List<IngresosReferendos> ingresosreferendossEliminados;
	//public List<IngresosReferendos> ingresosreferendossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoIngresosReferendos=false;
	public Boolean isVisibilidadCeldaDuplicarIngresosReferendos=true;
	public Boolean isVisibilidadCeldaCopiarIngresosReferendos=true;
	public Boolean isVisibilidadCeldaVerFormIngresosReferendos=true;
	public Boolean isVisibilidadCeldaOrdenIngresosReferendos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
	public Boolean isVisibilidadCeldaModificarIngresosReferendos=false;
	public Boolean isVisibilidadCeldaActualizarIngresosReferendos=false;
	public Boolean isVisibilidadCeldaEliminarIngresosReferendos=false;
	public Boolean isVisibilidadCeldaCancelarIngresosReferendos=false;
	public Boolean isVisibilidadCeldaGuardarIngresosReferendos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;	
	
	
	public Boolean isVisibilidadBusquedaIngresosReferendos=false;
	
	public Long getiIdNuevoIngresosReferendos() {
		return this.iIdNuevoIngresosReferendos;
	}

	public void setiIdNuevoIngresosReferendos(Long iIdNuevoIngresosReferendos) {
		this.iIdNuevoIngresosReferendos = iIdNuevoIngresosReferendos;
	}
	
	public Long getidIngresosReferendosActual() {
		return this.idIngresosReferendosActual;
	}

	public void setidIngresosReferendosActual(Long idIngresosReferendosActual) {
		this.idIngresosReferendosActual = idIngresosReferendosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public IngresosReferendos getingresosreferendos() {
		return this.ingresosreferendos;
	}

	public void setingresosreferendos(IngresosReferendos ingresosreferendos) {
		this.ingresosreferendos = ingresosreferendos;
	}
	
	public IngresosReferendos getingresosreferendosAux() {
		return this.ingresosreferendosAux;
	}

	public void setingresosreferendosAux(IngresosReferendos ingresosreferendosAux) {
		this.ingresosreferendosAux = ingresosreferendosAux;
	}				
	
	public IngresosReferendos getingresosreferendosAnterior() {
		return this.ingresosreferendosAnterior;
	}

	public void setingresosreferendosAnterior(IngresosReferendos ingresosreferendosAnterior) {
		this.ingresosreferendosAnterior = ingresosreferendosAnterior;
	}	
	
	public IngresosReferendos getingresosreferendosTotales() {
		return this.ingresosreferendosTotales;
	}

	public void setingresosreferendosTotales(IngresosReferendos ingresosreferendosTotales) {
		this.ingresosreferendosTotales = ingresosreferendosTotales;
	}	
	
	public IngresosReferendos getingresosreferendosBean() {
		return this.ingresosreferendosBean;
	}

	public void setingresosreferendosBean(IngresosReferendos ingresosreferendosBean) {
		this.ingresosreferendosBean = ingresosreferendosBean;
	}	
	
	public IngresosReferendosParameterReturnGeneral getingresosreferendosReturnGeneral() {
		return this.ingresosreferendosReturnGeneral;
	}

	public void setingresosreferendosReturnGeneral(IngresosReferendosParameterReturnGeneral ingresosreferendosReturnGeneral) {
		this.ingresosreferendosReturnGeneral = ingresosreferendosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaIngresosReferendos=new Date();

	public Date getfecha_emision_desdeBusquedaIngresosReferendos() {
		return this.fecha_emision_desdeBusquedaIngresosReferendos;
	}

	public void setfecha_emision_desdeBusquedaIngresosReferendos(Date fecha_emision_desdeBusquedaIngresosReferendos) {
		this.fecha_emision_desdeBusquedaIngresosReferendos = fecha_emision_desdeBusquedaIngresosReferendos;
	}

;
	public Date fecha_emision_hastaBusquedaIngresosReferendos=new Date();

	public Date getfecha_emision_hastaBusquedaIngresosReferendos() {
		return this.fecha_emision_hastaBusquedaIngresosReferendos;
	}

	public void setfecha_emision_hastaBusquedaIngresosReferendos(Date fecha_emision_hastaBusquedaIngresosReferendos) {
		this.fecha_emision_hastaBusquedaIngresosReferendos = fecha_emision_hastaBusquedaIngresosReferendos;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public IngresosReferendosLogic getIngresosReferendosLogic()	{		
		return ingresosreferendosLogic;
	}

	public void setIngresosReferendosLogic(IngresosReferendosLogic ingresosreferendosLogic) {
		this.ingresosreferendosLogic = ingresosreferendosLogic;
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
	
	public Boolean getIsEsNuevoIngresosReferendos() {
		return isEsNuevoIngresosReferendos;
	}

	public void setIsEsNuevoIngresosReferendos(Boolean isEsNuevoIngresosReferendos) {
		this.isEsNuevoIngresosReferendos = isEsNuevoIngresosReferendos;
	}

	public Boolean getEsParaAccionDesdeFormularioIngresosReferendos() {
		return esParaAccionDesdeFormularioIngresosReferendos;
	}
	
	public void setEsParaAccionDesdeFormularioIngresosReferendos(Boolean esParaAccionDesdeFormularioIngresosReferendos) {
		this.esParaAccionDesdeFormularioIngresosReferendos = esParaAccionDesdeFormularioIngresosReferendos;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesIngresosReferendos() throws Exception {
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
		
	public IngresosReferendosParameterReturnGeneral getIngresosReferendosParameterGeneral() {
		return this.ingresosreferendosParameterGeneral;
	}
	
	public void setIngresosReferendosParameterGeneral(IngresosReferendosParameterReturnGeneral ingresosreferendosParameterGeneral) {
		this.ingresosreferendosParameterGeneral = ingresosreferendosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoIngresosReferendos() {
		return isPermisoTodoIngresosReferendos;
	}

	public void setIsPermisoTodoIngresosReferendos(Boolean isPermisoTodoIngresosReferendos) {
		this.isPermisoTodoIngresosReferendos = isPermisoTodoIngresosReferendos;
	}

	public Boolean getIsPermisoNuevoIngresosReferendos() {
		return isPermisoNuevoIngresosReferendos;
	}

	public void setIsPermisoNuevoIngresosReferendos(Boolean isPermisoNuevoIngresosReferendos) {
		this.isPermisoNuevoIngresosReferendos = isPermisoNuevoIngresosReferendos;
	}

	public Boolean getIsPermisoActualizarIngresosReferendos() {
		return isPermisoActualizarIngresosReferendos;
	}

	public void setIsPermisoActualizarIngresosReferendos(Boolean isPermisoActualizarIngresosReferendos) {
		this.isPermisoActualizarIngresosReferendos = isPermisoActualizarIngresosReferendos;
	}

	public Boolean getIsPermisoEliminarIngresosReferendos() {
		return isPermisoEliminarIngresosReferendos;
	}

	public void setIsPermisoEliminarIngresosReferendos(Boolean isPermisoEliminarIngresosReferendos) {
		this.isPermisoEliminarIngresosReferendos = isPermisoEliminarIngresosReferendos;
	}

	public Boolean getIsPermisoGuardarCambiosIngresosReferendos() {
		return isPermisoGuardarCambiosIngresosReferendos;
	}

	public void setIsPermisoGuardarCambiosIngresosReferendos(Boolean isPermisoGuardarCambiosIngresosReferendos) {
		this.isPermisoGuardarCambiosIngresosReferendos = isPermisoGuardarCambiosIngresosReferendos;
	}
	
	public Boolean getIsPermisoConsultaIngresosReferendos() {
		return isPermisoConsultaIngresosReferendos;
	}

	public void setIsPermisoConsultaIngresosReferendos(Boolean isPermisoConsultaIngresosReferendos) {
		this.isPermisoConsultaIngresosReferendos = isPermisoConsultaIngresosReferendos;
	}

	public Boolean getIsPermisoBusquedaIngresosReferendos() {
		return isPermisoBusquedaIngresosReferendos;
	}

	public void setIsPermisoBusquedaIngresosReferendos(Boolean isPermisoBusquedaIngresosReferendos) {
		this.isPermisoBusquedaIngresosReferendos = isPermisoBusquedaIngresosReferendos;
	}

	public Boolean getIsPermisoReporteIngresosReferendos() {
		return isPermisoReporteIngresosReferendos;
	}

	public void setIsPermisoReporteIngresosReferendos(Boolean isPermisoReporteIngresosReferendos) {
		this.isPermisoReporteIngresosReferendos = isPermisoReporteIngresosReferendos;
	}
	
	public Boolean getIsPermisoPaginacionMedioIngresosReferendos() {
		return isPermisoPaginacionMedioIngresosReferendos;
	}

	public void setIsPermisoPaginacionMedioIngresosReferendos(Boolean isPermisoPaginacionMedioIngresosReferendos) {
		this.isPermisoPaginacionMedioIngresosReferendos = isPermisoPaginacionMedioIngresosReferendos;
	}
	
	public Boolean getIsPermisoPaginacionTodoIngresosReferendos() {
		return isPermisoPaginacionTodoIngresosReferendos;
	}

	public void setIsPermisoPaginacionTodoIngresosReferendos(Boolean isPermisoPaginacionTodoIngresosReferendos) {
		this.isPermisoPaginacionTodoIngresosReferendos = isPermisoPaginacionTodoIngresosReferendos;
	}
	
	public Boolean getIsPermisoPaginacionAltoIngresosReferendos() {
		return isPermisoPaginacionAltoIngresosReferendos;
	}

	public void setIsPermisoPaginacionAltoIngresosReferendos(Boolean isPermisoPaginacionAltoIngresosReferendos) {
		this.isPermisoPaginacionAltoIngresosReferendos = isPermisoPaginacionAltoIngresosReferendos;
	}
	
	public Boolean getIsPermisoCopiarIngresosReferendos() {
		return isPermisoCopiarIngresosReferendos;
	}

	public void setIsPermisoCopiarIngresosReferendos(Boolean isPermisoCopiarIngresosReferendos) {
		this.isPermisoCopiarIngresosReferendos = isPermisoCopiarIngresosReferendos;
	}
	
	public Boolean getIsPermisoVerFormIngresosReferendos() {
		return isPermisoVerFormIngresosReferendos;
	}

	public void setIsPermisoVerFormIngresosReferendos(Boolean isPermisoVerFormIngresosReferendos) {
		this.isPermisoVerFormIngresosReferendos = isPermisoVerFormIngresosReferendos;
	}
	
	public Boolean getIsPermisoDuplicarIngresosReferendos() {
		return isPermisoDuplicarIngresosReferendos;
	}

	public void setIsPermisoDuplicarIngresosReferendos(Boolean isPermisoDuplicarIngresosReferendos) {
		this.isPermisoDuplicarIngresosReferendos = isPermisoDuplicarIngresosReferendos;
	}
	
	public Boolean getIsPermisoOrdenIngresosReferendos() {
		return isPermisoOrdenIngresosReferendos;
	}

	public void setIsPermisoOrdenIngresosReferendos(Boolean isPermisoOrdenIngresosReferendos) {
		this.isPermisoOrdenIngresosReferendos = isPermisoOrdenIngresosReferendos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoIngresosReferendos() {
		return isVisibilidadCeldaNuevoIngresosReferendos;
	}

	public void setIsVisibilidadCeldaNuevoIngresosReferendos(Boolean isVisibilidadCeldaNuevoIngresosReferendos) {
		this.isVisibilidadCeldaNuevoIngresosReferendos = isVisibilidadCeldaNuevoIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarIngresosReferendos() {
		return isVisibilidadCeldaDuplicarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaDuplicarIngresosReferendos(Boolean isVisibilidadCeldaDuplicarIngresosReferendos) {
		this.isVisibilidadCeldaDuplicarIngresosReferendos = isVisibilidadCeldaDuplicarIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarIngresosReferendos() {
		return isVisibilidadCeldaCopiarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaCopiarIngresosReferendos(Boolean isVisibilidadCeldaCopiarIngresosReferendos) {
		this.isVisibilidadCeldaCopiarIngresosReferendos = isVisibilidadCeldaCopiarIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormIngresosReferendos() {
		return isVisibilidadCeldaVerFormIngresosReferendos;
	}

	public void setIsVisibilidadCeldaVerFormIngresosReferendos(Boolean isVisibilidadCeldaVerFormIngresosReferendos) {
		this.isVisibilidadCeldaVerFormIngresosReferendos = isVisibilidadCeldaVerFormIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenIngresosReferendos() {
		return isVisibilidadCeldaOrdenIngresosReferendos;
	}

	public void setIsVisibilidadCeldaOrdenIngresosReferendos(Boolean isVisibilidadCeldaOrdenIngresosReferendos) {
		this.isVisibilidadCeldaOrdenIngresosReferendos = isVisibilidadCeldaOrdenIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesIngresosReferendos() {
		return isVisibilidadCeldaNuevoRelacionesIngresosReferendos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesIngresosReferendos(Boolean isVisibilidadCeldaNuevoRelacionesIngresosReferendos) {
		this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos = isVisibilidadCeldaNuevoRelacionesIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarIngresosReferendos() {
		return isVisibilidadCeldaModificarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaModificarIngresosReferendos(Boolean isVisibilidadCeldaModificarIngresosReferendos) {
		this.isVisibilidadCeldaModificarIngresosReferendos = isVisibilidadCeldaModificarIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarIngresosReferendos() {
		return isVisibilidadCeldaActualizarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaActualizarIngresosReferendos(Boolean isVisibilidadCeldaActualizarIngresosReferendos) {
		this.isVisibilidadCeldaActualizarIngresosReferendos = isVisibilidadCeldaActualizarIngresosReferendos;
	}

	public Boolean getIsVisibilidadCeldaEliminarIngresosReferendos() {
		return isVisibilidadCeldaEliminarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaEliminarIngresosReferendos(Boolean isVisibilidadCeldaEliminarIngresosReferendos) {
		this.isVisibilidadCeldaEliminarIngresosReferendos = isVisibilidadCeldaEliminarIngresosReferendos;
	}

	public Boolean getIsVisibilidadCeldaCancelarIngresosReferendos() {
		return isVisibilidadCeldaCancelarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaCancelarIngresosReferendos(Boolean isVisibilidadCeldaCancelarIngresosReferendos) {
		this.isVisibilidadCeldaCancelarIngresosReferendos = isVisibilidadCeldaCancelarIngresosReferendos;
	}

	public Boolean getIsVisibilidadCeldaGuardarIngresosReferendos() {
		return isVisibilidadCeldaGuardarIngresosReferendos;
	}

	public void setIsVisibilidadCeldaGuardarIngresosReferendos(Boolean isVisibilidadCeldaGuardarIngresosReferendos) {
		this.isVisibilidadCeldaGuardarIngresosReferendos = isVisibilidadCeldaGuardarIngresosReferendos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosIngresosReferendos() {
		return isVisibilidadCeldaGuardarCambiosIngresosReferendos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosIngresosReferendos(Boolean isVisibilidadCeldaGuardarCambiosIngresosReferendos) {
		this.isVisibilidadCeldaGuardarCambiosIngresosReferendos = isVisibilidadCeldaGuardarCambiosIngresosReferendos;
	}
		
	public IngresosReferendosSessionBean getingresosreferendosSessionBean() {
		return this.ingresosreferendosSessionBean;
	}
	
	public void setingresosreferendosSessionBean(IngresosReferendosSessionBean ingresosreferendosSessionBean) {
		this.ingresosreferendosSessionBean=ingresosreferendosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaIngresosReferendos() {
		return this.isVisibilidadBusquedaIngresosReferendos;
	}

	public void setisVisibilidadBusquedaIngresosReferendos(Boolean isVisibilidadBusquedaIngresosReferendos) {
		this.isVisibilidadBusquedaIngresosReferendos=isVisibilidadBusquedaIngresosReferendos;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(IngresosReferendos ingresosreferendos)throws Exception {
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
	
	public void bugActualizarReferenciaActual(IngresosReferendos ingresosreferendos,IngresosReferendos ingresosreferendosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalIngresosReferendos(ingresosreferendos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ingresosreferendosAux.setId(ingresosreferendos.getId());
		ingresosreferendosAux.setVersionRow(ingresosreferendos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(IngresosReferendos ingresosreferendosLocal) throws Exception {
		
		if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(IngresosReferendos ingresosreferendosLocal) throws Exception {	
		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarIngresosReferendosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ingresosreferendosValidator.getInvalidValues(this.ingresosreferendos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(IngresosReferendos ingresosreferendos,List<IngresosReferendos> ingresosreferendoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(IngresosReferendos ingresosreferendos,List<IngresosReferendos> ingresosreferendoss) throws Exception {
		try	{			
			IngresosReferendosConstantesFunciones.actualizarSelectedLista(ingresosreferendos,ingresosreferendoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<IngresosReferendos> ingresosreferendossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ingresosreferendossLocal=this.ingresosreferendosLogic.getIngresosReferendoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ingresosreferendossLocal=this.ingresosreferendoss;
			}
			//ARCHITECTURE
		
			for(IngresosReferendos ingresosreferendosLocal:ingresosreferendossLocal) {
				if(this.permiteMantenimiento(ingresosreferendosLocal) && ingresosreferendosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+IngresosReferendosConstantesFunciones.getIngresosReferendosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnombre_completo_clienteIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumeroIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_autorizacionIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMEROFUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_fueIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_pre_impresoIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMERODAU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_dauIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.NUMEROREFERENDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_referendoIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.FECHAREFERENDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelfecha_referendoIngresosReferendos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosReferendosConstantesFunciones.AFOROREFERENDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelaforo_referendoIngresosReferendos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnombre_completo_clienteIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumeroIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_autorizacionIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_fueIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_pre_impresoIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_dauIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_referendoIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelfecha_referendoIngresosReferendos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosReferendos.jLabelaforo_referendoIngresosReferendos,"");
		
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
		this.iIdNuevoIngresosReferendos--;	
		
		
		this.ingresosreferendosAux=new IngresosReferendos();
		
		this.ingresosreferendosAux.setId(this.iIdNuevoIngresosReferendos);
		this.ingresosreferendosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingresosreferendosLogic.getIngresosReferendoss().add(this.ingresosreferendosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ingresosreferendoss.add(this.ingresosreferendosAux);
		}
		//ARCHITECTURE
		
		this.ingresosreferendos=this.ingresosreferendosAux;
		
		if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendos);
			this.setVariablesObjetoActualToFormularioForeignKeyIngresosReferendos(this.ingresosreferendos);
		}
				
		//this.setDefaultControlesIngresosReferendos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyIngresosReferendos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyIngresosReferendos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosReferendos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngresosReferendos(this.ingresosreferendosBean,this.ingresosreferendos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanIngresosReferendos(this.ingresosreferendosReturnGeneral,this.ingresosreferendosBean,false);
		
		if(this.ingresosreferendosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos());
		}
		
		if(this.ingresosreferendosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos(),classes);//this.ingresosreferendosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyIngresosReferendos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyIngresosReferendos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.RecargarFormIngresosReferendos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingIngresosReferendos(false);
						
			if(ingresosreferendosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosReferendos();
			}
			
			this.actualizarVisualTableDatosIngresosReferendos();
			
			this.jTableDatosIngresosReferendos.setRowSelectionInterval(this.getIndiceNuevoIngresosReferendos(), this.getIndiceNuevoIngresosReferendos());
			
			this.seleccionarFilaTablaIngresosReferendosActual();
						
			this.actualizarEstadoCeldasBotonesIngresosReferendos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesIngresosReferendos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_desdeIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarfecha_emision_desdeIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_hastaIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarfecha_emision_hastaIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnombre_completo_clienteIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumeroIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumero_autorizacionIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumero_fueIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumero_pre_impresoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumero_dauIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarnumero_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activarfecha_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setEnabled(isHabilitar && this.ingresosreferendosConstantesFunciones.activaraforo_referendoIngresosReferendos);	
		
	};
	
	public void setDefaultControlesIngresosReferendos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoIngresosReferendos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ingresosreferendosSessionBean.setConGuardarRelaciones(true);			
			this.ingresosreferendosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.setVisible(true);
			
					
		} else {
			//this.ingresosreferendosSessionBean.setConGuardarRelaciones(false);			
			this.ingresosreferendosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoIngresosReferendos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
				if(ingresosreferendosAux.getId().equals(this.iIdNuevoIngresosReferendos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendoss) {
				if(ingresosreferendosAux.getId().equals(this.iIdNuevoIngresosReferendos)) {
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
	
	public int getIndiceActualIngresosReferendos(IngresosReferendos ingresosreferendos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
				if(ingresosreferendosAux.getId().equals(ingresosreferendos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendoss) {
				if(ingresosreferendosAux.getId().equals(ingresosreferendos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalIngresosReferendos(IngresosReferendos ingresosreferendosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
				if(ingresosreferendosAux.getIngresosReferendosOriginal().getId().equals(ingresosreferendosOriginal.getId())) {
					existe=true;
					ingresosreferendosOriginal.setId(ingresosreferendosAux.getId());
					ingresosreferendosOriginal.setVersionRow(ingresosreferendosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendoss) {
				if(ingresosreferendosAux.getIngresosReferendosOriginal().getId().equals(ingresosreferendosOriginal.getId())) {
					existe=true;
					ingresosreferendosOriginal.setId(ingresosreferendosAux.getId());
					ingresosreferendosOriginal.setVersionRow(ingresosreferendosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosIngresosReferendos(Boolean esParaCancelar) throws Exception {
		ingresosreferendossAux=new ArrayList<IngresosReferendos>();
		ingresosreferendosAux=new IngresosReferendos();
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
					if(ingresosreferendosAux.getId()<0) {
						ingresosreferendossAux.add(ingresosreferendosAux);
					}		
				}
				this.iIdNuevoIngresosReferendos=0L;
				this.ingresosreferendosLogic.getIngresosReferendoss().removeAll(ingresosreferendossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendoss) {
					if(ingresosreferendosAux.getId()<0) {
						ingresosreferendossAux.add(ingresosreferendosAux);
					}		
				}
				this.iIdNuevoIngresosReferendos=0L;
				this.ingresosreferendoss.removeAll(ingresosreferendossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoIngresosReferendos 
					&& this.ingresosreferendosLogic.getIngresosReferendoss().size()>0
					) {
					ingresosreferendosAux=this.ingresosreferendosLogic.getIngresosReferendoss().get(this.ingresosreferendosLogic.getIngresosReferendoss().size() - 1);
				
					if(ingresosreferendosAux.getId()<0) {
						this.ingresosreferendosLogic.getIngresosReferendoss().remove(ingresosreferendosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoIngresosReferendos && this.ingresosreferendoss.size()>0) {
					ingresosreferendosAux=this.ingresosreferendoss.get(this.ingresosreferendoss.size() - 1);
				
					if(ingresosreferendosAux.getId()<0) {
						this.ingresosreferendoss.remove(ingresosreferendosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoIngresosReferendos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ingresosreferendos.getId()<0) {
				this.ingresosreferendosLogic.getIngresosReferendoss().remove(this.ingresosreferendos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ingresosreferendos.getId()<0) {
				this.ingresosreferendoss.remove(this.ingresosreferendos);
			}
		}			
	}
	
	public void setEstadosInicialesIngresosReferendos(List<IngresosReferendos> ingresosreferendossAux) throws Exception {
		IngresosReferendosConstantesFunciones.setEstadosInicialesIngresosReferendos(ingresosreferendossAux);
	}
	
	public void setEstadosInicialesIngresosReferendos(IngresosReferendos ingresosreferendosAux) throws Exception {
		IngresosReferendosConstantesFunciones.setEstadosInicialesIngresosReferendos(ingresosreferendosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarIngresosReferendosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarIngresosReferendosActual()) {
				if(!this.isEsNuevoIngresosReferendos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoIngresosReferendos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarIngresosReferendosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ingresos Referendos ?", "MANTENIMIENTO DE Ingresos Referendos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(IngresosReferendos ingresosreferendos) throws Exception {
		IngresosReferendosConstantesFunciones.seleccionarAsignar(this.ingresosreferendos,ingresosreferendos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarIngresosReferendos=this.isPermisoActualizarOriginalIngresosReferendos;
			
			
			this.seleccionarAsignar(ingresosreferendos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesIngresosReferendos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ingresosreferendosSessionBean.setsFuncionBusquedaRapida(this.ingresosreferendosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoIngresosReferendos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosIngresosReferendos(esParaCancelar);				
				this.cancelarNuevoIngresosReferendos(esParaCancelar);								
			}
			
			this.ingresosreferendos=new IngresosReferendos();
			
			this.inicializarIngresosReferendos();
			
			this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarIngresosReferendos() throws Exception {
		try {
			IngresosReferendosConstantesFunciones.inicializarIngresosReferendos(this.ingresosreferendos);
			
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
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ingresosreferendosLogic.getIngresosReferendoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteIngresosReferendoss(String sAccionBusqueda,List<IngresosReferendos> ingresosreferendossParaReportes) throws Exception {
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
					sPathReporteFinal="IngresosReferendos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="IngresosReferendosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("IngresosReferendosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="IngresosReferendos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ingresos Referendoses");		
		parameters.put("busquedapor", IngresosReferendosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceIngresosReferendos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			IngresosReferendosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			IngresosReferendosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceIngresosReferendos=new JRBeanArrayDataSource(IngresosReferendosJInternalFrame.TraerIngresosReferendosBeans(ingresosreferendossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceIngresosReferendos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+IngresosReferendosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+IngresosReferendosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(IngresosReferendosBean.TraerIngresosReferendosBeans(ingresosreferendossParaReportes).toArray()));
							
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
				this.generarExcelReporteIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoIngresosReferendosActionPerformed(null);
					//this.generarExcelReporteIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesIngresosReferendoss(sAccionBusqueda,sTipoArchivoReporte,ingresosreferendossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteIngresosReferendoss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosReferendos> ingresosreferendossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosReferendoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngresosReferendos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(IngresosReferendos ingresosreferendos : ingresosreferendossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			IngresosReferendosConstantesFunciones.generarExcelReporteDataIngresosReferendos("NORMAL",row,workbook,ingresosreferendos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderIngresosReferendos(String sTipo,Row row,Workbook workbook) {
		
		IngresosReferendosConstantesFunciones.generarExcelReporteHeaderIngresosReferendos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalIngresosReferendoss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosReferendos> ingresosreferendossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosReferendoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(IngresosReferendos ingresosreferendos : ingresosreferendossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(IngresosReferendosConstantesFunciones.getIngresosReferendosDescripcion(ingresosreferendos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero_fue());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero_dau());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getnumero_referendo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getfecha_referendo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresosreferendos.getaforo_referendo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesIngresosReferendoss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosReferendos> ingresosreferendossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<IngresosReferendos> ingresosreferendossRespaldo=null;
		
		classes=IngresosReferendosConstantesFunciones.getClassesRelationshipsOfIngresosReferendos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ingresosreferendosLogic.setDatosCliente(this.datosCliente);
		this.ingresosreferendosLogic.setDatosDeep(this.datosDeep);
		this.ingresosreferendosLogic.setIsConDeep(true);
		
		ingresosreferendossRespaldo=this.ingresosreferendosLogic.getIngresosReferendoss();
		
		this.ingresosreferendosLogic.setIngresosReferendoss(ingresosreferendossParaReportes);	
		this.ingresosreferendosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ingresosreferendossParaReportes=this.ingresosreferendosLogic.getIngresosReferendoss();
		this.ingresosreferendosLogic.setIngresosReferendoss(ingresosreferendossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosReferendoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngresosReferendos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(IngresosReferendos ingresosreferendos : ingresosreferendossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderIngresosReferendos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			IngresosReferendosConstantesFunciones.generarExcelReporteDataIngresosReferendos("NORMAL",row,workbook,ingresosreferendos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(IngresosReferendosConstantesFunciones.getIngresosReferendosDescripcion(ingresosreferendos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosReferendos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessIngresosReferendos() throws Exception {		
		this.startProcessIngresosReferendos(true);
	}
	
	public void startProcessIngresosReferendos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasIngresosReferendos ,this.jPanelParametrosReportesIngresosReferendos, this.jScrollPanelDatosIngresosReferendos,this.jPanelPaginacionIngresosReferendos, this.jScrollPanelDatosEdicionIngresosReferendos, this.jPanelAccionesIngresosReferendos,this.jPanelAccionesFormularioIngresosReferendos,this.jmenuBarIngresosReferendos,this.jmenuBarDetalleIngresosReferendos,this.jTtoolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos);		
		
		final JTabbedPane jTabbedPaneBusquedasIngresosReferendos=this.jTabbedPaneBusquedasIngresosReferendos; 
		
		final JPanel jPanelParametrosReportesIngresosReferendos=this.jPanelParametrosReportesIngresosReferendos;
		//final JScrollPane jScrollPanelDatosIngresosReferendos=this.jScrollPanelDatosIngresosReferendos;
		final JTable jTableDatosIngresosReferendos=this.jTableDatosIngresosReferendos;		
		final JPanel jPanelPaginacionIngresosReferendos=this.jPanelPaginacionIngresosReferendos;
		//final JScrollPane jScrollPanelDatosEdicionIngresosReferendos=this.jScrollPanelDatosEdicionIngresosReferendos;
		final JPanel jPanelAccionesIngresosReferendos=this.jPanelAccionesIngresosReferendos;
		
		JPanel jPanelCamposAuxiliarIngresosReferendos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarIngresosReferendos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			jPanelCamposAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jPanelCamposIngresosReferendos;
			jPanelAccionesFormularioAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jPanelAccionesFormularioIngresosReferendos;
		}
		
		final JPanel jPanelCamposIngresosReferendos=jPanelCamposAuxiliarIngresosReferendos;
		final JPanel jPanelAccionesFormularioIngresosReferendos=jPanelAccionesFormularioAuxiliarIngresosReferendos;
		
		
		final JMenuBar jmenuBarIngresosReferendos=this.jmenuBarIngresosReferendos;
		final JToolBar jTtoolBarIngresosReferendos=this.jTtoolBarIngresosReferendos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarIngresosReferendos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngresosReferendos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			jmenuBarDetalleAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jmenuBarDetalleIngresosReferendos;
			jTtoolBarDetalleAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jTtoolBarDetalleIngresosReferendos;
		}
		
		final JMenuBar jmenuBarDetalleIngresosReferendos=jmenuBarDetalleAuxiliarIngresosReferendos;
		final JToolBar jTtoolBarDetalleIngresosReferendos=jTtoolBarDetalleAuxiliarIngresosReferendos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngresosReferendos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngresosReferendos;
			processRunnable.jTableDatos=jTableDatosIngresosReferendos;
			processRunnable.jPanelCampos=jPanelCamposIngresosReferendos;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngresosReferendos;
			processRunnable.jPanelAcciones=jPanelAccionesIngresosReferendos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngresosReferendos;
			
			
			processRunnable.jmenuBar=jmenuBarIngresosReferendos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngresosReferendos;
			processRunnable.jTtoolBar=jTtoolBarIngresosReferendos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngresosReferendos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngresosReferendos ,jPanelParametrosReportesIngresosReferendos,jTableDatosIngresosReferendos, /*jScrollPanelDatosIngresosReferendos,*/jPanelCamposIngresosReferendos,jPanelPaginacionIngresosReferendos, /*jScrollPanelDatosEdicionIngresosReferendos,*/ jPanelAccionesIngresosReferendos,jPanelAccionesFormularioIngresosReferendos,jmenuBarIngresosReferendos,jmenuBarDetalleIngresosReferendos,jTtoolBarIngresosReferendos,jTtoolBarDetalleIngresosReferendos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngresosReferendos ,jPanelParametrosReportesIngresosReferendos, jScrollPanelDatosIngresosReferendos,jPanelPaginacionIngresosReferendos, jScrollPanelDatosEdicionIngresosReferendos, jPanelAccionesIngresosReferendos,jPanelAccionesFormularioIngresosReferendos,jmenuBarIngresosReferendos,jmenuBarDetalleIngresosReferendos,jTtoolBarIngresosReferendos,jTtoolBarDetalleIngresosReferendos);
						
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
	
	public void finishProcessIngresosReferendos() {// throws Exception 
		this.finishProcessIngresosReferendos(true);
	}
	
	public void finishProcessIngresosReferendos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasIngresosReferendos ,this.jPanelParametrosReportesIngresosReferendos, this.jScrollPanelDatosIngresosReferendos,this.jPanelPaginacionIngresosReferendos, this.jScrollPanelDatosEdicionIngresosReferendos, this.jPanelAccionesIngresosReferendos,this.jPanelAccionesFormularioIngresosReferendos,this.jmenuBarIngresosReferendos,this.jmenuBarDetalleIngresosReferendos,this.jTtoolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos);		
		
		final JTabbedPane jTabbedPaneBusquedasIngresosReferendos=this.jTabbedPaneBusquedasIngresosReferendos; 
		
		final JPanel jPanelParametrosReportesIngresosReferendos=this.jPanelParametrosReportesIngresosReferendos;
		//final JScrollPane jScrollPanelDatosIngresosReferendos=this.jScrollPanelDatosIngresosReferendos;
		final JTable jTableDatosIngresosReferendos=this.jTableDatosIngresosReferendos;		
		final JPanel jPanelPaginacionIngresosReferendos=this.jPanelPaginacionIngresosReferendos;
		//final JScrollPane jScrollPanelDatosEdicionIngresosReferendos=this.jScrollPanelDatosEdicionIngresosReferendos;
		final JPanel jPanelAccionesIngresosReferendos=this.jPanelAccionesIngresosReferendos;
		
		JPanel jPanelCamposAuxiliarIngresosReferendos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarIngresosReferendos=new JPanel();
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			jPanelCamposAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jPanelCamposIngresosReferendos;
			jPanelAccionesFormularioAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jPanelAccionesFormularioIngresosReferendos;
		}
		
		final JPanel jPanelCamposIngresosReferendos=jPanelCamposAuxiliarIngresosReferendos;
		final JPanel jPanelAccionesFormularioIngresosReferendos=jPanelAccionesFormularioAuxiliarIngresosReferendos;
		
		
		final JMenuBar jmenuBarIngresosReferendos=this.jmenuBarIngresosReferendos;		
		final JToolBar jTtoolBarIngresosReferendos=this.jTtoolBarIngresosReferendos;
				
		JMenuBar jmenuBarDetalleAuxiliarIngresosReferendos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngresosReferendos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			jmenuBarDetalleAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jmenuBarDetalleIngresosReferendos;
			jTtoolBarDetalleAuxiliarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jTtoolBarDetalleIngresosReferendos;		
		}
		
		final JMenuBar jmenuBarDetalleIngresosReferendos=jmenuBarDetalleAuxiliarIngresosReferendos;
		final JToolBar jTtoolBarDetalleIngresosReferendos=jTtoolBarDetalleAuxiliarIngresosReferendos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngresosReferendos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngresosReferendos;
			processRunnable.jTableDatos=jTableDatosIngresosReferendos;
			processRunnable.jPanelCampos=jPanelCamposIngresosReferendos;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngresosReferendos;
			processRunnable.jPanelAcciones=jPanelAccionesIngresosReferendos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngresosReferendos;
			
			
			processRunnable.jmenuBar=jmenuBarIngresosReferendos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngresosReferendos;
			processRunnable.jTtoolBar=jTtoolBarIngresosReferendos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngresosReferendos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasIngresosReferendos ,jPanelParametrosReportesIngresosReferendos, jTableDatosIngresosReferendos,/*jScrollPanelDatosIngresosReferendos,*/jPanelCamposIngresosReferendos,jPanelPaginacionIngresosReferendos, /*jScrollPanelDatosEdicionIngresosReferendos,*/ jPanelAccionesIngresosReferendos,jPanelAccionesFormularioIngresosReferendos,jmenuBarIngresosReferendos,jmenuBarDetalleIngresosReferendos,jTtoolBarIngresosReferendos,jTtoolBarDetalleIngresosReferendos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesIngresosReferendos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarIngresosReferendos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuIngresosReferendos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarIngresosReferendos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarIngresosReferendos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleIngresosReferendos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuIngresosReferendos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarIngresosReferendos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleIngresosReferendos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ingresosreferendosConstantesFunciones.getsFinalQueryIngresosReferendos();
		String  finalQueryPaginacionTodos=this.ingresosreferendosConstantesFunciones.getsFinalQueryIngresosReferendos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=IngresosReferendosConstantesFunciones.getArrayColumnasGlobalesNoIngresosReferendos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=IngresosReferendosConstantesFunciones.getArrayColumnasGlobalesIngresosReferendos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,IngresosReferendosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ingresosreferendossEliminados= new ArrayList<IngresosReferendos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessIngresosReferendos();
		
				///*IngresosReferendosSessionBean*/this.ingresosreferendosSessionBean=new IngresosReferendosSessionBean();
			
			if(this.ingresosreferendosSessionBean==null) {
				this.ingresosreferendosSessionBean=new IngresosReferendosSessionBean();
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
					this.iNumeroPaginacion=IngresosReferendosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=IngresosReferendosConstantesFunciones.getClassesForeignKeysOfIngresosReferendos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ingresosreferendos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ingresosreferendossAux= new ArrayList<IngresosReferendos>();
			
				
			ingresosreferendosLogic.setDatosCliente(this.datosCliente);
			ingresosreferendosLogic.setDatosDeep(this.datosDeep);
			ingresosreferendosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaIngresosReferendos")) {
				this.sDetalleReporte=IngresosReferendosConstantesFunciones.getDetalleIndiceBusquedaIngresosReferendos(fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingresosreferendosLogic.getIngresosReferendossBusquedaIngresosReferendos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngresosReferendosConstantesFunciones.getDetalleIndiceBusquedaIngresosReferendos(fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngresosReferendosConstantesFunciones.getDetalleIndiceBusquedaIngresosReferendos(fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingresosreferendosLogic.getIngresosReferendoss()==null||ingresosreferendosLogic.getIngresosReferendoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingresosreferendoss==null|| ingresosreferendoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresosreferendossAux=new ArrayList<IngresosReferendos>();
						ingresosreferendossAux.addAll(ingresosreferendosLogic.getIngresosReferendoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresosreferendossAux=new ArrayList<IngresosReferendos>();
							ingresosreferendossAux.addAll(ingresosreferendoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingresosreferendosLogic.getIngresosReferendossBusquedaIngresosReferendos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngresosReferendosConstantesFunciones.getDetalleIndiceBusquedaIngresosReferendos(fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngresosReferendosConstantesFunciones.getDetalleIndiceBusquedaIngresosReferendos(fecha_emision_desdeBusquedaIngresosReferendos,fecha_emision_hastaBusquedaIngresosReferendos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngresosReferendoss("BusquedaIngresosReferendos",ingresosreferendosLogic.getIngresosReferendoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngresosReferendoss("BusquedaIngresosReferendos",ingresosreferendoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresosreferendosLogic.setIngresosReferendoss(new ArrayList<IngresosReferendos>());
						ingresosreferendosLogic.getIngresosReferendoss().addAll(ingresosreferendossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresosreferendoss=new ArrayList<IngresosReferendos>();
							ingresosreferendoss.addAll(ingresosreferendossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesIngresosReferendos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessIngresosReferendos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingresosreferendosLogic.getIngresosReferendoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresosreferendoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingresosreferendosLogic.getIngresosReferendoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresosreferendoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(IngresosReferendos ingresosreferendos) {
		Boolean permite=true;
		
		if(this.ingresosreferendos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=IngresosReferendosConstantesFunciones.getOrderByListaIngresosReferendos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=IngresosReferendosConstantesFunciones.getOrderByListaIngresosReferendos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosReferendos ingresosreferendos:ingresosreferendosLogic.getIngresosReferendoss()) {
				if(ingresosreferendos.getsType().equals(Constantes2.S_TOTALES)) {
					ingresosreferendosTotales=ingresosreferendos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosReferendos ingresosreferendos:this.ingresosreferendoss) {
				if(ingresosreferendos.getsType().equals(Constantes2.S_TOTALES)) {
					ingresosreferendosTotales=ingresosreferendos;
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
			this.ingresosreferendosAux=new IngresosReferendos();
			this.ingresosreferendosAux.setsType(Constantes2.S_TOTALES);
			this.ingresosreferendosAux.setIsNew(false);
			this.ingresosreferendosAux.setIsChanged(false);
			this.ingresosreferendosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//IngresosReferendosConstantesFunciones.TotalizarValoresFilaIngresosReferendos(this.ingresosreferendosLogic.getIngresosReferendoss(),this.ingresosreferendosAux);
				
				//this.ingresosreferendosLogic.getIngresosReferendoss().add(this.ingresosreferendosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				IngresosReferendosConstantesFunciones.TotalizarValoresFilaIngresosReferendos(this.ingresosreferendoss,this.ingresosreferendosAux);
				
				this.ingresosreferendoss.add(this.ingresosreferendosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ingresosreferendosTotales=new IngresosReferendos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingresosreferendosLogic.getIngresosReferendoss().remove(ingresosreferendosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingresosreferendoss.remove(ingresosreferendosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ingresosreferendosTotales=new IngresosReferendos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosReferendos ingresosreferendos:ingresosreferendosLogic.getIngresosReferendoss()) {
				if(ingresosreferendos.getsType().equals(Constantes2.S_TOTALES)) {
					ingresosreferendosTotales=ingresosreferendos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngresosReferendosConstantesFunciones.TotalizarValoresFilaIngresosReferendos(this.ingresosreferendosLogic.getIngresosReferendoss(),ingresosreferendosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosReferendos ingresosreferendos:this.ingresosreferendoss) {
				if(ingresosreferendos.getsType().equals(Constantes2.S_TOTALES)) {
					ingresosreferendosTotales=ingresosreferendos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngresosReferendosConstantesFunciones.TotalizarValoresFilaIngresosReferendos(this.ingresosreferendoss,ingresosreferendosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getIngresosReferendossBusquedaIngresosReferendos()throws Exception {
		try {
			sAccionBusqueda="BusquedaIngresosReferendos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getIngresosReferendossBusquedaIngresosReferendos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresosreferendosLogic.getIngresosReferendossBusquedaIngresosReferendos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
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
	
	public void inicializarPermisosIngresosReferendos() {
		this.isPermisoTodoIngresosReferendos=false;
		this.isPermisoNuevoIngresosReferendos=false;
		this.isPermisoActualizarIngresosReferendos=false;
		this.isPermisoActualizarOriginalIngresosReferendos=false;
		this.isPermisoEliminarIngresosReferendos=false;
		this.isPermisoGuardarCambiosIngresosReferendos=false;
		this.isPermisoConsultaIngresosReferendos=true;
		this.isPermisoBusquedaIngresosReferendos=true;
		this.isPermisoReporteIngresosReferendos=true;
		this.isPermisoOrdenIngresosReferendos=false;		
		this.isPermisoPaginacionMedioIngresosReferendos=false;		
		this.isPermisoPaginacionAltoIngresosReferendos=false;		
		this.isPermisoPaginacionTodoIngresosReferendos=false;		
		this.isPermisoCopiarIngresosReferendos=false;		
		this.isPermisoVerFormIngresosReferendos=false;		
		this.isPermisoDuplicarIngresosReferendos=false;
		this.isPermisoOrdenIngresosReferendos=false;
	}
	
	public void setPermisosUsuarioIngresosReferendos(Boolean isPermiso) {
		this.isPermisoTodoIngresosReferendos=isPermiso;
		this.isPermisoNuevoIngresosReferendos=isPermiso;
		this.isPermisoActualizarIngresosReferendos=isPermiso;
		this.isPermisoActualizarOriginalIngresosReferendos=isPermiso;
		this.isPermisoEliminarIngresosReferendos=isPermiso;
		this.isPermisoGuardarCambiosIngresosReferendos=isPermiso;
		this.isPermisoConsultaIngresosReferendos=isPermiso;
		this.isPermisoBusquedaIngresosReferendos=isPermiso;
		this.isPermisoReporteIngresosReferendos=isPermiso;
		this.isPermisoOrdenIngresosReferendos=isPermiso;		
		this.isPermisoPaginacionMedioIngresosReferendos=isPermiso;		
		this.isPermisoPaginacionAltoIngresosReferendos=isPermiso;		
		this.isPermisoPaginacionTodoIngresosReferendos=isPermiso;		
		this.isPermisoCopiarIngresosReferendos=isPermiso;		
		this.isPermisoVerFormIngresosReferendos=isPermiso;		
		this.isPermisoDuplicarIngresosReferendos=isPermiso;
		this.isPermisoOrdenIngresosReferendos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioIngresosReferendos(Boolean isPermiso) {
		//this.isPermisoTodoIngresosReferendos=isPermiso;
		this.isPermisoNuevoIngresosReferendos=isPermiso;
		this.isPermisoActualizarIngresosReferendos=isPermiso;
		this.isPermisoActualizarOriginalIngresosReferendos=isPermiso;
		this.isPermisoEliminarIngresosReferendos=isPermiso;
		this.isPermisoGuardarCambiosIngresosReferendos=isPermiso;
		//this.isPermisoConsultaIngresosReferendos=isPermiso;
		//this.isPermisoBusquedaIngresosReferendos=isPermiso;
		//this.isPermisoReporteIngresosReferendos=isPermiso;
		//this.isPermisoOrdenIngresosReferendos=isPermiso;		
		//this.isPermisoPaginacionMedioIngresosReferendos=isPermiso;		
		//this.isPermisoPaginacionAltoIngresosReferendos=isPermiso;		
		//this.isPermisoPaginacionTodoIngresosReferendos=isPermiso;		
		//this.isPermisoCopiarIngresosReferendos=isPermiso;		
		//this.isPermisoDuplicarIngresosReferendos=isPermiso;
		//this.isPermisoOrdenIngresosReferendos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioIngresosReferendosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(IngresosReferendosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebIngresosReferendos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioIngresosReferendosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioIngresosReferendosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionIngresosReferendosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioIngresosReferendosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioIngresosReferendos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(IngresosReferendosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, IngresosReferendosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoIngresosReferendos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarIngresosReferendos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalIngresosReferendos=this.isPermisoActualizarIngresosReferendos;
			this.isPermisoEliminarIngresosReferendos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosIngresosReferendos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaIngresosReferendos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaIngresosReferendos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoIngresosReferendos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteIngresosReferendos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngresosReferendos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioIngresosReferendos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoIngresosReferendos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoIngresosReferendos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarIngresosReferendos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormIngresosReferendos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarIngresosReferendos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngresosReferendos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosIngresosReferendos.setToolTipText(this.jTableDatosIngresosReferendos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioIngresosReferendos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioIngresosReferendos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(IngresosReferendosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(IngresosReferendosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioIngresosReferendos() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyIngresosReferendosListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyIngresosReferendosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(IngresosReferendosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	
	public void addItemDefectoCombosTodosForeignKeyIngresosReferendos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyIngresosReferendos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyIngresosReferendos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyIngresosReferendos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosReferendos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyIngresosReferendos(IngresosReferendos ingresosreferendos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyIngresosReferendos(IngresosReferendos ingresosreferendos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyIngresosReferendos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosReferendos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyIngresosReferendos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyIngresosReferendos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroIngresosReferendos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyIngresosReferendos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyIngresosReferendos(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyIngresosReferendos()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public IngresosReferendosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public IngresosReferendosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public IngresosReferendosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ingresosreferendosSessionBean=new IngresosReferendosSessionBean(); 
		this.ingresosreferendosConstantesFunciones=new IngresosReferendosConstantesFunciones(); 
		this.ingresosreferendosBean=new IngresosReferendos();//(this.ingresosreferendosConstantesFunciones); 		
		this.ingresosreferendosReturnGeneral=new IngresosReferendosParameterReturnGeneral(); 
		
		this.ingresosreferendosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresosreferendosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public IngresosReferendosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public IngresosReferendosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public IngresosReferendosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessIngresosReferendos(true);
			
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
			
			this.ingresosreferendosConstantesFunciones=new IngresosReferendosConstantesFunciones(); 
			this.ingresosreferendosBean=new IngresosReferendos();//this.ingresosreferendosConstantesFunciones); 			
			this.ingresosreferendosReturnGeneral=new IngresosReferendosParameterReturnGeneral(); 
		
			IngresosReferendosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingresos Referendos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.ingresosreferendos=new IngresosReferendos();
			this.ingresosreferendoss = new ArrayList<IngresosReferendos>();
			this.ingresosreferendossAux = new ArrayList<IngresosReferendos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic=new IngresosReferendosLogic();
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			//this.ingresosreferendosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ingresosreferendosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormIngresosReferendos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngresosReferendos);	
					}
					
					if(this.jInternalFrameImportacionIngresosReferendos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngresosReferendos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByIngresosReferendos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByIngresosReferendos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormIngresosReferendos);
				this.jInternalFrameDetalleFormIngresosReferendos.setVisible(false);
				this.jInternalFrameDetalleFormIngresosReferendos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngresosReferendos);
					this.jInternalFrameReporteDinamicoIngresosReferendos.setVisible(false);
					this.jInternalFrameReporteDinamicoIngresosReferendos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionIngresosReferendos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionIngresosReferendos);
					this.jInternalFrameImportacionIngresosReferendos.setVisible(false);
					this.jInternalFrameImportacionIngresosReferendos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByIngresosReferendos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByIngresosReferendos);
					this.jInternalFrameOrderByIngresosReferendos.setVisible(false);
					this.jInternalFrameOrderByIngresosReferendos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idIngresosReferendosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=IngresosReferendosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ingresosreferendosReturnGeneral=new IngresosReferendosParameterReturnGeneral();
			
			this.ingresosreferendosParameterGeneral=new IngresosReferendosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ingresosreferendosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(IngresosReferendosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngresosReferendosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingresosreferendosSessionBean.getEsGuardarRelacionado(),this.ingresosreferendosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngresosReferendosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingresosreferendosSessionBean.getEsGuardarRelacionado(),this.ingresosreferendosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaDuplicarIngresosReferendos=true;
			this.isVisibilidadCeldaCopiarIngresosReferendos=true;
			this.isVisibilidadCeldaVerFormIngresosReferendos=true;
			this.isVisibilidadCeldaOrdenIngresosReferendos=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			
			
			this.isVisibilidadBusquedaIngresosReferendos=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosIngresosReferendos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioIngresosReferendos(false);
			
			this.setPermisosUsuarioIngresosReferendos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado() 
				|| (this.ingresosreferendosSessionBean.getEsGuardarRelacionado() && this.ingresosreferendosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioIngresosReferendosClasesRelacionadas();
			}
			
			if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioIngresosReferendosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosIngresosReferendos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualIngresosReferendos();
			}
			
			if(!this.isPermisoBusquedaIngresosReferendos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(IngresosReferendosConstantesFunciones.getTiposSeleccionarIngresosReferendos());
				
				this.tiposColumnasSelect=IngresosReferendosConstantesFunciones.getTiposSeleccionarIngresosReferendos(true);
				
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
			//if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioIngresosReferendos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioIngresosReferendos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioIngresosReferendos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosReferendos() ;
			
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
				ingresosreferendosImplementable= (IngresosReferendosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngresosReferendosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ingresosreferendosImplementableHome= (IngresosReferendosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngresosReferendosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ingresosreferendoss= new ArrayList<IngresosReferendos>();
			this.ingresosreferendossEliminados= new ArrayList<IngresosReferendos>();
						
			this.isEsNuevoIngresosReferendos=false;
			this.esParaAccionDesdeFormularioIngresosReferendos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyIngresosReferendos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroIngresosReferendos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			IngresosReferendosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=IngresosReferendosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesIngresosReferendos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingIngresosReferendos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioIngresosReferendos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioIngresosReferendos();
			}
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasIngresosReferendos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasIngresosReferendos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasIngresosReferendos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessIngresosReferendos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga IngresosReferendos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectIngresosReferendos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesIngresosReferendos")) {
				iIndex=this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessIngresosReferendos();	
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
	
	public void cargarCombosForeignKeyIngresosReferendos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyIngresosReferendos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyIngresosReferendos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyIngresosReferendosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyIngresosReferendos();
		
		this.cargarCombosFrameForeignKeyIngresosReferendos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyIngresosReferendos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyIngresosReferendos();
		}
	}
	
	
	
	public void jButtonNuevoIngresosReferendosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			
			if(jTableDatosIngresosReferendos.getRowCount()>=1) {
				jTableDatosIngresosReferendos.removeRowSelectionInterval(0, jTableDatosIngresosReferendos.getRowCount()-1);						
			}
			
			this.isEsNuevoIngresosReferendos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoIngresosReferendos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesIngresosReferendos(true);			
			//this.ingresosreferendos=new IngresosReferendos();
			//this.ingresosreferendos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosReferendos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosReferendos() ;
			
			if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosReferendos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ingresosreferendos);	
			this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);				
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar IngresosReferendos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarIngresosReferendosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosIngresosReferendos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosIngresosReferendos.getSelectedRows().length;			
			}
			
			ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoIngresosReferendos--;			
				//IngresosReferendos ingresosreferendosAux= new IngresosReferendos();			
				//ingresosreferendosAux.setId(this.iIdNuevoIngresosReferendos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//IngresosReferendos ingresosreferendosOrigen=new IngresosReferendos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(IngresosReferendos ingresosreferendosOrigen : ingresosreferendossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ingresosreferendosOrigen =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresosreferendosOrigen =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaIngresosReferendos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ingresosreferendos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosIngresosReferendos(ingresosreferendosOrigen,this.ingresosreferendos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingresosreferendosLogic.getIngresosReferendoss().add(this.ingresosreferendosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingresosreferendoss.add(this.ingresosreferendosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
				
				this.jTableDatosIngresosReferendos.setRowSelectionInterval(this.getIndiceNuevoIngresosReferendos(), this.getIndiceNuevoIngresosReferendos());
				
				int iLastRow =  this.jTableDatosIngresosReferendos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngresosReferendos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngresosReferendos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosReferendos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();									
		
			IngresosReferendos ingresosreferendosOrigen=new IngresosReferendos();
			IngresosReferendos ingresosreferendosDestino=new IngresosReferendos();
				
			ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosIngresosReferendos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ingresosreferendossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosIngresosReferendos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresosreferendosOrigen =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingresosreferendosOrigen =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresosreferendosDestino =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingresosreferendosDestino =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ingresosreferendosOrigen =ingresosreferendossSeleccionados.get(0);
				ingresosreferendosDestino =ingresosreferendossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosIngresosReferendos(ingresosreferendosOrigen,ingresosreferendosDestino,true,false);
				
				ingresosreferendosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ingresosreferendosDestino,ingresosreferendosLogic.getIngresosReferendoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingresosreferendosDestino,ingresosreferendoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
				
				//this.jTableDatosIngresosReferendos.setRowSelectionInterval(this.getIndiceNuevoIngresosReferendos(), this.getIndiceNuevoIngresosReferendos());
				
				int iLastRow =  this.jTableDatosIngresosReferendos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngresosReferendos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngresosReferendos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosReferendos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormIngresosReferendos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesIngresosReferendos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasIngresosReferendos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesIngresosReferendos.setVisible(!isVisible);
			this.jPanelPaginacionIngresosReferendos.setVisible(!isVisible);
			this.jPanelAccionesIngresosReferendos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameIngresosReferendos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoIngresosReferendos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionIngresosReferendos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByIngresosReferendos();
			
			this.abrirFrameOrderByIngresosReferendos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByIngresosReferendos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleIngresosReferendos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngresosReferendos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormIngresosReferendos.isMaximum()) {
					this.jInternalFrameDetalleFormIngresosReferendos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormIngresosReferendos.setSize(this.jInternalFrameDetalleFormIngresosReferendos.iWidthFormulario,this.jInternalFrameDetalleFormIngresosReferendos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormIngresosReferendos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormIngresosReferendos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormIngresosReferendos.isMaximum()) {
						this.jInternalFrameDetalleFormIngresosReferendos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormIngresosReferendos.jContentPaneDetalleIngresosReferendos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormIngresosReferendos.jContentPaneDetalleIngresosReferendos.getWidth(),IngresosReferendosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormIngresosReferendos.jContentPaneDetalleIngresosReferendos.getWidth(),IngresosReferendosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormIngresosReferendos.jContentPaneDetalleIngresosReferendos.getWidth(),IngresosReferendosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormIngresosReferendos.setVisible(true);
	        this.jInternalFrameDetalleFormIngresosReferendos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByIngresosReferendos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByIngresosReferendos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByIngresosReferendos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosReferendos,false,this);
				} else {
					this.jInternalFrameOrderByIngresosReferendos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosReferendos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByIngresosReferendos);
				this.jInternalFrameOrderByIngresosReferendos.setVisible(false);
				this.jInternalFrameOrderByIngresosReferendos.setSelected(false);
				
				this.jInternalFrameOrderByIngresosReferendos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngresosReferendos"));
				
				this.inicializarActualizarBindingTablaOrderByIngresosReferendos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionIngresosReferendos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionIngresosReferendos==null) {
				
				this.jInternalFrameImportacionIngresosReferendos=new ImportacionJInternalFrame(IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngresosReferendos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionIngresosReferendos);
				this.jInternalFrameImportacionIngresosReferendos.setVisible(false);
				this.jInternalFrameImportacionIngresosReferendos.setSelected(false);


				this.jInternalFrameImportacionIngresosReferendos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngresosReferendos"));
				this.jInternalFrameImportacionIngresosReferendos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngresosReferendos"));
				this.jInternalFrameImportacionIngresosReferendos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngresosReferendos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoIngresosReferendos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoIngresosReferendos==null) {
				this.jInternalFrameReporteDinamicoIngresosReferendos=new ReporteDinamicoJInternalFrame(IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngresosReferendos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngresosReferendos);
				this.jInternalFrameReporteDinamicoIngresosReferendos.setVisible(false);
				this.jInternalFrameReporteDinamicoIngresosReferendos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosReferendos"));
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosReferendos"));
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosReferendos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosReferendos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleIngresosReferendos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngresosReferendos);
			
	       	this.jInternalFrameDetalleFormIngresosReferendos.setVisible(false);
	        this.jInternalFrameDetalleFormIngresosReferendos.setSelected(false);
			
			//this.jInternalFrameDetalleFormIngresosReferendos.dispose();
			//this.jInternalFrameDetalleFormIngresosReferendos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoIngresosReferendos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoIngresosReferendos.setVisible(true);
	        this.jInternalFrameReporteDinamicoIngresosReferendos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionIngresosReferendos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionIngresosReferendos.setVisible(true);
	        this.jInternalFrameImportacionIngresosReferendos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByIngresosReferendos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByIngresosReferendos.setVisible(true);
	        this.jInternalFrameOrderByIngresosReferendos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByIngresosReferendos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByIngresosReferendos.setVisible(false);
	        this.jInternalFrameOrderByIngresosReferendos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoIngresosReferendos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoIngresosReferendos.setVisible(false);
	        this.jInternalFrameReporteDinamicoIngresosReferendos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionIngresosReferendos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionIngresosReferendos.setVisible(false);
	        this.jInternalFrameImportacionIngresosReferendos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarIngresosReferendos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarIngresosReferendos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesIngresosReferendos(true);
			//this.isEsNuevoIngresosReferendos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesIngresosReferendos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosReferendos(false) ;
			
			if(ingresosreferendosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosReferendos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosReferendos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaIngresosReferendosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarIngresosReferendos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesIngresosReferendos(true);
			//this.isEsNuevoIngresosReferendos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ingresosreferendos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesIngresosReferendos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesIngresosReferendos(false) ;
			
			if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosReferendos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosReferendos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesIngresosReferendos(false);
			
			//if(!this.isEsNuevoIngresosReferendos) {								
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				
			}
			
			if(this.permiteMantenimiento(this.ingresosreferendos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoIngresosReferendos=true;
					this.inicializarActualizarBindingTablaIngresosReferendos(false);
					this.isEsNuevoIngresosReferendos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoIngresosReferendos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoIngresosReferendos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngresosReferendos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosReferendos(false);
				
				this.habilitarDeshabilitarControlesIngresosReferendos(false);
			
												
				
				if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleIngresosReferendos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoIngresosReferendosActionPerformed(evt,ingresosreferendosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualIngresosReferendos(this.ingresosreferendos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosIngresosReferendos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ingresosreferendosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ingresosreferendos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				this.ingresosreferendos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				this.ingresosreferendos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ingresosreferendos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((IngresosReferendosModel) this.jTableDatosIngresosReferendos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoIngresosReferendos=true;
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
				this.isEsNuevoIngresosReferendos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngresosReferendos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosReferendos(false);
				
				this.habilitarDeshabilitarControlesIngresosReferendos(false);
				
				
				
				if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleIngresosReferendos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosIngresosReferendos.getRowCount()>=1) {
				jTableDatosIngresosReferendos.removeRowSelectionInterval(0, jTableDatosIngresosReferendos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesIngresosReferendos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaIngresosReferendos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosReferendos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosReferendos(false) ;
			
			this.isEsNuevoIngresosReferendos=false;
			
			if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleIngresosReferendos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingIngresosReferendos(false);
				
				//SI ES MANUAL
				if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualIngresosReferendos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoIngresosReferendos--;			
			//IngresosReferendos ingresosreferendosAux= new IngresosReferendos();			
			//ingresosreferendosAux.setId(this.iIdNuevoIngresosReferendos);
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaIngresosReferendos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
			
			this.ingresosreferendos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ingresosreferendosLogic.getIngresosReferendoss().add(this.ingresosreferendosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ingresosreferendoss.add(this.ingresosreferendosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaIngresosReferendos(false);
			
			this.jTableDatosIngresosReferendos.setRowSelectionInterval(this.getIndiceNuevoIngresosReferendos(), this.getIndiceNuevoIngresosReferendos());
			
			int iLastRow =  this.jTableDatosIngresosReferendos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosIngresosReferendos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosIngresosReferendos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosReferendos(false);
			
			//SI ES MANUAL
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosReferendos();
			}
			
			//this.abrirFrameTreeIngresosReferendos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionIngresosReferendos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionIngresosReferendos.setFileImportacion(this.jInternalFrameImportacionIngresosReferendos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionIngresosReferendos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionIngresosReferendos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionIngresosReferendos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionIngresosReferendos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		

		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("IngresosReferendosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"IngresosReferendosBaseDesign.jrxml";
			
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
			
			this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFue_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFue_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFue_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFue_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERODAU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDau_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDau_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDau_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDau_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroReferendo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroReferendo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroReferendo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroReferendo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaReferendo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaReferendo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaReferendo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaReferendo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_oroReferendo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_oroReferendo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_oroReferendo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_oroReferendo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoIngresosReferendos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE:
					sNombreCampoCategoria="numero_fue";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERODAU:
					sNombreCampoCategoria="numero_dau";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO:
					sNombreCampoCategoria="numero_referendo";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO:
					sNombreCampoCategoria="fecha_referendo";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO:
					sNombreCampoCategoria="aforo_referendo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE:
					sNombreCampoCategoriaValor="numero_fue";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERODAU:
					sNombreCampoCategoriaValor="numero_dau";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO:
					sNombreCampoCategoriaValor="numero_referendo";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO:
					sNombreCampoCategoriaValor="fecha_referendo";
					break;

				case IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO:
					sNombreCampoCategoriaValor="aforo_referendo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Fue",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_fue");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERODAU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dau",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dau");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Referendo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_referendo");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Referendo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_referendo");
					break;

				case IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Aforo Referendo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"aforo_referendo");
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
	
	public void jButtonGenerarExcelReporteDinamicoIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("IngresosReferendoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero_fue());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMERODAU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero_dau());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getnumero_referendo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getfecha_referendo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO);
					iRow++;

					for(IngresosReferendos ingresosreferendos:ingresosreferendossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresosreferendos.getaforo_referendo());
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
			//	this.getFilaCabeceraExportarExcelIngresosReferendos(row);				
			//	iRow++;
			//}				
			
			//for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelIngresosReferendos(ingresosreferendosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
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
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosReferendos(false);
			
			//SI ES MANUAL
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosReferendos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosReferendos(false);
			
			//SI ES MANUAL
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngresosReferendos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosReferendos(false);
			
			//SI ES MANUAL
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngresosReferendos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaIngresosReferendos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosIngresosReferendos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosIngresosReferendos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosIngresosReferendos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosIngresosReferendos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosIngresosReferendos.setMinimumSize(dimensionMinimum);
		this.jTableDatosIngresosReferendos.setMaximumSize(dimensionMaximum);
		this.jTableDatosIngresosReferendos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingIngresosReferendos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingIngresosReferendos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingIngresosReferendos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaIngresosReferendos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesIngresosReferendos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasIngresosReferendos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosReferendos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesIngresosReferendos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualIngresosReferendos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaIngresosReferendos();
		
		this.inicializarActualizarBindingBotonesManualIngresosReferendos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualIngresosReferendos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosReferendos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosReferendos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosReferendos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosIngresosReferendos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosIngresosReferendos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteIngresosReferendos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionNuevoIngresosReferendos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionSinCerrarIngresosReferendos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionSinMensajeIngresosReferendos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosIngresosReferendos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosIngresosReferendos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteIngresosReferendos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
				this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionNuevoIngresosReferendos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionSinCerrarIngresosReferendos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormIngresosReferendos.jCheckBoxPostAccionSinMensajeIngresosReferendos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionIngresosReferendos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionIngresosReferendos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesIngresosReferendos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesIngresosReferendos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesIngresosReferendos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarIngresosReferendos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesIngresosReferendos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesIngresosReferendos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralIngresosReferendos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesIngresosReferendos(Boolean esInicializar) throws Exception {
		try	{	
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosReferendos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesIngresosReferendos() throws Exception {
		try	{
			if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualIngresosReferendos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngresosReferendos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualIngresosReferendos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesIngresosReferendos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesIngresosReferendos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesIngresosReferendos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionIngresosReferendos.addItem(reporte);
			}
			
			
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionIngresosReferendos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionIngresosReferendos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesIngresosReferendos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesIngresosReferendos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarIngresosReferendos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarIngresosReferendos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarIngresosReferendos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosReferendos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosReferendos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
				
				if(this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoIngresosReferendos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngresosReferendos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualIngresosReferendos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaIngresosReferendos=new Date(this.jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.getDate().getTime());
		this.fecha_emision_hastaBusquedaIngresosReferendos=new Date(this.jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasIngresosReferendos(Boolean esInicializar) throws Exception {				
		if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualIngresosReferendos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaIngresosReferendos() throws Exception {
		this.inicializarActualizarBindingTablaIngresosReferendos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByIngresosReferendos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosIngresosReferendosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaIngresosReferendos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ingresosreferendosLogic.getIngresosReferendoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ingresosreferendoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosIngresosReferendos.setModel(new IngresosReferendosModel(this.ingresosreferendosLogic.getIngresosReferendoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosIngresosReferendos.setModel(new IngresosReferendosModel(this.ingresosreferendoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByIngresosReferendos!=null && this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByIngresosReferendos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,ingresosreferendosConstantesFunciones.resaltarSeleccionarIngresosReferendos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,ingresosreferendosConstantesFunciones.resaltarSeleccionarIngresosReferendos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_ID));

		if(this.ingresosreferendosConstantesFunciones.mostraridIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingresosreferendosConstantesFunciones.resaltaridIngresosReferendos,this.ingresosreferendosConstantesFunciones.activaridIngresosReferendos,this,true,"idIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltaridIngresosReferendos,this.ingresosreferendosConstantesFunciones.activaridIngresosReferendos,this,true,"idIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.ingresosreferendosConstantesFunciones.mostrarnombre_completo_clienteIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnombre_completo_clienteIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnombre_completo_clienteIngresosReferendos,this,true,"nombre_completo_clienteIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnombre_completo_clienteIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnombre_completo_clienteIngresosReferendos,this,true,"nombre_completo_clienteIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMERO));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumeroIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumeroIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumeroIngresosReferendos,this,true,"numeroIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumeroIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumeroIngresosReferendos,this,true,"numeroIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumero_autorizacionIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_autorizacionIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_autorizacionIngresosReferendos,this,true,"numero_autorizacionIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_autorizacionIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_autorizacionIngresosReferendos,this,true,"numero_autorizacionIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumero_fueIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_fueIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_fueIngresosReferendos,this,true,"numero_fueIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_fueIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_fueIngresosReferendos,this,true,"numero_fueIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumero_pre_impresoIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_pre_impresoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_pre_impresoIngresosReferendos,this,true,"numero_pre_impresoIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_pre_impresoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_pre_impresoIngresosReferendos,this,true,"numero_pre_impresoIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMERODAU));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumero_dauIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMERODAU,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_dauIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_dauIngresosReferendos,this,true,"numero_dauIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_dauIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_dauIngresosReferendos,this,true,"numero_dauIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO));

		if(this.ingresosreferendosConstantesFunciones.mostrarnumero_referendoIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_referendoIngresosReferendos,this,true,"numero_referendoIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarnumero_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarnumero_referendoIngresosReferendos,this,true,"numero_referendoIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO));

		if(this.ingresosreferendosConstantesFunciones.mostrarfecha_referendoIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ingresosreferendosConstantesFunciones.resaltarfecha_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarfecha_referendoIngresosReferendos,this,true,"fecha_referendoIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltarfecha_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activarfecha_referendoIngresosReferendos,this,true,"fecha_referendoIngresosReferendos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO));

		if(this.ingresosreferendosConstantesFunciones.mostraraforo_referendoIngresosReferendos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresosreferendosConstantesFunciones.resaltaraforo_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activaraforo_referendoIngresosReferendos,this,true,"aforo_referendoIngresosReferendos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresosreferendosConstantesFunciones.resaltaraforo_referendoIngresosReferendos,this.ingresosreferendosConstantesFunciones.activaraforo_referendoIngresosReferendos,this,true,"aforo_referendoIngresosReferendos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosReferendosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngresosReferendos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngresosReferendos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ingresosreferendosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosIngresosReferendos.addColumn(tableColumn);
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
			
			this.jTableDatosIngresosReferendos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosIngresosReferendos.moveColumn(this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosIngresosReferendos.moveColumn(this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosIngresosReferendos.moveColumn(this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosIngresosReferendos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosIngresosReferendos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosIngresosReferendos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosIngresosReferendos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosIngresosReferendos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosIngresosReferendos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosIngresosReferendos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ingresosreferendosLogic.getIngresosReferendoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ingresosreferendoss.size()-1;
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
		//this.jTableDatosIngresosReferendos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosIngresosReferendos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosIngresosReferendos();
			
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
				
				//this.isEsNuevoIngresosReferendos=false;
					
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
				if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormIngresosReferendos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngresosReferendos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngresosReferendos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ingresosreferendos.getsType().equals("DUPLICADO")
				   || this.ingresosreferendos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoIngresosReferendos=true;
				
				} else {
					this.isEsNuevoIngresosReferendos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
					if(this.ingresosreferendos.getId()>=0 && !this.ingresosreferendos.getIsNew()) {						
						this.isEsNuevoIngresosReferendos=false;
						
					} else {
						this.isEsNuevoIngresosReferendos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoIngresosReferendos(esRelaciones);						
				
				this.seleccionarIngresosReferendos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ingresosreferendos.getId()<0) {
					this.isEsNuevoIngresosReferendos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarIngresosReferendos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarIngresosReferendos(evt,rowIndex);
				}	
				
				if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion IngresosReferendos: " + this.dDif); 
					}
				}								
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarIngresosReferendos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ingresosreferendos)) {
					if(this.ingresosreferendos.getId()>0) {
						this.ingresosreferendos.setIsDeleted(true);
						
						this.ingresosreferendossEliminados.add(this.ingresosreferendos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingresosreferendosLogic.getIngresosReferendoss().remove(this.ingresosreferendos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingresosreferendoss.remove(this.ingresosreferendos);				
					}
					
					
					((IngresosReferendosModel) this.jTableDatosIngresosReferendos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosReferendos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarIngresosReferendos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoIngresosReferendos) {
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngresosReferendos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngresosReferendos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesIngresosReferendos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesIngresosReferendos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosReferendos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngresosReferendos(IngresosReferendos ingresosreferendos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoIngresosReferendos(ingresosreferendos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngresosReferendos(IngresosReferendos ingresosreferendos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioIngresosReferendos(ingresosreferendos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyIngresosReferendos(ingresosreferendos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyIngresosReferendos(ingresosreferendos);
	}
	
	public void setVariablesObjetoActualToFormularioIngresosReferendos(IngresosReferendos ingresosreferendos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setText(ingresosreferendos.getId().toString());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setText(ingresosreferendos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setText(ingresosreferendos.getnumero());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setText(ingresosreferendos.getnumero_autorizacion());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setText(ingresosreferendos.getnumero_fue());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setText(ingresosreferendos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setText(ingresosreferendos.getnumero_dau());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setText(ingresosreferendos.getnumero_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setDate(ingresosreferendos.getfecha_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setText(ingresosreferendos.getaforo_referendo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,IngresosReferendos ingresosreferendosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ingresosreferendosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,IngresosReferendos ingresosreferendosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ingresosreferendosLocal=this.ingresosreferendos;
			} else {
				ingresosreferendosLocal=this.ingresosreferendosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ingresosreferendosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoIngresosReferendos(ingresosreferendosLocal,true);
					
					if(ingresosreferendosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ingresosreferendosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ingresosreferendosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoIngresosReferendos(IngresosReferendos ingresosreferendos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngresosReferendos(ingresosreferendos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(ingresosreferendos);
	}
	
	public void setVariablesFormularioToObjetoActualIngresosReferendos(IngresosReferendos ingresosreferendos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngresosReferendos(ingresosreferendos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualIngresosReferendos(IngresosReferendos ingresosreferendos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.getText()==null || this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.getText()=="" || this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.getText()=="Id") {
				this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setText("0");
			}

			if(conColumnasBase) {ingresosreferendos.setId(Long.parseLong(this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelIdIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnombre_completo_cliente(this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnombre_completo_clienteIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumeroIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero_autorizacion(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_autorizacionIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero_fue(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_fueIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero_pre_impreso(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_pre_impresoIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero_dau(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMERODAU+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_dauIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setnumero_referendo(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelnumero_referendoIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setfecha_referendo(this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelfecha_referendoIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresosreferendos.setaforo_referendo(this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosReferendos.jLabelaforo_referendoIngresosReferendos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngresosReferendos(IngresosReferendos ingresosreferendosBean,IngresosReferendos ingresosreferendos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosIngresosReferendos(IngresosReferendos ingresosreferendosOrigen,IngresosReferendos ingresosreferendos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingresosreferendosOrigen.getId()!=null && !ingresosreferendosOrigen.getId().equals(0L))) {ingresosreferendos.setId(ingresosreferendosOrigen.getId());}}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getfecha_emision_desde()!=null && !ingresosreferendosOrigen.getfecha_emision_desde().equals(new Date()))) {ingresosreferendos.setfecha_emision_desde(ingresosreferendosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getfecha_emision_hasta()!=null && !ingresosreferendosOrigen.getfecha_emision_hasta().equals(new Date()))) {ingresosreferendos.setfecha_emision_hasta(ingresosreferendosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnombre_completo_cliente()!=null && !ingresosreferendosOrigen.getnombre_completo_cliente().equals(""))) {ingresosreferendos.setnombre_completo_cliente(ingresosreferendosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero()!=null && !ingresosreferendosOrigen.getnumero().equals(""))) {ingresosreferendos.setnumero(ingresosreferendosOrigen.getnumero());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero_autorizacion()!=null && !ingresosreferendosOrigen.getnumero_autorizacion().equals(""))) {ingresosreferendos.setnumero_autorizacion(ingresosreferendosOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero_fue()!=null && !ingresosreferendosOrigen.getnumero_fue().equals(""))) {ingresosreferendos.setnumero_fue(ingresosreferendosOrigen.getnumero_fue());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero_pre_impreso()!=null && !ingresosreferendosOrigen.getnumero_pre_impreso().equals(""))) {ingresosreferendos.setnumero_pre_impreso(ingresosreferendosOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero_dau()!=null && !ingresosreferendosOrigen.getnumero_dau().equals(""))) {ingresosreferendos.setnumero_dau(ingresosreferendosOrigen.getnumero_dau());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getnumero_referendo()!=null && !ingresosreferendosOrigen.getnumero_referendo().equals(""))) {ingresosreferendos.setnumero_referendo(ingresosreferendosOrigen.getnumero_referendo());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getfecha_referendo()!=null && !ingresosreferendosOrigen.getfecha_referendo().equals(new Date()))) {ingresosreferendos.setfecha_referendo(ingresosreferendosOrigen.getfecha_referendo());}
			if(conDefault || (!conDefault && ingresosreferendosOrigen.getaforo_referendo()!=null && !ingresosreferendosOrigen.getaforo_referendo().equals(""))) {ingresosreferendos.setaforo_referendo(ingresosreferendosOrigen.getaforo_referendo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngresosReferendos(IngresosReferendos ingresosreferendos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setText(ingresosreferendos.getId().toString());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setText(ingresosreferendos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setText(ingresosreferendos.getnumero());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setText(ingresosreferendos.getnumero_autorizacion());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setText(ingresosreferendos.getnumero_fue());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setText(ingresosreferendos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setText(ingresosreferendos.getnumero_dau());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setText(ingresosreferendos.getnumero_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setDate(ingresosreferendos.getfecha_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setText(ingresosreferendos.getaforo_referendo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngresosReferendos(IngresosReferendosBean ingresosreferendosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setText(ingresosreferendosBean.getId().toString());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setText(ingresosreferendosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setText(ingresosreferendosBean.getnumero());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setText(ingresosreferendosBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setText(ingresosreferendosBean.getnumero_fue());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setText(ingresosreferendosBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setText(ingresosreferendosBean.getnumero_dau());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setText(ingresosreferendosBean.getnumero_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setDate(ingresosreferendosBean.getfecha_referendo());
			this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setText(ingresosreferendosBean.getaforo_referendo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanIngresosReferendos(IngresosReferendosParameterReturnGeneral ingresosreferendosReturnGeneral,IngresosReferendosBean ingresosreferendosBean,Boolean conDefault) throws Exception { 
		try {
			IngresosReferendos ingresosreferendosLocal=new IngresosReferendos();
			
			ingresosreferendosLocal=ingresosreferendosReturnGeneral.getIngresosReferendos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingresosreferendosLocal.getId()!=null && !ingresosreferendosLocal.getId().equals(0L))) {ingresosreferendosBean.setId(ingresosreferendosLocal.getId());}}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnombre_completo_cliente()!=null && !ingresosreferendosLocal.getnombre_completo_cliente().equals(""))) {ingresosreferendosBean.setnombre_completo_cliente(ingresosreferendosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero()!=null && !ingresosreferendosLocal.getnumero().equals(""))) {ingresosreferendosBean.setnumero(ingresosreferendosLocal.getnumero());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero_autorizacion()!=null && !ingresosreferendosLocal.getnumero_autorizacion().equals(""))) {ingresosreferendosBean.setnumero_autorizacion(ingresosreferendosLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero_fue()!=null && !ingresosreferendosLocal.getnumero_fue().equals(""))) {ingresosreferendosBean.setnumero_fue(ingresosreferendosLocal.getnumero_fue());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero_pre_impreso()!=null && !ingresosreferendosLocal.getnumero_pre_impreso().equals(""))) {ingresosreferendosBean.setnumero_pre_impreso(ingresosreferendosLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero_dau()!=null && !ingresosreferendosLocal.getnumero_dau().equals(""))) {ingresosreferendosBean.setnumero_dau(ingresosreferendosLocal.getnumero_dau());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getnumero_referendo()!=null && !ingresosreferendosLocal.getnumero_referendo().equals(""))) {ingresosreferendosBean.setnumero_referendo(ingresosreferendosLocal.getnumero_referendo());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getfecha_referendo()!=null && !ingresosreferendosLocal.getfecha_referendo().equals(new Date()))) {ingresosreferendosBean.setfecha_referendo(ingresosreferendosLocal.getfecha_referendo());}
			if(conDefault || (!conDefault && ingresosreferendosLocal.getaforo_referendo()!=null && !ingresosreferendosLocal.getaforo_referendo().equals(""))) {ingresosreferendosBean.setaforo_referendo(ingresosreferendosLocal.getaforo_referendo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxIngresosReferendosGenerico(Long idIngresosReferendosSeleccionado,JComboBox jComboBoxIngresosReferendos,List<IngresosReferendos> ingresosreferendossLocal)throws Exception {
		try {
			IngresosReferendos  ingresosreferendosTemp=null;

			for(IngresosReferendos ingresosreferendosAux:ingresosreferendossLocal) {
				if(ingresosreferendosAux.getId()!=null && ingresosreferendosAux.getId().equals(idIngresosReferendosSeleccionado)) {
					ingresosreferendosTemp=ingresosreferendosAux;
					break;
				}
			}

			jComboBoxIngresosReferendos.setSelectedItem(ingresosreferendosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxIngresosReferendosGenerico(JComboBox jComboBoxIngresosReferendos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngresosReferendos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxIngresosReferendos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngresosReferendos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxIngresosReferendos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresosreferendos=(IngresosReferendos) ingresosreferendosLogic.getIngresosReferendoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingresosreferendos =(IngresosReferendos) ingresosreferendoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		IngresosReferendos ingresosreferendosRow=new IngresosReferendos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresosreferendosRow=(IngresosReferendos) ingresosreferendosLogic.getIngresosReferendoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingresosreferendosRow=(IngresosReferendos) ingresosreferendoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualIngresosReferendos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos));			
			this.jButtonDuplicarIngresosReferendos.setVisible((this.isVisibilidadCeldaDuplicarIngresosReferendos && this.isPermisoDuplicarIngresosReferendos));			
			this.jButtonCopiarIngresosReferendos.setVisible((this.isVisibilidadCeldaCopiarIngresosReferendos && this.isPermisoCopiarIngresosReferendos));
			this.jButtonVerFormIngresosReferendos.setVisible((this.isVisibilidadCeldaVerFormIngresosReferendos && this.isPermisoVerFormIngresosReferendos));
			
			this.jButtonAbrirOrderByIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));			
			
			this.jButtonNuevoRelacionesIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos && this.isPermisoNuevoIngresosReferendos));			
			this.jButtonNuevoGuardarCambiosIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarIngresosReferendos.setVisible((this.isVisibilidadCeldaModificarIngresosReferendos && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.setVisible((this.isVisibilidadCeldaActualizarIngresosReferendos && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.setVisible((this.isVisibilidadCeldaEliminarIngresosReferendos && this.isPermisoEliminarIngresosReferendos));
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.setVisible(this.isVisibilidadCeldaCancelarIngresosReferendos);							
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));			
			
			}
						
			this.jButtonGuardarCambiosTablaIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos));						
			this.jButtonDuplicarToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaDuplicarIngresosReferendos && this.isPermisoDuplicarIngresosReferendos));						
			this.jButtonCopiarToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaCopiarIngresosReferendos && this.isPermisoCopiarIngresosReferendos));			
			this.jButtonVerFormToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaVerFormIngresosReferendos && this.isPermisoVerFormIngresosReferendos));			
			this.jButtonAbrirOrderByToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));
			this.jButtonNuevoRelacionesToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos && this.isPermisoNuevoIngresosReferendos));			
			this.jButtonNuevoGuardarCambiosToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));			
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaModificarIngresosReferendos && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaActualizarIngresosReferendos  && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaEliminarIngresosReferendos && this.isPermisoEliminarIngresosReferendos));
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarToolBarIngresosReferendos.setVisible(this.isVisibilidadCeldaCancelarIngresosReferendos);				
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos));			
			this.jMenuItemDuplicarIngresosReferendos.setVisible((this.isVisibilidadCeldaDuplicarIngresosReferendos && this.isPermisoDuplicarIngresosReferendos));			
			this.jMenuItemCopiarIngresosReferendos.setVisible((this.isVisibilidadCeldaCopiarIngresosReferendos && this.isPermisoCopiarIngresosReferendos));			
			this.jMenuItemVerFormIngresosReferendos.setVisible((this.isVisibilidadCeldaVerFormIngresosReferendos && this.isPermisoVerFormIngresosReferendos));			
			this.jMenuItemAbrirOrderByIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));			
			//this.jMenuItemMostrarOcultarIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));
			this.jMenuItemDetalleAbrirOrderByIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));			
			//this.jMenuItemDetalleMostrarOcultarIngresosReferendos.setVisible((this.isVisibilidadCeldaOrdenIngresosReferendos && this.isPermisoOrdenIngresosReferendos));			
			this.jMenuItemNuevoRelacionesIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos && this.isPermisoNuevoIngresosReferendos));			
			this.jMenuItemNuevoGuardarCambiosIngresosReferendos.setVisible((this.isVisibilidadCeldaNuevoIngresosReferendos && this.isPermisoNuevoIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));									
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemModificarIngresosReferendos.setVisible((this.isVisibilidadCeldaModificarIngresosReferendos && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemActualizarIngresosReferendos.setVisible((this.isVisibilidadCeldaActualizarIngresosReferendos && this.isPermisoActualizarIngresosReferendos));	
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemEliminarIngresosReferendos.setVisible((this.isVisibilidadCeldaEliminarIngresosReferendos && this.isPermisoEliminarIngresosReferendos));
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemCancelarIngresosReferendos.setVisible(this.isVisibilidadCeldaCancelarIngresosReferendos);				
			}
			
			this.jMenuItemGuardarCambiosIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));						
			this.jMenuItemGuardarCambiosTablaIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoIngresosReferendos=this.jButtonNuevoIngresosReferendos.isVisible();
			this.isVisibilidadCeldaDuplicarIngresosReferendos=this.jButtonDuplicarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaCopiarIngresosReferendos=this.jButtonCopiarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaVerFormIngresosReferendos=this.jButtonVerFormIngresosReferendos.isVisible();
			
			this.isVisibilidadCeldaOrdenIngresosReferendos=this.jButtonAbrirOrderByIngresosReferendos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=this.jButtonNuevoRelacionesIngresosReferendos.isVisible();
			this.isVisibilidadCeldaModificarIngresosReferendos=this.jButtonModificarIngresosReferendos.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.isVisibilidadCeldaActualizarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaEliminarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaCancelarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaGuardarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=this.jButtonGuardarCambiosTablaIngresosReferendos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoIngresosReferendos=this.jButtonNuevoToolBarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=this.jButtonNuevoRelacionesToolBarIngresosReferendos.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.isVisibilidadCeldaModificarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarToolBarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaActualizarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarToolBarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaEliminarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarToolBarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaCancelarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarToolBarIngresosReferendos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngresosReferendos=this.jButtonGuardarCambiosToolBarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=this.jButtonGuardarCambiosTablaToolBarIngresosReferendos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoIngresosReferendos=this.jMenuItemNuevoIngresosReferendos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=this.jMenuItemNuevoRelacionesIngresosReferendos.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.isVisibilidadCeldaModificarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemModificarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaActualizarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemActualizarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaEliminarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemEliminarIngresosReferendos.isVisible();
			this.isVisibilidadCeldaCancelarIngresosReferendos=this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemCancelarIngresosReferendos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngresosReferendos=this.jMenuItemGuardarCambiosIngresosReferendos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=this.jMenuItemGuardarCambiosTablaIngresosReferendos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesIngresosReferendos(Boolean esInicializar) {
		if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
				//if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesIngresosReferendos();
			}
			
			this.inicializarActualizarBindingBotonesManualIngresosReferendos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualIngresosReferendos() {
		this.jButtonNuevoIngresosReferendos.setVisible(this.isPermisoNuevoIngresosReferendos);			
		this.jButtonDuplicarIngresosReferendos.setVisible(this.isPermisoDuplicarIngresosReferendos);			
		this.jButtonCopiarIngresosReferendos.setVisible(this.isPermisoCopiarIngresosReferendos);			
		this.jButtonVerFormIngresosReferendos.setVisible(this.isPermisoVerFormIngresosReferendos);			
		
		this.jButtonAbrirOrderByIngresosReferendos.setVisible(this.isPermisoOrdenIngresosReferendos);					
		
		this.jButtonNuevoRelacionesIngresosReferendos.setVisible(this.isPermisoNuevoIngresosReferendos);			
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarIngresosReferendos.setVisible(this.isPermisoActualizarIngresosReferendos);	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.setVisible(this.isPermisoActualizarIngresosReferendos);	
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.setVisible(this.isPermisoEliminarIngresosReferendos);
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.setVisible(this.isVisibilidadCeldaCancelarIngresosReferendos);						
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.setVisible(this.isPermisoGuardarCambiosIngresosReferendos);							
		}
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.setVisible(this.isPermisoActualizarIngresosReferendos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleIngresosReferendos() {
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarIngresosReferendos.setVisible(this.isPermisoActualizarIngresosReferendos);	
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.setVisible(this.isPermisoActualizarIngresosReferendos);	
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.setVisible(this.isPermisoEliminarIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.setVisible(this.isVisibilidadCeldaCancelarIngresosReferendos);							
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.setVisible((this.isVisibilidadCeldaGuardarIngresosReferendos && this.isPermisoGuardarCambiosIngresosReferendos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosIngresosReferendos() {
		if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualIngresosReferendos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesIngresosReferendos() {
	}
	
	public void jTableDatosIngresosReferendosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarIngresosReferendos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ingresosreferendos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.ingresosreferendos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.ingresosreferendos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.ingresosreferendos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.ingresosreferendos.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.ingresosreferendos.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_fueIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero_fue()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_fue like '%"+this.ingresosreferendos.getnumero_fue()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.ingresosreferendos.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_dauIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero_dau()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dau like '%"+this.ingresosreferendos.getnumero_dau()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_referendoIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getnumero_referendo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_referendo like '%"+this.ingresosreferendos.getnumero_referendo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_referendoIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getfecha_referendo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_referendo = '"+Funciones2.getStringPostgresDate(this.ingresosreferendos.getfecha_referendo())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaforo_referendoIngresosReferendosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.getingresosreferendos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresosreferendos==null) {
						this.ingresosreferendos = new IngresosReferendos();
					}

					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);
				}

				if(this.ingresosreferendos.getaforo_referendo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where aforo_referendo like '%"+this.ingresosreferendos.getaforo_referendo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosReferendos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaIngresosReferendosIngresosReferendosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosReferendos(false,false);

			this.getIngresosReferendossBusquedaIngresosReferendos();

			this.inicializarActualizarBindingIngresosReferendos(false);

			//if(IngresosReferendosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosReferendos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresosreferendosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameIngresosReferendos() {
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
			this.jInternalFrameDetalleFormIngresosReferendos.setVisible(false);	    			
			this.jInternalFrameDetalleFormIngresosReferendos.dispose();
			this.jInternalFrameDetalleFormIngresosReferendos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
			this.jInternalFrameReporteDinamicoIngresosReferendos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoIngresosReferendos.dispose();
			this.jInternalFrameReporteDinamicoIngresosReferendos=null;
		}
		
		if(this.jInternalFrameImportacionIngresosReferendos!=null) {
			this.jInternalFrameImportacionIngresosReferendos.setVisible(false);	    			
			this.jInternalFrameImportacionIngresosReferendos.dispose();
			this.jInternalFrameImportacionIngresosReferendos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessIngresosReferendos();
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			
			if(sTipo.equals("NuevoIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarIngresosReferendos")) {
				jButtonDuplicarIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarIngresosReferendos")) {
				jButtonCopiarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("VerFormIngresosReferendos")) {
				jButtonVerFormIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarIngresosReferendos")) {
				jButtonDuplicarIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarIngresosReferendos")) {
				jButtonDuplicarIngresosReferendosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarIngresosReferendos")) {
				jButtonModificarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarIngresosReferendos")) {
				jButtonModificarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarIngresosReferendos")) {
				jButtonModificarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarIngresosReferendos")) {
				jButtonActualizarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarIngresosReferendos")) {
				jButtonActualizarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarIngresosReferendos")) {
				jButtonActualizarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("EliminarIngresosReferendos")) {
				jButtonEliminarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarIngresosReferendos")) {
				jButtonEliminarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarIngresosReferendos")) {
				jButtonEliminarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("CancelarIngresosReferendos")) {
				jButtonCancelarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarIngresosReferendos")) {
				jButtonCancelarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarIngresosReferendos")) {
				jButtonCancelarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("CerrarIngresosReferendos")) {
				jButtonCerrarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarIngresosReferendos")) {
				jButtonCerrarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarIngresosReferendos")) {
				jButtonCerrarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarIngresosReferendos")) {
				jButtonMostrarOcultarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarIngresosReferendos")) {
				jButtonCancelarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarIngresosReferendos")) {
				jButtonCopiarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarIngresosReferendos")) {
				jButtonVerFormIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarIngresosReferendos")) {
				jButtonCopiarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormIngresosReferendos")) {
				jButtonVerFormIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionIngresosReferendos")) {
				jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarIngresosReferendos")) {
				jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionIngresosReferendos")) {
				jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresIngresosReferendos")) {
				jButtonAnterioresIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarIngresosReferendos")) {
				jButtonAnterioresIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreIngresosReferendos")) {
				jButtonAnterioresIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesIngresosReferendos")) {
				jButtonSiguientesIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarIngresosReferendos")) {
				jButtonSiguientesIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesIngresosReferendos")) {
				jButtonSiguientesIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByIngresosReferendos") || sTipo.equals("MenuItemDetalleAbrirOrderByIngresosReferendos")) {
				jButtonAbrirOrderByIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarIngresosReferendos") || sTipo.equals("MenuItemDetalleMostrarOcultarIngresosReferendos")) {
				jButtonMostrarOcultarIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosIngresosReferendos")) {
				jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarIngresosReferendos")) {
				jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosIngresosReferendos")) {
				jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoIngresosReferendos")) {
				jButtonCerrarReporteDinamicoIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoIngresosReferendos")) {
				jButtonGenerarReporteDinamicoIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoIngresosReferendos")) {
				
				jButtonGenerarExcelReporteDinamicoIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionIngresosReferendos")) {
				jButtonCerrarImportacionIngresosReferendosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionIngresosReferendos")) {
				
				jButtonGenerarImportacionIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionIngresosReferendos")) {
				
				jButtonAbrirImportacionIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesIngresosReferendos")) {
				jComboBoxTiposAccionesIngresosReferendosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesIngresosReferendos")) {
				jComboBoxTiposRelacionesIngresosReferendosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioIngresosReferendos")) {
				jComboBoxTiposAccionesIngresosReferendosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarIngresosReferendos")) {
				
				jComboBoxTiposSeleccionarIngresosReferendosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralIngresosReferendos")) {
				jTextFieldValorCampoGeneralIngresosReferendosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByIngresosReferendos")) {
				jButtonAbrirOrderByIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarIngresosReferendos")) {
				jButtonAbrirOrderByIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByIngresosReferendos")) {
				jButtonCerrarOrderByIngresosReferendosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngresosReferendosBusqueda")) {
				this.jButtonidIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeIngresosReferendosBusqueda")) {
				this.jButtonfecha_emision_desdeIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaIngresosReferendosBusqueda")) {
				this.jButtonfecha_emision_hastaIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteIngresosReferendosBusqueda")) {
				this.jButtonnombre_completo_clienteIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroIngresosReferendosBusqueda")) {
				this.jButtonnumeroIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionIngresosReferendosBusqueda")) {
				this.jButtonnumero_autorizacionIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_fueIngresosReferendosBusqueda")) {
				this.jButtonnumero_fueIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoIngresosReferendosBusqueda")) {
				this.jButtonnumero_pre_impresoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_dauIngresosReferendosBusqueda")) {
				this.jButtonnumero_dauIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_referendoIngresosReferendosBusqueda")) {
				this.jButtonnumero_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_referendoIngresosReferendosBusqueda")) {
				this.jButtonfecha_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aforo_referendoIngresosReferendosBusqueda")) {
				this.jButtonaforo_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaIngresosReferendosIngresosReferendos")) {
				this.jButtonBusquedaIngresosReferendosIngresosReferendosActionPerformed(evt);
			}
			
			;
			
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessIngresosReferendos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			IngresosReferendos ingresosreferendosLocal=null;
			
			if(!this.getEsControlTabla()) {
				ingresosreferendosLocal=this.ingresosreferendos;
			} else {
				ingresosreferendosLocal=this.ingresosreferendosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
							
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
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
			
			


			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
								
						
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
								
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
							
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
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
			
			


			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
								
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosIngresosReferendos")) {
					jCheckBoxSeleccionarTodosIngresosReferendosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosIngresosReferendos")) {
					jCheckBoxSeleccionadosIngresosReferendosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarIngresosReferendos")) {
					
				}
				
				


				
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
												
				
				


				
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
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
			
			


			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosReferendosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresosreferendos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresosreferendos);
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
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
				
				


				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosReferendos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosReferendos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosReferendosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresosreferendosAnterior =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarIngresosReferendos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosIngresosReferendosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosIngresosReferendos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ingresosreferendos =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ingresosreferendos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarIngresosReferendos")) {
				
				}
				
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarIngresosReferendos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosIngresosReferendos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarIngresosReferendos")) {
			
			}
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessIngresosReferendos();
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			if(sTipo.equals("NuevoIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarIngresosReferendos")) {
				jButtonDuplicarIngresosReferendosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarIngresosReferendos")) {
				jButtonCopiarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormIngresosReferendos")) {
				jButtonVerFormIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesIngresosReferendos")) {
				jButtonNuevoIngresosReferendosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarIngresosReferendos")) {
				jButtonModificarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarIngresosReferendos")) {
				jButtonActualizarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarIngresosReferendos")) {
				jButtonEliminarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarIngresosReferendos")) {
				jButtonCancelarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarIngresosReferendos")) {
				jButtonCerrarIngresosReferendosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosIngresosReferendos")) {
				jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosIngresosReferendos")) {
				jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByIngresosReferendos")) {
				jButtonAbrirOrderByIngresosReferendosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionIngresosReferendos")) {
				jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresIngresosReferendos")) {
				jButtonAnterioresIngresosReferendosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesIngresosReferendos")) {
				jButtonSiguientesIngresosReferendosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngresosReferendosBusqueda")) {
				this.jButtonidIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeIngresosReferendosBusqueda")) {
				this.jButtonfecha_emision_desdeIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaIngresosReferendosBusqueda")) {
				this.jButtonfecha_emision_hastaIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteIngresosReferendosBusqueda")) {
				this.jButtonnombre_completo_clienteIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroIngresosReferendosBusqueda")) {
				this.jButtonnumeroIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionIngresosReferendosBusqueda")) {
				this.jButtonnumero_autorizacionIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_fueIngresosReferendosBusqueda")) {
				this.jButtonnumero_fueIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoIngresosReferendosBusqueda")) {
				this.jButtonnumero_pre_impresoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_dauIngresosReferendosBusqueda")) {
				this.jButtonnumero_dauIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_referendoIngresosReferendosBusqueda")) {
				this.jButtonnumero_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_referendoIngresosReferendosBusqueda")) {
				this.jButtonfecha_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aforo_referendoIngresosReferendosBusqueda")) {
				this.jButtonaforo_referendoIngresosReferendosBusquedaActionPerformed(evt);
			}
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessIngresosReferendos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameIngresosReferendos")) {
				closingInternalFrameIngresosReferendos();
				
			} else if(sTipo.equals("jButtonCancelarIngresosReferendos")) {
				JInternalFrameBase jInternalFrameDetalleFormIngresosReferendos = (JInternalFrameBase)evt.getSource();
	            	
	            IngresosReferendosBeanSwingJInternalFrame jInternalFrameParent=(IngresosReferendosBeanSwingJInternalFrame)jInternalFrameDetalleFormIngresosReferendos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarIngresosReferendosActionPerformed(null);
			}
			
			IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingresosreferendos,new Object(),this.ingresosreferendosParameterGeneral,this.ingresosreferendosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormIngresosReferendos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormIngresosReferendos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormIngresosReferendos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ingresosreferendos)) {
			if(!esControlTabla) {
				if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);			
				}
				
				if(this.ingresosreferendosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualIngresosReferendos(this.ingresosreferendos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanIngresosReferendos(this.ingresosreferendosReturnGeneral,this.ingresosreferendosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ingresosreferendosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanIngresosReferendos(classes,this.ingresosreferendosReturnGeneral,this.ingresosreferendosBean,false);
					}
						
					if(this.ingresosreferendosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos());	
					}
						
					if(this.ingresosreferendosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendosReturnGeneral.getIngresosReferendos(),classes);//this.ingresosreferendosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioIngresosReferendos(this.ingresosreferendos,classes);//this.ingresosreferendosBean);									
				}
			
				if(IngresosReferendosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualIngresosReferendos(this.ingresosreferendos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosReferendos(this.ingresosreferendos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ingresosreferendosAnterior!=null) {
						this.ingresosreferendos=this.ingresosreferendosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ingresosreferendosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ingresosreferendosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ingresosreferendosReturnGeneral.getIngresosReferendos(),ingresosreferendosLogic.getIngresosReferendoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ingresosreferendosReturnGeneral.getIngresosReferendos(),this.ingresosreferendoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosIngresosReferendos.repaint();
				
				//((AbstractTableModel) this.jTableDatosIngresosReferendos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosIngresosReferendos();
			}
		}
	}
	
	public void actualizarVisualTableDatosIngresosReferendos() throws Exception {
		
		IngresosReferendosModel ingresosreferendosModel=(IngresosReferendosModel)this.jTableDatosIngresosReferendos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresosreferendosModel.ingresosreferendoss=this.ingresosreferendosLogic.getIngresosReferendoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ingresosreferendosModel.ingresosreferendoss=this.ingresosreferendoss;
		}
		
		
		((IngresosReferendosModel) this.jTableDatosIngresosReferendos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaIngresosReferendos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getingresosreferendosAnterior(),this.ingresosreferendosLogic.getIngresosReferendoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getingresosreferendosAnterior(),this.ingresosreferendoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosIngresosReferendos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioIngresosReferendos(IngresosReferendos ingresosreferendos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
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
										
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingresosreferendos,new Object(),generalEntityParameterGeneral,this.ingresosreferendosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=IngresosReferendosConstantesFunciones.getClassesRelationshipsOfIngresosReferendos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=IngresosReferendosConstantesFunciones.getClassesRelationshipsFromStringsOfIngresosReferendos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormIngresosReferendos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				IngresosReferendosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingresosreferendos,new Object(),generalEntityParameterGeneral,this.ingresosreferendosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioIngresosReferendos(IngresosReferendosBean ingresosreferendosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanIngresosReferendos(ArrayList<Classe> classes,IngresosReferendosReturnGeneral ingresosreferendosReturnGeneral,IngresosReferendosBean ingresosreferendosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualIngresosReferendos(IngresosReferendos ingresosreferendos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ingresosreferendos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormIngresosReferendos = new IngresosReferendosDetalleFormJInternalFrame(jDesktopPane,this.ingresosreferendosSessionBean.getConGuardarRelaciones(),this.ingresosreferendosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.setVisible(false);
		this.jInternalFrameDetalleFormIngresosReferendos.setSelected(false);						
		
		this.jInternalFrameDetalleFormIngresosReferendos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormIngresosReferendos.ingresosreferendosLogic=this.ingresosreferendosLogic;
		
		this.cargarCombosFrameForeignKeyIngresosReferendos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleIngresosReferendos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngresosReferendos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyIngresosReferendos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyIngresosReferendos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormIngresosReferendos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngresosReferendos"));
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ModificarIngresosReferendos"));

		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngresosReferendos"));
					
		this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemModificarIngresosReferendos.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngresosReferendos"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.addActionListener (new ButtonActionListener(this,"ActualizarIngresosReferendos"));
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngresosReferendos"));
						
		this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemActualizarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngresosReferendos"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.addActionListener (new ButtonActionListener(this,"EliminarIngresosReferendos"));
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngresosReferendos"));
								
		this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemEliminarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngresosReferendos"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CancelarIngresosReferendos"));
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngresosReferendos"));
					
		this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemCancelarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngresosReferendos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemDetalleCerrarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngresosReferendos"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosReferendos"));
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosReferendos"));
		
		
		
		this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngresosReferendos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonidIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_desdeIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_hastaIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnombre_completo_clienteIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumeroIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numeroIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_autorizacionIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_fueIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_fueIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_pre_impresoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_dauIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_dauIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonaforo_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"aforo_referendoIngresosReferendosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngresosReferendos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameIngresosReferendos"));
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngresosReferendos"));
		}
		
		this.jTableDatosIngresosReferendos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarIngresosReferendos"));
		
		this.jTableDatosIngresosReferendos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarIngresosReferendos"));
		
		this.jButtonNuevoIngresosReferendos.addActionListener(new ButtonActionListener(this,"NuevoIngresosReferendos"));
		
		this.jButtonDuplicarIngresosReferendos.addActionListener(new ButtonActionListener(this,"DuplicarIngresosReferendos"));
		
		this.jButtonCopiarIngresosReferendos.addActionListener(new ButtonActionListener(this,"CopiarIngresosReferendos"));
		
		this.jButtonVerFormIngresosReferendos.addActionListener(new ButtonActionListener(this,"VerFormIngresosReferendos"));
		
		
		this.jButtonNuevoToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"NuevoToolBarIngresosReferendos"));
			
		this.jButtonDuplicarToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarIngresosReferendos"));
			
		this.jMenuItemNuevoIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoIngresosReferendos"));
			
		this.jMenuItemDuplicarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarIngresosReferendos"));		
		
		
		this.jButtonNuevoRelacionesIngresosReferendos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesIngresosReferendos"));
		
		
		this.jButtonNuevoRelacionesToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarIngresosReferendos"));
			
		this.jMenuItemNuevoRelacionesIngresosReferendos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesIngresosReferendos"));		
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ModificarIngresosReferendos"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonModificarToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngresosReferendos"));
			
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemModificarIngresosReferendos.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngresosReferendos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarIngresosReferendos.addActionListener (new ButtonActionListener(this,"ActualizarIngresosReferendos"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonActualizarToolBarIngresosReferendos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngresosReferendos"));
				
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemActualizarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngresosReferendos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarIngresosReferendos.addActionListener (new ButtonActionListener(this,"EliminarIngresosReferendos"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonEliminarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngresosReferendos"));
						
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemEliminarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngresosReferendos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CancelarIngresosReferendos"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonCancelarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngresosReferendos"));
			
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemCancelarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngresosReferendos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarIngresosReferendos"));		
		
		
		this.jButtonCerrarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CerrarIngresosReferendos"));
		
		
		this.jButtonCerrarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CerrarToolBarIngresosReferendos"));
			
		this.jMenuItemCerrarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarIngresosReferendos"));
			
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jMenuItemDetalleCerrarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngresosReferendos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosIngresosReferendos"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosReferendos"));
		}
		
		this.jButtonCopiarToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"CopiarToolBarIngresosReferendos"));
			
		this.jButtonVerFormToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"VerFormToolBarIngresosReferendos"));
		
		this.jMenuItemGuardarCambiosIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosIngresosReferendos"));
			
		this.jMenuItemCopiarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarIngresosReferendos"));		
		
		this.jMenuItemVerFormIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormIngresosReferendos"));		
		
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngresosReferendos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarIngresosReferendos"));
			
		this.jMenuItemGuardarCambiosTablaIngresosReferendos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngresosReferendos"));		
		
		
		
		this.jButtonRecargarInformacionIngresosReferendos.addActionListener (new ButtonActionListener(this,"RecargarInformacionIngresosReferendos"));
					
		this.jButtonRecargarInformacionToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarIngresosReferendos"));
		
		this.jMenuItemRecargarInformacionIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionIngresosReferendos"));		
		
		
		
		this.jButtonAnterioresIngresosReferendos.addActionListener (new ButtonActionListener(this,"AnterioresIngresosReferendos"));
		
		
		this.jButtonAnterioresToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarIngresosReferendos"));
		
		this.jMenuItemAnterioresIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresIngresosReferendos"));		
		
		
		this.jButtonSiguientesIngresosReferendos.addActionListener (new ButtonActionListener(this,"SiguientesIngresosReferendos"));
		
		
		this.jButtonSiguientesToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarIngresosReferendos"));
			
		this.jMenuItemSiguientesIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesIngresosReferendos"));
			
		this.jMenuItemAbrirOrderByIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByIngresosReferendos"));
			
		this.jMenuItemMostrarOcultarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarIngresosReferendos"));
			
		this.jMenuItemDetalleAbrirOrderByIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByIngresosReferendos"));
			
		this.jMenuItemDetalleMostarOcultarIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarIngresosReferendos"));		
		
		
		this.jButtonNuevoGuardarCambiosIngresosReferendos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosIngresosReferendos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarIngresosReferendos"));
			
		this.jMenuItemNuevoGuardarCambiosIngresosReferendos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosIngresosReferendos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosIngresosReferendos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosIngresosReferendos"));

		this.jCheckBoxSeleccionadosIngresosReferendos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosIngresosReferendos"));
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngresosReferendos"));
		}
		
		
		this.jComboBoxTiposRelacionesIngresosReferendos.addActionListener (new ButtonActionListener(this,"TiposRelacionesIngresosReferendos"));
			
		this.jComboBoxTiposAccionesIngresosReferendos.addActionListener (new ButtonActionListener(this,"TiposAccionesIngresosReferendos"));
					
		this.jComboBoxTiposSeleccionarIngresosReferendos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarIngresosReferendos"));
			
		this.jTextFieldValorCampoGeneralIngresosReferendos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralIngresosReferendos"));		
		
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonidIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_desdeIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_hastaIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnombre_completo_clienteIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumeroIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numeroIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_autorizacionIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_fueIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_fueIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_pre_impresoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_dauIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_dauIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonaforo_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"aforo_referendoIngresosReferendosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaIngresosReferendosIngresosReferendos.addActionListener(new ButtonActionListener(this,"BusquedaIngresosReferendosIngresosReferendos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoIngresosReferendos!=null) {
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosReferendos"));
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosReferendos"));
				this.jInternalFrameReporteDinamicoIngresosReferendos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosReferendos"));
			}
			
			//this.jButtonCerrarReporteDinamicoIngresosReferendos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosReferendos"));				
			//this.jButtonGenerarReporteDinamicoIngresosReferendos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosReferendos"));
			//this.jButtonGenerarExcelReporteDinamicoIngresosReferendos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosReferendos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionIngresosReferendos!=null) {
				this.jInternalFrameImportacionIngresosReferendos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngresosReferendos"));
				this.jInternalFrameImportacionIngresosReferendos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngresosReferendos"));
				this.jInternalFrameImportacionIngresosReferendos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngresosReferendos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByIngresosReferendos.addActionListener (new ButtonActionListener(this,"AbrirOrderByIngresosReferendos"));
			
			this.jButtonAbrirOrderByToolBarIngresosReferendos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarIngresosReferendos"));			
			
			if(this.jInternalFrameOrderByIngresosReferendos!=null) {
				this.jInternalFrameOrderByIngresosReferendos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngresosReferendos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosReferendos.jTabbedPaneRelacionesIngresosReferendos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngresosReferendos"));
		
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
            		closingInternalFrameIngresosReferendos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormIngresosReferendos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormIngresosReferendos = (JInternalFrameBase)event.getSource();
	            	
	            IngresosReferendosBeanSwingJInternalFrame jInternalFrameParent=(IngresosReferendosBeanSwingJInternalFrame)jInternalFrameDetalleFormIngresosReferendos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarIngresosReferendosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosIngresosReferendos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosIngresosReferendosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosIngresosReferendos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosIngresosReferendos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoIngresosReferendos";
		inputMap = this.jButtonNuevoIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngresosReferendosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosReferendosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesIngresosReferendos";
		inputMap = this.jButtonNuevoRelacionesIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngresosReferendosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarIngresosReferendos";
		inputMap = this.jButtonModificarIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarIngresosReferendos";
		inputMap = this.jButtonActualizarIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarIngresosReferendos";
		inputMap = this.jButtonEliminarIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarIngresosReferendos";
		inputMap = this.jButtonCancelarIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarIngresosReferendos";
		inputMap = this.jButtonCerrarIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosIngresosReferendos";
		inputMap = this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonGuardarCambiosIngresosReferendos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosIngresosReferendosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosIngresosReferendos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosIngresosReferendosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesIngresosReferendos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesIngresosReferendosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarIngresosReferendos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarIngresosReferendosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralIngresosReferendos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralIngresosReferendosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonidIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_desdeIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_emision_hastaIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnombre_completo_clienteIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumeroIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numeroIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_autorizacionIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_fueIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_fueIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_pre_impresoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_dauIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_dauIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonnumero_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"numero_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonfecha_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_referendoIngresosReferendosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosReferendos.jButtonaforo_referendoIngresosReferendosBusqueda.addActionListener(new ButtonActionListener(this,"aforo_referendoIngresosReferendosBusqueda"));
		
		
		this.jButtonBusquedaIngresosReferendosIngresosReferendos.addActionListener(new ButtonActionListener(this,"BusquedaIngresosReferendosIngresosReferendos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionIngresosReferendos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionIngresosReferendosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarIngresosReferendosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarIngresosReferendos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosIngresosReferendos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
					ingresosreferendosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosReferendos ingresosreferendosAux:ingresosreferendoss) {
					ingresosreferendosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosIngresosReferendosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
						ingresosreferendosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosReferendos ingresosreferendosAux:ingresosreferendoss) {
						ingresosreferendosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosReferendos ingresosreferendosAux:ingresosreferendoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngresosReferendos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngresosReferendos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosIngresosReferendosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosIngresosReferendos.getSelectedRows();
			
			IngresosReferendos ingresosreferendosLocal=new IngresosReferendos();
			
			//this.seleccionarTodosIngresosReferendos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingresosreferendosLocal =(IngresosReferendos) this.ingresosreferendosLogic.getIngresosReferendoss().toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ingresosreferendosLocal =(IngresosReferendos) this.ingresosreferendoss.toArray()[this.jTableDatosIngresosReferendos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ingresosreferendosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
						ingresosreferendosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosReferendos ingresosreferendosAux:ingresosreferendoss) {
						ingresosreferendosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngresosReferendos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngresosReferendos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngresosReferendos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualIngresosReferendosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarIngresosReferendosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralIngresosReferendosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralIngresosReferendos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendosLogic.getIngresosReferendoss()) {
				
						if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ingresosreferendosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ingresosreferendosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							ingresosreferendosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							ingresosreferendosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							ingresosreferendosAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE)) {
							existe=true;
							ingresosreferendosAux.setnumero_fue(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ingresosreferendosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU)) {
							existe=true;
							ingresosreferendosAux.setnumero_dau(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setnumero_referendo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setfecha_referendo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setaforo_referendo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosReferendos ingresosreferendosAux:ingresosreferendoss) {
					
						if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							ingresosreferendosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							ingresosreferendosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							ingresosreferendosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							ingresosreferendosAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							ingresosreferendosAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE)) {
							existe=true;
							ingresosreferendosAux.setnumero_fue(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							ingresosreferendosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU)) {
							existe=true;
							ingresosreferendosAux.setnumero_dau(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setnumero_referendo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setfecha_referendo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO)) {
							existe=true;
							ingresosreferendosAux.setaforo_referendo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaIngresosReferendos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesIngresosReferendosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioIngresosReferendos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesIngresosReferendos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteIngresosReferendos) {				
					conSplash=true;//false;										
					
					//this.startProcessIngresosReferendos(conSplash);
				
					this.generarReporteIngresosReferendossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoIngresosReferendossSeleccionados();
				//this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngresosReferendossSeleccionados(false);
				//this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngresosReferendossSeleccionados(true);
				//this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngresosReferendos();
				
				this.exportarIngresosReferendossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionIngresosReferendoss();
				//this.importarIngresosReferendoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngresosReferendos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelIngresosReferendossSeleccionados();
				//this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ingresos Referendos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessIngresosReferendos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoIngresosReferendos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyIngresosReferendos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
				}	
			} 			
			else if(IngresosReferendosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteIngresosReferendos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessIngresosReferendos(conSplash);
					
						//this.actualizarParametrosGeneralIngresosReferendos();
						
						this.generarReporteProcesoAccionIngresosReferendossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(IngresosReferendosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ingresos ReferendosES SELECCIONADOS?", "MANTENIMIENTO DE Ingresos Referendos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessIngresosReferendos();
				
						this.actualizarParametrosGeneralIngresosReferendos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ingresosreferendosReturnGeneral=ingresosreferendosLogic.procesarAccionIngresosReferendossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ingresosreferendosLogic.getIngresosReferendoss(),this.ingresosreferendosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarIngresosReferendosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralIngresosReferendos();
					
					IngresosReferendosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarIngresosReferendosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngresosReferendos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngresosReferendos.jComboBoxTiposAccionesFormularioIngresosReferendos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessIngresosReferendos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesIngresosReferendosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessIngresosReferendos();
			
			if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
			IngresosReferendos ingresosreferendos=new IngresosReferendos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingIngresosReferendos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesIngresosReferendos.getSelectedItem();
			
			
			
			
			ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
			//this.sTipoAccion;
			
			if(ingresosreferendossSeleccionados.size()==1) {
				for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
					ingresosreferendos=ingresosreferendosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessIngresosReferendos();
			
      		//this.finishProcessIngresosReferendos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarIngresosReferendosReturnGeneral() throws Exception {
		if(this.ingresosreferendosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ingresosreferendosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ingresosreferendosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ingresosreferendosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ingresosreferendosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ingresosreferendosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingIngresosReferendos(false);
		}
		
		if(this.ingresosreferendosReturnGeneral.getConRetornoLista() || this.ingresosreferendosReturnGeneral.getConRetornoObjeto()) {
			if(this.ingresosreferendosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ingresosreferendosLogic.setIngresosReferendoss(this.ingresosreferendosReturnGeneral.getIngresosReferendoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingIngresosReferendos(false);
		}
	}
	
	public void actualizarParametrosGeneralIngresosReferendos() throws Exception {
		
		
	}
	
	public ArrayList<IngresosReferendos> getIngresosReferendossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioIngresosReferendos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(IngresosReferendos ingresosreferendosAux:ingresosreferendosLogic.getIngresosReferendoss()) {
					if(ingresosreferendosAux.getIsSelected()) {
						ingresosreferendossSeleccionados.add(ingresosreferendosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosReferendos ingresosreferendosAux:this.ingresosreferendoss) {
					if(ingresosreferendosAux.getIsSelected()) {
						ingresosreferendossSeleccionados.add(ingresosreferendosAux);				
					}
				}
			}
			
			if(ingresosreferendossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ingresosreferendossSeleccionados.addAll(this.ingresosreferendosLogic.getIngresosReferendoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ingresosreferendossSeleccionados.addAll(this.ingresosreferendoss);				
					}
				}
			}
		} else {
			ingresosreferendossSeleccionados.add(this.ingresosreferendos);
		}
		
		return ingresosreferendossSeleccionados;
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
	
	public void generarReporteIngresosReferendossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalIngresosReferendossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoIngresosReferendossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngresosReferendossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngresosReferendossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ingresos Referendos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados);
		
	}	
	
	public void generarReporteNormalIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionIngresosReferendossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoIngresosReferendos();
		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoIngresosReferendos();
		
		
		//this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados ,ingresosreferendosImplementable,ingresosreferendosImplementableHome);
	}
	
	public void mostrarImportacionIngresosReferendoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionIngresosReferendos();
		
		this.abrirFrameImportacionIngresosReferendos();		
		
			
		//this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados ,ingresosreferendosImplementable,ingresosreferendosImplementableHome);
	}
	
	public void importarIngresosReferendoss() throws Exception {		
	
	}
	
	public void exportarIngresosReferendossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelIngresosReferendossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoIngresosReferendossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlIngresosReferendossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ingresos Referendos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarIngresosReferendos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarIngresosReferendos(ingresosreferendosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ingresosreferendosAux.setsDetalleGeneralEntityReporte(ingresosreferendosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarIngresosReferendos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMERODAU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarIngresosReferendos(IngresosReferendos ingresosreferendos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ingresosreferendos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero_fue();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero_dau();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getnumero_referendo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getfecha_referendo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresosreferendos.getaforo_referendo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("IngresosReferendoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelIngresosReferendos(row);				
				iRow++;
			}				
			
			for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelIngresosReferendos(ingresosreferendosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlIngresosReferendossSeleccionados() throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();		
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresosreferendos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ingresosreferendoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ingresosreferendos");
			//elementRoot.appendChild(element);
		
			for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
				element = document.createElement("ingresosreferendos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlIngresosReferendos(ingresosreferendosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Referendos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelIngresosReferendos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelIngresosReferendos(IngresosReferendos ingresosreferendos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero_fue());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero_dau());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getnumero_referendo());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getfecha_referendo());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresosreferendos.getaforo_referendo());				
	}
	
	public void setFilaDatosExportarXmlIngresosReferendos(IngresosReferendos ingresosreferendos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(IngresosReferendosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ingresosreferendos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(IngresosReferendosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ingresosreferendos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementfecha_emision_desde = document.createElement(IngresosReferendosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(ingresosreferendos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(IngresosReferendosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(ingresosreferendos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(IngresosReferendosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(ingresosreferendos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero = document.createElement(IngresosReferendosConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(ingresosreferendos.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnumero_autorizacion = document.createElement(IngresosReferendosConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(ingresosreferendos.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementnumero_fue = document.createElement(IngresosReferendosConstantesFunciones.NUMEROFUE);
		elementnumero_fue.appendChild(document.createTextNode(ingresosreferendos.getnumero_fue().trim()));
		element.appendChild(elementnumero_fue);

		Element elementnumero_pre_impreso = document.createElement(IngresosReferendosConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(ingresosreferendos.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementnumero_dau = document.createElement(IngresosReferendosConstantesFunciones.NUMERODAU);
		elementnumero_dau.appendChild(document.createTextNode(ingresosreferendos.getnumero_dau().trim()));
		element.appendChild(elementnumero_dau);

		Element elementnumero_referendo = document.createElement(IngresosReferendosConstantesFunciones.NUMEROREFERENDO);
		elementnumero_referendo.appendChild(document.createTextNode(ingresosreferendos.getnumero_referendo().trim()));
		element.appendChild(elementnumero_referendo);

		Element elementfecha_referendo = document.createElement(IngresosReferendosConstantesFunciones.FECHAREFERENDO);
		elementfecha_referendo.appendChild(document.createTextNode(ingresosreferendos.getfecha_referendo().toString().trim()));
		element.appendChild(elementfecha_referendo);

		Element elementaforo_referendo = document.createElement(IngresosReferendosConstantesFunciones.AFOROREFERENDO);
		elementaforo_referendo.appendChild(document.createTextNode(ingresosreferendos.getaforo_referendo().trim()));
		element.appendChild(elementaforo_referendo);
	}
	
	public void generarReporteGroupGenericoIngresosReferendossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<IngresosReferendos> ingresosreferendossSeleccionados=new ArrayList<IngresosReferendos>();
		
		ingresosreferendossSeleccionados=this.getIngresosReferendossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoIngresosReferendos(ingresosreferendossSeleccionados);
		
		this.generarReporteIngresosReferendoss("Todos",ingresosreferendossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoIngresosReferendos(ArrayList<IngresosReferendos> ingresosreferendossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(IngresosReferendos ingresosreferendosAux:ingresosreferendossSeleccionados) {
				ingresosreferendosAux.setsDetalleGeneralEntityReporte(ingresosreferendosAux.toString());
			
				if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ingresosreferendosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ingresosreferendosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero_fue());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero_dau());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getnumero_referendo());
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ingresosreferendosAux.getfecha_referendo()));
				}
				 else if(sTipoSeleccionar.equals(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO)) {
					existe=true;
					ingresosreferendosAux.setsDescripcionGeneralEntityReporte1(ingresosreferendosAux.getaforo_referendo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosReferendosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesIngresosReferendos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoIngresosReferendos=true;
				this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=true;
				this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=true;
			}
			
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=true;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=true;
			this.isVisibilidadCeldaEliminarIngresosReferendos=true;
			this.isVisibilidadCeldaCancelarIngresosReferendos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=true;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=true;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=true;
			this.isVisibilidadCeldaModificarIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
			this.isVisibilidadCeldaModificarIngresosReferendos=true;
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
			this.isVisibilidadCeldaCancelarIngresosReferendos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosReferendos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoIngresosReferendos=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=true;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=true;
		} else {
			this.actualizarEstadoPanelsIngresosReferendos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarIngresosReferendos=false;
			//this.isVisibilidadCeldaVerFormIngresosReferendos=false;
			this.isVisibilidadCeldaDuplicarIngresosReferendos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ingresosreferendosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
		} else {
			this.isVisibilidadCeldaNuevoIngresosReferendos=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			if(!ingresosreferendosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;												
			}
			
			this.jButtonCerrarIngresosReferendos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
		}
		
		if(!this.permiteMantenimiento(this.ingresosreferendos)) {
			this.isVisibilidadCeldaActualizarIngresosReferendos=false;
			this.isVisibilidadCeldaEliminarIngresosReferendos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoIngresosReferendos=false;
		this.isVisibilidadCeldaNuevoRelacionesIngresosReferendos=false;
		this.isVisibilidadCeldaGuardarCambiosIngresosReferendos=false;
		//this.isVisibilidadCeldaModificarIngresosReferendos=true;
		this.isVisibilidadCeldaActualizarIngresosReferendos=false;
		this.isVisibilidadCeldaEliminarIngresosReferendos=false;
		//this.isVisibilidadCeldaCancelarIngresosReferendos=true;			
		this.isVisibilidadCeldaGuardarIngresosReferendos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesIngresosReferendos() {
	}
	
	public void actualizarEstadoPanelsIngresosReferendos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionIngresosReferendos!=null) {
				this.jScrollPanelDatosEdicionIngresosReferendos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosReferendos!=null) {
				this.jScrollPanelDatosIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosReferendos!=null) {
				this.jPanelPaginacionIngresosReferendos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
					this.jTabbedPaneBusquedasIngresosReferendos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosReferendos!=null) {
				this.jTabbedPaneBusquedasIngresosReferendos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesIngresosReferendos!=null) {
				this.jPanelParametrosReportesIngresosReferendos.setVisible(true);
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
			
			this.inicializarActualizarBindingTablaIngresosReferendos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioIngresosReferendos() {
		this.updateBorderResaltarBusquedasFormularioIngresosReferendos();
		this.updateVisibilidadBusquedasFormularioIngresosReferendos();
		this.updateHabilitarBusquedasFormularioIngresosReferendos();
	}
	
	public void updateBorderResaltarBusquedasFormularioIngresosReferendos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasIngresosReferendos.getComponents().length>0) {
	

		if(this.ingresosreferendosConstantesFunciones.resaltarBusquedaIngresosReferendosIngresosReferendos!=null) {
			index= this.jTabbedPaneBusquedasIngresosReferendos.indexOfComponent(this.jPanelBusquedaIngresosReferendosIngresosReferendos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosReferendos.getComponent(index);
				jPanel.setBorder(this.ingresosreferendosConstantesFunciones.resaltarBusquedaIngresosReferendosIngresosReferendos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioIngresosReferendos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasIngresosReferendos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngresosReferendos.indexOfComponent(this.jPanelBusquedaIngresosReferendosIngresosReferendos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosReferendos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingresosreferendosConstantesFunciones.mostrarBusquedaIngresosReferendosIngresosReferendos);
			if(!this.ingresosreferendosConstantesFunciones.mostrarBusquedaIngresosReferendosIngresosReferendos && index>-1) {
				this.jTabbedPaneBusquedasIngresosReferendos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioIngresosReferendos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasIngresosReferendos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngresosReferendos.indexOfComponent(this.jPanelBusquedaIngresosReferendosIngresosReferendos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosReferendos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingresosreferendosConstantesFunciones.activarBusquedaIngresosReferendosIngresosReferendos);
				this.jTabbedPaneBusquedasIngresosReferendos.setEnabledAt(index,this.ingresosreferendosConstantesFunciones.activarBusquedaIngresosReferendosIngresosReferendos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaIngresosReferendos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaIngresosReferendos")) {
			index= this.jTabbedPaneBusquedasIngresosReferendos.indexOfComponent(this.jPanelBusquedaIngresosReferendosIngresosReferendos);

			this.jTabbedPaneBusquedasIngresosReferendos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosReferendos.getComponent(index);

			this.ingresosreferendosConstantesFunciones.setResaltarBusquedaIngresosReferendosIngresosReferendos(resaltar);

			jPanel.setBorder(this.ingresosreferendosConstantesFunciones.resaltarBusquedaIngresosReferendosIngresosReferendos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarIngresosReferendos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioIngresosReferendos() throws Exception {

		if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioIngresosReferendos();
		this.updateVisibilidadResaltarControlesFormularioIngresosReferendos();
		this.updateHabilitarResaltarControlesFormularioIngresosReferendos();
		
	}
	
	public void updateBorderResaltarControlesFormularioIngresosReferendos() throws Exception {
		if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ingresosreferendosConstantesFunciones.resaltaridIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltaridIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarfecha_emision_desdeIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_desdeIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarfecha_emision_desdeIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarfecha_emision_hastaIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_hastaIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarfecha_emision_hastaIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnombre_completo_clienteIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnombre_completo_clienteIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumeroIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumeroIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumero_autorizacionIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumero_autorizacionIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumero_fueIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumero_fueIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumero_pre_impresoIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumero_pre_impresoIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumero_dauIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumero_dauIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarnumero_referendoIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarnumero_referendoIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltarfecha_referendoIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltarfecha_referendoIngresosReferendos);}
		if(this.ingresosreferendosConstantesFunciones.resaltaraforo_referendoIngresosReferendos!=null && this.jInternalFrameDetalleFormIngresosReferendos!=null) {this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setBorder(this.ingresosreferendosConstantesFunciones.resaltaraforo_referendoIngresosReferendos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioIngresosReferendos() throws Exception {		
		if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
	
		//this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostraridIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelidIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostraridIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_desdeIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_emision_desdeIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelfecha_emision_desdeIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_emision_desdeIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_hastaIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_emision_hastaIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelfecha_emision_hastaIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_emision_hastaIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnombre_completo_clienteIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnombre_completo_clienteIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnombre_completo_clienteIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumeroIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumeroIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumeroIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_autorizacionIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumero_autorizacionIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_autorizacionIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_fueIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumero_fueIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_fueIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_pre_impresoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumero_pre_impresoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_pre_impresoIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_dauIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumero_dauIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_dauIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelnumero_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarnumero_referendoIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelfecha_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostrarfecha_referendoIngresosReferendos);
		//this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostraraforo_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jPanelaforo_referendoIngresosReferendos.setVisible(this.ingresosreferendosConstantesFunciones.mostraraforo_referendoIngresosReferendos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioIngresosReferendos() throws Exception {
		if(this.jInternalFrameDetalleFormIngresosReferendos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngresosReferendos!=null) {
	
		this.jInternalFrameDetalleFormIngresosReferendos.jLabelidIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activaridIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_desdeIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarfecha_emision_desdeIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_emision_hastaIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarfecha_emision_hastaIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextAreanombre_completo_clienteIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnombre_completo_clienteIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumeroIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumeroIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_autorizacionIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumero_autorizacionIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_fueIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumero_fueIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_pre_impresoIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumero_pre_impresoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_dauIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumero_dauIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldnumero_referendoIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarnumero_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jDateChooserfecha_referendoIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activarfecha_referendoIngresosReferendos);
		this.jInternalFrameDetalleFormIngresosReferendos.jTextFieldaforo_referendoIngresosReferendos.setEnabled(this.ingresosreferendosConstantesFunciones.activaraforo_referendoIngresosReferendos);
		}
	}
	
		
}