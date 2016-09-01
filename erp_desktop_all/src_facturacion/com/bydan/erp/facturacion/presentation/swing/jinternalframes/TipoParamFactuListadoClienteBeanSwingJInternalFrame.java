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

import com.bydan.erp.facturacion.util.TipoParamFactuListadoClienteConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoParamFactuListadoClienteParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoParamFactuListadoClienteParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoParamFactuListadoClienteBean;
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
public class TipoParamFactuListadoClienteBeanSwingJInternalFrame extends TipoParamFactuListadoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParamFactuListadoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParamFactuListadoCliente> tipoparamfactulistadoclienteValidator = new ClassValidator<TipoParamFactuListadoCliente>(TipoParamFactuListadoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParamFactuListadoCliente tipoparamfactulistadocliente;	
	public TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux;
	public TipoParamFactuListadoCliente tipoparamfactulistadoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParamFactuListadoCliente tipoparamfactulistadoclienteTotales;
	public Long idTipoParamFactuListadoClienteActual;
	public Long iIdNuevoTipoParamFactuListadoCliente=0L;
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
	
	public Boolean isPermisoTodoTipoParamFactuListadoCliente;
	public Boolean isPermisoNuevoTipoParamFactuListadoCliente;
	public Boolean isPermisoActualizarTipoParamFactuListadoCliente;
	public Boolean isPermisoActualizarOriginalTipoParamFactuListadoCliente;
	public Boolean isPermisoEliminarTipoParamFactuListadoCliente;
	public Boolean isPermisoGuardarCambiosTipoParamFactuListadoCliente;
	public Boolean isPermisoConsultaTipoParamFactuListadoCliente;
	public Boolean isPermisoBusquedaTipoParamFactuListadoCliente;
	public Boolean isPermisoReporteTipoParamFactuListadoCliente;
	public Boolean isPermisoPaginacionMedioTipoParamFactuListadoCliente;
	public Boolean isPermisoPaginacionAltoTipoParamFactuListadoCliente;
	public Boolean isPermisoPaginacionTodoTipoParamFactuListadoCliente;
	public Boolean isPermisoCopiarTipoParamFactuListadoCliente;
	public Boolean isPermisoVerFormTipoParamFactuListadoCliente;
	public Boolean isPermisoDuplicarTipoParamFactuListadoCliente;
	public Boolean isPermisoOrdenTipoParamFactuListadoCliente;
	
	
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
	
	public TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteReturnGeneral;
	public TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParamFactuListadoCliente=false;
	public Boolean esParaAccionDesdeFormularioTipoParamFactuListadoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParamFactuListadoClienteSessionBeanAdditional tipoparamfactulistadoclienteSessionBeanAdditional=null;
	
	public TipoParamFactuListadoClienteSessionBeanAdditional getTipoParamFactuListadoClienteSessionBeanAdditional() {
		return this.tipoparamfactulistadoclienteSessionBeanAdditional;
	}
	
	public void setTipoParamFactuListadoClienteSessionBeanAdditional(TipoParamFactuListadoClienteSessionBeanAdditional tipoparamfactulistadoclienteSessionBeanAdditional) {
		try {
			this.tipoparamfactulistadoclienteSessionBeanAdditional=tipoparamfactulistadoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional tipoparamfactulistadoclienteBeanSwingJInternalFrameAdditional=null;
	//public class TipoParamFactuListadoClienteBeanSwingJInternalFrame
	
	public TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional getTipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional() {
		return this.tipoparamfactulistadoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional(TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional tipoparamfactulistadoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparamfactulistadoclienteBeanSwingJInternalFrameAdditional=tipoparamfactulistadoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParamFactuListadoClienteLogic tipoparamfactulistadoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParamFactuListadoCliente tipoparamfactulistadoclienteBean;
	public TipoParamFactuListadoClienteConstantesFunciones tipoparamfactulistadoclienteConstantesFunciones;
	//public TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes;	
	//public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesEliminados;
	//public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente=true;
	public Boolean isVisibilidadCeldaCopiarTipoParamFactuListadoCliente=true;
	public Boolean isVisibilidadCeldaVerFormTipoParamFactuListadoCliente=true;
	public Boolean isVisibilidadCeldaOrdenTipoParamFactuListadoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=false;
	public Boolean isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoParamFactuListadoCliente() {
		return this.iIdNuevoTipoParamFactuListadoCliente;
	}

	public void setiIdNuevoTipoParamFactuListadoCliente(Long iIdNuevoTipoParamFactuListadoCliente) {
		this.iIdNuevoTipoParamFactuListadoCliente = iIdNuevoTipoParamFactuListadoCliente;
	}
	
	public Long getidTipoParamFactuListadoClienteActual() {
		return this.idTipoParamFactuListadoClienteActual;
	}

	public void setidTipoParamFactuListadoClienteActual(Long idTipoParamFactuListadoClienteActual) {
		this.idTipoParamFactuListadoClienteActual = idTipoParamFactuListadoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParamFactuListadoCliente gettipoparamfactulistadocliente() {
		return this.tipoparamfactulistadocliente;
	}

	public void settipoparamfactulistadocliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente) {
		this.tipoparamfactulistadocliente = tipoparamfactulistadocliente;
	}
	
	public TipoParamFactuListadoCliente gettipoparamfactulistadoclienteAux() {
		return this.tipoparamfactulistadoclienteAux;
	}

	public void settipoparamfactulistadoclienteAux(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux) {
		this.tipoparamfactulistadoclienteAux = tipoparamfactulistadoclienteAux;
	}				
	
	public TipoParamFactuListadoCliente gettipoparamfactulistadoclienteAnterior() {
		return this.tipoparamfactulistadoclienteAnterior;
	}

	public void settipoparamfactulistadoclienteAnterior(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAnterior) {
		this.tipoparamfactulistadoclienteAnterior = tipoparamfactulistadoclienteAnterior;
	}	
	
	public TipoParamFactuListadoCliente gettipoparamfactulistadoclienteTotales() {
		return this.tipoparamfactulistadoclienteTotales;
	}

	public void settipoparamfactulistadoclienteTotales(TipoParamFactuListadoCliente tipoparamfactulistadoclienteTotales) {
		this.tipoparamfactulistadoclienteTotales = tipoparamfactulistadoclienteTotales;
	}	
	
	public TipoParamFactuListadoCliente gettipoparamfactulistadoclienteBean() {
		return this.tipoparamfactulistadoclienteBean;
	}

	public void settipoparamfactulistadoclienteBean(TipoParamFactuListadoCliente tipoparamfactulistadoclienteBean) {
		this.tipoparamfactulistadoclienteBean = tipoparamfactulistadoclienteBean;
	}	
	
	public TipoParamFactuListadoClienteParameterReturnGeneral gettipoparamfactulistadoclienteReturnGeneral() {
		return this.tipoparamfactulistadoclienteReturnGeneral;
	}

	public void settipoparamfactulistadoclienteReturnGeneral(TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteReturnGeneral) {
		this.tipoparamfactulistadoclienteReturnGeneral = tipoparamfactulistadoclienteReturnGeneral;
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
	
	
	public TipoParamFactuListadoClienteLogic getTipoParamFactuListadoClienteLogic()	{		
		return tipoparamfactulistadoclienteLogic;
	}

	public void setTipoParamFactuListadoClienteLogic(TipoParamFactuListadoClienteLogic tipoparamfactulistadoclienteLogic) {
		this.tipoparamfactulistadoclienteLogic = tipoparamfactulistadoclienteLogic;
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
	
	public Boolean getIsEsNuevoTipoParamFactuListadoCliente() {
		return isEsNuevoTipoParamFactuListadoCliente;
	}

	public void setIsEsNuevoTipoParamFactuListadoCliente(Boolean isEsNuevoTipoParamFactuListadoCliente) {
		this.isEsNuevoTipoParamFactuListadoCliente = isEsNuevoTipoParamFactuListadoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParamFactuListadoCliente() {
		return esParaAccionDesdeFormularioTipoParamFactuListadoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParamFactuListadoCliente(Boolean esParaAccionDesdeFormularioTipoParamFactuListadoCliente) {
		this.esParaAccionDesdeFormularioTipoParamFactuListadoCliente = esParaAccionDesdeFormularioTipoParamFactuListadoCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoParamFactuListadoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParamFactuListadoClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParamFactuListadoClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuListadoCliente(this.tipoparamfactulistadoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(this.tipoparamfactulistadoclientes);
			tipoparamfactulistadoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoParamFactuListadoClienteParameterReturnGeneral getTipoParamFactuListadoClienteParameterGeneral() {
		return this.tipoparamfactulistadoclienteParameterGeneral;
	}
	
	public void setTipoParamFactuListadoClienteParameterGeneral(TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteParameterGeneral) {
		this.tipoparamfactulistadoclienteParameterGeneral = tipoparamfactulistadoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParamFactuListadoCliente() {
		return isPermisoTodoTipoParamFactuListadoCliente;
	}

	public void setIsPermisoTodoTipoParamFactuListadoCliente(Boolean isPermisoTodoTipoParamFactuListadoCliente) {
		this.isPermisoTodoTipoParamFactuListadoCliente = isPermisoTodoTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoNuevoTipoParamFactuListadoCliente() {
		return isPermisoNuevoTipoParamFactuListadoCliente;
	}

	public void setIsPermisoNuevoTipoParamFactuListadoCliente(Boolean isPermisoNuevoTipoParamFactuListadoCliente) {
		this.isPermisoNuevoTipoParamFactuListadoCliente = isPermisoNuevoTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoActualizarTipoParamFactuListadoCliente() {
		return isPermisoActualizarTipoParamFactuListadoCliente;
	}

	public void setIsPermisoActualizarTipoParamFactuListadoCliente(Boolean isPermisoActualizarTipoParamFactuListadoCliente) {
		this.isPermisoActualizarTipoParamFactuListadoCliente = isPermisoActualizarTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoEliminarTipoParamFactuListadoCliente() {
		return isPermisoEliminarTipoParamFactuListadoCliente;
	}

	public void setIsPermisoEliminarTipoParamFactuListadoCliente(Boolean isPermisoEliminarTipoParamFactuListadoCliente) {
		this.isPermisoEliminarTipoParamFactuListadoCliente = isPermisoEliminarTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParamFactuListadoCliente() {
		return isPermisoGuardarCambiosTipoParamFactuListadoCliente;
	}

	public void setIsPermisoGuardarCambiosTipoParamFactuListadoCliente(Boolean isPermisoGuardarCambiosTipoParamFactuListadoCliente) {
		this.isPermisoGuardarCambiosTipoParamFactuListadoCliente = isPermisoGuardarCambiosTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoConsultaTipoParamFactuListadoCliente() {
		return isPermisoConsultaTipoParamFactuListadoCliente;
	}

	public void setIsPermisoConsultaTipoParamFactuListadoCliente(Boolean isPermisoConsultaTipoParamFactuListadoCliente) {
		this.isPermisoConsultaTipoParamFactuListadoCliente = isPermisoConsultaTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoBusquedaTipoParamFactuListadoCliente() {
		return isPermisoBusquedaTipoParamFactuListadoCliente;
	}

	public void setIsPermisoBusquedaTipoParamFactuListadoCliente(Boolean isPermisoBusquedaTipoParamFactuListadoCliente) {
		this.isPermisoBusquedaTipoParamFactuListadoCliente = isPermisoBusquedaTipoParamFactuListadoCliente;
	}

	public Boolean getIsPermisoReporteTipoParamFactuListadoCliente() {
		return isPermisoReporteTipoParamFactuListadoCliente;
	}

	public void setIsPermisoReporteTipoParamFactuListadoCliente(Boolean isPermisoReporteTipoParamFactuListadoCliente) {
		this.isPermisoReporteTipoParamFactuListadoCliente = isPermisoReporteTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParamFactuListadoCliente() {
		return isPermisoPaginacionMedioTipoParamFactuListadoCliente;
	}

	public void setIsPermisoPaginacionMedioTipoParamFactuListadoCliente(Boolean isPermisoPaginacionMedioTipoParamFactuListadoCliente) {
		this.isPermisoPaginacionMedioTipoParamFactuListadoCliente = isPermisoPaginacionMedioTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParamFactuListadoCliente() {
		return isPermisoPaginacionTodoTipoParamFactuListadoCliente;
	}

	public void setIsPermisoPaginacionTodoTipoParamFactuListadoCliente(Boolean isPermisoPaginacionTodoTipoParamFactuListadoCliente) {
		this.isPermisoPaginacionTodoTipoParamFactuListadoCliente = isPermisoPaginacionTodoTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParamFactuListadoCliente() {
		return isPermisoPaginacionAltoTipoParamFactuListadoCliente;
	}

	public void setIsPermisoPaginacionAltoTipoParamFactuListadoCliente(Boolean isPermisoPaginacionAltoTipoParamFactuListadoCliente) {
		this.isPermisoPaginacionAltoTipoParamFactuListadoCliente = isPermisoPaginacionAltoTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoCopiarTipoParamFactuListadoCliente() {
		return isPermisoCopiarTipoParamFactuListadoCliente;
	}

	public void setIsPermisoCopiarTipoParamFactuListadoCliente(Boolean isPermisoCopiarTipoParamFactuListadoCliente) {
		this.isPermisoCopiarTipoParamFactuListadoCliente = isPermisoCopiarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoVerFormTipoParamFactuListadoCliente() {
		return isPermisoVerFormTipoParamFactuListadoCliente;
	}

	public void setIsPermisoVerFormTipoParamFactuListadoCliente(Boolean isPermisoVerFormTipoParamFactuListadoCliente) {
		this.isPermisoVerFormTipoParamFactuListadoCliente = isPermisoVerFormTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoDuplicarTipoParamFactuListadoCliente() {
		return isPermisoDuplicarTipoParamFactuListadoCliente;
	}

	public void setIsPermisoDuplicarTipoParamFactuListadoCliente(Boolean isPermisoDuplicarTipoParamFactuListadoCliente) {
		this.isPermisoDuplicarTipoParamFactuListadoCliente = isPermisoDuplicarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsPermisoOrdenTipoParamFactuListadoCliente() {
		return isPermisoOrdenTipoParamFactuListadoCliente;
	}

	public void setIsPermisoOrdenTipoParamFactuListadoCliente(Boolean isPermisoOrdenTipoParamFactuListadoCliente) {
		this.isPermisoOrdenTipoParamFactuListadoCliente = isPermisoOrdenTipoParamFactuListadoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaNuevoTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaNuevoTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaNuevoTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente = isVisibilidadCeldaNuevoTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente = isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaCopiarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaCopiarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaCopiarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente = isVisibilidadCeldaCopiarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaVerFormTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaVerFormTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaVerFormTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente = isVisibilidadCeldaVerFormTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaOrdenTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaOrdenTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaOrdenTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente = isVisibilidadCeldaOrdenTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente = isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaModificarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaModificarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaModificarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente = isVisibilidadCeldaModificarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaActualizarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaActualizarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaActualizarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente = isVisibilidadCeldaActualizarTipoParamFactuListadoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaEliminarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaEliminarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaEliminarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente = isVisibilidadCeldaEliminarTipoParamFactuListadoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaCancelarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaCancelarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaCancelarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente = isVisibilidadCeldaCancelarTipoParamFactuListadoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaGuardarTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaGuardarTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaGuardarTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente = isVisibilidadCeldaGuardarTipoParamFactuListadoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente() {
		return isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente(Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente) {
		this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente = isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente;
	}
		
	public TipoParamFactuListadoClienteSessionBean gettipoparamfactulistadoclienteSessionBean() {
		return this.tipoparamfactulistadoclienteSessionBean;
	}
	
	public void settipoparamfactulistadoclienteSessionBean(TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean) {
		this.tipoparamfactulistadoclienteSessionBean=tipoparamfactulistadoclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoParamFactuListadoCliente tipoparamfactulistadocliente,TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParamFactuListadoCliente(tipoparamfactulistadocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparamfactulistadoclienteAux.setId(tipoparamfactulistadocliente.getId());
		tipoparamfactulistadoclienteAux.setVersionRow(tipoparamfactulistadocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParamFactuListadoCliente();
		
			int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparamfactulistadoclienteValidator.getInvalidValues(this.tipoparamfactulistadocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparamfactulistadoclienteLogic.setDatosCliente(datosCliente);
			tipoparamfactulistadoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparamfactulistadoclienteAux=new  TipoParamFactuListadoCliente();
				
				tipoparamfactulistadoclienteAux.setIsNew(true);
				tipoparamfactulistadoclienteAux.setIsChanged(true);
				
				tipoparamfactulistadoclienteAux.setTipoParamFactuListadoClienteOriginal(this.tipoparamfactulistadocliente);
				
				tipoparamfactulistadoclienteAux.setId(this.tipoparamfactulistadocliente.getId());	
				tipoparamfactulistadoclienteAux.setVersionRow(this.tipoparamfactulistadocliente.getVersionRow());	
				tipoparamfactulistadoclienteAux.setnombre(this.tipoparamfactulistadocliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClientes();//WithConnection
						//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClienteRelaciones(tipoparamfactulistadoclienteAux);//WithConnection
								//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparamfactulistadoclienteAux=new  TipoParamFactuListadoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado() && this.tipoparamfactulistadocliente.getId()>=0)) {
						
					tipoparamfactulistadoclienteAux.setIsNew(false);
				}
				
				tipoparamfactulistadoclienteAux.setIsDeleted(false);
			
				tipoparamfactulistadoclienteAux.setId(this.tipoparamfactulistadocliente.getId());	
				tipoparamfactulistadoclienteAux.setVersionRow(this.tipoparamfactulistadocliente.getVersionRow());	
				tipoparamfactulistadoclienteAux.setnombre(this.tipoparamfactulistadocliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClientes();//WithConnection
						//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClienteRelaciones(tipoparamfactulistadoclienteAux);//WithConnection
								//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactulistadocliente,tipoparamfactulistadoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparamfactulistadoclienteAux=new  TipoParamFactuListadoCliente();
				
				tipoparamfactulistadoclienteAux.setIsNew(false);
				tipoparamfactulistadoclienteAux.setIsChanged(false);
				
				tipoparamfactulistadoclienteAux.setIsDeleted(true);
				
				tipoparamfactulistadoclienteAux.setId(this.tipoparamfactulistadocliente.getId());	
				tipoparamfactulistadoclienteAux.setVersionRow(this.tipoparamfactulistadocliente.getVersionRow());	
				tipoparamfactulistadoclienteAux.setnombre(this.tipoparamfactulistadocliente.getnombre());	
				
				if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparamfactulistadoclienteAux.getId()>=0) {	
						this.tipoparamfactulistadoclientesEliminados.add(tipoparamfactulistadoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClientes();//WithConnection
						//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClienteRelaciones(tipoparamfactulistadoclienteAux);//WithConnection
								//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
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
							if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparamfactulistadoclienteAux,tipoparamfactulistadoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().addAll(this.tipoparamfactulistadoclientesEliminados);
					
					tipoparamfactulistadoclienteLogic.saveTipoParamFactuListadoClientes();//WithConnection
					//tipoparamfactulistadoclienteLogic.getSetVersionRowTipoParamFactuListadoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoparamfactulistadoclientesEliminados= new ArrayList<TipoParamFactuListadoCliente>();		
			}
			
			if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Listado Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparamfactulistadocliente=tipoparamfactulistadoclienteAux;
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
      		//this.finishProcessTipoParamFactuListadoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal) throws Exception {
		
		if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal) throws Exception {	
		if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoParamFactuListadoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparamfactulistadoclienteValidator.getInvalidValues(this.tipoparamfactulistadocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParamFactuListadoCliente tipoparamfactulistadocliente,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes) throws Exception {
		try	{		
			TipoParamFactuListadoClienteConstantesFunciones.actualizarLista(tipoparamfactulistadocliente,tipoparamfactulistadoclientes,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParamFactuListadoCliente tipoparamfactulistadocliente,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes) throws Exception {
		try	{			
			TipoParamFactuListadoClienteConstantesFunciones.actualizarSelectedLista(tipoparamfactulistadocliente,tipoparamfactulistadoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparamfactulistadoclientesLocal=this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparamfactulistadoclientesLocal=this.tipoparamfactulistadoclientes;
			}
			//ARCHITECTURE
		
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal:tipoparamfactulistadoclientesLocal) {
				if(this.permiteMantenimiento(tipoparamfactulistadoclienteLocal) && tipoparamfactulistadoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParamFactuListadoClienteConstantesFunciones.getTipoParamFactuListadoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParamFactuListadoClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jLabelnombreTipoParamFactuListadoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jLabelnombreTipoParamFactuListadoCliente,"");
		
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
		this.iIdNuevoTipoParamFactuListadoCliente--;	
		
		
		this.tipoparamfactulistadoclienteAux=new TipoParamFactuListadoCliente();
		
		this.tipoparamfactulistadoclienteAux.setId(this.iIdNuevoTipoParamFactuListadoCliente);
		this.tipoparamfactulistadoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().add(this.tipoparamfactulistadoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparamfactulistadoclientes.add(this.tipoparamfactulistadoclienteAux);
		}
		//ARCHITECTURE
		
		this.tipoparamfactulistadocliente=this.tipoparamfactulistadoclienteAux;
		
		if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
		}
				
		//this.setDefaultControlesTipoParamFactuListadoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParamFactuListadoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuListadoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuListadoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteBean,this.tipoparamfactulistadocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
			classes=TipoParamFactuListadoClienteConstantesFunciones.getClassesRelationshipsOfTipoParamFactuListadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparamfactulistadoclienteReturnGeneral=tipoparamfactulistadoclienteLogic.procesarEventosTipoParamFactuListadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this.tipoparamfactulistadocliente,this.tipoparamfactulistadoclienteParameterGeneral,this.isEsNuevoTipoParamFactuListadoCliente,classes);//this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral,this.tipoparamfactulistadoclienteBean,false);
		
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente());
		}
		
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente(),classes);//this.tipoparamfactulistadoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParamFactuListadoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParamFactuListadoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.RecargarFormTipoParamFactuListadoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
						
			if(tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();
			}
			
			this.actualizarVisualTableDatosTipoParamFactuListadoCliente();
			
			this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuListadoCliente(), this.getIndiceNuevoTipoParamFactuListadoCliente());
			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
						
			this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParamFactuListadoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setEnabled(isHabilitar && this.tipoparamfactulistadoclienteConstantesFunciones.activarnombreTipoParamFactuListadoCliente);	
		
	};
	
	public void setDefaultControlesTipoParamFactuListadoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParamFactuListadoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(true);			
			this.tipoparamfactulistadoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setVisible(true);
			
					
		} else {
			//this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(false);			
			this.tipoparamfactulistadoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoParamFactuListadoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				if(tipoparamfactulistadoclienteAux.getId().equals(this.iIdNuevoTipoParamFactuListadoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclientes) {
				if(tipoparamfactulistadoclienteAux.getId().equals(this.iIdNuevoTipoParamFactuListadoCliente)) {
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
	
	public int getIndiceActualTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				if(tipoparamfactulistadoclienteAux.getId().equals(tipoparamfactulistadocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclientes) {
				if(tipoparamfactulistadoclienteAux.getId().equals(tipoparamfactulistadocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				if(tipoparamfactulistadoclienteAux.getTipoParamFactuListadoClienteOriginal().getId().equals(tipoparamfactulistadoclienteOriginal.getId())) {
					existe=true;
					tipoparamfactulistadoclienteOriginal.setId(tipoparamfactulistadoclienteAux.getId());
					tipoparamfactulistadoclienteOriginal.setVersionRow(tipoparamfactulistadoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclientes) {
				if(tipoparamfactulistadoclienteAux.getTipoParamFactuListadoClienteOriginal().getId().equals(tipoparamfactulistadoclienteOriginal.getId())) {
					existe=true;
					tipoparamfactulistadoclienteOriginal.setId(tipoparamfactulistadoclienteAux.getId());
					tipoparamfactulistadoclienteOriginal.setVersionRow(tipoparamfactulistadoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParamFactuListadoCliente(Boolean esParaCancelar) throws Exception {
		tipoparamfactulistadoclientesAux=new ArrayList<TipoParamFactuListadoCliente>();
		tipoparamfactulistadoclienteAux=new TipoParamFactuListadoCliente();
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
					if(tipoparamfactulistadoclienteAux.getId()<0) {
						tipoparamfactulistadoclientesAux.add(tipoparamfactulistadoclienteAux);
					}		
				}
				this.iIdNuevoTipoParamFactuListadoCliente=0L;
				this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().removeAll(tipoparamfactulistadoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclientes) {
					if(tipoparamfactulistadoclienteAux.getId()<0) {
						tipoparamfactulistadoclientesAux.add(tipoparamfactulistadoclienteAux);
					}		
				}
				this.iIdNuevoTipoParamFactuListadoCliente=0L;
				this.tipoparamfactulistadoclientes.removeAll(tipoparamfactulistadoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuListadoCliente 
					&& this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()>0
					) {
					tipoparamfactulistadoclienteAux=this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().get(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size() - 1);
				
					if(tipoparamfactulistadoclienteAux.getId()<0) {
						this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().remove(tipoparamfactulistadoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuListadoCliente && this.tipoparamfactulistadoclientes.size()>0) {
					tipoparamfactulistadoclienteAux=this.tipoparamfactulistadoclientes.get(this.tipoparamfactulistadoclientes.size() - 1);
				
					if(tipoparamfactulistadoclienteAux.getId()<0) {
						this.tipoparamfactulistadoclientes.remove(tipoparamfactulistadoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParamFactuListadoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparamfactulistadocliente.getId()<0) {
				this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().remove(this.tipoparamfactulistadocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparamfactulistadocliente.getId()<0) {
				this.tipoparamfactulistadoclientes.remove(this.tipoparamfactulistadocliente);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParamFactuListadoCliente(List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesAux) throws Exception {
		TipoParamFactuListadoClienteConstantesFunciones.setEstadosInicialesTipoParamFactuListadoCliente(tipoparamfactulistadoclientesAux);
	}
	
	public void setEstadosInicialesTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux) throws Exception {
		TipoParamFactuListadoClienteConstantesFunciones.setEstadosInicialesTipoParamFactuListadoCliente(tipoparamfactulistadoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParamFactuListadoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParamFactuListadoClienteActual()) {
				if(!this.isEsNuevoTipoParamFactuListadoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParamFactuListadoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParamFactuListadoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Listado Cliente ?", "MANTENIMIENTO DE Tipo Listado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParamFactuListadoCliente tipoparamfactulistadocliente) throws Exception {
		TipoParamFactuListadoClienteConstantesFunciones.seleccionarAsignar(this.tipoparamfactulistadocliente,tipoparamfactulistadocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParamFactuListadoCliente=this.isPermisoActualizarOriginalTipoParamFactuListadoCliente;
			
			
			this.seleccionarAsignar(tipoparamfactulistadocliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuListadoClienteConstantesFunciones.quitarEspaciosTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparamfactulistadoclienteSessionBean.setsFuncionBusquedaRapida(this.tipoparamfactulistadoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParamFactuListadoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParamFactuListadoCliente(esParaCancelar);				
				this.cancelarNuevoTipoParamFactuListadoCliente(esParaCancelar);								
			}
			
			this.tipoparamfactulistadocliente=new TipoParamFactuListadoCliente();
			
			this.inicializarTipoParamFactuListadoCliente();
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParamFactuListadoCliente() throws Exception {
		try {
			TipoParamFactuListadoClienteConstantesFunciones.inicializarTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParamFactuListadoClientes(String sAccionBusqueda,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParamFactuListadoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParamFactuListadoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParamFactuListadoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParamFactuListadoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Listado Clientes");		
		parameters.put("busquedapor", TipoParamFactuListadoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParamFactuListadoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParamFactuListadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParamFactuListadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParamFactuListadoCliente=new JRBeanArrayDataSource(TipoParamFactuListadoClienteJInternalFrame.TraerTipoParamFactuListadoClienteBeans(tipoparamfactulistadoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParamFactuListadoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParamFactuListadoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParamFactuListadoClienteBean.TraerTipoParamFactuListadoClienteBeans(tipoparamfactulistadoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoClienteActionPerformed(null);
					//this.generarExcelReporteTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParamFactuListadoClientes(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactulistadoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParamFactuListadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuListadoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuListadoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParamFactuListadoCliente tipoparamfactulistadocliente : tipoparamfactulistadoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParamFactuListadoClienteConstantesFunciones.generarExcelReporteDataTipoParamFactuListadoCliente("NORMAL",row,workbook,tipoparamfactulistadocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParamFactuListadoCliente(String sTipo,Row row,Workbook workbook) {
		
		TipoParamFactuListadoClienteConstantesFunciones.generarExcelReporteHeaderTipoParamFactuListadoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParamFactuListadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuListadoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParamFactuListadoCliente tipoparamfactulistadocliente : tipoparamfactulistadoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.getTipoParamFactuListadoClienteDescripcion(tipoparamfactulistadocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparamfactulistadocliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParamFactuListadoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesRespaldo=null;
		
		classes=TipoParamFactuListadoClienteConstantesFunciones.getClassesRelationshipsOfTipoParamFactuListadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparamfactulistadoclienteLogic.setDatosCliente(this.datosCliente);
		this.tipoparamfactulistadoclienteLogic.setDatosDeep(this.datosDeep);
		this.tipoparamfactulistadoclienteLogic.setIsConDeep(true);
		
		tipoparamfactulistadoclientesRespaldo=this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes();
		
		this.tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(tipoparamfactulistadoclientesParaReportes);	
		this.tipoparamfactulistadoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparamfactulistadoclientesParaReportes=this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes();
		this.tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(tipoparamfactulistadoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuListadoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuListadoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParamFactuListadoCliente tipoparamfactulistadocliente : tipoparamfactulistadoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParamFactuListadoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParamFactuListadoClienteConstantesFunciones.generarExcelReporteDataTipoParamFactuListadoCliente("NORMAL",row,workbook,tipoparamfactulistadocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.getTipoParamFactuListadoClienteDescripcion(tipoparamfactulistadocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParamFactuListadoCliente() throws Exception {		
		this.startProcessTipoParamFactuListadoCliente(true);
	}
	
	public void startProcessTipoParamFactuListadoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoParamFactuListadoCliente ,this.jPanelParametrosReportesTipoParamFactuListadoCliente, this.jScrollPanelDatosTipoParamFactuListadoCliente,this.jPanelPaginacionTipoParamFactuListadoCliente, this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente, this.jPanelAccionesTipoParamFactuListadoCliente,this.jPanelAccionesFormularioTipoParamFactuListadoCliente,this.jmenuBarTipoParamFactuListadoCliente,this.jmenuBarDetalleTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuListadoCliente=this.jTabbedPaneBusquedasTipoParamFactuListadoCliente; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuListadoCliente=this.jPanelParametrosReportesTipoParamFactuListadoCliente;
		//final JScrollPane jScrollPanelDatosTipoParamFactuListadoCliente=this.jScrollPanelDatosTipoParamFactuListadoCliente;
		final JTable jTableDatosTipoParamFactuListadoCliente=this.jTableDatosTipoParamFactuListadoCliente;		
		final JPanel jPanelPaginacionTipoParamFactuListadoCliente=this.jPanelPaginacionTipoParamFactuListadoCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuListadoCliente=this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente;
		final JPanel jPanelAccionesTipoParamFactuListadoCliente=this.jPanelAccionesTipoParamFactuListadoCliente;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuListadoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			jPanelCamposAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelCamposTipoParamFactuListadoCliente;
			jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelAccionesFormularioTipoParamFactuListadoCliente;
		}
		
		final JPanel jPanelCamposTipoParamFactuListadoCliente=jPanelCamposAuxiliarTipoParamFactuListadoCliente;
		final JPanel jPanelAccionesFormularioTipoParamFactuListadoCliente=jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente;
		
		
		final JMenuBar jmenuBarTipoParamFactuListadoCliente=this.jmenuBarTipoParamFactuListadoCliente;
		final JToolBar jTtoolBarTipoParamFactuListadoCliente=this.jTtoolBarTipoParamFactuListadoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jmenuBarDetalleTipoParamFactuListadoCliente;
			jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTtoolBarDetalleTipoParamFactuListadoCliente;
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuListadoCliente=jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente;
		final JToolBar jTtoolBarDetalleTipoParamFactuListadoCliente=jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuListadoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuListadoCliente;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuListadoCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuListadoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuListadoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuListadoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuListadoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuListadoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuListadoCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuListadoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuListadoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuListadoCliente ,jPanelParametrosReportesTipoParamFactuListadoCliente,jTableDatosTipoParamFactuListadoCliente, /*jScrollPanelDatosTipoParamFactuListadoCliente,*/jPanelCamposTipoParamFactuListadoCliente,jPanelPaginacionTipoParamFactuListadoCliente, /*jScrollPanelDatosEdicionTipoParamFactuListadoCliente,*/ jPanelAccionesTipoParamFactuListadoCliente,jPanelAccionesFormularioTipoParamFactuListadoCliente,jmenuBarTipoParamFactuListadoCliente,jmenuBarDetalleTipoParamFactuListadoCliente,jTtoolBarTipoParamFactuListadoCliente,jTtoolBarDetalleTipoParamFactuListadoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuListadoCliente ,jPanelParametrosReportesTipoParamFactuListadoCliente, jScrollPanelDatosTipoParamFactuListadoCliente,jPanelPaginacionTipoParamFactuListadoCliente, jScrollPanelDatosEdicionTipoParamFactuListadoCliente, jPanelAccionesTipoParamFactuListadoCliente,jPanelAccionesFormularioTipoParamFactuListadoCliente,jmenuBarTipoParamFactuListadoCliente,jmenuBarDetalleTipoParamFactuListadoCliente,jTtoolBarTipoParamFactuListadoCliente,jTtoolBarDetalleTipoParamFactuListadoCliente);
						
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
	
	public void finishProcessTipoParamFactuListadoCliente() {// throws Exception 
		this.finishProcessTipoParamFactuListadoCliente(true);
	}
	
	public void finishProcessTipoParamFactuListadoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoParamFactuListadoCliente ,this.jPanelParametrosReportesTipoParamFactuListadoCliente, this.jScrollPanelDatosTipoParamFactuListadoCliente,this.jPanelPaginacionTipoParamFactuListadoCliente, this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente, this.jPanelAccionesTipoParamFactuListadoCliente,this.jPanelAccionesFormularioTipoParamFactuListadoCliente,this.jmenuBarTipoParamFactuListadoCliente,this.jmenuBarDetalleTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuListadoCliente=this.jTabbedPaneBusquedasTipoParamFactuListadoCliente; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuListadoCliente=this.jPanelParametrosReportesTipoParamFactuListadoCliente;
		//final JScrollPane jScrollPanelDatosTipoParamFactuListadoCliente=this.jScrollPanelDatosTipoParamFactuListadoCliente;
		final JTable jTableDatosTipoParamFactuListadoCliente=this.jTableDatosTipoParamFactuListadoCliente;		
		final JPanel jPanelPaginacionTipoParamFactuListadoCliente=this.jPanelPaginacionTipoParamFactuListadoCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuListadoCliente=this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente;
		final JPanel jPanelAccionesTipoParamFactuListadoCliente=this.jPanelAccionesTipoParamFactuListadoCliente;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuListadoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			jPanelCamposAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelCamposTipoParamFactuListadoCliente;
			jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelAccionesFormularioTipoParamFactuListadoCliente;
		}
		
		final JPanel jPanelCamposTipoParamFactuListadoCliente=jPanelCamposAuxiliarTipoParamFactuListadoCliente;
		final JPanel jPanelAccionesFormularioTipoParamFactuListadoCliente=jPanelAccionesFormularioAuxiliarTipoParamFactuListadoCliente;
		
		
		final JMenuBar jmenuBarTipoParamFactuListadoCliente=this.jmenuBarTipoParamFactuListadoCliente;		
		final JToolBar jTtoolBarTipoParamFactuListadoCliente=this.jTtoolBarTipoParamFactuListadoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jmenuBarDetalleTipoParamFactuListadoCliente;
			jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTtoolBarDetalleTipoParamFactuListadoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuListadoCliente=jmenuBarDetalleAuxiliarTipoParamFactuListadoCliente;
		final JToolBar jTtoolBarDetalleTipoParamFactuListadoCliente=jTtoolBarDetalleAuxiliarTipoParamFactuListadoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuListadoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuListadoCliente;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuListadoCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuListadoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuListadoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuListadoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuListadoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuListadoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuListadoCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuListadoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuListadoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParamFactuListadoCliente ,jPanelParametrosReportesTipoParamFactuListadoCliente, jTableDatosTipoParamFactuListadoCliente,/*jScrollPanelDatosTipoParamFactuListadoCliente,*/jPanelCamposTipoParamFactuListadoCliente,jPanelPaginacionTipoParamFactuListadoCliente, /*jScrollPanelDatosEdicionTipoParamFactuListadoCliente,*/ jPanelAccionesTipoParamFactuListadoCliente,jPanelAccionesFormularioTipoParamFactuListadoCliente,jmenuBarTipoParamFactuListadoCliente,jmenuBarDetalleTipoParamFactuListadoCliente,jTtoolBarTipoParamFactuListadoCliente,jTtoolBarDetalleTipoParamFactuListadoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParamFactuListadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParamFactuListadoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParamFactuListadoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParamFactuListadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParamFactuListadoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParamFactuListadoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParamFactuListadoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParamFactuListadoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParamFactuListadoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparamfactulistadoclienteConstantesFunciones.getsFinalQueryTipoParamFactuListadoCliente();
		String  finalQueryPaginacionTodos=this.tipoparamfactulistadoclienteConstantesFunciones.getsFinalQueryTipoParamFactuListadoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParamFactuListadoClienteConstantesFunciones.getArrayColumnasGlobalesNoTipoParamFactuListadoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParamFactuListadoClienteConstantesFunciones.getArrayColumnasGlobalesTipoParamFactuListadoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParamFactuListadoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparamfactulistadoclientesEliminados= new ArrayList<TipoParamFactuListadoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParamFactuListadoCliente();
		
				///*TipoParamFactuListadoClienteSessionBean*/this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
			
			if(this.tipoparamfactulistadoclienteSessionBean==null) {
				this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
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
					this.iNumeroPaginacion=TipoParamFactuListadoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParamFactuListadoClienteConstantesFunciones.getClassesForeignKeysOfTipoParamFactuListadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparamfactulistadocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparamfactulistadoclientesAux= new ArrayList<TipoParamFactuListadoCliente>();
			
				
			tipoparamfactulistadoclienteLogic.setDatosCliente(this.datosCliente);
			tipoparamfactulistadoclienteLogic.setDatosDeep(this.datosDeep);
			tipoparamfactulistadoclienteLogic.setIsConDeep(true);
			
			
			tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparamfactulistadoclienteLogic.getTodosTipoParamFactuListadoClientes(finalQueryGlobal,pagination);
					
					//tipoparamfactulistadoclienteLogic.getTodosTipoParamFactuListadoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()==null|| tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactulistadoclientesAux= new ArrayList<TipoParamFactuListadoCliente>();
							tipoparamfactulistadoclientesAux.addAll(tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactulistadoclientesAux= new ArrayList<TipoParamFactuListadoCliente>();
							tipoparamfactulistadoclientesAux.addAll(tipoparamfactulistadoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactulistadoclienteLogic.getTodosTipoParamFactuListadoClientes(finalQueryGlobal+"",this.pagination);												
							
							//tipoparamfactulistadoclienteLogic.getTodosTipoParamFactuListadoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(new ArrayList<TipoParamFactuListadoCliente>());					
							tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().addAll(tipoparamfactulistadoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactulistadoclientes=new ArrayList<TipoParamFactuListadoCliente>();
							tipoparamfactulistadoclientes.addAll(tipoparamfactulistadoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParamFactuListadoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParamFactuListadoCliente=this.idActual;
				
				} else if(this.idTipoParamFactuListadoClienteActual!=null && this.idTipoParamFactuListadoClienteActual!=0L) {
					idTipoParamFactuListadoCliente=idTipoParamFactuListadoClienteActual;
				}
				
					
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndicePorId(idTipoParamFactuListadoCliente);
				
				this.tipoparamfactulistadoclientes=new ArrayList<TipoParamFactuListadoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparamfactulistadoclienteLogic.getEntity(idTipoParamFactuListadoCliente);
					
					//tipoparamfactulistadoclienteLogic.getEntityWithConnection(idTipoParamFactuListadoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(new ArrayList<TipoParamFactuListadoCliente>());
					tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().add(tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactulistadoclientes=new ArrayList<TipoParamFactuListadoCliente>();
					this.tipoparamfactulistadoclientes.add(tipoparamfactulistadocliente);
				}
				
				if(tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()==null||tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoparamfactulistadoclientes==null|| tipoparamfactulistadoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclientesAux=new ArrayList<TipoParamFactuListadoCliente>();
						tipoparamfactulistadoclientesAux.addAll(tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactulistadoclientesAux=new ArrayList<TipoParamFactuListadoCliente>();
							tipoparamfactulistadoclientesAux.addAll(tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuListadoClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoParamFactuListadoClientes("BusquedaPorNombre",tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoParamFactuListadoClientes("BusquedaPorNombre",tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(new ArrayList<TipoParamFactuListadoCliente>());
						tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().addAll(tipoparamfactulistadoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactulistadoclientes=new ArrayList<TipoParamFactuListadoCliente>();
							tipoparamfactulistadoclientes.addAll(tipoparamfactulistadoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParamFactuListadoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParamFactuListadoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactulistadoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactulistadoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParamFactuListadoCliente tipoparamfactulistadocliente) {
		Boolean permite=true;
		
		if(this.tipoparamfactulistadocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParamFactuListadoClienteConstantesFunciones.getOrderByListaTipoParamFactuListadoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParamFactuListadoClienteConstantesFunciones.getOrderByListaTipoParamFactuListadoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				if(tipoparamfactulistadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactulistadoclienteTotales=tipoparamfactulistadocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:this.tipoparamfactulistadoclientes) {
				if(tipoparamfactulistadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactulistadoclienteTotales=tipoparamfactulistadocliente;
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
			this.tipoparamfactulistadoclienteAux=new TipoParamFactuListadoCliente();
			this.tipoparamfactulistadoclienteAux.setsType(Constantes2.S_TOTALES);
			this.tipoparamfactulistadoclienteAux.setIsNew(false);
			this.tipoparamfactulistadoclienteAux.setIsChanged(false);
			this.tipoparamfactulistadoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParamFactuListadoClienteConstantesFunciones.TotalizarValoresFilaTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this.tipoparamfactulistadoclienteAux);
				
				this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().add(this.tipoparamfactulistadoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParamFactuListadoClienteConstantesFunciones.TotalizarValoresFilaTipoParamFactuListadoCliente(this.tipoparamfactulistadoclientes,this.tipoparamfactulistadoclienteAux);
				
				this.tipoparamfactulistadoclientes.add(this.tipoparamfactulistadoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparamfactulistadoclienteTotales=new TipoParamFactuListadoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().remove(tipoparamfactulistadoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactulistadoclientes.remove(tipoparamfactulistadoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparamfactulistadoclienteTotales=new TipoParamFactuListadoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				if(tipoparamfactulistadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactulistadoclienteTotales=tipoparamfactulistadocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuListadoClienteConstantesFunciones.TotalizarValoresFilaTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),tipoparamfactulistadoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:this.tipoparamfactulistadoclientes) {
				if(tipoparamfactulistadocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactulistadoclienteTotales=tipoparamfactulistadocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuListadoClienteConstantesFunciones.TotalizarValoresFilaTipoParamFactuListadoCliente(this.tipoparamfactulistadoclientes,tipoparamfactulistadoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoParamFactuListadoClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoParamFactuListadoClientePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoParamFactuListadoClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoParamFactuListadoClientePorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientePorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoParamFactuListadoCliente() {
		this.isPermisoTodoTipoParamFactuListadoCliente=false;
		this.isPermisoNuevoTipoParamFactuListadoCliente=false;
		this.isPermisoActualizarTipoParamFactuListadoCliente=false;
		this.isPermisoActualizarOriginalTipoParamFactuListadoCliente=false;
		this.isPermisoEliminarTipoParamFactuListadoCliente=false;
		this.isPermisoGuardarCambiosTipoParamFactuListadoCliente=false;
		this.isPermisoConsultaTipoParamFactuListadoCliente=false;
		this.isPermisoBusquedaTipoParamFactuListadoCliente=false;
		this.isPermisoReporteTipoParamFactuListadoCliente=false;		
		this.isPermisoOrdenTipoParamFactuListadoCliente=false;		
		this.isPermisoPaginacionMedioTipoParamFactuListadoCliente=false;		
		this.isPermisoPaginacionAltoTipoParamFactuListadoCliente=false;
		this.isPermisoPaginacionTodoTipoParamFactuListadoCliente=false;
		this.isPermisoCopiarTipoParamFactuListadoCliente=false;		
		this.isPermisoVerFormTipoParamFactuListadoCliente=false;		
		this.isPermisoDuplicarTipoParamFactuListadoCliente=false;		
		this.isPermisoOrdenTipoParamFactuListadoCliente=false;		
	}
	
	public void setPermisosUsuarioTipoParamFactuListadoCliente(Boolean isPermiso) {
		this.isPermisoTodoTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoNuevoTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoActualizarTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoEliminarTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoConsultaTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoBusquedaTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoReporteTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoOrdenTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoPaginacionMedioTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoPaginacionAltoTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoPaginacionTodoTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoCopiarTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoVerFormTipoParamFactuListadoCliente=isPermiso;		
		this.isPermisoDuplicarTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoOrdenTipoParamFactuListadoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParamFactuListadoCliente(Boolean isPermiso) {
		//this.isPermisoTodoTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoNuevoTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoActualizarTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoEliminarTipoParamFactuListadoCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuListadoCliente=isPermiso;
		//this.isPermisoConsultaTipoParamFactuListadoCliente=isPermiso;
		//this.isPermisoBusquedaTipoParamFactuListadoCliente=isPermiso;
		//this.isPermisoReporteTipoParamFactuListadoCliente=isPermiso;
		//this.isPermisoOrdenTipoParamFactuListadoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParamFactuListadoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParamFactuListadoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParamFactuListadoCliente=isPermiso;		
		//this.isPermisoCopiarTipoParamFactuListadoCliente=isPermiso;		
		//this.isPermisoDuplicarTipoParamFactuListadoCliente=isPermiso;
		//this.isPermisoOrdenTipoParamFactuListadoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuListadoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoParamFactuListadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParamFactuListadoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuListadoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParamFactuListadoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParamFactuListadoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParamFactuListadoClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoParamFactuListadoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParamFactuListadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParamFactuListadoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParamFactuListadoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParamFactuListadoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParamFactuListadoCliente=this.isPermisoActualizarTipoParamFactuListadoCliente;
			this.isPermisoEliminarTipoParamFactuListadoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParamFactuListadoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParamFactuListadoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParamFactuListadoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParamFactuListadoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParamFactuListadoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuListadoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParamFactuListadoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParamFactuListadoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParamFactuListadoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParamFactuListadoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParamFactuListadoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParamFactuListadoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuListadoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParamFactuListadoCliente.setToolTipText(this.jTableDatosTipoParamFactuListadoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParamFactuListadoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParamFactuListadoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParamFactuListadoCliente() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoParamFactuListadoClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParamFactuListadoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParamFactuListadoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParamFactuListadoClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoParamFactuListadoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParamFactuListadoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoParamFactuListadoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParamFactuListadoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParamFactuListadoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuListadoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParamFactuListadoCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuListadoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParamFactuListadoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParamFactuListadoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParamFactuListadoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParamFactuListadoCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParamFactuListadoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParamFactuListadoCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoParamFactuListadoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParamFactuListadoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParamFactuListadoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean(); 
		this.tipoparamfactulistadoclienteConstantesFunciones=new TipoParamFactuListadoClienteConstantesFunciones(); 
		this.tipoparamfactulistadoclienteBean=new TipoParamFactuListadoCliente();//(this.tipoparamfactulistadoclienteConstantesFunciones); 		
		this.tipoparamfactulistadoclienteReturnGeneral=new TipoParamFactuListadoClienteParameterReturnGeneral(); 
		
		this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactulistadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParamFactuListadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParamFactuListadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParamFactuListadoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParamFactuListadoCliente(true);
			
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
			
			this.tipoparamfactulistadoclienteConstantesFunciones=new TipoParamFactuListadoClienteConstantesFunciones(); 
			this.tipoparamfactulistadoclienteBean=new TipoParamFactuListadoCliente();//this.tipoparamfactulistadoclienteConstantesFunciones); 			
			this.tipoparamfactulistadoclienteReturnGeneral=new TipoParamFactuListadoClienteParameterReturnGeneral(); 
		
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Listado Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparamfactulistadocliente=new TipoParamFactuListadoCliente();
			this.tipoparamfactulistadoclientes = new ArrayList<TipoParamFactuListadoCliente>();
			this.tipoparamfactulistadoclientesAux = new ArrayList<TipoParamFactuListadoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic=new TipoParamFactuListadoClienteLogic();
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparamfactulistadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente);	
					}
					
					if(this.jInternalFrameImportacionTipoParamFactuListadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuListadoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParamFactuListadoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParamFactuListadoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente);
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setVisible(false);
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente);
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParamFactuListadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuListadoCliente);
					this.jInternalFrameImportacionTipoParamFactuListadoCliente.setVisible(false);
					this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParamFactuListadoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuListadoCliente);
					this.jInternalFrameOrderByTipoParamFactuListadoCliente.setVisible(false);
					this.jInternalFrameOrderByTipoParamFactuListadoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParamFactuListadoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParamFactuListadoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparamfactulistadoclienteReturnGeneral=new TipoParamFactuListadoClienteParameterReturnGeneral();
			
			this.tipoparamfactulistadoclienteParameterGeneral=new TipoParamFactuListadoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparamfactulistadoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuListadoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado(),this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuListadoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado(),this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParamFactuListadoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParamFactuListadoCliente(false);
			
			this.setPermisosUsuarioTipoParamFactuListadoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado() && this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParamFactuListadoClienteClasesRelacionadas();
			}
			
			if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParamFactuListadoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParamFactuListadoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuListadoCliente();
			}
			
			if(!this.isPermisoBusquedaTipoParamFactuListadoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParamFactuListadoCliente,this.isPermisoPaginacionMedioTipoParamFactuListadoCliente,this.isPermisoPaginacionTodoTipoParamFactuListadoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParamFactuListadoClienteConstantesFunciones.getTiposSeleccionarTipoParamFactuListadoCliente());
				
				this.tiposColumnasSelect=TipoParamFactuListadoClienteConstantesFunciones.getTiposSeleccionarTipoParamFactuListadoCliente(true);
				
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
			//if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParamFactuListadoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoParamFactuListadoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoParamFactuListadoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuListadoCliente() ;
			
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
				tipoparamfactulistadoclienteImplementable= (TipoParamFactuListadoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuListadoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparamfactulistadoclienteImplementableHome= (TipoParamFactuListadoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuListadoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparamfactulistadoclientes= new ArrayList<TipoParamFactuListadoCliente>();
			this.tipoparamfactulistadoclientesEliminados= new ArrayList<TipoParamFactuListadoCliente>();
						
			this.isEsNuevoTipoParamFactuListadoCliente=false;
			this.esParaAccionDesdeFormularioTipoParamFactuListadoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParamFactuListadoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParamFactuListadoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParamFactuListadoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParamFactuListadoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParamFactuListadoCliente();
			}
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParamFactuListadoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParamFactuListadoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParamFactuListadoCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParamFactuListadoCliente")) {
				iIndex=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParamFactuListadoCliente();	
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
	
	public void cargarCombosForeignKeyTipoParamFactuListadoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParamFactuListadoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParamFactuListadoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParamFactuListadoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParamFactuListadoCliente();
		
		this.cargarCombosFrameForeignKeyTipoParamFactuListadoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParamFactuListadoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParamFactuListadoCliente();
		}
	}
	
	
	
	public void jButtonNuevoTipoParamFactuListadoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			
			if(jTableDatosTipoParamFactuListadoCliente.getRowCount()>=1) {
				jTableDatosTipoParamFactuListadoCliente.removeRowSelectionInterval(0, jTableDatosTipoParamFactuListadoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParamFactuListadoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuListadoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(true);			
			//this.tipoparamfactulistadocliente=new TipoParamFactuListadoCliente();
			//this.tipoparamfactulistadocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente() ;
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuListadoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparamfactulistadocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);				
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParamFactuListadoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRows().length;			
			}
			
			tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParamFactuListadoCliente--;			
				//TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux= new TipoParamFactuListadoCliente();			
				//tipoparamfactulistadoclienteAux.setId(this.iIdNuevoTipoParamFactuListadoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParamFactuListadoCliente tipoparamfactulistadoclienteOrigen=new TipoParamFactuListadoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteOrigen : tipoparamfactulistadoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparamfactulistadoclienteOrigen =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactulistadoclienteOrigen =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParamFactuListadoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparamfactulistadocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParamFactuListadoCliente(tipoparamfactulistadoclienteOrigen,this.tipoparamfactulistadocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().add(this.tipoparamfactulistadoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactulistadoclientes.add(this.tipoparamfactulistadoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
				
				this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuListadoCliente(), this.getIndiceNuevoTipoParamFactuListadoCliente());
				
				int iLastRow =  this.jTableDatosTipoParamFactuListadoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuListadoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuListadoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();									
		
			TipoParamFactuListadoCliente tipoparamfactulistadoclienteOrigen=new TipoParamFactuListadoCliente();
			TipoParamFactuListadoCliente tipoparamfactulistadoclienteDestino=new TipoParamFactuListadoCliente();
				
			tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparamfactulistadoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParamFactuListadoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteOrigen =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactulistadoclienteOrigen =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactulistadoclienteDestino =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactulistadoclienteDestino =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparamfactulistadoclienteOrigen =tipoparamfactulistadoclientesSeleccionados.get(0);
				tipoparamfactulistadoclienteDestino =tipoparamfactulistadoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParamFactuListadoCliente(tipoparamfactulistadoclienteOrigen,tipoparamfactulistadoclienteDestino,true,false);
				
				tipoparamfactulistadoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactulistadoclienteDestino,tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactulistadoclienteDestino,tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
				
				//this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuListadoCliente(), this.getIndiceNuevoTipoParamFactuListadoCliente());
				
				int iLastRow =  this.jTableDatosTipoParamFactuListadoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuListadoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuListadoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParamFactuListadoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(!isVisible);
			this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(!isVisible);
			this.jPanelAccionesTipoParamFactuListadoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParamFactuListadoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParamFactuListadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParamFactuListadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParamFactuListadoCliente();
			
			this.abrirFrameOrderByTipoParamFactuListadoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParamFactuListadoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParamFactuListadoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuListadoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSize(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.iWidthFormulario,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jContentPaneDetalleTipoParamFactuListadoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jContentPaneDetalleTipoParamFactuListadoCliente.getWidth(),TipoParamFactuListadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jContentPaneDetalleTipoParamFactuListadoCliente.getWidth(),TipoParamFactuListadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jContentPaneDetalleTipoParamFactuListadoCliente.getWidth(),TipoParamFactuListadoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParamFactuListadoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParamFactuListadoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParamFactuListadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuListadoCliente,false,this);
				} else {
					this.jInternalFrameOrderByTipoParamFactuListadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuListadoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuListadoCliente);
				this.jInternalFrameOrderByTipoParamFactuListadoCliente.setVisible(false);
				this.jInternalFrameOrderByTipoParamFactuListadoCliente.setSelected(false);
				
				this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuListadoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuListadoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParamFactuListadoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParamFactuListadoCliente==null) {
				
				this.jInternalFrameImportacionTipoParamFactuListadoCliente=new ImportacionJInternalFrame(TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuListadoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuListadoCliente);
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.setVisible(false);
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSelected(false);


				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuListadoCliente"));
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuListadoCliente"));
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuListadoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParamFactuListadoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente==null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente=new ReporteDinamicoJInternalFrame(TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente);
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuListadoCliente"));
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuListadoCliente"));
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuListadoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuListadoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoParamFactuListadoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuListadoCliente);
			
	       	this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.dispose();
			//this.jInternalFrameDetalleFormTipoParamFactuListadoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParamFactuListadoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParamFactuListadoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParamFactuListadoCliente.setVisible(true);
	        this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParamFactuListadoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setVisible(true);
	        this.jInternalFrameOrderByTipoParamFactuListadoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParamFactuListadoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setVisible(false);
	        this.jInternalFrameOrderByTipoParamFactuListadoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParamFactuListadoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParamFactuListadoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParamFactuListadoCliente.setVisible(false);
	        this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParamFactuListadoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParamFactuListadoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(true);
			//this.isEsNuevoTipoParamFactuListadoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false) ;
			
			if(tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuListadoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParamFactuListadoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParamFactuListadoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(true);
			//this.isEsNuevoTipoParamFactuListadoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparamfactulistadocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false) ;
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuListadoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuListadoCliente(false);
			
			//if(!this.isEsNuevoTipoParamFactuListadoCliente) {								
				int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParamFactuListadoCliente=true;
					this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
					this.isEsNuevoTipoParamFactuListadoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParamFactuListadoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParamFactuListadoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(false);
			
												
				
				if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParamFactuListadoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparamfactulistadocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactulistadocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactulistadocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParamFactuListadoClienteModel) this.jTableDatosTipoParamFactuListadoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParamFactuListadoCliente=true;
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
				this.isEsNuevoTipoParamFactuListadoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(false);
				
				
				
				if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParamFactuListadoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParamFactuListadoCliente.getRowCount()>=1) {
				jTableDatosTipoParamFactuListadoCliente.removeRowSelectionInterval(0, jTableDatosTipoParamFactuListadoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParamFactuListadoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(false) ;
			
			this.isEsNuevoTipoParamFactuListadoCliente=false;
			
			if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParamFactuListadoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
				
				//SI ES MANUAL
				if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParamFactuListadoCliente--;			
			//TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux= new TipoParamFactuListadoCliente();			
			//tipoparamfactulistadoclienteAux.setId(this.iIdNuevoTipoParamFactuListadoCliente);
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParamFactuListadoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
			
			this.tipoparamfactulistadocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().add(this.tipoparamfactulistadoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparamfactulistadoclientes.add(this.tipoparamfactulistadoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			
			this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuListadoCliente(), this.getIndiceNuevoTipoParamFactuListadoCliente());
			
			int iLastRow =  this.jTableDatosTipoParamFactuListadoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParamFactuListadoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParamFactuListadoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
			
			//SI ES MANUAL
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();
			}
			
			//this.abrirFrameTreeTipoParamFactuListadoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Listado ClienteS ?", "MANTENIMIENTO DE Tipo Listado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParamFactuListadoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParamFactuListadoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparamfactulistadoclienteReturnGeneral=tipoparamfactulistadoclienteLogic.procesarImportacionTipoParamFactuListadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparamfactulistadoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParamFactuListadoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParamFactuListadoCliente.setFileImportacion(this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParamFactuListadoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParamFactuListadoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		

		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParamFactuListadoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParamFactuListadoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParamFactuListadoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:tipoparamfactulistadoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparamfactulistadocliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoParamFactuListadoCliente(row);				
			//	iRow++;
			//}				
			
			//for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParamFactuListadoCliente(tipoparamfactulistadoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
			
			//SI ES MANUAL
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
			
			//SI ES MANUAL
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
			
			//SI ES MANUAL
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuListadoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParamFactuListadoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParamFactuListadoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParamFactuListadoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParamFactuListadoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParamFactuListadoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParamFactuListadoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParamFactuListadoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParamFactuListadoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParamFactuListadoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParamFactuListadoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParamFactuListadoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParamFactuListadoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuListadoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuListadoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParamFactuListadoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente();
		
		this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuListadoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuListadoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuListadoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuListadoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParamFactuListadoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuListadoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuListadoCliente() throws Exception {
		try	{
			if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuListadoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuListadoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuListadoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuListadoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuListadoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParamFactuListadoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParamFactuListadoCliente(Boolean esInicializar) throws Exception {				
		if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuListadoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParamFactuListadoCliente() throws Exception {
		this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParamFactuListadoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParamFactuListadoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParamFactuListadoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparamfactulistadoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParamFactuListadoCliente.setModel(new TipoParamFactuListadoClienteModel(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParamFactuListadoCliente.setModel(new TipoParamFactuListadoClienteModel(this.tipoparamfactulistadoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParamFactuListadoCliente!=null && this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuListadoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,tipoparamfactulistadoclienteConstantesFunciones.resaltarSeleccionarTipoParamFactuListadoCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,tipoparamfactulistadoclienteConstantesFunciones.resaltarSeleccionarTipoParamFactuListadoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoCliente,TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID));

		if(this.tipoparamfactulistadoclienteConstantesFunciones.mostraridTipoParamFactuListadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparamfactulistadoclienteConstantesFunciones.resaltaridTipoParamFactuListadoCliente,this.tipoparamfactulistadoclienteConstantesFunciones.activaridTipoParamFactuListadoCliente,this,true,"idTipoParamFactuListadoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactulistadoclienteConstantesFunciones.resaltaridTipoParamFactuListadoCliente,this.tipoparamfactulistadoclienteConstantesFunciones.activaridTipoParamFactuListadoCliente,this,true,"idTipoParamFactuListadoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoCliente,TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparamfactulistadoclienteConstantesFunciones.mostrarnombreTipoParamFactuListadoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarnombreTipoParamFactuListadoCliente,this.tipoparamfactulistadoclienteConstantesFunciones.activarnombreTipoParamFactuListadoCliente,this,true,"nombreTipoParamFactuListadoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarnombreTipoParamFactuListadoCliente,this.tipoparamfactulistadoclienteConstantesFunciones.activarnombreTipoParamFactuListadoCliente,this,true,"nombreTipoParamFactuListadoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoParamFactuListadoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuListadoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuListadoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParamFactuListadoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParamFactuListadoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParamFactuListadoCliente.moveColumn(this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParamFactuListadoCliente.moveColumn(this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParamFactuListadoCliente.moveColumn(this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParamFactuListadoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParamFactuListadoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParamFactuListadoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParamFactuListadoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParamFactuListadoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParamFactuListadoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparamfactulistadoclientes.size()-1;
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
		//this.jTableDatosTipoParamFactuListadoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParamFactuListadoCliente();
			
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
				
				//this.isEsNuevoTipoParamFactuListadoCliente=false;
					
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
				if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuListadoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparamfactulistadocliente.getsType().equals("DUPLICADO")
				   || this.tipoparamfactulistadocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParamFactuListadoCliente=true;
				
				} else {
					this.isEsNuevoTipoParamFactuListadoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparamfactulistadocliente.getId()>=0 && !this.tipoparamfactulistadocliente.getIsNew()) {						
						this.isEsNuevoTipoParamFactuListadoCliente=false;
						
					} else {
						this.isEsNuevoTipoParamFactuListadoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuListadoCliente(esRelaciones);						
				
				this.seleccionarTipoParamFactuListadoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparamfactulistadocliente.getId()<0) {
					this.isEsNuevoTipoParamFactuListadoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParamFactuListadoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParamFactuListadoCliente(evt,rowIndex);
				}	
				
				if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParamFactuListadoCliente: " + this.dDif); 
					}
				}								
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParamFactuListadoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {
					if(this.tipoparamfactulistadocliente.getId()>0) {
						this.tipoparamfactulistadocliente.setIsDeleted(true);
						
						this.tipoparamfactulistadoclientesEliminados.add(this.tipoparamfactulistadocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().remove(this.tipoparamfactulistadocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactulistadoclientes.remove(this.tipoparamfactulistadocliente);				
					}
					
					
					((TipoParamFactuListadoClienteModel) this.jTableDatosTipoParamFactuListadoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParamFactuListadoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParamFactuListadoCliente) {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuListadoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParamFactuListadoCliente(tipoparamfactulistadocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(tipoparamfactulistadocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParamFactuListadoCliente(tipoparamfactulistadocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuListadoCliente(tipoparamfactulistadocliente);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setText(tipoparamfactulistadocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setText(tipoparamfactulistadocliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparamfactulistadoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparamfactulistadoclienteLocal=this.tipoparamfactulistadocliente;
			} else {
				tipoparamfactulistadoclienteLocal=this.tipoparamfactulistadoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparamfactulistadoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParamFactuListadoCliente(tipoparamfactulistadoclienteLocal,true);
					
					if(tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparamfactulistadoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparamfactulistadoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(tipoparamfactulistadocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(tipoparamfactulistadocliente);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(tipoparamfactulistadocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.getText()==null || this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.getText()=="" || this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setText("0");
			}

			if(conColumnasBase) {tipoparamfactulistadocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jLabelIdTipoParamFactuListadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparamfactulistadocliente.setnombre(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jLabelnombreTipoParamFactuListadoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadoclienteBean,TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadoclienteOrigen,TipoParamFactuListadoCliente tipoparamfactulistadocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactulistadoclienteOrigen.getId()!=null && !tipoparamfactulistadoclienteOrigen.getId().equals(0L))) {tipoparamfactulistadocliente.setId(tipoparamfactulistadoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparamfactulistadoclienteOrigen.getnombre()!=null && !tipoparamfactulistadoclienteOrigen.getnombre().equals(""))) {tipoparamfactulistadocliente.setnombre(tipoparamfactulistadoclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setText(tipoparamfactulistadocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setText(tipoparamfactulistadocliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuListadoCliente(TipoParamFactuListadoClienteBean tipoparamfactulistadoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setText(tipoparamfactulistadoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setText(tipoparamfactulistadoclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParamFactuListadoCliente(TipoParamFactuListadoClienteParameterReturnGeneral tipoparamfactulistadoclienteReturnGeneral,TipoParamFactuListadoClienteBean tipoparamfactulistadoclienteBean,Boolean conDefault) throws Exception { 
		try {
			TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal=new TipoParamFactuListadoCliente();
			
			tipoparamfactulistadoclienteLocal=tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactulistadoclienteLocal.getId()!=null && !tipoparamfactulistadoclienteLocal.getId().equals(0L))) {tipoparamfactulistadoclienteBean.setId(tipoparamfactulistadoclienteLocal.getId());}}
			if(conDefault || (!conDefault && tipoparamfactulistadoclienteLocal.getnombre()!=null && !tipoparamfactulistadoclienteLocal.getnombre().equals(""))) {tipoparamfactulistadoclienteBean.setnombre(tipoparamfactulistadoclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParamFactuListadoClienteGenerico(Long idTipoParamFactuListadoClienteSeleccionado,JComboBox jComboBoxTipoParamFactuListadoCliente,List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesLocal)throws Exception {
		try {
			TipoParamFactuListadoCliente  tipoparamfactulistadoclienteTemp=null;

			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesLocal) {
				if(tipoparamfactulistadoclienteAux.getId()!=null && tipoparamfactulistadoclienteAux.getId().equals(idTipoParamFactuListadoClienteSeleccionado)) {
					tipoparamfactulistadoclienteTemp=tipoparamfactulistadoclienteAux;
					break;
				}
			}

			jComboBoxTipoParamFactuListadoCliente.setSelectedItem(tipoparamfactulistadoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParamFactuListadoClienteGenerico(JComboBox jComboBoxTipoParamFactuListadoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParamFactuListadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuListadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParamFactuListadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuListadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuListadoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParamFactuListadoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuListadoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParamFactuListadoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParamFactuListadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParamFactuListadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactulistadocliente=(TipoParamFactuListadoCliente) tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) tipoparamfactulistadoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParamFactuListadoCliente tipoparamfactulistadoclienteRow=new TipoParamFactuListadoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactulistadoclienteRow=(TipoParamFactuListadoCliente) tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactulistadoclienteRow=(TipoParamFactuListadoCliente) tipoparamfactulistadoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));			
			this.jButtonDuplicarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente && this.isPermisoDuplicarTipoParamFactuListadoCliente));			
			this.jButtonCopiarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente && this.isPermisoCopiarTipoParamFactuListadoCliente));
			this.jButtonVerFormTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente && this.isPermisoVerFormTipoParamFactuListadoCliente));
			
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));			
			
			this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));			
			this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente && this.isPermisoEliminarTipoParamFactuListadoCliente));
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente);							
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));						
			this.jButtonDuplicarToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente && this.isPermisoDuplicarTipoParamFactuListadoCliente));						
			this.jButtonCopiarToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente && this.isPermisoCopiarTipoParamFactuListadoCliente));			
			this.jButtonVerFormToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente && this.isPermisoVerFormTipoParamFactuListadoCliente));			
			this.jButtonAbrirOrderByToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));
			this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente  && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente && this.isPermisoEliminarTipoParamFactuListadoCliente));
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarToolBarTipoParamFactuListadoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente);				
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));			
			this.jMenuItemDuplicarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente && this.isPermisoDuplicarTipoParamFactuListadoCliente));			
			this.jMenuItemCopiarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente && this.isPermisoCopiarTipoParamFactuListadoCliente));			
			this.jMenuItemVerFormTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente && this.isPermisoVerFormTipoParamFactuListadoCliente));			
			this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));			
			//this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));
			this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));			
			//this.jMenuItemDetalleMostrarOcultarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente && this.isPermisoOrdenTipoParamFactuListadoCliente));			
			this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente));			
			this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente && this.isPermisoNuevoTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));									
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemModificarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemActualizarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente && this.isPermisoActualizarTipoParamFactuListadoCliente));	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemEliminarTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente && this.isPermisoEliminarTipoParamFactuListadoCliente));
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemCancelarTipoParamFactuListadoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente);				
			}
			
			this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));						
			this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=this.jButtonNuevoTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente=this.jButtonDuplicarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente=this.jButtonCopiarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente=this.jButtonVerFormTipoParamFactuListadoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParamFactuListadoCliente=this.jButtonAbrirOrderByTipoParamFactuListadoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=this.jButtonModificarTipoParamFactuListadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=this.jButtonNuevoToolBarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarToolBarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarToolBarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarToolBarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarToolBarTipoParamFactuListadoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=this.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=this.jMenuItemNuevoTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemModificarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemActualizarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemEliminarTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemCancelarTipoParamFactuListadoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParamFactuListadoCliente(Boolean esInicializar) {
		if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuListadoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParamFactuListadoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParamFactuListadoCliente() {
		this.jButtonNuevoTipoParamFactuListadoCliente.setVisible(this.isPermisoNuevoTipoParamFactuListadoCliente);			
		this.jButtonDuplicarTipoParamFactuListadoCliente.setVisible(this.isPermisoDuplicarTipoParamFactuListadoCliente);			
		this.jButtonCopiarTipoParamFactuListadoCliente.setVisible(this.isPermisoCopiarTipoParamFactuListadoCliente);			
		this.jButtonVerFormTipoParamFactuListadoCliente.setVisible(this.isPermisoVerFormTipoParamFactuListadoCliente);			
		
		this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setVisible(this.isPermisoOrdenTipoParamFactuListadoCliente);					
		
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.setVisible(this.isPermisoNuevoTipoParamFactuListadoCliente);			
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarTipoParamFactuListadoCliente.setVisible(this.isPermisoActualizarTipoParamFactuListadoCliente);	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.setVisible(this.isPermisoActualizarTipoParamFactuListadoCliente);	
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.setVisible(this.isPermisoEliminarTipoParamFactuListadoCliente);
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente);						
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.setVisible(this.isPermisoGuardarCambiosTipoParamFactuListadoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setVisible(this.isPermisoActualizarTipoParamFactuListadoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuListadoCliente() {
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarTipoParamFactuListadoCliente.setVisible(this.isPermisoActualizarTipoParamFactuListadoCliente);	
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.setVisible(this.isPermisoActualizarTipoParamFactuListadoCliente);	
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.setVisible(this.isPermisoEliminarTipoParamFactuListadoCliente);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente);							
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente && this.isPermisoGuardarCambiosTipoParamFactuListadoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParamFactuListadoCliente() {
		if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuListadoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParamFactuListadoCliente() {
	}
	
	public void jTableDatosTipoParamFactuListadoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParamFactuListadoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParamFactuListadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.gettipoparamfactulistadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactulistadocliente==null) {
						this.tipoparamfactulistadocliente = new TipoParamFactuListadoCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
				}

				if(this.tipoparamfactulistadocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparamfactulistadocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParamFactuListadoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.gettipoparamfactulistadocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactulistadocliente==null) {
						this.tipoparamfactulistadocliente = new TipoParamFactuListadoCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);
				}

				if(this.tipoparamfactulistadocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparamfactulistadocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoParamFactuListadoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);

			this.getTipoParamFactuListadoClientesBusquedaPorNombre();

			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);

			//if(TipoParamFactuListadoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactulistadoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoParamFactuListadoCliente() {
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.dispose();
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.dispose();
			this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente=null;
		}
		
		if(this.jInternalFrameImportacionTipoParamFactuListadoCliente!=null) {
			this.jInternalFrameImportacionTipoParamFactuListadoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParamFactuListadoCliente.dispose();
			this.jInternalFrameImportacionTipoParamFactuListadoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParamFactuListadoCliente();
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParamFactuListadoCliente")) {
				jButtonDuplicarTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParamFactuListadoCliente")) {
				jButtonCopiarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParamFactuListadoCliente")) {
				jButtonVerFormTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParamFactuListadoCliente")) {
				jButtonDuplicarTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParamFactuListadoCliente")) {
				jButtonDuplicarTipoParamFactuListadoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParamFactuListadoCliente")) {
				jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParamFactuListadoCliente")) {
				jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParamFactuListadoCliente")) {
				jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParamFactuListadoCliente")) {
				jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParamFactuListadoCliente")) {
				jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParamFactuListadoCliente")) {
				jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParamFactuListadoCliente")) {
				jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParamFactuListadoCliente")) {
				jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParamFactuListadoCliente")) {
				jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParamFactuListadoCliente")) {
				jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParamFactuListadoCliente")) {
				jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParamFactuListadoCliente")) {
				jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParamFactuListadoCliente")) {
				jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParamFactuListadoCliente")) {
				jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParamFactuListadoCliente")) {
				jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParamFactuListadoCliente")) {
				jButtonMostrarOcultarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParamFactuListadoCliente")) {
				jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParamFactuListadoCliente")) {
				jButtonCopiarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParamFactuListadoCliente")) {
				jButtonVerFormTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParamFactuListadoCliente")) {
				jButtonCopiarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParamFactuListadoCliente")) {
				jButtonVerFormTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuListadoCliente")) {
				jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParamFactuListadoCliente")) {
				jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParamFactuListadoCliente")) {
				jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParamFactuListadoCliente")) {
				jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParamFactuListadoCliente")) {
				jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParamFactuListadoCliente")) {
				jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParamFactuListadoCliente")) {
				jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParamFactuListadoCliente")) {
				jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParamFactuListadoCliente")) {
				jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParamFactuListadoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente")) {
				jButtonAbrirOrderByTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParamFactuListadoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParamFactuListadoCliente")) {
				jButtonMostrarOcultarTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParamFactuListadoCliente")) {
				jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParamFactuListadoCliente")) {
				jButtonCerrarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParamFactuListadoCliente")) {
				jButtonGenerarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParamFactuListadoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParamFactuListadoCliente")) {
				jButtonCerrarImportacionTipoParamFactuListadoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParamFactuListadoCliente")) {
				
				jButtonGenerarImportacionTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParamFactuListadoCliente")) {
				
				jButtonAbrirImportacionTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParamFactuListadoCliente")) {
				jComboBoxTiposAccionesTipoParamFactuListadoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParamFactuListadoCliente")) {
				jComboBoxTiposRelacionesTipoParamFactuListadoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParamFactuListadoCliente")) {
				jComboBoxTiposAccionesTipoParamFactuListadoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParamFactuListadoCliente")) {
				
				jComboBoxTiposSeleccionarTipoParamFactuListadoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParamFactuListadoCliente")) {
				jTextFieldValorCampoGeneralTipoParamFactuListadoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParamFactuListadoCliente")) {
				jButtonAbrirOrderByTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParamFactuListadoCliente")) {
				jButtonAbrirOrderByTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParamFactuListadoCliente")) {
				jButtonCerrarOrderByTipoParamFactuListadoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuListadoClienteBusqueda")) {
				this.jButtonidTipoParamFactuListadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuListadoClienteBusqueda")) {
				this.jButtonnombreTipoParamFactuListadoClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoParamFactuListadoCliente")) {
				this.jButtonBusquedaPorNombreTipoParamFactuListadoClienteActionPerformed(evt);
			}
			
			;
			
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParamFactuListadoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparamfactulistadoclienteLocal=this.tipoparamfactulistadocliente;
			} else {
				tipoparamfactulistadoclienteLocal=this.tipoparamfactulistadoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
							
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
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
			
			


			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
								
						
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
								
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
							
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
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
			
			


			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
								
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParamFactuListadoCliente")) {
					jCheckBoxSeleccionarTodosTipoParamFactuListadoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParamFactuListadoCliente")) {
					jCheckBoxSeleccionadosTipoParamFactuListadoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParamFactuListadoCliente")) {
					
				}
				
				


				
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
												
				
				


				
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
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
			
			


			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactulistadocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactulistadocliente);
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
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
				
				


				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuListadoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuListadoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuListadoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactulistadoclienteAnterior =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParamFactuListadoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParamFactuListadoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParamFactuListadoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparamfactulistadocliente =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparamfactulistadocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParamFactuListadoCliente")) {
				
				}
				
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParamFactuListadoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParamFactuListadoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuListadoCliente")) {
			
			}
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParamFactuListadoCliente();
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParamFactuListadoCliente")) {
				jButtonDuplicarTipoParamFactuListadoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParamFactuListadoCliente")) {
				jButtonCopiarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParamFactuListadoCliente")) {
				jButtonVerFormTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuListadoCliente")) {
				jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParamFactuListadoCliente")) {
				jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParamFactuListadoCliente")) {
				jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParamFactuListadoCliente")) {
				jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParamFactuListadoCliente")) {
				jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParamFactuListadoCliente")) {
				jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuListadoCliente")) {
				jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParamFactuListadoCliente")) {
				jButtonAbrirOrderByTipoParamFactuListadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuListadoCliente")) {
				jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParamFactuListadoCliente")) {
				jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParamFactuListadoCliente")) {
				jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuListadoClienteBusqueda")) {
				this.jButtonidTipoParamFactuListadoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuListadoClienteBusqueda")) {
				this.jButtonnombreTipoParamFactuListadoClienteBusquedaActionPerformed(evt);
			}
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParamFactuListadoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParamFactuListadoCliente")) {
				closingInternalFrameTipoParamFactuListadoCliente();
				
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuListadoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuListadoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParamFactuListadoClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuListadoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuListadoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParamFactuListadoClienteActionPerformed(null);
			}
			
			TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactulistadocliente,new Object(),this.tipoparamfactulistadoclienteParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParamFactuListadoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParamFactuListadoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParamFactuListadoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {
			if(!esControlTabla) {
				if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);			
				}
				
				if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactulistadoclienteReturnGeneral=tipoparamfactulistadoclienteLogic.procesarEventosTipoParamFactuListadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this.tipoparamfactulistadocliente,this.tipoparamfactulistadoclienteParameterGeneral,this.isEsNuevoTipoParamFactuListadoCliente,classes);//this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral,this.tipoparamfactulistadoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuListadoCliente(classes,this.tipoparamfactulistadoclienteReturnGeneral,this.tipoparamfactulistadoclienteBean,false);
					}
						
					if(this.tipoparamfactulistadoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente());	
					}
						
					if(this.tipoparamfactulistadoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente(),classes);//this.tipoparamfactulistadoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,classes);//this.tipoparamfactulistadoclienteBean);									
				}
			
				if(TipoParamFactuListadoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuListadoCliente(this.tipoparamfactulistadocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparamfactulistadoclienteAnterior!=null) {
						this.tipoparamfactulistadocliente=this.tipoparamfactulistadoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactulistadoclienteReturnGeneral=tipoparamfactulistadoclienteLogic.procesarEventosTipoParamFactuListadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this.tipoparamfactulistadocliente,this.tipoparamfactulistadoclienteParameterGeneral,this.isEsNuevoTipoParamFactuListadoCliente,classes);//this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente(),tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente(),this.tipoparamfactulistadoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParamFactuListadoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParamFactuListadoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParamFactuListadoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParamFactuListadoCliente() throws Exception {
		
		TipoParamFactuListadoClienteModel tipoparamfactulistadoclienteModel=(TipoParamFactuListadoClienteModel)this.jTableDatosTipoParamFactuListadoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactulistadoclienteModel.tipoparamfactulistadoclientes=this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparamfactulistadoclienteModel.tipoparamfactulistadoclientes=this.tipoparamfactulistadoclientes;
		}
		
		
		((TipoParamFactuListadoClienteModel) this.jTableDatosTipoParamFactuListadoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParamFactuListadoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparamfactulistadoclienteAnterior(),this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparamfactulistadoclienteAnterior(),this.tipoparamfactulistadoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParamFactuListadoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
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
										
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactulistadocliente,new Object(),generalEntityParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParamFactuListadoClienteConstantesFunciones.getClassesRelationshipsOfTipoParamFactuListadoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParamFactuListadoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParamFactuListadoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParamFactuListadoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactulistadocliente,new Object(),generalEntityParameterGeneral,this.tipoparamfactulistadoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParamFactuListadoCliente(TipoParamFactuListadoClienteBean tipoparamfactulistadoclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuListadoCliente(ArrayList<Classe> classes,TipoParamFactuListadoClienteReturnGeneral tipoparamfactulistadoclienteReturnGeneral,TipoParamFactuListadoClienteBean tipoparamfactulistadoclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente = new TipoParamFactuListadoClienteDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones(),this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setVisible(false);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.tipoparamfactulistadoclienteLogic=this.tipoparamfactulistadoclienteLogic;
		
		this.cargarCombosFrameForeignKeyTipoParamFactuListadoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuListadoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuListadoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParamFactuListadoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuListadoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuListadoCliente"));
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuListadoCliente"));

		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuListadoCliente"));
					
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemModificarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuListadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuListadoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuListadoCliente"));
						
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemActualizarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuListadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuListadoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuListadoCliente"));
								
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemEliminarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuListadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuListadoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuListadoCliente"));
					
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemCancelarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuListadoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemDetalleCerrarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuListadoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuListadoCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuListadoCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuListadoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonidTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuListadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonnombreTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuListadoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuListadoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParamFactuListadoCliente"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuListadoCliente"));
		}
		
		this.jTableDatosTipoParamFactuListadoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParamFactuListadoCliente"));
		
		this.jTableDatosTipoParamFactuListadoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParamFactuListadoCliente"));
		
		this.jButtonNuevoTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"NuevoTipoParamFactuListadoCliente"));
		
		this.jButtonDuplicarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"DuplicarTipoParamFactuListadoCliente"));
		
		this.jButtonCopiarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"CopiarTipoParamFactuListadoCliente"));
		
		this.jButtonVerFormTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"VerFormTipoParamFactuListadoCliente"));
		
		
		this.jButtonNuevoToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParamFactuListadoCliente"));
			
		this.jButtonDuplicarToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemNuevoTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParamFactuListadoCliente"));
			
		this.jMenuItemDuplicarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParamFactuListadoCliente"));		
		
		
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParamFactuListadoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParamFactuListadoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuListadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonModificarToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuListadoCliente"));
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemModificarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuListadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuListadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonActualizarToolBarTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuListadoCliente"));
				
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemActualizarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuListadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuListadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonEliminarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuListadoCliente"));
						
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemEliminarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuListadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuListadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonCancelarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuListadoCliente"));
			
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemCancelarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuListadoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParamFactuListadoCliente"));		
		
		
		this.jButtonCerrarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CerrarTipoParamFactuListadoCliente"));
		
		
		this.jButtonCerrarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemCerrarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParamFactuListadoCliente"));
			
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jMenuItemDetalleCerrarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuListadoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParamFactuListadoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuListadoCliente"));
		}
		
		this.jButtonCopiarToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParamFactuListadoCliente"));
			
		this.jButtonVerFormToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParamFactuListadoCliente"));
		
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParamFactuListadoCliente"));
			
		this.jMenuItemCopiarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParamFactuListadoCliente"));		
		
		this.jMenuItemVerFormTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParamFactuListadoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuListadoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuListadoCliente"));		
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParamFactuListadoCliente"));
					
		this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParamFactuListadoCliente"));
		
		this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParamFactuListadoCliente"));		
		
		
		
		this.jButtonAnterioresTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"AnterioresTipoParamFactuListadoCliente"));
		
		
		this.jButtonAnterioresToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParamFactuListadoCliente"));
		
		this.jMenuItemAnterioresTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParamFactuListadoCliente"));		
		
		
		this.jButtonSiguientesTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"SiguientesTipoParamFactuListadoCliente"));
		
		
		this.jButtonSiguientesToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemSiguientesTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParamFactuListadoCliente"));
			
		this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParamFactuListadoCliente"));
			
		this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParamFactuListadoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente"));
			
		this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParamFactuListadoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParamFactuListadoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParamFactuListadoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParamFactuListadoCliente"));

		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParamFactuListadoCliente"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuListadoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParamFactuListadoCliente"));
			
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParamFactuListadoCliente"));
					
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParamFactuListadoCliente"));
			
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParamFactuListadoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonidTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuListadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonnombreTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuListadoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuListadoCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuListadoCliente"));
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuListadoCliente"));
				this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuListadoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuListadoCliente"));				
			//this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuListadoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuListadoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuListadoCliente"));
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuListadoCliente"));
				this.jInternalFrameImportacionTipoParamFactuListadoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuListadoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParamFactuListadoCliente"));
			
			this.jButtonAbrirOrderByToolBarTipoParamFactuListadoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParamFactuListadoCliente"));			
			
			if(this.jInternalFrameOrderByTipoParamFactuListadoCliente!=null) {
				this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuListadoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTabbedPaneRelacionesTipoParamFactuListadoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuListadoCliente"));
		
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
            		closingInternalFrameTipoParamFactuListadoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuListadoCliente = (JInternalFrameBase)event.getSource();
	            	
	            TipoParamFactuListadoClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuListadoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuListadoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParamFactuListadoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParamFactuListadoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParamFactuListadoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParamFactuListadoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParamFactuListadoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuListadoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParamFactuListadoCliente";
		inputMap = this.jButtonModificarTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParamFactuListadoCliente";
		inputMap = this.jButtonActualizarTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParamFactuListadoCliente";
		inputMap = this.jButtonEliminarTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCancelarTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCerrarTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParamFactuListadoCliente";
		inputMap = this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonGuardarCambiosTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParamFactuListadoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParamFactuListadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParamFactuListadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParamFactuListadoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonidTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuListadoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jButtonnombreTipoParamFactuListadoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuListadoClienteBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuListadoCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParamFactuListadoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParamFactuListadoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParamFactuListadoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParamFactuListadoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
					tipoparamfactulistadoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientes) {
					tipoparamfactulistadoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParamFactuListadoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
						tipoparamfactulistadoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientes) {
						tipoparamfactulistadoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuListadoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuListadoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParamFactuListadoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuListadoCliente.getSelectedRows();
			
			TipoParamFactuListadoCliente tipoparamfactulistadoclienteLocal=new TipoParamFactuListadoCliente();
			
			//this.seleccionarTodosTipoParamFactuListadoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactulistadoclienteLocal =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparamfactulistadoclienteLocal =(TipoParamFactuListadoCliente) this.tipoparamfactulistadoclientes.toArray()[this.jTableDatosTipoParamFactuListadoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparamfactulistadoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
						tipoparamfactulistadoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientes) {
						tipoparamfactulistadoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuListadoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuListadoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuListadoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParamFactuListadoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParamFactuListadoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParamFactuListadoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
				
						if(sTipoSeleccionar.equals(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactulistadoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientes) {
					
						if(sTipoSeleccionar.equals(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactulistadoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParamFactuListadoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParamFactuListadoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParamFactuListadoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParamFactuListadoCliente(conSplash);
				
					this.generarReporteTipoParamFactuListadoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParamFactuListadoClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuListadoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuListadoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuListadoCliente();
				
				this.exportarTipoParamFactuListadoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParamFactuListadoClientes();
				//this.importarTipoParamFactuListadoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuListadoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParamFactuListadoClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Listado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParamFactuListadoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParamFactuListadoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParamFactuListadoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParamFactuListadoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParamFactuListadoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParamFactuListadoCliente(conSplash);
					
						//this.actualizarParametrosGeneralTipoParamFactuListadoCliente();
						
						this.generarReporteProcesoAccionTipoParamFactuListadoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Listado ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Listado Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParamFactuListadoCliente();
				
						this.actualizarParametrosGeneralTipoParamFactuListadoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparamfactulistadoclienteReturnGeneral=tipoparamfactulistadoclienteLogic.procesarAccionTipoParamFactuListadoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes(),this.tipoparamfactulistadoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParamFactuListadoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParamFactuListadoCliente();
					
					TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParamFactuListadoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParamFactuListadoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParamFactuListadoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParamFactuListadoCliente();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
			TipoParamFactuListadoCliente tipoparamfactulistadocliente=new TipoParamFactuListadoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.getSelectedItem();
			
			
			
			
			tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparamfactulistadoclientesSeleccionados.size()==1) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
					tipoparamfactulistadocliente=tipoparamfactulistadoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParamFactuListadoCliente();
			
      		//this.finishProcessTipoParamFactuListadoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParamFactuListadoClienteReturnGeneral() throws Exception {
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactulistadoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactulistadoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparamfactulistadoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
		}
		
		if(this.tipoparamfactulistadoclienteReturnGeneral.getConRetornoLista() || this.tipoparamfactulistadoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparamfactulistadoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoClientes(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparamfactulistadoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactulistadoclienteLogic.setTipoParamFactuListadoCliente(this.tipoparamfactulistadoclienteReturnGeneral.getTipoParamFactuListadoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParamFactuListadoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParamFactuListadoCliente() throws Exception {
		
		
	}
	
	public ArrayList<TipoParamFactuListadoCliente> getTipoParamFactuListadoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParamFactuListadoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes()) {
					if(tipoparamfactulistadoclienteAux.getIsSelected()) {
						tipoparamfactulistadoclientesSeleccionados.add(tipoparamfactulistadoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:this.tipoparamfactulistadoclientes) {
					if(tipoparamfactulistadoclienteAux.getIsSelected()) {
						tipoparamfactulistadoclientesSeleccionados.add(tipoparamfactulistadoclienteAux);				
					}
				}
			}
			
			if(tipoparamfactulistadoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparamfactulistadoclientesSeleccionados.addAll(this.tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparamfactulistadoclientesSeleccionados.addAll(this.tipoparamfactulistadoclientes);				
					}
				}
			}
		} else {
			tipoparamfactulistadoclientesSeleccionados.add(this.tipoparamfactulistadocliente);
		}
		
		return tipoparamfactulistadoclientesSeleccionados;
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
	
	public void generarReporteTipoParamFactuListadoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParamFactuListadoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParamFactuListadoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuListadoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuListadoClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Listado Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParamFactuListadoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParamFactuListadoCliente();
		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParamFactuListadoCliente();
		
		
		//this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados ,tipoparamfactulistadoclienteImplementable,tipoparamfactulistadoclienteImplementableHome);
	}
	
	public void mostrarImportacionTipoParamFactuListadoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParamFactuListadoCliente();
		
		this.abrirFrameImportacionTipoParamFactuListadoCliente();		
		
			
		//this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados ,tipoparamfactulistadoclienteImplementable,tipoparamfactulistadoclienteImplementableHome);
	}
	
	public void importarTipoParamFactuListadoClientes() throws Exception {		
	
	}
	
	public void exportarTipoParamFactuListadoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParamFactuListadoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParamFactuListadoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParamFactuListadoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Listado Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParamFactuListadoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParamFactuListadoCliente(tipoparamfactulistadoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparamfactulistadoclienteAux.setsDetalleGeneralEntityReporte(tipoparamfactulistadoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParamFactuListadoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuListadoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparamfactulistadocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactulistadocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactulistadocliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParamFactuListadoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParamFactuListadoCliente(row);				
				iRow++;
			}				
			
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParamFactuListadoCliente(tipoparamfactulistadoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParamFactuListadoClientesSeleccionados() throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();		
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactulistadocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparamfactulistadoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparamfactulistadocliente");
			//elementRoot.appendChild(element);
		
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
				element = document.createElement("tipoparamfactulistadocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParamFactuListadoCliente(tipoparamfactulistadoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Listado Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParamFactuListadoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactulistadocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactulistadocliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoParamFactuListadoCliente(TipoParamFactuListadoCliente tipoparamfactulistadocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParamFactuListadoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparamfactulistadocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParamFactuListadoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparamfactulistadocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoParamFactuListadoClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparamfactulistadocliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoParamFactuListadoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados=new ArrayList<TipoParamFactuListadoCliente>();
		
		tipoparamfactulistadoclientesSeleccionados=this.getTipoParamFactuListadoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParamFactuListadoCliente(tipoparamfactulistadoclientesSeleccionados);
		
		this.generarReporteTipoParamFactuListadoClientes("Todos",tipoparamfactulistadoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParamFactuListadoCliente(ArrayList<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParamFactuListadoCliente tipoparamfactulistadoclienteAux:tipoparamfactulistadoclientesSeleccionados) {
				tipoparamfactulistadoclienteAux.setsDetalleGeneralEntityReporte(tipoparamfactulistadoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparamfactulistadoclienteAux.setsDescripcionGeneralEntityReporte1(tipoparamfactulistadoclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuListadoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParamFactuListadoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaModificarTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuListadoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuListadoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=true;
		} else {
			this.actualizarEstadoPanelsTipoParamFactuListadoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParamFactuListadoCliente=false;
			//this.isVisibilidadCeldaVerFormTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuListadoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuListadoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;												
			}
			
			this.jButtonCerrarTipoParamFactuListadoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuListadoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparamfactulistadocliente)) {
			this.isVisibilidadCeldaActualizarTipoParamFactuListadoCliente=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuListadoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuListadoCliente() {
	}
	
	public void actualizarEstadoPanelsTipoParamFactuListadoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuListadoCliente!=null) {
				this.jScrollPanelDatosTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuListadoCliente!=null) {
				this.jPanelPaginacionTipoParamFactuListadoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
					this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuListadoCliente!=null) {
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		
		if(this.tipoparamfactulistadoclienteSessionBean==null) {
			this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		}
		
		this.tipoparamfactulistadoclienteSessionBean.setsUltimaBusquedaTipoParamFactuListadoCliente(this.getsAccionBusqueda());
		this.tipoparamfactulistadoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparamfactulistadoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoparamfactulistadoclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		
		if(this.tipoparamfactulistadoclienteSessionBean==null) {
			this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		}
		
		if(this.tipoparamfactulistadoclienteSessionBean.getsUltimaBusquedaTipoParamFactuListadoCliente()!=null&&!this.tipoparamfactulistadoclienteSessionBean.getsUltimaBusquedaTipoParamFactuListadoCliente().equals("")) {
			this.setsAccionBusqueda(tipoparamfactulistadoclienteSessionBean.getsUltimaBusquedaTipoParamFactuListadoCliente());
			this.setiNumeroPaginacion(tipoparamfactulistadoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparamfactulistadoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoparamfactulistadoclienteSessionBean.getnombre());
				tipoparamfactulistadoclienteSessionBean.setnombre("");
			}
		}
		
		this.tipoparamfactulistadoclienteSessionBean.setsUltimaBusquedaTipoParamFactuListadoCliente("");
		this.tipoparamfactulistadoclienteSessionBean.setiNumeroPaginacion(TipoParamFactuListadoClienteConstantesFunciones.INUMEROPAGINACION);
		this.tipoparamfactulistadoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParamFactuListadoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParamFactuListadoCliente() {
		this.updateBorderResaltarBusquedasFormularioTipoParamFactuListadoCliente();
		this.updateVisibilidadBusquedasFormularioTipoParamFactuListadoCliente();
		this.updateHabilitarBusquedasFormularioTipoParamFactuListadoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParamFactuListadoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponents().length>0) {
	

		if(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuListadoCliente!=null) {
			index= this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponent(index);
				jPanel.setBorder(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuListadoCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParamFactuListadoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoparamfactulistadoclienteConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuListadoCliente);
			if(!this.tipoparamfactulistadoclienteConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuListadoCliente && index>-1) {
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoParamFactuListadoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoparamfactulistadoclienteConstantesFunciones.activarBusquedaPorNombreTipoParamFactuListadoCliente);
				this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setEnabledAt(index,this.tipoparamfactulistadoclienteConstantesFunciones.activarBusquedaPorNombreTipoParamFactuListadoCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoParamFactuListadoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente);

			this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.getComponent(index);

			this.tipoparamfactulistadoclienteConstantesFunciones.setResaltarBusquedaPorNombreTipoParamFactuListadoCliente(resaltar);

			jPanel.setBorder(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuListadoCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoParamFactuListadoCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoParamFactuListadoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParamFactuListadoCliente();
		this.updateVisibilidadResaltarControlesFormularioTipoParamFactuListadoCliente();
		this.updateHabilitarResaltarControlesFormularioTipoParamFactuListadoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParamFactuListadoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparamfactulistadoclienteConstantesFunciones.resaltaridTipoParamFactuListadoCliente!=null && this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setBorder(this.tipoparamfactulistadoclienteConstantesFunciones.resaltaridTipoParamFactuListadoCliente);}
		if(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarnombreTipoParamFactuListadoCliente!=null && this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setBorder(this.tipoparamfactulistadoclienteConstantesFunciones.resaltarnombreTipoParamFactuListadoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParamFactuListadoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
	
		//this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setVisible(this.tipoparamfactulistadoclienteConstantesFunciones.mostraridTipoParamFactuListadoCliente);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelidTipoParamFactuListadoCliente.setVisible(this.tipoparamfactulistadoclienteConstantesFunciones.mostraridTipoParamFactuListadoCliente);
		//this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setVisible(this.tipoparamfactulistadoclienteConstantesFunciones.mostrarnombreTipoParamFactuListadoCliente);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jPanelnombreTipoParamFactuListadoCliente.setVisible(this.tipoparamfactulistadoclienteConstantesFunciones.mostrarnombreTipoParamFactuListadoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParamFactuListadoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuListadoCliente!=null) {
	
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextFieldidTipoParamFactuListadoCliente.setEnabled(this.tipoparamfactulistadoclienteConstantesFunciones.activaridTipoParamFactuListadoCliente);
		this.jInternalFrameDetalleFormTipoParamFactuListadoCliente.jTextAreanombreTipoParamFactuListadoCliente.setEnabled(this.tipoparamfactulistadoclienteConstantesFunciones.activarnombreTipoParamFactuListadoCliente);
		}
	}
	
		
}