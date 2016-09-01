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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoRefePersoConstantesFunciones;
import com.bydan.erp.cartera.util.TipoRefePersoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoRefePersoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoRefePersoBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoRefePersoBeanSwingJInternalFrame extends TipoRefePersoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRefePersoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRefePerso> tiporefepersoValidator = new ClassValidator<TipoRefePerso>(TipoRefePerso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRefePerso tiporefeperso;	
	public TipoRefePerso tiporefepersoAux;
	public TipoRefePerso tiporefepersoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRefePerso tiporefepersoTotales;
	public Long idTipoRefePersoActual;
	public Long iIdNuevoTipoRefePerso=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosReferenciaPersonal=false;

	public Boolean getIsTienePermisosReferenciaPersonal() {
		return isTienePermisosReferenciaPersonal;
	}

	public void setIsTienePermisosReferenciaPersonal(Boolean isTienePermisosReferenciaPersonal) {
		this.isTienePermisosReferenciaPersonal= isTienePermisosReferenciaPersonal;
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
	
	public Boolean isPermisoTodoTipoRefePerso;
	public Boolean isPermisoNuevoTipoRefePerso;
	public Boolean isPermisoActualizarTipoRefePerso;
	public Boolean isPermisoActualizarOriginalTipoRefePerso;
	public Boolean isPermisoEliminarTipoRefePerso;
	public Boolean isPermisoGuardarCambiosTipoRefePerso;
	public Boolean isPermisoConsultaTipoRefePerso;
	public Boolean isPermisoBusquedaTipoRefePerso;
	public Boolean isPermisoReporteTipoRefePerso;
	public Boolean isPermisoPaginacionMedioTipoRefePerso;
	public Boolean isPermisoPaginacionAltoTipoRefePerso;
	public Boolean isPermisoPaginacionTodoTipoRefePerso;
	public Boolean isPermisoCopiarTipoRefePerso;
	public Boolean isPermisoVerFormTipoRefePerso;
	public Boolean isPermisoDuplicarTipoRefePerso;
	public Boolean isPermisoOrdenTipoRefePerso;
	
	
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
	
	public TipoRefePersoParameterReturnGeneral tiporefepersoReturnGeneral;
	public TipoRefePersoParameterReturnGeneral tiporefepersoParameterGeneral;
	
	

	public ReferenciaPersonalLogic referenciapersonalLogic=null;

	public ReferenciaPersonalLogic getReferenciaPersonalLogic() {
		return referenciapersonalLogic;
	}

	public void setReferenciaPersonalLogic(ReferenciaPersonalLogic referenciapersonalLogic) {
		this.referenciapersonalLogic = referenciapersonalLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRefePerso=false;
	public Boolean esParaAccionDesdeFormularioTipoRefePerso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRefePersoSessionBeanAdditional tiporefepersoSessionBeanAdditional=null;
	
	public TipoRefePersoSessionBeanAdditional getTipoRefePersoSessionBeanAdditional() {
		return this.tiporefepersoSessionBeanAdditional;
	}
	
	public void setTipoRefePersoSessionBeanAdditional(TipoRefePersoSessionBeanAdditional tiporefepersoSessionBeanAdditional) {
		try {
			this.tiporefepersoSessionBeanAdditional=tiporefepersoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRefePersoBeanSwingJInternalFrameAdditional tiporefepersoBeanSwingJInternalFrameAdditional=null;
	//public class TipoRefePersoBeanSwingJInternalFrame
	
	public TipoRefePersoBeanSwingJInternalFrameAdditional getTipoRefePersoBeanSwingJInternalFrameAdditional() {
		return this.tiporefepersoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRefePersoBeanSwingJInternalFrameAdditional(TipoRefePersoBeanSwingJInternalFrameAdditional tiporefepersoBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporefepersoBeanSwingJInternalFrameAdditional=tiporefepersoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRefePersoLogic tiporefepersoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRefePerso tiporefepersoBean;
	public TipoRefePersoConstantesFunciones tiporefepersoConstantesFunciones;
	//public TipoRefePersoParameterReturnGeneral tiporefepersoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoRefePerso> tiporefepersos;	
	//public List<TipoRefePerso> tiporefepersosEliminados;
	//public List<TipoRefePerso> tiporefepersosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRefePerso=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRefePerso=true;
	public Boolean isVisibilidadCeldaCopiarTipoRefePerso=true;
	public Boolean isVisibilidadCeldaVerFormTipoRefePerso=true;
	public Boolean isVisibilidadCeldaOrdenTipoRefePerso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
	public Boolean isVisibilidadCeldaModificarTipoRefePerso=false;
	public Boolean isVisibilidadCeldaActualizarTipoRefePerso=false;
	public Boolean isVisibilidadCeldaEliminarTipoRefePerso=false;
	public Boolean isVisibilidadCeldaCancelarTipoRefePerso=false;
	public Boolean isVisibilidadCeldaGuardarTipoRefePerso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoRefePerso() {
		return this.iIdNuevoTipoRefePerso;
	}

	public void setiIdNuevoTipoRefePerso(Long iIdNuevoTipoRefePerso) {
		this.iIdNuevoTipoRefePerso = iIdNuevoTipoRefePerso;
	}
	
	public Long getidTipoRefePersoActual() {
		return this.idTipoRefePersoActual;
	}

	public void setidTipoRefePersoActual(Long idTipoRefePersoActual) {
		this.idTipoRefePersoActual = idTipoRefePersoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRefePerso gettiporefeperso() {
		return this.tiporefeperso;
	}

	public void settiporefeperso(TipoRefePerso tiporefeperso) {
		this.tiporefeperso = tiporefeperso;
	}
	
	public TipoRefePerso gettiporefepersoAux() {
		return this.tiporefepersoAux;
	}

	public void settiporefepersoAux(TipoRefePerso tiporefepersoAux) {
		this.tiporefepersoAux = tiporefepersoAux;
	}				
	
	public TipoRefePerso gettiporefepersoAnterior() {
		return this.tiporefepersoAnterior;
	}

	public void settiporefepersoAnterior(TipoRefePerso tiporefepersoAnterior) {
		this.tiporefepersoAnterior = tiporefepersoAnterior;
	}	
	
	public TipoRefePerso gettiporefepersoTotales() {
		return this.tiporefepersoTotales;
	}

	public void settiporefepersoTotales(TipoRefePerso tiporefepersoTotales) {
		this.tiporefepersoTotales = tiporefepersoTotales;
	}	
	
	public TipoRefePerso gettiporefepersoBean() {
		return this.tiporefepersoBean;
	}

	public void settiporefepersoBean(TipoRefePerso tiporefepersoBean) {
		this.tiporefepersoBean = tiporefepersoBean;
	}	
	
	public TipoRefePersoParameterReturnGeneral gettiporefepersoReturnGeneral() {
		return this.tiporefepersoReturnGeneral;
	}

	public void settiporefepersoReturnGeneral(TipoRefePersoParameterReturnGeneral tiporefepersoReturnGeneral) {
		this.tiporefepersoReturnGeneral = tiporefepersoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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
	
	
	public TipoRefePersoLogic getTipoRefePersoLogic()	{		
		return tiporefepersoLogic;
	}

	public void setTipoRefePersoLogic(TipoRefePersoLogic tiporefepersoLogic) {
		this.tiporefepersoLogic = tiporefepersoLogic;
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
	
	public Boolean getIsEsNuevoTipoRefePerso() {
		return isEsNuevoTipoRefePerso;
	}

	public void setIsEsNuevoTipoRefePerso(Boolean isEsNuevoTipoRefePerso) {
		this.isEsNuevoTipoRefePerso = isEsNuevoTipoRefePerso;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRefePerso() {
		return esParaAccionDesdeFormularioTipoRefePerso;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRefePerso(Boolean esParaAccionDesdeFormularioTipoRefePerso) {
		this.esParaAccionDesdeFormularioTipoRefePerso = esParaAccionDesdeFormularioTipoRefePerso;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoRefePerso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRefePersoConstantesFunciones.refrescarForeignKeysDescripcionesTipoRefePerso(this.tiporefepersoLogic.getTipoRefePersos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRefePersoConstantesFunciones.refrescarForeignKeysDescripcionesTipoRefePerso(this.tiporefepersos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporefepersoLogic.setTipoRefePersos(this.tiporefepersos);
			tiporefepersoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRefePersoParameterReturnGeneral getTipoRefePersoParameterGeneral() {
		return this.tiporefepersoParameterGeneral;
	}
	
	public void setTipoRefePersoParameterGeneral(TipoRefePersoParameterReturnGeneral tiporefepersoParameterGeneral) {
		this.tiporefepersoParameterGeneral = tiporefepersoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRefePerso() {
		return isPermisoTodoTipoRefePerso;
	}

	public void setIsPermisoTodoTipoRefePerso(Boolean isPermisoTodoTipoRefePerso) {
		this.isPermisoTodoTipoRefePerso = isPermisoTodoTipoRefePerso;
	}

	public Boolean getIsPermisoNuevoTipoRefePerso() {
		return isPermisoNuevoTipoRefePerso;
	}

	public void setIsPermisoNuevoTipoRefePerso(Boolean isPermisoNuevoTipoRefePerso) {
		this.isPermisoNuevoTipoRefePerso = isPermisoNuevoTipoRefePerso;
	}

	public Boolean getIsPermisoActualizarTipoRefePerso() {
		return isPermisoActualizarTipoRefePerso;
	}

	public void setIsPermisoActualizarTipoRefePerso(Boolean isPermisoActualizarTipoRefePerso) {
		this.isPermisoActualizarTipoRefePerso = isPermisoActualizarTipoRefePerso;
	}

	public Boolean getIsPermisoEliminarTipoRefePerso() {
		return isPermisoEliminarTipoRefePerso;
	}

	public void setIsPermisoEliminarTipoRefePerso(Boolean isPermisoEliminarTipoRefePerso) {
		this.isPermisoEliminarTipoRefePerso = isPermisoEliminarTipoRefePerso;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRefePerso() {
		return isPermisoGuardarCambiosTipoRefePerso;
	}

	public void setIsPermisoGuardarCambiosTipoRefePerso(Boolean isPermisoGuardarCambiosTipoRefePerso) {
		this.isPermisoGuardarCambiosTipoRefePerso = isPermisoGuardarCambiosTipoRefePerso;
	}
	
	public Boolean getIsPermisoConsultaTipoRefePerso() {
		return isPermisoConsultaTipoRefePerso;
	}

	public void setIsPermisoConsultaTipoRefePerso(Boolean isPermisoConsultaTipoRefePerso) {
		this.isPermisoConsultaTipoRefePerso = isPermisoConsultaTipoRefePerso;
	}

	public Boolean getIsPermisoBusquedaTipoRefePerso() {
		return isPermisoBusquedaTipoRefePerso;
	}

	public void setIsPermisoBusquedaTipoRefePerso(Boolean isPermisoBusquedaTipoRefePerso) {
		this.isPermisoBusquedaTipoRefePerso = isPermisoBusquedaTipoRefePerso;
	}

	public Boolean getIsPermisoReporteTipoRefePerso() {
		return isPermisoReporteTipoRefePerso;
	}

	public void setIsPermisoReporteTipoRefePerso(Boolean isPermisoReporteTipoRefePerso) {
		this.isPermisoReporteTipoRefePerso = isPermisoReporteTipoRefePerso;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRefePerso() {
		return isPermisoPaginacionMedioTipoRefePerso;
	}

	public void setIsPermisoPaginacionMedioTipoRefePerso(Boolean isPermisoPaginacionMedioTipoRefePerso) {
		this.isPermisoPaginacionMedioTipoRefePerso = isPermisoPaginacionMedioTipoRefePerso;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRefePerso() {
		return isPermisoPaginacionTodoTipoRefePerso;
	}

	public void setIsPermisoPaginacionTodoTipoRefePerso(Boolean isPermisoPaginacionTodoTipoRefePerso) {
		this.isPermisoPaginacionTodoTipoRefePerso = isPermisoPaginacionTodoTipoRefePerso;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRefePerso() {
		return isPermisoPaginacionAltoTipoRefePerso;
	}

	public void setIsPermisoPaginacionAltoTipoRefePerso(Boolean isPermisoPaginacionAltoTipoRefePerso) {
		this.isPermisoPaginacionAltoTipoRefePerso = isPermisoPaginacionAltoTipoRefePerso;
	}
	
	public Boolean getIsPermisoCopiarTipoRefePerso() {
		return isPermisoCopiarTipoRefePerso;
	}

	public void setIsPermisoCopiarTipoRefePerso(Boolean isPermisoCopiarTipoRefePerso) {
		this.isPermisoCopiarTipoRefePerso = isPermisoCopiarTipoRefePerso;
	}
	
	public Boolean getIsPermisoVerFormTipoRefePerso() {
		return isPermisoVerFormTipoRefePerso;
	}

	public void setIsPermisoVerFormTipoRefePerso(Boolean isPermisoVerFormTipoRefePerso) {
		this.isPermisoVerFormTipoRefePerso = isPermisoVerFormTipoRefePerso;
	}
	
	public Boolean getIsPermisoDuplicarTipoRefePerso() {
		return isPermisoDuplicarTipoRefePerso;
	}

	public void setIsPermisoDuplicarTipoRefePerso(Boolean isPermisoDuplicarTipoRefePerso) {
		this.isPermisoDuplicarTipoRefePerso = isPermisoDuplicarTipoRefePerso;
	}
	
	public Boolean getIsPermisoOrdenTipoRefePerso() {
		return isPermisoOrdenTipoRefePerso;
	}

	public void setIsPermisoOrdenTipoRefePerso(Boolean isPermisoOrdenTipoRefePerso) {
		this.isPermisoOrdenTipoRefePerso = isPermisoOrdenTipoRefePerso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRefePerso() {
		return isVisibilidadCeldaNuevoTipoRefePerso;
	}

	public void setIsVisibilidadCeldaNuevoTipoRefePerso(Boolean isVisibilidadCeldaNuevoTipoRefePerso) {
		this.isVisibilidadCeldaNuevoTipoRefePerso = isVisibilidadCeldaNuevoTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRefePerso() {
		return isVisibilidadCeldaDuplicarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRefePerso(Boolean isVisibilidadCeldaDuplicarTipoRefePerso) {
		this.isVisibilidadCeldaDuplicarTipoRefePerso = isVisibilidadCeldaDuplicarTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRefePerso() {
		return isVisibilidadCeldaCopiarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaCopiarTipoRefePerso(Boolean isVisibilidadCeldaCopiarTipoRefePerso) {
		this.isVisibilidadCeldaCopiarTipoRefePerso = isVisibilidadCeldaCopiarTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRefePerso() {
		return isVisibilidadCeldaVerFormTipoRefePerso;
	}

	public void setIsVisibilidadCeldaVerFormTipoRefePerso(Boolean isVisibilidadCeldaVerFormTipoRefePerso) {
		this.isVisibilidadCeldaVerFormTipoRefePerso = isVisibilidadCeldaVerFormTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRefePerso() {
		return isVisibilidadCeldaOrdenTipoRefePerso;
	}

	public void setIsVisibilidadCeldaOrdenTipoRefePerso(Boolean isVisibilidadCeldaOrdenTipoRefePerso) {
		this.isVisibilidadCeldaOrdenTipoRefePerso = isVisibilidadCeldaOrdenTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRefePerso() {
		return isVisibilidadCeldaNuevoRelacionesTipoRefePerso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRefePerso(Boolean isVisibilidadCeldaNuevoRelacionesTipoRefePerso) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso = isVisibilidadCeldaNuevoRelacionesTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRefePerso() {
		return isVisibilidadCeldaModificarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaModificarTipoRefePerso(Boolean isVisibilidadCeldaModificarTipoRefePerso) {
		this.isVisibilidadCeldaModificarTipoRefePerso = isVisibilidadCeldaModificarTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRefePerso() {
		return isVisibilidadCeldaActualizarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaActualizarTipoRefePerso(Boolean isVisibilidadCeldaActualizarTipoRefePerso) {
		this.isVisibilidadCeldaActualizarTipoRefePerso = isVisibilidadCeldaActualizarTipoRefePerso;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRefePerso() {
		return isVisibilidadCeldaEliminarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaEliminarTipoRefePerso(Boolean isVisibilidadCeldaEliminarTipoRefePerso) {
		this.isVisibilidadCeldaEliminarTipoRefePerso = isVisibilidadCeldaEliminarTipoRefePerso;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRefePerso() {
		return isVisibilidadCeldaCancelarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaCancelarTipoRefePerso(Boolean isVisibilidadCeldaCancelarTipoRefePerso) {
		this.isVisibilidadCeldaCancelarTipoRefePerso = isVisibilidadCeldaCancelarTipoRefePerso;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRefePerso() {
		return isVisibilidadCeldaGuardarTipoRefePerso;
	}

	public void setIsVisibilidadCeldaGuardarTipoRefePerso(Boolean isVisibilidadCeldaGuardarTipoRefePerso) {
		this.isVisibilidadCeldaGuardarTipoRefePerso = isVisibilidadCeldaGuardarTipoRefePerso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRefePerso() {
		return isVisibilidadCeldaGuardarCambiosTipoRefePerso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRefePerso(Boolean isVisibilidadCeldaGuardarCambiosTipoRefePerso) {
		this.isVisibilidadCeldaGuardarCambiosTipoRefePerso = isVisibilidadCeldaGuardarCambiosTipoRefePerso;
	}
		
	public TipoRefePersoSessionBean gettiporefepersoSessionBean() {
		return this.tiporefepersoSessionBean;
	}
	
	public void settiporefepersoSessionBean(TipoRefePersoSessionBean tiporefepersoSessionBean) {
		this.tiporefepersoSessionBean=tiporefepersoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(TipoRefePerso tiporefeperso)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoRefePerso tiporefeperso,TipoRefePerso tiporefepersoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRefePerso(tiporefeperso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporefepersoAux.setId(tiporefeperso.getId());
		tiporefepersoAux.setVersionRow(tiporefeperso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRefePerso();
		
			int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporefepersoValidator.getInvalidValues(this.tiporefeperso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporefepersoLogic.setDatosCliente(datosCliente);
			tiporefepersoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporefepersoAux=new  TipoRefePerso();
				
				tiporefepersoAux.setIsNew(true);
				tiporefepersoAux.setIsChanged(true);
				
				tiporefepersoAux.setTipoRefePersoOriginal(this.tiporefeperso);
				
				tiporefepersoAux.setId(this.tiporefeperso.getId());	
				tiporefepersoAux.setVersionRow(this.tiporefeperso.getVersionRow());	
				tiporefepersoAux.setcodigo(this.tiporefeperso.getcodigo());	
				tiporefepersoAux.setnombre(this.tiporefeperso.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporefepersoAux,tiporefepersos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoLogic.saveTipoRefePersos();//WithConnection
						//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals().addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals.addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporefepersoLogic.saveTipoRefePersoRelaciones(tiporefepersoAux,this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());//WithConnection
								//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals= new ArrayList<ReferenciaPersonal>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporefepersoAux.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporefepersoAux,tiporefepersos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporefepersoAux=new  TipoRefePerso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporefepersoSessionBean.getEsGuardarRelacionado() && this.tiporefeperso.getId()>=0)) {
						
					tiporefepersoAux.setIsNew(false);
				}
				
				tiporefepersoAux.setIsDeleted(false);
			
				tiporefepersoAux.setId(this.tiporefeperso.getId());	
				tiporefepersoAux.setVersionRow(this.tiporefeperso.getVersionRow());	
				tiporefepersoAux.setcodigo(this.tiporefeperso.getcodigo());	
				tiporefepersoAux.setnombre(this.tiporefeperso.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporefepersoAux,tiporefepersos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoLogic.saveTipoRefePersos();//WithConnection
						//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals().addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals.addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporefepersoLogic.saveTipoRefePersoRelaciones(tiporefepersoAux,this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());//WithConnection
								//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals= new ArrayList<ReferenciaPersonal>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporefepersoAux.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporefepersoAux,tiporefepersos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporefeperso,tiporefepersoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporefepersoAux=new  TipoRefePerso();
				
				tiporefepersoAux.setIsNew(false);
				tiporefepersoAux.setIsChanged(false);
				
				tiporefepersoAux.setIsDeleted(true);
				
				tiporefepersoAux.setId(this.tiporefeperso.getId());	
				tiporefepersoAux.setVersionRow(this.tiporefeperso.getVersionRow());	
				tiporefepersoAux.setcodigo(this.tiporefeperso.getcodigo());	
				tiporefepersoAux.setnombre(this.tiporefeperso.getnombre());	
				
				if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporefepersoAux.getId()>=0) {	
						this.tiporefepersosEliminados.add(tiporefepersoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporefepersoAux,tiporefepersos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoLogic.saveTipoRefePersos();//WithConnection
						//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals().addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals.addAll(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporefepersoLogic.saveTipoRefePersoRelaciones(tiporefepersoAux,this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());//WithConnection
								//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.setReferenciaPersonals(new ArrayList<ReferenciaPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals= new ArrayList<ReferenciaPersonal>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporefepersoAux.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporefepersoAux,tiporefepersoLogic.getTipoRefePersos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporefepersoAux,tiporefepersos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.getTipoRefePersos().addAll(this.tiporefepersosEliminados);
					
					tiporefepersoLogic.saveTipoRefePersos();//WithConnection
					//tiporefepersoLogic.getSetVersionRowTipoRefePersos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiporefepersosEliminados= new ArrayList<TipoRefePerso>();		
			}
			
			if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Refe Perso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporefeperso=tiporefepersoAux;
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
      		//this.finishProcessTipoRefePerso();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRefePerso tiporefepersoLocal) throws Exception {
		
		if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporefepersoLocal.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());
			
			} else {
			
				tiporefepersoLocal.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRefePerso tiporefepersoLocal) throws Exception {	
		if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoRefePersoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporefepersoValidator.getInvalidValues(this.tiporefeperso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRefePerso tiporefeperso,List<TipoRefePerso> tiporefepersos) throws Exception {
		try	{		
			TipoRefePersoConstantesFunciones.actualizarLista(tiporefeperso,tiporefepersos,this.tiporefepersoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRefePerso tiporefeperso,List<TipoRefePerso> tiporefepersos) throws Exception {
		try	{			
			TipoRefePersoConstantesFunciones.actualizarSelectedLista(tiporefeperso,tiporefepersos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRefePerso> tiporefepersosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporefepersosLocal=this.tiporefepersoLogic.getTipoRefePersos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporefepersosLocal=this.tiporefepersos;
			}
			//ARCHITECTURE
		
			for(TipoRefePerso tiporefepersoLocal:tiporefepersosLocal) {
				if(this.permiteMantenimiento(tiporefepersoLocal) && tiporefepersoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRefePersoConstantesFunciones.getTipoRefePersoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRefePersoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRefePerso.jLabelcodigoTipoRefePerso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRefePersoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRefePerso.jLabelnombreTipoRefePerso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRefePerso.jLabelcodigoTipoRefePerso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRefePerso.jLabelnombreTipoRefePerso,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ReferenciaPersonal")) {
			if(this.tiporefeperso==null) {
				this.tiporefeperso= new TipoRefePerso();
			}

			if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRefePerso
				this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);

				this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.getreferenciapersonal().setTipoRefePerso(this.tiporefeperso);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRefePerso--;	
		
		
		this.tiporefepersoAux=new TipoRefePerso();
		
		this.tiporefepersoAux.setId(this.iIdNuevoTipoRefePerso);
		this.tiporefepersoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporefepersoLogic.getTipoRefePersos().add(this.tiporefepersoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporefepersos.add(this.tiporefepersoAux);
		}
		//ARCHITECTURE
		
		this.tiporefeperso=this.tiporefepersoAux;
		
		if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRefePerso(this.tiporefeperso);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRefePerso(this.tiporefeperso);
		}
				
		//this.setDefaultControlesTipoRefePerso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRefePerso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRefePerso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRefePerso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRefePerso(this.tiporefepersoBean,this.tiporefeperso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRefePersoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
			classes=TipoRefePersoConstantesFunciones.getClassesRelationshipsOfTipoRefePerso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporefepersoReturnGeneral=tiporefepersoLogic.procesarEventosTipoRefePersosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporefepersoLogic.getTipoRefePersos(),this.tiporefeperso,this.tiporefepersoParameterGeneral,this.isEsNuevoTipoRefePerso,classes);//this.tiporefepersoLogic.getTipoRefePerso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRefePerso(this.tiporefepersoReturnGeneral,this.tiporefepersoBean,false);
		
		if(this.tiporefepersoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso());
		}
		
		if(this.tiporefepersoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso(),classes);//this.tiporefepersoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRefePerso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRefePerso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.RecargarFormTipoRefePerso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRefePerso(false);
						
			if(tiporefepersoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.getEsGuardarRelacionado() && ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaPersonalActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRefePerso();
			}
			
			this.actualizarVisualTableDatosTipoRefePerso();
			
			this.jTableDatosTipoRefePerso.setRowSelectionInterval(this.getIndiceNuevoTipoRefePerso(), this.getIndiceNuevoTipoRefePerso());
			
			this.seleccionarFilaTablaTipoRefePersoActual();
						
			this.actualizarEstadoCeldasBotonesTipoRefePerso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRefePerso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setEnabled(isHabilitar && this.tiporefepersoConstantesFunciones.activarcodigoTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setEnabled(isHabilitar && this.tiporefepersoConstantesFunciones.activarnombreTipoRefePerso);	
		
	};
	
	public void setDefaultControlesTipoRefePerso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRefePerso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporefepersoSessionBean.setConGuardarRelaciones(true);			
			this.tiporefepersoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporefepersoSessionBean.setConGuardarRelaciones(false);			
			this.tiporefepersoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRefePerso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
				if(tiporefepersoAux.getId().equals(this.iIdNuevoTipoRefePerso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersos) {
				if(tiporefepersoAux.getId().equals(this.iIdNuevoTipoRefePerso)) {
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
	
	public int getIndiceActualTipoRefePerso(TipoRefePerso tiporefeperso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
				if(tiporefepersoAux.getId().equals(tiporefeperso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersos) {
				if(tiporefepersoAux.getId().equals(tiporefeperso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRefePerso(TipoRefePerso tiporefepersoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
				if(tiporefepersoAux.getTipoRefePersoOriginal().getId().equals(tiporefepersoOriginal.getId())) {
					existe=true;
					tiporefepersoOriginal.setId(tiporefepersoAux.getId());
					tiporefepersoOriginal.setVersionRow(tiporefepersoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRefePerso tiporefepersoAux:this.tiporefepersos) {
				if(tiporefepersoAux.getTipoRefePersoOriginal().getId().equals(tiporefepersoOriginal.getId())) {
					existe=true;
					tiporefepersoOriginal.setId(tiporefepersoAux.getId());
					tiporefepersoOriginal.setVersionRow(tiporefepersoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRefePerso(Boolean esParaCancelar) throws Exception {
		tiporefepersosAux=new ArrayList<TipoRefePerso>();
		tiporefepersoAux=new TipoRefePerso();
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
					if(tiporefepersoAux.getId()<0) {
						tiporefepersosAux.add(tiporefepersoAux);
					}		
				}
				this.iIdNuevoTipoRefePerso=0L;
				this.tiporefepersoLogic.getTipoRefePersos().removeAll(tiporefepersosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRefePerso tiporefepersoAux:this.tiporefepersos) {
					if(tiporefepersoAux.getId()<0) {
						tiporefepersosAux.add(tiporefepersoAux);
					}		
				}
				this.iIdNuevoTipoRefePerso=0L;
				this.tiporefepersos.removeAll(tiporefepersosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRefePerso 
					&& this.tiporefepersoLogic.getTipoRefePersos().size()>0
					) {
					tiporefepersoAux=this.tiporefepersoLogic.getTipoRefePersos().get(this.tiporefepersoLogic.getTipoRefePersos().size() - 1);
				
					if(tiporefepersoAux.getId()<0) {
						this.tiporefepersoLogic.getTipoRefePersos().remove(tiporefepersoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRefePerso && this.tiporefepersos.size()>0) {
					tiporefepersoAux=this.tiporefepersos.get(this.tiporefepersos.size() - 1);
				
					if(tiporefepersoAux.getId()<0) {
						this.tiporefepersos.remove(tiporefepersoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRefePerso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporefeperso.getId()<0) {
				this.tiporefepersoLogic.getTipoRefePersos().remove(this.tiporefeperso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporefeperso.getId()<0) {
				this.tiporefepersos.remove(this.tiporefeperso);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRefePerso(List<TipoRefePerso> tiporefepersosAux) throws Exception {
		TipoRefePersoConstantesFunciones.setEstadosInicialesTipoRefePerso(tiporefepersosAux);
	}
	
	public void setEstadosInicialesTipoRefePerso(TipoRefePerso tiporefepersoAux) throws Exception {
		TipoRefePersoConstantesFunciones.setEstadosInicialesTipoRefePerso(tiporefepersoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRefePersoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRefePersoActual()) {
				if(!this.isEsNuevoTipoRefePerso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRefePerso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRefePersoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Refe Perso ?", "MANTENIMIENTO DE Tipo Refe Perso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRefePerso tiporefeperso) throws Exception {
		TipoRefePersoConstantesFunciones.seleccionarAsignar(this.tiporefeperso,tiporefeperso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRefePerso=this.isPermisoActualizarOriginalTipoRefePerso;
			
			
			this.seleccionarAsignar(tiporefeperso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRefePersoConstantesFunciones.quitarEspaciosTipoRefePerso(this.tiporefeperso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRefePerso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporefepersoSessionBean.setsFuncionBusquedaRapida(this.tiporefepersoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRefePerso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRefePerso(esParaCancelar);				
				this.cancelarNuevoTipoRefePerso(esParaCancelar);								
			}
			
			this.tiporefeperso=new TipoRefePerso();
			
			this.inicializarTipoRefePerso();
			
			this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRefePerso() throws Exception {
		try {
			TipoRefePersoConstantesFunciones.inicializarTipoRefePerso(this.tiporefeperso);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporefepersoLogic.getTipoRefePersos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRefePersos(String sAccionBusqueda,List<TipoRefePerso> tiporefepersosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRefePerso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRefePersoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRefePersoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRefePerso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Refe Persos");		
		parameters.put("busquedapor", TipoRefePersoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ReferenciaPersonal.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRefePersoLogic tiporefepersoLogicAuxiliar=new TipoRefePersoLogic();
					tiporefepersoLogicAuxiliar.setDatosCliente(tiporefepersoLogic.getDatosCliente());				
					tiporefepersoLogicAuxiliar.setTipoRefePersos(tiporefepersosParaReportes);
					
					tiporefepersoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRefePersoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporefepersosParaReportes=tiporefepersoLogicAuxiliar.getTipoRefePersos();
					
					//tiporefepersoLogic.getNewConnexionToDeep();
					
					//for (TipoRefePerso tiporefeperso:tiporefepersosParaReportes) {
					//	tiporefepersoLogic.deepLoad(tiporefeperso, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporefepersoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporefepersoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferenciaPersonal = AuxiliarReportes.class.getResourceAsStream("ReferenciaPersonalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciapersonal", reportFileReferenciaPersonal);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRefePerso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRefePersoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRefePersoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRefePerso=new JRBeanArrayDataSource(TipoRefePersoJInternalFrame.TraerTipoRefePersoBeans(tiporefepersosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRefePerso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRefePersoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRefePersoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRefePersoBean.TraerTipoRefePersoBeans(tiporefepersosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRefePersoActionPerformed(null);
					//this.generarExcelReporteTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRefePersos(sAccionBusqueda,sTipoArchivoReporte,tiporefepersosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRefePersos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRefePerso> tiporefepersosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRefePersos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRefePerso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRefePerso tiporefeperso : tiporefepersosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRefePersoConstantesFunciones.generarExcelReporteDataTipoRefePerso("NORMAL",row,workbook,tiporefeperso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRefePerso(String sTipo,Row row,Workbook workbook) {
		
		TipoRefePersoConstantesFunciones.generarExcelReporteHeaderTipoRefePerso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRefePersos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRefePerso> tiporefepersosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRefePersos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRefePerso tiporefeperso : tiporefepersosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRefePersoConstantesFunciones.getTipoRefePersoDescripcion(tiporefeperso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRefePersoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporefeperso.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRefePersoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporefeperso.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRefePersos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRefePerso> tiporefepersosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRefePerso> tiporefepersosRespaldo=null;
		
		classes=TipoRefePersoConstantesFunciones.getClassesRelationshipsOfTipoRefePerso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporefepersoLogic.setDatosCliente(this.datosCliente);
		this.tiporefepersoLogic.setDatosDeep(this.datosDeep);
		this.tiporefepersoLogic.setIsConDeep(true);
		
		tiporefepersosRespaldo=this.tiporefepersoLogic.getTipoRefePersos();
		
		this.tiporefepersoLogic.setTipoRefePersos(tiporefepersosParaReportes);	
		this.tiporefepersoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporefepersosParaReportes=this.tiporefepersoLogic.getTipoRefePersos();
		this.tiporefepersoLogic.setTipoRefePersos(tiporefepersosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRefePersos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRefePerso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRefePerso tiporefeperso : tiporefepersosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRefePerso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRefePersoConstantesFunciones.generarExcelReporteDataTipoRefePerso("NORMAL",row,workbook,tiporefeperso,cellStyleDataAux);
		
			
			


				//ReferenciaPersonal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporefeperso.getReferenciaPersonals()!=null && tiporefeperso.getReferenciaPersonals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaPersonalConstantesFunciones.generarExcelReporteHeaderReferenciaPersonal("RELACIONADO",row,workbook);
				}

				if(tiporefeperso.getReferenciaPersonals()!=null) {
					i2=0;
					for(ReferenciaPersonal referenciapersonal : tiporefeperso.getReferenciaPersonals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaPersonalConstantesFunciones.generarExcelReporteDataReferenciaPersonal("RELACIONADO",row,workbook,referenciapersonal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRefePersoConstantesFunciones.getTipoRefePersoDescripcion(tiporefeperso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRefePerso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRefePerso() throws Exception {		
		this.startProcessTipoRefePerso(true);
	}
	
	public void startProcessTipoRefePerso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRefePerso ,this.jPanelParametrosReportesTipoRefePerso, this.jScrollPanelDatosTipoRefePerso,this.jPanelPaginacionTipoRefePerso, this.jScrollPanelDatosEdicionTipoRefePerso, this.jPanelAccionesTipoRefePerso,this.jPanelAccionesFormularioTipoRefePerso,this.jmenuBarTipoRefePerso,this.jmenuBarDetalleTipoRefePerso,this.jTtoolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRefePerso=this.jTabbedPaneBusquedasTipoRefePerso; 
		
		final JPanel jPanelParametrosReportesTipoRefePerso=this.jPanelParametrosReportesTipoRefePerso;
		//final JScrollPane jScrollPanelDatosTipoRefePerso=this.jScrollPanelDatosTipoRefePerso;
		final JTable jTableDatosTipoRefePerso=this.jTableDatosTipoRefePerso;		
		final JPanel jPanelPaginacionTipoRefePerso=this.jPanelPaginacionTipoRefePerso;
		//final JScrollPane jScrollPanelDatosEdicionTipoRefePerso=this.jScrollPanelDatosEdicionTipoRefePerso;
		final JPanel jPanelAccionesTipoRefePerso=this.jPanelAccionesTipoRefePerso;
		
		JPanel jPanelCamposAuxiliarTipoRefePerso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRefePerso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			jPanelCamposAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jPanelCamposTipoRefePerso;
			jPanelAccionesFormularioAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jPanelAccionesFormularioTipoRefePerso;
		}
		
		final JPanel jPanelCamposTipoRefePerso=jPanelCamposAuxiliarTipoRefePerso;
		final JPanel jPanelAccionesFormularioTipoRefePerso=jPanelAccionesFormularioAuxiliarTipoRefePerso;
		
		
		final JMenuBar jmenuBarTipoRefePerso=this.jmenuBarTipoRefePerso;
		final JToolBar jTtoolBarTipoRefePerso=this.jTtoolBarTipoRefePerso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRefePerso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRefePerso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			jmenuBarDetalleAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jmenuBarDetalleTipoRefePerso;
			jTtoolBarDetalleAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jTtoolBarDetalleTipoRefePerso;
		}
		
		final JMenuBar jmenuBarDetalleTipoRefePerso=jmenuBarDetalleAuxiliarTipoRefePerso;
		final JToolBar jTtoolBarDetalleTipoRefePerso=jTtoolBarDetalleAuxiliarTipoRefePerso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRefePerso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRefePerso;
			processRunnable.jTableDatos=jTableDatosTipoRefePerso;
			processRunnable.jPanelCampos=jPanelCamposTipoRefePerso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRefePerso;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRefePerso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRefePerso;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRefePerso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRefePerso;
			processRunnable.jTtoolBar=jTtoolBarTipoRefePerso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRefePerso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRefePerso ,jPanelParametrosReportesTipoRefePerso,jTableDatosTipoRefePerso, /*jScrollPanelDatosTipoRefePerso,*/jPanelCamposTipoRefePerso,jPanelPaginacionTipoRefePerso, /*jScrollPanelDatosEdicionTipoRefePerso,*/ jPanelAccionesTipoRefePerso,jPanelAccionesFormularioTipoRefePerso,jmenuBarTipoRefePerso,jmenuBarDetalleTipoRefePerso,jTtoolBarTipoRefePerso,jTtoolBarDetalleTipoRefePerso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRefePerso ,jPanelParametrosReportesTipoRefePerso, jScrollPanelDatosTipoRefePerso,jPanelPaginacionTipoRefePerso, jScrollPanelDatosEdicionTipoRefePerso, jPanelAccionesTipoRefePerso,jPanelAccionesFormularioTipoRefePerso,jmenuBarTipoRefePerso,jmenuBarDetalleTipoRefePerso,jTtoolBarTipoRefePerso,jTtoolBarDetalleTipoRefePerso);
						
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
	
	public void finishProcessTipoRefePerso() {// throws Exception 
		this.finishProcessTipoRefePerso(true);
	}
	
	public void finishProcessTipoRefePerso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRefePerso ,this.jPanelParametrosReportesTipoRefePerso, this.jScrollPanelDatosTipoRefePerso,this.jPanelPaginacionTipoRefePerso, this.jScrollPanelDatosEdicionTipoRefePerso, this.jPanelAccionesTipoRefePerso,this.jPanelAccionesFormularioTipoRefePerso,this.jmenuBarTipoRefePerso,this.jmenuBarDetalleTipoRefePerso,this.jTtoolBarTipoRefePerso,this.jTtoolBarDetalleTipoRefePerso);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRefePerso=this.jTabbedPaneBusquedasTipoRefePerso; 
		
		final JPanel jPanelParametrosReportesTipoRefePerso=this.jPanelParametrosReportesTipoRefePerso;
		//final JScrollPane jScrollPanelDatosTipoRefePerso=this.jScrollPanelDatosTipoRefePerso;
		final JTable jTableDatosTipoRefePerso=this.jTableDatosTipoRefePerso;		
		final JPanel jPanelPaginacionTipoRefePerso=this.jPanelPaginacionTipoRefePerso;
		//final JScrollPane jScrollPanelDatosEdicionTipoRefePerso=this.jScrollPanelDatosEdicionTipoRefePerso;
		final JPanel jPanelAccionesTipoRefePerso=this.jPanelAccionesTipoRefePerso;
		
		JPanel jPanelCamposAuxiliarTipoRefePerso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRefePerso=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			jPanelCamposAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jPanelCamposTipoRefePerso;
			jPanelAccionesFormularioAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jPanelAccionesFormularioTipoRefePerso;
		}
		
		final JPanel jPanelCamposTipoRefePerso=jPanelCamposAuxiliarTipoRefePerso;
		final JPanel jPanelAccionesFormularioTipoRefePerso=jPanelAccionesFormularioAuxiliarTipoRefePerso;
		
		
		final JMenuBar jmenuBarTipoRefePerso=this.jmenuBarTipoRefePerso;		
		final JToolBar jTtoolBarTipoRefePerso=this.jTtoolBarTipoRefePerso;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRefePerso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRefePerso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			jmenuBarDetalleAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jmenuBarDetalleTipoRefePerso;
			jTtoolBarDetalleAuxiliarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jTtoolBarDetalleTipoRefePerso;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRefePerso=jmenuBarDetalleAuxiliarTipoRefePerso;
		final JToolBar jTtoolBarDetalleTipoRefePerso=jTtoolBarDetalleAuxiliarTipoRefePerso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRefePerso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRefePerso;
			processRunnable.jTableDatos=jTableDatosTipoRefePerso;
			processRunnable.jPanelCampos=jPanelCamposTipoRefePerso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRefePerso;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRefePerso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRefePerso;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRefePerso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRefePerso;
			processRunnable.jTtoolBar=jTtoolBarTipoRefePerso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRefePerso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRefePerso ,jPanelParametrosReportesTipoRefePerso, jTableDatosTipoRefePerso,/*jScrollPanelDatosTipoRefePerso,*/jPanelCamposTipoRefePerso,jPanelPaginacionTipoRefePerso, /*jScrollPanelDatosEdicionTipoRefePerso,*/ jPanelAccionesTipoRefePerso,jPanelAccionesFormularioTipoRefePerso,jmenuBarTipoRefePerso,jmenuBarDetalleTipoRefePerso,jTtoolBarTipoRefePerso,jTtoolBarDetalleTipoRefePerso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRefePerso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRefePerso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRefePerso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRefePerso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRefePerso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRefePerso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRefePerso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRefePerso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRefePerso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporefepersoConstantesFunciones.getsFinalQueryTipoRefePerso();
		String  finalQueryPaginacionTodos=this.tiporefepersoConstantesFunciones.getsFinalQueryTipoRefePerso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRefePersoConstantesFunciones.getArrayColumnasGlobalesNoTipoRefePerso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRefePersoConstantesFunciones.getArrayColumnasGlobalesTipoRefePerso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRefePersoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporefepersosEliminados= new ArrayList<TipoRefePerso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRefePerso();
		
				///*TipoRefePersoSessionBean*/this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
			
			if(this.tiporefepersoSessionBean==null) {
				this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
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
					this.iNumeroPaginacion=TipoRefePersoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRefePersoConstantesFunciones.getClassesForeignKeysOfTipoRefePerso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporefeperso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporefepersosAux= new ArrayList<TipoRefePerso>();
			
				
			tiporefepersoLogic.setDatosCliente(this.datosCliente);
			tiporefepersoLogic.setDatosDeep(this.datosDeep);
			tiporefepersoLogic.setIsConDeep(true);
			
			
			tiporefepersoLogic.getTipoRefePersoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporefepersoLogic.getTodosTipoRefePersos(finalQueryGlobal,pagination);
					
					//tiporefepersoLogic.getTodosTipoRefePersosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporefepersoLogic.getTipoRefePersos()==null|| tiporefepersoLogic.getTipoRefePersos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporefepersosAux= new ArrayList<TipoRefePerso>();
							tiporefepersosAux.addAll(tiporefepersoLogic.getTipoRefePersos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersosAux= new ArrayList<TipoRefePerso>();
							tiporefepersosAux.addAll(tiporefepersos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporefepersoLogic.getTodosTipoRefePersos(finalQueryGlobal+"",this.pagination);												
							
							//tiporefepersoLogic.getTodosTipoRefePersosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRefePersos("Todos",tiporefepersoLogic.getTipoRefePersos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporefepersoLogic.setTipoRefePersos(new ArrayList<TipoRefePerso>());					
							tiporefepersoLogic.getTipoRefePersos().addAll(tiporefepersosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersos=new ArrayList<TipoRefePerso>();
							tiporefepersos.addAll(tiporefepersosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRefePerso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRefePerso=this.idActual;
				
				} else if(this.idTipoRefePersoActual!=null && this.idTipoRefePersoActual!=0L) {
					idTipoRefePerso=idTipoRefePersoActual;
				}
				
					
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndicePorId(idTipoRefePerso);
				
				this.tiporefepersos=new ArrayList<TipoRefePerso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporefepersoLogic.getEntity(idTipoRefePerso);
					
					//tiporefepersoLogic.getEntityWithConnection(idTipoRefePerso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporefepersoLogic.setTipoRefePersos(new ArrayList<TipoRefePerso>());
					tiporefepersoLogic.getTipoRefePersos().add(tiporefepersoLogic.getTipoRefePerso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporefepersos=new ArrayList<TipoRefePerso>();
					this.tiporefepersos.add(tiporefeperso);
				}
				
				if(tiporefepersoLogic.getTipoRefePerso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporefepersoLogic.getTipoRefePersosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporefepersoLogic.getTipoRefePersos()==null||tiporefepersoLogic.getTipoRefePersos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporefepersos==null|| tiporefepersos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersosAux=new ArrayList<TipoRefePerso>();
						tiporefepersosAux.addAll(tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersosAux=new ArrayList<TipoRefePerso>();
							tiporefepersosAux.addAll(tiporefepersos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporefepersoLogic.getTipoRefePersosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRefePersos("BusquedaPorCodigo",tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRefePersos("BusquedaPorCodigo",tiporefepersos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoLogic.setTipoRefePersos(new ArrayList<TipoRefePerso>());
						tiporefepersoLogic.getTipoRefePersos().addAll(tiporefepersosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersos=new ArrayList<TipoRefePerso>();
							tiporefepersos.addAll(tiporefepersosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporefepersoLogic.getTipoRefePersosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporefepersoLogic.getTipoRefePersos()==null||tiporefepersoLogic.getTipoRefePersos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporefepersos==null|| tiporefepersos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersosAux=new ArrayList<TipoRefePerso>();
						tiporefepersosAux.addAll(tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersosAux=new ArrayList<TipoRefePerso>();
							tiporefepersosAux.addAll(tiporefepersos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporefepersoLogic.getTipoRefePersosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRefePersoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRefePersos("BusquedaPorNombre",tiporefepersoLogic.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRefePersos("BusquedaPorNombre",tiporefepersos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoLogic.setTipoRefePersos(new ArrayList<TipoRefePerso>());
						tiporefepersoLogic.getTipoRefePersos().addAll(tiporefepersosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersos=new ArrayList<TipoRefePerso>();
							tiporefepersos.addAll(tiporefepersosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRefePerso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRefePerso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporefepersoLogic.getTipoRefePersos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporefepersos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporefepersoLogic.getTipoRefePersos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporefepersos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRefePerso tiporefeperso) {
		Boolean permite=true;
		
		if(this.tiporefeperso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRefePersoConstantesFunciones.getOrderByListaTipoRefePerso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRefePersoConstantesFunciones.getOrderByListaTipoRefePerso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRefePerso tiporefeperso:tiporefepersoLogic.getTipoRefePersos()) {
				if(tiporefeperso.getsType().equals(Constantes2.S_TOTALES)) {
					tiporefepersoTotales=tiporefeperso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRefePerso tiporefeperso:this.tiporefepersos) {
				if(tiporefeperso.getsType().equals(Constantes2.S_TOTALES)) {
					tiporefepersoTotales=tiporefeperso;
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
			this.tiporefepersoAux=new TipoRefePerso();
			this.tiporefepersoAux.setsType(Constantes2.S_TOTALES);
			this.tiporefepersoAux.setIsNew(false);
			this.tiporefepersoAux.setIsChanged(false);
			this.tiporefepersoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRefePersoConstantesFunciones.TotalizarValoresFilaTipoRefePerso(this.tiporefepersoLogic.getTipoRefePersos(),this.tiporefepersoAux);
				
				this.tiporefepersoLogic.getTipoRefePersos().add(this.tiporefepersoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRefePersoConstantesFunciones.TotalizarValoresFilaTipoRefePerso(this.tiporefepersos,this.tiporefepersoAux);
				
				this.tiporefepersos.add(this.tiporefepersoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporefepersoTotales=new TipoRefePerso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporefepersoLogic.getTipoRefePersos().remove(tiporefepersoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporefepersos.remove(tiporefepersoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporefepersoTotales=new TipoRefePerso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRefePerso tiporefeperso:tiporefepersoLogic.getTipoRefePersos()) {
				if(tiporefeperso.getsType().equals(Constantes2.S_TOTALES)) {
					tiporefepersoTotales=tiporefeperso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRefePersoConstantesFunciones.TotalizarValoresFilaTipoRefePerso(this.tiporefepersoLogic.getTipoRefePersos(),tiporefepersoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRefePerso tiporefeperso:this.tiporefepersos) {
				if(tiporefeperso.getsType().equals(Constantes2.S_TOTALES)) {
					tiporefepersoTotales=tiporefeperso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRefePersoConstantesFunciones.TotalizarValoresFilaTipoRefePerso(this.tiporefepersos,tiporefepersoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRefePersosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRefePersosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRefePersosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporefepersoLogic.getTipoRefePersosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRefePersosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporefepersoLogic.getTipoRefePersosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoRefePerso() {
		this.isPermisoTodoTipoRefePerso=false;
		this.isPermisoNuevoTipoRefePerso=false;
		this.isPermisoActualizarTipoRefePerso=false;
		this.isPermisoActualizarOriginalTipoRefePerso=false;
		this.isPermisoEliminarTipoRefePerso=false;
		this.isPermisoGuardarCambiosTipoRefePerso=false;
		this.isPermisoConsultaTipoRefePerso=false;
		this.isPermisoBusquedaTipoRefePerso=false;
		this.isPermisoReporteTipoRefePerso=false;		
		this.isPermisoOrdenTipoRefePerso=false;		
		this.isPermisoPaginacionMedioTipoRefePerso=false;		
		this.isPermisoPaginacionAltoTipoRefePerso=false;
		this.isPermisoPaginacionTodoTipoRefePerso=false;
		this.isPermisoCopiarTipoRefePerso=false;		
		this.isPermisoVerFormTipoRefePerso=false;		
		this.isPermisoDuplicarTipoRefePerso=false;		
		this.isPermisoOrdenTipoRefePerso=false;		
	}
	
	public void setPermisosUsuarioTipoRefePerso(Boolean isPermiso) {
		this.isPermisoTodoTipoRefePerso=isPermiso;
		this.isPermisoNuevoTipoRefePerso=isPermiso;
		this.isPermisoActualizarTipoRefePerso=isPermiso;
		this.isPermisoActualizarOriginalTipoRefePerso=isPermiso;
		this.isPermisoEliminarTipoRefePerso=isPermiso;
		this.isPermisoGuardarCambiosTipoRefePerso=isPermiso;
		this.isPermisoConsultaTipoRefePerso=isPermiso;
		this.isPermisoBusquedaTipoRefePerso=isPermiso;
		this.isPermisoReporteTipoRefePerso=isPermiso;
		this.isPermisoOrdenTipoRefePerso=isPermiso;		
		this.isPermisoPaginacionMedioTipoRefePerso=isPermiso;		
		this.isPermisoPaginacionAltoTipoRefePerso=isPermiso;		
		this.isPermisoPaginacionTodoTipoRefePerso=isPermiso;		
		this.isPermisoCopiarTipoRefePerso=isPermiso;		
		this.isPermisoVerFormTipoRefePerso=isPermiso;		
		this.isPermisoDuplicarTipoRefePerso=isPermiso;
		this.isPermisoOrdenTipoRefePerso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRefePerso(Boolean isPermiso) {
		//this.isPermisoTodoTipoRefePerso=isPermiso;
		this.isPermisoNuevoTipoRefePerso=isPermiso;
		this.isPermisoActualizarTipoRefePerso=isPermiso;
		this.isPermisoActualizarOriginalTipoRefePerso=isPermiso;
		this.isPermisoEliminarTipoRefePerso=isPermiso;
		this.isPermisoGuardarCambiosTipoRefePerso=isPermiso;
		//this.isPermisoConsultaTipoRefePerso=isPermiso;
		//this.isPermisoBusquedaTipoRefePerso=isPermiso;
		//this.isPermisoReporteTipoRefePerso=isPermiso;
		//this.isPermisoOrdenTipoRefePerso=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRefePerso=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRefePerso=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRefePerso=isPermiso;		
		//this.isPermisoCopiarTipoRefePerso=isPermiso;		
		//this.isPermisoDuplicarTipoRefePerso=isPermiso;
		//this.isPermisoOrdenTipoRefePerso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRefePersoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaPersonalConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRefePersoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferenciaPersonal=false;
		this.isTienePermisosReferenciaPersonal=this.verificarGetPermisosUsuarioOpcionTipoRefePersoClaseRelacionada(this.opcionsRelacionadas,ReferenciaPersonalConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRefePerso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRefePersoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferenciaPersonal=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRefePersoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRefePersoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRefePersoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferenciaPersonal && this.jInternalFrameDetalleFormTipoRefePerso!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.remove(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRefePerso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRefePersoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRefePersoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRefePerso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRefePerso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRefePerso=this.isPermisoActualizarTipoRefePerso;
			this.isPermisoEliminarTipoRefePerso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRefePerso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRefePerso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRefePerso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRefePerso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRefePerso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRefePerso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRefePerso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRefePerso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRefePerso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRefePerso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRefePerso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRefePerso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRefePerso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRefePerso.setToolTipText(this.jTableDatosTipoRefePerso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRefePerso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRefePerso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRefePersoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRefePersoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRefePerso() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferenciaPersonal && this.tiporefepersoConstantesFunciones.mostrarReferenciaPersonalTipoRefePerso && !TipoRefePersoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Personal");
			reporte.setsDescripcion("Referencia Personal");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoRefePersoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRefePersoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRefePersoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRefePersoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoRefePersoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRefePerso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoRefePerso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRefePerso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRefePerso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRefePerso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRefePerso(TipoRefePerso tiporefeperso)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRefePerso(TipoRefePerso tiporefeperso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRefePerso()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRefePerso()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRefePerso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRefePerso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRefePerso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRefePerso()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRefePerso(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRefePerso()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoRefePersoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRefePersoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRefePersoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporefepersoSessionBean=new TipoRefePersoSessionBean(); 
		this.tiporefepersoConstantesFunciones=new TipoRefePersoConstantesFunciones(); 
		this.tiporefepersoBean=new TipoRefePerso();//(this.tiporefepersoConstantesFunciones); 		
		this.tiporefepersoReturnGeneral=new TipoRefePersoParameterReturnGeneral(); 
		
		this.tiporefepersoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporefepersoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRefePersoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRefePersoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRefePersoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRefePerso(true);
			
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
			
			this.tiporefepersoConstantesFunciones=new TipoRefePersoConstantesFunciones(); 
			this.tiporefepersoBean=new TipoRefePerso();//this.tiporefepersoConstantesFunciones); 			
			this.tiporefepersoReturnGeneral=new TipoRefePersoParameterReturnGeneral(); 
		
			TipoRefePersoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Refe Perso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporefeperso=new TipoRefePerso();
			this.tiporefepersos = new ArrayList<TipoRefePerso>();
			this.tiporefepersosAux = new ArrayList<TipoRefePerso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic=new TipoRefePersoLogic();
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporefepersoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporefepersoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRefePerso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRefePerso);	
					}
					
					if(this.jInternalFrameImportacionTipoRefePerso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRefePerso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRefePerso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRefePerso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRefePerso);
				this.jInternalFrameDetalleFormTipoRefePerso.setVisible(false);
				this.jInternalFrameDetalleFormTipoRefePerso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRefePerso);
					this.jInternalFrameReporteDinamicoTipoRefePerso.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRefePerso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRefePerso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRefePerso);
					this.jInternalFrameImportacionTipoRefePerso.setVisible(false);
					this.jInternalFrameImportacionTipoRefePerso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRefePerso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRefePerso);
					this.jInternalFrameOrderByTipoRefePerso.setVisible(false);
					this.jInternalFrameOrderByTipoRefePerso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRefePersoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRefePersoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporefepersoReturnGeneral=new TipoRefePersoParameterReturnGeneral();
			
			this.tiporefepersoParameterGeneral=new TipoRefePersoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporefepersoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRefePersoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaPersonalConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRefePersoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporefepersoSessionBean.getEsGuardarRelacionado(),this.tiporefepersoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRefePersoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporefepersoSessionBean.getEsGuardarRelacionado(),this.tiporefepersoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaDuplicarTipoRefePerso=true;
			this.isVisibilidadCeldaCopiarTipoRefePerso=true;
			this.isVisibilidadCeldaVerFormTipoRefePerso=true;
			this.isVisibilidadCeldaOrdenTipoRefePerso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRefePerso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRefePerso(false);
			
			this.setPermisosUsuarioTipoRefePerso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporefepersoSessionBean.getEsGuardarRelacionado() && this.tiporefepersoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRefePersoClasesRelacionadas();
			}
			
			if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRefePersoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRefePerso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRefePerso();
			}
			
			if(!this.isPermisoBusquedaTipoRefePerso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRefePerso,this.isPermisoPaginacionMedioTipoRefePerso,this.isPermisoPaginacionTodoTipoRefePerso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRefePersoConstantesFunciones.getTiposSeleccionarTipoRefePerso());
				
				this.tiposColumnasSelect=TipoRefePersoConstantesFunciones.getTiposSeleccionarTipoRefePerso(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRefePerso();				
				//this.tiposRelacionesSelect=TipoRefePersoConstantesFunciones.getTiposRelacionesTipoRefePerso(true);
				
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
			//if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRefePerso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoRefePerso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoRefePerso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRefePerso() ;
			
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
			
			
			this.referenciapersonalLogic=new ReferenciaPersonalLogic(); 
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
				tiporefepersoImplementable= (TipoRefePersoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRefePersoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporefepersoImplementableHome= (TipoRefePersoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRefePersoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporefepersos= new ArrayList<TipoRefePerso>();
			this.tiporefepersosEliminados= new ArrayList<TipoRefePerso>();
						
			this.isEsNuevoTipoRefePerso=false;
			this.esParaAccionDesdeFormularioTipoRefePerso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRefePerso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRefePerso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRefePersoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRefePersoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRefePerso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRefePerso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRefePerso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRefePerso();
			}
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRefePerso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRefePerso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRefePerso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRefePerso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRefePerso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRefePerso() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRefePerso")) {
				iIndex=this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();	
				
				

				if(sTitle.equals("Referencia Personales")) {
					if(!ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRefePerso();

						this.cargarParteTabPanelRelacionadaReferenciaPersonal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRefePerso();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaReferenciaPersonal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRefePerso.cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(false,true,iIndex);
		this.jButtonReferenciaPersonalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaPersonal();

		//this.jTabbedPaneRelacionesTipoRefePerso.updateUI();
		//this.jTabbedPaneRelacionesTipoRefePerso.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRefePerso.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ReferenciaPersonal")) {
				int row=this.jTableDatosTipoRefePerso.getSelectedRow();
				jButtonReferenciaPersonalActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia Personal")) {

					if(this.isTienePermisosReferenciaPersonal && this.tiporefepersoConstantesFunciones.mostrarReferenciaPersonalTipoRefePerso && !TipoRefePersoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Personales"+"("+ReferenciaPersonalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Personales");

						if(tiporefepersoConstantesFunciones.resaltarReferenciaPersonalTipoRefePerso!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporefepersoConstantesFunciones.resaltarReferenciaPersonalTipoRefePerso);
						}

						jmenuItem.setEnabled(this.tiporefepersoConstantesFunciones.activarReferenciaPersonalTipoRefePerso);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaPersonal"));

						

						this.jInternalFrameDetalleFormTipoRefePerso.jmenuDetalleTipoRefePerso.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRefePerso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRefePerso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRefePerso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRefePersoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRefePerso();
		
		this.cargarCombosFrameForeignKeyTipoRefePerso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRefePerso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRefePerso();
		}
	}
	
	
	
	public void jButtonNuevoTipoRefePersoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			
			if(jTableDatosTipoRefePerso.getRowCount()>=1) {
				jTableDatosTipoRefePerso.removeRowSelectionInterval(0, jTableDatosTipoRefePerso.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRefePerso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRefePerso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRefePerso(true);			
			//this.tiporefeperso=new TipoRefePerso();
			//this.tiporefeperso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRefePerso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRefePerso() ;
			
			if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRefePerso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporefeperso);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);				
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRefePerso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRefePersoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRefePerso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRefePerso.getSelectedRows().length;			
			}
			
			tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRefePerso--;			
				//TipoRefePerso tiporefepersoAux= new TipoRefePerso();			
				//tiporefepersoAux.setId(this.iIdNuevoTipoRefePerso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRefePerso tiporefepersoOrigen=new TipoRefePerso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRefePerso tiporefepersoOrigen : tiporefepersosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporefepersoOrigen =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporefepersoOrigen =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRefePerso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporefeperso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRefePerso(tiporefepersoOrigen,this.tiporefeperso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporefepersoLogic.getTipoRefePersos().add(this.tiporefepersoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporefepersos.add(this.tiporefepersoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
				
				this.jTableDatosTipoRefePerso.setRowSelectionInterval(this.getIndiceNuevoTipoRefePerso(), this.getIndiceNuevoTipoRefePerso());
				
				int iLastRow =  this.jTableDatosTipoRefePerso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRefePerso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRefePerso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRefePerso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();									
		
			TipoRefePerso tiporefepersoOrigen=new TipoRefePerso();
			TipoRefePerso tiporefepersoDestino=new TipoRefePerso();
				
			tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRefePerso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporefepersosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRefePerso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoOrigen =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporefepersoOrigen =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporefepersoDestino =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporefepersoDestino =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporefepersoOrigen =tiporefepersosSeleccionados.get(0);
				tiporefepersoDestino =tiporefepersosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRefePerso(tiporefepersoOrigen,tiporefepersoDestino,true,false);
				
				tiporefepersoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporefepersoDestino,tiporefepersoLogic.getTipoRefePersos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporefepersoDestino,tiporefepersos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
				
				//this.jTableDatosTipoRefePerso.setRowSelectionInterval(this.getIndiceNuevoTipoRefePerso(), this.getIndiceNuevoTipoRefePerso());
				
				int iLastRow =  this.jTableDatosTipoRefePerso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRefePerso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRefePerso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRefePerso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRefePerso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRefePerso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRefePerso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRefePerso.setVisible(!isVisible);
			this.jPanelPaginacionTipoRefePerso.setVisible(!isVisible);
			this.jPanelAccionesTipoRefePerso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRefePerso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRefePerso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRefePerso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRefePerso();
			
			this.abrirFrameOrderByTipoRefePerso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRefePerso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRefePerso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRefePerso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRefePerso.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRefePerso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRefePerso.setSize(this.jInternalFrameDetalleFormTipoRefePerso.iWidthFormulario,this.jInternalFrameDetalleFormTipoRefePerso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRefePerso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRefePerso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRefePerso.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRefePerso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRefePerso.jContentPaneDetalleTipoRefePerso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRefePerso.jContentPaneDetalleTipoRefePerso.getWidth(),TipoRefePersoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRefePerso.jContentPaneDetalleTipoRefePerso.getWidth(),TipoRefePersoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRefePerso.jContentPaneDetalleTipoRefePerso.getWidth(),TipoRefePersoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaPersonal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRefePerso.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRefePerso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRefePerso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRefePerso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRefePerso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRefePerso,false,this);
				} else {
					this.jInternalFrameOrderByTipoRefePerso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRefePerso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRefePerso);
				this.jInternalFrameOrderByTipoRefePerso.setVisible(false);
				this.jInternalFrameOrderByTipoRefePerso.setSelected(false);
				
				this.jInternalFrameOrderByTipoRefePerso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRefePerso"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRefePerso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRefePerso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRefePerso==null) {
				
				this.jInternalFrameImportacionTipoRefePerso=new ImportacionJInternalFrame(TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRefePerso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRefePerso);
				this.jInternalFrameImportacionTipoRefePerso.setVisible(false);
				this.jInternalFrameImportacionTipoRefePerso.setSelected(false);


				this.jInternalFrameImportacionTipoRefePerso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRefePerso"));
				this.jInternalFrameImportacionTipoRefePerso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRefePerso"));
				this.jInternalFrameImportacionTipoRefePerso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRefePerso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRefePerso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRefePerso==null) {
				this.jInternalFrameReporteDinamicoTipoRefePerso=new ReporteDinamicoJInternalFrame(TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRefePerso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRefePerso);
				this.jInternalFrameReporteDinamicoTipoRefePerso.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRefePerso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRefePerso"));
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRefePerso"));
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRefePerso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRefePerso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaReferenciaPersonal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.jScrollPanelDatosReferenciaPersonal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRefePerso.jContentPaneDetalleTipoRefePerso.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.jScrollPanelDatosReferenciaPersonal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.jScrollPanelDatosReferenciaPersonal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.jScrollPanelDatosReferenciaPersonal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRefePerso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRefePerso);
			
	       	this.jInternalFrameDetalleFormTipoRefePerso.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRefePerso.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRefePerso.dispose();
			//this.jInternalFrameDetalleFormTipoRefePerso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRefePerso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRefePerso.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRefePerso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRefePerso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRefePerso.setVisible(true);
	        this.jInternalFrameImportacionTipoRefePerso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRefePerso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRefePerso.setVisible(true);
	        this.jInternalFrameOrderByTipoRefePerso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRefePerso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRefePerso.setVisible(false);
	        this.jInternalFrameOrderByTipoRefePerso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRefePerso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRefePerso.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRefePerso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRefePerso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRefePerso.setVisible(false);
	        this.jInternalFrameImportacionTipoRefePerso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRefePerso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRefePerso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRefePerso(true);
			//this.isEsNuevoTipoRefePerso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRefePerso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRefePerso(false) ;
			
			if(tiporefepersoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.getEsGuardarRelacionado() && ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaPersonalActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRefePerso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRefePerso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRefePersoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRefePerso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRefePerso(true);
			//this.isEsNuevoTipoRefePerso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporefeperso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRefePerso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRefePerso(false) ;
			
			if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRefePerso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRefePerso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRefePerso(false);
			
			//if(!this.isEsNuevoTipoRefePerso) {								
				int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
				
			}
			
			if(this.permiteMantenimiento(this.tiporefeperso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRefePerso=true;
					this.inicializarActualizarBindingTablaTipoRefePerso(false);
					this.isEsNuevoTipoRefePerso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRefePerso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRefePerso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRefePerso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRefePerso(false);
				
				this.habilitarDeshabilitarControlesTipoRefePerso(false);
			
												
				
				if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRefePerso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRefePersoActionPerformed(evt,tiporefepersoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRefePerso(this.tiporefeperso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRefePerso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporefepersoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporefeperso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				this.tiporefeperso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				this.tiporefeperso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporefeperso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRefePersoModel) this.jTableDatosTipoRefePerso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRefePerso=true;
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
				this.isEsNuevoTipoRefePerso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRefePerso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRefePerso(false);
				
				this.habilitarDeshabilitarControlesTipoRefePerso(false);
				
				
				
				if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRefePerso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRefePerso.getRowCount()>=1) {
				jTableDatosTipoRefePerso.removeRowSelectionInterval(0, jTableDatosTipoRefePerso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRefePerso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRefePerso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRefePerso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRefePerso(false) ;
			
			this.isEsNuevoTipoRefePerso=false;
			
			if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRefePerso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRefePerso(false);
				
				//SI ES MANUAL
				if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRefePerso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRefePerso--;			
			//TipoRefePerso tiporefepersoAux= new TipoRefePerso();			
			//tiporefepersoAux.setId(this.iIdNuevoTipoRefePerso);
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRefePerso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
			
			this.tiporefeperso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporefepersoLogic.getTipoRefePersos().add(this.tiporefepersoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporefepersos.add(this.tiporefepersoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRefePerso(false);
			
			this.jTableDatosTipoRefePerso.setRowSelectionInterval(this.getIndiceNuevoTipoRefePerso(), this.getIndiceNuevoTipoRefePerso());
			
			int iLastRow =  this.jTableDatosTipoRefePerso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRefePerso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRefePerso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRefePerso(false);
			
			//SI ES MANUAL
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRefePerso();
			}
			
			//this.abrirFrameTreeTipoRefePerso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Refe PersoS ?", "MANTENIMIENTO DE Tipo Refe Perso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRefePerso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRefePerso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporefepersoReturnGeneral=tiporefepersoLogic.procesarImportacionTipoRefePersosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporefepersoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRefePersoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRefePerso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRefePerso.setFileImportacion(this.jInternalFrameImportacionTipoRefePerso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRefePerso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRefePerso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRefePerso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRefePerso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		

		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRefePersoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRefePersoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRefePersoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRefePersoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRefePerso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRefePersoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRefePersoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRefePersoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRefePersoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRefePersoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRefePersoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRefePersos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRefePersoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRefePerso tiporefeperso:tiporefepersosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporefeperso.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRefePersoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRefePerso tiporefeperso:tiporefepersosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporefeperso.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRefePerso(row);				
			//	iRow++;
			//}				
			
			//for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRefePerso(tiporefepersoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRefePerso(false);
			
			//SI ES MANUAL
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRefePerso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRefePerso(false);
			
			//SI ES MANUAL
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRefePerso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRefePerso(false);
			
			//SI ES MANUAL
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRefePerso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRefePerso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRefePerso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRefePerso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRefePerso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRefePerso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRefePerso.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRefePerso.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRefePerso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRefePerso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRefePerso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRefePerso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRefePerso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRefePerso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRefePerso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRefePerso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRefePerso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRefePerso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRefePerso();
		
		this.inicializarActualizarBindingBotonesManualTipoRefePerso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRefePerso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRefePerso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRefePerso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRefePerso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRefePerso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRefePerso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRefePerso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionNuevoTipoRefePerso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionSinCerrarTipoRefePerso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionSinMensajeTipoRefePerso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRefePerso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRefePerso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRefePerso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
				this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionNuevoTipoRefePerso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionSinCerrarTipoRefePerso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRefePerso.jCheckBoxPostAccionSinMensajeTipoRefePerso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRefePerso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRefePerso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRefePerso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRefePerso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRefePerso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRefePerso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRefePerso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRefePerso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRefePerso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRefePerso(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRefePerso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRefePerso() throws Exception {
		try	{
			if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRefePerso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRefePerso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRefePerso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRefePerso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRefePerso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRefePerso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRefePerso.addItem(reporte);
			}
			
			
			if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRefePerso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRefePerso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRefePerso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRefePerso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRefePerso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRefePerso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRefePerso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRefePerso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRefePerso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRefePerso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRefePerso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRefePerso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoRefePerso.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoRefePerso.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRefePerso(Boolean esInicializar) throws Exception {				
		if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRefePerso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRefePerso() throws Exception {
		this.inicializarActualizarBindingTablaTipoRefePerso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRefePerso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRefePersoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePersoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRefePerso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporefepersoLogic.getTipoRefePersos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporefepersos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRefePerso.setModel(new TipoRefePersoModel(this.tiporefepersoLogic.getTipoRefePersos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRefePerso.setModel(new TipoRefePersoModel(this.tiporefepersos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRefePerso!=null && this.jInternalFrameOrderByTipoRefePerso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRefePerso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRefePerso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,tiporefepersoConstantesFunciones.resaltarSeleccionarTipoRefePerso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRefePersoConstantesFunciones.SCLASSWEBTITULO,tiporefepersoConstantesFunciones.resaltarSeleccionarTipoRefePerso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRefePerso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,TipoRefePersoConstantesFunciones.LABEL_ID));

		if(this.tiporefepersoConstantesFunciones.mostraridTipoRefePerso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRefePersoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporefepersoConstantesFunciones.resaltaridTipoRefePerso,this.tiporefepersoConstantesFunciones.activaridTipoRefePerso,this,true,"idTipoRefePerso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporefepersoConstantesFunciones.resaltaridTipoRefePerso,this.tiporefepersoConstantesFunciones.activaridTipoRefePerso,this,true,"idTipoRefePerso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRefePerso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,TipoRefePersoConstantesFunciones.LABEL_CODIGO));

		if(this.tiporefepersoConstantesFunciones.mostrarcodigoTipoRefePerso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRefePersoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporefepersoConstantesFunciones.resaltarcodigoTipoRefePerso,this.tiporefepersoConstantesFunciones.activarcodigoTipoRefePerso,this,true,"codigoTipoRefePerso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporefepersoConstantesFunciones.resaltarcodigoTipoRefePerso,this.tiporefepersoConstantesFunciones.activarcodigoTipoRefePerso,this,true,"codigoTipoRefePerso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRefePerso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,TipoRefePersoConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporefepersoConstantesFunciones.mostrarnombreTipoRefePerso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRefePersoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporefepersoConstantesFunciones.resaltarnombreTipoRefePerso,this.tiporefepersoConstantesFunciones.activarnombreTipoRefePerso,this,true,"nombreTipoRefePerso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporefepersoConstantesFunciones.resaltarnombreTipoRefePerso,this.tiporefepersoConstantesFunciones.activarnombreTipoRefePerso,this,true,"nombreTipoRefePerso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRefePersoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferenciaPersonal && this.tiporefepersoConstantesFunciones.mostrarReferenciaPersonalTipoRefePerso && !TipoRefePersoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Personales");
				tableColumn.setHeaderValue("Referencia Personales");
				tableColumn.setCellRenderer(new ReferenciaPersonalTableCell(tiporefepersoConstantesFunciones.resaltarReferenciaPersonalTipoRefePerso,this,this.tiporefepersoConstantesFunciones.activarReferenciaPersonalTipoRefePerso));
				tableColumn.setCellEditor(new ReferenciaPersonalTableCell(tiporefepersoConstantesFunciones.resaltarReferenciaPersonalTipoRefePerso,this,this.tiporefepersoConstantesFunciones.activarReferenciaPersonalTipoRefePerso));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRefePerso.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRefePerso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRefePerso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporefepersoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRefePerso.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoRefePerso.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRefePerso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporefepersoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRefePerso.moveColumn(this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRefePerso.moveColumn(this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporefepersoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRefePerso.moveColumn(this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRefePerso.moveColumn(this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRefePerso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRefePerso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRefePerso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRefePerso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRefePerso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRefePerso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRefePerso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRefePerso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporefepersoLogic.getTipoRefePersos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporefepersos.size()-1;
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
		//this.jTableDatosTipoRefePerso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRefePerso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRefePerso();
			
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
				
				//this.isEsNuevoTipoRefePerso=false;
					
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
				if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRefePerso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRefePerso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRefePerso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporefeperso.getsType().equals("DUPLICADO")
				   || this.tiporefeperso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRefePerso=true;
				
				} else {
					this.isEsNuevoTipoRefePerso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporefeperso.getId()>=0 && !this.tiporefeperso.getIsNew()) {						
						this.isEsNuevoTipoRefePerso=false;
						
					} else {
						this.isEsNuevoTipoRefePerso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRefePerso(esRelaciones);						
				
				this.seleccionarTipoRefePerso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporefeperso.getId()<0) {
					this.isEsNuevoTipoRefePerso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRefePerso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRefePerso(evt,rowIndex);
				}	
				
				if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRefePerso: " + this.dDif); 
					}
				}								
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRefePerso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporefeperso)) {
					if(this.tiporefeperso.getId()>0) {
						this.tiporefeperso.setIsDeleted(true);
						
						this.tiporefepersosEliminados.add(this.tiporefeperso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporefepersoLogic.getTipoRefePersos().remove(this.tiporefeperso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporefepersos.remove(this.tiporefeperso);				
					}
					
					
					((TipoRefePersoModel) this.jTableDatosTipoRefePerso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRefePerso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRefePerso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRefePerso) {
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRefePerso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRefePerso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRefePerso(this.tiporefeperso);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRefePerso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRefePerso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRefePerso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRefePerso(TipoRefePerso tiporefeperso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRefePerso(tiporefeperso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRefePerso(TipoRefePerso tiporefeperso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRefePerso(tiporefeperso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRefePerso(tiporefeperso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRefePerso(tiporefeperso);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRefePerso(TipoRefePerso tiporefeperso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setText(tiporefeperso.getId().toString());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setText(tiporefeperso.getcodigo());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setText(tiporefeperso.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRefePerso tiporefepersoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporefepersoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRefePerso tiporefepersoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporefepersoLocal=this.tiporefeperso;
			} else {
				tiporefepersoLocal=this.tiporefepersoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporefepersoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRefePerso(tiporefepersoLocal,true);
					
					if(tiporefepersoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporefepersoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporefepersoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRefePerso(TipoRefePerso tiporefeperso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRefePerso(tiporefeperso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(tiporefeperso);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRefePerso(TipoRefePerso tiporefeperso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRefePerso(tiporefeperso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRefePerso(TipoRefePerso tiporefeperso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.getText()==null || this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.getText()=="" || this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setText("0");
			}

			if(conColumnasBase) {tiporefeperso.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRefePersoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRefePerso.jLabelIdTipoRefePerso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporefeperso.setcodigo(this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRefePersoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRefePerso.jLabelcodigoTipoRefePerso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporefeperso.setnombre(this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRefePersoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRefePerso.jLabelnombreTipoRefePerso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRefePerso(TipoRefePerso tiporefepersoBean,TipoRefePerso tiporefeperso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRefePerso(TipoRefePerso tiporefepersoOrigen,TipoRefePerso tiporefeperso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporefepersoOrigen.getId()!=null && !tiporefepersoOrigen.getId().equals(0L))) {tiporefeperso.setId(tiporefepersoOrigen.getId());}}
			if(conDefault || (!conDefault && tiporefepersoOrigen.getcodigo()!=null && !tiporefepersoOrigen.getcodigo().equals(""))) {tiporefeperso.setcodigo(tiporefepersoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporefepersoOrigen.getnombre()!=null && !tiporefepersoOrigen.getnombre().equals(""))) {tiporefeperso.setnombre(tiporefepersoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRefePerso(TipoRefePerso tiporefeperso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setText(tiporefeperso.getId().toString());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setText(tiporefeperso.getcodigo());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setText(tiporefeperso.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRefePerso(TipoRefePersoBean tiporefepersoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setText(tiporefepersoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setText(tiporefepersoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setText(tiporefepersoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRefePerso(TipoRefePersoParameterReturnGeneral tiporefepersoReturnGeneral,TipoRefePersoBean tiporefepersoBean,Boolean conDefault) throws Exception { 
		try {
			TipoRefePerso tiporefepersoLocal=new TipoRefePerso();
			
			tiporefepersoLocal=tiporefepersoReturnGeneral.getTipoRefePerso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporefepersoLocal.getId()!=null && !tiporefepersoLocal.getId().equals(0L))) {tiporefepersoBean.setId(tiporefepersoLocal.getId());}}
			if(conDefault || (!conDefault && tiporefepersoLocal.getcodigo()!=null && !tiporefepersoLocal.getcodigo().equals(""))) {tiporefepersoBean.setcodigo(tiporefepersoLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporefepersoLocal.getnombre()!=null && !tiporefepersoLocal.getnombre().equals(""))) {tiporefepersoBean.setnombre(tiporefepersoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRefePersoGenerico(Long idTipoRefePersoSeleccionado,JComboBox jComboBoxTipoRefePerso,List<TipoRefePerso> tiporefepersosLocal)throws Exception {
		try {
			TipoRefePerso  tiporefepersoTemp=null;

			for(TipoRefePerso tiporefepersoAux:tiporefepersosLocal) {
				if(tiporefepersoAux.getId()!=null && tiporefepersoAux.getId().equals(idTipoRefePersoSeleccionado)) {
					tiporefepersoTemp=tiporefepersoAux;
					break;
				}
			}

			jComboBoxTipoRefePerso.setSelectedItem(tiporefepersoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRefePersoGenerico(JComboBox jComboBoxTipoRefePerso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRefePerso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRefePerso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRefePerso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRefePerso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRefePerso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRefePerso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRefePerso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRefePerso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRefePerso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRefePerso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ReferenciaPersonal")) {
			jButtonReferenciaPersonalActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporefeperso=(TipoRefePerso) tiporefepersoLogic.getTipoRefePersos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporefeperso =(TipoRefePerso) tiporefepersos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRefePerso tiporefepersoRow=new TipoRefePerso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporefepersoRow=(TipoRefePerso) tiporefepersoLogic.getTipoRefePersos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporefepersoRow=(TipoRefePerso) tiporefepersos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaPersonalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRefePerso tiporefeperso) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRefePerso==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefeperso = (TipoRefePerso)this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporefeperso = (TipoRefePerso)this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporefeperso!=null) {
						this.tiporefeperso = tiporefeperso;
					} else {
						this.tiporefeperso = new TipoRefePerso();
					}
				}

				if(this.isTienePermisosReferenciaPersonal && this.permiteMantenimiento(this.tiporefeperso)) {
					ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup=new ReferenciaPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciapersonalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup;
					} else {
						referenciapersonalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame;
					}

					List<TipoRefePerso> tiporefepersos=new ArrayList<TipoRefePerso>();
					tiporefepersos.add(this.tiporefeperso);
					if(!esRelacionado) {
						//referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setConGuardarRelaciones(false);
						//referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciapersonalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRefePerso.cargarReferenciaPersonalBeanSwingJInternalFrame(tiporefepersos,this.tiporefeperso,referenciapersonalBeanSwingJInternalFrame,/*conInicializar,*/referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.getConGuardarRelaciones(),referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.getEsGuardarRelacionado());
					referenciapersonalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciapersonalBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaPersonal("no_relacionado");

						referenciapersonalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaPersonalConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaPersonalConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciapersonalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRefePerso=(TitledBorder)this.jScrollPanelDatosTipoRefePerso.getBorder();
						TitledBorder titledBorderReferenciaPersonal=(TitledBorder)referenciapersonalBeanSwingJInternalFrame.jScrollPanelDatosReferenciaPersonal.getBorder();

						titledBorderReferenciaPersonal.setTitle(titledBorderTipoRefePerso.getTitle() + " -> Referencia Personal");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciapersonalBeanSwingJInternalFrame);
						}

						referenciapersonalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciapersonalBeanSwingJInternalFrame);

						referenciapersonalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Personal",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRefePerso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso));			
			this.jButtonDuplicarTipoRefePerso.setVisible((this.isVisibilidadCeldaDuplicarTipoRefePerso && this.isPermisoDuplicarTipoRefePerso));			
			this.jButtonCopiarTipoRefePerso.setVisible((this.isVisibilidadCeldaCopiarTipoRefePerso && this.isPermisoCopiarTipoRefePerso));
			this.jButtonVerFormTipoRefePerso.setVisible((this.isVisibilidadCeldaVerFormTipoRefePerso && this.isPermisoVerFormTipoRefePerso));
			
			this.jButtonAbrirOrderByTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));			
			
			this.jButtonNuevoRelacionesTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso && this.isPermisoNuevoTipoRefePerso));			
			this.jButtonNuevoGuardarCambiosTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarTipoRefePerso.setVisible((this.isVisibilidadCeldaModificarTipoRefePerso && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.setVisible((this.isVisibilidadCeldaActualizarTipoRefePerso && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.setVisible((this.isVisibilidadCeldaEliminarTipoRefePerso && this.isPermisoEliminarTipoRefePerso));
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.setVisible(this.isVisibilidadCeldaCancelarTipoRefePerso);							
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso));						
			this.jButtonDuplicarToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaDuplicarTipoRefePerso && this.isPermisoDuplicarTipoRefePerso));						
			this.jButtonCopiarToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaCopiarTipoRefePerso && this.isPermisoCopiarTipoRefePerso));			
			this.jButtonVerFormToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaVerFormTipoRefePerso && this.isPermisoVerFormTipoRefePerso));			
			this.jButtonAbrirOrderByToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));
			this.jButtonNuevoRelacionesToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso && this.isPermisoNuevoTipoRefePerso));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));			
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaModificarTipoRefePerso && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaActualizarTipoRefePerso  && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaEliminarTipoRefePerso && this.isPermisoEliminarTipoRefePerso));
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarToolBarTipoRefePerso.setVisible(this.isVisibilidadCeldaCancelarTipoRefePerso);				
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso));			
			this.jMenuItemDuplicarTipoRefePerso.setVisible((this.isVisibilidadCeldaDuplicarTipoRefePerso && this.isPermisoDuplicarTipoRefePerso));			
			this.jMenuItemCopiarTipoRefePerso.setVisible((this.isVisibilidadCeldaCopiarTipoRefePerso && this.isPermisoCopiarTipoRefePerso));			
			this.jMenuItemVerFormTipoRefePerso.setVisible((this.isVisibilidadCeldaVerFormTipoRefePerso && this.isPermisoVerFormTipoRefePerso));			
			this.jMenuItemAbrirOrderByTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));			
			//this.jMenuItemMostrarOcultarTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));
			this.jMenuItemDetalleAbrirOrderByTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));			
			//this.jMenuItemDetalleMostrarOcultarTipoRefePerso.setVisible((this.isVisibilidadCeldaOrdenTipoRefePerso && this.isPermisoOrdenTipoRefePerso));			
			this.jMenuItemNuevoRelacionesTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso && this.isPermisoNuevoTipoRefePerso));			
			this.jMenuItemNuevoGuardarCambiosTipoRefePerso.setVisible((this.isVisibilidadCeldaNuevoTipoRefePerso && this.isPermisoNuevoTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));									
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemModificarTipoRefePerso.setVisible((this.isVisibilidadCeldaModificarTipoRefePerso && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemActualizarTipoRefePerso.setVisible((this.isVisibilidadCeldaActualizarTipoRefePerso && this.isPermisoActualizarTipoRefePerso));	
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemEliminarTipoRefePerso.setVisible((this.isVisibilidadCeldaEliminarTipoRefePerso && this.isPermisoEliminarTipoRefePerso));
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemCancelarTipoRefePerso.setVisible(this.isVisibilidadCeldaCancelarTipoRefePerso);				
			}
			
			this.jMenuItemGuardarCambiosTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));						
			this.jMenuItemGuardarCambiosTablaTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRefePerso=this.jButtonNuevoTipoRefePerso.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRefePerso=this.jButtonDuplicarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaCopiarTipoRefePerso=this.jButtonCopiarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaVerFormTipoRefePerso=this.jButtonVerFormTipoRefePerso.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRefePerso=this.jButtonAbrirOrderByTipoRefePerso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=this.jButtonNuevoRelacionesTipoRefePerso.isVisible();
			this.isVisibilidadCeldaModificarTipoRefePerso=this.jButtonModificarTipoRefePerso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.isVisibilidadCeldaActualizarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaEliminarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaCancelarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaGuardarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=this.jButtonGuardarCambiosTablaTipoRefePerso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRefePerso=this.jButtonNuevoToolBarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=this.jButtonNuevoRelacionesToolBarTipoRefePerso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.isVisibilidadCeldaModificarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarToolBarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaActualizarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarToolBarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaEliminarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarToolBarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaCancelarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarToolBarTipoRefePerso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRefePerso=this.jButtonGuardarCambiosToolBarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=this.jButtonGuardarCambiosTablaToolBarTipoRefePerso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRefePerso=this.jMenuItemNuevoTipoRefePerso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=this.jMenuItemNuevoRelacionesTipoRefePerso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.isVisibilidadCeldaModificarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemModificarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaActualizarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemActualizarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaEliminarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemEliminarTipoRefePerso.isVisible();
			this.isVisibilidadCeldaCancelarTipoRefePerso=this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemCancelarTipoRefePerso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRefePerso=this.jMenuItemGuardarCambiosTipoRefePerso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=this.jMenuItemGuardarCambiosTablaTipoRefePerso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRefePerso(Boolean esInicializar) {
		if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRefePerso();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRefePerso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRefePerso() {
		this.jButtonNuevoTipoRefePerso.setVisible(this.isPermisoNuevoTipoRefePerso);			
		this.jButtonDuplicarTipoRefePerso.setVisible(this.isPermisoDuplicarTipoRefePerso);			
		this.jButtonCopiarTipoRefePerso.setVisible(this.isPermisoCopiarTipoRefePerso);			
		this.jButtonVerFormTipoRefePerso.setVisible(this.isPermisoVerFormTipoRefePerso);			
		
		this.jButtonAbrirOrderByTipoRefePerso.setVisible(this.isPermisoOrdenTipoRefePerso);					
		
		this.jButtonNuevoRelacionesTipoRefePerso.setVisible(this.isPermisoNuevoTipoRefePerso);			
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarTipoRefePerso.setVisible(this.isPermisoActualizarTipoRefePerso);	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.setVisible(this.isPermisoActualizarTipoRefePerso);	
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.setVisible(this.isPermisoEliminarTipoRefePerso);
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.setVisible(this.isVisibilidadCeldaCancelarTipoRefePerso);						
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.setVisible(this.isPermisoGuardarCambiosTipoRefePerso);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.setVisible(this.isPermisoActualizarTipoRefePerso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRefePerso() {
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarTipoRefePerso.setVisible(this.isPermisoActualizarTipoRefePerso);	
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.setVisible(this.isPermisoActualizarTipoRefePerso);	
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.setVisible(this.isPermisoEliminarTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.setVisible(this.isVisibilidadCeldaCancelarTipoRefePerso);							
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.setVisible((this.isVisibilidadCeldaGuardarTipoRefePerso && this.isPermisoGuardarCambiosTipoRefePerso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRefePerso() {
		if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRefePerso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRefePerso() {
	}
	
	public void jTableDatosTipoRefePersoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRefePerso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRefePersoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.gettiporefeperso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporefeperso==null) {
						this.tiporefeperso = new TipoRefePerso();
					}

					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
				}

				if(this.tiporefeperso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporefeperso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRefePerso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRefePersoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.gettiporefeperso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporefeperso==null) {
						this.tiporefeperso = new TipoRefePerso();
					}

					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
				}

				if(this.tiporefeperso.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporefeperso.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRefePerso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRefePersoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.gettiporefeperso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporefeperso==null) {
						this.tiporefeperso = new TipoRefePerso();
					}

					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);
				}

				if(this.tiporefeperso.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporefeperso.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRefePerso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRefePerso(false,false);

			this.getTipoRefePersosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoRefePerso(false);

			//if(TipoRefePersoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRefePerso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoRefePersoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRefePerso(false,false);

			this.getTipoRefePersosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoRefePerso(false);

			//if(TipoRefePersoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRefePerso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporefepersoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRefePerso() {
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
			this.jInternalFrameDetalleFormTipoRefePerso.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRefePerso.dispose();
			this.jInternalFrameDetalleFormTipoRefePerso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
			this.jInternalFrameReporteDinamicoTipoRefePerso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRefePerso.dispose();
			this.jInternalFrameReporteDinamicoTipoRefePerso=null;
		}
		
		if(this.jInternalFrameImportacionTipoRefePerso!=null) {
			this.jInternalFrameImportacionTipoRefePerso.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRefePerso.dispose();
			this.jInternalFrameImportacionTipoRefePerso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRefePerso();
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRefePerso")) {
				jButtonDuplicarTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRefePerso")) {
				jButtonCopiarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRefePerso")) {
				jButtonVerFormTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRefePerso")) {
				jButtonDuplicarTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRefePerso")) {
				jButtonDuplicarTipoRefePersoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRefePerso")) {
				jButtonModificarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRefePerso")) {
				jButtonModificarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRefePerso")) {
				jButtonModificarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRefePerso")) {
				jButtonActualizarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRefePerso")) {
				jButtonActualizarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRefePerso")) {
				jButtonActualizarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRefePerso")) {
				jButtonEliminarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRefePerso")) {
				jButtonEliminarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRefePerso")) {
				jButtonEliminarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRefePerso")) {
				jButtonCancelarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRefePerso")) {
				jButtonCancelarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRefePerso")) {
				jButtonCancelarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRefePerso")) {
				jButtonCerrarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRefePerso")) {
				jButtonCerrarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRefePerso")) {
				jButtonCerrarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRefePerso")) {
				jButtonMostrarOcultarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRefePerso")) {
				jButtonCancelarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRefePerso")) {
				jButtonCopiarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRefePerso")) {
				jButtonVerFormTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRefePerso")) {
				jButtonCopiarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRefePerso")) {
				jButtonVerFormTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRefePerso")) {
				jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRefePerso")) {
				jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRefePerso")) {
				jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRefePerso")) {
				jButtonAnterioresTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRefePerso")) {
				jButtonAnterioresTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRefePerso")) {
				jButtonAnterioresTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRefePerso")) {
				jButtonSiguientesTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRefePerso")) {
				jButtonSiguientesTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRefePerso")) {
				jButtonSiguientesTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRefePerso") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRefePerso")) {
				jButtonAbrirOrderByTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRefePerso") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRefePerso")) {
				jButtonMostrarOcultarTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRefePerso")) {
				jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRefePerso")) {
				jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRefePerso")) {
				jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRefePerso")) {
				jButtonCerrarReporteDinamicoTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRefePerso")) {
				jButtonGenerarReporteDinamicoTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRefePerso")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRefePerso")) {
				jButtonCerrarImportacionTipoRefePersoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRefePerso")) {
				
				jButtonGenerarImportacionTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRefePerso")) {
				
				jButtonAbrirImportacionTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRefePerso")) {
				jComboBoxTiposAccionesTipoRefePersoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRefePerso")) {
				jComboBoxTiposRelacionesTipoRefePersoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRefePerso")) {
				jComboBoxTiposAccionesTipoRefePersoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRefePerso")) {
				
				jComboBoxTiposSeleccionarTipoRefePersoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRefePerso")) {
				jTextFieldValorCampoGeneralTipoRefePersoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRefePerso")) {
				jButtonAbrirOrderByTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRefePerso")) {
				jButtonAbrirOrderByTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRefePerso")) {
				jButtonCerrarOrderByTipoRefePersoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRefePersoBusqueda")) {
				this.jButtonidTipoRefePersoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRefePersoBusqueda")) {
				this.jButtoncodigoTipoRefePersoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRefePersoBusqueda")) {
				this.jButtonnombreTipoRefePersoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoRefePerso")) {
				this.jButtonBusquedaPorCodigoTipoRefePersoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoRefePerso")) {
				this.jButtonBusquedaPorNombreTipoRefePersoActionPerformed(evt);
			}
			
			;
			
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRefePerso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRefePerso tiporefepersoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporefepersoLocal=this.tiporefeperso;
			} else {
				tiporefepersoLocal=this.tiporefepersoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
							
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
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
			
			


			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
								
						
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
								
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
							
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
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
			
			


			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
								
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRefePerso")) {
					jCheckBoxSeleccionarTodosTipoRefePersoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRefePerso")) {
					jCheckBoxSeleccionadosTipoRefePersoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRefePerso")) {
					
				}
				
				


				
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
												
				
				


				
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
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
			
			


			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRefePersoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporefeperso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporefeperso);
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
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
				
				


				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRefePerso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRefePerso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRefePersoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporefepersoAnterior =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRefePerso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRefePersoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRefePerso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporefeperso =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporefeperso =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporefeperso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRefePerso")) {
				
				}
				
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRefePerso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRefePerso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRefePerso")) {
			
			}
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRefePerso();
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRefePerso")) {
				jButtonDuplicarTipoRefePersoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRefePerso")) {
				jButtonCopiarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRefePerso")) {
				jButtonVerFormTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRefePerso")) {
				jButtonNuevoTipoRefePersoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRefePerso")) {
				jButtonModificarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRefePerso")) {
				jButtonActualizarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRefePerso")) {
				jButtonEliminarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRefePerso")) {
				jButtonCancelarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRefePerso")) {
				jButtonCerrarTipoRefePersoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRefePerso")) {
				jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRefePerso")) {
				jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRefePerso")) {
				jButtonAbrirOrderByTipoRefePersoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRefePerso")) {
				jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRefePerso")) {
				jButtonAnterioresTipoRefePersoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRefePerso")) {
				jButtonSiguientesTipoRefePersoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRefePersoBusqueda")) {
				this.jButtonidTipoRefePersoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRefePersoBusqueda")) {
				this.jButtoncodigoTipoRefePersoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRefePersoBusqueda")) {
				this.jButtonnombreTipoRefePersoBusquedaActionPerformed(evt);
			}
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRefePerso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRefePerso")) {
				closingInternalFrameTipoRefePerso();
				
			} else if(sTipo.equals("jButtonCancelarTipoRefePerso")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRefePerso = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRefePersoBeanSwingJInternalFrame jInternalFrameParent=(TipoRefePersoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRefePerso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRefePersoActionPerformed(null);
			}
			
			TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporefeperso,new Object(),this.tiporefepersoParameterGeneral,this.tiporefepersoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRefePerso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRefePerso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRefePerso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporefeperso)) {
			if(!esControlTabla) {
				if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);			
				}
				
				if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRefePerso(this.tiporefeperso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporefepersoReturnGeneral=tiporefepersoLogic.procesarEventosTipoRefePersosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporefepersoLogic.getTipoRefePersos(),this.tiporefeperso,this.tiporefepersoParameterGeneral,this.isEsNuevoTipoRefePerso,classes);//this.tiporefepersoLogic.getTipoRefePerso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRefePerso(this.tiporefepersoReturnGeneral,this.tiporefepersoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRefePerso(classes,this.tiporefepersoReturnGeneral,this.tiporefepersoBean,false);
					}
						
					if(this.tiporefepersoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso());	
					}
						
					if(this.tiporefepersoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso(),classes);//this.tiporefepersoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRefePerso(this.tiporefeperso,classes);//this.tiporefepersoBean);									
				}
			
				if(TipoRefePersoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRefePerso(this.tiporefeperso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRefePerso(this.tiporefeperso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporefepersoAnterior!=null) {
						this.tiporefeperso=this.tiporefepersoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporefepersoReturnGeneral=tiporefepersoLogic.procesarEventosTipoRefePersosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporefepersoLogic.getTipoRefePersos(),this.tiporefeperso,this.tiporefepersoParameterGeneral,this.isEsNuevoTipoRefePerso,classes);//this.tiporefepersoLogic.getTipoRefePerso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporefepersoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporefepersoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporefepersoReturnGeneral.getTipoRefePerso(),tiporefepersoLogic.getTipoRefePersos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporefepersoReturnGeneral.getTipoRefePerso(),this.tiporefepersos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRefePerso.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRefePerso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRefePerso();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRefePerso() throws Exception {
		
		TipoRefePersoModel tiporefepersoModel=(TipoRefePersoModel)this.jTableDatosTipoRefePerso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporefepersoModel.tiporefepersos=this.tiporefepersoLogic.getTipoRefePersos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporefepersoModel.tiporefepersos=this.tiporefepersos;
		}
		
		
		((TipoRefePersoModel) this.jTableDatosTipoRefePerso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRefePerso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporefepersoAnterior(),this.tiporefepersoLogic.getTipoRefePersos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporefepersoAnterior(),this.tiporefepersos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRefePerso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRefePerso(TipoRefePerso tiporefeperso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaPersonal.class)) {
					this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.setReferenciaPersonals(tiporefeperso.getReferenciaPersonals());
					this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaPersonal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
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
										
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporefeperso,new Object(),generalEntityParameterGeneral,this.tiporefepersoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporefepersoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRefePersoConstantesFunciones.getClassesRelationshipsOfTipoRefePerso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRefePersoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRefePerso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRefePerso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRefePersoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporefeperso,new Object(),generalEntityParameterGeneral,this.tiporefepersoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRefePerso(TipoRefePersoBean tiporefepersoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaPersonal.class)) {
					this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.setReferenciaPersonals(tiporefeperso.getReferenciaPersonals());
					this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaPersonal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRefePerso(ArrayList<Classe> classes,TipoRefePersoReturnGeneral tiporefepersoReturnGeneral,TipoRefePersoBean tiporefepersoBean,Boolean conDefault) throws Exception {
		
			this.tiporefepersoBean.setReferenciaPersonals(tiporefepersoReturnGeneral.getTipoRefePerso().getReferenciaPersonals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRefePerso(TipoRefePerso tiporefeperso,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaPersonal.class)) {
					tiporefeperso.setReferenciaPersonals(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalBeanSwingJInternalFrame.referenciapersonalLogic.getReferenciaPersonals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporefeperso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRefePerso = new TipoRefePersoDetalleFormJInternalFrame(jDesktopPane,this.tiporefepersoSessionBean.getConGuardarRelaciones(),this.tiporefepersoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.setVisible(false);
		this.jInternalFrameDetalleFormTipoRefePerso.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRefePerso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRefePerso.tiporefepersoLogic=this.tiporefepersoLogic;
		
		this.cargarCombosFrameForeignKeyTipoRefePerso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRefePerso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRefePerso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRefePerso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRefePerso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRefePerso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRefePerso"));
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ModificarTipoRefePerso"));

		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRefePerso"));
					
		this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemModificarTipoRefePerso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRefePerso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.addActionListener (new ButtonActionListener(this,"ActualizarTipoRefePerso"));
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRefePerso"));
						
		this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemActualizarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRefePerso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.addActionListener (new ButtonActionListener(this,"EliminarTipoRefePerso"));
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRefePerso"));
								
		this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemEliminarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRefePerso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CancelarTipoRefePerso"));
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRefePerso"));
					
		this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemCancelarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRefePerso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemDetalleCerrarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRefePerso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRefePerso"));
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRefePerso"));
		
		
		
		this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRefePerso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonidTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtoncodigoTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonnombreTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRefePersoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRefePerso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRefePerso"));
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRefePerso"));
		}
		
		this.jTableDatosTipoRefePerso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRefePerso"));
		
		this.jTableDatosTipoRefePerso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRefePerso"));
		
		this.jButtonNuevoTipoRefePerso.addActionListener(new ButtonActionListener(this,"NuevoTipoRefePerso"));
		
		this.jButtonDuplicarTipoRefePerso.addActionListener(new ButtonActionListener(this,"DuplicarTipoRefePerso"));
		
		this.jButtonCopiarTipoRefePerso.addActionListener(new ButtonActionListener(this,"CopiarTipoRefePerso"));
		
		this.jButtonVerFormTipoRefePerso.addActionListener(new ButtonActionListener(this,"VerFormTipoRefePerso"));
		
		
		this.jButtonNuevoToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRefePerso"));
			
		this.jButtonDuplicarToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRefePerso"));
			
		this.jMenuItemNuevoTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRefePerso"));
			
		this.jMenuItemDuplicarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRefePerso"));		
		
		
		this.jButtonNuevoRelacionesTipoRefePerso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRefePerso"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRefePerso"));
			
		this.jMenuItemNuevoRelacionesTipoRefePerso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRefePerso"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ModificarTipoRefePerso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonModificarToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRefePerso"));
			
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemModificarTipoRefePerso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRefePerso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarTipoRefePerso.addActionListener (new ButtonActionListener(this,"ActualizarTipoRefePerso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonActualizarToolBarTipoRefePerso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRefePerso"));
				
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemActualizarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRefePerso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarTipoRefePerso.addActionListener (new ButtonActionListener(this,"EliminarTipoRefePerso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonEliminarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRefePerso"));
						
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemEliminarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRefePerso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CancelarTipoRefePerso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonCancelarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRefePerso"));
			
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemCancelarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRefePerso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRefePerso"));		
		
		
		this.jButtonCerrarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CerrarTipoRefePerso"));
		
		
		this.jButtonCerrarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRefePerso"));
			
		this.jMenuItemCerrarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRefePerso"));
			
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jMenuItemDetalleCerrarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRefePerso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRefePerso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRefePerso"));
		}
		
		this.jButtonCopiarToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRefePerso"));
			
		this.jButtonVerFormToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRefePerso"));
		
		this.jMenuItemGuardarCambiosTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRefePerso"));
			
		this.jMenuItemCopiarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRefePerso"));		
		
		this.jMenuItemVerFormTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRefePerso"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRefePerso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRefePerso"));
			
		this.jMenuItemGuardarCambiosTablaTipoRefePerso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRefePerso"));		
		
		
		
		this.jButtonRecargarInformacionTipoRefePerso.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRefePerso"));
					
		this.jButtonRecargarInformacionToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRefePerso"));
		
		this.jMenuItemRecargarInformacionTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRefePerso"));		
		
		
		
		this.jButtonAnterioresTipoRefePerso.addActionListener (new ButtonActionListener(this,"AnterioresTipoRefePerso"));
		
		
		this.jButtonAnterioresToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRefePerso"));
		
		this.jMenuItemAnterioresTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRefePerso"));		
		
		
		this.jButtonSiguientesTipoRefePerso.addActionListener (new ButtonActionListener(this,"SiguientesTipoRefePerso"));
		
		
		this.jButtonSiguientesToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRefePerso"));
			
		this.jMenuItemSiguientesTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRefePerso"));
			
		this.jMenuItemAbrirOrderByTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRefePerso"));
			
		this.jMenuItemMostrarOcultarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRefePerso"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRefePerso"));
			
		this.jMenuItemDetalleMostarOcultarTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRefePerso"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRefePerso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRefePerso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRefePerso"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRefePerso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRefePerso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRefePerso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRefePerso"));

		this.jCheckBoxSeleccionadosTipoRefePerso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRefePerso"));
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRefePerso"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRefePerso.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRefePerso"));
			
		this.jComboBoxTiposAccionesTipoRefePerso.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRefePerso"));
					
		this.jComboBoxTiposSeleccionarTipoRefePerso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRefePerso"));
			
		this.jTextFieldValorCampoGeneralTipoRefePerso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRefePerso"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonidTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtoncodigoTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonnombreTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRefePersoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoRefePerso.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRefePerso"));

			this.jButtonBusquedaPorNombreTipoRefePerso.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRefePerso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRefePerso!=null) {
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRefePerso"));
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRefePerso"));
				this.jInternalFrameReporteDinamicoTipoRefePerso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRefePerso"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRefePerso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRefePerso"));				
			//this.jButtonGenerarReporteDinamicoTipoRefePerso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRefePerso"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRefePerso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRefePerso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRefePerso!=null) {
				this.jInternalFrameImportacionTipoRefePerso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRefePerso"));
				this.jInternalFrameImportacionTipoRefePerso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRefePerso"));
				this.jInternalFrameImportacionTipoRefePerso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRefePerso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRefePerso.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRefePerso"));
			
			this.jButtonAbrirOrderByToolBarTipoRefePerso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRefePerso"));			
			
			if(this.jInternalFrameOrderByTipoRefePerso!=null) {
				this.jInternalFrameOrderByTipoRefePerso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRefePerso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRefePerso.jTabbedPaneRelacionesTipoRefePerso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRefePerso"));
		
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
            		closingInternalFrameTipoRefePerso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRefePerso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRefePerso = (JInternalFrameBase)event.getSource();
	            	
	            TipoRefePersoBeanSwingJInternalFrame jInternalFrameParent=(TipoRefePersoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRefePerso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRefePersoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRefePerso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRefePersoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRefePerso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRefePerso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRefePerso";
		inputMap = this.jButtonNuevoTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRefePersoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRefePersoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRefePerso";
		inputMap = this.jButtonNuevoRelacionesTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRefePersoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRefePerso";
		inputMap = this.jButtonModificarTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRefePerso";
		inputMap = this.jButtonActualizarTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRefePerso";
		inputMap = this.jButtonEliminarTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRefePerso";
		inputMap = this.jButtonCancelarTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRefePerso";
		inputMap = this.jButtonCerrarTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRefePerso";
		inputMap = this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonGuardarCambiosTipoRefePerso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRefePersoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRefePerso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRefePersoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRefePerso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRefePersoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRefePerso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRefePersoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRefePerso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRefePersoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonidTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtoncodigoTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRefePersoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRefePerso.jButtonnombreTipoRefePersoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRefePersoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoRefePerso.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRefePerso"));

		this.jButtonBusquedaPorNombreTipoRefePerso.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRefePerso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRefePerso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRefePersoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRefePersoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRefePerso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRefePerso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
					tiporefepersoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRefePerso tiporefepersoAux:tiporefepersos) {
					tiporefepersoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRefePersoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
						tiporefepersoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRefePerso tiporefepersoAux:tiporefepersos) {
						tiporefepersoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRefePerso tiporefepersoAux:tiporefepersos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRefePerso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRefePerso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRefePersoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRefePerso.getSelectedRows();
			
			TipoRefePerso tiporefepersoLocal=new TipoRefePerso();
			
			//this.seleccionarTodosTipoRefePerso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporefepersoLocal =(TipoRefePerso) this.tiporefepersoLogic.getTipoRefePersos().toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporefepersoLocal =(TipoRefePerso) this.tiporefepersos.toArray()[this.jTableDatosTipoRefePerso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporefepersoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
						tiporefepersoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRefePerso tiporefepersoAux:tiporefepersos) {
						tiporefepersoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRefePerso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRefePerso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRefePerso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRefePersoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRefePersoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRefePersoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRefePerso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRefePerso tiporefepersoAux:this.tiporefepersoLogic.getTipoRefePersos()) {
				
						if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporefepersoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporefepersoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRefePerso tiporefepersoAux:tiporefepersos) {
					
						if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporefepersoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporefepersoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRefePerso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRefePersoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRefePerso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRefePerso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRefePerso) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRefePerso(conSplash);
				
					this.generarReporteTipoRefePersosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRefePersosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRefePersosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRefePersosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRefePerso();
				
				this.exportarTipoRefePersosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRefePersos();
				//this.importarTipoRefePersos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRefePerso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRefePersosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Refe Perso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRefePerso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRefePerso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRefePerso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRefePersoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRefePerso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRefePerso(conSplash);
					
						//this.actualizarParametrosGeneralTipoRefePerso();
						
						this.generarReporteProcesoAccionTipoRefePersosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRefePersoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Refe PersoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Refe Perso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRefePerso();
				
						this.actualizarParametrosGeneralTipoRefePerso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporefepersoReturnGeneral=tiporefepersoLogic.procesarAccionTipoRefePersosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporefepersoLogic.getTipoRefePersos(),this.tiporefepersoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRefePersoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRefePerso();
					
					TipoRefePersoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRefePersoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRefePerso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRefePerso.jComboBoxTiposAccionesFormularioTipoRefePerso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRefePerso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRefePersoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRefePerso();
			
			if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
			TipoRefePerso tiporefeperso=new TipoRefePerso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRefePerso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRefePerso.getSelectedItem();
			
			
			
			
			tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporefepersosSeleccionados.size()==1) {
				for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
					tiporefeperso=tiporefepersoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia Personal")) {
					jButtonReferenciaPersonalActionPerformed(null,rowIndex,true,false,tiporefeperso);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRefePerso();
			
      		//this.finishProcessTipoRefePerso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRefePersoReturnGeneral() throws Exception {
		if(this.tiporefepersoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporefepersoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporefepersoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporefepersoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporefepersoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporefepersoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRefePerso(false);
		}
		
		if(this.tiporefepersoReturnGeneral.getConRetornoLista() || this.tiporefepersoReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporefepersoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporefepersoLogic.setTipoRefePersos(this.tiporefepersoReturnGeneral.getTipoRefePersos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporefepersoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporefepersoLogic.setTipoRefePerso(this.tiporefepersoReturnGeneral.getTipoRefePerso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRefePerso(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRefePerso() throws Exception {
		
		
	}
	
	public ArrayList<TipoRefePerso> getTipoRefePersosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRefePerso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRefePerso tiporefepersoAux:tiporefepersoLogic.getTipoRefePersos()) {
					if(tiporefepersoAux.getIsSelected()) {
						tiporefepersosSeleccionados.add(tiporefepersoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRefePerso tiporefepersoAux:this.tiporefepersos) {
					if(tiporefepersoAux.getIsSelected()) {
						tiporefepersosSeleccionados.add(tiporefepersoAux);				
					}
				}
			}
			
			if(tiporefepersosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporefepersosSeleccionados.addAll(this.tiporefepersoLogic.getTipoRefePersos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporefepersosSeleccionados.addAll(this.tiporefepersos);				
					}
				}
			}
		} else {
			tiporefepersosSeleccionados.add(this.tiporefeperso);
		}
		
		return tiporefepersosSeleccionados;
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
	
	public void generarReporteTipoRefePersosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRefePersosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRefePersosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRefePersosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRefePersosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRefePersosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Refe Perso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRefePersosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRefePerso();
		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRefePerso();
		
		
		//this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados ,tiporefepersoImplementable,tiporefepersoImplementableHome);
	}
	
	public void mostrarImportacionTipoRefePersos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRefePerso();
		
		this.abrirFrameImportacionTipoRefePerso();		
		
			
		//this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados ,tiporefepersoImplementable,tiporefepersoImplementableHome);
	}
	
	public void importarTipoRefePersos() throws Exception {		
	
	}
	
	public void exportarTipoRefePersosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRefePersosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRefePersosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRefePersosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Refe Perso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRefePerso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRefePerso(tiporefepersoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporefepersoAux.setsDetalleGeneralEntityReporte(tiporefepersoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRefePerso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRefePersoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRefePersoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRefePersoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRefePersoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRefePerso(TipoRefePerso tiporefeperso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporefeperso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporefeperso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporefeperso.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporefeperso.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRefePersos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRefePerso(row);				
				iRow++;
			}				
			
			for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRefePerso(tiporefepersoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRefePersosSeleccionados() throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();		
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporefeperso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporefepersos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporefeperso");
			//elementRoot.appendChild(element);
		
			for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
				element = document.createElement("tiporefeperso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRefePerso(tiporefepersoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Refe Perso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRefePerso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRefePersoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRefePerso(TipoRefePerso tiporefeperso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporefeperso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporefeperso.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporefeperso.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRefePerso(TipoRefePerso tiporefeperso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRefePersoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporefeperso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRefePersoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporefeperso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoRefePersoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporefeperso.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRefePersoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporefeperso.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRefePersosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRefePerso> tiporefepersosSeleccionados=new ArrayList<TipoRefePerso>();
		
		tiporefepersosSeleccionados=this.getTipoRefePersosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRefePerso(tiporefepersosSeleccionados);
		
		this.generarReporteTipoRefePersos("Todos",tiporefepersosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRefePerso(ArrayList<TipoRefePerso> tiporefepersosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRefePerso tiporefepersoAux:tiporefepersosSeleccionados) {
				tiporefepersoAux.setsDetalleGeneralEntityReporte(tiporefepersoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporefepersoAux.setsDescripcionGeneralEntityReporte1(tiporefepersoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRefePersoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporefepersoAux.setsDescripcionGeneralEntityReporte1(tiporefepersoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRefePersoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRefePerso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRefePerso=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=true;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=true;
			this.isVisibilidadCeldaEliminarTipoRefePerso=true;
			this.isVisibilidadCeldaCancelarTipoRefePerso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=true;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=true;
			this.isVisibilidadCeldaModificarTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
			this.isVisibilidadCeldaModificarTipoRefePerso=true;
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
			this.isVisibilidadCeldaCancelarTipoRefePerso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRefePerso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRefePersoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRefePerso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=true;
		} else {
			this.actualizarEstadoPanelsTipoRefePerso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRefePerso=false;
			//this.isVisibilidadCeldaVerFormTipoRefePerso=false;
			this.isVisibilidadCeldaDuplicarTipoRefePerso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporefepersoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRefePerso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			if(!tiporefepersoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;												
			}
			
			this.jButtonCerrarTipoRefePerso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRefePerso=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporefeperso)) {
			this.isVisibilidadCeldaActualizarTipoRefePerso=false;
			this.isVisibilidadCeldaEliminarTipoRefePerso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRefePerso() {
		this.isVisibilidadCeldaNuevoTipoRefePerso=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRefePerso=false;
	}
	
	public void actualizarEstadoPanelsTipoRefePerso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRefePerso!=null) {
				this.jScrollPanelDatosEdicionTipoRefePerso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRefePerso!=null) {
				this.jScrollPanelDatosTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRefePerso!=null) {
				this.jPanelPaginacionTipoRefePerso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
					this.jTabbedPaneBusquedasTipoRefePerso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporefepersoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRefePerso!=null) {
				this.jTabbedPaneBusquedasTipoRefePerso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRefePerso!=null) {
				this.jPanelParametrosReportesTipoRefePerso.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoRefePersoParaReferenciaPersonales() throws Exception {
		Boolean isPaginaPopupReferenciaPersonal=false;

		try {

			if(this.tiporefepersoSessionBean==null) {
				this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setsPathNavegacionActual(tiporefepersoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaPersonalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaPersonal=this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaPersonal(false);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaPersonal(TipoRefePersoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRefePerso(true);
			this.jInternalFrameDetalleFormTipoRefePerso.referenciapersonalSessionBean.setlidTipoRefePersoActual(this.idTipoRefePersoActual);

			tiporefepersoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRefePerso(true);
			tiporefepersoSessionBean.setlIdTipoRefePersoActualForeignKey(this.idTipoRefePersoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRefePersoSessionBean tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		
		if(this.tiporefepersoSessionBean==null) {
			this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		}
		
		this.tiporefepersoSessionBean.setsUltimaBusquedaTipoRefePerso(this.getsAccionBusqueda());
		this.tiporefepersoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporefepersoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiporefepersoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiporefepersoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRefePersoSessionBean tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		
		if(this.tiporefepersoSessionBean==null) {
			this.tiporefepersoSessionBean=new TipoRefePersoSessionBean();
		}
		
		if(this.tiporefepersoSessionBean.getsUltimaBusquedaTipoRefePerso()!=null&&!this.tiporefepersoSessionBean.getsUltimaBusquedaTipoRefePerso().equals("")) {
			this.setsAccionBusqueda(tiporefepersoSessionBean.getsUltimaBusquedaTipoRefePerso());
			this.setiNumeroPaginacion(tiporefepersoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporefepersoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiporefepersoSessionBean.getcodigo());
				tiporefepersoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiporefepersoSessionBean.getnombre());
				tiporefepersoSessionBean.setnombre("");
			}
		}
		
		this.tiporefepersoSessionBean.setsUltimaBusquedaTipoRefePerso("");
		this.tiporefepersoSessionBean.setiNumeroPaginacion(TipoRefePersoConstantesFunciones.INUMEROPAGINACION);
		this.tiporefepersoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRefePerso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRefePerso() {
		this.updateBorderResaltarBusquedasFormularioTipoRefePerso();
		this.updateVisibilidadBusquedasFormularioTipoRefePerso();
		this.updateHabilitarBusquedasFormularioTipoRefePerso();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRefePerso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRefePerso.getComponents().length>0) {
	

		if(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorCodigoTipoRefePerso!=null) {
			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRefePerso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
				jPanel.setBorder(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorCodigoTipoRefePerso);
			}
		}

		if(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorNombreTipoRefePerso!=null) {
			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorNombreTipoRefePerso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
				jPanel.setBorder(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorNombreTipoRefePerso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRefePerso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRefePerso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRefePerso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporefepersoConstantesFunciones.mostrarBusquedaPorCodigoTipoRefePerso);
			if(!this.tiporefepersoConstantesFunciones.mostrarBusquedaPorCodigoTipoRefePerso && index>-1) {
				this.jTabbedPaneBusquedasTipoRefePerso.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorNombreTipoRefePerso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporefepersoConstantesFunciones.mostrarBusquedaPorNombreTipoRefePerso);
			if(!this.tiporefepersoConstantesFunciones.mostrarBusquedaPorNombreTipoRefePerso && index>-1) {
				this.jTabbedPaneBusquedasTipoRefePerso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRefePerso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRefePerso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRefePerso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporefepersoConstantesFunciones.activarBusquedaPorCodigoTipoRefePerso);
				this.jTabbedPaneBusquedasTipoRefePerso.setEnabledAt(index,this.tiporefepersoConstantesFunciones.activarBusquedaPorCodigoTipoRefePerso);
			}

			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorNombreTipoRefePerso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporefepersoConstantesFunciones.activarBusquedaPorNombreTipoRefePerso);
				this.jTabbedPaneBusquedasTipoRefePerso.setEnabledAt(index,this.tiporefepersoConstantesFunciones.activarBusquedaPorNombreTipoRefePerso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRefePerso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRefePerso);

			this.jTabbedPaneBusquedasTipoRefePerso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);

			this.tiporefepersoConstantesFunciones.setResaltarBusquedaPorCodigoTipoRefePerso(resaltar);

			jPanel.setBorder(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorCodigoTipoRefePerso);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoRefePerso.indexOfComponent(this.jPanelBusquedaPorNombreTipoRefePerso);

			this.jTabbedPaneBusquedasTipoRefePerso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRefePerso.getComponent(index);

			this.tiporefepersoConstantesFunciones.setResaltarBusquedaPorNombreTipoRefePerso(resaltar);

			jPanel.setBorder(this.tiporefepersoConstantesFunciones.resaltarBusquedaPorNombreTipoRefePerso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoRefePerso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRefePerso() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRefePerso();
		this.updateVisibilidadResaltarControlesFormularioTipoRefePerso();
		this.updateHabilitarResaltarControlesFormularioTipoRefePerso();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRefePerso() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporefepersoConstantesFunciones.resaltaridTipoRefePerso!=null && this.jInternalFrameDetalleFormTipoRefePerso!=null) {this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setBorder(this.tiporefepersoConstantesFunciones.resaltaridTipoRefePerso);}
		if(this.tiporefepersoConstantesFunciones.resaltarcodigoTipoRefePerso!=null && this.jInternalFrameDetalleFormTipoRefePerso!=null) {this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setBorder(this.tiporefepersoConstantesFunciones.resaltarcodigoTipoRefePerso);}
		if(this.tiporefepersoConstantesFunciones.resaltarnombreTipoRefePerso!=null && this.jInternalFrameDetalleFormTipoRefePerso!=null) {this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setBorder(this.tiporefepersoConstantesFunciones.resaltarnombreTipoRefePerso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRefePerso() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
	
		//this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostraridTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jPanelidTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostraridTipoRefePerso);
		//this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostrarcodigoTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jPanelcodigoTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostrarcodigoTipoRefePerso);
		//this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostrarnombreTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jPanelnombreTipoRefePerso.setVisible(this.tiporefepersoConstantesFunciones.mostrarnombreTipoRefePerso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRefePerso() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRefePerso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRefePerso!=null) {
	
		this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldidTipoRefePerso.setEnabled(this.tiporefepersoConstantesFunciones.activaridTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jTextFieldcodigoTipoRefePerso.setEnabled(this.tiporefepersoConstantesFunciones.activarcodigoTipoRefePerso);
		this.jInternalFrameDetalleFormTipoRefePerso.jTextAreanombreTipoRefePerso.setEnabled(this.tiporefepersoConstantesFunciones.activarnombreTipoRefePerso);
		}
	}
	
		
}