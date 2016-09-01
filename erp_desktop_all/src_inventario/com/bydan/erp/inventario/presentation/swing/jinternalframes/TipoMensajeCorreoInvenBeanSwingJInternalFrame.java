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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoMensajeCorreoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.TipoMensajeCorreoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoMensajeCorreoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoMensajeCorreoInvenBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoMensajeCorreoInvenBeanSwingJInternalFrame extends TipoMensajeCorreoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMensajeCorreoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMensajeCorreoInven> tipomensajecorreoinvenValidator = new ClassValidator<TipoMensajeCorreoInven>(TipoMensajeCorreoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMensajeCorreoInven tipomensajecorreoinven;	
	public TipoMensajeCorreoInven tipomensajecorreoinvenAux;
	public TipoMensajeCorreoInven tipomensajecorreoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMensajeCorreoInven tipomensajecorreoinvenTotales;
	public Long idTipoMensajeCorreoInvenActual;
	public Long iIdNuevoTipoMensajeCorreoInven=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
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
	
	public Boolean isPermisoTodoTipoMensajeCorreoInven;
	public Boolean isPermisoNuevoTipoMensajeCorreoInven;
	public Boolean isPermisoActualizarTipoMensajeCorreoInven;
	public Boolean isPermisoActualizarOriginalTipoMensajeCorreoInven;
	public Boolean isPermisoEliminarTipoMensajeCorreoInven;
	public Boolean isPermisoGuardarCambiosTipoMensajeCorreoInven;
	public Boolean isPermisoConsultaTipoMensajeCorreoInven;
	public Boolean isPermisoBusquedaTipoMensajeCorreoInven;
	public Boolean isPermisoReporteTipoMensajeCorreoInven;
	public Boolean isPermisoPaginacionMedioTipoMensajeCorreoInven;
	public Boolean isPermisoPaginacionAltoTipoMensajeCorreoInven;
	public Boolean isPermisoPaginacionTodoTipoMensajeCorreoInven;
	public Boolean isPermisoCopiarTipoMensajeCorreoInven;
	public Boolean isPermisoVerFormTipoMensajeCorreoInven;
	public Boolean isPermisoDuplicarTipoMensajeCorreoInven;
	public Boolean isPermisoOrdenTipoMensajeCorreoInven;
	
	
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
	
	public TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenReturnGeneral;
	public TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMensajeCorreoInven=false;
	public Boolean esParaAccionDesdeFormularioTipoMensajeCorreoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMensajeCorreoInven tipomensajecorreoinvenBean;
	public TipoMensajeCorreoInvenConstantesFunciones tipomensajecorreoinvenConstantesFunciones;
	//public TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenReturnGeneral;
	
	//FK
	
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMensajeCorreoInven> tipomensajecorreoinvens;	
	//public List<TipoMensajeCorreoInven> tipomensajecorreoinvensEliminados;
	//public List<TipoMensajeCorreoInven> tipomensajecorreoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaCopiarTipoMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaVerFormTipoMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaOrdenTipoMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaCancelarTipoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoTipoMensajeCorreoInven() {
		return this.iIdNuevoTipoMensajeCorreoInven;
	}

	public void setiIdNuevoTipoMensajeCorreoInven(Long iIdNuevoTipoMensajeCorreoInven) {
		this.iIdNuevoTipoMensajeCorreoInven = iIdNuevoTipoMensajeCorreoInven;
	}
	
	public Long getidTipoMensajeCorreoInvenActual() {
		return this.idTipoMensajeCorreoInvenActual;
	}

	public void setidTipoMensajeCorreoInvenActual(Long idTipoMensajeCorreoInvenActual) {
		this.idTipoMensajeCorreoInvenActual = idTipoMensajeCorreoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMensajeCorreoInven gettipomensajecorreoinven() {
		return this.tipomensajecorreoinven;
	}

	public void settipomensajecorreoinven(TipoMensajeCorreoInven tipomensajecorreoinven) {
		this.tipomensajecorreoinven = tipomensajecorreoinven;
	}
	
	public TipoMensajeCorreoInven gettipomensajecorreoinvenAux() {
		return this.tipomensajecorreoinvenAux;
	}

	public void settipomensajecorreoinvenAux(TipoMensajeCorreoInven tipomensajecorreoinvenAux) {
		this.tipomensajecorreoinvenAux = tipomensajecorreoinvenAux;
	}				
	
	public TipoMensajeCorreoInven gettipomensajecorreoinvenAnterior() {
		return this.tipomensajecorreoinvenAnterior;
	}

	public void settipomensajecorreoinvenAnterior(TipoMensajeCorreoInven tipomensajecorreoinvenAnterior) {
		this.tipomensajecorreoinvenAnterior = tipomensajecorreoinvenAnterior;
	}	
	
	public TipoMensajeCorreoInven gettipomensajecorreoinvenTotales() {
		return this.tipomensajecorreoinvenTotales;
	}

	public void settipomensajecorreoinvenTotales(TipoMensajeCorreoInven tipomensajecorreoinvenTotales) {
		this.tipomensajecorreoinvenTotales = tipomensajecorreoinvenTotales;
	}	
	
	public TipoMensajeCorreoInven gettipomensajecorreoinvenBean() {
		return this.tipomensajecorreoinvenBean;
	}

	public void settipomensajecorreoinvenBean(TipoMensajeCorreoInven tipomensajecorreoinvenBean) {
		this.tipomensajecorreoinvenBean = tipomensajecorreoinvenBean;
	}	
	
	public TipoMensajeCorreoInvenParameterReturnGeneral gettipomensajecorreoinvenReturnGeneral() {
		return this.tipomensajecorreoinvenReturnGeneral;
	}

	public void settipomensajecorreoinvenReturnGeneral(TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenReturnGeneral) {
		this.tipomensajecorreoinvenReturnGeneral = tipomensajecorreoinvenReturnGeneral;
	}	
	
	
	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMensajeCorreoInvenLogic getTipoMensajeCorreoInvenLogic()	{		
		return tipomensajecorreoinvenLogic;
	}

	public void setTipoMensajeCorreoInvenLogic(TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic) {
		this.tipomensajecorreoinvenLogic = tipomensajecorreoinvenLogic;
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
	
	public Boolean getIsEsNuevoTipoMensajeCorreoInven() {
		return isEsNuevoTipoMensajeCorreoInven;
	}

	public void setIsEsNuevoTipoMensajeCorreoInven(Boolean isEsNuevoTipoMensajeCorreoInven) {
		this.isEsNuevoTipoMensajeCorreoInven = isEsNuevoTipoMensajeCorreoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMensajeCorreoInven() {
		return esParaAccionDesdeFormularioTipoMensajeCorreoInven;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMensajeCorreoInven(Boolean esParaAccionDesdeFormularioTipoMensajeCorreoInven) {
		this.esParaAccionDesdeFormularioTipoMensajeCorreoInven = esParaAccionDesdeFormularioTipoMensajeCorreoInven;
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
	
	
	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipomensajecorreoinvenSessionBean==null) {
				this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
			}

			if(!this.tipomensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(tipomensajecorreoinvenSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	
	
	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.tipomensajecorreoinven!=null) {
						this.tipomensajecorreoinven.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTipoMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTipoMensajeCorreoInvenGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTipoMensajeCorreoInvenGenerico!=null && jComboBoxid_moduloTipoMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_moduloTipoMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TipoMensajeCorreoInven tipomensajecorreoinven,JComboBox jComboBoxid_moduloTipoMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTipoMensajeCorreoInvenGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTipoMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				tipomensajecorreoinven.setid_modulo(moduloAux.getId());
				tipomensajecorreoinven.setmodulo_descripcion(TipoMensajeCorreoInvenConstantesFunciones.getModuloDescripcion(moduloAux));
				tipomensajecorreoinven.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { 
					}

					if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoMensajeCorreoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven(this.tipomensajecorreoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(this.tipomensajecorreoinvens);
			tipomensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMensajeCorreoInvenParameterReturnGeneral getTipoMensajeCorreoInvenParameterGeneral() {
		return this.tipomensajecorreoinvenParameterGeneral;
	}
	
	public void setTipoMensajeCorreoInvenParameterGeneral(TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenParameterGeneral) {
		this.tipomensajecorreoinvenParameterGeneral = tipomensajecorreoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMensajeCorreoInven() {
		return isPermisoTodoTipoMensajeCorreoInven;
	}

	public void setIsPermisoTodoTipoMensajeCorreoInven(Boolean isPermisoTodoTipoMensajeCorreoInven) {
		this.isPermisoTodoTipoMensajeCorreoInven = isPermisoTodoTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoNuevoTipoMensajeCorreoInven() {
		return isPermisoNuevoTipoMensajeCorreoInven;
	}

	public void setIsPermisoNuevoTipoMensajeCorreoInven(Boolean isPermisoNuevoTipoMensajeCorreoInven) {
		this.isPermisoNuevoTipoMensajeCorreoInven = isPermisoNuevoTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoActualizarTipoMensajeCorreoInven() {
		return isPermisoActualizarTipoMensajeCorreoInven;
	}

	public void setIsPermisoActualizarTipoMensajeCorreoInven(Boolean isPermisoActualizarTipoMensajeCorreoInven) {
		this.isPermisoActualizarTipoMensajeCorreoInven = isPermisoActualizarTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoEliminarTipoMensajeCorreoInven() {
		return isPermisoEliminarTipoMensajeCorreoInven;
	}

	public void setIsPermisoEliminarTipoMensajeCorreoInven(Boolean isPermisoEliminarTipoMensajeCorreoInven) {
		this.isPermisoEliminarTipoMensajeCorreoInven = isPermisoEliminarTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMensajeCorreoInven() {
		return isPermisoGuardarCambiosTipoMensajeCorreoInven;
	}

	public void setIsPermisoGuardarCambiosTipoMensajeCorreoInven(Boolean isPermisoGuardarCambiosTipoMensajeCorreoInven) {
		this.isPermisoGuardarCambiosTipoMensajeCorreoInven = isPermisoGuardarCambiosTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoConsultaTipoMensajeCorreoInven() {
		return isPermisoConsultaTipoMensajeCorreoInven;
	}

	public void setIsPermisoConsultaTipoMensajeCorreoInven(Boolean isPermisoConsultaTipoMensajeCorreoInven) {
		this.isPermisoConsultaTipoMensajeCorreoInven = isPermisoConsultaTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoBusquedaTipoMensajeCorreoInven() {
		return isPermisoBusquedaTipoMensajeCorreoInven;
	}

	public void setIsPermisoBusquedaTipoMensajeCorreoInven(Boolean isPermisoBusquedaTipoMensajeCorreoInven) {
		this.isPermisoBusquedaTipoMensajeCorreoInven = isPermisoBusquedaTipoMensajeCorreoInven;
	}

	public Boolean getIsPermisoReporteTipoMensajeCorreoInven() {
		return isPermisoReporteTipoMensajeCorreoInven;
	}

	public void setIsPermisoReporteTipoMensajeCorreoInven(Boolean isPermisoReporteTipoMensajeCorreoInven) {
		this.isPermisoReporteTipoMensajeCorreoInven = isPermisoReporteTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMensajeCorreoInven() {
		return isPermisoPaginacionMedioTipoMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionMedioTipoMensajeCorreoInven(Boolean isPermisoPaginacionMedioTipoMensajeCorreoInven) {
		this.isPermisoPaginacionMedioTipoMensajeCorreoInven = isPermisoPaginacionMedioTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMensajeCorreoInven() {
		return isPermisoPaginacionTodoTipoMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionTodoTipoMensajeCorreoInven(Boolean isPermisoPaginacionTodoTipoMensajeCorreoInven) {
		this.isPermisoPaginacionTodoTipoMensajeCorreoInven = isPermisoPaginacionTodoTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMensajeCorreoInven() {
		return isPermisoPaginacionAltoTipoMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionAltoTipoMensajeCorreoInven(Boolean isPermisoPaginacionAltoTipoMensajeCorreoInven) {
		this.isPermisoPaginacionAltoTipoMensajeCorreoInven = isPermisoPaginacionAltoTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoCopiarTipoMensajeCorreoInven() {
		return isPermisoCopiarTipoMensajeCorreoInven;
	}

	public void setIsPermisoCopiarTipoMensajeCorreoInven(Boolean isPermisoCopiarTipoMensajeCorreoInven) {
		this.isPermisoCopiarTipoMensajeCorreoInven = isPermisoCopiarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoVerFormTipoMensajeCorreoInven() {
		return isPermisoVerFormTipoMensajeCorreoInven;
	}

	public void setIsPermisoVerFormTipoMensajeCorreoInven(Boolean isPermisoVerFormTipoMensajeCorreoInven) {
		this.isPermisoVerFormTipoMensajeCorreoInven = isPermisoVerFormTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoDuplicarTipoMensajeCorreoInven() {
		return isPermisoDuplicarTipoMensajeCorreoInven;
	}

	public void setIsPermisoDuplicarTipoMensajeCorreoInven(Boolean isPermisoDuplicarTipoMensajeCorreoInven) {
		this.isPermisoDuplicarTipoMensajeCorreoInven = isPermisoDuplicarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoOrdenTipoMensajeCorreoInven() {
		return isPermisoOrdenTipoMensajeCorreoInven;
	}

	public void setIsPermisoOrdenTipoMensajeCorreoInven(Boolean isPermisoOrdenTipoMensajeCorreoInven) {
		this.isPermisoOrdenTipoMensajeCorreoInven = isPermisoOrdenTipoMensajeCorreoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoTipoMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven = isVisibilidadCeldaNuevoTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaDuplicarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaDuplicarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven = isVisibilidadCeldaDuplicarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaCopiarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCopiarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaCopiarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven = isVisibilidadCeldaCopiarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMensajeCorreoInven() {
		return isVisibilidadCeldaVerFormTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaVerFormTipoMensajeCorreoInven(Boolean isVisibilidadCeldaVerFormTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven = isVisibilidadCeldaVerFormTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMensajeCorreoInven() {
		return isVisibilidadCeldaOrdenTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaOrdenTipoMensajeCorreoInven(Boolean isVisibilidadCeldaOrdenTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven = isVisibilidadCeldaOrdenTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven = isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaModificarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaModificarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaModificarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaModificarTipoMensajeCorreoInven = isVisibilidadCeldaModificarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaActualizarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaActualizarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaActualizarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven = isVisibilidadCeldaActualizarTipoMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaEliminarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaEliminarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaEliminarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven = isVisibilidadCeldaEliminarTipoMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaCancelarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCancelarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaCancelarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven = isVisibilidadCeldaCancelarTipoMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarTipoMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven = isVisibilidadCeldaGuardarTipoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven = isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven;
	}
		
	public TipoMensajeCorreoInvenSessionBean gettipomensajecorreoinvenSessionBean() {
		return this.tipomensajecorreoinvenSessionBean;
	}
	
	public void settipomensajecorreoinvenSessionBean(TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean) {
		this.tipomensajecorreoinvenSessionBean=tipomensajecorreoinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven)throws Exception {
		try {
			
				this.setActualParaGuardarModuloForeignKey(tipomensajecorreoinven,null);
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
	
	public void bugActualizarReferenciaActual(TipoMensajeCorreoInven tipomensajecorreoinven,TipoMensajeCorreoInven tipomensajecorreoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMensajeCorreoInven(tipomensajecorreoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomensajecorreoinvenAux.setId(tipomensajecorreoinven.getId());
		tipomensajecorreoinvenAux.setVersionRow(tipomensajecorreoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMensajeCorreoInven();
		
			int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomensajecorreoinvenValidator.getInvalidValues(this.tipomensajecorreoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomensajecorreoinvenLogic.setDatosCliente(datosCliente);
			tipomensajecorreoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomensajecorreoinvenAux=new  TipoMensajeCorreoInven();
				
				tipomensajecorreoinvenAux.setIsNew(true);
				tipomensajecorreoinvenAux.setIsChanged(true);
				
				tipomensajecorreoinvenAux.setTipoMensajeCorreoInvenOriginal(this.tipomensajecorreoinven);
				
				tipomensajecorreoinvenAux.setId(this.tipomensajecorreoinven.getId());	
				tipomensajecorreoinvenAux.setVersionRow(this.tipomensajecorreoinven.getVersionRow());	
				tipomensajecorreoinvenAux.setid_modulo(this.tipomensajecorreoinven.getid_modulo());	
				tipomensajecorreoinvenAux.setcodigo(this.tipomensajecorreoinven.getcodigo());	
				tipomensajecorreoinvenAux.setnombre(this.tipomensajecorreoinven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenLogic.saveTipoMensajeCorreoInvens();//WithConnection
						//tipomensajecorreoinvenLogic.getSetVersionRowTipoMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomensajecorreoinven,tipomensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomensajecorreoinvenAux=new  TipoMensajeCorreoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.tipomensajecorreoinven.getId()>=0)) {
						
					tipomensajecorreoinvenAux.setIsNew(false);
				}
				
				tipomensajecorreoinvenAux.setIsDeleted(false);
			
				tipomensajecorreoinvenAux.setId(this.tipomensajecorreoinven.getId());	
				tipomensajecorreoinvenAux.setVersionRow(this.tipomensajecorreoinven.getVersionRow());	
				tipomensajecorreoinvenAux.setid_modulo(this.tipomensajecorreoinven.getid_modulo());	
				tipomensajecorreoinvenAux.setcodigo(this.tipomensajecorreoinven.getcodigo());	
				tipomensajecorreoinvenAux.setnombre(this.tipomensajecorreoinven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenLogic.saveTipoMensajeCorreoInvens();//WithConnection
						//tipomensajecorreoinvenLogic.getSetVersionRowTipoMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomensajecorreoinven,tipomensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomensajecorreoinvenAux=new  TipoMensajeCorreoInven();
				
				tipomensajecorreoinvenAux.setIsNew(false);
				tipomensajecorreoinvenAux.setIsChanged(false);
				
				tipomensajecorreoinvenAux.setIsDeleted(true);
				
				tipomensajecorreoinvenAux.setId(this.tipomensajecorreoinven.getId());	
				tipomensajecorreoinvenAux.setVersionRow(this.tipomensajecorreoinven.getVersionRow());	
				tipomensajecorreoinvenAux.setid_modulo(this.tipomensajecorreoinven.getid_modulo());	
				tipomensajecorreoinvenAux.setcodigo(this.tipomensajecorreoinven.getcodigo());	
				tipomensajecorreoinvenAux.setnombre(this.tipomensajecorreoinven.getnombre());	
				
				if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomensajecorreoinvenAux.getId()>=0) {	
						this.tipomensajecorreoinvensEliminados.add(tipomensajecorreoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomensajecorreoinvenAux,tipomensajecorreoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenLogic.saveTipoMensajeCorreoInvens();//WithConnection
						//tipomensajecorreoinvenLogic.getSetVersionRowTipoMensajeCorreoInvens();//WithConnection
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
					this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().addAll(this.tipomensajecorreoinvensEliminados);
					
					tipomensajecorreoinvenLogic.saveTipoMensajeCorreoInvens();//WithConnection
					//tipomensajecorreoinvenLogic.getSetVersionRowTipoMensajeCorreoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven();
				
				this.tipomensajecorreoinvensEliminados= new ArrayList<TipoMensajeCorreoInven>();		
			}
			
			if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Mensaje Correo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomensajecorreoinven=tipomensajecorreoinvenAux;
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
      		//this.finishProcessTipoMensajeCorreoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMensajeCorreoInven tipomensajecorreoinvenLocal) throws Exception {
		
		if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMensajeCorreoInven tipomensajecorreoinvenLocal) throws Exception {	
		if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				tipomensajecorreoinvenLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMensajeCorreoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomensajecorreoinvenValidator.getInvalidValues(this.tipomensajecorreoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMensajeCorreoInven tipomensajecorreoinven,List<TipoMensajeCorreoInven> tipomensajecorreoinvens) throws Exception {
		try	{		
			TipoMensajeCorreoInvenConstantesFunciones.actualizarLista(tipomensajecorreoinven,tipomensajecorreoinvens,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMensajeCorreoInven tipomensajecorreoinven,List<TipoMensajeCorreoInven> tipomensajecorreoinvens) throws Exception {
		try	{			
			TipoMensajeCorreoInvenConstantesFunciones.actualizarSelectedLista(tipomensajecorreoinven,tipomensajecorreoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMensajeCorreoInven> tipomensajecorreoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomensajecorreoinvensLocal=this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomensajecorreoinvensLocal=this.tipomensajecorreoinvens;
			}
			//ARCHITECTURE
		
			for(TipoMensajeCorreoInven tipomensajecorreoinvenLocal:tipomensajecorreoinvensLocal) {
				if(this.permiteMantenimiento(tipomensajecorreoinvenLocal) && tipomensajecorreoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMensajeCorreoInvenConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelid_moduloTipoMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMensajeCorreoInvenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelcodigoTipoMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMensajeCorreoInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelnombreTipoMensajeCorreoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelid_moduloTipoMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelcodigoTipoMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelnombreTipoMensajeCorreoInven,"");
		
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
		this.iIdNuevoTipoMensajeCorreoInven--;	
		
		
		this.tipomensajecorreoinvenAux=new TipoMensajeCorreoInven();
		
		this.tipomensajecorreoinvenAux.setId(this.iIdNuevoTipoMensajeCorreoInven);
		this.tipomensajecorreoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().add(this.tipomensajecorreoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomensajecorreoinvens.add(this.tipomensajecorreoinvenAux);
		}
		//ARCHITECTURE
		
		this.tipomensajecorreoinven=this.tipomensajecorreoinvenAux;
		
		if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMensajeCorreoInven(this.tipomensajecorreoinven);
		}
				
		//this.setDefaultControlesTipoMensajeCorreoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMensajeCorreoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMensajeCorreoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinvenBean,this.tipomensajecorreoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			classes=TipoMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfTipoMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomensajecorreoinvenReturnGeneral=tipomensajecorreoinvenLogic.procesarEventosTipoMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),this.tipomensajecorreoinven,this.tipomensajecorreoinvenParameterGeneral,this.isEsNuevoTipoMensajeCorreoInven,classes);//this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral,this.tipomensajecorreoinvenBean,false);
		
		if(this.tipomensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven());
		}
		
		if(this.tipomensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven(),classes);//this.tipomensajecorreoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMensajeCorreoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
						
			if(tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();
			}
			
			this.actualizarVisualTableDatosTipoMensajeCorreoInven();
			
			this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoTipoMensajeCorreoInven(), this.getIndiceNuevoTipoMensajeCorreoInven());
			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
						
			this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMensajeCorreoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setEnabled(isHabilitar && this.tipomensajecorreoinvenConstantesFunciones.activarcodigoTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setEnabled(isHabilitar && this.tipomensajecorreoinvenConstantesFunciones.activarnombreTipoMensajeCorreoInven);	
		//
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setEnabled(isHabilitar && this.tipomensajecorreoinvenConstantesFunciones.activarid_moduloTipoMensajeCorreoInven);
	};
	
	public void setDefaultControlesTipoMensajeCorreoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMensajeCorreoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(true);			
			this.tipomensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.setVisible(true);
			
					
		} else {
			//this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(false);			
			this.tipomensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoMensajeCorreoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				if(tipomensajecorreoinvenAux.getId().equals(this.iIdNuevoTipoMensajeCorreoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvens) {
				if(tipomensajecorreoinvenAux.getId().equals(this.iIdNuevoTipoMensajeCorreoInven)) {
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
	
	public int getIndiceActualTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				if(tipomensajecorreoinvenAux.getId().equals(tipomensajecorreoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvens) {
				if(tipomensajecorreoinvenAux.getId().equals(tipomensajecorreoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				if(tipomensajecorreoinvenAux.getTipoMensajeCorreoInvenOriginal().getId().equals(tipomensajecorreoinvenOriginal.getId())) {
					existe=true;
					tipomensajecorreoinvenOriginal.setId(tipomensajecorreoinvenAux.getId());
					tipomensajecorreoinvenOriginal.setVersionRow(tipomensajecorreoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvens) {
				if(tipomensajecorreoinvenAux.getTipoMensajeCorreoInvenOriginal().getId().equals(tipomensajecorreoinvenOriginal.getId())) {
					existe=true;
					tipomensajecorreoinvenOriginal.setId(tipomensajecorreoinvenAux.getId());
					tipomensajecorreoinvenOriginal.setVersionRow(tipomensajecorreoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		tipomensajecorreoinvensAux=new ArrayList<TipoMensajeCorreoInven>();
		tipomensajecorreoinvenAux=new TipoMensajeCorreoInven();
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
					if(tipomensajecorreoinvenAux.getId()<0) {
						tipomensajecorreoinvensAux.add(tipomensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoTipoMensajeCorreoInven=0L;
				this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().removeAll(tipomensajecorreoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvens) {
					if(tipomensajecorreoinvenAux.getId()<0) {
						tipomensajecorreoinvensAux.add(tipomensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoTipoMensajeCorreoInven=0L;
				this.tipomensajecorreoinvens.removeAll(tipomensajecorreoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMensajeCorreoInven 
					&& this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()>0
					) {
					tipomensajecorreoinvenAux=this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().get(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size() - 1);
				
					if(tipomensajecorreoinvenAux.getId()<0) {
						this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().remove(tipomensajecorreoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMensajeCorreoInven && this.tipomensajecorreoinvens.size()>0) {
					tipomensajecorreoinvenAux=this.tipomensajecorreoinvens.get(this.tipomensajecorreoinvens.size() - 1);
				
					if(tipomensajecorreoinvenAux.getId()<0) {
						this.tipomensajecorreoinvens.remove(tipomensajecorreoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomensajecorreoinven.getId()<0) {
				this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().remove(this.tipomensajecorreoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomensajecorreoinven.getId()<0) {
				this.tipomensajecorreoinvens.remove(this.tipomensajecorreoinven);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMensajeCorreoInven(List<TipoMensajeCorreoInven> tipomensajecorreoinvensAux) throws Exception {
		TipoMensajeCorreoInvenConstantesFunciones.setEstadosInicialesTipoMensajeCorreoInven(tipomensajecorreoinvensAux);
	}
	
	public void setEstadosInicialesTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinvenAux) throws Exception {
		TipoMensajeCorreoInvenConstantesFunciones.setEstadosInicialesTipoMensajeCorreoInven(tipomensajecorreoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMensajeCorreoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMensajeCorreoInvenActual()) {
				if(!this.isEsNuevoTipoMensajeCorreoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMensajeCorreoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMensajeCorreoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Mensaje Correo ?", "MANTENIMIENTO DE Tipo Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMensajeCorreoInven tipomensajecorreoinven) throws Exception {
		TipoMensajeCorreoInvenConstantesFunciones.seleccionarAsignar(this.tipomensajecorreoinven,tipomensajecorreoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMensajeCorreoInven=this.isPermisoActualizarOriginalTipoMensajeCorreoInven;
			
			
			this.seleccionarAsignar(tipomensajecorreoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMensajeCorreoInvenConstantesFunciones.quitarEspaciosTipoMensajeCorreoInven(this.tipomensajecorreoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomensajecorreoinvenSessionBean.setsFuncionBusquedaRapida(this.tipomensajecorreoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMensajeCorreoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMensajeCorreoInven(esParaCancelar);				
				this.cancelarNuevoTipoMensajeCorreoInven(esParaCancelar);								
			}
			
			this.tipomensajecorreoinven=new TipoMensajeCorreoInven();
			
			this.inicializarTipoMensajeCorreoInven();
			
			this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMensajeCorreoInven() throws Exception {
		try {
			TipoMensajeCorreoInvenConstantesFunciones.inicializarTipoMensajeCorreoInven(this.tipomensajecorreoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMensajeCorreoInvens(String sAccionBusqueda,List<TipoMensajeCorreoInven> tipomensajecorreoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMensajeCorreoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMensajeCorreoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Mensaje Correos");		
		parameters.put("busquedapor", TipoMensajeCorreoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMensajeCorreoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMensajeCorreoInven=new JRBeanArrayDataSource(TipoMensajeCorreoInvenJInternalFrame.TraerTipoMensajeCorreoInvenBeans(tipomensajecorreoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMensajeCorreoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMensajeCorreoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMensajeCorreoInvenBean.TraerTipoMensajeCorreoInvenBeans(tipomensajecorreoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInvenActionPerformed(null);
					//this.generarExcelReporteTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,tipomensajecorreoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMensajeCorreoInven> tipomensajecorreoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMensajeCorreoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMensajeCorreoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMensajeCorreoInven tipomensajecorreoinven : tipomensajecorreoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataTipoMensajeCorreoInven("NORMAL",row,workbook,tipomensajecorreoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMensajeCorreoInven(String sTipo,Row row,Workbook workbook) {
		
		TipoMensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderTipoMensajeCorreoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMensajeCorreoInven> tipomensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMensajeCorreoInven tipomensajecorreoinven : tipomensajecorreoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomensajecorreoinven.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomensajecorreoinven.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomensajecorreoinven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMensajeCorreoInven> tipomensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMensajeCorreoInven> tipomensajecorreoinvensRespaldo=null;
		
		classes=TipoMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfTipoMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
		this.tipomensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
		this.tipomensajecorreoinvenLogic.setIsConDeep(true);
		
		tipomensajecorreoinvensRespaldo=this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens();
		
		this.tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(tipomensajecorreoinvensParaReportes);	
		this.tipomensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomensajecorreoinvensParaReportes=this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens();
		this.tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(tipomensajecorreoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMensajeCorreoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMensajeCorreoInven tipomensajecorreoinven : tipomensajecorreoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMensajeCorreoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataTipoMensajeCorreoInven("NORMAL",row,workbook,tipomensajecorreoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMensajeCorreoInven() throws Exception {		
		this.startProcessTipoMensajeCorreoInven(true);
	}
	
	public void startProcessTipoMensajeCorreoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMensajeCorreoInven ,this.jPanelParametrosReportesTipoMensajeCorreoInven, this.jScrollPanelDatosTipoMensajeCorreoInven,this.jPanelPaginacionTipoMensajeCorreoInven, this.jScrollPanelDatosEdicionTipoMensajeCorreoInven, this.jPanelAccionesTipoMensajeCorreoInven,this.jPanelAccionesFormularioTipoMensajeCorreoInven,this.jmenuBarTipoMensajeCorreoInven,this.jmenuBarDetalleTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMensajeCorreoInven=this.jTabbedPaneBusquedasTipoMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesTipoMensajeCorreoInven=this.jPanelParametrosReportesTipoMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosTipoMensajeCorreoInven=this.jScrollPanelDatosTipoMensajeCorreoInven;
		final JTable jTableDatosTipoMensajeCorreoInven=this.jTableDatosTipoMensajeCorreoInven;		
		final JPanel jPanelPaginacionTipoMensajeCorreoInven=this.jPanelPaginacionTipoMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoMensajeCorreoInven=this.jScrollPanelDatosEdicionTipoMensajeCorreoInven;
		final JPanel jPanelAccionesTipoMensajeCorreoInven=this.jPanelAccionesTipoMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarTipoMensajeCorreoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelCamposTipoMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelAccionesFormularioTipoMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposTipoMensajeCorreoInven=jPanelCamposAuxiliarTipoMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioTipoMensajeCorreoInven=jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarTipoMensajeCorreoInven=this.jmenuBarTipoMensajeCorreoInven;
		final JToolBar jTtoolBarTipoMensajeCorreoInven=this.jTtoolBarTipoMensajeCorreoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jmenuBarDetalleTipoMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTtoolBarDetalleTipoMensajeCorreoInven;
		}
		
		final JMenuBar jmenuBarDetalleTipoMensajeCorreoInven=jmenuBarDetalleAuxiliarTipoMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleTipoMensajeCorreoInven=jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosTipoMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMensajeCorreoInven ,jPanelParametrosReportesTipoMensajeCorreoInven,jTableDatosTipoMensajeCorreoInven, /*jScrollPanelDatosTipoMensajeCorreoInven,*/jPanelCamposTipoMensajeCorreoInven,jPanelPaginacionTipoMensajeCorreoInven, /*jScrollPanelDatosEdicionTipoMensajeCorreoInven,*/ jPanelAccionesTipoMensajeCorreoInven,jPanelAccionesFormularioTipoMensajeCorreoInven,jmenuBarTipoMensajeCorreoInven,jmenuBarDetalleTipoMensajeCorreoInven,jTtoolBarTipoMensajeCorreoInven,jTtoolBarDetalleTipoMensajeCorreoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMensajeCorreoInven ,jPanelParametrosReportesTipoMensajeCorreoInven, jScrollPanelDatosTipoMensajeCorreoInven,jPanelPaginacionTipoMensajeCorreoInven, jScrollPanelDatosEdicionTipoMensajeCorreoInven, jPanelAccionesTipoMensajeCorreoInven,jPanelAccionesFormularioTipoMensajeCorreoInven,jmenuBarTipoMensajeCorreoInven,jmenuBarDetalleTipoMensajeCorreoInven,jTtoolBarTipoMensajeCorreoInven,jTtoolBarDetalleTipoMensajeCorreoInven);
						
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
	
	public void finishProcessTipoMensajeCorreoInven() {// throws Exception 
		this.finishProcessTipoMensajeCorreoInven(true);
	}
	
	public void finishProcessTipoMensajeCorreoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMensajeCorreoInven ,this.jPanelParametrosReportesTipoMensajeCorreoInven, this.jScrollPanelDatosTipoMensajeCorreoInven,this.jPanelPaginacionTipoMensajeCorreoInven, this.jScrollPanelDatosEdicionTipoMensajeCorreoInven, this.jPanelAccionesTipoMensajeCorreoInven,this.jPanelAccionesFormularioTipoMensajeCorreoInven,this.jmenuBarTipoMensajeCorreoInven,this.jmenuBarDetalleTipoMensajeCorreoInven,this.jTtoolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMensajeCorreoInven=this.jTabbedPaneBusquedasTipoMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesTipoMensajeCorreoInven=this.jPanelParametrosReportesTipoMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosTipoMensajeCorreoInven=this.jScrollPanelDatosTipoMensajeCorreoInven;
		final JTable jTableDatosTipoMensajeCorreoInven=this.jTableDatosTipoMensajeCorreoInven;		
		final JPanel jPanelPaginacionTipoMensajeCorreoInven=this.jPanelPaginacionTipoMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoMensajeCorreoInven=this.jScrollPanelDatosEdicionTipoMensajeCorreoInven;
		final JPanel jPanelAccionesTipoMensajeCorreoInven=this.jPanelAccionesTipoMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarTipoMensajeCorreoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelCamposTipoMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelAccionesFormularioTipoMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposTipoMensajeCorreoInven=jPanelCamposAuxiliarTipoMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioTipoMensajeCorreoInven=jPanelAccionesFormularioAuxiliarTipoMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarTipoMensajeCorreoInven=this.jmenuBarTipoMensajeCorreoInven;		
		final JToolBar jTtoolBarTipoMensajeCorreoInven=this.jTtoolBarTipoMensajeCorreoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jmenuBarDetalleTipoMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTtoolBarDetalleTipoMensajeCorreoInven;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMensajeCorreoInven=jmenuBarDetalleAuxiliarTipoMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleTipoMensajeCorreoInven=jTtoolBarDetalleAuxiliarTipoMensajeCorreoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosTipoMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMensajeCorreoInven ,jPanelParametrosReportesTipoMensajeCorreoInven, jTableDatosTipoMensajeCorreoInven,/*jScrollPanelDatosTipoMensajeCorreoInven,*/jPanelCamposTipoMensajeCorreoInven,jPanelPaginacionTipoMensajeCorreoInven, /*jScrollPanelDatosEdicionTipoMensajeCorreoInven,*/ jPanelAccionesTipoMensajeCorreoInven,jPanelAccionesFormularioTipoMensajeCorreoInven,jmenuBarTipoMensajeCorreoInven,jmenuBarDetalleTipoMensajeCorreoInven,jTtoolBarTipoMensajeCorreoInven,jTtoolBarDetalleTipoMensajeCorreoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMensajeCorreoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMensajeCorreoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomensajecorreoinvenConstantesFunciones.getsFinalQueryTipoMensajeCorreoInven();
		String  finalQueryPaginacionTodos=this.tipomensajecorreoinvenConstantesFunciones.getsFinalQueryTipoMensajeCorreoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesNoTipoMensajeCorreoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesTipoMensajeCorreoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMensajeCorreoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomensajecorreoinvensEliminados= new ArrayList<TipoMensajeCorreoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMensajeCorreoInven();
		
				///*TipoMensajeCorreoInvenSessionBean*/this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
			
			if(this.tipomensajecorreoinvenSessionBean==null) {
				this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
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
					this.iNumeroPaginacion=TipoMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMensajeCorreoInvenConstantesFunciones.getClassesForeignKeysOfTipoMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomensajecorreoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomensajecorreoinvensAux= new ArrayList<TipoMensajeCorreoInven>();
			
				
			tipomensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
			tipomensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
			tipomensajecorreoinvenLogic.setIsConDeep(true);
			
			
			tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomensajecorreoinvenLogic.getTodosTipoMensajeCorreoInvens(finalQueryGlobal,pagination);
					
					//tipomensajecorreoinvenLogic.getTodosTipoMensajeCorreoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()==null|| tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomensajecorreoinvensAux= new ArrayList<TipoMensajeCorreoInven>();
							tipomensajecorreoinvensAux.addAll(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomensajecorreoinvensAux= new ArrayList<TipoMensajeCorreoInven>();
							tipomensajecorreoinvensAux.addAll(tipomensajecorreoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomensajecorreoinvenLogic.getTodosTipoMensajeCorreoInvens(finalQueryGlobal+"",this.pagination);												
							
							//tipomensajecorreoinvenLogic.getTodosTipoMensajeCorreoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(new ArrayList<TipoMensajeCorreoInven>());					
							tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().addAll(tipomensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomensajecorreoinvens=new ArrayList<TipoMensajeCorreoInven>();
							tipomensajecorreoinvens.addAll(tipomensajecorreoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMensajeCorreoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMensajeCorreoInven=this.idActual;
				
				} else if(this.idTipoMensajeCorreoInvenActual!=null && this.idTipoMensajeCorreoInvenActual!=0L) {
					idTipoMensajeCorreoInven=idTipoMensajeCorreoInvenActual;
				}
				
					
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndicePorId(idTipoMensajeCorreoInven);
				
				this.tipomensajecorreoinvens=new ArrayList<TipoMensajeCorreoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomensajecorreoinvenLogic.getEntity(idTipoMensajeCorreoInven);
					
					//tipomensajecorreoinvenLogic.getEntityWithConnection(idTipoMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(new ArrayList<TipoMensajeCorreoInven>());
					tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().add(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomensajecorreoinvens=new ArrayList<TipoMensajeCorreoInven>();
					this.tipomensajecorreoinvens.add(tipomensajecorreoinven);
				}
				
				if(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()==null||tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomensajecorreoinvens==null|| tipomensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvensAux=new ArrayList<TipoMensajeCorreoInven>();
						tipomensajecorreoinvensAux.addAll(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomensajecorreoinvensAux=new ArrayList<TipoMensajeCorreoInven>();
							tipomensajecorreoinvensAux.addAll(tipomensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMensajeCorreoInvens("FK_IdModulo",tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMensajeCorreoInvens("FK_IdModulo",tipomensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(new ArrayList<TipoMensajeCorreoInven>());
						tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().addAll(tipomensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomensajecorreoinvens=new ArrayList<TipoMensajeCorreoInven>();
							tipomensajecorreoinvens.addAll(tipomensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMensajeCorreoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMensajeCorreoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomensajecorreoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomensajecorreoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMensajeCorreoInven tipomensajecorreoinven) {
		Boolean permite=true;
		
		if(this.tipomensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMensajeCorreoInvenConstantesFunciones.getOrderByListaTipoMensajeCorreoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMensajeCorreoInvenConstantesFunciones.getOrderByListaTipoMensajeCorreoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				if(tipomensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipomensajecorreoinvenTotales=tipomensajecorreoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMensajeCorreoInven tipomensajecorreoinven:this.tipomensajecorreoinvens) {
				if(tipomensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipomensajecorreoinvenTotales=tipomensajecorreoinven;
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
			this.tipomensajecorreoinvenAux=new TipoMensajeCorreoInven();
			this.tipomensajecorreoinvenAux.setsType(Constantes2.S_TOTALES);
			this.tipomensajecorreoinvenAux.setIsNew(false);
			this.tipomensajecorreoinvenAux.setIsChanged(false);
			this.tipomensajecorreoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaTipoMensajeCorreoInven(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),this.tipomensajecorreoinvenAux);
				
				this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().add(this.tipomensajecorreoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaTipoMensajeCorreoInven(this.tipomensajecorreoinvens,this.tipomensajecorreoinvenAux);
				
				this.tipomensajecorreoinvens.add(this.tipomensajecorreoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomensajecorreoinvenTotales=new TipoMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().remove(tipomensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomensajecorreoinvens.remove(tipomensajecorreoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomensajecorreoinvenTotales=new TipoMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				if(tipomensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipomensajecorreoinvenTotales=tipomensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaTipoMensajeCorreoInven(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),tipomensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMensajeCorreoInven tipomensajecorreoinven:this.tipomensajecorreoinvens) {
				if(tipomensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipomensajecorreoinvenTotales=tipomensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaTipoMensajeCorreoInven(this.tipomensajecorreoinvens,tipomensajecorreoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMensajeCorreoInvensFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoMensajeCorreoInvensFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvensFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
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
	
	public void inicializarPermisosTipoMensajeCorreoInven() {
		this.isPermisoTodoTipoMensajeCorreoInven=false;
		this.isPermisoNuevoTipoMensajeCorreoInven=false;
		this.isPermisoActualizarTipoMensajeCorreoInven=false;
		this.isPermisoActualizarOriginalTipoMensajeCorreoInven=false;
		this.isPermisoEliminarTipoMensajeCorreoInven=false;
		this.isPermisoGuardarCambiosTipoMensajeCorreoInven=false;
		this.isPermisoConsultaTipoMensajeCorreoInven=false;
		this.isPermisoBusquedaTipoMensajeCorreoInven=false;
		this.isPermisoReporteTipoMensajeCorreoInven=false;		
		this.isPermisoOrdenTipoMensajeCorreoInven=false;		
		this.isPermisoPaginacionMedioTipoMensajeCorreoInven=false;		
		this.isPermisoPaginacionAltoTipoMensajeCorreoInven=false;
		this.isPermisoPaginacionTodoTipoMensajeCorreoInven=false;
		this.isPermisoCopiarTipoMensajeCorreoInven=false;		
		this.isPermisoVerFormTipoMensajeCorreoInven=false;		
		this.isPermisoDuplicarTipoMensajeCorreoInven=false;		
		this.isPermisoOrdenTipoMensajeCorreoInven=false;		
	}
	
	public void setPermisosUsuarioTipoMensajeCorreoInven(Boolean isPermiso) {
		this.isPermisoTodoTipoMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoTipoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarTipoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarTipoMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoMensajeCorreoInven=isPermiso;
		this.isPermisoConsultaTipoMensajeCorreoInven=isPermiso;
		this.isPermisoBusquedaTipoMensajeCorreoInven=isPermiso;
		this.isPermisoReporteTipoMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionMedioTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionAltoTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionTodoTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoCopiarTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoVerFormTipoMensajeCorreoInven=isPermiso;		
		this.isPermisoDuplicarTipoMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenTipoMensajeCorreoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMensajeCorreoInven(Boolean isPermiso) {
		//this.isPermisoTodoTipoMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoTipoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarTipoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarTipoMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoMensajeCorreoInven=isPermiso;
		//this.isPermisoConsultaTipoMensajeCorreoInven=isPermiso;
		//this.isPermisoBusquedaTipoMensajeCorreoInven=isPermiso;
		//this.isPermisoReporteTipoMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenTipoMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMensajeCorreoInven=isPermiso;		
		//this.isPermisoCopiarTipoMensajeCorreoInven=isPermiso;		
		//this.isPermisoDuplicarTipoMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenTipoMensajeCorreoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMensajeCorreoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMensajeCorreoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMensajeCorreoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMensajeCorreoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMensajeCorreoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMensajeCorreoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoMensajeCorreoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMensajeCorreoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMensajeCorreoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMensajeCorreoInven=this.isPermisoActualizarTipoMensajeCorreoInven;
			this.isPermisoEliminarTipoMensajeCorreoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMensajeCorreoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMensajeCorreoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMensajeCorreoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMensajeCorreoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMensajeCorreoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMensajeCorreoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMensajeCorreoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMensajeCorreoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMensajeCorreoInven.setToolTipText(this.jTableDatosTipoMensajeCorreoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMensajeCorreoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMensajeCorreoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMensajeCorreoInven() throws Exception {
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
	public void inicializarCombosForeignKeyTipoMensajeCorreoInvenListas()throws Exception {
		try	{						
			
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMensajeCorreoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMensajeCorreoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenReturnGeneral=new TipoMensajeCorreoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.tipomensajecorreoinvenConstantesFunciones.cargarid_moduloTipoMensajeCorreoInven)
					 || (this.esRecargarFks && this.tipomensajecorreoinvenConstantesFunciones.cargarid_moduloTipoMensajeCorreoInven)) {

					if(!this.tipomensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+tipomensajecorreoinvenSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomensajecorreoinvenReturnGeneral=tipomensajecorreoinvenLogic.cargarCombosLoteForeignKeyTipoMensajeCorreoInven(finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=tipomensajecorreoinvenReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMensajeCorreoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {
			if(this.tipomensajecorreoinvenSessionBean==null) {
				this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
			}

			if(!this.tipomensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoMensajeCorreoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMensajeCorreoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMensajeCorreoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMensajeCorreoInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMensajeCorreoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMensajeCorreoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMensajeCorreoInven()throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMensajeCorreoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMensajeCorreoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMensajeCorreoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMensajeCorreoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean(); 
		this.tipomensajecorreoinvenConstantesFunciones=new TipoMensajeCorreoInvenConstantesFunciones(); 
		this.tipomensajecorreoinvenBean=new TipoMensajeCorreoInven();//(this.tipomensajecorreoinvenConstantesFunciones); 		
		this.tipomensajecorreoinvenReturnGeneral=new TipoMensajeCorreoInvenParameterReturnGeneral(); 
		
		this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMensajeCorreoInven(true);
			
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
			
			this.tipomensajecorreoinvenConstantesFunciones=new TipoMensajeCorreoInvenConstantesFunciones(); 
			this.tipomensajecorreoinvenBean=new TipoMensajeCorreoInven();//this.tipomensajecorreoinvenConstantesFunciones); 			
			this.tipomensajecorreoinvenReturnGeneral=new TipoMensajeCorreoInvenParameterReturnGeneral(); 
		
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Mensaje Correo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomensajecorreoinven=new TipoMensajeCorreoInven();
			this.tipomensajecorreoinvens = new ArrayList<TipoMensajeCorreoInven>();
			this.tipomensajecorreoinvensAux = new ArrayList<TipoMensajeCorreoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic=new TipoMensajeCorreoInvenLogic();
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMensajeCorreoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven);	
					}
					
					if(this.jInternalFrameImportacionTipoMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMensajeCorreoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMensajeCorreoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMensajeCorreoInven);
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setVisible(false);
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven);
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMensajeCorreoInven);
					this.jInternalFrameImportacionTipoMensajeCorreoInven.setVisible(false);
					this.jInternalFrameImportacionTipoMensajeCorreoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMensajeCorreoInven);
					this.jInternalFrameOrderByTipoMensajeCorreoInven.setVisible(false);
					this.jInternalFrameOrderByTipoMensajeCorreoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMensajeCorreoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomensajecorreoinvenReturnGeneral=new TipoMensajeCorreoInvenParameterReturnGeneral();
			
			this.tipomensajecorreoinvenParameterGeneral=new TipoMensajeCorreoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomensajecorreoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			
			
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMensajeCorreoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMensajeCorreoInven(false);
			
			this.setPermisosUsuarioTipoMensajeCorreoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMensajeCorreoInvenClasesRelacionadas();
			}
			
			if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMensajeCorreoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMensajeCorreoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMensajeCorreoInven();
			}
			
			if(!this.isPermisoBusquedaTipoMensajeCorreoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMensajeCorreoInven,this.isPermisoPaginacionMedioTipoMensajeCorreoInven,this.isPermisoPaginacionTodoTipoMensajeCorreoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarTipoMensajeCorreoInven());
				
				this.tiposColumnasSelect=TipoMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarTipoMensajeCorreoInven(true);
				
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
			//if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMensajeCorreoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMensajeCorreoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMensajeCorreoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMensajeCorreoInven() ;
			
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
			
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipomensajecorreoinvenImplementable= (TipoMensajeCorreoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomensajecorreoinvenImplementableHome= (TipoMensajeCorreoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomensajecorreoinvens= new ArrayList<TipoMensajeCorreoInven>();
			this.tipomensajecorreoinvensEliminados= new ArrayList<TipoMensajeCorreoInven>();
						
			this.isEsNuevoTipoMensajeCorreoInven=false;
			this.esParaAccionDesdeFormularioTipoMensajeCorreoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMensajeCorreoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMensajeCorreoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMensajeCorreoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMensajeCorreoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMensajeCorreoInven();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMensajeCorreoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMensajeCorreoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMensajeCorreoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMensajeCorreoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMensajeCorreoInven")) {
				iIndex=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMensajeCorreoInven();	
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
	
	public void cargarCombosForeignKeyTipoMensajeCorreoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMensajeCorreoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMensajeCorreoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMensajeCorreoInven();
		
		this.cargarCombosFrameForeignKeyTipoMensajeCorreoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMensajeCorreoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMensajeCorreoInven();
		}
	}
	
	
	
	public void jButtonNuevoTipoMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			
			if(jTableDatosTipoMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosTipoMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosTipoMensajeCorreoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMensajeCorreoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMensajeCorreoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(true);			
			//this.tipomensajecorreoinven=new TipoMensajeCorreoInven();
			//this.tipomensajecorreoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven() ;
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMensajeCorreoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomensajecorreoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);				
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMensajeCorreoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMensajeCorreoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMensajeCorreoInven.getSelectedRows().length;			
			}
			
			tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMensajeCorreoInven--;			
				//TipoMensajeCorreoInven tipomensajecorreoinvenAux= new TipoMensajeCorreoInven();			
				//tipomensajecorreoinvenAux.setId(this.iIdNuevoTipoMensajeCorreoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMensajeCorreoInven tipomensajecorreoinvenOrigen=new TipoMensajeCorreoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMensajeCorreoInven tipomensajecorreoinvenOrigen : tipomensajecorreoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomensajecorreoinvenOrigen =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomensajecorreoinvenOrigen =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMensajeCorreoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomensajecorreoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMensajeCorreoInven(tipomensajecorreoinvenOrigen,this.tipomensajecorreoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().add(this.tipomensajecorreoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinvens.add(this.tipomensajecorreoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
				
				this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoTipoMensajeCorreoInven(), this.getIndiceNuevoTipoMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosTipoMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();									
		
			TipoMensajeCorreoInven tipomensajecorreoinvenOrigen=new TipoMensajeCorreoInven();
			TipoMensajeCorreoInven tipomensajecorreoinvenDestino=new TipoMensajeCorreoInven();
				
			tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMensajeCorreoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomensajecorreoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMensajeCorreoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenOrigen =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomensajecorreoinvenOrigen =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomensajecorreoinvenDestino =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomensajecorreoinvenDestino =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomensajecorreoinvenOrigen =tipomensajecorreoinvensSeleccionados.get(0);
				tipomensajecorreoinvenDestino =tipomensajecorreoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMensajeCorreoInven(tipomensajecorreoinvenOrigen,tipomensajecorreoinvenDestino,true,false);
				
				tipomensajecorreoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomensajecorreoinvenDestino,tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomensajecorreoinvenDestino,tipomensajecorreoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
				
				//this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoTipoMensajeCorreoInven(), this.getIndiceNuevoTipoMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosTipoMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMensajeCorreoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelAccionesTipoMensajeCorreoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMensajeCorreoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMensajeCorreoInven();
			
			this.abrirFrameOrderByTipoMensajeCorreoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMensajeCorreoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMensajeCorreoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSize(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.iWidthFormulario,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMensajeCorreoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMensajeCorreoInven.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jContentPaneDetalleTipoMensajeCorreoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jContentPaneDetalleTipoMensajeCorreoInven.getWidth(),TipoMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jContentPaneDetalleTipoMensajeCorreoInven.getWidth(),TipoMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jContentPaneDetalleTipoMensajeCorreoInven.getWidth(),TipoMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMensajeCorreoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMensajeCorreoInven,false,this);
				} else {
					this.jInternalFrameOrderByTipoMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMensajeCorreoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMensajeCorreoInven);
				this.jInternalFrameOrderByTipoMensajeCorreoInven.setVisible(false);
				this.jInternalFrameOrderByTipoMensajeCorreoInven.setSelected(false);
				
				this.jInternalFrameOrderByTipoMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMensajeCorreoInven"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMensajeCorreoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMensajeCorreoInven==null) {
				
				this.jInternalFrameImportacionTipoMensajeCorreoInven=new ImportacionJInternalFrame(TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMensajeCorreoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMensajeCorreoInven);
				this.jInternalFrameImportacionTipoMensajeCorreoInven.setVisible(false);
				this.jInternalFrameImportacionTipoMensajeCorreoInven.setSelected(false);


				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMensajeCorreoInven"));
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMensajeCorreoInven"));
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMensajeCorreoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven==null) {
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven=new ReporteDinamicoJInternalFrame(TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven);
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMensajeCorreoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMensajeCorreoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoMensajeCorreoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMensajeCorreoInven);
			
	       	this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMensajeCorreoInven.dispose();
			//this.jInternalFrameDetalleFormTipoMensajeCorreoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameImportacionTipoMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameOrderByTipoMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameOrderByTipoMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMensajeCorreoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameImportacionTipoMensajeCorreoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMensajeCorreoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMensajeCorreoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(true);
			//this.isEsNuevoTipoMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false) ;
			
			if(tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMensajeCorreoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMensajeCorreoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMensajeCorreoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(true);
			//this.isEsNuevoTipoMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomensajecorreoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false) ;
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMensajeCorreoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMensajeCorreoInven(false);
			
			//if(!this.isEsNuevoTipoMensajeCorreoInven) {								
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				
			}
			
			if(this.permiteMantenimiento(this.tipomensajecorreoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMensajeCorreoInven=true;
					this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
					this.isEsNuevoTipoMensajeCorreoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMensajeCorreoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMensajeCorreoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(false);
			
												
				
				if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMensajeCorreoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,tipomensajecorreoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomensajecorreoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomensajecorreoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipomensajecorreoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipomensajecorreoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomensajecorreoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMensajeCorreoInvenModel) this.jTableDatosTipoMensajeCorreoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMensajeCorreoInven=true;
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
				this.isEsNuevoTipoMensajeCorreoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(false);
				
				
				
				if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMensajeCorreoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosTipoMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosTipoMensajeCorreoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMensajeCorreoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(false) ;
			
			this.isEsNuevoTipoMensajeCorreoInven=false;
			
			if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMensajeCorreoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
				
				//SI ES MANUAL
				if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMensajeCorreoInven--;			
			//TipoMensajeCorreoInven tipomensajecorreoinvenAux= new TipoMensajeCorreoInven();			
			//tipomensajecorreoinvenAux.setId(this.iIdNuevoTipoMensajeCorreoInven);
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMensajeCorreoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
			
			this.tipomensajecorreoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().add(this.tipomensajecorreoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomensajecorreoinvens.add(this.tipomensajecorreoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			
			this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoTipoMensajeCorreoInven(), this.getIndiceNuevoTipoMensajeCorreoInven());
			
			int iLastRow =  this.jTableDatosTipoMensajeCorreoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMensajeCorreoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMensajeCorreoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();
			}
			
			//this.abrirFrameTreeTipoMensajeCorreoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Mensaje CorreoS ?", "MANTENIMIENTO DE Tipo Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMensajeCorreoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMensajeCorreoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomensajecorreoinvenReturnGeneral=tipomensajecorreoinvenLogic.procesarImportacionTipoMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomensajecorreoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMensajeCorreoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMensajeCorreoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMensajeCorreoInven.setFileImportacion(this.jInternalFrameImportacionTipoMensajeCorreoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMensajeCorreoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMensajeCorreoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		

		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMensajeCorreoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMensajeCorreoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomensajecorreoinven.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomensajecorreoinven.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMensajeCorreoInven tipomensajecorreoinven:tipomensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomensajecorreoinven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoMensajeCorreoInven(row);				
			//	iRow++;
			//}				
			
			//for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMensajeCorreoInven(tipomensajecorreoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMensajeCorreoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMensajeCorreoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMensajeCorreoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMensajeCorreoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMensajeCorreoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMensajeCorreoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMensajeCorreoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMensajeCorreoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMensajeCorreoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMensajeCorreoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMensajeCorreoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMensajeCorreoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMensajeCorreoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMensajeCorreoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMensajeCorreoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMensajeCorreoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMensajeCorreoInven();
		
		this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMensajeCorreoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMensajeCorreoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMensajeCorreoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMensajeCorreoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMensajeCorreoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMensajeCorreoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMensajeCorreoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMensajeCorreoInven() throws Exception {
		try	{
			if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMensajeCorreoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMensajeCorreoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMensajeCorreoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMensajeCorreoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMensajeCorreoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMensajeCorreoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMensajeCorreoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMensajeCorreoInven(Boolean esInicializar) throws Exception {				
		if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMensajeCorreoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMensajeCorreoInven() throws Exception {
		this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMensajeCorreoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMensajeCorreoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMensajeCorreoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomensajecorreoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMensajeCorreoInven.setModel(new TipoMensajeCorreoInvenModel(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMensajeCorreoInven.setModel(new TipoMensajeCorreoInvenModel(this.tipomensajecorreoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMensajeCorreoInven!=null && this.jInternalFrameOrderByTipoMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMensajeCorreoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,tipomensajecorreoinvenConstantesFunciones.resaltarSeleccionarTipoMensajeCorreoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,tipomensajecorreoinvenConstantesFunciones.resaltarSeleccionarTipoMensajeCorreoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID));

		if(this.tipomensajecorreoinvenConstantesFunciones.mostraridTipoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltaridTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activaridTipoMensajeCorreoInven,this,true,"idTipoMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltaridTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activaridTipoMensajeCorreoInven,this,true,"idTipoMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO));

		if(this.tipomensajecorreoinvenConstantesFunciones.mostrarid_moduloTipoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.tipomensajecorreoinvenConstantesFunciones.resaltarid_moduloTipoMensajeCorreoInven,this,this.tipomensajecorreoinvenConstantesFunciones.activarid_moduloTipoMensajeCorreoInven));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.tipomensajecorreoinvenConstantesFunciones.resaltarid_moduloTipoMensajeCorreoInven,this,this.tipomensajecorreoinvenConstantesFunciones.activarid_moduloTipoMensajeCorreoInven,false,"id_moduloTipoMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO));

		if(this.tipomensajecorreoinvenConstantesFunciones.mostrarcodigoTipoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltarcodigoTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activarcodigoTipoMensajeCorreoInven,this,true,"codigoTipoMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltarcodigoTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activarcodigoTipoMensajeCorreoInven,this,true,"codigoTipoMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomensajecorreoinvenConstantesFunciones.mostrarnombreTipoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltarnombreTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activarnombreTipoMensajeCorreoInven,this,true,"nombreTipoMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomensajecorreoinvenConstantesFunciones.resaltarnombreTipoMensajeCorreoInven,this.tipomensajecorreoinvenConstantesFunciones.activarnombreTipoMensajeCorreoInven,this,true,"nombreTipoMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMensajeCorreoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMensajeCorreoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMensajeCorreoInven.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMensajeCorreoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMensajeCorreoInven.moveColumn(this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMensajeCorreoInven.moveColumn(this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMensajeCorreoInven.moveColumn(this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMensajeCorreoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMensajeCorreoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMensajeCorreoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMensajeCorreoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMensajeCorreoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMensajeCorreoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomensajecorreoinvens.size()-1;
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
		//this.jTableDatosTipoMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMensajeCorreoInven();
			
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
				
				//this.isEsNuevoTipoMensajeCorreoInven=false;
					
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
				if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomensajecorreoinven.getsType().equals("DUPLICADO")
				   || this.tipomensajecorreoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMensajeCorreoInven=true;
				
				} else {
					this.isEsNuevoTipoMensajeCorreoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomensajecorreoinven.getId()>=0 && !this.tipomensajecorreoinven.getIsNew()) {						
						this.isEsNuevoTipoMensajeCorreoInven=false;
						
					} else {
						this.isEsNuevoTipoMensajeCorreoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMensajeCorreoInven(esRelaciones);						
				
				this.seleccionarTipoMensajeCorreoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomensajecorreoinven.getId()<0) {
					this.isEsNuevoTipoMensajeCorreoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMensajeCorreoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMensajeCorreoInven(evt,rowIndex);
				}	
				
				if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMensajeCorreoInven: " + this.dDif); 
					}
				}								
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMensajeCorreoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomensajecorreoinven)) {
					if(this.tipomensajecorreoinven.getId()>0) {
						this.tipomensajecorreoinven.setIsDeleted(true);
						
						this.tipomensajecorreoinvensEliminados.add(this.tipomensajecorreoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().remove(this.tipomensajecorreoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinvens.remove(this.tipomensajecorreoinven);				
					}
					
					
					((TipoMensajeCorreoInvenModel) this.jTableDatosTipoMensajeCorreoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMensajeCorreoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMensajeCorreoInven) {
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Modulo
					if(!this.tipomensajecorreoinvenConstantesFunciones.cargarid_moduloTipoMensajeCorreoInven || this.tipomensajecorreoinvenConstantesFunciones.event_dependid_moduloTipoMensajeCorreoInven) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.tipomensajecorreoinven.getid_modulo());
									//this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(tipomensajecorreoinven.getModulo()!=null) {
							this.modulosForeignKey.add(tipomensajecorreoinven.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.tipomensajecorreoinven.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMensajeCorreoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMensajeCorreoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMensajeCorreoInven(tipomensajecorreoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(tipomensajecorreoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMensajeCorreoInven(tipomensajecorreoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMensajeCorreoInven(tipomensajecorreoinven);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMensajeCorreoInven tipomensajecorreoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomensajecorreoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMensajeCorreoInven tipomensajecorreoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomensajecorreoinvenLocal=this.tipomensajecorreoinven;
			} else {
				tipomensajecorreoinvenLocal=this.tipomensajecorreoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomensajecorreoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMensajeCorreoInven(tipomensajecorreoinvenLocal,true);
					
					if(tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomensajecorreoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomensajecorreoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(tipomensajecorreoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(tipomensajecorreoinven);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(tipomensajecorreoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.getText()==null || this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.getText()=="" || this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setText("0");
			}

			if(conColumnasBase) {tipomensajecorreoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelIdTipoMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomensajecorreoinven.setcodigo(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelcodigoTipoMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomensajecorreoinven.setnombre(this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelnombreTipoMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinvenBean,TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinvenOrigen,TipoMensajeCorreoInven tipomensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomensajecorreoinvenOrigen.getId()!=null && !tipomensajecorreoinvenOrigen.getId().equals(0L))) {tipomensajecorreoinven.setId(tipomensajecorreoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && tipomensajecorreoinvenOrigen.getcodigo()!=null && !tipomensajecorreoinvenOrigen.getcodigo().equals(""))) {tipomensajecorreoinven.setcodigo(tipomensajecorreoinvenOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomensajecorreoinvenOrigen.getnombre()!=null && !tipomensajecorreoinvenOrigen.getnombre().equals(""))) {tipomensajecorreoinven.setnombre(tipomensajecorreoinvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setText(tipomensajecorreoinven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMensajeCorreoInven(TipoMensajeCorreoInvenBean tipomensajecorreoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setText(tipomensajecorreoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setText(tipomensajecorreoinvenBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setText(tipomensajecorreoinvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMensajeCorreoInven(TipoMensajeCorreoInvenParameterReturnGeneral tipomensajecorreoinvenReturnGeneral,TipoMensajeCorreoInvenBean tipomensajecorreoinvenBean,Boolean conDefault) throws Exception { 
		try {
			TipoMensajeCorreoInven tipomensajecorreoinvenLocal=new TipoMensajeCorreoInven();
			
			tipomensajecorreoinvenLocal=tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomensajecorreoinvenLocal.getId()!=null && !tipomensajecorreoinvenLocal.getId().equals(0L))) {tipomensajecorreoinvenBean.setId(tipomensajecorreoinvenLocal.getId());}}
			if(conDefault || (!conDefault && tipomensajecorreoinvenLocal.getcodigo()!=null && !tipomensajecorreoinvenLocal.getcodigo().equals(""))) {tipomensajecorreoinvenBean.setcodigo(tipomensajecorreoinvenLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomensajecorreoinvenLocal.getnombre()!=null && !tipomensajecorreoinvenLocal.getnombre().equals(""))) {tipomensajecorreoinvenBean.setnombre(tipomensajecorreoinvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMensajeCorreoInvenGenerico(Long idTipoMensajeCorreoInvenSeleccionado,JComboBox jComboBoxTipoMensajeCorreoInven,List<TipoMensajeCorreoInven> tipomensajecorreoinvensLocal)throws Exception {
		try {
			TipoMensajeCorreoInven  tipomensajecorreoinvenTemp=null;

			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensLocal) {
				if(tipomensajecorreoinvenAux.getId()!=null && tipomensajecorreoinvenAux.getId().equals(idTipoMensajeCorreoInvenSeleccionado)) {
					tipomensajecorreoinvenTemp=tipomensajecorreoinvenAux;
					break;
				}
			}

			jComboBoxTipoMensajeCorreoInven.setSelectedItem(tipomensajecorreoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMensajeCorreoInvenGenerico(JComboBox jComboBoxTipoMensajeCorreoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMensajeCorreoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMensajeCorreoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomensajecorreoinven=(TipoMensajeCorreoInven) tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomensajecorreoinven =(TipoMensajeCorreoInven) tipomensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!tipomensajecorreoinven.getIsNew() && !tipomensajecorreoinven.getIsChanged() && !tipomensajecorreoinven.getIsDeleted()) {
				sDescripcion=tipomensajecorreoinven.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=tipomensajecorreoinven.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMensajeCorreoInven tipomensajecorreoinvenRow=new TipoMensajeCorreoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomensajecorreoinvenRow=(TipoMensajeCorreoInven) tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomensajecorreoinvenRow=(TipoMensajeCorreoInven) tipomensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));			
			this.jButtonDuplicarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven && this.isPermisoDuplicarTipoMensajeCorreoInven));			
			this.jButtonCopiarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven && this.isPermisoCopiarTipoMensajeCorreoInven));
			this.jButtonVerFormTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven && this.isPermisoVerFormTipoMensajeCorreoInven));
			
			this.jButtonAbrirOrderByTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));			
			
			this.jButtonNuevoRelacionesTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarTipoMensajeCorreoInven && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven && this.isPermisoEliminarTipoMensajeCorreoInven));
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven);							
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));						
			this.jButtonDuplicarToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven && this.isPermisoDuplicarTipoMensajeCorreoInven));						
			this.jButtonCopiarToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven && this.isPermisoCopiarTipoMensajeCorreoInven));			
			this.jButtonVerFormToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven && this.isPermisoVerFormTipoMensajeCorreoInven));			
			this.jButtonAbrirOrderByToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));
			this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));			
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarTipoMensajeCorreoInven && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven  && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven && this.isPermisoEliminarTipoMensajeCorreoInven));
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarToolBarTipoMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven);				
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));			
			this.jMenuItemDuplicarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven && this.isPermisoDuplicarTipoMensajeCorreoInven));			
			this.jMenuItemCopiarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven && this.isPermisoCopiarTipoMensajeCorreoInven));			
			this.jMenuItemVerFormTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven && this.isPermisoVerFormTipoMensajeCorreoInven));			
			this.jMenuItemAbrirOrderByTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));			
			//this.jMenuItemMostrarOcultarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));
			this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));			
			//this.jMenuItemDetalleMostrarOcultarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven && this.isPermisoOrdenTipoMensajeCorreoInven));			
			this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven));			
			this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven && this.isPermisoNuevoTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));									
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemModificarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarTipoMensajeCorreoInven && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemActualizarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven && this.isPermisoActualizarTipoMensajeCorreoInven));	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemEliminarTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven && this.isPermisoEliminarTipoMensajeCorreoInven));
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemCancelarTipoMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven);				
			}
			
			this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));						
			this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=this.jButtonNuevoTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven=this.jButtonDuplicarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven=this.jButtonCopiarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven=this.jButtonVerFormTipoMensajeCorreoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMensajeCorreoInven=this.jButtonAbrirOrderByTipoMensajeCorreoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=this.jButtonNuevoRelacionesTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=this.jButtonModificarTipoMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=this.jButtonNuevoToolBarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarToolBarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarToolBarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarToolBarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarToolBarTipoMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=this.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=this.jMenuItemNuevoTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemModificarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemActualizarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemEliminarTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemCancelarTipoMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMensajeCorreoInven(Boolean esInicializar) {
		if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMensajeCorreoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMensajeCorreoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMensajeCorreoInven() {
		this.jButtonNuevoTipoMensajeCorreoInven.setVisible(this.isPermisoNuevoTipoMensajeCorreoInven);			
		this.jButtonDuplicarTipoMensajeCorreoInven.setVisible(this.isPermisoDuplicarTipoMensajeCorreoInven);			
		this.jButtonCopiarTipoMensajeCorreoInven.setVisible(this.isPermisoCopiarTipoMensajeCorreoInven);			
		this.jButtonVerFormTipoMensajeCorreoInven.setVisible(this.isPermisoVerFormTipoMensajeCorreoInven);			
		
		this.jButtonAbrirOrderByTipoMensajeCorreoInven.setVisible(this.isPermisoOrdenTipoMensajeCorreoInven);					
		
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.setVisible(this.isPermisoNuevoTipoMensajeCorreoInven);			
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarTipoMensajeCorreoInven.setVisible(this.isPermisoActualizarTipoMensajeCorreoInven);	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.setVisible(this.isPermisoActualizarTipoMensajeCorreoInven);	
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.setVisible(this.isPermisoEliminarTipoMensajeCorreoInven);
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven);						
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.setVisible(this.isPermisoGuardarCambiosTipoMensajeCorreoInven);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setVisible(this.isPermisoActualizarTipoMensajeCorreoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMensajeCorreoInven() {
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarTipoMensajeCorreoInven.setVisible(this.isPermisoActualizarTipoMensajeCorreoInven);	
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.setVisible(this.isPermisoActualizarTipoMensajeCorreoInven);	
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.setVisible(this.isPermisoEliminarTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven);							
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven && this.isPermisoGuardarCambiosTipoMensajeCorreoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMensajeCorreoInven() {
		if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMensajeCorreoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMensajeCorreoInven() {
	}
	
	public void jTableDatosTipoMensajeCorreoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMensajeCorreoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.gettipomensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomensajecorreoinven==null) {
						this.tipomensajecorreoinven = new TipoMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				}

				if(this.tipomensajecorreoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomensajecorreoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTipoMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTipoMensajeCorreoInven(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.gettipomensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.tipomensajecorreoinvenLogic.getConnexion());

				if(this.tipomensajecorreoinven.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.tipomensajecorreoinven.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosTipoMensajeCorreoInven.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTipoMensajeCorreoInven.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTipoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.gettipomensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomensajecorreoinven==null) {
						this.tipomensajecorreoinven = new TipoMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				}

				if(this.tipomensajecorreoinven.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.tipomensajecorreoinven.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.gettipomensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomensajecorreoinven==null) {
						this.tipomensajecorreoinven = new TipoMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				}

				if(this.tipomensajecorreoinven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomensajecorreoinven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.gettipomensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomensajecorreoinven==null) {
						this.tipomensajecorreoinven = new TipoMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);
				}

				if(this.tipomensajecorreoinven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomensajecorreoinven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdModuloTipoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);

			this.getTipoMensajeCorreoInvensFK_IdModulo();

			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);

			//if(TipoMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMensajeCorreoInven() {
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.dispose();
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
			this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.dispose();
			this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven=null;
		}
		
		if(this.jInternalFrameImportacionTipoMensajeCorreoInven!=null) {
			this.jInternalFrameImportacionTipoMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMensajeCorreoInven.dispose();
			this.jInternalFrameImportacionTipoMensajeCorreoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMensajeCorreoInven();
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMensajeCorreoInven")) {
				jButtonDuplicarTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMensajeCorreoInven")) {
				jButtonCopiarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMensajeCorreoInven")) {
				jButtonVerFormTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMensajeCorreoInven")) {
				jButtonDuplicarTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMensajeCorreoInven")) {
				jButtonDuplicarTipoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMensajeCorreoInven")) {
				jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMensajeCorreoInven")) {
				jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMensajeCorreoInven")) {
				jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMensajeCorreoInven")) {
				jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMensajeCorreoInven")) {
				jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMensajeCorreoInven")) {
				jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMensajeCorreoInven")) {
				jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMensajeCorreoInven")) {
				jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMensajeCorreoInven")) {
				jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMensajeCorreoInven")) {
				jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMensajeCorreoInven")) {
				jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMensajeCorreoInven")) {
				jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMensajeCorreoInven")) {
				jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMensajeCorreoInven")) {
				jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMensajeCorreoInven")) {
				jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMensajeCorreoInven")) {
				jButtonMostrarOcultarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMensajeCorreoInven")) {
				jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMensajeCorreoInven")) {
				jButtonCopiarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMensajeCorreoInven")) {
				jButtonVerFormTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMensajeCorreoInven")) {
				jButtonCopiarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMensajeCorreoInven")) {
				jButtonVerFormTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMensajeCorreoInven")) {
				jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMensajeCorreoInven")) {
				jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMensajeCorreoInven")) {
				jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMensajeCorreoInven")) {
				jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMensajeCorreoInven")) {
				jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMensajeCorreoInven")) {
				jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMensajeCorreoInven")) {
				jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMensajeCorreoInven")) {
				jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMensajeCorreoInven")) {
				jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMensajeCorreoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMensajeCorreoInven")) {
				jButtonAbrirOrderByTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMensajeCorreoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMensajeCorreoInven")) {
				jButtonMostrarOcultarTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMensajeCorreoInven")) {
				jButtonCerrarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMensajeCorreoInven")) {
				jButtonGenerarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMensajeCorreoInven")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMensajeCorreoInven")) {
				jButtonCerrarImportacionTipoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMensajeCorreoInven")) {
				
				jButtonGenerarImportacionTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMensajeCorreoInven")) {
				
				jButtonAbrirImportacionTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMensajeCorreoInven")) {
				jComboBoxTiposAccionesTipoMensajeCorreoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMensajeCorreoInven")) {
				jComboBoxTiposRelacionesTipoMensajeCorreoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMensajeCorreoInven")) {
				jComboBoxTiposAccionesTipoMensajeCorreoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMensajeCorreoInven")) {
				
				jComboBoxTiposSeleccionarTipoMensajeCorreoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMensajeCorreoInven")) {
				jTextFieldValorCampoGeneralTipoMensajeCorreoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMensajeCorreoInven")) {
				jButtonAbrirOrderByTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMensajeCorreoInven")) {
				jButtonAbrirOrderByTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMensajeCorreoInven")) {
				jButtonCerrarOrderByTipoMensajeCorreoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonidTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloTipoMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMensajeCorreoInvenBusqueda")) {
				this.jButtoncodigoTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonnombreTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMensajeCorreoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMensajeCorreoInven tipomensajecorreoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomensajecorreoinvenLocal=this.tipomensajecorreoinven;
			} else {
				tipomensajecorreoinvenLocal=this.tipomensajecorreoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
							
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
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
			
			


			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
								
						
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
								
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
							
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
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
			
			


			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
								
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMensajeCorreoInven")) {
					jCheckBoxSeleccionarTodosTipoMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMensajeCorreoInven")) {
					jCheckBoxSeleccionadosTipoMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMensajeCorreoInven")) {
					
				}
				
				


				
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
												
				
				


				
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
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
			
			


			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomensajecorreoinven);
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
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
				
				


				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMensajeCorreoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomensajecorreoinvenAnterior =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMensajeCorreoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMensajeCorreoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomensajecorreoinven =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomensajecorreoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMensajeCorreoInven")) {
				
				}
				
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMensajeCorreoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMensajeCorreoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMensajeCorreoInven")) {
			
			}
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMensajeCorreoInven();
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMensajeCorreoInven")) {
				jButtonDuplicarTipoMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMensajeCorreoInven")) {
				jButtonCopiarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMensajeCorreoInven")) {
				jButtonVerFormTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMensajeCorreoInven")) {
				jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMensajeCorreoInven")) {
				jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMensajeCorreoInven")) {
				jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMensajeCorreoInven")) {
				jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMensajeCorreoInven")) {
				jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMensajeCorreoInven")) {
				jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMensajeCorreoInven")) {
				jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMensajeCorreoInven")) {
				jButtonAbrirOrderByTipoMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMensajeCorreoInven")) {
				jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMensajeCorreoInven")) {
				jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMensajeCorreoInven")) {
				jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonidTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloTipoMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMensajeCorreoInvenBusqueda")) {
				this.jButtoncodigoTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMensajeCorreoInvenBusqueda")) {
				this.jButtonnombreTipoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMensajeCorreoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMensajeCorreoInven")) {
				closingInternalFrameTipoMensajeCorreoInven();
				
			} else if(sTipo.equals("jButtonCancelarTipoMensajeCorreoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMensajeCorreoInven = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMensajeCorreoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMensajeCorreoInvenActionPerformed(null);
			}
			
			TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomensajecorreoinven,new Object(),this.tipomensajecorreoinvenParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomensajecorreoinven)) {
			if(!esControlTabla) {
				if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);			
				}
				
				if(this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomensajecorreoinvenReturnGeneral=tipomensajecorreoinvenLogic.procesarEventosTipoMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),this.tipomensajecorreoinven,this.tipomensajecorreoinvenParameterGeneral,this.isEsNuevoTipoMensajeCorreoInven,classes);//this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral,this.tipomensajecorreoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMensajeCorreoInven(classes,this.tipomensajecorreoinvenReturnGeneral,this.tipomensajecorreoinvenBean,false);
					}
						
					if(this.tipomensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven());	
					}
						
					if(this.tipomensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven(),classes);//this.tipomensajecorreoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMensajeCorreoInven(this.tipomensajecorreoinven,classes);//this.tipomensajecorreoinvenBean);									
				}
			
				if(TipoMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMensajeCorreoInven(this.tipomensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMensajeCorreoInven(this.tipomensajecorreoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomensajecorreoinvenAnterior!=null) {
						this.tipomensajecorreoinven=this.tipomensajecorreoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomensajecorreoinvenReturnGeneral=tipomensajecorreoinvenLogic.procesarEventosTipoMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens(),this.tipomensajecorreoinven,this.tipomensajecorreoinvenParameterGeneral,this.isEsNuevoTipoMensajeCorreoInven,classes);//this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven(),tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven(),this.tipomensajecorreoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMensajeCorreoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMensajeCorreoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMensajeCorreoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMensajeCorreoInven() throws Exception {
		
		TipoMensajeCorreoInvenModel tipomensajecorreoinvenModel=(TipoMensajeCorreoInvenModel)this.jTableDatosTipoMensajeCorreoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomensajecorreoinvenModel.tipomensajecorreoinvens=this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomensajecorreoinvenModel.tipomensajecorreoinvens=this.tipomensajecorreoinvens;
		}
		
		
		((TipoMensajeCorreoInvenModel) this.jTableDatosTipoMensajeCorreoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMensajeCorreoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomensajecorreoinvenAnterior(),this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomensajecorreoinvenAnterior(),this.tipomensajecorreoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMensajeCorreoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
										
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomensajecorreoinven,new Object(),generalEntityParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfTipoMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMensajeCorreoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomensajecorreoinven,new Object(),generalEntityParameterGeneral,this.tipomensajecorreoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMensajeCorreoInven(TipoMensajeCorreoInvenBean tipomensajecorreoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMensajeCorreoInven(ArrayList<Classe> classes,TipoMensajeCorreoInvenReturnGeneral tipomensajecorreoinvenReturnGeneral,TipoMensajeCorreoInvenBean tipomensajecorreoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipomensajecorreoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven = new TipoMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setVisible(false);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.tipomensajecorreoinvenLogic=this.tipomensajecorreoinvenLogic;
		
		this.cargarCombosFrameForeignKeyTipoMensajeCorreoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMensajeCorreoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMensajeCorreoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMensajeCorreoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMensajeCorreoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMensajeCorreoInven"));
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoMensajeCorreoInven"));

		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemModificarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMensajeCorreoInven"));
						
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemActualizarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMensajeCorreoInven"));
								
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemEliminarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemCancelarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMensajeCorreoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemDetalleCerrarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMensajeCorreoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonidTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtoncodigoTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonnombreTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMensajeCorreoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMensajeCorreoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMensajeCorreoInven"));
		}
		
		this.jTableDatosTipoMensajeCorreoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMensajeCorreoInven"));
		
		this.jTableDatosTipoMensajeCorreoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMensajeCorreoInven"));
		
		this.jButtonNuevoTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoTipoMensajeCorreoInven"));
		
		this.jButtonDuplicarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarTipoMensajeCorreoInven"));
		
		this.jButtonCopiarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"CopiarTipoMensajeCorreoInven"));
		
		this.jButtonVerFormTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"VerFormTipoMensajeCorreoInven"));
		
		
		this.jButtonNuevoToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMensajeCorreoInven"));
			
		this.jButtonDuplicarToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemNuevoTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMensajeCorreoInven"));
			
		this.jMenuItemDuplicarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMensajeCorreoInven"));		
		
		
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMensajeCorreoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonModificarToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemModificarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonActualizarToolBarTipoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMensajeCorreoInven"));
				
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemActualizarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonEliminarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMensajeCorreoInven"));
						
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemEliminarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonCancelarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemCancelarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMensajeCorreoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMensajeCorreoInven"));		
		
		
		this.jButtonCerrarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarTipoMensajeCorreoInven"));
		
		
		this.jButtonCerrarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemCerrarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMensajeCorreoInven"));
			
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jMenuItemDetalleCerrarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMensajeCorreoInven"));
		}
		
		this.jButtonCopiarToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMensajeCorreoInven"));
			
		this.jButtonVerFormToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMensajeCorreoInven"));
		
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMensajeCorreoInven"));
			
		this.jMenuItemCopiarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMensajeCorreoInven"));		
		
		this.jMenuItemVerFormTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMensajeCorreoInven"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMensajeCorreoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMensajeCorreoInven"));		
		
		
		
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMensajeCorreoInven"));
					
		this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMensajeCorreoInven"));
		
		this.jMenuItemRecargarInformacionTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMensajeCorreoInven"));		
		
		
		
		this.jButtonAnterioresTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresTipoMensajeCorreoInven"));
		
		
		this.jButtonAnterioresToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMensajeCorreoInven"));
		
		this.jMenuItemAnterioresTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMensajeCorreoInven"));		
		
		
		this.jButtonSiguientesTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesTipoMensajeCorreoInven"));
		
		
		this.jButtonSiguientesToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemSiguientesTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMensajeCorreoInven"));
			
		this.jMenuItemAbrirOrderByTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMensajeCorreoInven"));
			
		this.jMenuItemMostrarOcultarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMensajeCorreoInven"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMensajeCorreoInven"));
			
		this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMensajeCorreoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMensajeCorreoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMensajeCorreoInven"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMensajeCorreoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMensajeCorreoInven"));

		this.jCheckBoxSeleccionadosTipoMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMensajeCorreoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMensajeCorreoInven"));
			
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMensajeCorreoInven"));
					
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMensajeCorreoInven"));
			
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonidTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtoncodigoTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonnombreTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMensajeCorreoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoTipoMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMensajeCorreoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMensajeCorreoInven"));				
			//this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMensajeCorreoInven"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMensajeCorreoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMensajeCorreoInven!=null) {
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMensajeCorreoInven"));
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMensajeCorreoInven"));
				this.jInternalFrameImportacionTipoMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMensajeCorreoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMensajeCorreoInven"));
			
			this.jButtonAbrirOrderByToolBarTipoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMensajeCorreoInven"));			
			
			if(this.jInternalFrameOrderByTipoMensajeCorreoInven!=null) {
				this.jInternalFrameOrderByTipoMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMensajeCorreoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTabbedPaneRelacionesTipoMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMensajeCorreoInven"));
		
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
            		closingInternalFrameTipoMensajeCorreoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMensajeCorreoInven = (JInternalFrameBase)event.getSource();
	            	
	            TipoMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMensajeCorreoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMensajeCorreoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMensajeCorreoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMensajeCorreoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMensajeCorreoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMensajeCorreoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMensajeCorreoInven";
		inputMap = this.jButtonModificarTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMensajeCorreoInven";
		inputMap = this.jButtonActualizarTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMensajeCorreoInven";
		inputMap = this.jButtonEliminarTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMensajeCorreoInven";
		inputMap = this.jButtonCancelarTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMensajeCorreoInven";
		inputMap = this.jButtonCerrarTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMensajeCorreoInven";
		inputMap = this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonGuardarCambiosTipoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMensajeCorreoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMensajeCorreoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonidTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtoncodigoTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jButtonnombreTipoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMensajeCorreoInvenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMensajeCorreoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMensajeCorreoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
					tipomensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvens) {
					tipomensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
						tipomensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvens) {
						tipomensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMensajeCorreoInven.getSelectedRows();
			
			TipoMensajeCorreoInven tipomensajecorreoinvenLocal=new TipoMensajeCorreoInven();
			
			//this.seleccionarTodosTipoMensajeCorreoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomensajecorreoinvenLocal =(TipoMensajeCorreoInven) this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens().toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomensajecorreoinvenLocal =(TipoMensajeCorreoInven) this.tipomensajecorreoinvens.toArray()[this.jTableDatosTipoMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomensajecorreoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
						tipomensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvens) {
						tipomensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMensajeCorreoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMensajeCorreoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMensajeCorreoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
				
						if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomensajecorreoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomensajecorreoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvens) {
					
						if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomensajecorreoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomensajecorreoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMensajeCorreoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMensajeCorreoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMensajeCorreoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMensajeCorreoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMensajeCorreoInven(conSplash);
				
					this.generarReporteTipoMensajeCorreoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMensajeCorreoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMensajeCorreoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMensajeCorreoInven();
				
				this.exportarTipoMensajeCorreoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMensajeCorreoInvens();
				//this.importarTipoMensajeCorreoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMensajeCorreoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMensajeCorreoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMensajeCorreoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMensajeCorreoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMensajeCorreoInven();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMensajeCorreoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMensajeCorreoInven();
			
			if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
			TipoMensajeCorreoInven tipomensajecorreoinven=new TipoMensajeCorreoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMensajeCorreoInven.getSelectedItem();
			
			
			
			
			tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomensajecorreoinvensSeleccionados.size()==1) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
					tipomensajecorreoinven=tipomensajecorreoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMensajeCorreoInven();
			
      		//this.finishProcessTipoMensajeCorreoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMensajeCorreoInvenReturnGeneral() throws Exception {
		if(this.tipomensajecorreoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomensajecorreoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomensajecorreoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomensajecorreoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
		}
		
		if(this.tipomensajecorreoinvenReturnGeneral.getConRetornoLista() || this.tipomensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomensajecorreoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomensajecorreoinvenLogic.setTipoMensajeCorreoInvens(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomensajecorreoinvenLogic.setTipoMensajeCorreoInven(this.tipomensajecorreoinvenReturnGeneral.getTipoMensajeCorreoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMensajeCorreoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMensajeCorreoInven() throws Exception {
		
		
	}
	
	public ArrayList<TipoMensajeCorreoInven> getTipoMensajeCorreoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMensajeCorreoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens()) {
					if(tipomensajecorreoinvenAux.getIsSelected()) {
						tipomensajecorreoinvensSeleccionados.add(tipomensajecorreoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:this.tipomensajecorreoinvens) {
					if(tipomensajecorreoinvenAux.getIsSelected()) {
						tipomensajecorreoinvensSeleccionados.add(tipomensajecorreoinvenAux);				
					}
				}
			}
			
			if(tipomensajecorreoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomensajecorreoinvensSeleccionados.addAll(this.tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomensajecorreoinvensSeleccionados.addAll(this.tipomensajecorreoinvens);				
					}
				}
			}
		} else {
			tipomensajecorreoinvensSeleccionados.add(this.tipomensajecorreoinven);
		}
		
		return tipomensajecorreoinvensSeleccionados;
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
	
	public void generarReporteTipoMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMensajeCorreoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMensajeCorreoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Mensaje Correo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMensajeCorreoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMensajeCorreoInven();
		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMensajeCorreoInven();
		
		
		//this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados ,tipomensajecorreoinvenImplementable,tipomensajecorreoinvenImplementableHome);
	}
	
	public void mostrarImportacionTipoMensajeCorreoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMensajeCorreoInven();
		
		this.abrirFrameImportacionTipoMensajeCorreoInven();		
		
			
		//this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados ,tipomensajecorreoinvenImplementable,tipomensajecorreoinvenImplementableHome);
	}
	
	public void importarTipoMensajeCorreoInvens() throws Exception {		
	
	}
	
	public void exportarTipoMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMensajeCorreoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMensajeCorreoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Mensaje Correo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMensajeCorreoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMensajeCorreoInven(tipomensajecorreoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomensajecorreoinvenAux.setsDetalleGeneralEntityReporte(tipomensajecorreoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMensajeCorreoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomensajecorreoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomensajecorreoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomensajecorreoinven.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomensajecorreoinven.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomensajecorreoinven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMensajeCorreoInven(row);				
				iRow++;
			}				
			
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMensajeCorreoInven(tipomensajecorreoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();		
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomensajecorreoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomensajecorreoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomensajecorreoinven");
			//elementRoot.appendChild(element);
		
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
				element = document.createElement("tipomensajecorreoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMensajeCorreoInven(tipomensajecorreoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMensajeCorreoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomensajecorreoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomensajecorreoinven.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomensajecorreoinven.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomensajecorreoinven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoMensajeCorreoInven(TipoMensajeCorreoInven tipomensajecorreoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMensajeCorreoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomensajecorreoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMensajeCorreoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomensajecorreoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmodulo_descripcion = document.createElement(TipoMensajeCorreoInvenConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(tipomensajecorreoinven.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementcodigo = document.createElement(TipoMensajeCorreoInvenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomensajecorreoinven.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMensajeCorreoInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomensajecorreoinven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoMensajeCorreoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados=new ArrayList<TipoMensajeCorreoInven>();
		
		tipomensajecorreoinvensSeleccionados=this.getTipoMensajeCorreoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMensajeCorreoInven(tipomensajecorreoinvensSeleccionados);
		
		this.generarReporteTipoMensajeCorreoInvens("Todos",tipomensajecorreoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMensajeCorreoInven(ArrayList<TipoMensajeCorreoInven> tipomensajecorreoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensSeleccionados) {
				tipomensajecorreoinvenAux.setsDetalleGeneralEntityReporte(tipomensajecorreoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					tipomensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(tipomensajecorreoinvenAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(tipomensajecorreoinvenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(tipomensajecorreoinvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMensajeCorreoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarTipoMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMensajeCorreoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=true;
		} else {
			this.actualizarEstadoPanelsTipoMensajeCorreoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMensajeCorreoInven=false;
			//this.isVisibilidadCeldaVerFormTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarTipoMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;												
			}
			
			this.jButtonCerrarTipoMensajeCorreoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMensajeCorreoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomensajecorreoinven)) {
			this.isVisibilidadCeldaActualizarTipoMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarTipoMensajeCorreoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMensajeCorreoInven() {
	}
	
	public void actualizarEstadoPanelsTipoMensajeCorreoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMensajeCorreoInven!=null) {
				this.jScrollPanelDatosTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMensajeCorreoInven!=null) {
				this.jPanelPaginacionTipoMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
					this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasTipoMensajeCorreoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesTipoMensajeCorreoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		
		if(this.tipomensajecorreoinvenSessionBean==null) {
			this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		}
		
		this.tipomensajecorreoinvenSessionBean.setsUltimaBusquedaTipoMensajeCorreoInven(this.getsAccionBusqueda());
		this.tipomensajecorreoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			tipomensajecorreoinvenSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		
		if(this.tipomensajecorreoinvenSessionBean==null) {
			this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		}
		
		if(this.tipomensajecorreoinvenSessionBean.getsUltimaBusquedaTipoMensajeCorreoInven()!=null&&!this.tipomensajecorreoinvenSessionBean.getsUltimaBusquedaTipoMensajeCorreoInven().equals("")) {
			this.setsAccionBusqueda(tipomensajecorreoinvenSessionBean.getsUltimaBusquedaTipoMensajeCorreoInven());
			this.setiNumeroPaginacion(tipomensajecorreoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomensajecorreoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(tipomensajecorreoinvenSessionBean.getid_modulo());
				tipomensajecorreoinvenSessionBean.setid_modulo(-1L);
			}
		}
		
		this.tipomensajecorreoinvenSessionBean.setsUltimaBusquedaTipoMensajeCorreoInven("");
		this.tipomensajecorreoinvenSessionBean.setiNumeroPaginacion(TipoMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION);
		this.tipomensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMensajeCorreoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMensajeCorreoInven() {
		this.updateBorderResaltarBusquedasFormularioTipoMensajeCorreoInven();
		this.updateVisibilidadBusquedasFormularioTipoMensajeCorreoInven();
		this.updateHabilitarBusquedasFormularioTipoMensajeCorreoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMensajeCorreoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMensajeCorreoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMensajeCorreoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMensajeCorreoInven.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMensajeCorreoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoMensajeCorreoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMensajeCorreoInven() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMensajeCorreoInven();
		this.updateVisibilidadResaltarControlesFormularioTipoMensajeCorreoInven();
		this.updateHabilitarResaltarControlesFormularioTipoMensajeCorreoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomensajecorreoinvenConstantesFunciones.resaltaridTipoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setBorder(this.tipomensajecorreoinvenConstantesFunciones.resaltaridTipoMensajeCorreoInven);}
		if(this.tipomensajecorreoinvenConstantesFunciones.resaltarid_moduloTipoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setBorder(this.tipomensajecorreoinvenConstantesFunciones.resaltarid_moduloTipoMensajeCorreoInven);}
		if(this.tipomensajecorreoinvenConstantesFunciones.resaltarcodigoTipoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setBorder(this.tipomensajecorreoinvenConstantesFunciones.resaltarcodigoTipoMensajeCorreoInven);}
		if(this.tipomensajecorreoinvenConstantesFunciones.resaltarnombreTipoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setBorder(this.tipomensajecorreoinvenConstantesFunciones.resaltarnombreTipoMensajeCorreoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMensajeCorreoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
	
		//this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostraridTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelidTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostraridTipoMensajeCorreoInven);
		//this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarid_moduloTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelid_moduloTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarid_moduloTipoMensajeCorreoInven);
		//this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarcodigoTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelcodigoTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarcodigoTipoMensajeCorreoInven);
		//this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarnombreTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jPanelnombreTipoMensajeCorreoInven.setVisible(this.tipomensajecorreoinvenConstantesFunciones.mostrarnombreTipoMensajeCorreoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMensajeCorreoInven!=null) {
	
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jLabelidTipoMensajeCorreoInven.setEnabled(this.tipomensajecorreoinvenConstantesFunciones.activaridTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jComboBoxid_moduloTipoMensajeCorreoInven.setEnabled(this.tipomensajecorreoinvenConstantesFunciones.activarid_moduloTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextFieldcodigoTipoMensajeCorreoInven.setEnabled(this.tipomensajecorreoinvenConstantesFunciones.activarcodigoTipoMensajeCorreoInven);
		this.jInternalFrameDetalleFormTipoMensajeCorreoInven.jTextAreanombreTipoMensajeCorreoInven.setEnabled(this.tipomensajecorreoinvenConstantesFunciones.activarnombreTipoMensajeCorreoInven);
		}
	}
	
		
}