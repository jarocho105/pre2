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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.TipoPuertoConstantesFunciones;
import com.bydan.erp.importaciones.util.TipoPuertoParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.TipoPuertoParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.TipoPuertoBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoPuertoBeanSwingJInternalFrame extends TipoPuertoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPuertoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPuerto> tipopuertoValidator = new ClassValidator<TipoPuerto>(TipoPuerto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPuerto tipopuerto;	
	public TipoPuerto tipopuertoAux;
	public TipoPuerto tipopuertoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPuerto tipopuertoTotales;
	public Long idTipoPuertoActual;
	public Long iIdNuevoTipoPuerto=0L;
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
	
	public Boolean isPermisoTodoTipoPuerto;
	public Boolean isPermisoNuevoTipoPuerto;
	public Boolean isPermisoActualizarTipoPuerto;
	public Boolean isPermisoActualizarOriginalTipoPuerto;
	public Boolean isPermisoEliminarTipoPuerto;
	public Boolean isPermisoGuardarCambiosTipoPuerto;
	public Boolean isPermisoConsultaTipoPuerto;
	public Boolean isPermisoBusquedaTipoPuerto;
	public Boolean isPermisoReporteTipoPuerto;
	public Boolean isPermisoPaginacionMedioTipoPuerto;
	public Boolean isPermisoPaginacionAltoTipoPuerto;
	public Boolean isPermisoPaginacionTodoTipoPuerto;
	public Boolean isPermisoCopiarTipoPuerto;
	public Boolean isPermisoVerFormTipoPuerto;
	public Boolean isPermisoDuplicarTipoPuerto;
	public Boolean isPermisoOrdenTipoPuerto;
	
	
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
	
	public TipoPuertoParameterReturnGeneral tipopuertoReturnGeneral;
	public TipoPuertoParameterReturnGeneral tipopuertoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPuerto=false;
	public Boolean esParaAccionDesdeFormularioTipoPuerto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPuertoLogic tipopuertoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPuerto tipopuertoBean;
	public TipoPuertoConstantesFunciones tipopuertoConstantesFunciones;
	//public TipoPuertoParameterReturnGeneral tipopuertoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoPuerto> tipopuertos;	
	//public List<TipoPuerto> tipopuertosEliminados;
	//public List<TipoPuerto> tipopuertosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPuerto=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPuerto=true;
	public Boolean isVisibilidadCeldaCopiarTipoPuerto=true;
	public Boolean isVisibilidadCeldaVerFormTipoPuerto=true;
	public Boolean isVisibilidadCeldaOrdenTipoPuerto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
	public Boolean isVisibilidadCeldaModificarTipoPuerto=false;
	public Boolean isVisibilidadCeldaActualizarTipoPuerto=false;
	public Boolean isVisibilidadCeldaEliminarTipoPuerto=false;
	public Boolean isVisibilidadCeldaCancelarTipoPuerto=false;
	public Boolean isVisibilidadCeldaGuardarTipoPuerto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPuerto=false;	
	
	
	
	public Long getiIdNuevoTipoPuerto() {
		return this.iIdNuevoTipoPuerto;
	}

	public void setiIdNuevoTipoPuerto(Long iIdNuevoTipoPuerto) {
		this.iIdNuevoTipoPuerto = iIdNuevoTipoPuerto;
	}
	
	public Long getidTipoPuertoActual() {
		return this.idTipoPuertoActual;
	}

	public void setidTipoPuertoActual(Long idTipoPuertoActual) {
		this.idTipoPuertoActual = idTipoPuertoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPuerto gettipopuerto() {
		return this.tipopuerto;
	}

	public void settipopuerto(TipoPuerto tipopuerto) {
		this.tipopuerto = tipopuerto;
	}
	
	public TipoPuerto gettipopuertoAux() {
		return this.tipopuertoAux;
	}

	public void settipopuertoAux(TipoPuerto tipopuertoAux) {
		this.tipopuertoAux = tipopuertoAux;
	}				
	
	public TipoPuerto gettipopuertoAnterior() {
		return this.tipopuertoAnterior;
	}

	public void settipopuertoAnterior(TipoPuerto tipopuertoAnterior) {
		this.tipopuertoAnterior = tipopuertoAnterior;
	}	
	
	public TipoPuerto gettipopuertoTotales() {
		return this.tipopuertoTotales;
	}

	public void settipopuertoTotales(TipoPuerto tipopuertoTotales) {
		this.tipopuertoTotales = tipopuertoTotales;
	}	
	
	public TipoPuerto gettipopuertoBean() {
		return this.tipopuertoBean;
	}

	public void settipopuertoBean(TipoPuerto tipopuertoBean) {
		this.tipopuertoBean = tipopuertoBean;
	}	
	
	public TipoPuertoParameterReturnGeneral gettipopuertoReturnGeneral() {
		return this.tipopuertoReturnGeneral;
	}

	public void settipopuertoReturnGeneral(TipoPuertoParameterReturnGeneral tipopuertoReturnGeneral) {
		this.tipopuertoReturnGeneral = tipopuertoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPuertoLogic getTipoPuertoLogic()	{		
		return tipopuertoLogic;
	}

	public void setTipoPuertoLogic(TipoPuertoLogic tipopuertoLogic) {
		this.tipopuertoLogic = tipopuertoLogic;
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
	
	public Boolean getIsEsNuevoTipoPuerto() {
		return isEsNuevoTipoPuerto;
	}

	public void setIsEsNuevoTipoPuerto(Boolean isEsNuevoTipoPuerto) {
		this.isEsNuevoTipoPuerto = isEsNuevoTipoPuerto;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPuerto() {
		return esParaAccionDesdeFormularioTipoPuerto;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPuerto(Boolean esParaAccionDesdeFormularioTipoPuerto) {
		this.esParaAccionDesdeFormularioTipoPuerto = esParaAccionDesdeFormularioTipoPuerto;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoPuerto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPuertoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPuerto(this.tipopuertoLogic.getTipoPuertos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPuertoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPuerto(this.tipopuertos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipopuertoLogic.setTipoPuertos(this.tipopuertos);
			tipopuertoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPuertoParameterReturnGeneral getTipoPuertoParameterGeneral() {
		return this.tipopuertoParameterGeneral;
	}
	
	public void setTipoPuertoParameterGeneral(TipoPuertoParameterReturnGeneral tipopuertoParameterGeneral) {
		this.tipopuertoParameterGeneral = tipopuertoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPuerto() {
		return isPermisoTodoTipoPuerto;
	}

	public void setIsPermisoTodoTipoPuerto(Boolean isPermisoTodoTipoPuerto) {
		this.isPermisoTodoTipoPuerto = isPermisoTodoTipoPuerto;
	}

	public Boolean getIsPermisoNuevoTipoPuerto() {
		return isPermisoNuevoTipoPuerto;
	}

	public void setIsPermisoNuevoTipoPuerto(Boolean isPermisoNuevoTipoPuerto) {
		this.isPermisoNuevoTipoPuerto = isPermisoNuevoTipoPuerto;
	}

	public Boolean getIsPermisoActualizarTipoPuerto() {
		return isPermisoActualizarTipoPuerto;
	}

	public void setIsPermisoActualizarTipoPuerto(Boolean isPermisoActualizarTipoPuerto) {
		this.isPermisoActualizarTipoPuerto = isPermisoActualizarTipoPuerto;
	}

	public Boolean getIsPermisoEliminarTipoPuerto() {
		return isPermisoEliminarTipoPuerto;
	}

	public void setIsPermisoEliminarTipoPuerto(Boolean isPermisoEliminarTipoPuerto) {
		this.isPermisoEliminarTipoPuerto = isPermisoEliminarTipoPuerto;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPuerto() {
		return isPermisoGuardarCambiosTipoPuerto;
	}

	public void setIsPermisoGuardarCambiosTipoPuerto(Boolean isPermisoGuardarCambiosTipoPuerto) {
		this.isPermisoGuardarCambiosTipoPuerto = isPermisoGuardarCambiosTipoPuerto;
	}
	
	public Boolean getIsPermisoConsultaTipoPuerto() {
		return isPermisoConsultaTipoPuerto;
	}

	public void setIsPermisoConsultaTipoPuerto(Boolean isPermisoConsultaTipoPuerto) {
		this.isPermisoConsultaTipoPuerto = isPermisoConsultaTipoPuerto;
	}

	public Boolean getIsPermisoBusquedaTipoPuerto() {
		return isPermisoBusquedaTipoPuerto;
	}

	public void setIsPermisoBusquedaTipoPuerto(Boolean isPermisoBusquedaTipoPuerto) {
		this.isPermisoBusquedaTipoPuerto = isPermisoBusquedaTipoPuerto;
	}

	public Boolean getIsPermisoReporteTipoPuerto() {
		return isPermisoReporteTipoPuerto;
	}

	public void setIsPermisoReporteTipoPuerto(Boolean isPermisoReporteTipoPuerto) {
		this.isPermisoReporteTipoPuerto = isPermisoReporteTipoPuerto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPuerto() {
		return isPermisoPaginacionMedioTipoPuerto;
	}

	public void setIsPermisoPaginacionMedioTipoPuerto(Boolean isPermisoPaginacionMedioTipoPuerto) {
		this.isPermisoPaginacionMedioTipoPuerto = isPermisoPaginacionMedioTipoPuerto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPuerto() {
		return isPermisoPaginacionTodoTipoPuerto;
	}

	public void setIsPermisoPaginacionTodoTipoPuerto(Boolean isPermisoPaginacionTodoTipoPuerto) {
		this.isPermisoPaginacionTodoTipoPuerto = isPermisoPaginacionTodoTipoPuerto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPuerto() {
		return isPermisoPaginacionAltoTipoPuerto;
	}

	public void setIsPermisoPaginacionAltoTipoPuerto(Boolean isPermisoPaginacionAltoTipoPuerto) {
		this.isPermisoPaginacionAltoTipoPuerto = isPermisoPaginacionAltoTipoPuerto;
	}
	
	public Boolean getIsPermisoCopiarTipoPuerto() {
		return isPermisoCopiarTipoPuerto;
	}

	public void setIsPermisoCopiarTipoPuerto(Boolean isPermisoCopiarTipoPuerto) {
		this.isPermisoCopiarTipoPuerto = isPermisoCopiarTipoPuerto;
	}
	
	public Boolean getIsPermisoVerFormTipoPuerto() {
		return isPermisoVerFormTipoPuerto;
	}

	public void setIsPermisoVerFormTipoPuerto(Boolean isPermisoVerFormTipoPuerto) {
		this.isPermisoVerFormTipoPuerto = isPermisoVerFormTipoPuerto;
	}
	
	public Boolean getIsPermisoDuplicarTipoPuerto() {
		return isPermisoDuplicarTipoPuerto;
	}

	public void setIsPermisoDuplicarTipoPuerto(Boolean isPermisoDuplicarTipoPuerto) {
		this.isPermisoDuplicarTipoPuerto = isPermisoDuplicarTipoPuerto;
	}
	
	public Boolean getIsPermisoOrdenTipoPuerto() {
		return isPermisoOrdenTipoPuerto;
	}

	public void setIsPermisoOrdenTipoPuerto(Boolean isPermisoOrdenTipoPuerto) {
		this.isPermisoOrdenTipoPuerto = isPermisoOrdenTipoPuerto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPuerto() {
		return isVisibilidadCeldaNuevoTipoPuerto;
	}

	public void setIsVisibilidadCeldaNuevoTipoPuerto(Boolean isVisibilidadCeldaNuevoTipoPuerto) {
		this.isVisibilidadCeldaNuevoTipoPuerto = isVisibilidadCeldaNuevoTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPuerto() {
		return isVisibilidadCeldaDuplicarTipoPuerto;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPuerto(Boolean isVisibilidadCeldaDuplicarTipoPuerto) {
		this.isVisibilidadCeldaDuplicarTipoPuerto = isVisibilidadCeldaDuplicarTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPuerto() {
		return isVisibilidadCeldaCopiarTipoPuerto;
	}

	public void setIsVisibilidadCeldaCopiarTipoPuerto(Boolean isVisibilidadCeldaCopiarTipoPuerto) {
		this.isVisibilidadCeldaCopiarTipoPuerto = isVisibilidadCeldaCopiarTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPuerto() {
		return isVisibilidadCeldaVerFormTipoPuerto;
	}

	public void setIsVisibilidadCeldaVerFormTipoPuerto(Boolean isVisibilidadCeldaVerFormTipoPuerto) {
		this.isVisibilidadCeldaVerFormTipoPuerto = isVisibilidadCeldaVerFormTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPuerto() {
		return isVisibilidadCeldaOrdenTipoPuerto;
	}

	public void setIsVisibilidadCeldaOrdenTipoPuerto(Boolean isVisibilidadCeldaOrdenTipoPuerto) {
		this.isVisibilidadCeldaOrdenTipoPuerto = isVisibilidadCeldaOrdenTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPuerto() {
		return isVisibilidadCeldaNuevoRelacionesTipoPuerto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPuerto(Boolean isVisibilidadCeldaNuevoRelacionesTipoPuerto) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPuerto = isVisibilidadCeldaNuevoRelacionesTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPuerto() {
		return isVisibilidadCeldaModificarTipoPuerto;
	}

	public void setIsVisibilidadCeldaModificarTipoPuerto(Boolean isVisibilidadCeldaModificarTipoPuerto) {
		this.isVisibilidadCeldaModificarTipoPuerto = isVisibilidadCeldaModificarTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPuerto() {
		return isVisibilidadCeldaActualizarTipoPuerto;
	}

	public void setIsVisibilidadCeldaActualizarTipoPuerto(Boolean isVisibilidadCeldaActualizarTipoPuerto) {
		this.isVisibilidadCeldaActualizarTipoPuerto = isVisibilidadCeldaActualizarTipoPuerto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPuerto() {
		return isVisibilidadCeldaEliminarTipoPuerto;
	}

	public void setIsVisibilidadCeldaEliminarTipoPuerto(Boolean isVisibilidadCeldaEliminarTipoPuerto) {
		this.isVisibilidadCeldaEliminarTipoPuerto = isVisibilidadCeldaEliminarTipoPuerto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPuerto() {
		return isVisibilidadCeldaCancelarTipoPuerto;
	}

	public void setIsVisibilidadCeldaCancelarTipoPuerto(Boolean isVisibilidadCeldaCancelarTipoPuerto) {
		this.isVisibilidadCeldaCancelarTipoPuerto = isVisibilidadCeldaCancelarTipoPuerto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPuerto() {
		return isVisibilidadCeldaGuardarTipoPuerto;
	}

	public void setIsVisibilidadCeldaGuardarTipoPuerto(Boolean isVisibilidadCeldaGuardarTipoPuerto) {
		this.isVisibilidadCeldaGuardarTipoPuerto = isVisibilidadCeldaGuardarTipoPuerto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPuerto() {
		return isVisibilidadCeldaGuardarCambiosTipoPuerto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPuerto(Boolean isVisibilidadCeldaGuardarCambiosTipoPuerto) {
		this.isVisibilidadCeldaGuardarCambiosTipoPuerto = isVisibilidadCeldaGuardarCambiosTipoPuerto;
	}
		
	public TipoPuertoSessionBean gettipopuertoSessionBean() {
		return this.tipopuertoSessionBean;
	}
	
	public void settipopuertoSessionBean(TipoPuertoSessionBean tipopuertoSessionBean) {
		this.tipopuertoSessionBean=tipopuertoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(TipoPuerto tipopuerto)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoPuerto tipopuerto,TipoPuerto tipopuertoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPuerto(tipopuerto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipopuertoAux.setId(tipopuerto.getId());
		tipopuertoAux.setVersionRow(tipopuerto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPuerto();
		
			int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipopuertoValidator.getInvalidValues(this.tipopuerto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipopuertoLogic.setDatosCliente(datosCliente);
			tipopuertoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipopuertoAux=new  TipoPuerto();
				
				tipopuertoAux.setIsNew(true);
				tipopuertoAux.setIsChanged(true);
				
				tipopuertoAux.setTipoPuertoOriginal(this.tipopuerto);
				
				tipopuertoAux.setId(this.tipopuerto.getId());	
				tipopuertoAux.setVersionRow(this.tipopuerto.getVersionRow());	
				tipopuertoAux.setcodigo(this.tipopuerto.getcodigo());	
				tipopuertoAux.setnombre(this.tipopuerto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopuertoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopuertoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipopuertoAux,tipopuertoLogic.getTipoPuertos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopuertoAux,tipopuertos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipopuertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopuertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopuertoLogic.saveTipoPuertos();//WithConnection
						//tipopuertoLogic.getSetVersionRowTipoPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopuerto,tipopuertoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipopuertoAux=new  TipoPuerto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipopuertoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipopuertoSessionBean.getEsGuardarRelacionado() && this.tipopuerto.getId()>=0)) {
						
					tipopuertoAux.setIsNew(false);
				}
				
				tipopuertoAux.setIsDeleted(false);
			
				tipopuertoAux.setId(this.tipopuerto.getId());	
				tipopuertoAux.setVersionRow(this.tipopuerto.getVersionRow());	
				tipopuertoAux.setcodigo(this.tipopuerto.getcodigo());	
				tipopuertoAux.setnombre(this.tipopuerto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopuertoAux,tipopuertoLogic.getTipoPuertos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopuertoAux,tipopuertos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipopuertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopuertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopuertoLogic.saveTipoPuertos();//WithConnection
						//tipopuertoLogic.getSetVersionRowTipoPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopuerto,tipopuertoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipopuertoAux=new  TipoPuerto();
				
				tipopuertoAux.setIsNew(false);
				tipopuertoAux.setIsChanged(false);
				
				tipopuertoAux.setIsDeleted(true);
				
				tipopuertoAux.setId(this.tipopuerto.getId());	
				tipopuertoAux.setVersionRow(this.tipopuerto.getVersionRow());	
				tipopuertoAux.setcodigo(this.tipopuerto.getcodigo());	
				tipopuertoAux.setnombre(this.tipopuerto.getnombre());	
				
				if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipopuertoAux.getId()>=0) {	
						this.tipopuertosEliminados.add(tipopuertoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipopuertoAux,tipopuertoLogic.getTipoPuertos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopuertoAux,tipopuertos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipopuertoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopuertoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopuertoLogic.saveTipoPuertos();//WithConnection
						//tipopuertoLogic.getSetVersionRowTipoPuertos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.getTipoPuertos().addAll(this.tipopuertosEliminados);
					
					tipopuertoLogic.saveTipoPuertos();//WithConnection
					//tipopuertoLogic.getSetVersionRowTipoPuertos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipopuertosEliminados= new ArrayList<TipoPuerto>();		
			}
			
			if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Puerto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipopuerto=tipopuertoAux;
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
      		//this.finishProcessTipoPuerto();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPuerto tipopuertoLocal) throws Exception {
		
		if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPuerto tipopuertoLocal) throws Exception {	
		if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoPuertoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipopuertoValidator.getInvalidValues(this.tipopuerto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPuerto tipopuerto,List<TipoPuerto> tipopuertos) throws Exception {
		try	{		
			TipoPuertoConstantesFunciones.actualizarLista(tipopuerto,tipopuertos,this.tipopuertoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPuerto tipopuerto,List<TipoPuerto> tipopuertos) throws Exception {
		try	{			
			TipoPuertoConstantesFunciones.actualizarSelectedLista(tipopuerto,tipopuertos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPuerto> tipopuertosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipopuertosLocal=this.tipopuertoLogic.getTipoPuertos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipopuertosLocal=this.tipopuertos;
			}
			//ARCHITECTURE
		
			for(TipoPuerto tipopuertoLocal:tipopuertosLocal) {
				if(this.permiteMantenimiento(tipopuertoLocal) && tipopuertoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPuertoConstantesFunciones.getTipoPuertoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPuertoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPuerto.jLabelcodigoTipoPuerto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPuertoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPuerto.jLabelnombreTipoPuerto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPuerto.jLabelcodigoTipoPuerto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPuerto.jLabelnombreTipoPuerto,"");
		
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
		this.iIdNuevoTipoPuerto--;	
		
		
		this.tipopuertoAux=new TipoPuerto();
		
		this.tipopuertoAux.setId(this.iIdNuevoTipoPuerto);
		this.tipopuertoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopuertoLogic.getTipoPuertos().add(this.tipopuertoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipopuertos.add(this.tipopuertoAux);
		}
		//ARCHITECTURE
		
		this.tipopuerto=this.tipopuertoAux;
		
		if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPuerto(this.tipopuerto);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPuerto(this.tipopuerto);
		}
				
		//this.setDefaultControlesTipoPuerto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPuerto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPuerto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPuerto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPuerto(this.tipopuertoBean,this.tipopuerto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPuertoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
			classes=TipoPuertoConstantesFunciones.getClassesRelationshipsOfTipoPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipopuertoReturnGeneral=tipopuertoLogic.procesarEventosTipoPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopuertoLogic.getTipoPuertos(),this.tipopuerto,this.tipopuertoParameterGeneral,this.isEsNuevoTipoPuerto,classes);//this.tipopuertoLogic.getTipoPuerto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPuerto(this.tipopuertoReturnGeneral,this.tipopuertoBean,false);
		
		if(this.tipopuertoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto());
		}
		
		if(this.tipopuertoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto(),classes);//this.tipopuertoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPuerto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPuerto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPuerto(false);
						
			if(tipopuertoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPuerto();
			}
			
			this.actualizarVisualTableDatosTipoPuerto();
			
			this.jTableDatosTipoPuerto.setRowSelectionInterval(this.getIndiceNuevoTipoPuerto(), this.getIndiceNuevoTipoPuerto());
			
			this.seleccionarFilaTablaTipoPuertoActual();
						
			this.actualizarEstadoCeldasBotonesTipoPuerto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPuerto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setEnabled(isHabilitar && this.tipopuertoConstantesFunciones.activarcodigoTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setEnabled(isHabilitar && this.tipopuertoConstantesFunciones.activarnombreTipoPuerto);	
		
	};
	
	public void setDefaultControlesTipoPuerto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPuerto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipopuertoSessionBean.setConGuardarRelaciones(true);			
			this.tipopuertoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.setVisible(true);
			
					
		} else {
			//this.tipopuertoSessionBean.setConGuardarRelaciones(false);			
			this.tipopuertoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPuerto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
				if(tipopuertoAux.getId().equals(this.iIdNuevoTipoPuerto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPuerto tipopuertoAux:this.tipopuertos) {
				if(tipopuertoAux.getId().equals(this.iIdNuevoTipoPuerto)) {
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
	
	public int getIndiceActualTipoPuerto(TipoPuerto tipopuerto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
				if(tipopuertoAux.getId().equals(tipopuerto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPuerto tipopuertoAux:this.tipopuertos) {
				if(tipopuertoAux.getId().equals(tipopuerto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPuerto(TipoPuerto tipopuertoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
				if(tipopuertoAux.getTipoPuertoOriginal().getId().equals(tipopuertoOriginal.getId())) {
					existe=true;
					tipopuertoOriginal.setId(tipopuertoAux.getId());
					tipopuertoOriginal.setVersionRow(tipopuertoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPuerto tipopuertoAux:this.tipopuertos) {
				if(tipopuertoAux.getTipoPuertoOriginal().getId().equals(tipopuertoOriginal.getId())) {
					existe=true;
					tipopuertoOriginal.setId(tipopuertoAux.getId());
					tipopuertoOriginal.setVersionRow(tipopuertoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPuerto(Boolean esParaCancelar) throws Exception {
		tipopuertosAux=new ArrayList<TipoPuerto>();
		tipopuertoAux=new TipoPuerto();
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
					if(tipopuertoAux.getId()<0) {
						tipopuertosAux.add(tipopuertoAux);
					}		
				}
				this.iIdNuevoTipoPuerto=0L;
				this.tipopuertoLogic.getTipoPuertos().removeAll(tipopuertosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPuerto tipopuertoAux:this.tipopuertos) {
					if(tipopuertoAux.getId()<0) {
						tipopuertosAux.add(tipopuertoAux);
					}		
				}
				this.iIdNuevoTipoPuerto=0L;
				this.tipopuertos.removeAll(tipopuertosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPuerto 
					&& this.tipopuertoLogic.getTipoPuertos().size()>0
					) {
					tipopuertoAux=this.tipopuertoLogic.getTipoPuertos().get(this.tipopuertoLogic.getTipoPuertos().size() - 1);
				
					if(tipopuertoAux.getId()<0) {
						this.tipopuertoLogic.getTipoPuertos().remove(tipopuertoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPuerto && this.tipopuertos.size()>0) {
					tipopuertoAux=this.tipopuertos.get(this.tipopuertos.size() - 1);
				
					if(tipopuertoAux.getId()<0) {
						this.tipopuertos.remove(tipopuertoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPuerto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipopuerto.getId()<0) {
				this.tipopuertoLogic.getTipoPuertos().remove(this.tipopuerto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipopuerto.getId()<0) {
				this.tipopuertos.remove(this.tipopuerto);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPuerto(List<TipoPuerto> tipopuertosAux) throws Exception {
		TipoPuertoConstantesFunciones.setEstadosInicialesTipoPuerto(tipopuertosAux);
	}
	
	public void setEstadosInicialesTipoPuerto(TipoPuerto tipopuertoAux) throws Exception {
		TipoPuertoConstantesFunciones.setEstadosInicialesTipoPuerto(tipopuertoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPuertoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPuertoActual()) {
				if(!this.isEsNuevoTipoPuerto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPuerto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPuertoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Puerto ?", "MANTENIMIENTO DE Tipo Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPuerto tipopuerto) throws Exception {
		TipoPuertoConstantesFunciones.seleccionarAsignar(this.tipopuerto,tipopuerto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPuerto=this.isPermisoActualizarOriginalTipoPuerto;
			
			
			this.seleccionarAsignar(tipopuerto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPuertoConstantesFunciones.quitarEspaciosTipoPuerto(this.tipopuerto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipopuertoSessionBean.setsFuncionBusquedaRapida(this.tipopuertoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPuerto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPuerto(esParaCancelar);				
				this.cancelarNuevoTipoPuerto(esParaCancelar);								
			}
			
			this.tipopuerto=new TipoPuerto();
			
			this.inicializarTipoPuerto();
			
			this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPuerto() throws Exception {
		try {
			TipoPuertoConstantesFunciones.inicializarTipoPuerto(this.tipopuerto);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipopuertoLogic.getTipoPuertos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPuertos(String sAccionBusqueda,List<TipoPuerto> tipopuertosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPuerto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPuertoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPuertoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPuerto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Puertos");		
		parameters.put("busquedapor", TipoPuertoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPuerto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPuertoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPuertoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPuerto=new JRBeanArrayDataSource(TipoPuertoJInternalFrame.TraerTipoPuertoBeans(tipopuertosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPuerto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPuertoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPuertoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPuertoBean.TraerTipoPuertoBeans(tipopuertosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPuertoActionPerformed(null);
					//this.generarExcelReporteTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPuertos(sAccionBusqueda,sTipoArchivoReporte,tipopuertosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPuerto> tipopuertosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPuertos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPuerto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPuerto tipopuerto : tipopuertosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPuertoConstantesFunciones.generarExcelReporteDataTipoPuerto("NORMAL",row,workbook,tipopuerto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPuerto(String sTipo,Row row,Workbook workbook) {
		
		TipoPuertoConstantesFunciones.generarExcelReporteHeaderTipoPuerto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPuerto> tipopuertosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPuertos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPuerto tipopuerto : tipopuertosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPuertoConstantesFunciones.getTipoPuertoDescripcion(tipopuerto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPuertoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopuerto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPuertoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopuerto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPuertos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPuerto> tipopuertosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPuerto> tipopuertosRespaldo=null;
		
		classes=TipoPuertoConstantesFunciones.getClassesRelationshipsOfTipoPuerto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipopuertoLogic.setDatosCliente(this.datosCliente);
		this.tipopuertoLogic.setDatosDeep(this.datosDeep);
		this.tipopuertoLogic.setIsConDeep(true);
		
		tipopuertosRespaldo=this.tipopuertoLogic.getTipoPuertos();
		
		this.tipopuertoLogic.setTipoPuertos(tipopuertosParaReportes);	
		this.tipopuertoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipopuertosParaReportes=this.tipopuertoLogic.getTipoPuertos();
		this.tipopuertoLogic.setTipoPuertos(tipopuertosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPuertos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPuerto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPuerto tipopuerto : tipopuertosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPuerto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPuertoConstantesFunciones.generarExcelReporteDataTipoPuerto("NORMAL",row,workbook,tipopuerto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPuertoConstantesFunciones.getTipoPuertoDescripcion(tipopuerto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPuerto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPuerto() throws Exception {		
		this.startProcessTipoPuerto(true);
	}
	
	public void startProcessTipoPuerto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoPuerto, this.jScrollPanelDatosTipoPuerto,this.jPanelPaginacionTipoPuerto, this.jScrollPanelDatosEdicionTipoPuerto, this.jPanelAccionesTipoPuerto,this.jPanelAccionesFormularioTipoPuerto,this.jmenuBarTipoPuerto,this.jmenuBarDetalleTipoPuerto,this.jTtoolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPuerto=null; 
		
		final JPanel jPanelParametrosReportesTipoPuerto=this.jPanelParametrosReportesTipoPuerto;
		//final JScrollPane jScrollPanelDatosTipoPuerto=this.jScrollPanelDatosTipoPuerto;
		final JTable jTableDatosTipoPuerto=this.jTableDatosTipoPuerto;		
		final JPanel jPanelPaginacionTipoPuerto=this.jPanelPaginacionTipoPuerto;
		//final JScrollPane jScrollPanelDatosEdicionTipoPuerto=this.jScrollPanelDatosEdicionTipoPuerto;
		final JPanel jPanelAccionesTipoPuerto=this.jPanelAccionesTipoPuerto;
		
		JPanel jPanelCamposAuxiliarTipoPuerto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPuerto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			jPanelCamposAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jPanelCamposTipoPuerto;
			jPanelAccionesFormularioAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jPanelAccionesFormularioTipoPuerto;
		}
		
		final JPanel jPanelCamposTipoPuerto=jPanelCamposAuxiliarTipoPuerto;
		final JPanel jPanelAccionesFormularioTipoPuerto=jPanelAccionesFormularioAuxiliarTipoPuerto;
		
		
		final JMenuBar jmenuBarTipoPuerto=this.jmenuBarTipoPuerto;
		final JToolBar jTtoolBarTipoPuerto=this.jTtoolBarTipoPuerto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPuerto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPuerto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			jmenuBarDetalleAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jmenuBarDetalleTipoPuerto;
			jTtoolBarDetalleAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jTtoolBarDetalleTipoPuerto;
		}
		
		final JMenuBar jmenuBarDetalleTipoPuerto=jmenuBarDetalleAuxiliarTipoPuerto;
		final JToolBar jTtoolBarDetalleTipoPuerto=jTtoolBarDetalleAuxiliarTipoPuerto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPuerto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPuerto;
			processRunnable.jTableDatos=jTableDatosTipoPuerto;
			processRunnable.jPanelCampos=jPanelCamposTipoPuerto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPuerto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPuerto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPuerto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPuerto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPuerto;
			processRunnable.jTtoolBar=jTtoolBarTipoPuerto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPuerto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPuerto ,jPanelParametrosReportesTipoPuerto,jTableDatosTipoPuerto, /*jScrollPanelDatosTipoPuerto,*/jPanelCamposTipoPuerto,jPanelPaginacionTipoPuerto, /*jScrollPanelDatosEdicionTipoPuerto,*/ jPanelAccionesTipoPuerto,jPanelAccionesFormularioTipoPuerto,jmenuBarTipoPuerto,jmenuBarDetalleTipoPuerto,jTtoolBarTipoPuerto,jTtoolBarDetalleTipoPuerto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoPuerto, jScrollPanelDatosTipoPuerto,jPanelPaginacionTipoPuerto, jScrollPanelDatosEdicionTipoPuerto, jPanelAccionesTipoPuerto,jPanelAccionesFormularioTipoPuerto,jmenuBarTipoPuerto,jmenuBarDetalleTipoPuerto,jTtoolBarTipoPuerto,jTtoolBarDetalleTipoPuerto);
						
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
	
	public void finishProcessTipoPuerto() {// throws Exception 
		this.finishProcessTipoPuerto(true);
	}
	
	public void finishProcessTipoPuerto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoPuerto, this.jScrollPanelDatosTipoPuerto,this.jPanelPaginacionTipoPuerto, this.jScrollPanelDatosEdicionTipoPuerto, this.jPanelAccionesTipoPuerto,this.jPanelAccionesFormularioTipoPuerto,this.jmenuBarTipoPuerto,this.jmenuBarDetalleTipoPuerto,this.jTtoolBarTipoPuerto,this.jTtoolBarDetalleTipoPuerto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPuerto=null; 
		
		final JPanel jPanelParametrosReportesTipoPuerto=this.jPanelParametrosReportesTipoPuerto;
		//final JScrollPane jScrollPanelDatosTipoPuerto=this.jScrollPanelDatosTipoPuerto;
		final JTable jTableDatosTipoPuerto=this.jTableDatosTipoPuerto;		
		final JPanel jPanelPaginacionTipoPuerto=this.jPanelPaginacionTipoPuerto;
		//final JScrollPane jScrollPanelDatosEdicionTipoPuerto=this.jScrollPanelDatosEdicionTipoPuerto;
		final JPanel jPanelAccionesTipoPuerto=this.jPanelAccionesTipoPuerto;
		
		JPanel jPanelCamposAuxiliarTipoPuerto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPuerto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			jPanelCamposAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jPanelCamposTipoPuerto;
			jPanelAccionesFormularioAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jPanelAccionesFormularioTipoPuerto;
		}
		
		final JPanel jPanelCamposTipoPuerto=jPanelCamposAuxiliarTipoPuerto;
		final JPanel jPanelAccionesFormularioTipoPuerto=jPanelAccionesFormularioAuxiliarTipoPuerto;
		
		
		final JMenuBar jmenuBarTipoPuerto=this.jmenuBarTipoPuerto;		
		final JToolBar jTtoolBarTipoPuerto=this.jTtoolBarTipoPuerto;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPuerto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPuerto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			jmenuBarDetalleAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jmenuBarDetalleTipoPuerto;
			jTtoolBarDetalleAuxiliarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jTtoolBarDetalleTipoPuerto;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPuerto=jmenuBarDetalleAuxiliarTipoPuerto;
		final JToolBar jTtoolBarDetalleTipoPuerto=jTtoolBarDetalleAuxiliarTipoPuerto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPuerto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPuerto;
			processRunnable.jTableDatos=jTableDatosTipoPuerto;
			processRunnable.jPanelCampos=jPanelCamposTipoPuerto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPuerto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPuerto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPuerto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPuerto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPuerto;
			processRunnable.jTtoolBar=jTtoolBarTipoPuerto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPuerto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPuerto ,jPanelParametrosReportesTipoPuerto, jTableDatosTipoPuerto,/*jScrollPanelDatosTipoPuerto,*/jPanelCamposTipoPuerto,jPanelPaginacionTipoPuerto, /*jScrollPanelDatosEdicionTipoPuerto,*/ jPanelAccionesTipoPuerto,jPanelAccionesFormularioTipoPuerto,jmenuBarTipoPuerto,jmenuBarDetalleTipoPuerto,jTtoolBarTipoPuerto,jTtoolBarDetalleTipoPuerto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPuerto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPuerto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPuerto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPuerto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPuerto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPuerto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPuerto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPuerto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPuerto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipopuertoConstantesFunciones.getsFinalQueryTipoPuerto();
		String  finalQueryPaginacionTodos=this.tipopuertoConstantesFunciones.getsFinalQueryTipoPuerto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPuertoConstantesFunciones.getArrayColumnasGlobalesNoTipoPuerto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPuertoConstantesFunciones.getArrayColumnasGlobalesTipoPuerto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPuertoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipopuertosEliminados= new ArrayList<TipoPuerto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPuerto();
		
				///*TipoPuertoSessionBean*/this.tipopuertoSessionBean=new TipoPuertoSessionBean();
			
			if(this.tipopuertoSessionBean==null) {
				this.tipopuertoSessionBean=new TipoPuertoSessionBean();
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
					this.iNumeroPaginacion=TipoPuertoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPuertoConstantesFunciones.getClassesForeignKeysOfTipoPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipopuerto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipopuertosAux= new ArrayList<TipoPuerto>();
			
				
			tipopuertoLogic.setDatosCliente(this.datosCliente);
			tipopuertoLogic.setDatosDeep(this.datosDeep);
			tipopuertoLogic.setIsConDeep(true);
			
			
			tipopuertoLogic.getTipoPuertoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipopuertoLogic.getTodosTipoPuertos(finalQueryGlobal,pagination);
					
					//tipopuertoLogic.getTodosTipoPuertosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipopuertoLogic.getTipoPuertos()==null|| tipopuertoLogic.getTipoPuertos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopuertosAux= new ArrayList<TipoPuerto>();
							tipopuertosAux.addAll(tipopuertoLogic.getTipoPuertos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopuertosAux= new ArrayList<TipoPuerto>();
							tipopuertosAux.addAll(tipopuertos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopuertoLogic.getTodosTipoPuertos(finalQueryGlobal+"",this.pagination);												
							
							//tipopuertoLogic.getTodosTipoPuertosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPuertos("Todos",tipopuertoLogic.getTipoPuertos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopuertoLogic.setTipoPuertos(new ArrayList<TipoPuerto>());					
							tipopuertoLogic.getTipoPuertos().addAll(tipopuertosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopuertos=new ArrayList<TipoPuerto>();
							tipopuertos.addAll(tipopuertosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPuerto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPuerto=this.idActual;
				
				} else if(this.idTipoPuertoActual!=null && this.idTipoPuertoActual!=0L) {
					idTipoPuerto=idTipoPuertoActual;
				}
				
					
				this.sDetalleReporte=TipoPuertoConstantesFunciones.getDetalleIndicePorId(idTipoPuerto);
				
				this.tipopuertos=new ArrayList<TipoPuerto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipopuertoLogic.getEntity(idTipoPuerto);
					
					//tipopuertoLogic.getEntityWithConnection(idTipoPuerto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopuertoLogic.setTipoPuertos(new ArrayList<TipoPuerto>());
					tipopuertoLogic.getTipoPuertos().add(tipopuertoLogic.getTipoPuerto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopuertos=new ArrayList<TipoPuerto>();
					this.tipopuertos.add(tipopuerto);
				}
				
				if(tipopuertoLogic.getTipoPuerto()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPuerto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPuerto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopuertoLogic.getTipoPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopuertos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopuertoLogic.getTipoPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopuertos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPuerto tipopuerto) {
		Boolean permite=true;
		
		if(this.tipopuerto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPuertoConstantesFunciones.getOrderByListaTipoPuerto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPuertoConstantesFunciones.getOrderByListaTipoPuerto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPuerto tipopuerto:tipopuertoLogic.getTipoPuertos()) {
				if(tipopuerto.getsType().equals(Constantes2.S_TOTALES)) {
					tipopuertoTotales=tipopuerto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPuerto tipopuerto:this.tipopuertos) {
				if(tipopuerto.getsType().equals(Constantes2.S_TOTALES)) {
					tipopuertoTotales=tipopuerto;
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
			this.tipopuertoAux=new TipoPuerto();
			this.tipopuertoAux.setsType(Constantes2.S_TOTALES);
			this.tipopuertoAux.setIsNew(false);
			this.tipopuertoAux.setIsChanged(false);
			this.tipopuertoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPuertoConstantesFunciones.TotalizarValoresFilaTipoPuerto(this.tipopuertoLogic.getTipoPuertos(),this.tipopuertoAux);
				
				this.tipopuertoLogic.getTipoPuertos().add(this.tipopuertoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPuertoConstantesFunciones.TotalizarValoresFilaTipoPuerto(this.tipopuertos,this.tipopuertoAux);
				
				this.tipopuertos.add(this.tipopuertoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipopuertoTotales=new TipoPuerto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopuertoLogic.getTipoPuertos().remove(tipopuertoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopuertos.remove(tipopuertoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipopuertoTotales=new TipoPuerto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPuerto tipopuerto:tipopuertoLogic.getTipoPuertos()) {
				if(tipopuerto.getsType().equals(Constantes2.S_TOTALES)) {
					tipopuertoTotales=tipopuerto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPuertoConstantesFunciones.TotalizarValoresFilaTipoPuerto(this.tipopuertoLogic.getTipoPuertos(),tipopuertoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPuerto tipopuerto:this.tipopuertos) {
				if(tipopuerto.getsType().equals(Constantes2.S_TOTALES)) {
					tipopuertoTotales=tipopuerto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPuertoConstantesFunciones.TotalizarValoresFilaTipoPuerto(this.tipopuertos,tipopuertoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoPuerto() {
		this.isPermisoTodoTipoPuerto=false;
		this.isPermisoNuevoTipoPuerto=false;
		this.isPermisoActualizarTipoPuerto=false;
		this.isPermisoActualizarOriginalTipoPuerto=false;
		this.isPermisoEliminarTipoPuerto=false;
		this.isPermisoGuardarCambiosTipoPuerto=false;
		this.isPermisoConsultaTipoPuerto=false;
		this.isPermisoBusquedaTipoPuerto=false;
		this.isPermisoReporteTipoPuerto=false;		
		this.isPermisoOrdenTipoPuerto=false;		
		this.isPermisoPaginacionMedioTipoPuerto=false;		
		this.isPermisoPaginacionAltoTipoPuerto=false;
		this.isPermisoPaginacionTodoTipoPuerto=false;
		this.isPermisoCopiarTipoPuerto=false;		
		this.isPermisoVerFormTipoPuerto=false;		
		this.isPermisoDuplicarTipoPuerto=false;		
		this.isPermisoOrdenTipoPuerto=false;		
	}
	
	public void setPermisosUsuarioTipoPuerto(Boolean isPermiso) {
		this.isPermisoTodoTipoPuerto=isPermiso;
		this.isPermisoNuevoTipoPuerto=isPermiso;
		this.isPermisoActualizarTipoPuerto=isPermiso;
		this.isPermisoActualizarOriginalTipoPuerto=isPermiso;
		this.isPermisoEliminarTipoPuerto=isPermiso;
		this.isPermisoGuardarCambiosTipoPuerto=isPermiso;
		this.isPermisoConsultaTipoPuerto=isPermiso;
		this.isPermisoBusquedaTipoPuerto=isPermiso;
		this.isPermisoReporteTipoPuerto=isPermiso;
		this.isPermisoOrdenTipoPuerto=isPermiso;		
		this.isPermisoPaginacionMedioTipoPuerto=isPermiso;		
		this.isPermisoPaginacionAltoTipoPuerto=isPermiso;		
		this.isPermisoPaginacionTodoTipoPuerto=isPermiso;		
		this.isPermisoCopiarTipoPuerto=isPermiso;		
		this.isPermisoVerFormTipoPuerto=isPermiso;		
		this.isPermisoDuplicarTipoPuerto=isPermiso;
		this.isPermisoOrdenTipoPuerto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPuerto(Boolean isPermiso) {
		//this.isPermisoTodoTipoPuerto=isPermiso;
		this.isPermisoNuevoTipoPuerto=isPermiso;
		this.isPermisoActualizarTipoPuerto=isPermiso;
		this.isPermisoActualizarOriginalTipoPuerto=isPermiso;
		this.isPermisoEliminarTipoPuerto=isPermiso;
		this.isPermisoGuardarCambiosTipoPuerto=isPermiso;
		//this.isPermisoConsultaTipoPuerto=isPermiso;
		//this.isPermisoBusquedaTipoPuerto=isPermiso;
		//this.isPermisoReporteTipoPuerto=isPermiso;
		//this.isPermisoOrdenTipoPuerto=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPuerto=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPuerto=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPuerto=isPermiso;		
		//this.isPermisoCopiarTipoPuerto=isPermiso;		
		//this.isPermisoDuplicarTipoPuerto=isPermiso;
		//this.isPermisoOrdenTipoPuerto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPuertoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPuerto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPuertoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPuertoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPuertoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPuertoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPuerto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPuertoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPuerto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPuerto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPuerto=this.isPermisoActualizarTipoPuerto;
			this.isPermisoEliminarTipoPuerto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPuerto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPuerto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPuerto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPuerto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPuerto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPuerto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPuerto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPuerto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPuerto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPuerto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPuerto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPuerto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPuerto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPuerto.setToolTipText(this.jTableDatosTipoPuerto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPuerto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPuerto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPuerto() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoPuertoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPuertoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPuertoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPuertoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoPuertoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPuerto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoPuerto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPuerto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPuerto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPuerto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPuerto(TipoPuerto tipopuerto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPuerto(TipoPuerto tipopuerto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPuerto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPuerto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPuerto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPuerto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPuerto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPuerto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPuerto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPuerto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoPuertoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPuertoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPuertoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipopuertoSessionBean=new TipoPuertoSessionBean(); 
		this.tipopuertoConstantesFunciones=new TipoPuertoConstantesFunciones(); 
		this.tipopuertoBean=new TipoPuerto();//(this.tipopuertoConstantesFunciones); 		
		this.tipopuertoReturnGeneral=new TipoPuertoParameterReturnGeneral(); 
		
		this.tipopuertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopuertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPuertoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPuerto(true);
			
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
			
			this.tipopuertoConstantesFunciones=new TipoPuertoConstantesFunciones(); 
			this.tipopuertoBean=new TipoPuerto();//this.tipopuertoConstantesFunciones); 			
			this.tipopuertoReturnGeneral=new TipoPuertoParameterReturnGeneral(); 
		
			TipoPuertoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Puerto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipopuerto=new TipoPuerto();
			this.tipopuertos = new ArrayList<TipoPuerto>();
			this.tipopuertosAux = new ArrayList<TipoPuerto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic=new TipoPuertoLogic();
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipopuertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipopuertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPuerto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPuerto);	
					}
					
					if(this.jInternalFrameImportacionTipoPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPuerto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPuerto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPuerto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPuerto);
				this.jInternalFrameDetalleFormTipoPuerto.setVisible(false);
				this.jInternalFrameDetalleFormTipoPuerto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPuerto);
					this.jInternalFrameReporteDinamicoTipoPuerto.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPuerto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPuerto);
					this.jInternalFrameImportacionTipoPuerto.setVisible(false);
					this.jInternalFrameImportacionTipoPuerto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPuerto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPuerto);
					this.jInternalFrameOrderByTipoPuerto.setVisible(false);
					this.jInternalFrameOrderByTipoPuerto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPuertoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPuertoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipopuertoReturnGeneral=new TipoPuertoParameterReturnGeneral();
			
			this.tipopuertoParameterGeneral=new TipoPuertoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipopuertoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPuertoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPuertoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopuertoSessionBean.getEsGuardarRelacionado(),this.tipopuertoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPuertoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopuertoSessionBean.getEsGuardarRelacionado(),this.tipopuertoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaDuplicarTipoPuerto=true;
			this.isVisibilidadCeldaCopiarTipoPuerto=true;
			this.isVisibilidadCeldaVerFormTipoPuerto=true;
			this.isVisibilidadCeldaOrdenTipoPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=false;
			this.isVisibilidadCeldaGuardarTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPuerto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPuerto(false);
			
			this.setPermisosUsuarioTipoPuerto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipopuertoSessionBean.getEsGuardarRelacionado() && this.tipopuertoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPuertoClasesRelacionadas();
			}
			
			if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPuertoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPuerto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPuerto();
			}
			
			if(!this.isPermisoBusquedaTipoPuerto) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPuerto,this.isPermisoPaginacionMedioTipoPuerto,this.isPermisoPaginacionTodoTipoPuerto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPuertoConstantesFunciones.getTiposSeleccionarTipoPuerto());
				
				this.tiposColumnasSelect=TipoPuertoConstantesFunciones.getTiposSeleccionarTipoPuerto(true);
				
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
			//if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPuerto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoPuerto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoPuerto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPuerto() ;
			
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
				tipopuertoImplementable= (TipoPuertoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPuertoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipopuertoImplementableHome= (TipoPuertoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPuertoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipopuertos= new ArrayList<TipoPuerto>();
			this.tipopuertosEliminados= new ArrayList<TipoPuerto>();
						
			this.isEsNuevoTipoPuerto=false;
			this.esParaAccionDesdeFormularioTipoPuerto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPuerto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPuerto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPuertoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPuerto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPuerto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPuerto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPuerto();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPuerto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPuerto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPuerto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPuerto")) {
				iIndex=this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPuerto();	
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
	
	public void cargarCombosForeignKeyTipoPuerto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPuerto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPuerto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPuertoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPuerto();
		
		this.cargarCombosFrameForeignKeyTipoPuerto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPuerto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPuerto();
		}
	}
	
	
	
	public void jButtonNuevoTipoPuertoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			
			if(jTableDatosTipoPuerto.getRowCount()>=1) {
				jTableDatosTipoPuerto.removeRowSelectionInterval(0, jTableDatosTipoPuerto.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPuerto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPuerto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPuerto(true);			
			//this.tipopuerto=new TipoPuerto();
			//this.tipopuerto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPuerto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPuerto() ;
			
			if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPuerto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipopuerto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);				
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPuerto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPuertoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPuerto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPuerto.getSelectedRows().length;			
			}
			
			tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPuerto--;			
				//TipoPuerto tipopuertoAux= new TipoPuerto();			
				//tipopuertoAux.setId(this.iIdNuevoTipoPuerto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPuerto tipopuertoOrigen=new TipoPuerto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPuerto tipopuertoOrigen : tipopuertosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipopuertoOrigen =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopuertoOrigen =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPuerto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipopuerto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPuerto(tipopuertoOrigen,this.tipopuerto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopuertoLogic.getTipoPuertos().add(this.tipopuertoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopuertos.add(this.tipopuertoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPuerto(false);
				
				this.jTableDatosTipoPuerto.setRowSelectionInterval(this.getIndiceNuevoTipoPuerto(), this.getIndiceNuevoTipoPuerto());
				
				int iLastRow =  this.jTableDatosTipoPuerto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPuerto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPuerto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPuerto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();									
		
			TipoPuerto tipopuertoOrigen=new TipoPuerto();
			TipoPuerto tipopuertoDestino=new TipoPuerto();
				
			tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPuerto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipopuertosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPuerto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopuertoOrigen =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopuertoOrigen =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopuertoDestino =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopuertoDestino =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipopuertoOrigen =tipopuertosSeleccionados.get(0);
				tipopuertoDestino =tipopuertosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPuerto(tipopuertoOrigen,tipopuertoDestino,true,false);
				
				tipopuertoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopuertoDestino,tipopuertoLogic.getTipoPuertos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopuertoDestino,tipopuertos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPuerto(false);
				
				//this.jTableDatosTipoPuerto.setRowSelectionInterval(this.getIndiceNuevoTipoPuerto(), this.getIndiceNuevoTipoPuerto());
				
				int iLastRow =  this.jTableDatosTipoPuerto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPuerto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPuerto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPuerto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPuerto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPuerto.isVisible();
			
			
			this.jPanelParametrosReportesTipoPuerto.setVisible(!isVisible);
			this.jPanelPaginacionTipoPuerto.setVisible(!isVisible);
			this.jPanelAccionesTipoPuerto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPuerto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPuerto();
			
			this.abrirFrameOrderByTipoPuerto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPuerto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPuerto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPuerto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPuerto.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPuerto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPuerto.setSize(this.jInternalFrameDetalleFormTipoPuerto.iWidthFormulario,this.jInternalFrameDetalleFormTipoPuerto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPuerto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPuerto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPuerto.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPuerto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPuerto.jContentPaneDetalleTipoPuerto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPuerto.jContentPaneDetalleTipoPuerto.getWidth(),TipoPuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPuerto.jContentPaneDetalleTipoPuerto.getWidth(),TipoPuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPuerto.jContentPaneDetalleTipoPuerto.getWidth(),TipoPuertoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPuerto.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPuerto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPuerto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPuerto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPuerto,false,this);
				} else {
					this.jInternalFrameOrderByTipoPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPuerto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPuerto);
				this.jInternalFrameOrderByTipoPuerto.setVisible(false);
				this.jInternalFrameOrderByTipoPuerto.setSelected(false);
				
				this.jInternalFrameOrderByTipoPuerto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPuerto"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPuerto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPuerto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPuerto==null) {
				
				this.jInternalFrameImportacionTipoPuerto=new ImportacionJInternalFrame(TipoPuertoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPuerto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPuerto);
				this.jInternalFrameImportacionTipoPuerto.setVisible(false);
				this.jInternalFrameImportacionTipoPuerto.setSelected(false);


				this.jInternalFrameImportacionTipoPuerto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPuerto"));
				this.jInternalFrameImportacionTipoPuerto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPuerto"));
				this.jInternalFrameImportacionTipoPuerto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPuerto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPuerto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPuerto==null) {
				this.jInternalFrameReporteDinamicoTipoPuerto=new ReporteDinamicoJInternalFrame(TipoPuertoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPuerto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPuerto);
				this.jInternalFrameReporteDinamicoTipoPuerto.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPuerto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPuerto"));
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPuerto"));
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPuerto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPuerto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoPuerto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPuerto);
			
	       	this.jInternalFrameDetalleFormTipoPuerto.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPuerto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPuerto.dispose();
			//this.jInternalFrameDetalleFormTipoPuerto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPuerto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPuerto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPuerto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPuerto.setVisible(true);
	        this.jInternalFrameImportacionTipoPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPuerto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPuerto.setVisible(true);
	        this.jInternalFrameOrderByTipoPuerto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPuerto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPuerto.setVisible(false);
	        this.jInternalFrameOrderByTipoPuerto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPuerto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPuerto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPuerto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPuerto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPuerto.setVisible(false);
	        this.jInternalFrameImportacionTipoPuerto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPuerto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPuerto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPuerto(true);
			//this.isEsNuevoTipoPuerto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPuerto(false) ;
			
			if(tipopuertoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPuerto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPuerto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPuertoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPuerto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPuerto(true);
			//this.isEsNuevoTipoPuerto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipopuerto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPuerto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPuerto(false) ;
			
			if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPuerto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPuerto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPuerto(false);
			
			//if(!this.isEsNuevoTipoPuerto) {								
				int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
				
			}
			
			if(this.permiteMantenimiento(this.tipopuerto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPuerto=true;
					this.inicializarActualizarBindingTablaTipoPuerto(false);
					this.isEsNuevoTipoPuerto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPuerto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPuerto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPuerto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPuerto(false);
				
				this.habilitarDeshabilitarControlesTipoPuerto(false);
			
												
				
				if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPuerto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPuertoActionPerformed(evt,tipopuertoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPuerto(this.tipopuerto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPuerto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipopuertoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipopuerto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				this.tipopuerto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				this.tipopuerto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipopuerto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPuertoModel) this.jTableDatosTipoPuerto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPuerto=true;
				this.inicializarActualizarBindingTablaTipoPuerto(false);
				this.isEsNuevoTipoPuerto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPuerto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPuerto(false);
				
				this.habilitarDeshabilitarControlesTipoPuerto(false);
				
				
				
				if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPuerto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPuertoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPuerto.getRowCount()>=1) {
				jTableDatosTipoPuerto.removeRowSelectionInterval(0, jTableDatosTipoPuerto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPuerto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPuerto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPuerto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPuerto(false) ;
			
			this.isEsNuevoTipoPuerto=false;
			
			if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPuerto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPuerto(false);
				
				//SI ES MANUAL
				if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPuerto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPuerto--;			
			//TipoPuerto tipopuertoAux= new TipoPuerto();			
			//tipopuertoAux.setId(this.iIdNuevoTipoPuerto);
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPuerto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
			
			this.tipopuerto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipopuertoLogic.getTipoPuertos().add(this.tipopuertoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipopuertos.add(this.tipopuertoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPuerto(false);
			
			this.jTableDatosTipoPuerto.setRowSelectionInterval(this.getIndiceNuevoTipoPuerto(), this.getIndiceNuevoTipoPuerto());
			
			int iLastRow =  this.jTableDatosTipoPuerto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPuerto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPuerto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPuerto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPuerto(false);
			
			//SI ES MANUAL
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPuerto();
			}
			
			//this.abrirFrameTreeTipoPuerto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PuertoS ?", "MANTENIMIENTO DE Tipo Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPuerto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPuerto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipopuertoReturnGeneral=tipopuertoLogic.procesarImportacionTipoPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipopuertoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPuertoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPuerto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPuerto.setFileImportacion(this.jInternalFrameImportacionTipoPuerto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPuerto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPuerto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPuerto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPuerto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		

		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPuertoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPuertoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPuertoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPuertoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPuerto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPuertoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPuertoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPuertoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPuertoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPuertoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPuertoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPuertoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPuertos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPuertoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPuerto tipopuerto:tipopuertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopuerto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPuertoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPuerto tipopuerto:tipopuertosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopuerto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPuerto(row);				
			//	iRow++;
			//}				
			
			//for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPuerto(tipopuertoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPuerto(false);
			
			//SI ES MANUAL
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPuerto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPuerto(false);
			
			//SI ES MANUAL
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPuerto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPuertoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPuerto(false);
			
			//SI ES MANUAL
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPuerto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopuertoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPuerto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPuerto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPuerto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPuerto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPuerto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPuerto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPuerto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPuerto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPuerto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPuerto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPuerto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPuerto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPuerto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPuerto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPuerto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPuerto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPuerto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPuerto();
		
		this.inicializarActualizarBindingBotonesManualTipoPuerto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPuerto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPuerto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPuerto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPuerto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPuerto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPuerto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPuerto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionNuevoTipoPuerto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionSinCerrarTipoPuerto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionSinMensajeTipoPuerto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPuerto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPuerto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPuerto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
				this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionNuevoTipoPuerto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionSinCerrarTipoPuerto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPuerto.jCheckBoxPostAccionSinMensajeTipoPuerto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPuerto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPuerto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPuerto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPuerto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPuerto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPuerto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPuerto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPuerto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPuerto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPuerto(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPuerto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPuerto() throws Exception {
		try	{
			if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPuerto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPuerto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPuerto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPuerto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPuerto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPuerto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPuerto.addItem(reporte);
			}
			
			
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPuerto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPuerto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPuerto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPuerto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPuerto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPuerto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPuerto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPuerto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPuerto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
				this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
				this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPuerto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPuerto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPuerto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPuerto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPuerto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPuerto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPuerto(Boolean esInicializar) throws Exception {				
		if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPuerto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPuerto() throws Exception {
		this.inicializarActualizarBindingTablaTipoPuerto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPuerto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPuertoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPuertoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPuerto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipopuertoLogic.getTipoPuertos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipopuertos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPuerto.setModel(new TipoPuertoModel(this.tipopuertoLogic.getTipoPuertos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPuerto.setModel(new TipoPuertoModel(this.tipopuertos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPuerto!=null && this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPuerto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO,tipopuertoConstantesFunciones.resaltarSeleccionarTipoPuerto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO,tipopuertoConstantesFunciones.resaltarSeleccionarTipoPuerto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,TipoPuertoConstantesFunciones.LABEL_ID));

		if(this.tipopuertoConstantesFunciones.mostraridTipoPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPuertoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipopuertoConstantesFunciones.resaltaridTipoPuerto,this.tipopuertoConstantesFunciones.activaridTipoPuerto,this,true,"idTipoPuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopuertoConstantesFunciones.resaltaridTipoPuerto,this.tipopuertoConstantesFunciones.activaridTipoPuerto,this,true,"idTipoPuerto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,TipoPuertoConstantesFunciones.LABEL_CODIGO));

		if(this.tipopuertoConstantesFunciones.mostrarcodigoTipoPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPuertoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopuertoConstantesFunciones.resaltarcodigoTipoPuerto,this.tipopuertoConstantesFunciones.activarcodigoTipoPuerto,this,true,"codigoTipoPuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopuertoConstantesFunciones.resaltarcodigoTipoPuerto,this.tipopuertoConstantesFunciones.activarcodigoTipoPuerto,this,true,"codigoTipoPuerto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,TipoPuertoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipopuertoConstantesFunciones.mostrarnombreTipoPuerto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPuertoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopuertoConstantesFunciones.resaltarnombreTipoPuerto,this.tipopuertoConstantesFunciones.activarnombreTipoPuerto,this,true,"nombreTipoPuerto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopuertoConstantesFunciones.resaltarnombreTipoPuerto,this.tipopuertoConstantesFunciones.activarnombreTipoPuerto,this,true,"nombreTipoPuerto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPuertoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPuerto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPuerto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipopuertoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPuerto.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPuerto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPuerto.moveColumn(this.jTableDatosTipoPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPuerto.moveColumn(this.jTableDatosTipoPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPuerto.moveColumn(this.jTableDatosTipoPuerto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPuerto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPuerto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPuerto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPuerto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPuerto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPuerto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPuerto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPuerto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipopuertoLogic.getTipoPuertos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipopuertos.size()-1;
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
		//this.jTableDatosTipoPuerto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPuerto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPuerto();
			
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
				
				//this.isEsNuevoTipoPuerto=false;
					
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
				if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPuerto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPuerto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPuerto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipopuerto.getsType().equals("DUPLICADO")
				   || this.tipopuerto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPuerto=true;
				
				} else {
					this.isEsNuevoTipoPuerto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipopuerto.getId()>=0 && !this.tipopuerto.getIsNew()) {						
						this.isEsNuevoTipoPuerto=false;
						
					} else {
						this.isEsNuevoTipoPuerto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPuerto(esRelaciones);						
				
				this.seleccionarTipoPuerto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipopuerto.getId()<0) {
					this.isEsNuevoTipoPuerto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPuerto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPuerto(evt,rowIndex);
				}	
				
				if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPuerto: " + this.dDif); 
					}
				}								
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPuerto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipopuerto)) {
					if(this.tipopuerto.getId()>0) {
						this.tipopuerto.setIsDeleted(true);
						
						this.tipopuertosEliminados.add(this.tipopuerto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopuertoLogic.getTipoPuertos().remove(this.tipopuerto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopuertos.remove(this.tipopuerto);				
					}
					
					
					((TipoPuertoModel) this.jTableDatosTipoPuerto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPuerto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPuerto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPuerto) {
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPuerto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPuerto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPuerto(this.tipopuerto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPuerto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPuerto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPuerto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPuerto(TipoPuerto tipopuerto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPuerto(tipopuerto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPuerto(TipoPuerto tipopuerto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPuerto(tipopuerto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPuerto(tipopuerto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPuerto(tipopuerto);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPuerto(TipoPuerto tipopuerto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setText(tipopuerto.getId().toString());
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setText(tipopuerto.getcodigo());
			this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setText(tipopuerto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPuerto tipopuertoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipopuertoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPuerto tipopuertoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipopuertoLocal=this.tipopuerto;
			} else {
				tipopuertoLocal=this.tipopuertoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipopuertoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPuerto(tipopuertoLocal,true);
					
					if(tipopuertoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipopuertoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipopuertoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPuerto(TipoPuerto tipopuerto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPuerto(tipopuerto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(tipopuerto);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPuerto(TipoPuerto tipopuerto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPuerto(tipopuerto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPuerto(TipoPuerto tipopuerto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.getText()==null || this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.getText()=="" || this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setText("0");
			}

			if(conColumnasBase) {tipopuerto.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPuertoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPuerto.jLabelIdTipoPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopuerto.setcodigo(this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPuertoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPuerto.jLabelcodigoTipoPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopuerto.setnombre(this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPuertoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPuerto.jLabelnombreTipoPuerto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPuerto(TipoPuerto tipopuertoBean,TipoPuerto tipopuerto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPuerto(TipoPuerto tipopuertoOrigen,TipoPuerto tipopuerto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopuertoOrigen.getId()!=null && !tipopuertoOrigen.getId().equals(0L))) {tipopuerto.setId(tipopuertoOrigen.getId());}}
			if(conDefault || (!conDefault && tipopuertoOrigen.getcodigo()!=null && !tipopuertoOrigen.getcodigo().equals(""))) {tipopuerto.setcodigo(tipopuertoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipopuertoOrigen.getnombre()!=null && !tipopuertoOrigen.getnombre().equals(""))) {tipopuerto.setnombre(tipopuertoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPuerto(TipoPuerto tipopuerto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setText(tipopuerto.getId().toString());
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setText(tipopuerto.getcodigo());
			this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setText(tipopuerto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPuerto(TipoPuertoBean tipopuertoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setText(tipopuertoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setText(tipopuertoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setText(tipopuertoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPuerto(TipoPuertoParameterReturnGeneral tipopuertoReturnGeneral,TipoPuertoBean tipopuertoBean,Boolean conDefault) throws Exception { 
		try {
			TipoPuerto tipopuertoLocal=new TipoPuerto();
			
			tipopuertoLocal=tipopuertoReturnGeneral.getTipoPuerto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopuertoLocal.getId()!=null && !tipopuertoLocal.getId().equals(0L))) {tipopuertoBean.setId(tipopuertoLocal.getId());}}
			if(conDefault || (!conDefault && tipopuertoLocal.getcodigo()!=null && !tipopuertoLocal.getcodigo().equals(""))) {tipopuertoBean.setcodigo(tipopuertoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipopuertoLocal.getnombre()!=null && !tipopuertoLocal.getnombre().equals(""))) {tipopuertoBean.setnombre(tipopuertoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPuertoGenerico(Long idTipoPuertoSeleccionado,JComboBox jComboBoxTipoPuerto,List<TipoPuerto> tipopuertosLocal)throws Exception {
		try {
			TipoPuerto  tipopuertoTemp=null;

			for(TipoPuerto tipopuertoAux:tipopuertosLocal) {
				if(tipopuertoAux.getId()!=null && tipopuertoAux.getId().equals(idTipoPuertoSeleccionado)) {
					tipopuertoTemp=tipopuertoAux;
					break;
				}
			}

			jComboBoxTipoPuerto.setSelectedItem(tipopuertoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPuertoGenerico(JComboBox jComboBoxTipoPuerto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPuerto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPuerto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPuerto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPuerto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopuerto=(TipoPuerto) tipopuertoLogic.getTipoPuertos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopuerto =(TipoPuerto) tipopuertos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPuerto tipopuertoRow=new TipoPuerto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopuertoRow=(TipoPuerto) tipopuertoLogic.getTipoPuertos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopuertoRow=(TipoPuerto) tipopuertos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPuerto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto));			
			this.jButtonDuplicarTipoPuerto.setVisible((this.isVisibilidadCeldaDuplicarTipoPuerto && this.isPermisoDuplicarTipoPuerto));			
			this.jButtonCopiarTipoPuerto.setVisible((this.isVisibilidadCeldaCopiarTipoPuerto && this.isPermisoCopiarTipoPuerto));
			this.jButtonVerFormTipoPuerto.setVisible((this.isVisibilidadCeldaVerFormTipoPuerto && this.isPermisoVerFormTipoPuerto));
			
			this.jButtonAbrirOrderByTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));			
			
			this.jButtonNuevoRelacionesTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPuerto && this.isPermisoNuevoTipoPuerto));			
			this.jButtonNuevoGuardarCambiosTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarTipoPuerto.setVisible((this.isVisibilidadCeldaModificarTipoPuerto && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.setVisible((this.isVisibilidadCeldaActualizarTipoPuerto && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.setVisible((this.isVisibilidadCeldaEliminarTipoPuerto && this.isPermisoEliminarTipoPuerto));
			this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.setVisible(this.isVisibilidadCeldaCancelarTipoPuerto);							
			this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto));						
			this.jButtonDuplicarToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaDuplicarTipoPuerto && this.isPermisoDuplicarTipoPuerto));						
			this.jButtonCopiarToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaCopiarTipoPuerto && this.isPermisoCopiarTipoPuerto));			
			this.jButtonVerFormToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaVerFormTipoPuerto && this.isPermisoVerFormTipoPuerto));			
			this.jButtonAbrirOrderByToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));
			this.jButtonNuevoRelacionesToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPuerto && this.isPermisoNuevoTipoPuerto));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));			
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaModificarTipoPuerto && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaActualizarTipoPuerto  && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaEliminarTipoPuerto && this.isPermisoEliminarTipoPuerto));
			this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarToolBarTipoPuerto.setVisible(this.isVisibilidadCeldaCancelarTipoPuerto);				
			this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto));			
			this.jMenuItemDuplicarTipoPuerto.setVisible((this.isVisibilidadCeldaDuplicarTipoPuerto && this.isPermisoDuplicarTipoPuerto));			
			this.jMenuItemCopiarTipoPuerto.setVisible((this.isVisibilidadCeldaCopiarTipoPuerto && this.isPermisoCopiarTipoPuerto));			
			this.jMenuItemVerFormTipoPuerto.setVisible((this.isVisibilidadCeldaVerFormTipoPuerto && this.isPermisoVerFormTipoPuerto));			
			this.jMenuItemAbrirOrderByTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));			
			//this.jMenuItemMostrarOcultarTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));
			this.jMenuItemDetalleAbrirOrderByTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));			
			//this.jMenuItemDetalleMostrarOcultarTipoPuerto.setVisible((this.isVisibilidadCeldaOrdenTipoPuerto && this.isPermisoOrdenTipoPuerto));			
			this.jMenuItemNuevoRelacionesTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPuerto && this.isPermisoNuevoTipoPuerto));			
			this.jMenuItemNuevoGuardarCambiosTipoPuerto.setVisible((this.isVisibilidadCeldaNuevoTipoPuerto && this.isPermisoNuevoTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));									
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemModificarTipoPuerto.setVisible((this.isVisibilidadCeldaModificarTipoPuerto && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemActualizarTipoPuerto.setVisible((this.isVisibilidadCeldaActualizarTipoPuerto && this.isPermisoActualizarTipoPuerto));	
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemEliminarTipoPuerto.setVisible((this.isVisibilidadCeldaEliminarTipoPuerto && this.isPermisoEliminarTipoPuerto));
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemCancelarTipoPuerto.setVisible(this.isVisibilidadCeldaCancelarTipoPuerto);				
			}
			
			this.jMenuItemGuardarCambiosTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));						
			this.jMenuItemGuardarCambiosTablaTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPuerto=this.jButtonNuevoTipoPuerto.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPuerto=this.jButtonDuplicarTipoPuerto.isVisible();
			this.isVisibilidadCeldaCopiarTipoPuerto=this.jButtonCopiarTipoPuerto.isVisible();
			this.isVisibilidadCeldaVerFormTipoPuerto=this.jButtonVerFormTipoPuerto.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPuerto=this.jButtonAbrirOrderByTipoPuerto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=this.jButtonNuevoRelacionesTipoPuerto.isVisible();
			this.isVisibilidadCeldaModificarTipoPuerto=this.jButtonModificarTipoPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.isVisibilidadCeldaActualizarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.isVisible();
			this.isVisibilidadCeldaEliminarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.isVisible();
			this.isVisibilidadCeldaCancelarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.isVisible();
			this.isVisibilidadCeldaGuardarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=this.jButtonGuardarCambiosTablaTipoPuerto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPuerto=this.jButtonNuevoToolBarTipoPuerto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=this.jButtonNuevoRelacionesToolBarTipoPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.isVisibilidadCeldaModificarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarToolBarTipoPuerto.isVisible();
			this.isVisibilidadCeldaActualizarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarToolBarTipoPuerto.isVisible();
			this.isVisibilidadCeldaEliminarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarToolBarTipoPuerto.isVisible();
			this.isVisibilidadCeldaCancelarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarToolBarTipoPuerto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPuerto=this.jButtonGuardarCambiosToolBarTipoPuerto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=this.jButtonGuardarCambiosTablaToolBarTipoPuerto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPuerto=this.jMenuItemNuevoTipoPuerto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=this.jMenuItemNuevoRelacionesTipoPuerto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.isVisibilidadCeldaModificarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jMenuItemModificarTipoPuerto.isVisible();
			this.isVisibilidadCeldaActualizarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jMenuItemActualizarTipoPuerto.isVisible();
			this.isVisibilidadCeldaEliminarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jMenuItemEliminarTipoPuerto.isVisible();
			this.isVisibilidadCeldaCancelarTipoPuerto=this.jInternalFrameDetalleFormTipoPuerto.jMenuItemCancelarTipoPuerto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPuerto=this.jMenuItemGuardarCambiosTipoPuerto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=this.jMenuItemGuardarCambiosTablaTipoPuerto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPuerto(Boolean esInicializar) {
		if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPuerto();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPuerto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPuerto() {
		this.jButtonNuevoTipoPuerto.setVisible(this.isPermisoNuevoTipoPuerto);			
		this.jButtonDuplicarTipoPuerto.setVisible(this.isPermisoDuplicarTipoPuerto);			
		this.jButtonCopiarTipoPuerto.setVisible(this.isPermisoCopiarTipoPuerto);			
		this.jButtonVerFormTipoPuerto.setVisible(this.isPermisoVerFormTipoPuerto);			
		
		this.jButtonAbrirOrderByTipoPuerto.setVisible(this.isPermisoOrdenTipoPuerto);					
		
		this.jButtonNuevoRelacionesTipoPuerto.setVisible(this.isPermisoNuevoTipoPuerto);			
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarTipoPuerto.setVisible(this.isPermisoActualizarTipoPuerto);	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.setVisible(this.isPermisoActualizarTipoPuerto);	
			this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.setVisible(this.isPermisoEliminarTipoPuerto);
			this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.setVisible(this.isVisibilidadCeldaCancelarTipoPuerto);						
			this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.setVisible(this.isPermisoGuardarCambiosTipoPuerto);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPuerto.setVisible(this.isPermisoActualizarTipoPuerto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPuerto() {
		this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarTipoPuerto.setVisible(this.isPermisoActualizarTipoPuerto);	
		this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.setVisible(this.isPermisoActualizarTipoPuerto);	
		this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.setVisible(this.isPermisoEliminarTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.setVisible(this.isVisibilidadCeldaCancelarTipoPuerto);							
		this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.setVisible((this.isVisibilidadCeldaGuardarTipoPuerto && this.isPermisoGuardarCambiosTipoPuerto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPuerto() {
		if(TipoPuertoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPuerto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPuerto() {
	}
	
	public void jTableDatosTipoPuertoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPuerto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPuerto(this.gettipopuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopuerto==null) {
						this.tipopuerto = new TipoPuerto();
					}

					this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
				}

				if(this.tipopuerto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipopuerto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPuerto(this.gettipopuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopuerto==null) {
						this.tipopuerto = new TipoPuerto();
					}

					this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
				}

				if(this.tipopuerto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipopuerto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPuertoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPuerto(this.gettipopuerto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopuerto==null) {
						this.tipopuerto = new TipoPuerto();
					}

					this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);
				}

				if(this.tipopuerto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipopuerto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPuerto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoPuerto() {
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
			this.jInternalFrameDetalleFormTipoPuerto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPuerto.dispose();
			this.jInternalFrameDetalleFormTipoPuerto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
			this.jInternalFrameReporteDinamicoTipoPuerto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPuerto.dispose();
			this.jInternalFrameReporteDinamicoTipoPuerto=null;
		}
		
		if(this.jInternalFrameImportacionTipoPuerto!=null) {
			this.jInternalFrameImportacionTipoPuerto.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPuerto.dispose();
			this.jInternalFrameImportacionTipoPuerto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPuerto();
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPuerto")) {
				jButtonDuplicarTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPuerto")) {
				jButtonCopiarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPuerto")) {
				jButtonVerFormTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPuerto")) {
				jButtonDuplicarTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPuerto")) {
				jButtonDuplicarTipoPuertoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPuerto")) {
				jButtonModificarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPuerto")) {
				jButtonModificarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPuerto")) {
				jButtonModificarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPuerto")) {
				jButtonActualizarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPuerto")) {
				jButtonActualizarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPuerto")) {
				jButtonActualizarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPuerto")) {
				jButtonEliminarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPuerto")) {
				jButtonEliminarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPuerto")) {
				jButtonEliminarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPuerto")) {
				jButtonCancelarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPuerto")) {
				jButtonCancelarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPuerto")) {
				jButtonCancelarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPuerto")) {
				jButtonCerrarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPuerto")) {
				jButtonCerrarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPuerto")) {
				jButtonCerrarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPuerto")) {
				jButtonMostrarOcultarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPuerto")) {
				jButtonCancelarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPuerto")) {
				jButtonCopiarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPuerto")) {
				jButtonVerFormTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPuerto")) {
				jButtonCopiarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPuerto")) {
				jButtonVerFormTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPuerto")) {
				jButtonRecargarInformacionTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPuerto")) {
				jButtonRecargarInformacionTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPuerto")) {
				jButtonRecargarInformacionTipoPuertoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPuerto")) {
				jButtonAnterioresTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPuerto")) {
				jButtonAnterioresTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPuerto")) {
				jButtonAnterioresTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPuerto")) {
				jButtonSiguientesTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPuerto")) {
				jButtonSiguientesTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPuerto")) {
				jButtonSiguientesTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPuerto") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPuerto")) {
				jButtonAbrirOrderByTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPuerto") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPuerto")) {
				jButtonMostrarOcultarTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPuerto")) {
				jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPuerto")) {
				jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPuerto")) {
				jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPuerto")) {
				jButtonCerrarReporteDinamicoTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPuerto")) {
				jButtonGenerarReporteDinamicoTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPuerto")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPuerto")) {
				jButtonCerrarImportacionTipoPuertoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPuerto")) {
				
				jButtonGenerarImportacionTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPuerto")) {
				
				jButtonAbrirImportacionTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPuerto")) {
				jComboBoxTiposAccionesTipoPuertoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPuerto")) {
				jComboBoxTiposRelacionesTipoPuertoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPuerto")) {
				jComboBoxTiposAccionesTipoPuertoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPuerto")) {
				
				jComboBoxTiposSeleccionarTipoPuertoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPuerto")) {
				jTextFieldValorCampoGeneralTipoPuertoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPuerto")) {
				jButtonAbrirOrderByTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPuerto")) {
				jButtonAbrirOrderByTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPuerto")) {
				jButtonCerrarOrderByTipoPuertoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPuertoBusqueda")) {
				this.jButtonidTipoPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPuertoBusqueda")) {
				this.jButtoncodigoTipoPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPuertoBusqueda")) {
				this.jButtonnombreTipoPuertoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPuerto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPuerto tipopuertoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipopuertoLocal=this.tipopuerto;
			} else {
				tipopuertoLocal=this.tipopuertoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
							
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
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
			
			


			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
								
						
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
								
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
							
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
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
			
			


			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
								
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPuerto")) {
					jCheckBoxSeleccionarTodosTipoPuertoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPuerto")) {
					jCheckBoxSeleccionadosTipoPuertoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPuerto")) {
					
				}
				
				


				
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
												
				
				


				
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
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
			
			


			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPuertoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopuerto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopuerto);
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
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
				
				


				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPuerto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPuerto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPuertoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopuertoAnterior =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPuerto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPuertoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPuerto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipopuerto =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipopuerto =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipopuerto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPuerto")) {
				
				}
				
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPuerto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPuerto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPuerto")) {
			
			}
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPuerto();
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPuerto")) {
				jButtonDuplicarTipoPuertoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPuerto")) {
				jButtonCopiarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPuerto")) {
				jButtonVerFormTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPuerto")) {
				jButtonNuevoTipoPuertoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPuerto")) {
				jButtonModificarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPuerto")) {
				jButtonActualizarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPuerto")) {
				jButtonEliminarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPuerto")) {
				jButtonCancelarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPuerto")) {
				jButtonCerrarTipoPuertoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPuerto")) {
				jButtonGuardarCambiosTipoPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPuerto")) {
				jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPuerto")) {
				jButtonAbrirOrderByTipoPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPuerto")) {
				jButtonRecargarInformacionTipoPuertoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPuerto")) {
				jButtonAnterioresTipoPuertoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPuerto")) {
				jButtonSiguientesTipoPuertoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPuertoBusqueda")) {
				this.jButtonidTipoPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPuertoBusqueda")) {
				this.jButtoncodigoTipoPuertoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPuertoBusqueda")) {
				this.jButtonnombreTipoPuertoBusquedaActionPerformed(evt);
			}
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPuerto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPuerto")) {
				closingInternalFrameTipoPuerto();
				
			} else if(sTipo.equals("jButtonCancelarTipoPuerto")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPuerto = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPuertoBeanSwingJInternalFrame jInternalFrameParent=(TipoPuertoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPuerto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPuertoActionPerformed(null);
			}
			
			TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopuerto,new Object(),this.tipopuertoParameterGeneral,this.tipopuertoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPuerto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPuerto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPuerto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipopuerto)) {
			if(!esControlTabla) {
				if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);			
				}
				
				if(this.tipopuertoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPuerto(this.tipopuerto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopuertoReturnGeneral=tipopuertoLogic.procesarEventosTipoPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopuertoLogic.getTipoPuertos(),this.tipopuerto,this.tipopuertoParameterGeneral,this.isEsNuevoTipoPuerto,classes);//this.tipopuertoLogic.getTipoPuerto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPuerto(this.tipopuertoReturnGeneral,this.tipopuertoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipopuertoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPuerto(classes,this.tipopuertoReturnGeneral,this.tipopuertoBean,false);
					}
						
					if(this.tipopuertoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto());	
					}
						
					if(this.tipopuertoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto(),classes);//this.tipopuertoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPuerto(this.tipopuerto,classes);//this.tipopuertoBean);									
				}
			
				if(TipoPuertoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPuerto(this.tipopuerto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPuerto(this.tipopuerto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipopuertoAnterior!=null) {
						this.tipopuerto=this.tipopuertoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopuertoReturnGeneral=tipopuertoLogic.procesarEventosTipoPuertosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopuertoLogic.getTipoPuertos(),this.tipopuerto,this.tipopuertoParameterGeneral,this.isEsNuevoTipoPuerto,classes);//this.tipopuertoLogic.getTipoPuerto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopuertoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopuertoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipopuertoReturnGeneral.getTipoPuerto(),tipopuertoLogic.getTipoPuertos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipopuertoReturnGeneral.getTipoPuerto(),this.tipopuertos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPuerto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPuerto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPuerto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPuerto() throws Exception {
		
		TipoPuertoModel tipopuertoModel=(TipoPuertoModel)this.jTableDatosTipoPuerto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopuertoModel.tipopuertos=this.tipopuertoLogic.getTipoPuertos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipopuertoModel.tipopuertos=this.tipopuertos;
		}
		
		
		((TipoPuertoModel) this.jTableDatosTipoPuerto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPuerto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipopuertoAnterior(),this.tipopuertoLogic.getTipoPuertos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipopuertoAnterior(),this.tipopuertos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPuerto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPuerto(TipoPuerto tipopuerto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
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
										
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopuerto,new Object(),generalEntityParameterGeneral,this.tipopuertoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipopuertoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPuertoConstantesFunciones.getClassesRelationshipsOfTipoPuerto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPuertoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPuerto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPuerto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPuertoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopuerto,new Object(),generalEntityParameterGeneral,this.tipopuertoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPuerto(TipoPuertoBean tipopuertoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPuerto(ArrayList<Classe> classes,TipoPuertoReturnGeneral tipopuertoReturnGeneral,TipoPuertoBean tipopuertoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPuerto(TipoPuerto tipopuerto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipopuerto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPuerto = new TipoPuertoDetalleFormJInternalFrame(jDesktopPane,this.tipopuertoSessionBean.getConGuardarRelaciones(),this.tipopuertoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.setVisible(false);
		this.jInternalFrameDetalleFormTipoPuerto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPuerto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPuerto.tipopuertoLogic=this.tipopuertoLogic;
		
		this.cargarCombosFrameForeignKeyTipoPuerto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPuerto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPuerto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPuerto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPuerto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPuerto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPuerto"));
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarTipoPuerto.addActionListener(new ButtonActionListener(this,"ModificarTipoPuerto"));

		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPuerto"));
					
		this.jInternalFrameDetalleFormTipoPuerto.jMenuItemModificarTipoPuerto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.addActionListener (new ButtonActionListener(this,"ActualizarTipoPuerto"));
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPuerto"));
						
		this.jInternalFrameDetalleFormTipoPuerto.jMenuItemActualizarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.addActionListener (new ButtonActionListener(this,"EliminarTipoPuerto"));
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPuerto"));
								
		this.jInternalFrameDetalleFormTipoPuerto.jMenuItemEliminarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.addActionListener (new ButtonActionListener(this,"CancelarTipoPuerto"));
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPuerto"));
					
		this.jInternalFrameDetalleFormTipoPuerto.jMenuItemCancelarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPuerto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jMenuItemDetalleCerrarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPuerto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPuerto"));
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPuerto"));
		
		
		
		this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPuerto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonidTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtoncodigoTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonnombreTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPuertoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPuerto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPuerto"));
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPuerto"));
		}
		
		this.jTableDatosTipoPuerto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPuerto"));
		
		this.jTableDatosTipoPuerto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPuerto"));
		
		this.jButtonNuevoTipoPuerto.addActionListener(new ButtonActionListener(this,"NuevoTipoPuerto"));
		
		this.jButtonDuplicarTipoPuerto.addActionListener(new ButtonActionListener(this,"DuplicarTipoPuerto"));
		
		this.jButtonCopiarTipoPuerto.addActionListener(new ButtonActionListener(this,"CopiarTipoPuerto"));
		
		this.jButtonVerFormTipoPuerto.addActionListener(new ButtonActionListener(this,"VerFormTipoPuerto"));
		
		
		this.jButtonNuevoToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPuerto"));
			
		this.jButtonDuplicarToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPuerto"));
			
		this.jMenuItemNuevoTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPuerto"));
			
		this.jMenuItemDuplicarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPuerto"));		
		
		
		this.jButtonNuevoRelacionesTipoPuerto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPuerto"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPuerto"));
			
		this.jMenuItemNuevoRelacionesTipoPuerto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPuerto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarTipoPuerto.addActionListener(new ButtonActionListener(this,"ModificarTipoPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonModificarToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPuerto"));
			
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemModificarTipoPuerto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarTipoPuerto.addActionListener (new ButtonActionListener(this,"ActualizarTipoPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonActualizarToolBarTipoPuerto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPuerto"));
				
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemActualizarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarTipoPuerto.addActionListener (new ButtonActionListener(this,"EliminarTipoPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonEliminarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPuerto"));
						
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemEliminarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarTipoPuerto.addActionListener (new ButtonActionListener(this,"CancelarTipoPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonCancelarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPuerto"));
			
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemCancelarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPuerto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPuerto"));		
		
		
		this.jButtonCerrarTipoPuerto.addActionListener (new ButtonActionListener(this,"CerrarTipoPuerto"));
		
		
		this.jButtonCerrarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPuerto"));
			
		this.jMenuItemCerrarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPuerto"));
			
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jMenuItemDetalleCerrarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPuerto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPuerto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPuerto"));
		}
		
		this.jButtonCopiarToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPuerto"));
			
		this.jButtonVerFormToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPuerto"));
		
		this.jMenuItemGuardarCambiosTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPuerto"));
			
		this.jMenuItemCopiarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPuerto"));		
		
		this.jMenuItemVerFormTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPuerto"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPuerto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPuerto"));
			
		this.jMenuItemGuardarCambiosTablaTipoPuerto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPuerto"));		
		
		
		
		this.jButtonRecargarInformacionTipoPuerto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPuerto"));
					
		this.jButtonRecargarInformacionToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPuerto"));
		
		this.jMenuItemRecargarInformacionTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPuerto"));		
		
		
		
		this.jButtonAnterioresTipoPuerto.addActionListener (new ButtonActionListener(this,"AnterioresTipoPuerto"));
		
		
		this.jButtonAnterioresToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPuerto"));
		
		this.jMenuItemAnterioresTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPuerto"));		
		
		
		this.jButtonSiguientesTipoPuerto.addActionListener (new ButtonActionListener(this,"SiguientesTipoPuerto"));
		
		
		this.jButtonSiguientesToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPuerto"));
			
		this.jMenuItemSiguientesTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPuerto"));
			
		this.jMenuItemAbrirOrderByTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPuerto"));
			
		this.jMenuItemMostrarOcultarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPuerto"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPuerto"));
			
		this.jMenuItemDetalleMostarOcultarTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPuerto"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPuerto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPuerto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPuerto"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPuerto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPuerto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPuerto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPuerto"));

		this.jCheckBoxSeleccionadosTipoPuerto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPuerto"));
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPuerto"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPuerto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPuerto"));
			
		this.jComboBoxTiposAccionesTipoPuerto.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPuerto"));
					
		this.jComboBoxTiposSeleccionarTipoPuerto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPuerto"));
			
		this.jTextFieldValorCampoGeneralTipoPuerto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPuerto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonidTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtoncodigoTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonnombreTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPuertoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPuerto!=null) {
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPuerto"));
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPuerto"));
				this.jInternalFrameReporteDinamicoTipoPuerto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPuerto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPuerto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPuerto"));				
			//this.jButtonGenerarReporteDinamicoTipoPuerto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPuerto"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPuerto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPuerto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPuerto!=null) {
				this.jInternalFrameImportacionTipoPuerto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPuerto"));
				this.jInternalFrameImportacionTipoPuerto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPuerto"));
				this.jInternalFrameImportacionTipoPuerto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPuerto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPuerto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPuerto"));
			
			this.jButtonAbrirOrderByToolBarTipoPuerto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPuerto"));			
			
			if(this.jInternalFrameOrderByTipoPuerto!=null) {
				this.jInternalFrameOrderByTipoPuerto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPuerto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPuerto.jTabbedPaneRelacionesTipoPuerto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPuerto"));
		
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
            		closingInternalFrameTipoPuerto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPuerto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPuerto = (JInternalFrameBase)event.getSource();
	            	
	            TipoPuertoBeanSwingJInternalFrame jInternalFrameParent=(TipoPuertoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPuerto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPuertoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPuerto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPuertoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPuerto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPuerto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPuerto";
		inputMap = this.jButtonNuevoTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPuertoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPuertoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPuerto";
		inputMap = this.jButtonNuevoRelacionesTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPuertoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPuerto";
		inputMap = this.jButtonModificarTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPuerto";
		inputMap = this.jButtonActualizarTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPuerto";
		inputMap = this.jButtonEliminarTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPuerto";
		inputMap = this.jButtonCancelarTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPuerto";
		inputMap = this.jButtonCerrarTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPuerto";
		inputMap = this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPuerto.jButtonGuardarCambiosTipoPuerto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPuertoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPuerto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPuertoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPuerto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPuertoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonidTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtoncodigoTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPuertoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPuerto.jButtonnombreTipoPuertoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPuertoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPuerto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPuertoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPuertoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPuerto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPuerto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
					tipopuertoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPuerto tipopuertoAux:tipopuertos) {
					tipopuertoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPuertoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
						tipopuertoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPuerto tipopuertoAux:tipopuertos) {
						tipopuertoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPuerto tipopuertoAux:tipopuertos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPuerto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPuerto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPuerto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPuertoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPuerto.getSelectedRows();
			
			TipoPuerto tipopuertoLocal=new TipoPuerto();
			
			//this.seleccionarTodosTipoPuerto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopuertoLocal =(TipoPuerto) this.tipopuertoLogic.getTipoPuertos().toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipopuertoLocal =(TipoPuerto) this.tipopuertos.toArray()[this.jTableDatosTipoPuerto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipopuertoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
						tipopuertoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPuerto tipopuertoAux:tipopuertos) {
						tipopuertoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPuerto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPuerto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPuerto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPuerto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPuertoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPuertoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPuertoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPuerto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPuerto tipopuertoAux:this.tipopuertoLogic.getTipoPuertos()) {
				
						if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopuertoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopuertoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPuerto tipopuertoAux:tipopuertos) {
					
						if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopuertoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopuertoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPuerto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPuertoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPuerto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPuerto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPuerto) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPuerto(conSplash);
				
					this.generarReporteTipoPuertosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPuertosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPuertosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPuertosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPuerto();
				
				this.exportarTipoPuertosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPuertos();
				//this.importarTipoPuertos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPuerto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPuertosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Puerto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPuerto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPuerto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPuerto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPuerto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPuerto.jComboBoxTiposAccionesFormularioTipoPuerto.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPuerto();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPuerto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPuertoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPuerto();
			
			if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
			TipoPuerto tipopuerto=new TipoPuerto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPuerto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPuerto.getSelectedItem();
			
			
			
			
			tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipopuertosSeleccionados.size()==1) {
				for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
					tipopuerto=tipopuertoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPuerto();
			
      		//this.finishProcessTipoPuerto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPuertoReturnGeneral() throws Exception {
		if(this.tipopuertoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipopuertoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipopuertoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipopuertoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipopuertoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipopuertoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPuerto(false);
		}
		
		if(this.tipopuertoReturnGeneral.getConRetornoLista() || this.tipopuertoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipopuertoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopuertoLogic.setTipoPuertos(this.tipopuertoReturnGeneral.getTipoPuertos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipopuertoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopuertoLogic.setTipoPuerto(this.tipopuertoReturnGeneral.getTipoPuerto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPuerto(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPuerto() throws Exception {
		
		
	}
	
	public ArrayList<TipoPuerto> getTipoPuertosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPuerto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPuerto tipopuertoAux:tipopuertoLogic.getTipoPuertos()) {
					if(tipopuertoAux.getIsSelected()) {
						tipopuertosSeleccionados.add(tipopuertoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPuerto tipopuertoAux:this.tipopuertos) {
					if(tipopuertoAux.getIsSelected()) {
						tipopuertosSeleccionados.add(tipopuertoAux);				
					}
				}
			}
			
			if(tipopuertosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipopuertosSeleccionados.addAll(this.tipopuertoLogic.getTipoPuertos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipopuertosSeleccionados.addAll(this.tipopuertos);				
					}
				}
			}
		} else {
			tipopuertosSeleccionados.add(this.tipopuerto);
		}
		
		return tipopuertosSeleccionados;
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
	
	public void generarReporteTipoPuertosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPuertosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPuertosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPuertosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPuertosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Puerto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPuertosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPuerto();
		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPuerto();
		
		
		//this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados ,tipopuertoImplementable,tipopuertoImplementableHome);
	}
	
	public void mostrarImportacionTipoPuertos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPuerto();
		
		this.abrirFrameImportacionTipoPuerto();		
		
			
		//this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados ,tipopuertoImplementable,tipopuertoImplementableHome);
	}
	
	public void importarTipoPuertos() throws Exception {		
	
	}
	
	public void exportarTipoPuertosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPuertosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPuertosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPuertosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Puerto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPuerto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPuerto(tipopuertoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipopuertoAux.setsDetalleGeneralEntityReporte(tipopuertoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPuerto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPuertoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPuertoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPuertoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPuertoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPuerto(TipoPuerto tipopuerto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipopuerto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopuerto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopuerto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopuerto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPuertos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPuerto(row);				
				iRow++;
			}				
			
			for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPuerto(tipopuertoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPuertosSeleccionados() throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();		
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopuerto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipopuertos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipopuerto");
			//elementRoot.appendChild(element);
		
			for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
				element = document.createElement("tipopuerto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPuerto(tipopuertoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Puerto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPuerto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPuertoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPuerto(TipoPuerto tipopuerto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipopuerto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopuerto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopuerto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPuerto(TipoPuerto tipopuerto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPuertoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipopuerto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPuertoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipopuerto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoPuertoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipopuerto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPuertoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipopuerto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPuertosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPuerto> tipopuertosSeleccionados=new ArrayList<TipoPuerto>();
		
		tipopuertosSeleccionados=this.getTipoPuertosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPuerto(tipopuertosSeleccionados);
		
		this.generarReporteTipoPuertos("Todos",tipopuertosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPuerto(ArrayList<TipoPuerto> tipopuertosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPuerto tipopuertoAux:tipopuertosSeleccionados) {
				tipopuertoAux.setsDetalleGeneralEntityReporte(tipopuertoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipopuertoAux.setsDescripcionGeneralEntityReporte1(tipopuertoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPuertoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipopuertoAux.setsDescripcionGeneralEntityReporte1(tipopuertoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPuertoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPuerto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPuerto=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPuerto=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=true;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=true;
			this.isVisibilidadCeldaEliminarTipoPuerto=true;
			this.isVisibilidadCeldaCancelarTipoPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=true;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=true;
			this.isVisibilidadCeldaModificarTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
			this.isVisibilidadCeldaModificarTipoPuerto=true;
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
			this.isVisibilidadCeldaCancelarTipoPuerto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPuerto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPuertoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPuerto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=true;
		} else {
			this.actualizarEstadoPanelsTipoPuerto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPuerto=false;
			//this.isVisibilidadCeldaVerFormTipoPuerto=false;
			this.isVisibilidadCeldaDuplicarTipoPuerto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipopuertoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPuerto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPuerto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipopuertoSessionBean.getEsGuardarRelacionado()) {
			if(!tipopuertoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;												
			}
			
			this.jButtonCerrarTipoPuerto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPuerto=false;
		}
		
		if(!this.permiteMantenimiento(this.tipopuerto)) {
			this.isVisibilidadCeldaActualizarTipoPuerto=false;
			this.isVisibilidadCeldaEliminarTipoPuerto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPuerto() {
	}
	
	public void actualizarEstadoPanelsTipoPuerto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPuerto!=null) {
				this.jScrollPanelDatosEdicionTipoPuerto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoPuerto!=null) {
				this.jScrollPanelDatosTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPuerto!=null) {
				this.jPanelPaginacionTipoPuerto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPuerto!=null) {
				this.jPanelParametrosReportesTipoPuerto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPuertoSessionBean tipopuertoSessionBean=new TipoPuertoSessionBean();
		
		if(this.tipopuertoSessionBean==null) {
			this.tipopuertoSessionBean=new TipoPuertoSessionBean();
		}
		
		this.tipopuertoSessionBean.setsUltimaBusquedaTipoPuerto(this.getsAccionBusqueda());
		this.tipopuertoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipopuertoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPuertoSessionBean tipopuertoSessionBean=new TipoPuertoSessionBean();
		
		if(this.tipopuertoSessionBean==null) {
			this.tipopuertoSessionBean=new TipoPuertoSessionBean();
		}
		
		if(this.tipopuertoSessionBean.getsUltimaBusquedaTipoPuerto()!=null&&!this.tipopuertoSessionBean.getsUltimaBusquedaTipoPuerto().equals("")) {
			this.setsAccionBusqueda(tipopuertoSessionBean.getsUltimaBusquedaTipoPuerto());
			this.setiNumeroPaginacion(tipopuertoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipopuertoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipopuertoSessionBean.setsUltimaBusquedaTipoPuerto("");
		this.tipopuertoSessionBean.setiNumeroPaginacion(TipoPuertoConstantesFunciones.INUMEROPAGINACION);
		this.tipopuertoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPuerto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPuerto() {
		this.updateBorderResaltarBusquedasFormularioTipoPuerto();
		this.updateVisibilidadBusquedasFormularioTipoPuerto();
		this.updateHabilitarBusquedasFormularioTipoPuerto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPuerto() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPuerto() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoPuerto() {
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
	
	public void updateControlesFormularioTipoPuerto() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPuerto();
		this.updateVisibilidadResaltarControlesFormularioTipoPuerto();
		this.updateHabilitarResaltarControlesFormularioTipoPuerto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPuerto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipopuertoConstantesFunciones.resaltaridTipoPuerto!=null && this.jInternalFrameDetalleFormTipoPuerto!=null) {this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setBorder(this.tipopuertoConstantesFunciones.resaltaridTipoPuerto);}
		if(this.tipopuertoConstantesFunciones.resaltarcodigoTipoPuerto!=null && this.jInternalFrameDetalleFormTipoPuerto!=null) {this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setBorder(this.tipopuertoConstantesFunciones.resaltarcodigoTipoPuerto);}
		if(this.tipopuertoConstantesFunciones.resaltarnombreTipoPuerto!=null && this.jInternalFrameDetalleFormTipoPuerto!=null) {this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setBorder(this.tipopuertoConstantesFunciones.resaltarnombreTipoPuerto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPuerto() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
	
		//this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostraridTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jPanelidTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostraridTipoPuerto);
		//this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostrarcodigoTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jPanelcodigoTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostrarcodigoTipoPuerto);
		//this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostrarnombreTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jPanelnombreTipoPuerto.setVisible(this.tipopuertoConstantesFunciones.mostrarnombreTipoPuerto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPuerto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPuerto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPuerto!=null) {
	
		this.jInternalFrameDetalleFormTipoPuerto.jTextFieldidTipoPuerto.setEnabled(this.tipopuertoConstantesFunciones.activaridTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jTextFieldcodigoTipoPuerto.setEnabled(this.tipopuertoConstantesFunciones.activarcodigoTipoPuerto);
		this.jInternalFrameDetalleFormTipoPuerto.jTextAreanombreTipoPuerto.setEnabled(this.tipopuertoConstantesFunciones.activarnombreTipoPuerto);
		}
	}
	
		
}