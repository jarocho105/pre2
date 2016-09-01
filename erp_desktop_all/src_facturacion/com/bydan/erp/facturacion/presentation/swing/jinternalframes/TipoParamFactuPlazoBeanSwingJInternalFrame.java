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

import com.bydan.erp.facturacion.util.TipoParamFactuPlazoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoParamFactuPlazoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoParamFactuPlazoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoParamFactuPlazoBean;
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
public class TipoParamFactuPlazoBeanSwingJInternalFrame extends TipoParamFactuPlazoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParamFactuPlazoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParamFactuPlazo> tipoparamfactuplazoValidator = new ClassValidator<TipoParamFactuPlazo>(TipoParamFactuPlazo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParamFactuPlazo tipoparamfactuplazo;	
	public TipoParamFactuPlazo tipoparamfactuplazoAux;
	public TipoParamFactuPlazo tipoparamfactuplazoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParamFactuPlazo tipoparamfactuplazoTotales;
	public Long idTipoParamFactuPlazoActual;
	public Long iIdNuevoTipoParamFactuPlazo=0L;
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
	
	public Boolean isPermisoTodoTipoParamFactuPlazo;
	public Boolean isPermisoNuevoTipoParamFactuPlazo;
	public Boolean isPermisoActualizarTipoParamFactuPlazo;
	public Boolean isPermisoActualizarOriginalTipoParamFactuPlazo;
	public Boolean isPermisoEliminarTipoParamFactuPlazo;
	public Boolean isPermisoGuardarCambiosTipoParamFactuPlazo;
	public Boolean isPermisoConsultaTipoParamFactuPlazo;
	public Boolean isPermisoBusquedaTipoParamFactuPlazo;
	public Boolean isPermisoReporteTipoParamFactuPlazo;
	public Boolean isPermisoPaginacionMedioTipoParamFactuPlazo;
	public Boolean isPermisoPaginacionAltoTipoParamFactuPlazo;
	public Boolean isPermisoPaginacionTodoTipoParamFactuPlazo;
	public Boolean isPermisoCopiarTipoParamFactuPlazo;
	public Boolean isPermisoVerFormTipoParamFactuPlazo;
	public Boolean isPermisoDuplicarTipoParamFactuPlazo;
	public Boolean isPermisoOrdenTipoParamFactuPlazo;
	
	
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
	
	public TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoReturnGeneral;
	public TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParamFactuPlazo=false;
	public Boolean esParaAccionDesdeFormularioTipoParamFactuPlazo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParamFactuPlazoSessionBeanAdditional tipoparamfactuplazoSessionBeanAdditional=null;
	
	public TipoParamFactuPlazoSessionBeanAdditional getTipoParamFactuPlazoSessionBeanAdditional() {
		return this.tipoparamfactuplazoSessionBeanAdditional;
	}
	
	public void setTipoParamFactuPlazoSessionBeanAdditional(TipoParamFactuPlazoSessionBeanAdditional tipoparamfactuplazoSessionBeanAdditional) {
		try {
			this.tipoparamfactuplazoSessionBeanAdditional=tipoparamfactuplazoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParamFactuPlazoBeanSwingJInternalFrameAdditional tipoparamfactuplazoBeanSwingJInternalFrameAdditional=null;
	//public class TipoParamFactuPlazoBeanSwingJInternalFrame
	
	public TipoParamFactuPlazoBeanSwingJInternalFrameAdditional getTipoParamFactuPlazoBeanSwingJInternalFrameAdditional() {
		return this.tipoparamfactuplazoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParamFactuPlazoBeanSwingJInternalFrameAdditional(TipoParamFactuPlazoBeanSwingJInternalFrameAdditional tipoparamfactuplazoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparamfactuplazoBeanSwingJInternalFrameAdditional=tipoparamfactuplazoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParamFactuPlazoLogic tipoparamfactuplazoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParamFactuPlazo tipoparamfactuplazoBean;
	public TipoParamFactuPlazoConstantesFunciones tipoparamfactuplazoConstantesFunciones;
	//public TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoParamFactuPlazo> tipoparamfactuplazos;	
	//public List<TipoParamFactuPlazo> tipoparamfactuplazosEliminados;
	//public List<TipoParamFactuPlazo> tipoparamfactuplazosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParamFactuPlazo=true;
	public Boolean isVisibilidadCeldaCopiarTipoParamFactuPlazo=true;
	public Boolean isVisibilidadCeldaVerFormTipoParamFactuPlazo=true;
	public Boolean isVisibilidadCeldaOrdenTipoParamFactuPlazo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaCancelarTipoParamFactuPlazo=false;
	public Boolean isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoParamFactuPlazo() {
		return this.iIdNuevoTipoParamFactuPlazo;
	}

	public void setiIdNuevoTipoParamFactuPlazo(Long iIdNuevoTipoParamFactuPlazo) {
		this.iIdNuevoTipoParamFactuPlazo = iIdNuevoTipoParamFactuPlazo;
	}
	
	public Long getidTipoParamFactuPlazoActual() {
		return this.idTipoParamFactuPlazoActual;
	}

	public void setidTipoParamFactuPlazoActual(Long idTipoParamFactuPlazoActual) {
		this.idTipoParamFactuPlazoActual = idTipoParamFactuPlazoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParamFactuPlazo gettipoparamfactuplazo() {
		return this.tipoparamfactuplazo;
	}

	public void settipoparamfactuplazo(TipoParamFactuPlazo tipoparamfactuplazo) {
		this.tipoparamfactuplazo = tipoparamfactuplazo;
	}
	
	public TipoParamFactuPlazo gettipoparamfactuplazoAux() {
		return this.tipoparamfactuplazoAux;
	}

	public void settipoparamfactuplazoAux(TipoParamFactuPlazo tipoparamfactuplazoAux) {
		this.tipoparamfactuplazoAux = tipoparamfactuplazoAux;
	}				
	
	public TipoParamFactuPlazo gettipoparamfactuplazoAnterior() {
		return this.tipoparamfactuplazoAnterior;
	}

	public void settipoparamfactuplazoAnterior(TipoParamFactuPlazo tipoparamfactuplazoAnterior) {
		this.tipoparamfactuplazoAnterior = tipoparamfactuplazoAnterior;
	}	
	
	public TipoParamFactuPlazo gettipoparamfactuplazoTotales() {
		return this.tipoparamfactuplazoTotales;
	}

	public void settipoparamfactuplazoTotales(TipoParamFactuPlazo tipoparamfactuplazoTotales) {
		this.tipoparamfactuplazoTotales = tipoparamfactuplazoTotales;
	}	
	
	public TipoParamFactuPlazo gettipoparamfactuplazoBean() {
		return this.tipoparamfactuplazoBean;
	}

	public void settipoparamfactuplazoBean(TipoParamFactuPlazo tipoparamfactuplazoBean) {
		this.tipoparamfactuplazoBean = tipoparamfactuplazoBean;
	}	
	
	public TipoParamFactuPlazoParameterReturnGeneral gettipoparamfactuplazoReturnGeneral() {
		return this.tipoparamfactuplazoReturnGeneral;
	}

	public void settipoparamfactuplazoReturnGeneral(TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoReturnGeneral) {
		this.tipoparamfactuplazoReturnGeneral = tipoparamfactuplazoReturnGeneral;
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
	
	
	public TipoParamFactuPlazoLogic getTipoParamFactuPlazoLogic()	{		
		return tipoparamfactuplazoLogic;
	}

	public void setTipoParamFactuPlazoLogic(TipoParamFactuPlazoLogic tipoparamfactuplazoLogic) {
		this.tipoparamfactuplazoLogic = tipoparamfactuplazoLogic;
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
	
	public Boolean getIsEsNuevoTipoParamFactuPlazo() {
		return isEsNuevoTipoParamFactuPlazo;
	}

	public void setIsEsNuevoTipoParamFactuPlazo(Boolean isEsNuevoTipoParamFactuPlazo) {
		this.isEsNuevoTipoParamFactuPlazo = isEsNuevoTipoParamFactuPlazo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParamFactuPlazo() {
		return esParaAccionDesdeFormularioTipoParamFactuPlazo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParamFactuPlazo(Boolean esParaAccionDesdeFormularioTipoParamFactuPlazo) {
		this.esParaAccionDesdeFormularioTipoParamFactuPlazo = esParaAccionDesdeFormularioTipoParamFactuPlazo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoParamFactuPlazo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParamFactuPlazoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuPlazo(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParamFactuPlazoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuPlazo(this.tipoparamfactuplazos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparamfactuplazoLogic.setTipoParamFactuPlazos(this.tipoparamfactuplazos);
			tipoparamfactuplazoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoParamFactuPlazoParameterReturnGeneral getTipoParamFactuPlazoParameterGeneral() {
		return this.tipoparamfactuplazoParameterGeneral;
	}
	
	public void setTipoParamFactuPlazoParameterGeneral(TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoParameterGeneral) {
		this.tipoparamfactuplazoParameterGeneral = tipoparamfactuplazoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParamFactuPlazo() {
		return isPermisoTodoTipoParamFactuPlazo;
	}

	public void setIsPermisoTodoTipoParamFactuPlazo(Boolean isPermisoTodoTipoParamFactuPlazo) {
		this.isPermisoTodoTipoParamFactuPlazo = isPermisoTodoTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoNuevoTipoParamFactuPlazo() {
		return isPermisoNuevoTipoParamFactuPlazo;
	}

	public void setIsPermisoNuevoTipoParamFactuPlazo(Boolean isPermisoNuevoTipoParamFactuPlazo) {
		this.isPermisoNuevoTipoParamFactuPlazo = isPermisoNuevoTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoActualizarTipoParamFactuPlazo() {
		return isPermisoActualizarTipoParamFactuPlazo;
	}

	public void setIsPermisoActualizarTipoParamFactuPlazo(Boolean isPermisoActualizarTipoParamFactuPlazo) {
		this.isPermisoActualizarTipoParamFactuPlazo = isPermisoActualizarTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoEliminarTipoParamFactuPlazo() {
		return isPermisoEliminarTipoParamFactuPlazo;
	}

	public void setIsPermisoEliminarTipoParamFactuPlazo(Boolean isPermisoEliminarTipoParamFactuPlazo) {
		this.isPermisoEliminarTipoParamFactuPlazo = isPermisoEliminarTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParamFactuPlazo() {
		return isPermisoGuardarCambiosTipoParamFactuPlazo;
	}

	public void setIsPermisoGuardarCambiosTipoParamFactuPlazo(Boolean isPermisoGuardarCambiosTipoParamFactuPlazo) {
		this.isPermisoGuardarCambiosTipoParamFactuPlazo = isPermisoGuardarCambiosTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoConsultaTipoParamFactuPlazo() {
		return isPermisoConsultaTipoParamFactuPlazo;
	}

	public void setIsPermisoConsultaTipoParamFactuPlazo(Boolean isPermisoConsultaTipoParamFactuPlazo) {
		this.isPermisoConsultaTipoParamFactuPlazo = isPermisoConsultaTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoBusquedaTipoParamFactuPlazo() {
		return isPermisoBusquedaTipoParamFactuPlazo;
	}

	public void setIsPermisoBusquedaTipoParamFactuPlazo(Boolean isPermisoBusquedaTipoParamFactuPlazo) {
		this.isPermisoBusquedaTipoParamFactuPlazo = isPermisoBusquedaTipoParamFactuPlazo;
	}

	public Boolean getIsPermisoReporteTipoParamFactuPlazo() {
		return isPermisoReporteTipoParamFactuPlazo;
	}

	public void setIsPermisoReporteTipoParamFactuPlazo(Boolean isPermisoReporteTipoParamFactuPlazo) {
		this.isPermisoReporteTipoParamFactuPlazo = isPermisoReporteTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParamFactuPlazo() {
		return isPermisoPaginacionMedioTipoParamFactuPlazo;
	}

	public void setIsPermisoPaginacionMedioTipoParamFactuPlazo(Boolean isPermisoPaginacionMedioTipoParamFactuPlazo) {
		this.isPermisoPaginacionMedioTipoParamFactuPlazo = isPermisoPaginacionMedioTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParamFactuPlazo() {
		return isPermisoPaginacionTodoTipoParamFactuPlazo;
	}

	public void setIsPermisoPaginacionTodoTipoParamFactuPlazo(Boolean isPermisoPaginacionTodoTipoParamFactuPlazo) {
		this.isPermisoPaginacionTodoTipoParamFactuPlazo = isPermisoPaginacionTodoTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParamFactuPlazo() {
		return isPermisoPaginacionAltoTipoParamFactuPlazo;
	}

	public void setIsPermisoPaginacionAltoTipoParamFactuPlazo(Boolean isPermisoPaginacionAltoTipoParamFactuPlazo) {
		this.isPermisoPaginacionAltoTipoParamFactuPlazo = isPermisoPaginacionAltoTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoCopiarTipoParamFactuPlazo() {
		return isPermisoCopiarTipoParamFactuPlazo;
	}

	public void setIsPermisoCopiarTipoParamFactuPlazo(Boolean isPermisoCopiarTipoParamFactuPlazo) {
		this.isPermisoCopiarTipoParamFactuPlazo = isPermisoCopiarTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoVerFormTipoParamFactuPlazo() {
		return isPermisoVerFormTipoParamFactuPlazo;
	}

	public void setIsPermisoVerFormTipoParamFactuPlazo(Boolean isPermisoVerFormTipoParamFactuPlazo) {
		this.isPermisoVerFormTipoParamFactuPlazo = isPermisoVerFormTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoDuplicarTipoParamFactuPlazo() {
		return isPermisoDuplicarTipoParamFactuPlazo;
	}

	public void setIsPermisoDuplicarTipoParamFactuPlazo(Boolean isPermisoDuplicarTipoParamFactuPlazo) {
		this.isPermisoDuplicarTipoParamFactuPlazo = isPermisoDuplicarTipoParamFactuPlazo;
	}
	
	public Boolean getIsPermisoOrdenTipoParamFactuPlazo() {
		return isPermisoOrdenTipoParamFactuPlazo;
	}

	public void setIsPermisoOrdenTipoParamFactuPlazo(Boolean isPermisoOrdenTipoParamFactuPlazo) {
		this.isPermisoOrdenTipoParamFactuPlazo = isPermisoOrdenTipoParamFactuPlazo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParamFactuPlazo() {
		return isVisibilidadCeldaNuevoTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaNuevoTipoParamFactuPlazo(Boolean isVisibilidadCeldaNuevoTipoParamFactuPlazo) {
		this.isVisibilidadCeldaNuevoTipoParamFactuPlazo = isVisibilidadCeldaNuevoTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParamFactuPlazo() {
		return isVisibilidadCeldaDuplicarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParamFactuPlazo(Boolean isVisibilidadCeldaDuplicarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo = isVisibilidadCeldaDuplicarTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParamFactuPlazo() {
		return isVisibilidadCeldaCopiarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaCopiarTipoParamFactuPlazo(Boolean isVisibilidadCeldaCopiarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaCopiarTipoParamFactuPlazo = isVisibilidadCeldaCopiarTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParamFactuPlazo() {
		return isVisibilidadCeldaVerFormTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaVerFormTipoParamFactuPlazo(Boolean isVisibilidadCeldaVerFormTipoParamFactuPlazo) {
		this.isVisibilidadCeldaVerFormTipoParamFactuPlazo = isVisibilidadCeldaVerFormTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParamFactuPlazo() {
		return isVisibilidadCeldaOrdenTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaOrdenTipoParamFactuPlazo(Boolean isVisibilidadCeldaOrdenTipoParamFactuPlazo) {
		this.isVisibilidadCeldaOrdenTipoParamFactuPlazo = isVisibilidadCeldaOrdenTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo() {
		return isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo(Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo = isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParamFactuPlazo() {
		return isVisibilidadCeldaModificarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaModificarTipoParamFactuPlazo(Boolean isVisibilidadCeldaModificarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaModificarTipoParamFactuPlazo = isVisibilidadCeldaModificarTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParamFactuPlazo() {
		return isVisibilidadCeldaActualizarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaActualizarTipoParamFactuPlazo(Boolean isVisibilidadCeldaActualizarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaActualizarTipoParamFactuPlazo = isVisibilidadCeldaActualizarTipoParamFactuPlazo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParamFactuPlazo() {
		return isVisibilidadCeldaEliminarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaEliminarTipoParamFactuPlazo(Boolean isVisibilidadCeldaEliminarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaEliminarTipoParamFactuPlazo = isVisibilidadCeldaEliminarTipoParamFactuPlazo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParamFactuPlazo() {
		return isVisibilidadCeldaCancelarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaCancelarTipoParamFactuPlazo(Boolean isVisibilidadCeldaCancelarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaCancelarTipoParamFactuPlazo = isVisibilidadCeldaCancelarTipoParamFactuPlazo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParamFactuPlazo() {
		return isVisibilidadCeldaGuardarTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaGuardarTipoParamFactuPlazo(Boolean isVisibilidadCeldaGuardarTipoParamFactuPlazo) {
		this.isVisibilidadCeldaGuardarTipoParamFactuPlazo = isVisibilidadCeldaGuardarTipoParamFactuPlazo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo() {
		return isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo(Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo) {
		this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo = isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo;
	}
		
	public TipoParamFactuPlazoSessionBean gettipoparamfactuplazoSessionBean() {
		return this.tipoparamfactuplazoSessionBean;
	}
	
	public void settipoparamfactuplazoSessionBean(TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean) {
		this.tipoparamfactuplazoSessionBean=tipoparamfactuplazoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoParamFactuPlazo tipoparamfactuplazo,TipoParamFactuPlazo tipoparamfactuplazoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParamFactuPlazo(tipoparamfactuplazo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparamfactuplazoAux.setId(tipoparamfactuplazo.getId());
		tipoparamfactuplazoAux.setVersionRow(tipoparamfactuplazo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParamFactuPlazo();
		
			int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparamfactuplazoValidator.getInvalidValues(this.tipoparamfactuplazo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparamfactuplazoLogic.setDatosCliente(datosCliente);
			tipoparamfactuplazoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparamfactuplazoAux=new  TipoParamFactuPlazo();
				
				tipoparamfactuplazoAux.setIsNew(true);
				tipoparamfactuplazoAux.setIsChanged(true);
				
				tipoparamfactuplazoAux.setTipoParamFactuPlazoOriginal(this.tipoparamfactuplazo);
				
				tipoparamfactuplazoAux.setId(this.tipoparamfactuplazo.getId());	
				tipoparamfactuplazoAux.setVersionRow(this.tipoparamfactuplazo.getVersionRow());	
				tipoparamfactuplazoAux.setnombre(this.tipoparamfactuplazo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoLogic.saveTipoParamFactuPlazos();//WithConnection
						//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactuplazoLogic.saveTipoParamFactuPlazoRelaciones(tipoparamfactuplazoAux);//WithConnection
								//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparamfactuplazoAux=new  TipoParamFactuPlazo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactuplazo.getId()>=0)) {
						
					tipoparamfactuplazoAux.setIsNew(false);
				}
				
				tipoparamfactuplazoAux.setIsDeleted(false);
			
				tipoparamfactuplazoAux.setId(this.tipoparamfactuplazo.getId());	
				tipoparamfactuplazoAux.setVersionRow(this.tipoparamfactuplazo.getVersionRow());	
				tipoparamfactuplazoAux.setnombre(this.tipoparamfactuplazo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoLogic.saveTipoParamFactuPlazos();//WithConnection
						//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactuplazoLogic.saveTipoParamFactuPlazoRelaciones(tipoparamfactuplazoAux);//WithConnection
								//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactuplazo,tipoparamfactuplazoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparamfactuplazoAux=new  TipoParamFactuPlazo();
				
				tipoparamfactuplazoAux.setIsNew(false);
				tipoparamfactuplazoAux.setIsChanged(false);
				
				tipoparamfactuplazoAux.setIsDeleted(true);
				
				tipoparamfactuplazoAux.setId(this.tipoparamfactuplazo.getId());	
				tipoparamfactuplazoAux.setVersionRow(this.tipoparamfactuplazo.getVersionRow());	
				tipoparamfactuplazoAux.setnombre(this.tipoparamfactuplazo.getnombre());	
				
				if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparamfactuplazoAux.getId()>=0) {	
						this.tipoparamfactuplazosEliminados.add(tipoparamfactuplazoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoLogic.saveTipoParamFactuPlazos();//WithConnection
						//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactuplazoLogic.saveTipoParamFactuPlazoRelaciones(tipoparamfactuplazoAux);//WithConnection
								//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
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
							if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparamfactuplazoAux,tipoparamfactuplazos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().addAll(this.tipoparamfactuplazosEliminados);
					
					tipoparamfactuplazoLogic.saveTipoParamFactuPlazos();//WithConnection
					//tipoparamfactuplazoLogic.getSetVersionRowTipoParamFactuPlazos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoparamfactuplazosEliminados= new ArrayList<TipoParamFactuPlazo>();		
			}
			
			if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Plazo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparamfactuplazo=tipoparamfactuplazoAux;
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
      		//this.finishProcessTipoParamFactuPlazo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParamFactuPlazo tipoparamfactuplazoLocal) throws Exception {
		
		if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParamFactuPlazo tipoparamfactuplazoLocal) throws Exception {	
		if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoParamFactuPlazoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparamfactuplazoValidator.getInvalidValues(this.tipoparamfactuplazo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParamFactuPlazo tipoparamfactuplazo,List<TipoParamFactuPlazo> tipoparamfactuplazos) throws Exception {
		try	{		
			TipoParamFactuPlazoConstantesFunciones.actualizarLista(tipoparamfactuplazo,tipoparamfactuplazos,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParamFactuPlazo tipoparamfactuplazo,List<TipoParamFactuPlazo> tipoparamfactuplazos) throws Exception {
		try	{			
			TipoParamFactuPlazoConstantesFunciones.actualizarSelectedLista(tipoparamfactuplazo,tipoparamfactuplazos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParamFactuPlazo> tipoparamfactuplazosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparamfactuplazosLocal=this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparamfactuplazosLocal=this.tipoparamfactuplazos;
			}
			//ARCHITECTURE
		
			for(TipoParamFactuPlazo tipoparamfactuplazoLocal:tipoparamfactuplazosLocal) {
				if(this.permiteMantenimiento(tipoparamfactuplazoLocal) && tipoparamfactuplazoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParamFactuPlazoConstantesFunciones.getTipoParamFactuPlazoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParamFactuPlazoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuPlazo.jLabelnombreTipoParamFactuPlazo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParamFactuPlazo.jLabelnombreTipoParamFactuPlazo,"");
		
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
		this.iIdNuevoTipoParamFactuPlazo--;	
		
		
		this.tipoparamfactuplazoAux=new TipoParamFactuPlazo();
		
		this.tipoparamfactuplazoAux.setId(this.iIdNuevoTipoParamFactuPlazo);
		this.tipoparamfactuplazoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().add(this.tipoparamfactuplazoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparamfactuplazos.add(this.tipoparamfactuplazoAux);
		}
		//ARCHITECTURE
		
		this.tipoparamfactuplazo=this.tipoparamfactuplazoAux;
		
		if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuPlazo(this.tipoparamfactuplazo);
		}
				
		//this.setDefaultControlesTipoParamFactuPlazo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParamFactuPlazo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuPlazo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuPlazo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazoBean,this.tipoparamfactuplazo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
			classes=TipoParamFactuPlazoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuPlazo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparamfactuplazoReturnGeneral=tipoparamfactuplazoLogic.procesarEventosTipoParamFactuPlazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this.tipoparamfactuplazo,this.tipoparamfactuplazoParameterGeneral,this.isEsNuevoTipoParamFactuPlazo,classes);//this.tipoparamfactuplazoLogic.getTipoParamFactuPlazo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral,this.tipoparamfactuplazoBean,false);
		
		if(this.tipoparamfactuplazoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo());
		}
		
		if(this.tipoparamfactuplazoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo(),classes);//this.tipoparamfactuplazoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParamFactuPlazo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParamFactuPlazo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.RecargarFormTipoParamFactuPlazo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
						
			if(tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuPlazo();
			}
			
			this.actualizarVisualTableDatosTipoParamFactuPlazo();
			
			this.jTableDatosTipoParamFactuPlazo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuPlazo(), this.getIndiceNuevoTipoParamFactuPlazo());
			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
						
			this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParamFactuPlazo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setEnabled(isHabilitar && this.tipoparamfactuplazoConstantesFunciones.activarnombreTipoParamFactuPlazo);	
		
	};
	
	public void setDefaultControlesTipoParamFactuPlazo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParamFactuPlazo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(true);			
			this.tipoparamfactuplazoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.setVisible(true);
			
					
		} else {
			//this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(false);			
			this.tipoparamfactuplazoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoParamFactuPlazo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				if(tipoparamfactuplazoAux.getId().equals(this.iIdNuevoTipoParamFactuPlazo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazos) {
				if(tipoparamfactuplazoAux.getId().equals(this.iIdNuevoTipoParamFactuPlazo)) {
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
	
	public int getIndiceActualTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				if(tipoparamfactuplazoAux.getId().equals(tipoparamfactuplazo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazos) {
				if(tipoparamfactuplazoAux.getId().equals(tipoparamfactuplazo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				if(tipoparamfactuplazoAux.getTipoParamFactuPlazoOriginal().getId().equals(tipoparamfactuplazoOriginal.getId())) {
					existe=true;
					tipoparamfactuplazoOriginal.setId(tipoparamfactuplazoAux.getId());
					tipoparamfactuplazoOriginal.setVersionRow(tipoparamfactuplazoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazos) {
				if(tipoparamfactuplazoAux.getTipoParamFactuPlazoOriginal().getId().equals(tipoparamfactuplazoOriginal.getId())) {
					existe=true;
					tipoparamfactuplazoOriginal.setId(tipoparamfactuplazoAux.getId());
					tipoparamfactuplazoOriginal.setVersionRow(tipoparamfactuplazoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParamFactuPlazo(Boolean esParaCancelar) throws Exception {
		tipoparamfactuplazosAux=new ArrayList<TipoParamFactuPlazo>();
		tipoparamfactuplazoAux=new TipoParamFactuPlazo();
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
					if(tipoparamfactuplazoAux.getId()<0) {
						tipoparamfactuplazosAux.add(tipoparamfactuplazoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuPlazo=0L;
				this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().removeAll(tipoparamfactuplazosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazos) {
					if(tipoparamfactuplazoAux.getId()<0) {
						tipoparamfactuplazosAux.add(tipoparamfactuplazoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuPlazo=0L;
				this.tipoparamfactuplazos.removeAll(tipoparamfactuplazosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuPlazo 
					&& this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()>0
					) {
					tipoparamfactuplazoAux=this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().get(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size() - 1);
				
					if(tipoparamfactuplazoAux.getId()<0) {
						this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().remove(tipoparamfactuplazoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuPlazo && this.tipoparamfactuplazos.size()>0) {
					tipoparamfactuplazoAux=this.tipoparamfactuplazos.get(this.tipoparamfactuplazos.size() - 1);
				
					if(tipoparamfactuplazoAux.getId()<0) {
						this.tipoparamfactuplazos.remove(tipoparamfactuplazoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParamFactuPlazo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparamfactuplazo.getId()<0) {
				this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().remove(this.tipoparamfactuplazo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparamfactuplazo.getId()<0) {
				this.tipoparamfactuplazos.remove(this.tipoparamfactuplazo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParamFactuPlazo(List<TipoParamFactuPlazo> tipoparamfactuplazosAux) throws Exception {
		TipoParamFactuPlazoConstantesFunciones.setEstadosInicialesTipoParamFactuPlazo(tipoparamfactuplazosAux);
	}
	
	public void setEstadosInicialesTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazoAux) throws Exception {
		TipoParamFactuPlazoConstantesFunciones.setEstadosInicialesTipoParamFactuPlazo(tipoparamfactuplazoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParamFactuPlazoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParamFactuPlazoActual()) {
				if(!this.isEsNuevoTipoParamFactuPlazo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParamFactuPlazo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParamFactuPlazoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Plazo ?", "MANTENIMIENTO DE Tipo Plazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParamFactuPlazo tipoparamfactuplazo) throws Exception {
		TipoParamFactuPlazoConstantesFunciones.seleccionarAsignar(this.tipoparamfactuplazo,tipoparamfactuplazo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParamFactuPlazo=this.isPermisoActualizarOriginalTipoParamFactuPlazo;
			
			
			this.seleccionarAsignar(tipoparamfactuplazo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuPlazoConstantesFunciones.quitarEspaciosTipoParamFactuPlazo(this.tipoparamfactuplazo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparamfactuplazoSessionBean.setsFuncionBusquedaRapida(this.tipoparamfactuplazoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParamFactuPlazo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParamFactuPlazo(esParaCancelar);				
				this.cancelarNuevoTipoParamFactuPlazo(esParaCancelar);								
			}
			
			this.tipoparamfactuplazo=new TipoParamFactuPlazo();
			
			this.inicializarTipoParamFactuPlazo();
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParamFactuPlazo() throws Exception {
		try {
			TipoParamFactuPlazoConstantesFunciones.inicializarTipoParamFactuPlazo(this.tipoparamfactuplazo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParamFactuPlazos(String sAccionBusqueda,List<TipoParamFactuPlazo> tipoparamfactuplazosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParamFactuPlazo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParamFactuPlazoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParamFactuPlazoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParamFactuPlazo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Plazos");		
		parameters.put("busquedapor", TipoParamFactuPlazoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParamFactuPlazo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParamFactuPlazoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParamFactuPlazoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParamFactuPlazo=new JRBeanArrayDataSource(TipoParamFactuPlazoJInternalFrame.TraerTipoParamFactuPlazoBeans(tipoparamfactuplazosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParamFactuPlazo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParamFactuPlazoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParamFactuPlazoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParamFactuPlazoBean.TraerTipoParamFactuPlazoBeans(tipoparamfactuplazosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazoActionPerformed(null);
					//this.generarExcelReporteTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParamFactuPlazos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactuplazosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParamFactuPlazos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuPlazo> tipoparamfactuplazosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuPlazos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuPlazo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParamFactuPlazo tipoparamfactuplazo : tipoparamfactuplazosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParamFactuPlazoConstantesFunciones.generarExcelReporteDataTipoParamFactuPlazo("NORMAL",row,workbook,tipoparamfactuplazo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParamFactuPlazo(String sTipo,Row row,Workbook workbook) {
		
		TipoParamFactuPlazoConstantesFunciones.generarExcelReporteHeaderTipoParamFactuPlazo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParamFactuPlazos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuPlazo> tipoparamfactuplazosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuPlazos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParamFactuPlazo tipoparamfactuplazo : tipoparamfactuplazosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.getTipoParamFactuPlazoDescripcion(tipoparamfactuplazo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparamfactuplazo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParamFactuPlazos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuPlazo> tipoparamfactuplazosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParamFactuPlazo> tipoparamfactuplazosRespaldo=null;
		
		classes=TipoParamFactuPlazoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuPlazo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparamfactuplazoLogic.setDatosCliente(this.datosCliente);
		this.tipoparamfactuplazoLogic.setDatosDeep(this.datosDeep);
		this.tipoparamfactuplazoLogic.setIsConDeep(true);
		
		tipoparamfactuplazosRespaldo=this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos();
		
		this.tipoparamfactuplazoLogic.setTipoParamFactuPlazos(tipoparamfactuplazosParaReportes);	
		this.tipoparamfactuplazoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparamfactuplazosParaReportes=this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos();
		this.tipoparamfactuplazoLogic.setTipoParamFactuPlazos(tipoparamfactuplazosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuPlazos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuPlazo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParamFactuPlazo tipoparamfactuplazo : tipoparamfactuplazosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParamFactuPlazo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParamFactuPlazoConstantesFunciones.generarExcelReporteDataTipoParamFactuPlazo("NORMAL",row,workbook,tipoparamfactuplazo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.getTipoParamFactuPlazoDescripcion(tipoparamfactuplazo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParamFactuPlazo() throws Exception {		
		this.startProcessTipoParamFactuPlazo(true);
	}
	
	public void startProcessTipoParamFactuPlazo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoParamFactuPlazo ,this.jPanelParametrosReportesTipoParamFactuPlazo, this.jScrollPanelDatosTipoParamFactuPlazo,this.jPanelPaginacionTipoParamFactuPlazo, this.jScrollPanelDatosEdicionTipoParamFactuPlazo, this.jPanelAccionesTipoParamFactuPlazo,this.jPanelAccionesFormularioTipoParamFactuPlazo,this.jmenuBarTipoParamFactuPlazo,this.jmenuBarDetalleTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuPlazo=this.jTabbedPaneBusquedasTipoParamFactuPlazo; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuPlazo=this.jPanelParametrosReportesTipoParamFactuPlazo;
		//final JScrollPane jScrollPanelDatosTipoParamFactuPlazo=this.jScrollPanelDatosTipoParamFactuPlazo;
		final JTable jTableDatosTipoParamFactuPlazo=this.jTableDatosTipoParamFactuPlazo;		
		final JPanel jPanelPaginacionTipoParamFactuPlazo=this.jPanelPaginacionTipoParamFactuPlazo;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuPlazo=this.jScrollPanelDatosEdicionTipoParamFactuPlazo;
		final JPanel jPanelAccionesTipoParamFactuPlazo=this.jPanelAccionesTipoParamFactuPlazo;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuPlazo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			jPanelCamposAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelCamposTipoParamFactuPlazo;
			jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelAccionesFormularioTipoParamFactuPlazo;
		}
		
		final JPanel jPanelCamposTipoParamFactuPlazo=jPanelCamposAuxiliarTipoParamFactuPlazo;
		final JPanel jPanelAccionesFormularioTipoParamFactuPlazo=jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo;
		
		
		final JMenuBar jmenuBarTipoParamFactuPlazo=this.jmenuBarTipoParamFactuPlazo;
		final JToolBar jTtoolBarTipoParamFactuPlazo=this.jTtoolBarTipoParamFactuPlazo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuPlazo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuPlazo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jmenuBarDetalleTipoParamFactuPlazo;
			jTtoolBarDetalleAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTtoolBarDetalleTipoParamFactuPlazo;
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuPlazo=jmenuBarDetalleAuxiliarTipoParamFactuPlazo;
		final JToolBar jTtoolBarDetalleTipoParamFactuPlazo=jTtoolBarDetalleAuxiliarTipoParamFactuPlazo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuPlazo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuPlazo;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuPlazo;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuPlazo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuPlazo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuPlazo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuPlazo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuPlazo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuPlazo;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuPlazo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuPlazo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuPlazo ,jPanelParametrosReportesTipoParamFactuPlazo,jTableDatosTipoParamFactuPlazo, /*jScrollPanelDatosTipoParamFactuPlazo,*/jPanelCamposTipoParamFactuPlazo,jPanelPaginacionTipoParamFactuPlazo, /*jScrollPanelDatosEdicionTipoParamFactuPlazo,*/ jPanelAccionesTipoParamFactuPlazo,jPanelAccionesFormularioTipoParamFactuPlazo,jmenuBarTipoParamFactuPlazo,jmenuBarDetalleTipoParamFactuPlazo,jTtoolBarTipoParamFactuPlazo,jTtoolBarDetalleTipoParamFactuPlazo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuPlazo ,jPanelParametrosReportesTipoParamFactuPlazo, jScrollPanelDatosTipoParamFactuPlazo,jPanelPaginacionTipoParamFactuPlazo, jScrollPanelDatosEdicionTipoParamFactuPlazo, jPanelAccionesTipoParamFactuPlazo,jPanelAccionesFormularioTipoParamFactuPlazo,jmenuBarTipoParamFactuPlazo,jmenuBarDetalleTipoParamFactuPlazo,jTtoolBarTipoParamFactuPlazo,jTtoolBarDetalleTipoParamFactuPlazo);
						
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
	
	public void finishProcessTipoParamFactuPlazo() {// throws Exception 
		this.finishProcessTipoParamFactuPlazo(true);
	}
	
	public void finishProcessTipoParamFactuPlazo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoParamFactuPlazo ,this.jPanelParametrosReportesTipoParamFactuPlazo, this.jScrollPanelDatosTipoParamFactuPlazo,this.jPanelPaginacionTipoParamFactuPlazo, this.jScrollPanelDatosEdicionTipoParamFactuPlazo, this.jPanelAccionesTipoParamFactuPlazo,this.jPanelAccionesFormularioTipoParamFactuPlazo,this.jmenuBarTipoParamFactuPlazo,this.jmenuBarDetalleTipoParamFactuPlazo,this.jTtoolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuPlazo=this.jTabbedPaneBusquedasTipoParamFactuPlazo; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuPlazo=this.jPanelParametrosReportesTipoParamFactuPlazo;
		//final JScrollPane jScrollPanelDatosTipoParamFactuPlazo=this.jScrollPanelDatosTipoParamFactuPlazo;
		final JTable jTableDatosTipoParamFactuPlazo=this.jTableDatosTipoParamFactuPlazo;		
		final JPanel jPanelPaginacionTipoParamFactuPlazo=this.jPanelPaginacionTipoParamFactuPlazo;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuPlazo=this.jScrollPanelDatosEdicionTipoParamFactuPlazo;
		final JPanel jPanelAccionesTipoParamFactuPlazo=this.jPanelAccionesTipoParamFactuPlazo;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuPlazo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			jPanelCamposAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelCamposTipoParamFactuPlazo;
			jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelAccionesFormularioTipoParamFactuPlazo;
		}
		
		final JPanel jPanelCamposTipoParamFactuPlazo=jPanelCamposAuxiliarTipoParamFactuPlazo;
		final JPanel jPanelAccionesFormularioTipoParamFactuPlazo=jPanelAccionesFormularioAuxiliarTipoParamFactuPlazo;
		
		
		final JMenuBar jmenuBarTipoParamFactuPlazo=this.jmenuBarTipoParamFactuPlazo;		
		final JToolBar jTtoolBarTipoParamFactuPlazo=this.jTtoolBarTipoParamFactuPlazo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuPlazo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuPlazo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jmenuBarDetalleTipoParamFactuPlazo;
			jTtoolBarDetalleAuxiliarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTtoolBarDetalleTipoParamFactuPlazo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuPlazo=jmenuBarDetalleAuxiliarTipoParamFactuPlazo;
		final JToolBar jTtoolBarDetalleTipoParamFactuPlazo=jTtoolBarDetalleAuxiliarTipoParamFactuPlazo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuPlazo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuPlazo;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuPlazo;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuPlazo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuPlazo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuPlazo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuPlazo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuPlazo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuPlazo;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuPlazo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuPlazo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParamFactuPlazo ,jPanelParametrosReportesTipoParamFactuPlazo, jTableDatosTipoParamFactuPlazo,/*jScrollPanelDatosTipoParamFactuPlazo,*/jPanelCamposTipoParamFactuPlazo,jPanelPaginacionTipoParamFactuPlazo, /*jScrollPanelDatosEdicionTipoParamFactuPlazo,*/ jPanelAccionesTipoParamFactuPlazo,jPanelAccionesFormularioTipoParamFactuPlazo,jmenuBarTipoParamFactuPlazo,jmenuBarDetalleTipoParamFactuPlazo,jTtoolBarTipoParamFactuPlazo,jTtoolBarDetalleTipoParamFactuPlazo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParamFactuPlazo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParamFactuPlazo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParamFactuPlazo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParamFactuPlazo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParamFactuPlazo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParamFactuPlazo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParamFactuPlazo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParamFactuPlazo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParamFactuPlazo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparamfactuplazoConstantesFunciones.getsFinalQueryTipoParamFactuPlazo();
		String  finalQueryPaginacionTodos=this.tipoparamfactuplazoConstantesFunciones.getsFinalQueryTipoParamFactuPlazo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParamFactuPlazoConstantesFunciones.getArrayColumnasGlobalesNoTipoParamFactuPlazo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParamFactuPlazoConstantesFunciones.getArrayColumnasGlobalesTipoParamFactuPlazo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParamFactuPlazoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparamfactuplazosEliminados= new ArrayList<TipoParamFactuPlazo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParamFactuPlazo();
		
				///*TipoParamFactuPlazoSessionBean*/this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
			
			if(this.tipoparamfactuplazoSessionBean==null) {
				this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
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
					this.iNumeroPaginacion=TipoParamFactuPlazoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParamFactuPlazoConstantesFunciones.getClassesForeignKeysOfTipoParamFactuPlazo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparamfactuplazo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparamfactuplazosAux= new ArrayList<TipoParamFactuPlazo>();
			
				
			tipoparamfactuplazoLogic.setDatosCliente(this.datosCliente);
			tipoparamfactuplazoLogic.setDatosDeep(this.datosDeep);
			tipoparamfactuplazoLogic.setIsConDeep(true);
			
			
			tipoparamfactuplazoLogic.getTipoParamFactuPlazoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparamfactuplazoLogic.getTodosTipoParamFactuPlazos(finalQueryGlobal,pagination);
					
					//tipoparamfactuplazoLogic.getTodosTipoParamFactuPlazosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparamfactuplazoLogic.getTipoParamFactuPlazos()==null|| tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactuplazosAux= new ArrayList<TipoParamFactuPlazo>();
							tipoparamfactuplazosAux.addAll(tipoparamfactuplazoLogic.getTipoParamFactuPlazos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactuplazosAux= new ArrayList<TipoParamFactuPlazo>();
							tipoparamfactuplazosAux.addAll(tipoparamfactuplazos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactuplazoLogic.getTodosTipoParamFactuPlazos(finalQueryGlobal+"",this.pagination);												
							
							//tipoparamfactuplazoLogic.getTodosTipoParamFactuPlazosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazoLogic.getTipoParamFactuPlazos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactuplazoLogic.setTipoParamFactuPlazos(new ArrayList<TipoParamFactuPlazo>());					
							tipoparamfactuplazoLogic.getTipoParamFactuPlazos().addAll(tipoparamfactuplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactuplazos=new ArrayList<TipoParamFactuPlazo>();
							tipoparamfactuplazos.addAll(tipoparamfactuplazosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParamFactuPlazo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParamFactuPlazo=this.idActual;
				
				} else if(this.idTipoParamFactuPlazoActual!=null && this.idTipoParamFactuPlazoActual!=0L) {
					idTipoParamFactuPlazo=idTipoParamFactuPlazoActual;
				}
				
					
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndicePorId(idTipoParamFactuPlazo);
				
				this.tipoparamfactuplazos=new ArrayList<TipoParamFactuPlazo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparamfactuplazoLogic.getEntity(idTipoParamFactuPlazo);
					
					//tipoparamfactuplazoLogic.getEntityWithConnection(idTipoParamFactuPlazo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactuplazoLogic.setTipoParamFactuPlazos(new ArrayList<TipoParamFactuPlazo>());
					tipoparamfactuplazoLogic.getTipoParamFactuPlazos().add(tipoparamfactuplazoLogic.getTipoParamFactuPlazo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactuplazos=new ArrayList<TipoParamFactuPlazo>();
					this.tipoparamfactuplazos.add(tipoparamfactuplazo);
				}
				
				if(tipoparamfactuplazoLogic.getTipoParamFactuPlazo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoparamfactuplazoLogic.getTipoParamFactuPlazosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoparamfactuplazoLogic.getTipoParamFactuPlazos()==null||tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoparamfactuplazos==null|| tipoparamfactuplazos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazosAux=new ArrayList<TipoParamFactuPlazo>();
						tipoparamfactuplazosAux.addAll(tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactuplazosAux=new ArrayList<TipoParamFactuPlazo>();
							tipoparamfactuplazosAux.addAll(tipoparamfactuplazos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoparamfactuplazoLogic.getTipoParamFactuPlazosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuPlazoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoParamFactuPlazos("BusquedaPorNombre",tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoParamFactuPlazos("BusquedaPorNombre",tipoparamfactuplazos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoLogic.setTipoParamFactuPlazos(new ArrayList<TipoParamFactuPlazo>());
						tipoparamfactuplazoLogic.getTipoParamFactuPlazos().addAll(tipoparamfactuplazosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactuplazos=new ArrayList<TipoParamFactuPlazo>();
							tipoparamfactuplazos.addAll(tipoparamfactuplazosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParamFactuPlazo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParamFactuPlazo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactuplazos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactuplazos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParamFactuPlazo tipoparamfactuplazo) {
		Boolean permite=true;
		
		if(this.tipoparamfactuplazo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParamFactuPlazoConstantesFunciones.getOrderByListaTipoParamFactuPlazo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParamFactuPlazoConstantesFunciones.getOrderByListaTipoParamFactuPlazo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuPlazo tipoparamfactuplazo:tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				if(tipoparamfactuplazo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactuplazoTotales=tipoparamfactuplazo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuPlazo tipoparamfactuplazo:this.tipoparamfactuplazos) {
				if(tipoparamfactuplazo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactuplazoTotales=tipoparamfactuplazo;
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
			this.tipoparamfactuplazoAux=new TipoParamFactuPlazo();
			this.tipoparamfactuplazoAux.setsType(Constantes2.S_TOTALES);
			this.tipoparamfactuplazoAux.setIsNew(false);
			this.tipoparamfactuplazoAux.setIsChanged(false);
			this.tipoparamfactuplazoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParamFactuPlazoConstantesFunciones.TotalizarValoresFilaTipoParamFactuPlazo(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this.tipoparamfactuplazoAux);
				
				this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().add(this.tipoparamfactuplazoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParamFactuPlazoConstantesFunciones.TotalizarValoresFilaTipoParamFactuPlazo(this.tipoparamfactuplazos,this.tipoparamfactuplazoAux);
				
				this.tipoparamfactuplazos.add(this.tipoparamfactuplazoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparamfactuplazoTotales=new TipoParamFactuPlazo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().remove(tipoparamfactuplazoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactuplazos.remove(tipoparamfactuplazoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparamfactuplazoTotales=new TipoParamFactuPlazo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuPlazo tipoparamfactuplazo:tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				if(tipoparamfactuplazo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactuplazoTotales=tipoparamfactuplazo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuPlazoConstantesFunciones.TotalizarValoresFilaTipoParamFactuPlazo(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),tipoparamfactuplazoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuPlazo tipoparamfactuplazo:this.tipoparamfactuplazos) {
				if(tipoparamfactuplazo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactuplazoTotales=tipoparamfactuplazo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuPlazoConstantesFunciones.TotalizarValoresFilaTipoParamFactuPlazo(this.tipoparamfactuplazos,tipoparamfactuplazoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoParamFactuPlazosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoParamFactuPlazoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoParamFactuPlazosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactuplazoLogic.getTipoParamFactuPlazosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoParamFactuPlazoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactuplazoLogic.getTipoParamFactuPlazoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoParamFactuPlazo() {
		this.isPermisoTodoTipoParamFactuPlazo=false;
		this.isPermisoNuevoTipoParamFactuPlazo=false;
		this.isPermisoActualizarTipoParamFactuPlazo=false;
		this.isPermisoActualizarOriginalTipoParamFactuPlazo=false;
		this.isPermisoEliminarTipoParamFactuPlazo=false;
		this.isPermisoGuardarCambiosTipoParamFactuPlazo=false;
		this.isPermisoConsultaTipoParamFactuPlazo=false;
		this.isPermisoBusquedaTipoParamFactuPlazo=false;
		this.isPermisoReporteTipoParamFactuPlazo=false;		
		this.isPermisoOrdenTipoParamFactuPlazo=false;		
		this.isPermisoPaginacionMedioTipoParamFactuPlazo=false;		
		this.isPermisoPaginacionAltoTipoParamFactuPlazo=false;
		this.isPermisoPaginacionTodoTipoParamFactuPlazo=false;
		this.isPermisoCopiarTipoParamFactuPlazo=false;		
		this.isPermisoVerFormTipoParamFactuPlazo=false;		
		this.isPermisoDuplicarTipoParamFactuPlazo=false;		
		this.isPermisoOrdenTipoParamFactuPlazo=false;		
	}
	
	public void setPermisosUsuarioTipoParamFactuPlazo(Boolean isPermiso) {
		this.isPermisoTodoTipoParamFactuPlazo=isPermiso;
		this.isPermisoNuevoTipoParamFactuPlazo=isPermiso;
		this.isPermisoActualizarTipoParamFactuPlazo=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuPlazo=isPermiso;
		this.isPermisoEliminarTipoParamFactuPlazo=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuPlazo=isPermiso;
		this.isPermisoConsultaTipoParamFactuPlazo=isPermiso;
		this.isPermisoBusquedaTipoParamFactuPlazo=isPermiso;
		this.isPermisoReporteTipoParamFactuPlazo=isPermiso;
		this.isPermisoOrdenTipoParamFactuPlazo=isPermiso;		
		this.isPermisoPaginacionMedioTipoParamFactuPlazo=isPermiso;		
		this.isPermisoPaginacionAltoTipoParamFactuPlazo=isPermiso;		
		this.isPermisoPaginacionTodoTipoParamFactuPlazo=isPermiso;		
		this.isPermisoCopiarTipoParamFactuPlazo=isPermiso;		
		this.isPermisoVerFormTipoParamFactuPlazo=isPermiso;		
		this.isPermisoDuplicarTipoParamFactuPlazo=isPermiso;
		this.isPermisoOrdenTipoParamFactuPlazo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParamFactuPlazo(Boolean isPermiso) {
		//this.isPermisoTodoTipoParamFactuPlazo=isPermiso;
		this.isPermisoNuevoTipoParamFactuPlazo=isPermiso;
		this.isPermisoActualizarTipoParamFactuPlazo=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuPlazo=isPermiso;
		this.isPermisoEliminarTipoParamFactuPlazo=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuPlazo=isPermiso;
		//this.isPermisoConsultaTipoParamFactuPlazo=isPermiso;
		//this.isPermisoBusquedaTipoParamFactuPlazo=isPermiso;
		//this.isPermisoReporteTipoParamFactuPlazo=isPermiso;
		//this.isPermisoOrdenTipoParamFactuPlazo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParamFactuPlazo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParamFactuPlazo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParamFactuPlazo=isPermiso;		
		//this.isPermisoCopiarTipoParamFactuPlazo=isPermiso;		
		//this.isPermisoDuplicarTipoParamFactuPlazo=isPermiso;
		//this.isPermisoOrdenTipoParamFactuPlazo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuPlazoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoParamFactuPlazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParamFactuPlazo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuPlazoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParamFactuPlazoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParamFactuPlazoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParamFactuPlazoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoParamFactuPlazo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParamFactuPlazoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParamFactuPlazoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParamFactuPlazo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParamFactuPlazo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParamFactuPlazo=this.isPermisoActualizarTipoParamFactuPlazo;
			this.isPermisoEliminarTipoParamFactuPlazo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParamFactuPlazo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParamFactuPlazo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParamFactuPlazo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParamFactuPlazo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParamFactuPlazo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuPlazo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParamFactuPlazo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParamFactuPlazo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParamFactuPlazo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParamFactuPlazo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParamFactuPlazo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParamFactuPlazo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuPlazo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParamFactuPlazo.setToolTipText(this.jTableDatosTipoParamFactuPlazo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParamFactuPlazo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParamFactuPlazo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParamFactuPlazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParamFactuPlazoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParamFactuPlazo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoParamFactuPlazoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParamFactuPlazoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParamFactuPlazoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParamFactuPlazoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoParamFactuPlazoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParamFactuPlazo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoParamFactuPlazo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParamFactuPlazo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParamFactuPlazo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuPlazo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParamFactuPlazo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuPlazo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParamFactuPlazo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParamFactuPlazo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParamFactuPlazo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParamFactuPlazo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParamFactuPlazo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParamFactuPlazo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoParamFactuPlazoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParamFactuPlazoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParamFactuPlazoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean(); 
		this.tipoparamfactuplazoConstantesFunciones=new TipoParamFactuPlazoConstantesFunciones(); 
		this.tipoparamfactuplazoBean=new TipoParamFactuPlazo();//(this.tipoparamfactuplazoConstantesFunciones); 		
		this.tipoparamfactuplazoReturnGeneral=new TipoParamFactuPlazoParameterReturnGeneral(); 
		
		this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactuplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParamFactuPlazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParamFactuPlazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParamFactuPlazoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParamFactuPlazo(true);
			
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
			
			this.tipoparamfactuplazoConstantesFunciones=new TipoParamFactuPlazoConstantesFunciones(); 
			this.tipoparamfactuplazoBean=new TipoParamFactuPlazo();//this.tipoparamfactuplazoConstantesFunciones); 			
			this.tipoparamfactuplazoReturnGeneral=new TipoParamFactuPlazoParameterReturnGeneral(); 
		
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Plazo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparamfactuplazo=new TipoParamFactuPlazo();
			this.tipoparamfactuplazos = new ArrayList<TipoParamFactuPlazo>();
			this.tipoparamfactuplazosAux = new ArrayList<TipoParamFactuPlazo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic=new TipoParamFactuPlazoLogic();
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparamfactuplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParamFactuPlazo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuPlazo);	
					}
					
					if(this.jInternalFrameImportacionTipoParamFactuPlazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuPlazo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParamFactuPlazo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParamFactuPlazo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuPlazo);
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.setVisible(false);
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo);
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParamFactuPlazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuPlazo);
					this.jInternalFrameImportacionTipoParamFactuPlazo.setVisible(false);
					this.jInternalFrameImportacionTipoParamFactuPlazo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParamFactuPlazo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuPlazo);
					this.jInternalFrameOrderByTipoParamFactuPlazo.setVisible(false);
					this.jInternalFrameOrderByTipoParamFactuPlazo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParamFactuPlazoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParamFactuPlazoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparamfactuplazoReturnGeneral=new TipoParamFactuPlazoParameterReturnGeneral();
			
			this.tipoparamfactuplazoParameterGeneral=new TipoParamFactuPlazoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparamfactuplazoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParamFactuPlazoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuPlazoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuPlazoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaCopiarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaVerFormTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaOrdenTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParamFactuPlazo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParamFactuPlazo(false);
			
			this.setPermisosUsuarioTipoParamFactuPlazo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParamFactuPlazoClasesRelacionadas();
			}
			
			if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParamFactuPlazoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParamFactuPlazo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuPlazo();
			}
			
			if(!this.isPermisoBusquedaTipoParamFactuPlazo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParamFactuPlazo,this.isPermisoPaginacionMedioTipoParamFactuPlazo,this.isPermisoPaginacionTodoTipoParamFactuPlazo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParamFactuPlazoConstantesFunciones.getTiposSeleccionarTipoParamFactuPlazo());
				
				this.tiposColumnasSelect=TipoParamFactuPlazoConstantesFunciones.getTiposSeleccionarTipoParamFactuPlazo(true);
				
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
			//if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParamFactuPlazo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoParamFactuPlazo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoParamFactuPlazo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuPlazo() ;
			
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
				tipoparamfactuplazoImplementable= (TipoParamFactuPlazoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuPlazoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparamfactuplazoImplementableHome= (TipoParamFactuPlazoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuPlazoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparamfactuplazos= new ArrayList<TipoParamFactuPlazo>();
			this.tipoparamfactuplazosEliminados= new ArrayList<TipoParamFactuPlazo>();
						
			this.isEsNuevoTipoParamFactuPlazo=false;
			this.esParaAccionDesdeFormularioTipoParamFactuPlazo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParamFactuPlazo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParamFactuPlazo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParamFactuPlazoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParamFactuPlazo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParamFactuPlazo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParamFactuPlazo();
			}
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoParamFactuPlazo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoParamFactuPlazo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoParamFactuPlazo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParamFactuPlazo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParamFactuPlazo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParamFactuPlazo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParamFactuPlazo")) {
				iIndex=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParamFactuPlazo();	
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
	
	public void cargarCombosForeignKeyTipoParamFactuPlazo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParamFactuPlazo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParamFactuPlazo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParamFactuPlazoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParamFactuPlazo();
		
		this.cargarCombosFrameForeignKeyTipoParamFactuPlazo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParamFactuPlazo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParamFactuPlazo();
		}
	}
	
	
	
	public void jButtonNuevoTipoParamFactuPlazoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			
			if(jTableDatosTipoParamFactuPlazo.getRowCount()>=1) {
				jTableDatosTipoParamFactuPlazo.removeRowSelectionInterval(0, jTableDatosTipoParamFactuPlazo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParamFactuPlazo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuPlazo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParamFactuPlazo(true);			
			//this.tipoparamfactuplazo=new TipoParamFactuPlazo();
			//this.tipoparamfactuplazo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo() ;
			
			if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuPlazo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparamfactuplazo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);				
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParamFactuPlazo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParamFactuPlazoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuPlazo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuPlazo.getSelectedRows().length;			
			}
			
			tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParamFactuPlazo--;			
				//TipoParamFactuPlazo tipoparamfactuplazoAux= new TipoParamFactuPlazo();			
				//tipoparamfactuplazoAux.setId(this.iIdNuevoTipoParamFactuPlazo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParamFactuPlazo tipoparamfactuplazoOrigen=new TipoParamFactuPlazo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParamFactuPlazo tipoparamfactuplazoOrigen : tipoparamfactuplazosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparamfactuplazoOrigen =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactuplazoOrigen =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParamFactuPlazo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparamfactuplazo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParamFactuPlazo(tipoparamfactuplazoOrigen,this.tipoparamfactuplazo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().add(this.tipoparamfactuplazoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactuplazos.add(this.tipoparamfactuplazoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
				
				this.jTableDatosTipoParamFactuPlazo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuPlazo(), this.getIndiceNuevoTipoParamFactuPlazo());
				
				int iLastRow =  this.jTableDatosTipoParamFactuPlazo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuPlazo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuPlazo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();									
		
			TipoParamFactuPlazo tipoparamfactuplazoOrigen=new TipoParamFactuPlazo();
			TipoParamFactuPlazo tipoparamfactuplazoDestino=new TipoParamFactuPlazo();
				
			tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuPlazo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparamfactuplazosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParamFactuPlazo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoOrigen =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactuplazoOrigen =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactuplazoDestino =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactuplazoDestino =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparamfactuplazoOrigen =tipoparamfactuplazosSeleccionados.get(0);
				tipoparamfactuplazoDestino =tipoparamfactuplazosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParamFactuPlazo(tipoparamfactuplazoOrigen,tipoparamfactuplazoDestino,true,false);
				
				tipoparamfactuplazoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactuplazoDestino,tipoparamfactuplazoLogic.getTipoParamFactuPlazos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactuplazoDestino,tipoparamfactuplazos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
				
				//this.jTableDatosTipoParamFactuPlazo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuPlazo(), this.getIndiceNuevoTipoParamFactuPlazo());
				
				int iLastRow =  this.jTableDatosTipoParamFactuPlazo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuPlazo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuPlazo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParamFactuPlazo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(!isVisible);
			this.jPanelPaginacionTipoParamFactuPlazo.setVisible(!isVisible);
			this.jPanelAccionesTipoParamFactuPlazo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParamFactuPlazo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParamFactuPlazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParamFactuPlazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParamFactuPlazo();
			
			this.abrirFrameOrderByTipoParamFactuPlazo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParamFactuPlazo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParamFactuPlazo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuPlazo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParamFactuPlazo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSize(this.jInternalFrameDetalleFormTipoParamFactuPlazo.iWidthFormulario,this.jInternalFrameDetalleFormTipoParamFactuPlazo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParamFactuPlazo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParamFactuPlazo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParamFactuPlazo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jContentPaneDetalleTipoParamFactuPlazo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jContentPaneDetalleTipoParamFactuPlazo.getWidth(),TipoParamFactuPlazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jContentPaneDetalleTipoParamFactuPlazo.getWidth(),TipoParamFactuPlazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jContentPaneDetalleTipoParamFactuPlazo.getWidth(),TipoParamFactuPlazoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParamFactuPlazo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParamFactuPlazo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParamFactuPlazo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParamFactuPlazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuPlazo,false,this);
				} else {
					this.jInternalFrameOrderByTipoParamFactuPlazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuPlazo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuPlazo);
				this.jInternalFrameOrderByTipoParamFactuPlazo.setVisible(false);
				this.jInternalFrameOrderByTipoParamFactuPlazo.setSelected(false);
				
				this.jInternalFrameOrderByTipoParamFactuPlazo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuPlazo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuPlazo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParamFactuPlazo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParamFactuPlazo==null) {
				
				this.jInternalFrameImportacionTipoParamFactuPlazo=new ImportacionJInternalFrame(TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuPlazo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuPlazo);
				this.jInternalFrameImportacionTipoParamFactuPlazo.setVisible(false);
				this.jInternalFrameImportacionTipoParamFactuPlazo.setSelected(false);


				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuPlazo"));
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuPlazo"));
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuPlazo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParamFactuPlazo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo==null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo=new ReporteDinamicoJInternalFrame(TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuPlazo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo);
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuPlazo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuPlazo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuPlazo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuPlazo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoParamFactuPlazo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuPlazo);
			
	       	this.jInternalFrameDetalleFormTipoParamFactuPlazo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParamFactuPlazo.dispose();
			//this.jInternalFrameDetalleFormTipoParamFactuPlazo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParamFactuPlazo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParamFactuPlazo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParamFactuPlazo.setVisible(true);
	        this.jInternalFrameImportacionTipoParamFactuPlazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParamFactuPlazo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParamFactuPlazo.setVisible(true);
	        this.jInternalFrameOrderByTipoParamFactuPlazo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParamFactuPlazo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParamFactuPlazo.setVisible(false);
	        this.jInternalFrameOrderByTipoParamFactuPlazo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParamFactuPlazo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParamFactuPlazo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParamFactuPlazo.setVisible(false);
	        this.jInternalFrameImportacionTipoParamFactuPlazo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParamFactuPlazo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParamFactuPlazo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParamFactuPlazo(true);
			//this.isEsNuevoTipoParamFactuPlazo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false) ;
			
			if(tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuPlazo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParamFactuPlazoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParamFactuPlazo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParamFactuPlazo(true);
			//this.isEsNuevoTipoParamFactuPlazo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparamfactuplazo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false) ;
			
			if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuPlazo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuPlazo(false);
			
			//if(!this.isEsNuevoTipoParamFactuPlazo) {								
				int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparamfactuplazo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParamFactuPlazo=true;
					this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
					this.isEsNuevoTipoParamFactuPlazo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParamFactuPlazo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParamFactuPlazo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuPlazo(false);
			
												
				
				if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParamFactuPlazo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,tipoparamfactuplazoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParamFactuPlazo(this.tipoparamfactuplazo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParamFactuPlazo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparamfactuplazoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparamfactuplazo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactuplazo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactuplazo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparamfactuplazo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParamFactuPlazoModel) this.jTableDatosTipoParamFactuPlazo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParamFactuPlazo=true;
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
				this.isEsNuevoTipoParamFactuPlazo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuPlazo(false);
				
				
				
				if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParamFactuPlazo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParamFactuPlazo.getRowCount()>=1) {
				jTableDatosTipoParamFactuPlazo.removeRowSelectionInterval(0, jTableDatosTipoParamFactuPlazo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParamFactuPlazo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(false) ;
			
			this.isEsNuevoTipoParamFactuPlazo=false;
			
			if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParamFactuPlazo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParamFactuPlazo(false);
				
				//SI ES MANUAL
				if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParamFactuPlazo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParamFactuPlazo--;			
			//TipoParamFactuPlazo tipoparamfactuplazoAux= new TipoParamFactuPlazo();			
			//tipoparamfactuplazoAux.setId(this.iIdNuevoTipoParamFactuPlazo);
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParamFactuPlazo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
			
			this.tipoparamfactuplazo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().add(this.tipoparamfactuplazoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparamfactuplazos.add(this.tipoparamfactuplazoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			
			this.jTableDatosTipoParamFactuPlazo.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuPlazo(), this.getIndiceNuevoTipoParamFactuPlazo());
			
			int iLastRow =  this.jTableDatosTipoParamFactuPlazo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParamFactuPlazo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParamFactuPlazo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuPlazo();
			}
			
			//this.abrirFrameTreeTipoParamFactuPlazo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PlazoS ?", "MANTENIMIENTO DE Tipo Plazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParamFactuPlazo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParamFactuPlazo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparamfactuplazoReturnGeneral=tipoparamfactuplazoLogic.procesarImportacionTipoParamFactuPlazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparamfactuplazoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParamFactuPlazoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParamFactuPlazo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParamFactuPlazo.setFileImportacion(this.jInternalFrameImportacionTipoParamFactuPlazo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParamFactuPlazo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParamFactuPlazo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		

		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParamFactuPlazoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParamFactuPlazoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParamFactuPlazos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParamFactuPlazo tipoparamfactuplazo:tipoparamfactuplazosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparamfactuplazo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoParamFactuPlazo(row);				
			//	iRow++;
			//}				
			
			//for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParamFactuPlazo(tipoparamfactuplazoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuPlazo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuPlazo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
			
			//SI ES MANUAL
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuPlazo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParamFactuPlazo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParamFactuPlazo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParamFactuPlazo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParamFactuPlazo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParamFactuPlazo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParamFactuPlazo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParamFactuPlazo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParamFactuPlazo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParamFactuPlazo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParamFactuPlazo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParamFactuPlazo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParamFactuPlazo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParamFactuPlazo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuPlazo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuPlazo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParamFactuPlazo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParamFactuPlazo();
		
		this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuPlazo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuPlazo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuPlazo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuPlazo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParamFactuPlazo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionNuevoTipoParamFactuPlazo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParamFactuPlazo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParamFactuPlazo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionNuevoTipoParamFactuPlazo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParamFactuPlazo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParamFactuPlazo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParamFactuPlazo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParamFactuPlazo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParamFactuPlazo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParamFactuPlazo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuPlazo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuPlazo() throws Exception {
		try	{
			if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuPlazo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuPlazo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuPlazo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParamFactuPlazo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParamFactuPlazo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParamFactuPlazo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParamFactuPlazo.addItem(reporte);
			}
			
			
			if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParamFactuPlazo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParamFactuPlazo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParamFactuPlazo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuPlazo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuPlazo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParamFactuPlazo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoParamFactuPlazo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParamFactuPlazo(Boolean esInicializar) throws Exception {				
		if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuPlazo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParamFactuPlazo() throws Exception {
		this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParamFactuPlazo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParamFactuPlazoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParamFactuPlazo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparamfactuplazos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParamFactuPlazo.setModel(new TipoParamFactuPlazoModel(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParamFactuPlazo.setModel(new TipoParamFactuPlazoModel(this.tipoparamfactuplazos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParamFactuPlazo!=null && this.jInternalFrameOrderByTipoParamFactuPlazo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuPlazo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactuplazoConstantesFunciones.resaltarSeleccionarTipoParamFactuPlazo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactuplazoConstantesFunciones.resaltarSeleccionarTipoParamFactuPlazo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazo,TipoParamFactuPlazoConstantesFunciones.LABEL_ID));

		if(this.tipoparamfactuplazoConstantesFunciones.mostraridTipoParamFactuPlazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuPlazoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparamfactuplazoConstantesFunciones.resaltaridTipoParamFactuPlazo,this.tipoparamfactuplazoConstantesFunciones.activaridTipoParamFactuPlazo,this,true,"idTipoParamFactuPlazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactuplazoConstantesFunciones.resaltaridTipoParamFactuPlazo,this.tipoparamfactuplazoConstantesFunciones.activaridTipoParamFactuPlazo,this,true,"idTipoParamFactuPlazo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazo,TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparamfactuplazoConstantesFunciones.mostrarnombreTipoParamFactuPlazo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparamfactuplazoConstantesFunciones.resaltarnombreTipoParamFactuPlazo,this.tipoparamfactuplazoConstantesFunciones.activarnombreTipoParamFactuPlazo,this,true,"nombreTipoParamFactuPlazo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactuplazoConstantesFunciones.resaltarnombreTipoParamFactuPlazo,this.tipoparamfactuplazoConstantesFunciones.activarnombreTipoParamFactuPlazo,this,true,"nombreTipoParamFactuPlazo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoParamFactuPlazoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuPlazo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuPlazo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParamFactuPlazo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParamFactuPlazo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParamFactuPlazo.moveColumn(this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParamFactuPlazo.moveColumn(this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParamFactuPlazo.moveColumn(this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParamFactuPlazo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParamFactuPlazo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParamFactuPlazo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParamFactuPlazo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParamFactuPlazo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParamFactuPlazo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparamfactuplazoLogic.getTipoParamFactuPlazos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparamfactuplazos.size()-1;
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
		//this.jTableDatosTipoParamFactuPlazo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParamFactuPlazo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParamFactuPlazo();
			
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
				
				//this.isEsNuevoTipoParamFactuPlazo=false;
					
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
				if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuPlazo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparamfactuplazo.getsType().equals("DUPLICADO")
				   || this.tipoparamfactuplazo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParamFactuPlazo=true;
				
				} else {
					this.isEsNuevoTipoParamFactuPlazo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparamfactuplazo.getId()>=0 && !this.tipoparamfactuplazo.getIsNew()) {						
						this.isEsNuevoTipoParamFactuPlazo=false;
						
					} else {
						this.isEsNuevoTipoParamFactuPlazo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuPlazo(esRelaciones);						
				
				this.seleccionarTipoParamFactuPlazo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparamfactuplazo.getId()<0) {
					this.isEsNuevoTipoParamFactuPlazo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParamFactuPlazo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParamFactuPlazo(evt,rowIndex);
				}	
				
				if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParamFactuPlazo: " + this.dDif); 
					}
				}								
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParamFactuPlazo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparamfactuplazo)) {
					if(this.tipoparamfactuplazo.getId()>0) {
						this.tipoparamfactuplazo.setIsDeleted(true);
						
						this.tipoparamfactuplazosEliminados.add(this.tipoparamfactuplazo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().remove(this.tipoparamfactuplazo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactuplazos.remove(this.tipoparamfactuplazo);				
					}
					
					
					((TipoParamFactuPlazoModel) this.jTableDatosTipoParamFactuPlazo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParamFactuPlazo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParamFactuPlazo) {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuPlazo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuPlazo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuPlazo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParamFactuPlazo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParamFactuPlazo(tipoparamfactuplazo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParamFactuPlazo(tipoparamfactuplazo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParamFactuPlazo(tipoparamfactuplazo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuPlazo(tipoparamfactuplazo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setText(tipoparamfactuplazo.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setText(tipoparamfactuplazo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParamFactuPlazo tipoparamfactuplazoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparamfactuplazoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParamFactuPlazo tipoparamfactuplazoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparamfactuplazoLocal=this.tipoparamfactuplazo;
			} else {
				tipoparamfactuplazoLocal=this.tipoparamfactuplazoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparamfactuplazoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParamFactuPlazo(tipoparamfactuplazoLocal,true);
					
					if(tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparamfactuplazoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparamfactuplazoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(tipoparamfactuplazo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(tipoparamfactuplazo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(tipoparamfactuplazo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.getText()==null || this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.getText()=="" || this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setText("0");
			}

			if(conColumnasBase) {tipoparamfactuplazo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuPlazoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuPlazo.jLabelIdTipoParamFactuPlazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparamfactuplazo.setnombre(this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuPlazo.jLabelnombreTipoParamFactuPlazo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazoBean,TipoParamFactuPlazo tipoparamfactuplazo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazoOrigen,TipoParamFactuPlazo tipoparamfactuplazo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactuplazoOrigen.getId()!=null && !tipoparamfactuplazoOrigen.getId().equals(0L))) {tipoparamfactuplazo.setId(tipoparamfactuplazoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparamfactuplazoOrigen.getnombre()!=null && !tipoparamfactuplazoOrigen.getnombre().equals(""))) {tipoparamfactuplazo.setnombre(tipoparamfactuplazoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setText(tipoparamfactuplazo.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setText(tipoparamfactuplazo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuPlazo(TipoParamFactuPlazoBean tipoparamfactuplazoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setText(tipoparamfactuplazoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setText(tipoparamfactuplazoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParamFactuPlazo(TipoParamFactuPlazoParameterReturnGeneral tipoparamfactuplazoReturnGeneral,TipoParamFactuPlazoBean tipoparamfactuplazoBean,Boolean conDefault) throws Exception { 
		try {
			TipoParamFactuPlazo tipoparamfactuplazoLocal=new TipoParamFactuPlazo();
			
			tipoparamfactuplazoLocal=tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactuplazoLocal.getId()!=null && !tipoparamfactuplazoLocal.getId().equals(0L))) {tipoparamfactuplazoBean.setId(tipoparamfactuplazoLocal.getId());}}
			if(conDefault || (!conDefault && tipoparamfactuplazoLocal.getnombre()!=null && !tipoparamfactuplazoLocal.getnombre().equals(""))) {tipoparamfactuplazoBean.setnombre(tipoparamfactuplazoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParamFactuPlazoGenerico(Long idTipoParamFactuPlazoSeleccionado,JComboBox jComboBoxTipoParamFactuPlazo,List<TipoParamFactuPlazo> tipoparamfactuplazosLocal)throws Exception {
		try {
			TipoParamFactuPlazo  tipoparamfactuplazoTemp=null;

			for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosLocal) {
				if(tipoparamfactuplazoAux.getId()!=null && tipoparamfactuplazoAux.getId().equals(idTipoParamFactuPlazoSeleccionado)) {
					tipoparamfactuplazoTemp=tipoparamfactuplazoAux;
					break;
				}
			}

			jComboBoxTipoParamFactuPlazo.setSelectedItem(tipoparamfactuplazoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParamFactuPlazoGenerico(JComboBox jComboBoxTipoParamFactuPlazo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParamFactuPlazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuPlazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParamFactuPlazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuPlazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuPlazo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParamFactuPlazo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuPlazo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParamFactuPlazo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParamFactuPlazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParamFactuPlazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactuplazo=(TipoParamFactuPlazo) tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactuplazo =(TipoParamFactuPlazo) tipoparamfactuplazos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParamFactuPlazo tipoparamfactuplazoRow=new TipoParamFactuPlazo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactuplazoRow=(TipoParamFactuPlazo) tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactuplazoRow=(TipoParamFactuPlazo) tipoparamfactuplazos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));			
			this.jButtonDuplicarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo && this.isPermisoDuplicarTipoParamFactuPlazo));			
			this.jButtonCopiarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuPlazo && this.isPermisoCopiarTipoParamFactuPlazo));
			this.jButtonVerFormTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuPlazo && this.isPermisoVerFormTipoParamFactuPlazo));
			
			this.jButtonAbrirOrderByTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));			
			
			this.jButtonNuevoRelacionesTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));			
			this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuPlazo && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuPlazo && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuPlazo && this.isPermisoEliminarTipoParamFactuPlazo));
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuPlazo);							
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));						
			this.jButtonDuplicarToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo && this.isPermisoDuplicarTipoParamFactuPlazo));						
			this.jButtonCopiarToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuPlazo && this.isPermisoCopiarTipoParamFactuPlazo));			
			this.jButtonVerFormToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuPlazo && this.isPermisoVerFormTipoParamFactuPlazo));			
			this.jButtonAbrirOrderByToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));
			this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuPlazo && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuPlazo  && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuPlazo && this.isPermisoEliminarTipoParamFactuPlazo));
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarToolBarTipoParamFactuPlazo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuPlazo);				
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));			
			this.jMenuItemDuplicarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo && this.isPermisoDuplicarTipoParamFactuPlazo));			
			this.jMenuItemCopiarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuPlazo && this.isPermisoCopiarTipoParamFactuPlazo));			
			this.jMenuItemVerFormTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuPlazo && this.isPermisoVerFormTipoParamFactuPlazo));			
			this.jMenuItemAbrirOrderByTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));			
			//this.jMenuItemMostrarOcultarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));
			this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));			
			//this.jMenuItemDetalleMostrarOcultarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuPlazo && this.isPermisoOrdenTipoParamFactuPlazo));			
			this.jMenuItemNuevoRelacionesTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo));			
			this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuPlazo && this.isPermisoNuevoTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));									
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemModificarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuPlazo && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemActualizarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuPlazo && this.isPermisoActualizarTipoParamFactuPlazo));	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemEliminarTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuPlazo && this.isPermisoEliminarTipoParamFactuPlazo));
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemCancelarTipoParamFactuPlazo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuPlazo);				
			}
			
			this.jMenuItemGuardarCambiosTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));						
			this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=this.jButtonNuevoTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo=this.jButtonDuplicarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaCopiarTipoParamFactuPlazo=this.jButtonCopiarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaVerFormTipoParamFactuPlazo=this.jButtonVerFormTipoParamFactuPlazo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParamFactuPlazo=this.jButtonAbrirOrderByTipoParamFactuPlazo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=this.jButtonNuevoRelacionesTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=this.jButtonModificarTipoParamFactuPlazo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=this.jButtonNuevoToolBarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarToolBarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarToolBarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarToolBarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarToolBarTipoParamFactuPlazo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=this.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=this.jMenuItemNuevoTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=this.jMenuItemNuevoRelacionesTipoParamFactuPlazo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemModificarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemActualizarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemEliminarTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemCancelarTipoParamFactuPlazo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=this.jMenuItemGuardarCambiosTipoParamFactuPlazo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParamFactuPlazo(Boolean esInicializar) {
		if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuPlazo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParamFactuPlazo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParamFactuPlazo() {
		this.jButtonNuevoTipoParamFactuPlazo.setVisible(this.isPermisoNuevoTipoParamFactuPlazo);			
		this.jButtonDuplicarTipoParamFactuPlazo.setVisible(this.isPermisoDuplicarTipoParamFactuPlazo);			
		this.jButtonCopiarTipoParamFactuPlazo.setVisible(this.isPermisoCopiarTipoParamFactuPlazo);			
		this.jButtonVerFormTipoParamFactuPlazo.setVisible(this.isPermisoVerFormTipoParamFactuPlazo);			
		
		this.jButtonAbrirOrderByTipoParamFactuPlazo.setVisible(this.isPermisoOrdenTipoParamFactuPlazo);					
		
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.setVisible(this.isPermisoNuevoTipoParamFactuPlazo);			
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarTipoParamFactuPlazo.setVisible(this.isPermisoActualizarTipoParamFactuPlazo);	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.setVisible(this.isPermisoActualizarTipoParamFactuPlazo);	
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.setVisible(this.isPermisoEliminarTipoParamFactuPlazo);
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuPlazo);						
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.setVisible(this.isPermisoGuardarCambiosTipoParamFactuPlazo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setVisible(this.isPermisoActualizarTipoParamFactuPlazo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuPlazo() {
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarTipoParamFactuPlazo.setVisible(this.isPermisoActualizarTipoParamFactuPlazo);	
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.setVisible(this.isPermisoActualizarTipoParamFactuPlazo);	
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.setVisible(this.isPermisoEliminarTipoParamFactuPlazo);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuPlazo);							
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuPlazo && this.isPermisoGuardarCambiosTipoParamFactuPlazo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParamFactuPlazo() {
		if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuPlazo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParamFactuPlazo() {
	}
	
	public void jTableDatosTipoParamFactuPlazoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParamFactuPlazo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParamFactuPlazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.gettipoparamfactuplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactuplazo==null) {
						this.tipoparamfactuplazo = new TipoParamFactuPlazo();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
				}

				if(this.tipoparamfactuplazo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparamfactuplazo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuPlazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParamFactuPlazoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.gettipoparamfactuplazo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactuplazo==null) {
						this.tipoparamfactuplazo = new TipoParamFactuPlazo();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);
				}

				if(this.tipoparamfactuplazo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparamfactuplazo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuPlazo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoParamFactuPlazoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);

			this.getTipoParamFactuPlazosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoParamFactuPlazo(false);

			//if(TipoParamFactuPlazoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactuplazoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoParamFactuPlazo() {
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.dispose();
			this.jInternalFrameDetalleFormTipoParamFactuPlazo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
			this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.dispose();
			this.jInternalFrameReporteDinamicoTipoParamFactuPlazo=null;
		}
		
		if(this.jInternalFrameImportacionTipoParamFactuPlazo!=null) {
			this.jInternalFrameImportacionTipoParamFactuPlazo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParamFactuPlazo.dispose();
			this.jInternalFrameImportacionTipoParamFactuPlazo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParamFactuPlazo();
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParamFactuPlazo")) {
				jButtonDuplicarTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParamFactuPlazo")) {
				jButtonCopiarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParamFactuPlazo")) {
				jButtonVerFormTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParamFactuPlazo")) {
				jButtonDuplicarTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParamFactuPlazo")) {
				jButtonDuplicarTipoParamFactuPlazoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParamFactuPlazo")) {
				jButtonModificarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParamFactuPlazo")) {
				jButtonModificarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParamFactuPlazo")) {
				jButtonModificarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParamFactuPlazo")) {
				jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParamFactuPlazo")) {
				jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParamFactuPlazo")) {
				jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParamFactuPlazo")) {
				jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParamFactuPlazo")) {
				jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParamFactuPlazo")) {
				jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParamFactuPlazo")) {
				jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParamFactuPlazo")) {
				jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParamFactuPlazo")) {
				jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParamFactuPlazo")) {
				jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParamFactuPlazo")) {
				jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParamFactuPlazo")) {
				jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParamFactuPlazo")) {
				jButtonMostrarOcultarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParamFactuPlazo")) {
				jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParamFactuPlazo")) {
				jButtonCopiarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParamFactuPlazo")) {
				jButtonVerFormTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParamFactuPlazo")) {
				jButtonCopiarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParamFactuPlazo")) {
				jButtonVerFormTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuPlazo")) {
				jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParamFactuPlazo")) {
				jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParamFactuPlazo")) {
				jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParamFactuPlazo")) {
				jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParamFactuPlazo")) {
				jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParamFactuPlazo")) {
				jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParamFactuPlazo")) {
				jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParamFactuPlazo")) {
				jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParamFactuPlazo")) {
				jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParamFactuPlazo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParamFactuPlazo")) {
				jButtonAbrirOrderByTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParamFactuPlazo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParamFactuPlazo")) {
				jButtonMostrarOcultarTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuPlazo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParamFactuPlazo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParamFactuPlazo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParamFactuPlazo")) {
				jButtonCerrarReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParamFactuPlazo")) {
				jButtonGenerarReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParamFactuPlazo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParamFactuPlazo")) {
				jButtonCerrarImportacionTipoParamFactuPlazoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParamFactuPlazo")) {
				
				jButtonGenerarImportacionTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParamFactuPlazo")) {
				
				jButtonAbrirImportacionTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParamFactuPlazo")) {
				jComboBoxTiposAccionesTipoParamFactuPlazoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParamFactuPlazo")) {
				jComboBoxTiposRelacionesTipoParamFactuPlazoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParamFactuPlazo")) {
				jComboBoxTiposAccionesTipoParamFactuPlazoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParamFactuPlazo")) {
				
				jComboBoxTiposSeleccionarTipoParamFactuPlazoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParamFactuPlazo")) {
				jTextFieldValorCampoGeneralTipoParamFactuPlazoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParamFactuPlazo")) {
				jButtonAbrirOrderByTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParamFactuPlazo")) {
				jButtonAbrirOrderByTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParamFactuPlazo")) {
				jButtonCerrarOrderByTipoParamFactuPlazoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuPlazoBusqueda")) {
				this.jButtonidTipoParamFactuPlazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuPlazoBusqueda")) {
				this.jButtonnombreTipoParamFactuPlazoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoParamFactuPlazo")) {
				this.jButtonBusquedaPorNombreTipoParamFactuPlazoActionPerformed(evt);
			}
			
			;
			
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParamFactuPlazo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParamFactuPlazo tipoparamfactuplazoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparamfactuplazoLocal=this.tipoparamfactuplazo;
			} else {
				tipoparamfactuplazoLocal=this.tipoparamfactuplazoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
							
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
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
			
			


			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
								
						
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
								
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
							
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
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
			
			


			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
								
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParamFactuPlazo")) {
					jCheckBoxSeleccionarTodosTipoParamFactuPlazoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParamFactuPlazo")) {
					jCheckBoxSeleccionadosTipoParamFactuPlazoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParamFactuPlazo")) {
					
				}
				
				


				
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
												
				
				


				
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
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
			
			


			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactuplazo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactuplazo);
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
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
				
				


				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuPlazo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuPlazo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuPlazoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactuplazoAnterior =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParamFactuPlazo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParamFactuPlazoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParamFactuPlazo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparamfactuplazo =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparamfactuplazo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParamFactuPlazo")) {
				
				}
				
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParamFactuPlazo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParamFactuPlazo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuPlazo")) {
			
			}
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParamFactuPlazo();
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParamFactuPlazo")) {
				jButtonDuplicarTipoParamFactuPlazoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParamFactuPlazo")) {
				jButtonCopiarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParamFactuPlazo")) {
				jButtonVerFormTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuPlazo")) {
				jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParamFactuPlazo")) {
				jButtonModificarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParamFactuPlazo")) {
				jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParamFactuPlazo")) {
				jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParamFactuPlazo")) {
				jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParamFactuPlazo")) {
				jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuPlazo")) {
				jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuPlazo")) {
				jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParamFactuPlazo")) {
				jButtonAbrirOrderByTipoParamFactuPlazoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuPlazo")) {
				jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParamFactuPlazo")) {
				jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParamFactuPlazo")) {
				jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuPlazoBusqueda")) {
				this.jButtonidTipoParamFactuPlazoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuPlazoBusqueda")) {
				this.jButtonnombreTipoParamFactuPlazoBusquedaActionPerformed(evt);
			}
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParamFactuPlazo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParamFactuPlazo")) {
				closingInternalFrameTipoParamFactuPlazo();
				
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuPlazo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuPlazo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParamFactuPlazoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuPlazoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuPlazo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParamFactuPlazoActionPerformed(null);
			}
			
			TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactuplazo,new Object(),this.tipoparamfactuplazoParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParamFactuPlazo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParamFactuPlazo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParamFactuPlazo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparamfactuplazo)) {
			if(!esControlTabla) {
				if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);			
				}
				
				if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactuplazoReturnGeneral=tipoparamfactuplazoLogic.procesarEventosTipoParamFactuPlazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this.tipoparamfactuplazo,this.tipoparamfactuplazoParameterGeneral,this.isEsNuevoTipoParamFactuPlazo,classes);//this.tipoparamfactuplazoLogic.getTipoParamFactuPlazo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral,this.tipoparamfactuplazoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuPlazo(classes,this.tipoparamfactuplazoReturnGeneral,this.tipoparamfactuplazoBean,false);
					}
						
					if(this.tipoparamfactuplazoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo());	
					}
						
					if(this.tipoparamfactuplazoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo(),classes);//this.tipoparamfactuplazoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuPlazo(this.tipoparamfactuplazo,classes);//this.tipoparamfactuplazoBean);									
				}
			
				if(TipoParamFactuPlazoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuPlazo(this.tipoparamfactuplazo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuPlazo(this.tipoparamfactuplazo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparamfactuplazoAnterior!=null) {
						this.tipoparamfactuplazo=this.tipoparamfactuplazoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactuplazoReturnGeneral=tipoparamfactuplazoLogic.procesarEventosTipoParamFactuPlazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this.tipoparamfactuplazo,this.tipoparamfactuplazoParameterGeneral,this.isEsNuevoTipoParamFactuPlazo,classes);//this.tipoparamfactuplazoLogic.getTipoParamFactuPlazo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo(),tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo(),this.tipoparamfactuplazos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParamFactuPlazo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParamFactuPlazo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParamFactuPlazo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParamFactuPlazo() throws Exception {
		
		TipoParamFactuPlazoModel tipoparamfactuplazoModel=(TipoParamFactuPlazoModel)this.jTableDatosTipoParamFactuPlazo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactuplazoModel.tipoparamfactuplazos=this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparamfactuplazoModel.tipoparamfactuplazos=this.tipoparamfactuplazos;
		}
		
		
		((TipoParamFactuPlazoModel) this.jTableDatosTipoParamFactuPlazo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParamFactuPlazo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparamfactuplazoAnterior(),this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparamfactuplazoAnterior(),this.tipoparamfactuplazos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParamFactuPlazo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
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
										
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactuplazo,new Object(),generalEntityParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParamFactuPlazoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuPlazo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParamFactuPlazoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParamFactuPlazo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParamFactuPlazo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactuplazo,new Object(),generalEntityParameterGeneral,this.tipoparamfactuplazoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParamFactuPlazo(TipoParamFactuPlazoBean tipoparamfactuplazoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuPlazo(ArrayList<Classe> classes,TipoParamFactuPlazoReturnGeneral tipoparamfactuplazoReturnGeneral,TipoParamFactuPlazoBean tipoparamfactuplazoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparamfactuplazo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo = new TipoParamFactuPlazoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones(),this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuPlazo);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.setVisible(false);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.tipoparamfactuplazoLogic=this.tipoparamfactuplazoLogic;
		
		this.cargarCombosFrameForeignKeyTipoParamFactuPlazo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuPlazo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuPlazo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParamFactuPlazo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuPlazo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuPlazo"));
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuPlazo"));

		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuPlazo"));
					
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemModificarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuPlazo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuPlazo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuPlazo"));
						
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemActualizarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuPlazo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuPlazo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuPlazo"));
								
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemEliminarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuPlazo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuPlazo"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuPlazo"));
					
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemCancelarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuPlazo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemDetalleCerrarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuPlazo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuPlazo"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuPlazo"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuPlazo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonidTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuPlazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonnombreTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuPlazoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuPlazo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParamFactuPlazo"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuPlazo"));
		}
		
		this.jTableDatosTipoParamFactuPlazo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParamFactuPlazo"));
		
		this.jTableDatosTipoParamFactuPlazo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParamFactuPlazo"));
		
		this.jButtonNuevoTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"NuevoTipoParamFactuPlazo"));
		
		this.jButtonDuplicarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"DuplicarTipoParamFactuPlazo"));
		
		this.jButtonCopiarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"CopiarTipoParamFactuPlazo"));
		
		this.jButtonVerFormTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"VerFormTipoParamFactuPlazo"));
		
		
		this.jButtonNuevoToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParamFactuPlazo"));
			
		this.jButtonDuplicarToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemNuevoTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParamFactuPlazo"));
			
		this.jMenuItemDuplicarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParamFactuPlazo"));		
		
		
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParamFactuPlazo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemNuevoRelacionesTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParamFactuPlazo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuPlazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonModificarToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuPlazo"));
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemModificarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuPlazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuPlazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonActualizarToolBarTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuPlazo"));
				
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemActualizarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuPlazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuPlazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonEliminarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuPlazo"));
						
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemEliminarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuPlazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuPlazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonCancelarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuPlazo"));
			
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemCancelarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuPlazo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParamFactuPlazo"));		
		
		
		this.jButtonCerrarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CerrarTipoParamFactuPlazo"));
		
		
		this.jButtonCerrarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemCerrarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParamFactuPlazo"));
			
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jMenuItemDetalleCerrarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuPlazo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParamFactuPlazo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuPlazo"));
		}
		
		this.jButtonCopiarToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParamFactuPlazo"));
			
		this.jButtonVerFormToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParamFactuPlazo"));
		
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParamFactuPlazo"));
			
		this.jMenuItemCopiarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParamFactuPlazo"));		
		
		this.jMenuItemVerFormTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParamFactuPlazo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuPlazo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuPlazo"));		
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParamFactuPlazo"));
					
		this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParamFactuPlazo"));
		
		this.jMenuItemRecargarInformacionTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParamFactuPlazo"));		
		
		
		
		this.jButtonAnterioresTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"AnterioresTipoParamFactuPlazo"));
		
		
		this.jButtonAnterioresToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParamFactuPlazo"));
		
		this.jMenuItemAnterioresTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParamFactuPlazo"));		
		
		
		this.jButtonSiguientesTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"SiguientesTipoParamFactuPlazo"));
		
		
		this.jButtonSiguientesToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemSiguientesTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParamFactuPlazo"));
			
		this.jMenuItemAbrirOrderByTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParamFactuPlazo"));
			
		this.jMenuItemMostrarOcultarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParamFactuPlazo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParamFactuPlazo"));
			
		this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParamFactuPlazo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParamFactuPlazo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParamFactuPlazo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParamFactuPlazo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParamFactuPlazo"));

		this.jCheckBoxSeleccionadosTipoParamFactuPlazo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParamFactuPlazo"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuPlazo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParamFactuPlazo"));
			
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParamFactuPlazo"));
					
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParamFactuPlazo"));
			
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParamFactuPlazo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonidTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuPlazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonnombreTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuPlazoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuPlazo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuPlazo!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuPlazo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuPlazo"));
				this.jInternalFrameReporteDinamicoTipoParamFactuPlazo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuPlazo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuPlazo"));				
			//this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuPlazo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuPlazo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParamFactuPlazo!=null) {
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuPlazo"));
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuPlazo"));
				this.jInternalFrameImportacionTipoParamFactuPlazo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuPlazo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParamFactuPlazo"));
			
			this.jButtonAbrirOrderByToolBarTipoParamFactuPlazo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParamFactuPlazo"));			
			
			if(this.jInternalFrameOrderByTipoParamFactuPlazo!=null) {
				this.jInternalFrameOrderByTipoParamFactuPlazo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuPlazo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTabbedPaneRelacionesTipoParamFactuPlazo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuPlazo"));
		
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
            		closingInternalFrameTipoParamFactuPlazo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuPlazo = (JInternalFrameBase)event.getSource();
	            	
	            TipoParamFactuPlazoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuPlazoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuPlazo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParamFactuPlazoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParamFactuPlazo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParamFactuPlazoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParamFactuPlazo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParamFactuPlazo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuPlazoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParamFactuPlazo";
		inputMap = this.jButtonModificarTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParamFactuPlazo";
		inputMap = this.jButtonActualizarTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParamFactuPlazo";
		inputMap = this.jButtonEliminarTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParamFactuPlazo";
		inputMap = this.jButtonCancelarTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParamFactuPlazo";
		inputMap = this.jButtonCerrarTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParamFactuPlazo";
		inputMap = this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonGuardarCambiosTipoParamFactuPlazo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParamFactuPlazo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParamFactuPlazoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParamFactuPlazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParamFactuPlazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParamFactuPlazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParamFactuPlazoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonidTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuPlazoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jButtonnombreTipoParamFactuPlazoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuPlazoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoParamFactuPlazo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuPlazo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParamFactuPlazo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParamFactuPlazoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParamFactuPlazoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuPlazo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParamFactuPlazo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
					tipoparamfactuplazoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazos) {
					tipoparamfactuplazoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParamFactuPlazoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
						tipoparamfactuplazoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazos) {
						tipoparamfactuplazoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuPlazo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuPlazo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParamFactuPlazoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuPlazo.getSelectedRows();
			
			TipoParamFactuPlazo tipoparamfactuplazoLocal=new TipoParamFactuPlazo();
			
			//this.seleccionarTodosTipoParamFactuPlazo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactuplazoLocal =(TipoParamFactuPlazo) this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos().toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparamfactuplazoLocal =(TipoParamFactuPlazo) this.tipoparamfactuplazos.toArray()[this.jTableDatosTipoParamFactuPlazo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparamfactuplazoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
						tipoparamfactuplazoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazos) {
						tipoparamfactuplazoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuPlazo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuPlazo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuPlazo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParamFactuPlazoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParamFactuPlazoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParamFactuPlazoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParamFactuPlazo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
				
						if(sTipoSeleccionar.equals(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactuplazoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazos) {
					
						if(sTipoSeleccionar.equals(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactuplazoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParamFactuPlazoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParamFactuPlazo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParamFactuPlazo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParamFactuPlazo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParamFactuPlazo(conSplash);
				
					this.generarReporteTipoParamFactuPlazosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParamFactuPlazosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuPlazosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuPlazosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuPlazo();
				
				this.exportarTipoParamFactuPlazosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParamFactuPlazos();
				//this.importarTipoParamFactuPlazos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuPlazo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParamFactuPlazosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Plazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParamFactuPlazo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParamFactuPlazo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParamFactuPlazo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParamFactuPlazoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParamFactuPlazo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParamFactuPlazo(conSplash);
					
						//this.actualizarParametrosGeneralTipoParamFactuPlazo();
						
						this.generarReporteProcesoAccionTipoParamFactuPlazosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo PlazoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Plazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParamFactuPlazo();
				
						this.actualizarParametrosGeneralTipoParamFactuPlazo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparamfactuplazoReturnGeneral=tipoparamfactuplazoLogic.procesarAccionTipoParamFactuPlazosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos(),this.tipoparamfactuplazoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParamFactuPlazoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParamFactuPlazo();
					
					TipoParamFactuPlazoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParamFactuPlazoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuPlazo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuPlazo.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParamFactuPlazo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParamFactuPlazoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParamFactuPlazo();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
			TipoParamFactuPlazo tipoparamfactuplazo=new TipoParamFactuPlazo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParamFactuPlazo.getSelectedItem();
			
			
			
			
			tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparamfactuplazosSeleccionados.size()==1) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
					tipoparamfactuplazo=tipoparamfactuplazoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParamFactuPlazo();
			
      		//this.finishProcessTipoParamFactuPlazo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParamFactuPlazoReturnGeneral() throws Exception {
		if(this.tipoparamfactuplazoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactuplazoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparamfactuplazoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactuplazoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparamfactuplazoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparamfactuplazoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
		}
		
		if(this.tipoparamfactuplazoReturnGeneral.getConRetornoLista() || this.tipoparamfactuplazoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparamfactuplazoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactuplazoLogic.setTipoParamFactuPlazos(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparamfactuplazoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactuplazoLogic.setTipoParamFactuPlazo(this.tipoparamfactuplazoReturnGeneral.getTipoParamFactuPlazo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParamFactuPlazo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParamFactuPlazo() throws Exception {
		
		
	}
	
	public ArrayList<TipoParamFactuPlazo> getTipoParamFactuPlazosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParamFactuPlazo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazoLogic.getTipoParamFactuPlazos()) {
					if(tipoparamfactuplazoAux.getIsSelected()) {
						tipoparamfactuplazosSeleccionados.add(tipoparamfactuplazoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuPlazo tipoparamfactuplazoAux:this.tipoparamfactuplazos) {
					if(tipoparamfactuplazoAux.getIsSelected()) {
						tipoparamfactuplazosSeleccionados.add(tipoparamfactuplazoAux);				
					}
				}
			}
			
			if(tipoparamfactuplazosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparamfactuplazosSeleccionados.addAll(this.tipoparamfactuplazoLogic.getTipoParamFactuPlazos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparamfactuplazosSeleccionados.addAll(this.tipoparamfactuplazos);				
					}
				}
			}
		} else {
			tipoparamfactuplazosSeleccionados.add(this.tipoparamfactuplazo);
		}
		
		return tipoparamfactuplazosSeleccionados;
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
	
	public void generarReporteTipoParamFactuPlazosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParamFactuPlazosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParamFactuPlazosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuPlazosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuPlazosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Plazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParamFactuPlazosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParamFactuPlazo();
		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParamFactuPlazo();
		
		
		//this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados ,tipoparamfactuplazoImplementable,tipoparamfactuplazoImplementableHome);
	}
	
	public void mostrarImportacionTipoParamFactuPlazos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParamFactuPlazo();
		
		this.abrirFrameImportacionTipoParamFactuPlazo();		
		
			
		//this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados ,tipoparamfactuplazoImplementable,tipoparamfactuplazoImplementableHome);
	}
	
	public void importarTipoParamFactuPlazos() throws Exception {		
	
	}
	
	public void exportarTipoParamFactuPlazosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParamFactuPlazosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParamFactuPlazosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParamFactuPlazosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Plazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParamFactuPlazo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParamFactuPlazo(tipoparamfactuplazoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparamfactuplazoAux.setsDetalleGeneralEntityReporte(tipoparamfactuplazoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParamFactuPlazo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParamFactuPlazoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuPlazoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparamfactuplazo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactuplazo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactuplazo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParamFactuPlazos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParamFactuPlazo(row);				
				iRow++;
			}				
			
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParamFactuPlazo(tipoparamfactuplazoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParamFactuPlazosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();		
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactuplazo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparamfactuplazos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparamfactuplazo");
			//elementRoot.appendChild(element);
		
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
				element = document.createElement("tipoparamfactuplazo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParamFactuPlazo(tipoparamfactuplazoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParamFactuPlazo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactuplazo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactuplazo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoParamFactuPlazo(TipoParamFactuPlazo tipoparamfactuplazo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParamFactuPlazoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparamfactuplazo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParamFactuPlazoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparamfactuplazo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoParamFactuPlazoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparamfactuplazo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoParamFactuPlazosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados=new ArrayList<TipoParamFactuPlazo>();
		
		tipoparamfactuplazosSeleccionados=this.getTipoParamFactuPlazosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParamFactuPlazo(tipoparamfactuplazosSeleccionados);
		
		this.generarReporteTipoParamFactuPlazos("Todos",tipoparamfactuplazosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParamFactuPlazo(ArrayList<TipoParamFactuPlazo> tipoparamfactuplazosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParamFactuPlazo tipoparamfactuplazoAux:tipoparamfactuplazosSeleccionados) {
				tipoparamfactuplazoAux.setsDetalleGeneralEntityReporte(tipoparamfactuplazoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparamfactuplazoAux.setsDescripcionGeneralEntityReporte1(tipoparamfactuplazoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuPlazoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParamFactuPlazo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaModificarTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuPlazo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuPlazo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=true;
		} else {
			this.actualizarEstadoPanelsTipoParamFactuPlazo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParamFactuPlazo=false;
			//this.isVisibilidadCeldaVerFormTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuPlazo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuPlazo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;												
			}
			
			this.jButtonCerrarTipoParamFactuPlazo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuPlazo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparamfactuplazo)) {
			this.isVisibilidadCeldaActualizarTipoParamFactuPlazo=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuPlazo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuPlazo() {
	}
	
	public void actualizarEstadoPanelsTipoParamFactuPlazo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuPlazo!=null) {
				this.jScrollPanelDatosTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuPlazo!=null) {
				this.jPanelPaginacionTipoParamFactuPlazo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
					this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuPlazo!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuPlazo!=null) {
				this.jPanelParametrosReportesTipoParamFactuPlazo.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		
		if(this.tipoparamfactuplazoSessionBean==null) {
			this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		}
		
		this.tipoparamfactuplazoSessionBean.setsUltimaBusquedaTipoParamFactuPlazo(this.getsAccionBusqueda());
		this.tipoparamfactuplazoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparamfactuplazoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoparamfactuplazoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		
		if(this.tipoparamfactuplazoSessionBean==null) {
			this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		}
		
		if(this.tipoparamfactuplazoSessionBean.getsUltimaBusquedaTipoParamFactuPlazo()!=null&&!this.tipoparamfactuplazoSessionBean.getsUltimaBusquedaTipoParamFactuPlazo().equals("")) {
			this.setsAccionBusqueda(tipoparamfactuplazoSessionBean.getsUltimaBusquedaTipoParamFactuPlazo());
			this.setiNumeroPaginacion(tipoparamfactuplazoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparamfactuplazoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoparamfactuplazoSessionBean.getnombre());
				tipoparamfactuplazoSessionBean.setnombre("");
			}
		}
		
		this.tipoparamfactuplazoSessionBean.setsUltimaBusquedaTipoParamFactuPlazo("");
		this.tipoparamfactuplazoSessionBean.setiNumeroPaginacion(TipoParamFactuPlazoConstantesFunciones.INUMEROPAGINACION);
		this.tipoparamfactuplazoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParamFactuPlazo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParamFactuPlazo() {
		this.updateBorderResaltarBusquedasFormularioTipoParamFactuPlazo();
		this.updateVisibilidadBusquedasFormularioTipoParamFactuPlazo();
		this.updateHabilitarBusquedasFormularioTipoParamFactuPlazo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParamFactuPlazo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponents().length>0) {
	

		if(this.tipoparamfactuplazoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuPlazo!=null) {
			index= this.jTabbedPaneBusquedasTipoParamFactuPlazo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuPlazo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponent(index);
				jPanel.setBorder(this.tipoparamfactuplazoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuPlazo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParamFactuPlazo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuPlazo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuPlazo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoparamfactuplazoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuPlazo);
			if(!this.tipoparamfactuplazoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuPlazo && index>-1) {
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoParamFactuPlazo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuPlazo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuPlazo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoparamfactuplazoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuPlazo);
				this.jTabbedPaneBusquedasTipoParamFactuPlazo.setEnabledAt(index,this.tipoparamfactuplazoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuPlazo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoParamFactuPlazo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoParamFactuPlazo.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuPlazo);

			this.jTabbedPaneBusquedasTipoParamFactuPlazo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuPlazo.getComponent(index);

			this.tipoparamfactuplazoConstantesFunciones.setResaltarBusquedaPorNombreTipoParamFactuPlazo(resaltar);

			jPanel.setBorder(this.tipoparamfactuplazoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuPlazo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoParamFactuPlazo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoParamFactuPlazo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParamFactuPlazo();
		this.updateVisibilidadResaltarControlesFormularioTipoParamFactuPlazo();
		this.updateHabilitarResaltarControlesFormularioTipoParamFactuPlazo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParamFactuPlazo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparamfactuplazoConstantesFunciones.resaltaridTipoParamFactuPlazo!=null && this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setBorder(this.tipoparamfactuplazoConstantesFunciones.resaltaridTipoParamFactuPlazo);}
		if(this.tipoparamfactuplazoConstantesFunciones.resaltarnombreTipoParamFactuPlazo!=null && this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setBorder(this.tipoparamfactuplazoConstantesFunciones.resaltarnombreTipoParamFactuPlazo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParamFactuPlazo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
	
		//this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setVisible(this.tipoparamfactuplazoConstantesFunciones.mostraridTipoParamFactuPlazo);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelidTipoParamFactuPlazo.setVisible(this.tipoparamfactuplazoConstantesFunciones.mostraridTipoParamFactuPlazo);
		//this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setVisible(this.tipoparamfactuplazoConstantesFunciones.mostrarnombreTipoParamFactuPlazo);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jPanelnombreTipoParamFactuPlazo.setVisible(this.tipoparamfactuplazoConstantesFunciones.mostrarnombreTipoParamFactuPlazo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParamFactuPlazo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuPlazo!=null) {
	
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextFieldidTipoParamFactuPlazo.setEnabled(this.tipoparamfactuplazoConstantesFunciones.activaridTipoParamFactuPlazo);
		this.jInternalFrameDetalleFormTipoParamFactuPlazo.jTextAreanombreTipoParamFactuPlazo.setEnabled(this.tipoparamfactuplazoConstantesFunciones.activarnombreTipoParamFactuPlazo);
		}
	}
	
		
}